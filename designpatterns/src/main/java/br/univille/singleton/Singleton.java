package br.univille.singleton;

public class Singleton {
    //variavel global
    private static Singleton instance;

    private Singleton(){

    }
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
