/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atweb_csdl;

/**
 *
 * @author hungh
 */
public class Sinhvien {
    private String masv, hoten, ngaysinh, diachi, username, password;
    
    public Sinhvien(){}
    
    public Sinhvien(String maSv, String hoTen, String ngaySinh, String diaChi, String usn, String pw){
        this.masv = maSv;
        this.hoten = hoTen;
        this.ngaysinh = ngaySinh;
        this.diachi = diaChi;
        this.username = usn;
        this.password = pw;
    }
    
    public String getMasv(){
        return masv;
    }
    public String getHoten(){
        return hoten;
    }
    public String getNgaysinh(){
        return ngaysinh;
    }
    public String getDiachi(){
        return diachi;
    }
    public String getTenDnSv(){
        return username;
    }
    public String getMatkhau(){
        return password;
    }
}
