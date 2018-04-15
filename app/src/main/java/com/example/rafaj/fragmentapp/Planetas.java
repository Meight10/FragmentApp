package com.example.rafaj.fragmentapp;

import java.io.Serializable;
import java.util.HashMap;

/**
 * Created by usuario on 14/04/2018.
 */

public class Planetas implements Serializable{

    private String titulo;
    private HashMap<Integer, Integer> imageHashMap;
    private int indice, imageResource;


    public Planetas(){
        imageHashMap = new HashMap<>();
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



    public int getImageView(){
        return imageHashMap.get(indice);
    }


    private void setImage(){
        imageHashMap.put(0, R.drawable.sol);
        imageHashMap.put(1, R.drawable.mercurio);
        imageHashMap.put(2, R.drawable.venus);
        imageHashMap.put(3, R.drawable.tierra);
        imageHashMap.put(4, R.drawable.marte);
        imageHashMap.put(5, R.drawable.jupiter);
        imageHashMap.put(6, R.drawable.saturno);
        imageHashMap.put(7, R.drawable.urano);
        imageHashMap.put(8, R.drawable.neptuno);
    }



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





}
