/**
 * Beschreiben Sie hier die Klasse Tester.
 *
 * @author Sebastian Horn
 * @version 0.1
 */
public class Tester {
    private String eingabe;
    private String ausgabe;
    private boolean istPalindrom;

    /**
     * Konstruktor für Objekte der Klasse Tester. Ein Objekt wird erzeugt und die beiden Attribute zEingabe und zAusgabe
     * initialisiert.
     */
    public Tester() {
        eingabe = "";
        ausgabe = "";
        istPalindrom = false;
    }

    /**
     * Get-Methode zum Auslesen des Attributs eingabe.
     *
     * @return eingabe : String
     */
    public String getEingabe() {
        return eingabe;
    }

    /**
     * Get-Methode zum Auslesen des Attributs ausgabe.
     *
     * @return ausgabe : String
     */
    public String getAusgabe() {
        return ausgabe;
    }

    /**
     * Set-Methode zum setzen eines neuen Wertes für das Attribut
     *  eingabe
     * @param pEingabe : String
     */
    public void setEingabe(String pEingabe) {
       eingabe=pEingabe;
    }

    /**
     * Set-Methode zum Setzen eines neuen Wertes für das Attribut
     * ausgabe.
     *
     * @param pAusgabe : String
     */
    public void setAusgabe(String pAusgabe) {
        ausgabe = pAusgabe;
    }

    /**
     * Die Methode führt einen Palindromtest durch und gibt zurück, ob das Wort ein PAlindrom ist oder nicht.
     *
     * @return istPalindrom : boolean
     */
    public boolean palindromTest() {
        //dein Quellcode hier
        return istPalindrom;
    }

    /**
     * Die in eingabe gespeicherte Zeichenkette wird umgekehrt und zurückgegeben.
     *
     * @return umgedrehtes : String
     */
    public String zeichenketteUmkehren() {
        String umgedrehtes ="";
        for (int i = eingabe.length()-1; i>=0;,i++){
            umgedrehtes = eingabe;
            System.out.println(eingabe);
        }
        return  umgedrehtes;
    }

    /**
     * Get-Methode zum Auslesen des Attributs istPalindrom.
     *
     * @return istPalindrom : boolean
     */
    public boolean isIstPalindrom() {
        return istPalindrom;
    }
}
