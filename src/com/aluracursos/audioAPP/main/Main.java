package com.aluracursos.audioAPP.main;

import com.aluracursos.audioAPP.models.MyFavorites;
import com.aluracursos.audioAPP.models.Podcast;
import com.aluracursos.audioAPP.models.Song;

public class Main {
    public static void main(String[] args) {
        Song mySong = new Song();
        mySong.setTitle("Aerials");
        mySong.setSinger("System of a Down");

        Podcast myPodcast = new Podcast();
        myPodcast.setPresenter("Robbie J Frye");
        myPodcast.setTitle("The Frye Show");

            //SONG

        for (int i = 0; i < 100; i++) {
            mySong.likes();
        }
        for (int i = 0; i < 2000; i++) {
            mySong.plays();

            //PODCAST
        }
        for (int i = 0; i < 100; i++) {
            myPodcast.likes();
        }
        for (int i = 0; i < 8000; i++) {
            myPodcast.plays();
        }

        System.out.println("Total de reproducciones: " + mySong.getTotalReproductions());
        System.out.println("Total de me gusta: " +mySong.getTotalLikes());

        MyFavorites favorites = new MyFavorites();
        favorites.add(myPodcast);
        favorites.add(mySong);
    }
}
