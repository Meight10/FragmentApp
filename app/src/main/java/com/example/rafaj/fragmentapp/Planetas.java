package com.example.rafaj.fragmentapp;

import java.util.HashMap;

/**
 * Created by usuario on 14/04/2018.
 */

public class Planetas {

    private String name;
    private HashMap<Integer, Integer> imageViewHashMap;
    private int indice, imageResource;


    public Planetas(){
        imageViewHashMap=new HashMap<>();
    }

    /*private void init(){

        //setArrayID();
    }*/


    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void setIndice(int indice){
        this.indice=indice;
    }



    public int getImageView(){
        return imageViewHashMap.get(indice);
    }



    public int getContent(){
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




}
