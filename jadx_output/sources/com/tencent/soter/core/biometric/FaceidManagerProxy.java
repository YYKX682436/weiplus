package com.tencent.soter.core.biometric;

/* loaded from: classes15.dex */
final class FaceidManagerProxy {
    public static final java.lang.String FACEMANAGER_FACTORY_CLASS_NAME = "com.tencent.soter.core.biometric.SoterFaceManagerFactory";
    private static final java.lang.String TAG = "Soter.FaceidManagerProxy";

    /* loaded from: classes15.dex */
    public static abstract class AuthenticationCallback {
        public void onAuthenticationError(int i17, java.lang.CharSequence charSequence) {
        }

        public void onAuthenticationFailed() {
        }

        public void onAuthenticationHelp(int i17, java.lang.CharSequence charSequence) {
        }

        public void onAuthenticationSucceeded(com.tencent.soter.core.biometric.FaceidManagerProxy.AuthenticationResult authenticationResult) {
        }
    }

    /* loaded from: classes15.dex */
    public static final class AuthenticationResult {
        private com.tencent.soter.core.biometric.FaceidManagerProxy.CryptoObject mCryptoObject;

        public AuthenticationResult(com.tencent.soter.core.biometric.FaceidManagerProxy.CryptoObject cryptoObject) {
            this.mCryptoObject = cryptoObject;
        }

        public com.tencent.soter.core.biometric.FaceidManagerProxy.CryptoObject getCryptoObject() {
            return this.mCryptoObject;
        }
    }

    public static void authenticate(android.content.Context context, com.tencent.soter.core.biometric.FaceidManagerProxy.CryptoObject cryptoObject, int i17, java.lang.Object obj, com.tencent.soter.core.biometric.FaceidManagerProxy.AuthenticationCallback authenticationCallback, android.os.Handler handler) {
        try {
            com.tencent.soter.core.biometric.FaceManager faceManager = getFaceManager(context);
            if (faceManager != null) {
                faceManager.authenticate(wrapCryptoObject(cryptoObject), (android.os.CancellationSignal) obj, i17, wrapCallback(authenticationCallback), handler);
            } else {
                zt5.h.b(TAG, "soter: facemanager is null in authenticate! Should never happen", new java.lang.Object[0]);
            }
        } catch (java.lang.Exception unused) {
            zt5.h.b(TAG, "soter: triggered SecurityException in authenticate! Make sure you declared USE_FACEID in AndroidManifest.xml", new java.lang.Object[0]);
        }
    }

    public static java.lang.String getBiometricName(android.content.Context context) {
        try {
            com.tencent.soter.core.biometric.FaceManager faceManager = getFaceManager(context);
            if (faceManager != null) {
                return faceManager.getBiometricName(context);
            }
            zt5.h.b(TAG, "soter: faceid manager is null! no biometric name returned.", new java.lang.Object[0]);
            return null;
        } catch (java.lang.Exception unused) {
            zt5.h.b(TAG, "soter: triggered SecurityException in getBiometricName! Make sure you declared USE_FACEID in AndroidManifest.xml", new java.lang.Object[0]);
            return null;
        }
    }

    private static com.tencent.soter.core.biometric.FaceManager getFaceManager(android.content.Context context) {
        try {
            return (com.tencent.soter.core.biometric.FaceManager) java.lang.Class.forName(FACEMANAGER_FACTORY_CLASS_NAME).getDeclaredMethod("getFaceManager", android.content.Context.class).invoke(null, context);
        } catch (java.lang.Exception e17) {
            zt5.h.b(TAG, "soter: FaceManager init failed, maybe not support." + e17.toString(), new java.lang.Object[0]);
            return null;
        }
    }

    public static boolean hasEnrolledFaceids(android.content.Context context) {
        try {
            com.tencent.soter.core.biometric.FaceManager faceManager = getFaceManager(context);
            if (faceManager != null) {
                return faceManager.hasEnrolledFaces();
            }
            zt5.h.b(TAG, "soter: facemanager is null in hasEnrolledBiometric! Should never happen", new java.lang.Object[0]);
            return false;
        } catch (java.lang.Exception unused) {
            zt5.h.b(TAG, "soter: triggered SecurityException in hasEnrolledBiometric! Make sure you declared USE_FACEID in AndroidManifest.xml", new java.lang.Object[0]);
            return false;
        }
    }

