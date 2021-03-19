/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atweb_csdl;

/**
 *
 * @author Admin
 */
public class NhanVien {
  private String maNV, hoTen, email, luong, tenDN, matKhau;  
  public NhanVien(){}
  public NhanVien(String maNV,String hoTen,String email,String luong,String tenDN,String matKhau){
  this.email = email;
  this.hoTen = hoTen;
  this.luong = luong;
  this.maNV = maNV;
  this.matKhau = matKhau;
  this.tenDN = tenDN;
  
  
  }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLuong() {
        return luong;
    }

    public void setLuong(String luong) {
        this.luong = luong;
    }

    public String getTenDN() {
        return tenDN;
    }

    public void setTenDN(String tenDN) {
        this.tenDN = tenDN;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }
  
    
}
