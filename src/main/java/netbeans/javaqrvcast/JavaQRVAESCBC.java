/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package netbeans.javaqrvcast;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.CipherSpi;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;

/**
 *
 * @author admin
 */
public class JavaQRVAESCBC extends CipherSpi {

    @Override
    protected void engineSetMode(String string) throws NoSuchAlgorithmException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected void engineSetPadding(String string) throws NoSuchPaddingException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected int engineGetBlockSize() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected int engineGetOutputSize(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected byte[] engineGetIV() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected AlgorithmParameters engineGetParameters() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected void engineInit(int i, Key key, SecureRandom sr) throws InvalidKeyException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected void engineInit(int i, Key key, AlgorithmParameterSpec aps, SecureRandom sr) throws InvalidKeyException, InvalidAlgorithmParameterException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected void engineInit(int i, Key key, AlgorithmParameters ap, SecureRandom sr) throws InvalidKeyException, InvalidAlgorithmParameterException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected byte[] engineUpdate(byte[] bytes, int i, int i1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected int engineUpdate(byte[] bytes, int i, int i1, byte[] bytes1, int i2) throws ShortBufferException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected byte[] engineDoFinal(byte[] bytes, int i, int i1) throws IllegalBlockSizeException, BadPaddingException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected int engineDoFinal(byte[] bytes, int i, int i1, byte[] bytes1, int i2) throws ShortBufferException, IllegalBlockSizeException, BadPaddingException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}


 
   
    // <editor-fold defaultstate="collapsed" desc="Compiled Code">
    /* 0: iload_1
     * 1: iconst_m1
     * 2: if_icmpeq     83
     * 5: aload_0
     * 6: ifnonnull     19
     * 9: new           #1                  // class java/security/InvalidKeyException
     * 12: dup
     * 13: ldc           #3                  // String The key must not be null
     * 15: invokespecial #5                  // Method java/security/InvalidKeyException."<init>":(Ljava/lang/String;)V
     * 18: athrow
     * 19: aload_0
     * 20: invokeinterface #9,  1            // InterfaceMethod java/security/Key.getEncoded:()[B
     * 25: astore_2
     * 26: aload_2
     * 27: ifnonnull     40
     * 30: new           #1                  // class java/security/InvalidKeyException
     * 33: dup
     * 34: ldc           #15                 // String Key encoding must not be null
     * 36: invokespecial #5                  // Method java/security/InvalidKeyException."<init>":(Ljava/lang/String;)V
     * 39: athrow
     * 40: aload_2
     * 41: iconst_0
     * 42: invokestatic  #17                 // Method java/util/Arrays.fill:([BB)V
     * 45: aload_2
     * 46: arraylength
     * 47: iload_1
     * 48: if_icmpeq     83
     * 51: new           #1                  // class java/security/InvalidKeyException
     * 54: dup
     * 55: new           #23                 // class java/lang/StringBuilder
     * 58: dup
     * 59: invokespecial #25                 // Method java/lang/StringBuilder."<init>":()V
     * 62: ldc           #28                 // String The key must be
     * 64: invokevirtual #30                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     * 67: iload_1
     * 68: invokevirtual #34                 // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
     * 71: ldc           #37                 // String  bytes
     * 73: invokevirtual #30                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     * 76: invokevirtual #39                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     * 79: invokespecial #5                  // Method java/security/InvalidKeyException."<init>":(Ljava/lang/String;)V
     * 82: athrow
     * 83: return
     *  */
    // </editor-fold>


  
  


