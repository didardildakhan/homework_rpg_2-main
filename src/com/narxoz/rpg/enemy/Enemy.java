package com.narxoz.rpg.enemy;

public class Enemy {

    public String name;
    public int health;
    public int damage;

    public void show() {
        System.out.println("Enemy: " + name);
        System.out.println("HP: " + health);
        System.out.println("DMG: " + damage);
        System.out.println("------------");
    }
}
