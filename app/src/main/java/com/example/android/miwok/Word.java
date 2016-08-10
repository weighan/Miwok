package com.example.android.miwok;

import android.graphics.drawable.BitmapDrawable;

public class Word {
    private String miwok;
    private String english;
    private int imageId;
    private int soundId;
    private boolean hasImage = true;

    public Word(String englishword, String miwokword, int picture, int sound){

        miwok = miwokword;
        english = englishword;
        imageId = picture;
        soundId = sound;
    }

    public Word(String englishword, String miwokword, int sound){

        miwok = miwokword;
        english = englishword;
        soundId = sound;
        hasImage = false;
    }

    public String getMiwok(){
        return miwok;
    }

    public String getEnglish(){
        return english;
    }

    public int getImage(){
        return imageId;
    }

    public boolean isHasImage(){
        return hasImage;
    }

    public int getSoundId(){return soundId;}
}