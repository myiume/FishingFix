package net.craftersland.myiume.fishingfix;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerFishEvent;
import org.bukkit.plugin.java.JavaPlugin;


    public class FishingFix extends JavaPlugin implements Listener {

        public void onDisable() {
        }

        public void onEnable() {
            Bukkit.getPluginManager().registerEvents(this, this);
        }

        @EventHandler(priority = EventPriority.HIGHEST)
        public void onPlayerFish(PlayerFishEvent event) {
            Player player = event.getPlayer();
            switch(event.getState()) {
                case FAILED_ATTEMPT:
                    event.setCancelled(true);
                    player.sendMessage("Event State: " + event.getState());
                    break;
                case FISHING:
                    player.sendMessage("Event State: " + event.getState());
                    break;
                case CAUGHT_ENTITY:
                    event.setCancelled(true);
                    player.sendMessage("Event State:" + event.getState());
                    break;
                case CAUGHT_FISH:
                    event.setCancelled(true);
                    player.sendMessage("Event State: " + event.getState());
                    break;
                case IN_GROUND:
                    event.setCancelled(true);
                    player.sendMessage("Event State:" + event.getState());
                    break;
                default:
                    break;
            }

        }

    }
