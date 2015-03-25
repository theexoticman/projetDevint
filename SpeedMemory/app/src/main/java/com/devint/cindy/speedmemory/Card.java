package com.devint.cindy.speedmemory;


import android.widget.Button;

/**
 * Created by Cindy Najjar on 10/03/15.
 */

public class Card {

    public Button button;
    private int audioId;
    private int color;
    private int id;


    public Card(Button button, int id, int color) {
        this.button=button;
        this.color = color;
        this.id = id;
    }

    public Card(Button button, int id, int color, int audioId) {
        this.button=button;
        this.color = color;
        this.id = id;
        this.audioId = audioId;
    }

    public int getColor() {
        return this.color;
    }

    public int getAudioId() {
        return this.audioId;
    }

    public int getId() {
        return this.id;
    }

}
