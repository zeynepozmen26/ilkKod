package src;

    public class KitapKopyasi {
    private String barkodNo;
    private String durum; // Örn: "Rafta", "Ödünç Verildi"
    private Kitap kitap;   // Kitap sınıfı ile ilişki (Association/Composition)

    public KitapKopyasi(String barkodNo, String durum, Kitap kitap) {
        this.barkodNo = barkodNo;
        this.durum = durum;
        this.kitap = kitap;
    }

    public String getBarkodNo() { return barkodNo; }
    public void setBarkodNo(String barkodNo) { this.barkodNo = barkodNo; }

    public String getDurum() { return durum; }
    public void setDurum(String durum) { this.durum = durum; }

    public Kitap getKitap() { return kitap; }
    public void setKitap(Kitap kitap) { this.kitap = kitap; }

    public String getKopyaBilgisi() {
        return "Barkod: " + barkodNo + ", Durum: " + durum + " | Kitap: [" + kitap.getKitapBilgisi() + "]";
    }
}
    

