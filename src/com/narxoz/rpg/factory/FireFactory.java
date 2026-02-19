package com.narxoz.rpg.factory;

import java.util.Arrays;
import java.util.List;
import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.loot.LootTable;

public class FireFactory implements EnemyComponentFactory {

    public List<Ability> createAbilities() {
        return Arrays.asList(
                new Ability("Fireball", 40),
                new Ability("Burn", 20)
        );
    }

    public LootTable createLoot() {
        return new LootTable("Flame Sword");
    }

    public String createElement() {
        return "FIRE";
    }
}
