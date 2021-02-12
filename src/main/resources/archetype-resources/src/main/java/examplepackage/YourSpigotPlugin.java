/*
 *  This Source Code Form is subject to the terms of the Mozilla Public
 *  License, v. 2.0. If a copy of the MPL was not distributed with this
 *  file, You can obtain one at http://mozilla.org/MPL/2.0/ .
 */
package ${package}.examplepackage;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * The main plugin class for YourSpigotPlugin
 *
 * @author crash
 */
public class YourSpigotPlugin extends JavaPlugin implements Listener {
    public YourSpigotPlugin instance = null;
    
    @Override
    public void onLoad() {
        instance = this;
        //Do Stuff here
    }

    @Override
    public void onEnable() {
        saveDefaultConfig();
        reloadConfig();
        //Do Stuff here
        //if(getConfig().getBoolean("dothething")){ }
        getServer().getPluginManager().registerEvents(this, this);
        getLogger().info("Enabled.");

    }

    @Override
    public void onDisable() {
        //saveConfig();

        //Cleanup here
        getLogger().info("Disabled.");
    }

    /*
    //Example command handler
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!cmd.getName().equalsIgnoreCase("YourCommand")) {
            return false;
        }
        if (!sender.hasPermission("yourplugin.yourpermission")) {
            sender.sendMessage("You do not have permission for this command.");
            return true;
        }

        //Do stuff
        return false;
    }*/

    /*
    //Example event handler
    @EventHandler(ignoreCancelled = true, priority = EventPriority.LOWEST)
    public void onBlockPlace(BlockPlaceEvent event) {

    }*/

}
