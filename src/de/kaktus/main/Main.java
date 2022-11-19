package de.kaktus.main;

import de.kaktus.main.event.PlayerLogin;
import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
         PluginManager();
        System.out.println("Plugin load!");
    }

    public void PluginManager(){
        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents(new PlayerLogin(), this);
    }
}
