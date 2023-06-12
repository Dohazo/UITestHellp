package com.mygdx.game;


import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;

public class AbstractScreen implements Screen {
    protected Game game;

    public AbstractScreen(Game game) {
        this.game = game;
    }

    public AbstractScreen() {

    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {

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

    @Override
    public void dispose() {

    }
}
