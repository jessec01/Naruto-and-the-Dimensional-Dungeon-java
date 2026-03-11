package com.github.jessec01.narutodungeon.domain.repository;


public abstract class Character implements DuelMechanics , HealthMechanics {
    private String name;
    private int defense;
    private int attack;
    private int health;
    public Character(String name, int defense, int attack, int health) {
        this.name = name;
        this.defense = defense;
        this.attack = attack;
        this.health = health;
    }
    public boolean isAlive() {
        return health > 0;
    }
    public String getName() {
        return name;
    }
    public int getDefense() {
        return defense;
    }
    public int getAttack() {
        return attack;
    }
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public void setDefense(int defense) {
        this.defense = defense;
    }
}  
