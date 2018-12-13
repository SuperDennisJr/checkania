package org.checkania.scoreboard;

import org.bukkit.plugin.java.*;
import org.bukkit.*;
import org.bukkit.event.*;
import org.bukkit.plugin.*;

public class Scoreboards extends JavaPlugin
{
    public void onEnable() {
        Bukkit.getServer().getPluginManager().registerEvents((Listener)new Events(), (Plugin)this);
    }
}
