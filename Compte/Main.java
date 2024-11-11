package Compte;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Déclaration des variables
        int numero = 123;
        String nomTitulaire = "Mr Durand";
        double solde = 1000;

        System.out.println("Voici le compte de " + nomTitulaire + " :");
        Compte.Consulter(numero, nomTitulaire, solde);

        System.out.println("Que souhaitez-vous faire?");
        System.out.println("Appuyez sur 1 pour ajouter de l'argent au solde, 2 pour en retirer.");
        int action = sc.nextInt();

        //Permet d'actualiser le solde!!
        solde = Compte.Action(action, solde);

        System.out.println("Souhaitez-vous effectuer une autre action sur le compte? (oui/non)");
        String choix = sc.next();
        Compte.Choix(choix, action, solde);

        System.out.println("Merci et à bientôt!");
        sc.close();
    }
}
