package de.tamion;

import de.tamion.commands.MathCommand;
import org.bukkit.plugin.java.JavaPlugin;
import org.mariuszgromada.math.mxparser.License;

public final class Math extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("math").setExecutor(new MathCommand());
        License.iConfirmNonCommercialUse("Tamion");
    }

    @Override
    public void onDisable() {

    }
}
