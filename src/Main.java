package src;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== KÜTÜPHANE OTOMASYON SİSTEMİ TESTİ ===\n");

        // 1. Kitap Nesnesi Oluşturma
        Kitap kitap1 = new Kitap("978-975-07-1853-3", "Monte Kristo Kontu", "Alexandre Dumas", 1844);

        // 2. Kitap Kopyası Nesnesi Oluşturma (Kitap nesnesi ile ilişkilendiriliyor)
        KitapKopyasi kopya1 = new KitapKopyasi("KOPYA-001", "Rafta", kitap1);

        // 3. Kullanıcı Nesnesi Oluşturma
        Kullanici kullanici1 = new Kullanici("KUL-101", "Zeynep", "Özmen", "zeynep@example.com");

        // 4. Ödünç Kaydı Oluşturma (Kullanıcı ve Kitap Kopyası ile ilişkilendiriliyor)
        OduncKaydi odunc1 = new OduncKaydi("KAYIT-501", kullanici1, kopya1, "06.10.2026", "20.10.2026");

        // 5. Bilgileri Ekrana Yazdırma
        System.out.println("1. OLUŞTURULAN KİTAP:");
        System.out.println(kitap1.getKitapBilgisi());
        System.out.println();

        System.out.println("2. KİTAP KOPYASI:");
        System.out.println(kopya1.getKopyaBilgisi());
        System.out.println();

        System.out.println("3. KULLANICI BİLGİSİ:");
        System.out.println(kullanici1.getKullaniciBilgisi());
        System.out.println();

        System.out.println("4. ÖDÜNÇ İŞLEMİ DETAYI:");
        odunc1.kayitOzetiniYazdir();

        // Ödünç verildikten sonra kopyanın durumunu güncelleme testi
        kopya1.setDurum("Ödünç Verildi");
        System.out.println("\nGüncel Kopya Durumu: " + kopya1.getDurum());
    }
}

