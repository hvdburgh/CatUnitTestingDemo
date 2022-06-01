package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class CatServiceTest {

    @Mock
    VeterinaryService vet;

    @InjectMocks
    CatService catService;

    @Test
    void givenHungry_whenMadeHappy_thenPurr(){
        //we define the preconditions
        MoodyCat hungryCat = new MoodyCat();
        hungryCat.setMood(Mood.HUNGRY);

        //we execute the code we want to test
        String result = catService.makeCatHappy(hungryCat);

        //we assert our result
        assertEquals("Purr", result);
    }

    @Test
    void givenSick_whenMadeHappy_thenMeow(){
        //we define the preconditions
        MoodyCat sickCat = new MoodyCat();
        sickCat.setMood(Mood.SICK);
        MoodyCat happyCat = new MoodyCat();
        happyCat.setMood(Mood.HAPPY);
        when(vet.heal(sickCat)).thenReturn(happyCat);

        //we execute the code we want to test
        String result = catService.makeCatHappy(sickCat);

        //we assert our result
        assertEquals("Purr", result);
        verify(vet, times(1)).heal(sickCat);
    }
}
