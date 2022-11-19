package de.kaktus.main.event;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;

public class PlayerLogin implements Listener {

    @EventHandler
    public void onLogin(PlayerLoginEvent e){
        Player p = e.getPlayer();
        if (e.getResult() == PlayerLoginEvent.Result.KICK_FULL && p.hasPermission("join.full")){
            e.allow();
        }
    }
}
