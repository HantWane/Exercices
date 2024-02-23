import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class LectureNombresRomains {

    public static void main(String[] args) {
        // Chemin du fichier contenant les nombres romains
        String cheminFichier = "C:/Users/marke/Exercices/RomanToNumber";
        String cheminFichierEcriture = "C:/Users/marke/Exercices/result.out.txt";

        try {
            // Création d'une map pour associer les symboles romains à leurs valeurs
            Map<Character, Integer> symbolesRomains = new HashMap<>();
            symbolesRomains.put('I', 1);
            symbolesRomains.put('V', 5);
            symbolesRomains.put('X', 10);
            symbolesRomains.put('L', 50);
            symbolesRomains.put('C', 100);
            symbolesRomains.put('D', 500);
            symbolesRomains.put('M', 1000);

            // Création d'un lecteur de fichier
            BufferedReader lecteur = new BufferedReader(new FileReader(cheminFichier));
            BufferedWriter ecrire = new BufferedWriter(new FileWriter(cheminFichierEcriture));
            
            // Lecture du fichier ligne par ligne
            String ligne;
            while ((ligne = lecteur.readLine()) != null) {
                // Convertir le nombre romain en nombre arabe
                int nombreArabe = convertirNombreRomainEnArabe(ligne.trim(), symbolesRomains);
                // System.out.println("Nombre romain : " + ligne.trim() + ", Nombre arabe : " + nombreArabe);
                ecrire.write(String.valueOf(nombreArabe));
                ecrire.newLine();
            }

            lecteur.close();
            ecrire.close();

            System.out.println("Traduction réussie");

        } catch (IOException e) {
            System.out.println("Erreur lors de la lecture/écriture du fichier : " + e.getMessage());
        }
    }

    // Méthode pour convertir un nombre romain en nombre arabe
    private static int convertirNombreRomainEnArabe(String nombreRomain, Map<Character, Integer> symbolesRomains) {
        int resultat = 0;
        int preValeur = 0;

        // Parcourir le nombre romain de droite à gauche
        for (int i = nombreRomain.length() - 1; i >= 0; i--) {
            int valeur = symbolesRomains.get(nombreRomain.charAt(i));

            // Si la valeur du symbole courant est inférieure à la précédente, il faut soustraire
            if (valeur < preValeur) {
                resultat -= valeur;
            } else {
                resultat += valeur;
            }
            preValeur = valeur;
        }

        return resultat;
    }
}
