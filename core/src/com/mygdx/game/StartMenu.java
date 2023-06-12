package com.mygdx.game;

import com.badlogic.gdx.*;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.TextureData;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.*;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.*;
import sun.tools.jconsole.Tab;

import static jdk.jfr.internal.consumer.EventLog.update;

public class StartMenu extends AbstractScreen implements ApplicationListener {
    SpriteBatch batch;
    Stage stage;

    Texture texture;
    Skin skin;
    Viewport viewport;
    Table table;
    Music selectMenu;
 public StartMenu (Game game){
     super(game);

}

    public StartMenu() {

    }

    @Override
    public void create() {
        float width = Gdx.graphics.getWidth();
        float height = Gdx.graphics.getHeight();
        // camera
viewport = new StretchViewport(1920,1080);
        batch = new SpriteBatch();
//setMusic
        selectMenu = Gdx.audio.newMusic(Gdx.files.internal("Blip_select.mp3"));
// Set Background
        texture = new Texture(Gdx.files.internal("cattt.jpg"));
        TextureRegion textureRegion = new TextureRegion(texture, 1920, 1080);
        Image background = new Image(textureRegion);
//declare skin
        skin = new Skin(Gdx.files.internal("comic-ui.json"));

        // Full screen

        stage = new Stage(viewport);
        // supaya Table ngisi screen
        table = new Table();

        Gdx.input.setInputProcessor(stage); // inputProcessor dibawa ke stage
        //add Button
        TextButton startButton = new TextButton("Start", skin);
        TextButton exitButton = new TextButton("Exit", skin);
        //edit listener button
        startButton.addListener(new ClickListener(){
            @Override
            public void enter(InputEvent event, float x, float y, int pointer, Actor fromActor) {

            }

            @Override
            public void exit(InputEvent event, float x, float y, int pointer, Actor toActor) {

            }

            @Override
            public void clicked(InputEvent event, float x, float y) {
            goToGameMenu();
        }
        });
        //add button ke table
        table.add(startButton).width(500).height(75).padBottom(20);
        table.row();
        table.add(exitButton).width(500).height(75).padBottom(20);
        //edit table
        table.setPosition(500,500);
        //agar dibawah
        table.row();
        //add table ke actor
        stage.addActor(background);
        stage.addActor(table);

        //update camera
    }
    private void goToGameMenu() {

       game.setScreen(new GameMenu(game));
    }
    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {

    }

    @Override
    public void resize(int width, int height) {
        viewport.update(width, height);

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
    public void render() {
        ScreenUtils.clear(1, 1, 1, 1);
        stage.act(Gdx.graphics.getDeltaTime());
        stage.draw();

    }

    @Override
    public void dispose() {

    }
}
