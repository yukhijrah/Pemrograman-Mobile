package saha.app.kumpulanhadits.model;

public class Doa{

    private String namaDoa;
    private String arti;
    private String surah;

    public Doa(String namaDoa, String arti, String surah) {
        this.namaDoa = namaDoa;
        this.arti = arti;
        this.surah = surah;
    }

    public String getNamaDoa() {
        return namaDoa;
    }

    public String getArti() {
        return arti;
    }

    public String getSurah() {
        return surah;
    }
}
