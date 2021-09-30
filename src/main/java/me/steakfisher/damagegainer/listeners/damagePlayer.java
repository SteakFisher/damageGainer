package me.steakfisher.damagegainer.listeners;

import org.bukkit.Bukkit;
import org.bukkit.attribute.Attribute;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

public class damagePlayer implements Listener {

    @EventHandler
    public void onDamage(EntityDamageEvent event){

        EntityType damagedPlayer = event.getEntityType();
        if (damagedPlayer == EntityType.PLAYER){

            double playerDamage = event.getDamage();

            for(Player players : Bukkit.getServer().getOnlinePlayers()) {

    double playerHealth = players.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue();
    double newHealth = playerHealth + playerDamage;
                players.getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(newHealth);

            }
        }
    }
}
