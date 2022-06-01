package org.example;

public class MoodyCat {

    private Mood mood;

    public String talk(){
        return switch (mood) {
            case HUNGRY -> "Meow";
            case HAPPY -> "Purr";
            case SICK -> "Blegh";
        };
    }

    public Mood getMood(){
        return mood;
    }

    public void setMood(Mood mood){
        this.mood = mood;}

    public void feed(){
        setMood(Mood.HAPPY);
    }
}

