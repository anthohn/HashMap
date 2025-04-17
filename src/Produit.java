/**
 * mai 2021
 *
 * @author Mirko Steinle
 */
public class Produit
{
    /**
     * Le nom du produit
     */
    private final String nom;

    /**
     * Le prix unitaire du produit
     */
    private double prix;

    /**
     * La quantité en stock du produit
     */
    private int stock;

    public Produit(String nom, double prix, int stock)
    {
        this.nom = nom;
        this.prix = prix;
        this.stock = stock;
    }

    public String getNom()
    {
        return nom;
    }

    public double getPrix()
    {
        return prix;
    }

    public double getPrixTotalStock() {
        return prix * stock;
    }

    public void setPrix(double prix)
    {
        this.prix = prix;
    }


    public int getStock()
    {
        return stock;
    }

    public void setStock(int stock)
    {
        this.stock = stock;
    }

    @Override
    public String toString()
    {
        return String.format("Produit: %s\tPrix/quantité: %s\tStock:%s", nom, prix, stock);
    }

    // TODO (I hope!)
    public double getMontantStock()
    {
        return prix*stock;
    }
}
