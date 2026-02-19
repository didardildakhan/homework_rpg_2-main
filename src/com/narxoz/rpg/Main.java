package com.narxoz.rpg;

import com.narxoz.rpg.enemy.Enemy;

public class Main {
    public static void main(String[] args) {

        Enemy goblin = new Enemy();
        goblin.name = "Goblin";
        goblin.health = 100;
        goblin.damage = 10;

        goblin.show();
    }
}
