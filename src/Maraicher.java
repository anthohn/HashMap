import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

/**
 * mai 2021
 *
 * @author Mirko Steinle
 */
public class Maraicher
{

    public static final String COMMANDE_FIN = "fin";
    public static final String COMMANDE_LISTING = "listing";

    public static void main(String[] args)
    {
        // Ex1 salem Antho
        // Création de la HashMap équivalent au dictionnaire Python
        HashMap<String, Object> d = new HashMap<>();

        d.put("nom" , "Dupuis");
        d.put("prenom", "Jaque");
        d.put("age", 30);

        // Correction du prénom
        d.put("prenom", "Jaques");

        // Affichage des clés
        System.out.println("Clés du dictionnaire:");
        for (String key : d.keySet()) {
            System.out.println(key);
        }

        // Affichage des valeurs
        System.out.println("Valeurs du dictionnaire:");
        for (Object value : d.values()) {
            System.out.println(value);
        }

        // Affichage des clés/valeurs
        System.out.println("Clés/Valeurs du dictionnaire");
        for (String key : d.keySet()) {
            System.out.println(key + " : " + d.get(key));
        }


        HashMap<String, Produit> mapProduits = preparerDonnees();
        System.out.println("Data dump: ");
        System.out.println(mapProduits);
        System.out.println("Bienvenue chez 'Maraicher facile'!");
        String input;
        boolean stop = false;
        while (!stop)
        {
            System.out.println("Saississez un nom de produit ou 'listing'." +
                    "\nPour terminer le programme, entrez 'fin'." +
                    "\n=================================================");
            input = new Scanner(System.in).nextLine();
            if (COMMANDE_FIN.equals(input))
            {
                System.out.println("Au revoir!");
                stop = true;
            }
            else if (COMMANDE_LISTING.equals(input))
            {
                // TODO listing
                for (Produit produit : mapProduits.values()) {
                    System.out.println(produit.getNom() + " : " + produit.getPrixTotalStock() + " CHF");
                }
            }
            else
            {
                // TODO afficher le produit
                if (mapProduits.containsKey(input)) {
                    Produit produit = mapProduits.get(input);
                    System.out.println("Produit trouvé : " + produit.getNom() + ", Prix : " + produit.getPrix() + ", Stock : " + produit.getStock() + "\n");
                } else {
                    System.out.println("Désolé, nous n'avons pas trouvé ce produit :-(\n");
                }
            }
        }
    }

    private static HashMap<String, Produit> preparerDonnees()
    {
        String[] noms = {"Bananes", "Pommes", "Oranges", "Poires"};
        double[] prix = {4, 2, 1.5, 3};
        int[] stock = {100, 290, 50, 120};
        return getMapProduits(noms, prix, stock);
    }

    private static HashMap<String, Produit> getMapProduits(String[] noms, double[] prix, int[] stock)
    {
        // clé un nom de produit
        // valeur une instance de Produit

        // TODO compléter
        HashMap<String, Produit> d = new HashMap<>();
        for (int i = 0; i < noms.length; i++) {
            Produit produit = new Produit(noms[i], prix[i], stock[i]);
            d.put(produit.getNom(), produit);
        }
        return d;
    }

}
