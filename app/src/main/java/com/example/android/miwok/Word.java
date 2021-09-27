package com.example.android.miwok;

import androidx.annotation.Nullable;

/**
 * {@Link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok Translation for that word.
 */
public class Word {
    /**
     * Default Translation of the word.
     */
    private String mDefaultTranslation;
    /**
     * Miwok Translation of the word.
     */
    private String mMiwokTranslation;

    private static final int NO_IMAGE_PROVIDED=-1;
    /**
     * Image resource ID of the image to be displayed
     */
    private int mImageResourceId=NO_IMAGE_PROVIDED;

    private int mAudioResourceId;

    public Word(String DefaultTranslation, String MiwokTranslation, int AudioResourceId) {
        mDefaultTranslation = DefaultTranslation;
        mMiwokTranslation = MiwokTranslation;
        mAudioResourceId = AudioResourceId;
    }

    public Word(String DefaultTranslation, String MiwokTranslation, int AudioResourceId, int ImageResourceId) {
        mDefaultTranslation = DefaultTranslation;
        mMiwokTranslation = MiwokTranslation;
        mImageResourceId = ImageResourceId;
        mAudioResourceId = AudioResourceId;
    }

    //get Default Translation of the word.
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    //get Default Translation of the word.
    public int getImageResourceId() {
        return mImageResourceId;
    }

    //get Miwok Translation of the word.
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public boolean hasImage(){
        return mImageResourceId!=NO_IMAGE_PROVIDED;
    }

    public int getAudioResourceId() {
        return mAudioResourceId;
    }

//    @Override
//    public String toString() {
//        return "Word{" +
//                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
//                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
//                ", mImageResourceId=" + mImageResourceId +
//                ", mAudioResourceId=" + mAudioResourceId +
//                '}';
//    }
}

