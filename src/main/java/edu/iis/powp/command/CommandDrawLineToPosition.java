package edu.iis.powp.command;

import edu.iis.client.plottermagic.IPlotter;

/**
 * Created by Student on 27.04.2017.
 */
public class CommandDrawLineToPosition implements PlotterCommand {
    private int x;
    private int y;

    public CommandDrawLineToPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void execute(IPlotter plotter) {
        plotter.drawTo(x, y);
    }
}
