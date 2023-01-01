package org.example;

import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IMetier<Produit> metier = new MetierProduitImpl();
        // Create a MetierProduitImpl object

        // Add some products to the list
        Produit p1 = new Produit(1, "Product 1", "Brand 1", 10.99, "Description 1", 10);
        Produit p2 = new Produit(2, "Product 2", "Brand 2", 15.99, "Description 2", 20);
        Produit p3 = new Produit(3, "Product 3", "Brand 3", 20.99, "Description 3", 30);
        metier.add(p1);
        metier.add(p2);
        metier.add(p3);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Afficher la liste des produits");
            System.out.println("2. Rechercher un produit par son id");
            System.out.println("3. Ajouter un nouveau produit dans la liste");
            System.out.println("4. Supprimer un produit par id");
            System.out.println("5. Quitter ce programme");

            int choix = sc.nextInt();
            sc.nextLine();

            if (choix == 1) {
                List<Produit> produits = metier.getAll();
                for (Produit produit : produits) {
                    System.out.println(produit);
                }
            } else if (choix == 2) {
                System.out.println("Entrez l'id du produit à rechercher:");
                long id = sc.nextLong();
                Produit produit = metier.findById(id);
                if (produit != null) {
                    System.out.println(produit);
                } else {
                    System.out.println("Produit non trouvé");
                }
            } else if (choix == 3) {
                System.out.println("Entrez le nom du produit:");
                String nom = sc.nextLine();
                System.out.println("Entrez la marque du produit:");
                String marque = sc.nextLine();
                System.out.println("Entrez le prix du produit:");
                double prix = sc.nextDouble();
                sc.nextLine();
                System.out.println("Entrez la description du produit:");
                String description = sc.nextLine();
                System.out.println("Entrez le nombre de produits en stock:");
                int nombreEnStock = sc.nextInt();
                Produit produit = new Produit(0, nom, marque, prix, description, nombreEnStock);
                metier.add(produit);
            } else if (choix == 4) {
                System.out.println("Entrez l'id du produit à supprimer:");
                long id = sc.nextLong();
                metier.delete(id);
            } else if (choix == 5) {
                break;
            }
        }
        sc.close();
    }
}

