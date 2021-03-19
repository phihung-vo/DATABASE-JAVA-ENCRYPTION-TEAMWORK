/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atweb_csdl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/**
 *
 * @author Admin
 */
public class RSAGenerator {
    private final String name;
    private final String private_key_name;
    
    public RSAGenerator(String name,String private_key_name ){
        this.name = name;
        this.private_key_name = private_key_name;

    }
    
    public void initKey(){
        try {
            SecureRandom sr = new SecureRandom();
            // Thuật toán phát sinh khóa - RSA
            // Độ dài khóa 1024(bits), độ dài khóa này quyết định đến độ an toàn của khóa, càng lớn thì càng an toàn
            // Demo chỉ sử dụng 1024 bit. Nhưng theo khuyến cáo thì độ dài khóa nên tối thiểu là 2048
            KeyPairGenerator kpg = KeyPairGenerator.getInstance("RSA");
            kpg.initialize(512, sr);

            // Khởi tạo cặp khóa
            KeyPair kp = kpg.genKeyPair();
            // PublicKey
            PublicKey publicKey = kp.getPublic();
            // PrivateKey
            PrivateKey privateKey = kp.getPrivate();
            Services sv = new Services();
            ///tao file
            sv.createFolder("StaffPubKey\\" + name);                  
            File publicKeyFile = createKeyFile(sv.createFile("StaffPubKey\\" + name,"publicKey", "rsa"));
            File privateKeyFile = createKeyFile(sv.createFile("StaffPubKey\\" + name,private_key_name, "rsa"));

            // Lưu Public Key
            FileOutputStream fos = new FileOutputStream(publicKeyFile);
            fos.write(publicKey.getEncoded());
            fos.close();

            // Lưu Private Key
            fos = new FileOutputStream(privateKeyFile);
            fos.write(privateKey.getEncoded());
            fos.close();

                System.out.println("Generate key successfully");
        } catch (IOException | NoSuchAlgorithmException ex) {
                System.out.println(ex.getMessage());
        }
    }
    
    private static File createKeyFile(File file) throws IOException {
            if (!file.exists()) {
                    file.createNewFile();
            } else {
                    file.delete();
                    file.createNewFile();
            }
            return file;
    }
    
    public String encrypt(String text){
        String strEncrypt = null;
        try {
                // Đọc file chứa public key
                FileInputStream fis = new FileInputStream("StaffPubKey\\" + name +"\\publicKey.rsa");
                byte[] b = new byte[fis.available()];
                fis.read(b);
                fis.close();

                // Tạo public key
                X509EncodedKeySpec spec = new X509EncodedKeySpec(b);
                KeyFactory factory = KeyFactory.getInstance("RSA");
                PublicKey pubKey = factory.generatePublic(spec);

                // Mã hoá dữ liệu
                Cipher c = Cipher.getInstance("RSA");
                c.init(Cipher.ENCRYPT_MODE, pubKey);

                byte encryptOut[] = c.doFinal(text.getBytes());
                strEncrypt = Base64.getEncoder().encodeToString(encryptOut);
                System.out.println("Chuỗi sau khi mã hoá: " + strEncrypt);

        } catch (IOException | InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException ex) {
            System.out.println(ex.getMessage());
        }
        return strEncrypt;
    }
    
    public String decrypt(String encrypt_text){
        byte decryptOut[] = null;
        try {
            // Đọc file chứa private key
            FileInputStream fis = new FileInputStream("StaffPubKey\\" + name +"\\"+private_key_name+".rsa");
            byte[] b = new byte[fis.available()];
            fis.read(b);
            fis.close();

            // Tạo private key
            PKCS8EncodedKeySpec spec = new PKCS8EncodedKeySpec(b);
            KeyFactory factory = KeyFactory.getInstance("RSA");
            PrivateKey priKey = factory.generatePrivate(spec);
            
            // Giải mã dữ liệu
            Cipher c = Cipher.getInstance("RSA");
            c.init(Cipher.DECRYPT_MODE, priKey);
            decryptOut = c.doFinal(Base64.getDecoder().decode(encrypt_text));
            System.out.println("Dữ liệu sau khi giải mã: " + new String(decryptOut));
        } catch (IOException | InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException ex) {
            System.out.println(ex.getMessage());
        }
        return new String(decryptOut);
    }    
    
}
    

