package com.example.roomwordssample;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;
import androidx.annotation.NonNull;

@Entity(tableName = "word_table")
public class Word {

    //    @PrimaryKey
    @PrimaryKey(autoGenerate = true)
    private int id;
    @NonNull
    @ColumnInfo(name = "word")
    private String mWord;

    //    public Word(@NonNull String word) {this.mWord = word;}
    public Word(@NonNull String word) {
        this.mWord = word;
    }

    //    public String getWord(){return this.mWord;}
    @Ignore
    public Word(int id, @NonNull String word) {
        this.id = id;
        this.mWord = word;
    }

    public String getWord() {
        return this.mWord;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
