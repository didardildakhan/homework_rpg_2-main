package com.narxoz.rpg.enemy;

import java.util.List;
import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.loot.LootTable;

public class Enemy {
    public String name;
    public int health;
    public int damage;

    public String element;
    public List<Ability> abilities;
    public LootTable loot;

    public void show() {
        System.out.println("Enemy: " + name);
        System.out.println("HP: " + health);
        System.out.println("DMG: " + damage);
        System.out.println("Element: " + element);
        System.out.println("Abilities: " + abilities);
        System.out.println("Loot: " + loot);
        System.out.println("------------");
    }
}
