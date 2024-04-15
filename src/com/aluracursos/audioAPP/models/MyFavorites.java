package com.aluracursos.audioAPP.models;

public class MyFavorites {
    public void add(Audio audio){
        if (audio.getClassification()>= 8){
            System.out.println(audio.getTitle() + " es uno de los favoritos de la gente.");
        }else{
            System.out.println(audio.getTitle() + " tambien te podria gustar.");
        }
    }
}
