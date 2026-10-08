package src;

    public class Kitap {
    private String isbn;
    private String baslik;
    private String yazar;
    private int yayinYili;

    public Kitap(String isbn, String baslik, String yazar, int yayinYili) {
        this.isbn = isbn;
        this.baslik = baslik;
        this.yazar = yazar;
        this.yayinYili = yayinYili;
    }

    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }

    public String getBaslik() { return baslik; }
    public void setBaslik(String baslik) { this.baslik = baslik; }

    public String getYazar() { return yazar; }
    public void setYazar(String yazar) { this.yazar = yazar; }

    public int getYayinYili() { return yayinYili; }
    public void setYayinYili(int yayinYili) { this.yayinYili = yayinYili; }

    public String getKitapBilgisi() {
        return "ISBN: " + isbn + ", Başlık: " + baslik + ", Yazar: " + yazar + ", Yayın Yılı: " + yayinYili;
    }
}
    

