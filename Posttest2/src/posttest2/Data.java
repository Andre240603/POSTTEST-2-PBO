package posttest2;


class Data { // digunakan untuk menyimpan informasi tentang objek-objek yang dibuat dalam program.
    private String name; // atribut yang hanya bisa diakses di class yang sama
    private String tanggalBrg;
    private String HargaBeli;
    private String HargaJual;
    private String StokMasuk;

    // untuk membuat objek baru dari class dgn nilai atribut yang telah
    // diinisialisasi pada saat objek dibuat.
    public Data(String name, String tanggalBrg, String HargaBeli, String HargaJual, String StokMasuk) {
        this.name = name; // untuk menginisialisasi atribut "name"
        this.tanggalBrg = tanggalBrg;
        this.HargaBeli = HargaBeli;
        this.HargaJual = HargaJual;
        this.StokMasuk = StokMasuk;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the tanggalBrg
     */
    public String getTanggalBrg() {
        return tanggalBrg;
    }

    /**
     * @param tanggalBrg the tanggalBrg to set
     */
    public void setTanggalBrg(String tanggalBrg) {
        this.tanggalBrg = tanggalBrg;
    }

    /**
     * @return the HargaBeli
     */
    public String getHargaBeli() {
        return HargaBeli;
    }

    /**
     * @param HargaBeli the HargaBeli to set
     */
    public void setHargaBeli(String HargaBeli) {
        this.HargaBeli = HargaBeli;
    }

    /**
     * @return the HargaJual
     */
    public String getHargaJual() {
        return HargaJual;
    }

    /**
     * @param HargaJual the HargaJual to set
     */
    public void setHargaJual(String HargaJual) {
        this.HargaJual = HargaJual;
    }
    
     /**
     * @return the StokMasuk
     */
    public String getStokMasuk() {
        return StokMasuk;
    }

    /**
     * @param StokMasuk the StokMasuk to set
     */
    public void setStokMasuk(String StokMasuk) {
        this.StokMasuk = StokMasuk;
    }
    
}
