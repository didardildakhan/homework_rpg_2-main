package com.narxoz.rpg.prototype;

import java.util.HashMap;
import com.narxoz.rpg.enemy.Enemy;

public class EnemyRegistry {

    private HashMap<String, Enemy> registry = new HashMap<>();

    public void register(String key, Enemy enemy) {
        registry.put(key, enemy);
    }

    public Enemy cloneEnemy(String key) {
        Enemy original = registry.get(key);

        Enemy copy = new Enemy();
        copy.name = original.name;
        copy.health = original.health;
        copy.damage = original.damage;
        copy.element = original.element;
        copy.abilities = original.abilities;
        copy.loot = original.loot;

        return copy;
    }
}
