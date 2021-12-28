package dev.aimrose.spigot;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    public static String Prefix = "§c§lEssentials";

    public static Main INSTANCE;
    public Plugin plugin;

    public Main() {
        INSTANCE = this;
    }


    @Override
    public void onEnable() {
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public void log(String text) {
        Bukkit.getConsoleSender().sendMessage(Prefix + this);
    }

}
