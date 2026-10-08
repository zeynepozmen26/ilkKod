package src;

public class OduncKaydi {
    private String kayitId;
    private Kullanici kullanici;     // Kullanici sınıfı ile ilişki
    private KitapKopyasi kitapKopyasi; // KitapKopyasi sınıfı ile ilişki
    private String oduncTarihi;
    private String teslimTarihi;

    public OduncKaydi(String kayitId, Kullanici kullanici, KitapKopyasi kitapKopyasi, String oduncTarihi, String teslimTarihi) {
        this.kayitId = kayitId;
        this.kullanici = kullanici;
        this.kitapKopyasi = kitapKopyasi;
        this.oduncTarihi = oduncTarihi;
        this.teslimTarihi = teslimTarihi;
    }

    public String getKayitId() { return kayitId; }
    public void setKayitId(String kayitId) { this.kayitId = kayitId; }

    public Kullanici getKullanici() { return kullanici; }
    public void setKullanici(Kullanici kullanici) { this.kullanici = kullanici; }

    public KitapKopyasi getKitapKopyasi() { return kitapKopyasi; }
    public void setKitapKopyasi(KitapKopyasi kitapKopyasi) { this.kitapKopyasi = kitapKopyasi; }

    public String getOduncTarihi() { return oduncTarihi; }
    public void setOduncTarihi(String oduncTarihi) { this.oduncTarihi = oduncTarihi; }

    public String getTeslimTarihi() { return teslimTarihi; }
    public void setTeslimTarihi(String teslimTarihi) { this.teslimTarihi = teslimTarihi; }

    public void kayitOzetiniYazdir() {
        System.out.println("--- ÖDÜNÇ KAYDI ---");
        System.out.println("Kayıt ID: " + kayitId);
        System.out.println("Ödünç Alan: " + kullanici.getKullaniciBilgisi());
        System.out.println("Kitap Kopyası: " + kitapKopyasi.getKopyaBilgisi());
        System.out.println("Ödünç Tarihi: " + oduncTarihi + " | Teslim Tarihi: " + teslimTarihi);
        System.out.println("--------------------");
    }
}
    

