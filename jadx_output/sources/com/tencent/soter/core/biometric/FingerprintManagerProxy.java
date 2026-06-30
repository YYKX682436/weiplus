package com.tencent.soter.core.biometric;

/* loaded from: classes15.dex */
final class FingerprintManagerProxy {
    public static final java.lang.String FINGERPRINT_SERVICE = "fingerprint";
    private static final java.lang.String TAG = "Soter.FingerprintManagerProxy";
    public static boolean sCLOSE_API31;

    /* loaded from: classes15.dex */
    public static abstract class AuthenticationCallback {
        public void onAuthenticationError(int i17, java.lang.CharSequence charSequence) {
        }

        public void onAuthenticationFailed() {
        }

        public void onAuthenticationHelp(int i17, java.lang.CharSequence charSequence) {
        }

        public void onAuthenticationSucceeded(com.tencent.soter.core.biometric.FingerprintManagerProxy.AuthenticationResultInternal authenticationResultInternal) {
        }
    }

    /* loaded from: classes15.dex */
    public static final class AuthenticationResultInternal {
        private com.tencent.soter.core.biometric.FingerprintManagerProxy.CryptoObject mCryptoObject;

        public AuthenticationResultInternal(com.tencent.soter.core.biometric.FingerprintManagerProxy.CryptoObject cryptoObject) {
            this.mCryptoObject = cryptoObject;
        }

        public com.tencent.soter.core.biometric.FingerprintManagerProxy.CryptoObject getCryptoObject() {
            return this.mCryptoObject;
        }
    }

    public static void authenticate(android.content.Context context, com.tencent.soter.core.biometric.FingerprintManagerProxy.CryptoObject cryptoObject, int i17, java.lang.Object obj, com.tencent.soter.core.biometric.FingerprintManagerProxy.AuthenticationCallback authenticationCallback, android.os.Handler handler, android.os.Bundle bundle) {
        boolean z17 = bundle.getBoolean("use_biometric_prompt");
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        int i18 = android.os.Build.VERSION.SDK_INT;
        zt5.h.c(TAG, "use_biometric_prompt: %s, sdk_version: %s", valueOf, java.lang.Integer.valueOf(i18));
        if (!z17 || i18 < 28) {
            authenticateLegacy(context, cryptoObject, i17, obj, authenticationCallback, handler);
        } else {
            authenticateApi28(context, cryptoObject, i17, obj, authenticationCallback, handler, bundle);
        }
    }

