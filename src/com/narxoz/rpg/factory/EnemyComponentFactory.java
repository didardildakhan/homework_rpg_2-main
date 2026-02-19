package com.narxoz.rpg.factory;

import java.util.List;
import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.loot.LootTable;

public interface EnemyComponentFactory {
    List<Ability> createAbilities();
    LootTable createLoot();
    String createElement();
}
