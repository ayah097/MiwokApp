package com.example.android.miwok;
/**
 * Created by ASUS on 2/23/2017.
 */


public class Word {

        //variable for the english translation
        private String mDefaultTranslation;

        //variable for the miwak translation
        private String mMiwokTransation;

        //variable for Image Resource ID
        private int mImageResourceId = NO_IMAGE_PROVIDED;

        private static final int NO_IMAGE_PROVIDED = -1;

        //variable for Audio Resource ID
        private int mAudioResourceId;



        public Word(String defaultTranslation, String miwokTranslation, int audioResourceId){
            mDefaultTranslation = defaultTranslation;
            mMiwokTransation= miwokTranslation;
            mAudioResourceId = audioResourceId;
        }

        public Word(String defaultTranslation, String miwokTranslation, int ImageResourceId, int audioResourceId ){
            mDefaultTranslation = defaultTranslation;
            mMiwokTransation= miwokTranslation;
            mImageResourceId = ImageResourceId;
            mAudioResourceId = audioResourceId;
        }

           public String getDefaultTranslation(){
               return mDefaultTranslation;
           }

           public String getMiwokTranslation(){
               return mMiwokTransation;
           }

           public int getImageResourceId() {
               return mImageResourceId;
         }
           public boolean hasImage() {
               return mImageResourceId != NO_IMAGE_PROVIDED;
           }

           public int getAudioResourceId(){
               return mAudioResourceId;
           }
}


