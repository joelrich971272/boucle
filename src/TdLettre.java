import clavier.In;

public class TdLettre {
    public static void main(String[] args) {
        String laPhrase = new String("richardson");
        char leCaractere;
        int i = 0;
        int lettre = 0;
        System.out.println("Quelle caractere vous voulez trouver dans \""+ laPhrase+"\"");
        leCaractere = In.readChar();
        lettre = In.readChar();
       while(i<laPhrase.length())
       {


           System.out.println(i);
           System.out.println(laPhrase.charAt(i));

           i++;
       }while (i<laPhrase.length()){
            System.out.println("Saisie a nouveau un chiffre pour avoir son emplacement");
            lettre = In.readChar();
            while (lettre == leCaractere)
                System.out.println(laPhrase.charAt(i));
            i++;

            System.out.println("Votre caractere est le " + laPhrase.charAt(i));
        }






    }
}
