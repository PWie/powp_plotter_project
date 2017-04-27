package edu.iis.powp.command;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Student on 27.04.2017.
 */
public class ComplexCommandFactory {

    public static PlotterCommand createRectangle(int x1, int y1, int x2, int y2) {
        List<PlotterCommand> commands = new ArrayList<>();
        commands.addAll(Arrays.asList(
                new CommandSetPosition(x1, y1),
                new CommandDrawLineToPosition(x1, y2),
                new CommandDrawLineToPosition(x2, y2),
                new CommandDrawLineToPosition(x2, y1),
                new CommandDrawLineToPosition(x1, y1)
        ));

        return new ComplexCommand(commands);
    }

    public static PlotterCommand createSquare(int x, int y, int side) {
        return createRectangle(x, y, x + side, y + side);
    }

    public static PlotterCommand createTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        List<PlotterCommand> commands = new ArrayList<>();
        commands.addAll(Arrays.asList(
                new CommandSetPosition(x1, y1),
                new CommandDrawLineToPosition(x2, y2),
                new CommandDrawLineToPosition(x3, y3),
                new CommandDrawLineToPosition(x1, y1)
        ));

        return new ComplexCommand(commands);
    }

}
