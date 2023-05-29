package de.tamion.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;
import org.mariuszgromada.math.mxparser.Expression;
import org.mariuszgromada.math.mxparser.License;

import java.util.Arrays;

public class MathCommand implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command cmd, @NotNull String label, @NotNull String[] args) {
        if(!sender.hasPermission("Math.math")) {
            sender.sendMessage("You aren't allowed to execute this Command");
            return false;
        }
        if(args.length == 0) {
            sender.sendMessage("Please provide arguments");
            return false;
        }
        Expression e = new Expression(String.join(" ", args));
        double v = e.calculate();
        sender.sendMessage("Result: " + v);
        return true;
    }
}
