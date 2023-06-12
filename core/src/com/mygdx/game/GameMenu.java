package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.utils.ScreenUtils;

public class GameMenu extends AbstractScreen {
      StartMenu game;

    public GameMenu( Game game) {
        super(game);
    }

    public GameMenu() {
    }

    @Override
    public void show() {

    }
    @Override
    public void render(float delta) {
        ScreenUtils.clear(1, 1, 1, 1);
    }

    @Override
    public void dispose() {

    }

    @Override
    public void resize(int width, int height) {
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }
}
