public class FizzBuzz {

    public static void main(String[] args){
        // nb max 
        int nombreMaximum = 100;

        // parcourir les chiffres de 1 à nombreMaximum
        for (int i = 1; i <= nombreMaximum; i++){
            // vérifier que le nb est divisible par 3 et 5
            if( i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            }
            // vérifier que le nb est divisible par 3
            else if(i % 3 == 0){
                System.out.println("Fizz");
            }
            // vérifier que le nb est divisible par 5 
            else if(i % 5 == 0){
                System.out.println("Buzz");
            }
            // afficher le nb
            else {
                System.out.println(i);
            }
        }
    }
}