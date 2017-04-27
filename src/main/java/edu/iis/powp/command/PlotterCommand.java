package edu.iis.powp.command;

import edu.iis.client.plottermagic.IPlotter;
import edu.kis.powp.drawer.panel.DrawPanelController;

/**
 * Created by Student on 27.04.2017.
 */
public interface PlotterCommand {
    void execute(IPlotter plotter);
}
