package Data;

import java.util.ArrayList;

public class Person {
	private static ArrayList<Person> Liste = new ArrayList<Person>();
	
private String titel;
private String vorname;
private String nachname;
private String plz;
private String strasse;
private String hausnummer;
private String ort;
//
public String getTitel() {
	return titel;
}
public void setTitel(String titel) {
	this.titel = titel;
}
public String getVorname() {
	return vorname;
}
public void setVorname(String vorname) {
	this.vorname = vorname;
}
public String getNachname() {
	return nachname;
}
public void setNachname(String nachname) {
	this.nachname = nachname;
}
public String getPlz() {
	return plz;
}
public void setPlz(String plz) {
	this.plz = plz;
}
public String getStrasse() {
	return strasse;
}
public void setStrasse(String strasse) {
	this.strasse = strasse;
}
public String getHausnummer() {
	return hausnummer;
}
public void setHausnummer(String hausnummer) {
	this.hausnummer = hausnummer;
}
public String getOrt() {
	return ort;
}
public void setOrt(String ort) {
	this.ort = ort;
}
@Override
public String toString() {
	return getNachname() + ", " +getVorname();
}
public static ArrayList<Person> getListe() {
	return Liste;
}
}
