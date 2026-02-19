package com.narxoz.rpg;

import com.narxoz.rpg.enemy.Enemy;
import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.loot.LootTable;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Enemy goblin = new Enemy();
        goblin.name = "Goblin";
        goblin.health = 100;
        goblin.damage = 10;

        goblin.abilities = Arrays.asList(
                new Ability("Slash", 15),
                new Ability("Kick", 5)
        );

        goblin.loot = new LootTable("Gold Coin");

        goblin.show();
    }
}
