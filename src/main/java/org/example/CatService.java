package org.example;

public class CatService {
    VeterinaryService vet;

    public CatService(VeterinaryService vet){
        this.vet = vet;
    }

    public String makeCatHappy(MoodyCat cat){
        Mood mood = cat.getMood();
        switch (mood){
            case SICK -> cat = vet.heal(cat);
            case HUNGRY -> feedCat(cat);
        }
        return cat.talk();
    }

    private void feedCat(MoodyCat cat){
        cat.feed();
    }
}
