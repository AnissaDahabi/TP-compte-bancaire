package Compte;
import java.util.Scanner;


public class Compte {
    int numero;
    String nomTitulaire;
    double solde;

    //il faut pouvoir consulter le compte, déposer ou retirer de l'argent
    // (à condition que le compte soit pas en découvert!)

    public Compte(int numero, String nomTitulaire, double solde) {
        this.numero = numero;
        this.nomTitulaire = nomTitulaire;
        this.solde = solde;
    }

    public static void Consulter(int numero, String nomTitulaire, double solde) {
        System.out.println("Le numéro de compte est: " + numero);
        System.out.println("Le nom du titulaire du compte est: " + nomTitulaire);
        System.out.println("Le solde du compte est: " + solde + "£.");
    }

    public static double Action(int action, double solde) {
        Scanner sc = new Scanner(System.in);
        if (action == 1) {
            System.out.println("Combien souhaitez-vous ajouter?");
            double montant = sc.nextDouble();
            solde = solde + montant;
            System.out.println("Le nouveau solde du compte est: " + solde);
        }
        if (action == 2) {
            System.out.println("Combien souhaitez-vous retirer?");
            double montant = sc.nextDouble();
            if (solde >= montant) {
                solde = solde - montant;
                System.out.println("Le nouveau solde du compte est: " + solde);
            } else {
                System.out.println("Solde insuffisant, veuillez choisir un autre montant.");
            }

        }
        return solde;
    }

    public static void Choix(String choix, int action, double solde) {
        Scanner sc = new Scanner(System.in);

        if (choix.equals("oui")) {
            System.out.println("Appuyez sur 1 pour ajouter de l'argent au solde, 2 pour en retirer.");
            action = sc.nextInt();
            Action(action, solde);
        }
        else if (choix.equals("non")) {
            System.out.println(" ");
        } else {
            System.out.println("Veuillez entrer comme réponse oui ou non.");
        }
    }
}

