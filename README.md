
le programme représente un modèle simplifié pour une application de chauffeur dans laquelle un client est associé à un chauffeur, le chauffeur peut gerer les détails du client et les informations relatives au voyage.
Fonctionnalités clés :
•	Client Classe :
•	La classe Client représente les informations concernant un client qui pourrait utiliser l'application du conducteur.
•	Elle stocke des détails tels que l'ID du client, son nom et son numéro de téléphone.
•	Cette classe fournit des méthodes pour récupérer l'ID du client, son nom et son numéro de téléphone.
•	Classe Adresse :
•	La classe Adresse encapsule les informations d'adresse, y compris la rue, la ville, l'État et le code postal.
•	Elle fournit des méthodes pour récupérer l'adresse formatée et pour définir les composants individuels de l'adresse.
•	Classe Application du Conducteur :
•	La classe Application du Conducteur est la classe centrale de l'application du conducteur.
•	Elle maintient des informations sur le conducteur, notamment l'ID du conducteur, la localisation actuelle (une instance de la classe Adresse) et le client associé (une instance de la classe Client).
•	Les méthodes de cette classe permettent de définir l'ID du conducteur, la localisation actuelle, les informations sur le client et l'adresse de destination.
