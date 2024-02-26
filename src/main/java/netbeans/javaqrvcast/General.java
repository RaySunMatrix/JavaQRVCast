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


class AESCipher extends CipherSpi {

    public static final class AES256_CFB_NoPadding extends OidImpl {

        public AES256_CFB_NoPadding(int keySize) {
            super(keySize);
        }


    }

    public static final class AES192_CFB_NoPadding extends OidImpl {

        public AES192_CFB_NoPadding(int keySize) {
            super(keySize);
        }


    }

    public static final class AES128_CFB_NoPadding extends OidImpl {

        public AES128_CFB_NoPadding(int keySize) {
            super(keySize);
        }


    }

    public static final class AES256_OFB_NoPadding extends OidImpl {

        public AES256_OFB_NoPadding(int keySize) {
            super(keySize);
        }


    }

    public static final class AES192_OFB_NoPadding extends OidImpl {

        public AES192_OFB_NoPadding(int keySize) {
            super(keySize);
        }


    }

    public static final class AES128_OFB_NoPadding extends OidImpl {

        public AES128_OFB_NoPadding(int keySize) {
            super(keySize);
        }


    }

    public static final class AES256_CBC_NoPadding extends OidImpl {

        public AES256_CBC_NoPadding(int keySize) {
            super(keySize);
        }


    }

    public static final class AES192_CBC_NoPadding extends OidImpl {

        public AES192_CBC_NoPadding(int keySize) {
            super(keySize);
        }


    }

    public static final class AES128_CBC_NoPadding extends OidImpl {

        public AES128_CBC_NoPadding(int keySize) {
            super(keySize);
        }


    }

    public static final class AES256_ECB_NoPadding extends OidImpl {

        public AES256_ECB_NoPadding(int keySize) {
            super(keySize);
        }


    }

    public static final class AES192_ECB_NoPadding extends OidImpl {

        public AES192_ECB_NoPadding(int keySize) {
            super(keySize);
        }


    }

    public static final class AES128_ECB_NoPadding extends OidImpl {

        public AES128_ECB_NoPadding(int keySize) {
            super(keySize);
        }


    }

    static class OidImpl extends AESCipher {

        public OidImpl(int keySize) {
            super(keySize);
        }

    }

    public static final class General extends AESCipher {

        public General(int keySize) {
            super(keySize);
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


    protected AESCipher(int keySize) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokespecial #43                 // Method javax/crypto/CipherSpi."<init>":()V
         * 4: aload_0
         * 5: new           #46                 // class com/sun/crypto/provider/CipherCore
         * 8: dup
         * 9: new           #48                 // class com/sun/crypto/provider/AESCrypt
         * 12: dup
         * 13: invokespecial #50                 // Method com/sun/crypto/provider/AESCrypt."<init>":()V
         * 16: bipush        16
         * 18: invokespecial #53                 // Method com/sun/crypto/provider/CipherCore."<init>":(Lcom/sun/crypto/provider/SymmetricCipher;I)V
         * 21: putfield      #56                 // Field core:Lcom/sun/crypto/provider/CipherCore;
         * 24: aload_0
         * 25: iload_1
         * 26: putfield      #62                 // Field fixedKeySize:I
         * 29: return
         *  */
        // </editor-fold>
    }

    @Override
    protected void engineSetMode(String mode) throws NoSuchAlgorithmException {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      #56                 // Field core:Lcom/sun/crypto/provider/CipherCore;
         * 4: aload_1
         * 5: invokevirtual #66                 // Method com/sun/crypto/provider/CipherCore.setMode:(Ljava/lang/String;)V
         * 8: return
         *  */
        // </editor-fold>
    }

    @Override
    protected void engineSetPadding(String paddingScheme) throws NoSuchPaddingException {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      #56                 // Field core:Lcom/sun/crypto/provider/CipherCore;
         * 4: aload_1
         * 5: invokevirtual #69                 // Method com/sun/crypto/provider/CipherCore.setPadding:(Ljava/lang/String;)V
         * 8: return
         *  */
        // </editor-fold>
    }

    @Override
    protected int engineGetBlockSize() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: bipush        16
         * 2: ireturn
         *  */
        // </editor-fold>
        return 0;
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: bipush        16
         * 2: ireturn
         *  */
        // </editor-fold>
    }