    public static boolean isHardwareDetected(android.content.Context context) {
        try {
            com.tencent.soter.core.biometric.FaceManager faceManager = getFaceManager(context);
            if (faceManager == null) {
                zt5.h.b(TAG, "soter: facemanager is null in isHardwareDetected! Should never happen", new java.lang.Object[0]);
                return false;
            }
            boolean isHardwareDetected = faceManager.isHardwareDetected();
            if (!isHardwareDetected) {
                zt5.i.a(104, "FaceManager.isHardwareDetected return false");
            }
            return isHardwareDetected;
        } catch (java.lang.Exception unused) {
            zt5.h.b(TAG, "soter: triggered SecurityException in isHardwareDetected! Make sure you declared USE_FACEID in AndroidManifest.xml", new java.lang.Object[0]);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.tencent.soter.core.biometric.FaceidManagerProxy.CryptoObject unwrapCryptoObject(com.tencent.soter.core.biometric.FaceManager.CryptoObject cryptoObject) {
        if (cryptoObject == null) {
            return null;
        }
        if (cryptoObject.getCipher() != null) {
            return new com.tencent.soter.core.biometric.FaceidManagerProxy.CryptoObject(cryptoObject.getCipher());
        }
        if (cryptoObject.getSignature() != null) {
            return new com.tencent.soter.core.biometric.FaceidManagerProxy.CryptoObject(cryptoObject.getSignature());
        }
        if (cryptoObject.getMac() != null) {
            return new com.tencent.soter.core.biometric.FaceidManagerProxy.CryptoObject(cryptoObject.getMac());
        }
        return null;
    }

    private static com.tencent.soter.core.biometric.FaceManager.AuthenticationCallback wrapCallback(final com.tencent.soter.core.biometric.FaceidManagerProxy.AuthenticationCallback authenticationCallback) {
        return new com.tencent.soter.core.biometric.FaceManager.AuthenticationCallback() { // from class: com.tencent.soter.core.biometric.FaceidManagerProxy.1
            @Override // com.tencent.soter.core.biometric.FaceManager.AuthenticationCallback
            public void onAuthenticationError(int i17, java.lang.CharSequence charSequence) {
                zt5.h.a(com.tencent.soter.core.biometric.FaceidManagerProxy.TAG, "hy: lowest level return onAuthenticationError", new java.lang.Object[0]);
                com.tencent.soter.core.biometric.FaceidManagerProxy.AuthenticationCallback.this.onAuthenticationError(i17, charSequence);
            }

            @Override // com.tencent.soter.core.biometric.FaceManager.AuthenticationCallback
            public void onAuthenticationFailed() {
                zt5.h.a(com.tencent.soter.core.biometric.FaceidManagerProxy.TAG, "hy: lowest level return onAuthenticationFailed", new java.lang.Object[0]);
                com.tencent.soter.core.biometric.FaceidManagerProxy.AuthenticationCallback.this.onAuthenticationFailed();
            }

            @Override // com.tencent.soter.core.biometric.FaceManager.AuthenticationCallback
            public void onAuthenticationHelp(int i17, java.lang.CharSequence charSequence) {
                zt5.h.a(com.tencent.soter.core.biometric.FaceidManagerProxy.TAG, "hy: lowest level return onAuthenticationHelp", new java.lang.Object[0]);
                com.tencent.soter.core.biometric.FaceidManagerProxy.AuthenticationCallback.this.onAuthenticationHelp(i17, charSequence);
            }

            @Override // com.tencent.soter.core.biometric.FaceManager.AuthenticationCallback
            public void onAuthenticationSucceeded(com.tencent.soter.core.biometric.FaceManager.AuthenticationResult authenticationResult) {
                zt5.h.a(com.tencent.soter.core.biometric.FaceidManagerProxy.TAG, "hy: lowest level return onAuthenticationSucceeded", new java.lang.Object[0]);
                com.tencent.soter.core.biometric.FaceidManagerProxy.AuthenticationCallback.this.onAuthenticationSucceeded(new com.tencent.soter.core.biometric.FaceidManagerProxy.AuthenticationResult(com.tencent.soter.core.biometric.FaceidManagerProxy.unwrapCryptoObject(authenticationResult.getCryptoObject())));
            }
        };
    }

    private static com.tencent.soter.core.biometric.FaceManager.CryptoObject wrapCryptoObject(com.tencent.soter.core.biometric.FaceidManagerProxy.CryptoObject cryptoObject) {
        if (cryptoObject == null) {
            return null;
        }
        if (cryptoObject.getCipher() != null) {
            return new com.tencent.soter.core.biometric.FaceManager.CryptoObject(cryptoObject.getCipher());
        }
        if (cryptoObject.getSignature() != null) {
            return new com.tencent.soter.core.biometric.FaceManager.CryptoObject(cryptoObject.getSignature());
        }
        if (cryptoObject.getMac() != null) {
            return new com.tencent.soter.core.biometric.FaceManager.CryptoObject(cryptoObject.getMac());
        }
        return null;
    }

    /* loaded from: classes15.dex */
    public static class CryptoObject {
        private final javax.crypto.Cipher mCipher;
        private final javax.crypto.Mac mMac;
        private final java.security.Signature mSignature;

        public CryptoObject(java.security.Signature signature) {
            this.mSignature = signature;
            this.mCipher = null;
            this.mMac = null;
        }

        public javax.crypto.Cipher getCipher() {
            return this.mCipher;
        }

        public javax.crypto.Mac getMac() {
            return this.mMac;
        }

        public java.security.Signature getSignature() {
            return this.mSignature;
        }

        public CryptoObject(javax.crypto.Cipher cipher) {
            this.mCipher = cipher;
            this.mSignature = null;
            this.mMac = null;
        }

        public CryptoObject(javax.crypto.Mac mac) {
            this.mMac = mac;
            this.mCipher = null;
            this.mSignature = null;
        }
    }
}
