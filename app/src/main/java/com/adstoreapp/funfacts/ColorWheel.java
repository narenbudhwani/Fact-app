package com.adstoreapp.funfacts;

import android.graphics.Color;

import java.util.Random;


public class ColorWheel {

    public String[] mColors = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7",  // light gray
            "#B0171F",
            "#DC143C",
            "#EEA2AD",
            "#FFC0CB",
            "#DB7093",
            "#FF82AB",
            "#8B4789",
            "#7A378B",
            "#4B0082",
            "#8A2BE2",
            "#8470FF",
            "#473C8B",
            "#0000FF",
            "#0000CD",
            "#00008B",
            "#191970",
            "#778899",
            "#C6E2FF",
            "#4682B4",
            "#6CA6CD",
            "#00688B",
            "#BFEFFF",
            "#53868B",
            "#00868B",
            "#00CED1",
            "#008B8B",
            "#00FF7F",
            "#008B45",
            "#2E8B57",
            "#00C957",
            "#C1FFC1",
            "#ADFF2F",
            "#A2CD5A",
            "#6E8B3D",
            "#EEEE00",
            "#8B8B00",
            "#FFEC8B",
            "#FF8C00"

    };

    public int getColor() {
        String color = "";
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mColors.length);
        color = mColors[randomNumber];

        int colorAsInt = Color.parseColor(color);

        return colorAsInt;
    }
}
