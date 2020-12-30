# Projet-Kotlin *by Guilhem NESPOULOUS*
![Image Acceuil](https://github.com/Guilhemnespoulous/Projet4A/blob/master/images/Accueil.png) ![Image personnal](https://github.com/Guilhemnespoulous/Projet4A/blob/master/images/personnal.png)
## Description :

Projet_Kotlin est une application Android codée avec Kotlin qui permet de se connecter et afficher des informations personnelles liées à un compte. De plus elle permet de créer de nouveaux comptes qui sont ensuite stockés dans la mémoire du téléphone.

## Installation
Pour installer l'application il faut:
1. Disposer d'une version android >21. Affichage optimal des features avec une version >21.
2. Prendre la branche : [Final Release](https://github.com/Guilhemnespoulous/Projet4A/tree/FinalRelease)

## Architecture : MVVM
![Image Architecture](https://github.com/Guilhemnespoulous/Projet4A/blob/master/images/MVVMPattern.png)


## Technologies utilisée :

## Android
<img src="https://github.com/Guilhemnespoulous/Projet4A/blob/master/images/android.jpg" width="200">
<br>

## Kotlin
<img src="https://github.com/Guilhemnespoulous/Projet4A/blob/master/images/kotlin.png" width="200">
<br>
Language de programmation utilisé.

## Material
<img src="https://github.com/Guilhemnespoulous/Projet4A/blob/master/images/material.jpg" width="200">
<br>
Pour les éléments de design et l'ajout de fonctions comme le comptage de caractère sous les champs ou la possibilité de cacher les champs de mot de passe

## Features :

![Page d'accueil](https://github.com/Guilhemnespoulous/Projet4A/blob/master/images/Accueil.png)
* La page d'accueil comporte deux entrées qui permettent de s'identifier.
Pour s'identifier, l'utilisateur rentre son email et son mot de passe.
Le mot de passe est caché par défaut mais l'utilisateur peur le révéler en clickant sur le symbole en forme d'oeuil.
![Password toggle](https://github.com/Guilhemnespoulous/Projet4A/blob/master/images/passwordToggle.png)

* Si l'utilisateur n'a pas de compte, il clique sur "Create account" pour créer un nouveau compte et en suite pouvoir se connecter. Pour cela il doit renseigner son nom, prénom, nom de famille et mot de passe dans les champs correspondants. Les champs ne doivent pas dépasser les limites imposées par les petits conteurs sous ces-deriers. Sinon, ils deviennent rouge pour indiquer à l'utilisateur que c'est trop long
![Image personnal](https://github.com/Guilhemnespoulous/Projet4A/blob/master/images/personnal.png)![compteur](https://github.com/Guilhemnespoulous/Projet4A/blob/master/images/counterEnabled.png)


* On peut remarquer que la couleur de la fenêtre des détails s'adapte à la coueleur officielle de la cryptomonnaie fournie par l'api(7). Par exemple pour le bitcoin la fenêtre prend des colorations orange (barre de notification et de navigation)

* L'utilisateur peur cliquer sur la flèche(8) qui apparaît dans la barre suppérieure afin de revenir à la page d'accueil s'il le souhaite.

## Elements techniques :

* Ecran avec liste d'éléments

![Image acceuil2](https://raw.githubusercontent.com/Guilhemnespoulous/Projet-CryptApp/master/images/accueil2.png)

* Ecran avec le détail d'un élément sélectionné

![Image Détail2](https://raw.githubusercontent.com/Guilhemnespoulous/Projet-CryptApp/master/images/detail2.png)

* Appel à une API rest [Coinranking](https://coinranking.com/)

* Stockage des données en cache

![Image Cache](https://raw.githubusercontent.com/Guilhemnespoulous/Projet-CryptApp/master/images/cache.png)

* Architecture en MVC

![Image mvc](https://raw.githubusercontent.com/Guilhemnespoulous/Projet-CryptApp/master/images/mvc.png)

* Respect des principes SOLID

* Utilisation de Singletons (classe Injection)

![Image singletons](https://raw.githubusercontent.com/Guilhemnespoulous/Projet-CryptApp/master/images/singletons.png)


## Utilisation du GitFlow

J'ai utilisé gitFlow afin de simplifier la gestion des versions et des features de ce projet.

![Image gitflow](https://raw.githubusercontent.com/Guilhemnespoulous/Projet-CryptApp/master/images/gitflow.png)
