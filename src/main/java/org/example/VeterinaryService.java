package org.example;

public class VeterinaryService {

    public MoodyCat heal(MoodyCat cat){
        cat.setMood(Mood.HAPPY);
        return cat;
    }
}
