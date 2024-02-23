import java.util.Scanner;

public class Chifumi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bienvenue dans le jeu du chifumi !");
        System.out.println("Veuillez choisir :");
        System.out.println("1. Pierre");
        System.out.println("2. Papier");
        System.out.println("3. Ciseaux");
        System.out.print("Votre choix : ");
        
        int choixJoueur = scanner.nextInt();
        
        if (choixJoueur < 1 || choixJoueur > 3) {
            System.out.println("Choix invalide. Veuillez choisir un nombre entre 1 et 3.");
            return;
        }
        
        String[] options = {"Pierre", "Papier", "Ciseaux"};
        String choixOrdinateur = options[(int)(Math.random() * 3)];
        
        String choixJoueurString = options[choixJoueur - 1];
        
        System.out.println("Vous avez choisi : " + choixJoueurString);
        System.out.println("L'ordinateur a choisi : " + choixOrdinateur);
        
        if (choixJoueurString.equals(choixOrdinateur)) {
            System.out.println("Égalité !");
        } else if ((choixJoueurString.equals("Pierre") && choixOrdinateur.equals("Ciseaux")) ||
                   (choixJoueurString.equals("Ciseaux") && choixOrdinateur.equals("Papier")) ||
                   (choixJoueurString.equals("Papier") && choixOrdinateur.equals("Pierre"))) {
            System.out.println("Vous avez gagné !");
        } else {
            System.out.println("L'ordinateur a gagné !");
        }
        
        scanner.close();
    }
}
