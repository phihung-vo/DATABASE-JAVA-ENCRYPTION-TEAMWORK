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
public class Diem {
    private String mahp, tenhp;
    private float diemthi;
    
    public Diem(){}
    public Diem(String maHp, String tenHp, float diemThi){
        this.mahp = maHp;
        this.tenhp = tenHp;
        this.diemthi = diemThi;
    }
    
    public String getMahp(){
        return mahp;
    }
    public String getTenhp(){
        return tenhp;
    }
    public float getDiemthi(){
        return diemthi;
    }
}
