package com.tochukwuozurumba.roomdemo;

import android.arch.persistence.room.Entity;
import android.support.annotation.NonNull;

@Entity()
public class Word {

    private String mWord;
    public Word(@NonNull String word) {this.mWord = word;}
    public String getWord(){return this.mWord;}
}