    private static void authenticateApi28(android.content.Context context, com.tencent.soter.core.biometric.FingerprintManagerProxy.CryptoObject cryptoObject, int i17, java.lang.Object obj, final com.tencent.soter.core.biometric.FingerprintManagerProxy.AuthenticationCallback authenticationCallback, android.os.Handler handler, android.os.Bundle bundle) {
        if (checkSelfPermission(context, "android.permission.USE_BIOMETRIC") != 0) {
            zt5.h.b(TAG, "soter: permission check failed: authenticate", new java.lang.Object[0]);
            return;
        }
        android.hardware.biometrics.BiometricPrompt.Builder builder = new android.hardware.biometrics.BiometricPrompt.Builder(context);
        builder.setDeviceCredentialAllowed(false);
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            builder.setAllowedAuthenticators(15);
        }
        builder.setTitle(bundle.getString("prompt_title"));
        builder.setSubtitle(bundle.getString("prompt_subtitle"));
        builder.setDescription(bundle.getString("prompt_description"));
        java.lang.String string = bundle.getString("prompt_button");
        if (android.text.TextUtils.isEmpty(string)) {
            string = context.getString(android.R.string.cancel);
        }
        builder.setNegativeButton(string, context.getMainExecutor(), new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.soter.core.biometric.FingerprintManagerProxy.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(android.content.DialogInterface dialogInterface, int i18) {
                com.tencent.soter.core.biometric.FingerprintManagerProxy.AuthenticationCallback.this.onAuthenticationError(10310, "click negative button");
            }
        });
        zt5.h.c(TAG, "call system build().authenticate", new java.lang.Object[0]);
        builder.build().authenticate((android.os.CancellationSignal) obj, context.getMainExecutor(), wrapCallback2(authenticationCallback));
    }

    private static void authenticateLegacy(android.content.Context context, com.tencent.soter.core.biometric.FingerprintManagerProxy.CryptoObject cryptoObject, int i17, java.lang.Object obj, com.tencent.soter.core.biometric.FingerprintManagerProxy.AuthenticationCallback authenticationCallback, android.os.Handler handler) {
        if (checkSelfPermission(context, "android.permission.USE_FINGERPRINT") != 0) {
            zt5.h.b(TAG, "soter: permission check failed: authenticate", new java.lang.Object[0]);
            return;
        }
        try {
            android.hardware.fingerprint.FingerprintManager fingerprintManager = getFingerprintManager(context);
            if (fingerprintManager != null) {
                zt5.h.c(TAG, "call system authenticate", new java.lang.Object[0]);
                fingerprintManager.authenticate(wrapCryptoObject(cryptoObject), (android.os.CancellationSignal) obj, i17, wrapCallback(authenticationCallback), handler);
            } else {
                zt5.h.b(TAG, "soter: fingerprint manager is null in authenticate! Should never happen", new java.lang.Object[0]);
            }
        } catch (java.lang.SecurityException unused) {
            zt5.h.b(TAG, "soter: triggered SecurityException in authenticate! Make sure you declared USE_FINGERPRINT in AndroidManifest.xml", new java.lang.Object[0]);
        }
    }

    private static int checkSelfPermission(android.content.Context context, java.lang.String str) {
        if (context == null) {
            zt5.h.b(TAG, "soter: check self permission: context is null", new java.lang.Object[0]);
            return -1;
        }
        if (!zt5.l.b(str)) {
            return context.checkSelfPermission(str);
        }
        zt5.h.b(TAG, "soter: requested permission is null or nil", new java.lang.Object[0]);
        return -1;
    }

    private static android.hardware.fingerprint.FingerprintManager getFingerprintManager(android.content.Context context) {
        return (android.hardware.fingerprint.FingerprintManager) context.getSystemService(FINGERPRINT_SERVICE);
    }

    public static boolean hasEnrolledFingerprints(android.content.Context context) {
        if (checkSelfPermission(context, "android.permission.USE_FINGERPRINT") != 0) {
            zt5.h.b(TAG, "soter: permission check failed: hasEnrolledBiometric", new java.lang.Object[0]);
            return false;
        }
        try {
            android.hardware.fingerprint.FingerprintManager fingerprintManager = getFingerprintManager(context);
            if (fingerprintManager != null) {
                return fingerprintManager.hasEnrolledFingerprints();
            }
            zt5.h.b(TAG, "soter: fingerprint manager is null in hasEnrolledBiometric! Should never happen", new java.lang.Object[0]);
            return false;
        } catch (java.lang.SecurityException unused) {
            zt5.h.b(TAG, "soter: triggered SecurityException in hasEnrolledBiometric! Make sure you declared USE_FINGERPRINT in AndroidManifest.xml", new java.lang.Object[0]);
            return false;
        }
    }

    public static boolean isHardwareDetected(android.content.Context context) {
        if (checkSelfPermission(context, "android.permission.USE_FINGERPRINT") != 0) {
            zt5.h.b(TAG, "soter: permission check failed: isHardwareDetected", new java.lang.Object[0]);
            return false;
        }
        try {
            android.hardware.fingerprint.FingerprintManager fingerprintManager = getFingerprintManager(context);
            if (fingerprintManager == null) {
                zt5.h.b(TAG, "soter: fingerprint manager is null in isHardwareDetected! Should never happen", new java.lang.Object[0]);
                return false;
            }
            boolean isHardwareDetected = fingerprintManager.isHardwareDetected();
            if (!isHardwareDetected) {
                zt5.i.a(104, "FingerprintManager.isHardwareDetected return false");
            }
            return isHardwareDetected;
        } catch (java.lang.SecurityException unused) {
            zt5.h.b(TAG, "soter: triggered SecurityException in isHardwareDetected! Make sure you declared USE_FINGERPRINT in AndroidManifest.xml", new java.lang.Object[0]);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.tencent.soter.core.biometric.FingerprintManagerProxy.CryptoObject unwrapCryptoObject(android.hardware.fingerprint.FingerprintManager.CryptoObject cryptoObject) {
        if (cryptoObject == null) {
            return null;
        }
        if (cryptoObject.getCipher() != null) {
            return new com.tencent.soter.core.biometric.FingerprintManagerProxy.CryptoObject(cryptoObject.getCipher());
        }
        if (cryptoObject.getSignature() != null) {
            return new com.tencent.soter.core.biometric.FingerprintManagerProxy.CryptoObject(cryptoObject.getSignature());
        }
        if (cryptoObject.getMac() != null) {
            return new com.tencent.soter.core.biometric.FingerprintManagerProxy.CryptoObject(cryptoObject.getMac());
        }
        return null;
    }

    private static android.hardware.fingerprint.FingerprintManager.AuthenticationCallback wrapCallback(final com.tencent.soter.core.biometric.FingerprintManagerProxy.AuthenticationCallback authenticationCallback) {
        return new android.hardware.fingerprint.FingerprintManager.AuthenticationCallback() { // from class: com.tencent.soter.core.biometric.FingerprintManagerProxy.2
            @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
            public void onAuthenticationError(int i17, java.lang.CharSequence charSequence) {
                zt5.h.a(com.tencent.soter.core.biometric.FingerprintManagerProxy.TAG, "hy: lowest level return onAuthenticationError", new java.lang.Object[0]);
                com.tencent.soter.core.biometric.FingerprintManagerProxy.AuthenticationCallback.this.onAuthenticationError(i17, charSequence);
            }

            @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
            public void onAuthenticationFailed() {
                zt5.h.a(com.tencent.soter.core.biometric.FingerprintManagerProxy.TAG, "hy: lowest level return onAuthenticationFailed", new java.lang.Object[0]);
                com.tencent.soter.core.biometric.FingerprintManagerProxy.AuthenticationCallback.this.onAuthenticationFailed();
            }

            @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
            public void onAuthenticationHelp(int i17, java.lang.CharSequence charSequence) {
                zt5.h.a(com.tencent.soter.core.biometric.FingerprintManagerProxy.TAG, "hy: lowest level return onAuthenticationHelp", new java.lang.Object[0]);
                com.tencent.soter.core.biometric.FingerprintManagerProxy.AuthenticationCallback.this.onAuthenticationHelp(i17, charSequence);
            }

            @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
            public void onAuthenticationSucceeded(android.hardware.fingerprint.FingerprintManager.AuthenticationResult authenticationResult) {
                zt5.h.a(com.tencent.soter.core.biometric.FingerprintManagerProxy.TAG, "hy: lowest level return onAuthenticationSucceeded", new java.lang.Object[0]);
                com.tencent.soter.core.biometric.FingerprintManagerProxy.AuthenticationCallback.this.onAuthenticationSucceeded(new com.tencent.soter.core.biometric.FingerprintManagerProxy.AuthenticationResultInternal(com.tencent.soter.core.biometric.FingerprintManagerProxy.unwrapCryptoObject(authenticationResult.getCryptoObject())));
            }
        };
    }

    private static android.hardware.biometrics.BiometricPrompt.AuthenticationCallback wrapCallback2(final com.tencent.soter.core.biometric.FingerprintManagerProxy.AuthenticationCallback authenticationCallback) {
        return new android.hardware.biometrics.BiometricPrompt.AuthenticationCallback() { // from class: com.tencent.soter.core.biometric.FingerprintManagerProxy.3
            @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
            public void onAuthenticationError(int i17, java.lang.CharSequence charSequence) {
                com.tencent.soter.core.biometric.FingerprintManagerProxy.AuthenticationCallback.this.onAuthenticationError(i17, charSequence);
            }

            @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
            public void onAuthenticationFailed() {
                com.tencent.soter.core.biometric.FingerprintManagerProxy.AuthenticationCallback.this.onAuthenticationFailed();
            }

            @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
            public void onAuthenticationHelp(int i17, java.lang.CharSequence charSequence) {
                com.tencent.soter.core.biometric.FingerprintManagerProxy.AuthenticationCallback.this.onAuthenticationHelp(i17, charSequence);
            }

            @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
            public void onAuthenticationSucceeded(android.hardware.biometrics.BiometricPrompt.AuthenticationResult authenticationResult) {
                com.tencent.soter.core.biometric.FingerprintManagerProxy.AuthenticationCallback.this.onAuthenticationSucceeded(new com.tencent.soter.core.biometric.FingerprintManagerProxy.AuthenticationResultInternal(com.tencent.soter.core.biometric.FingerprintManagerProxy.unwrapCryptoObject(authenticationResult.getCryptoObject())));
            }
        };
    }

    private static android.hardware.fingerprint.FingerprintManager.CryptoObject wrapCryptoObject(com.tencent.soter.core.biometric.FingerprintManagerProxy.CryptoObject cryptoObject) {
        if (cryptoObject == null) {
            return null;
        }
        if (cryptoObject.getCipher() != null) {
            return new android.hardware.fingerprint.FingerprintManager.CryptoObject(cryptoObject.getCipher());
        }
        if (cryptoObject.getSignature() != null) {
            return new android.hardware.fingerprint.FingerprintManager.CryptoObject(cryptoObject.getSignature());
        }
        if (cryptoObject.getMac() != null) {
            return new android.hardware.fingerprint.FingerprintManager.CryptoObject(cryptoObject.getMac());
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

    /* JADX INFO: Access modifiers changed from: private */
    public static com.tencent.soter.core.biometric.FingerprintManagerProxy.CryptoObject unwrapCryptoObject(android.hardware.biometrics.BiometricPrompt.CryptoObject cryptoObject) {
        if (cryptoObject == null) {
            return null;
        }
        if (cryptoObject.getCipher() != null) {
            return new com.tencent.soter.core.biometric.FingerprintManagerProxy.CryptoObject(cryptoObject.getCipher());
        }
        if (cryptoObject.getSignature() != null) {
            return new com.tencent.soter.core.biometric.FingerprintManagerProxy.CryptoObject(cryptoObject.getSignature());
        }
        if (cryptoObject.getMac() != null) {
            return new com.tencent.soter.core.biometric.FingerprintManagerProxy.CryptoObject(cryptoObject.getMac());
        }
        return null;
    }
}