    @Override
    protected int engineGetOutputSize(int inputLen) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      #56                 // Field core:Lcom/sun/crypto/provider/CipherCore;
         * 4: iload_1
         * 5: invokevirtual #72                 // Method com/sun/crypto/provider/CipherCore.getOutputSize:(I)I
         * 8: ireturn
         *  */
        // </editor-fold>
        return 0;
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      #56                 // Field core:Lcom/sun/crypto/provider/CipherCore;
         * 4: iload_1
         * 5: invokevirtual #72                 // Method com/sun/crypto/provider/CipherCore.getOutputSize:(I)I
         * 8: ireturn
         *  */
        // </editor-fold>
    }

    @Override
    protected byte[] engineGetIV() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      #56                 // Field core:Lcom/sun/crypto/provider/CipherCore;
         * 4: invokevirtual #76                 // Method com/sun/crypto/provider/CipherCore.getIV:()[B
         * 7: areturn
         *  */
        // </editor-fold>
        return null;
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      #56                 // Field core:Lcom/sun/crypto/provider/CipherCore;
         * 4: invokevirtual #76                 // Method com/sun/crypto/provider/CipherCore.getIV:()[B
         * 7: areturn
         *  */
        // </editor-fold>
    }

    @Override
    protected AlgorithmParameters engineGetParameters() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      #56                 // Field core:Lcom/sun/crypto/provider/CipherCore;
         * 4: ldc           #79                 // String AES
         * 6: invokevirtual #81                 // Method com/sun/crypto/provider/CipherCore.getParameters:(Ljava/lang/String;)Ljava/security/AlgorithmParameters;
         * 9: areturn
         *  */
        // </editor-fold>
        return null;
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      #56                 // Field core:Lcom/sun/crypto/provider/CipherCore;
         * 4: ldc           #79                 // String AES
         * 6: invokevirtual #81                 // Method com/sun/crypto/provider/CipherCore.getParameters:(Ljava/lang/String;)Ljava/security/AlgorithmParameters;
         * 9: areturn
         *  */
        // </editor-fold>
    }

    @Override
    protected void engineInit(int opmode, Key key, SecureRandom random) throws InvalidKeyException {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_2
         * 1: aload_0
         * 2: getfield      #62                 // Field fixedKeySize:I
         * 5: invokestatic  #85                 // Method checkKeySize:(Ljava/security/Key;I)V
         * 8: aload_0
         * 9: getfield      #56                 // Field core:Lcom/sun/crypto/provider/CipherCore;
         * 12: iload_1
         * 13: aload_2
         * 14: aload_3
         * 15: invokevirtual #89                 // Method com/sun/crypto/provider/CipherCore.init:(ILjava/security/Key;Ljava/security/SecureRandom;)V
         * 18: return
         *  */
        // </editor-fold>
    }

    @Override
    protected void engineInit(int opmode, Key key, AlgorithmParameterSpec params, SecureRandom random) throws InvalidKeyException, InvalidAlgorithmParameterException {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_2
         * 1: aload_0
         * 2: getfield      #62                 // Field fixedKeySize:I
         * 5: invokestatic  #85                 // Method checkKeySize:(Ljava/security/Key;I)V
         * 8: aload_0
         * 9: getfield      #56                 // Field core:Lcom/sun/crypto/provider/CipherCore;
         * 12: iload_1
         * 13: aload_2
         * 14: aload_3
         * 15: aload         4
         * 17: invokevirtual #93                 // Method com/sun/crypto/provider/CipherCore.init:(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;Ljava/security/SecureRandom;)V
         * 20: return
         *  */
        // </editor-fold>
    }

    @Override
    protected void engineInit(int opmode, Key key, AlgorithmParameters params, SecureRandom random) throws InvalidKeyException, InvalidAlgorithmParameterException {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_2
         * 1: aload_0
         * 2: getfield      #62                 // Field fixedKeySize:I
         * 5: invokestatic  #85                 // Method checkKeySize:(Ljava/security/Key;I)V
         * 8: aload_0
         * 9: getfield      #56                 // Field core:Lcom/sun/crypto/provider/CipherCore;
         * 12: iload_1
         * 13: aload_2
         * 14: aload_3
         * 15: aload         4
         * 17: invokevirtual #96                 // Method com/sun/crypto/provider/CipherCore.init:(ILjava/security/Key;Ljava/security/AlgorithmParameters;Ljava/security/SecureRandom;)V
         * 20: return
         *  */
        // </editor-fold>
    }

    @Override
    protected byte[] engineUpdate(byte[] input, int inputOffset, int inputLen) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      #56                 // Field core:Lcom/sun/crypto/provider/CipherCore;
         * 4: aload_1
         * 5: iload_2
         * 6: iload_3
         * 7: invokevirtual #99                 // Method com/sun/crypto/provider/CipherCore.update:([BII)[B
         * 10: areturn
         *  */
        // </editor-fold>
        return null;
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      #56                 // Field core:Lcom/sun/crypto/provider/CipherCore;
         * 4: aload_1
         * 5: iload_2
         * 6: iload_3
         * 7: invokevirtual #99                 // Method com/sun/crypto/provider/CipherCore.update:([BII)[B
         * 10: areturn
         *  */
        // </editor-fold>
    }

    @Override
    protected int engineUpdate(byte[] input, int inputOffset, int inputLen, byte[] output, int outputOffset) throws ShortBufferException {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      #56                 // Field core:Lcom/sun/crypto/provider/CipherCore;
         * 4: aload_1
         * 5: iload_2
         * 6: iload_3
         * 7: aload         4
         * 9: iload         5
         * 11: invokevirtual #103                // Method com/sun/crypto/provider/CipherCore.update:([BII[BI)I
         * 14: ireturn
         *  */
        // </editor-fold>
        return 0;
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      #56                 // Field core:Lcom/sun/crypto/provider/CipherCore;
         * 4: aload_1
         * 5: iload_2
         * 6: iload_3
         * 7: aload         4
         * 9: iload         5
         * 11: invokevirtual #103                // Method com/sun/crypto/provider/CipherCore.update:([BII[BI)I
         * 14: ireturn
         *  */
        // </editor-fold>
    }

    @Override
    protected byte[] engineDoFinal(byte[] input, int inputOffset, int inputLen) throws IllegalBlockSizeException, BadPaddingException {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      #56                 // Field core:Lcom/sun/crypto/provider/CipherCore;
         * 4: aload_1
         * 5: iload_2
         * 6: iload_3
         * 7: invokevirtual #106                // Method com/sun/crypto/provider/CipherCore.doFinal:([BII)[B
         * 10: areturn
         *  */
        // </editor-fold>
        return null;
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      #56                 // Field core:Lcom/sun/crypto/provider/CipherCore;
         * 4: aload_1
         * 5: iload_2
         * 6: iload_3
         * 7: invokevirtual #106                // Method com/sun/crypto/provider/CipherCore.doFinal:([BII)[B
         * 10: areturn
         *  */
        // </editor-fold>
    }

    @Override
    protected int engineDoFinal(byte[] input, int inputOffset, int inputLen, byte[] output, int outputOffset) throws IllegalBlockSizeException, ShortBufferException, BadPaddingException {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      #56                 // Field core:Lcom/sun/crypto/provider/CipherCore;
         * 4: aload_1
         * 5: iload_2
         * 6: iload_3
         * 7: aload         4
         * 9: iload         5
         * 11: invokevirtual #109                // Method com/sun/crypto/provider/CipherCore.doFinal:([BII[BI)I
         * 14: ireturn
         *  */
        // </editor-fold>
        return 0;
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      #56                 // Field core:Lcom/sun/crypto/provider/CipherCore;
         * 4: aload_1
         * 5: iload_2
         * 6: iload_3
         * 7: aload         4
         * 9: iload         5
         * 11: invokevirtual #109                // Method com/sun/crypto/provider/CipherCore.doFinal:([BII[BI)I
         * 14: ireturn
         *  */
        // </editor-fold>
    }

    @Override
    protected int engineGetKeySize(Key key) throws InvalidKeyException {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_1
         * 1: invokeinterface #9,  1            // InterfaceMethod java/security/Key.getEncoded:()[B
         * 6: astore_2
         * 7: aload_2
         * 8: iconst_0
         * 9: invokestatic  #17                 // Method java/util/Arrays.fill:([BB)V
         * 12: aload_2
         * 13: arraylength
         * 14: invokestatic  #111                // Method com/sun/crypto/provider/AESCrypt.isKeySizeValid:(I)Z
         * 17: ifne          53
         * 20: new           #1                  // class java/security/InvalidKeyException
         * 23: dup
         * 24: new           #23                 // class java/lang/StringBuilder
         * 27: dup
         * 28: invokespecial #25                 // Method java/lang/StringBuilder."<init>":()V
         * 31: ldc           #115                // String Invalid AES key length:
         * 33: invokevirtual #30                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 36: aload_2
         * 37: arraylength
         * 38: invokevirtual #34                 // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
         * 41: ldc           #37                 // String  bytes
         * 43: invokevirtual #30                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 46: invokevirtual #39                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
         * 49: invokespecial #5                  // Method java/security/InvalidKeyException."<init>":(Ljava/lang/String;)V
         * 52: athrow
         * 53: aload_2
         * 54: arraylength
         * 55: bipush        8
         * 57: invokestatic  #117                // Method java/lang/Math.multiplyExact:(II)I
         * 60: ireturn
         *  */
        // </editor-fold>
        return 0;
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_1
         * 1: invokeinterface #9,  1            // InterfaceMethod java/security/Key.getEncoded:()[B
         * 6: astore_2
         * 7: aload_2
         * 8: iconst_0
         * 9: invokestatic  #17                 // Method java/util/Arrays.fill:([BB)V
         * 12: aload_2
         * 13: arraylength
         * 14: invokestatic  #111                // Method com/sun/crypto/provider/AESCrypt.isKeySizeValid:(I)Z
         * 17: ifne          53
         * 20: new           #1                  // class java/security/InvalidKeyException
         * 23: dup
         * 24: new           #23                 // class java/lang/StringBuilder
         * 27: dup
         * 28: invokespecial #25                 // Method java/lang/StringBuilder."<init>":()V
         * 31: ldc           #115                // String Invalid AES key length:
         * 33: invokevirtual #30                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 36: aload_2
         * 37: arraylength
         * 38: invokevirtual #34                 // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
         * 41: ldc           #37                 // String  bytes
         * 43: invokevirtual #30                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 46: invokevirtual #39                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
         * 49: invokespecial #5                  // Method java/security/InvalidKeyException."<init>":(Ljava/lang/String;)V
         * 52: athrow
         * 53: aload_2
         * 54: arraylength
         * 55: bipush        8
         * 57: invokestatic  #117                // Method java/lang/Math.multiplyExact:(II)I
         * 60: ireturn
         *  */
        // </editor-fold>
    }

    @Override
    protected byte[] engineWrap(Key key) throws IllegalBlockSizeException, InvalidKeyException {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      #56                 // Field core:Lcom/sun/crypto/provider/CipherCore;
         * 4: aload_1
         * 5: invokevirtual #123                // Method com/sun/crypto/provider/CipherCore.wrap:(Ljava/security/Key;)[B
         * 8: areturn
         *  */
        // </editor-fold>
        return null;
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      #56                 // Field core:Lcom/sun/crypto/provider/CipherCore;
         * 4: aload_1
         * 5: invokevirtual #123                // Method com/sun/crypto/provider/CipherCore.wrap:(Ljava/security/Key;)[B
         * 8: areturn
         *  */
        // </editor-fold>
    }

    @Override
    protected Key engineUnwrap(byte[] wrappedKey, String wrappedKeyAlgorithm, int wrappedKeyType) throws InvalidKeyException, NoSuchAlgorithmException {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      #56                 // Field core:Lcom/sun/crypto/provider/CipherCore;
         * 4: aload_1
         * 5: aload_2
         * 6: iload_3
         * 7: invokevirtual #127                // Method com/sun/crypto/provider/CipherCore.unwrap:([BLjava/lang/String;I)Ljava/security/Key;
         * 10: areturn
         *  */
        // </editor-fold>
        return null;
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      #56                 // Field core:Lcom/sun/crypto/provider/CipherCore;
         * 4: aload_1
         * 5: aload_2
         * 6: iload_3
         * 7: invokevirtual #127                // Method com/sun/crypto/provider/CipherCore.unwrap:([BLjava/lang/String;I)Ljava/security/Key;
         * 10: areturn
         *  */
        // </editor-fold>
    }
}
