package app.workers.dao;

import app.exceptions.MyDBException;
import java.util.List;

/**
 * Définit les services minimaux de la couche DAO (écrite pour JPA).
 *
 * @author Jean-Claude Stritt et Pierre-Alain Mettraux
 */
public interface JpaDaoItf<E, PK> {

  // Connexion
  void deconnecter();
  boolean estConnectee();

  // operations CRUD
  void creer( E e )  throws MyDBException;
  E lire( PK pk )  throws MyDBException;
  void modifier( E e )  throws MyDBException;
  void effacer( PK pk )  throws MyDBException;

  // operations speciales
  long compter()  throws MyDBException ;
  E rechercher(String p, Object valeur)  throws MyDBException;

  // operations sur des listes completes de bean
  List<E> lireListe() throws MyDBException ;
  List<E> filtrer(String p, Object valeur)  throws MyDBException ;
  int effacerListe()  throws MyDBException;
  int sauverListe( List<E> list )  throws MyDBException;
}
