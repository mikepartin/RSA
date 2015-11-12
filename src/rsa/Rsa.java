/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rsa;

import java.io.UnsupportedEncodingException;
import java.security.*;
import java.util.ArrayList;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/**
 *
 * @author Michael
 */
public class Rsa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException, SignatureException, UnsupportedEncodingException {
        
        Security mySecurity = new Security(1024);
        mySecurity.generateKeyPair();
        mySecurity.setEncryptPublicKey(mySecurity.getMyPublicKey());
        
        ArrayList<byte[]> encryptedData;
        encryptedData = mySecurity.encrypt("hello");
        
        System.out.println(mySecurity.encryptedToString(encryptedData));
        
        String decryptedString = mySecurity.decrypt(encryptedData);
        System.out.println(decryptedString);
    }
    
}
