package com.github.jessec01.narutodungeon.domain.repository;

public class WeakEnemy extends Character {
    public WeakEnemy(String name, int defense, int attack, int health) {
        super(name, defense, attack, health);
    }

    @Override
    public void checkHealth() {
        // Implementation for checking health
    }

    @Override
    public void rechargeHealth(int amount) {
        // Implementation for recharging health
    }
    public void receiveDamage(int damage) {
        // Implementation for receiving damage
    }
    public void activeDefense() {
        // Implementation for active defense
    }
}