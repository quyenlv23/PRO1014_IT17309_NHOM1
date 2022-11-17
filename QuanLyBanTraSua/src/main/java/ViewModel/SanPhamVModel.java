
package ViewModel;


public class SanPhamVModel {
    private String ma;
    private String ten;
    private String donGia;
    private String vi;
    private String danhmuc;
    private String size;
    private String trangThai;

    public SanPhamVModel() {
    }

    public SanPhamVModel(String ma, String ten, String donGia, String vi, String danhmuc, String size, String trangThai) {
        this.ma = ma;
        this.ten = ten;
        this.donGia = donGia;
        this.vi = vi;
        this.danhmuc = danhmuc;
        this.size = size;
        this.trangThai = trangThai;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDonGia() {
        return donGia;
    }

    public void setDonGia(String donGia) {
        this.donGia = donGia;
    }

    public String getVi() {
        return vi;
    }

    public void setVi(String vi) {
        this.vi = vi;
    }

    public String getDanhmuc() {
        return danhmuc;
    }

    public void setDanhmuc(String danhmuc) {
        this.danhmuc = danhmuc;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "SanPhamVModel{" + "ma=" + ma + ", ten=" + ten + ", donGia=" + donGia + ", vi=" + vi + ", danhmuc=" + danhmuc + ", size=" + size + ", trangThai=" + trangThai + '}';
    }

    
    
}
