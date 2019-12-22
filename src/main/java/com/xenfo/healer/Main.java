package com.xenfo.healer;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Healer has been enabled.");
        getCommand("healer").setExecutor(new Commands());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("Healer has been disabled.");
    }

}
