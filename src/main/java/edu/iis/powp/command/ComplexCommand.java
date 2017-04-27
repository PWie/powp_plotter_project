package edu.iis.powp.command;

import edu.iis.client.plottermagic.IPlotter;

import java.util.List;

/**
 * Created by Student on 27.04.2017.
 */
public class ComplexCommand implements PlotterCommand {
    List<PlotterCommand> commands;

    public ComplexCommand(List<PlotterCommand> commands) {
        this.commands = commands;
    }

    @Override
    public void execute(IPlotter plotter) {
        for (PlotterCommand command: commands) {
            command.execute(plotter);
        }
    }
}
/*
    3.1.3* Występuje wzorzec Composite, gdyż agregujemy podstawowe PlotterComandy aby je później wykonać
 */