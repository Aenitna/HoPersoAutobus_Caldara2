import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
    AUTORE: Antinea Caldara
    DATA: 04/04/2023
    ASSEGNAZIONE: Creazione di una List di numeri interi ricevuti in input
                  e stampa a video la somma, la media, l'ordinamento, il minimo e il massimo
*/

public class Main {

    public static void main(String[] args) throws IOException {

        /* DICHIARAZIONE VARIABILI */
        int somma =  0;
        double media;
        int numero;
        int contatore = 0;
        String scelta;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        /* CREAZIONE LISTA DI INTERI */
        List<Integer> listaInteri = Arrays.asList();

        /* RICHIESTA DI INSERIMENTO NUMERI */
         do {

             System.out.println("Vuoi inserire un numero? (s/n) ");
             scelta = br.readLine();

             if (Objects.equals(scelta, "s") || Objects.equals(scelta, "S")) {

                 System.out.println("Inserire il numero --> ");
                 numero = Integer.parseInt(br.readLine());

             }

             contatore++; // conta gli elementi della List

         } while (Objects.equals(scelta, "n") || Objects.equals(scelta, "N"));

         /* CALCOLO DELLA SOMMA */
         for (int i = 0; i < listaInteri.size(); i++) {

             somma = somma + listaInteri.get(i);

         }

         /* ORDINAMENTO DEI NUMERI */
         Collections.sort(listaInteri);

        /* CALCOLO MEDIA */
        media = somma / contatore;

        /* STAMPA DI NUMERI ORDINATI, SOMMA, MEDIA, NUMERO MINIMO E NUMERO MASSIMO */
        System.out.println("Numeri ordinati: " + listaInteri);
        System.out.println("Somma dei numeri: " + somma);
        System.out.println("Media dei numeri: " + media);
        System.out.println("Numero minimo: " + Collections.min(listaInteri));
        System.out.println("Numero massimo: " + Collections.max(listaInteri));

    }
}
