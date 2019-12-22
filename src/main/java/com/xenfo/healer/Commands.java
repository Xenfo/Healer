package com.xenfo.healer;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class Commands implements Listener, CommandExecutor {

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            if (cmd.getName().equals("healer")) {
                Player player = (Player) sender;

                player.sendMessage(ChatColor.YELLOW + "You have been healed!");
                player.setHealth(20.0);

                return true;
            }
        } else {
            System.out.println("Cannot heal console!");

            return true;
        }
        return false;
    }
}
