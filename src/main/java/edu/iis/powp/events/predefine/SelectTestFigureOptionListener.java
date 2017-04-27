package edu.iis.powp.events.predefine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.iis.client.plottermagic.preset.FiguresJoe;
import edu.iis.powp.app.Application;
import edu.iis.powp.app.DriverManager;
import edu.iis.powp.command.ComplexCommandFactory;

public class SelectTestFigureOptionListener implements ActionListener
{

    int scriptId;

	public SelectTestFigureOptionListener() {
		this(1);
	}

	public SelectTestFigureOptionListener(int scriptId) {
		this.scriptId = scriptId;
	}

	@Override
    public void actionPerformed(ActionEvent e)
    {
	    switch (scriptId) {
		    case 1:
		    	FiguresJoe.figureScript1(Application.getComponent(DriverManager.class).getCurrentPlotter());
		    	break;
		    case 2:
			    FiguresJoe.figureScript2(Application.getComponent(DriverManager.class).getCurrentPlotter());
			    break;
			case 3:
				ComplexCommandFactory.createSquare(50, 50, 100).execute(Application.getComponent(DriverManager.class).getCurrentPlotter());
				break;
			case 4:
				ComplexCommandFactory.createTriangle(2, 2, 2, 150, 150, 75).execute(Application.getComponent(DriverManager.class).getCurrentPlotter());
				break;
		    default:
			    FiguresJoe.figureScript1(Application.getComponent(DriverManager.class).getCurrentPlotter());
	    }
    }
}
