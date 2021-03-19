/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atweb_csdl;

import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


/**
 *
 * @author Admin
 */
public class Services {
    
   public File createFolder(String folderName){
       File file = null;       
       File folder = new File(folderName);
       if (!folder.exists()) {
           if (folder.mkdir()) {
               System.out.println("Directory is created!");
               
           }
       }else {
           System.out.println("Failed to create directory!");
           
       }
    
  return file;
   }
   
   
    public File createFile(String folderName,String fileName,String extension){
        File file = null;
        try {

            file = new File(folderName+"\\"+fileName+"."+extension);

            if (file.createNewFile()) {
                System.out.println("File is created!");
            } else {
                System.out.println("File already exists.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }
  
    public  String convertByteToHex(byte[] data) {
    StringBuffer sb = new StringBuffer();
    for (int i = 0; i < data.length; i++) {
      sb.append(Integer.toString((data[i] & 0xff) + 0x100, 16).substring(1));
    }
    return sb.toString();
  }

    public  String getSHAHash(String input,String hashName) {
        try {
            MessageDigest md = MessageDigest.getInstance(hashName);
            byte[] messageDigest = md.digest(input.getBytes());
            return convertByteToHex(messageDigest);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

  
}
        
