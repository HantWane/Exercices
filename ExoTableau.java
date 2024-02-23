public class ExoTableau {

    public static void main(String[] args){
       int[] tableau = {0, 2, 4, 6, 4};
       int somme = 0;

       for (int nombre : tableau){
        somme += nombre;
       }


        System.out.println("la somme des éléments du tableau est : " + somme);
    }

}