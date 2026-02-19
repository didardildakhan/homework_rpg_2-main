package com.narxoz.rpg;

import com.narxoz.rpg.enemy.Enemy;
import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.loot.LootTable;
import com.narxoz.rpg.factory.FireFactory;
import com.narxoz.rpg.factory.EnemyComponentFactory;
import com.narxoz.rpg.builder.EnemyBuilder;


public class Main {
    public static void main(String[] args) {

        Enemy goblin = new Enemy();
        goblin.name = "Goblin";
        goblin.health = 100;
        goblin.damage = 10;

        EnemyComponentFactory fire = new FireFactory();

        goblin.element = fire.createElement();
        goblin.abilities = fire.createAbilities();
        goblin.loot = fire.createLoot();

        goblin.show();
        Enemy orc = new EnemyBuilder()
                .setName("Orc")
                .setHealth(200)
                .setDamage(25)
                .build();

        orc.show();
    }
}
