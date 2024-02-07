package models;
public class Dolgozo {
    private int id;
    private String nev;
    private String varos;
    private String utca;
    private int fizetes;
    private String szuletes;
    private static boolean autoIncrement;
    private static int autoID = 0;

    public Dolgozo(int id, String nev, String varos, String utca, int fizetes, String szuletes) {
        setAll(id, nev, varos, utca, fizetes, szuletes);
    }

    public Dolgozo(String sor, String separator) {
        String[] adatok = sor.split(separator);
        setAll(Integer.parseInt(adatok[0]), adatok[0], adatok[0], adatok[0], Integer.parseInt(adatok[0]), adatok[0]);
    }

    public Dolgozo() {
        increment();
    }

    public void setAll(int id, String nev, String varos, String utca, int fizetes, String szuletes) {
        this.id = autoIncrement? autoID: id;
        this.nev = nev;
        this.varos = varos;
        this.utca = utca;
        this.fizetes = fizetes;
        this.szuletes = szuletes;
        increment();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getVaros() {
        return varos;
    }

    public void setVaros(String varos) {
        this.varos = varos;
    }

    public String getUtca() {
        return utca;
    }

    public void setUtca(String utca) {
        this.utca = utca;
    }

    public int getFizetes() {
        return fizetes;
    }

    public void setFizetes(int fizetes) {
        this.fizetes = fizetes;
    }

    public String getSzuletes() {
        return szuletes;
    }

    public void setSzuletes(String szuletes) {
        this.szuletes = szuletes;
    }

    public void increment() {
        autoID = this.id > autoID? this.id + 1: autoID++; 
    }

    public static void setAutoIncrement(boolean autoIncrement) {
        Dolgozo.autoIncrement = autoIncrement;
    }

    @Override
    public String toString() {
        return "Dolgozo [id=" + id + ", nev=" + nev + ", varos=" + varos + ", utca=" + utca + ", fizetes=" + fizetes
                + ", szuletes=" + szuletes + "]";
    }

}
