import clavier.In;

import java.util.Random;

public class tdBoucle {
    public static void main(String[] args) {
        int chiffre = 0;
        int nombreATrouver = 0;
        Random rd = new Random();
        String chaine;
        chaine = new String("richarsdon");


        do {
            System.out.println("Saisir une valeur entre 0 et 4");
            chiffre = In.readInteger();
            if (chiffre == 1) {
                System.out.println("Vous avez choisis le menu 1");
            } else if (chiffre == 2) {
                System.out.println("Vous avez choisis le menu 2");
            } else if (chiffre == 3) {
                System.out.println("Vous avez choisis le menu 3");
            } else if (chiffre == 4) {
                System.out.println("Vous avez choisis le menu 4");

            }

        }while (chiffre != nombreATrouver);
        System.out.println("Votre valeur doit etre compris entre 1 et 4, reésessayer a nouveau");


        }
    }
