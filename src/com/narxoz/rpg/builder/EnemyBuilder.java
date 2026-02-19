package com.narxoz.rpg.builder;

import com.narxoz.rpg.enemy.Enemy;

public class EnemyBuilder {

    private Enemy enemy = new Enemy();

    public EnemyBuilder setName(String name) {
        enemy.name = name;
        return this;
    }

    public EnemyBuilder setHealth(int health) {
        enemy.health = health;
        return this;
    }

    public EnemyBuilder setDamage(int damage) {
        enemy.damage = damage;
        return this;
    }

    public Enemy build() {
        return enemy;
    }
}
