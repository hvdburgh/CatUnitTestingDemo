package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CatTest {

    Cat cat;

    @BeforeEach
    void setUp(){
        cat = new Cat();
    }

    @Test
    void whenTalk_thenMeow(){
        String result = cat.talk();
        assertEquals("Meow", result);
    }
}
