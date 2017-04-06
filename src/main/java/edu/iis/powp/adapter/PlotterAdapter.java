package edu.iis.powp.adapter;

import edu.iis.client.plottermagic.IPlotter;
import edu.iis.powp.app.Context;
import edu.kis.powp.drawer.panel.DrawPanelController;
import edu.kis.powp.drawer.shape.ILine;
import edu.kis.powp.drawer.shape.LineFactory;


/**
 * Plotter adapter to drawer.
 */
public class PlotterAdapter implements IPlotter
{ 
	private DrawPanelController controller;
	private int startX = 0, startY = 0;

	public PlotterAdapter(DrawPanelController controller) {
		this.controller = controller;
	}

	@Override
    public void setPosition(int x, int y)
    {
        this.startX = x;
        this.startY = y;
    }

    @Override
    public void drawTo(int x, int y)
    {
        ILine line = LineFactory.getBasicLine();
    	line.setStartCoordinates(this.startX, this.startY);
        line.setEndCoordinates(x, y);

		controller.drawLine(line);
		setPosition(x, y);
    }

    @Override
    public String toString()
    {
        return "Simulator";
    }
}
/*  3.2.5*
	Z adaptera korzystamy w sytuacji, gdy chcemy umożliwić współpracę między klasami o różnych interfejsach (niekompatybilnych).
	Adapter jest łącznikiem między tymi klasami, tak jak w tym przypadku adapter łączy i umożliwia współpracę między
		IPlotter oraz DrawPanelController.
 */