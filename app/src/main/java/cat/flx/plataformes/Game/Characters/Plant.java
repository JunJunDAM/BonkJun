package cat.flx.plataformes.Game.Characters;

import cat.flx.plataformes.Game.Activity.GameEngine;

/**
 * Created by alu2015059 on 14/05/2018.
 */

public class Plant extends Character{
    private static final int[][] ANIMATIONS = new int[][]{
            new int[]{34}
    };


    public Plant(GameEngine gameEngine, int x, int y) {
        super(gameEngine, x, y);
    }

    @Override
    int[][] getAnimations() {
        return ANIMATIONS;
    }

    @Override
    void updatePhysics(int delta) {

    }

    @Override
    void updateCollisionRect() {
        collisionRect.set(x, y, x + 12, y + 12);
    }
}
