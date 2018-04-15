package com.example.rafaj.fragmentapp;

import java.io.Serializable;
import java.util.HashMap;

/**
 * Created by usuario on 14/04/2018.
 */

public class Planetas implements Serializable{

    private String titulo;
    private HashMap<Integer, Integer> imageViewHashMap;
    private int indice, imageResource;


    public Planetas(){
        imageViewHashMap = new HashMap<>();
    }

    /*private void init(){

        //setArrayID();
    }*/


    public void setTitulo(String name){
        this.titulo = name;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setIndice(int indice){
        this.indice=indice;
    }


    /**
     * @return the value of the planet image id
     */
    public int getImageView(){
        return imageViewHashMap.get(indice);
    }


    /*private void setArrayID(){
        imageViewHashMap.put(0, R.drawable.sun_0);
        imageViewHashMap.put(1, R.drawable.mercury_1);
        imageViewHashMap.put(2, R.drawable.venus_2);
        imageViewHashMap.put(3, R.drawable.earth_3);
        imageViewHashMap.put(4, R.drawable.mars_4);
        imageViewHashMap.put(5, R.drawable.jupiter_5);
        imageViewHashMap.put(6, R.drawable.saturn_6);
        imageViewHashMap.put(7, R.drawable.uranos_7);
        imageViewHashMap.put(8, R.drawable.neptune_8);
    }*/



    public int getDescripcion(){
        switch (indice){
            case 0: return R.string.Sol;
            case 1: return R.string.Mercurio;
            case 2: return R.string.Venus;
            case 3: return R.string.Tierra;
            case 4: return R.string.Marte;
            case 5: return R.string.Jupiter;
            case 6: return R.string.Saturno;
            case 7: return R.string.Urano;
            case 8: return R.string.Neptuno;
        }
        return 10;
    }


    /**
     * @return the value of the color id by planet
     * @author Pedro Gómez
     */
    /*public int getColor(){
        switch (indice){
            case 0: return R.color.Sol;
            case 1: return R.color.Mercurio;
            case 2: return R.color.Venus;
            case 3: return R.color.Earth;
            case 4: return R.color.Mars;
            case 5: return R.color.Jupiter;
            case 6: return R.color.Saturn;
            case 7: return R.color.Uranus;
            case 8: return R.color.Neptune;
        }
        return 10;
    }*/
}
