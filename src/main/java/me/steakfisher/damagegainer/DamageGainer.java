package me.steakfisher.damagegainer;

import me.steakfisher.damagegainer.listeners.damagePlayer;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class DamageGainer extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents((Listener) new damagePlayer(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
