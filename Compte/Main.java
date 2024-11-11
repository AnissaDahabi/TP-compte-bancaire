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
        Compte.Action(action, solde);

        System.out.println("Souhaitez-vous effectuer une autre action sur le compte? Oui ou non.");
        String choix = sc.next();
        System.out.println("Appuyez sur 1 pour ajouter de l'argent au solde, 2 pour en retirer.");
        sc.nextInt();
        Compte.Action(action, solde);
        sc.close();
    }
}