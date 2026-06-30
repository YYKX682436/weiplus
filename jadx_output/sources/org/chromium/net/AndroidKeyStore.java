package org.chromium.net;

@org.chromium.base.annotations.JNINamespace("net::android")
/* loaded from: classes7.dex */
public class AndroidKeyStore {
    private static final java.lang.String TAG = "AndroidKeyStore";

    private static byte[] encryptWithPrivateKey(java.security.PrivateKey privateKey, java.lang.String str, byte[] bArr) {
        try {
            javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance(str);
            try {
                cipher.init(1, privateKey);
                return cipher.doFinal(bArr);
            } catch (java.lang.Exception e17) {
                org.chromium.base.Log.e(TAG, "Exception while encrypting input with " + str + " and " + privateKey.getAlgorithm() + " private key (" + privateKey.getClass().getName() + "): " + e17);
                return null;
            }
        } catch (java.security.NoSuchAlgorithmException | javax.crypto.NoSuchPaddingException e18) {
            org.chromium.base.Log.e(TAG, "Cipher " + str + " not supported: " + e18);
            return null;
        }
    }

    private static java.lang.String getPrivateKeyClassName(java.security.PrivateKey privateKey) {
        return privateKey.getClass().getName();
    }

    private static boolean privateKeySupportsCipher(java.security.PrivateKey privateKey, java.lang.String str) {
        try {
            javax.crypto.Cipher.getInstance(str).init(1, privateKey);
            return true;
        } catch (java.security.InvalidKeyException | java.security.NoSuchAlgorithmException | javax.crypto.NoSuchPaddingException unused) {
            return false;
        } catch (java.lang.Exception e17) {
            org.chromium.base.Log.e(TAG, "Exception while checking support for " + str + ": " + e17);
            return false;
        }
    }

    private static boolean privateKeySupportsSignature(java.security.PrivateKey privateKey, java.lang.String str) {
        try {
            java.security.Signature.getInstance(str).initSign(privateKey);
            return true;
        } catch (java.security.InvalidKeyException | java.security.NoSuchAlgorithmException unused) {
            return false;
        } catch (java.lang.Exception e17) {
            org.chromium.base.Log.e(TAG, "Exception while checking support for " + str + ": " + e17);
            return false;
        }
    }

    private static byte[] signWithPrivateKey(java.security.PrivateKey privateKey, java.lang.String str, byte[] bArr) {
        try {
            java.security.Signature signature = java.security.Signature.getInstance(str);
            try {
                signature.initSign(privateKey);
                signature.update(bArr);
                return signature.sign();
            } catch (java.lang.Exception e17) {
                org.chromium.base.Log.e(TAG, "Exception while signing message with " + str + " and " + privateKey.getAlgorithm() + " private key (" + privateKey.getClass().getName() + "): " + e17);
                return null;
            }
        } catch (java.security.NoSuchAlgorithmException e18) {
            org.chromium.base.Log.e(TAG, "Signature algorithm " + str + " not supported: " + e18);
            return null;
        }
    }
}
