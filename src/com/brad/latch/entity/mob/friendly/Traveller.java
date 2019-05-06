package com.brad.latch.entity.mob.friendly;

import com.brad.latch.level.tile.TileCoordinate;

public class Traveller extends Friendly {

    public Traveller(TileCoordinate tileCoordinate) {
        super(tileCoordinate);

        health = 100;
        maxHealth = health;
        melee = false;
        meleeDamage = 0;
        aggroRadius = 0;
        projectileRate = 0;
        moveSpeed = 0.7;
        meleeRate = 1.0;

        name = "Traveller";
        sprite = traveller_down.getSprite();
        size = 32;
        animatedSprite = traveller_down;
        animatedSpriteDown = traveller_down;
        animatedSpriteUp = traveller_up;
        animatedSpriteLeft = traveller_left;
        animatedSpriteRight = traveller_right;
    }

    @Override
    protected void shoot(double x, double y, double dir) {

    }
}
