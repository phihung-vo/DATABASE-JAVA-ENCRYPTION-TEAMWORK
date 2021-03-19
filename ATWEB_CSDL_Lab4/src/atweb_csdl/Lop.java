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
public class Lop {
    private String malop, tenlop, tennv;
    private int slsv;
    
    public Lop(){}
    
    public Lop(String mL, String tL, String tenNV, int sl){
        this.malop = mL;
        this.tenlop = tL;
        this.tennv = tenNV;
        this.slsv = sl;
    }
    
    public String getMalop(){
        return malop;
    }
    public String getTenlop(){
        return tenlop;
    }
    public String getTennv(){
        return tennv;
    }
    public int getSlsv(){
        return slsv;
    }
}