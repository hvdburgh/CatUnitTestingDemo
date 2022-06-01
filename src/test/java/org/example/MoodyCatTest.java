package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoodyCatTest {
    MoodyCat cat;

    @BeforeEach
    void setUp(){
        this.cat = new MoodyCat();
    }

    @Test
    void givenHungry_whenTalk_thenMeow(){
        cat.setMood(Mood.HUNGRY); //we define the preconditions
        String result = cat.talk(); //we execute the code
        assertEquals("Meow", result); //we assert our result
    }

    @Test
    void givenHappy_whenTalk_thenPurr(){
        cat.setMood(Mood.HAPPY); //we define the preconditions
        String result = cat.talk(); //we execute the code
        assertEquals("Purr", result); //we assert our result
    }
}
