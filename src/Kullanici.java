package src;

    public class Kullanici {
    private String kullaniciId;
    private String ad;
    private String soyad;
    private String ePosta;

    public Kullanici(String kullaniciId, String ad, String soyad, String ePosta) {
        this.kullaniciId = kullaniciId;
        this.ad = ad;
        this.soyad = soyad;
        this.ePosta = ePosta;
    }

    public String getKullaniciId() { return kullaniciId; }
    public void setKullaniciId(String kullaniciId) { this.kullaniciId = kullaniciId; }

    public String getAd() { return ad; }
    public void setAd(String ad) { this.ad = ad; }

    public String getSoyad() { return soyad; }
    public void setSoyad(String soyad) { this.soyad = soyad; }

    public String getEPosta() { return ePosta; }
    public void setEPosta(String ePosta) { this.ePosta = ePosta; }

    public String getKullaniciBilgisi() {
        return "ID: " + kullaniciId + ", Ad Soyad: " + ad + " " + soyad + ", E-Posta: " + ePosta;
    }
}
    

