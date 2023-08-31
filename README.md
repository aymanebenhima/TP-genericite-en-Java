# TP-genericite-en-Java

Exercice 1 :
L’objectif de cet exercice est d’utiliser la généricité avec une collection d'objets de type
produit .
- Créez une classe Produit avec les attributs id, nom, marque, prix, description,
et nombre en stock.
- Créer une Interface générique IMetier qui va déclarer les méthodes pour gérer
nos entités Produit. Cette interface a un type générique T et contient les
méthodes suivantes :
o public void add(T o) : qui permet d’ajouter un objet à la liste.
o public List<T> getAll() : qui retourne la liste des objets sous forme d’une
liste.
o public T findById(long id) : qui retourne un produit par id.
o public void delete(long id) : qui supprime un objet par id.

- Créer une classe MetierProduitImpl qui implémente l’interface IMetier. Cette classe
contient un attribut qui représente une liste de produits.
- Ecrire une classe Application contenant la méthode main qui propose à l’utilisateur
dans une boucle while le menu suivant :
1. Afficher la liste des produits.
2. Rechercher un produit par son id.
3. Ajouter un nouveau produit dans la liste.
4. Supprimer un produit par id.
5. Quitter ce programme.
