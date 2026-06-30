package com.tencent.soter.core.biometric;

/* loaded from: classes15.dex */
public class BiometricManagerCompat {
    static final java.util.Map<java.lang.Integer, com.tencent.soter.core.biometric.BiometricManagerCompat.IBiometricManager> IMPL_PROVIDER = new java.util.HashMap();
    private static final java.lang.String TAG = "Soter.BiometricManagerCompat";
    private java.lang.Integer mBiometricType;
    private android.content.Context mContext;

    /* loaded from: classes15.dex */
    public static abstract class AuthenticationCallback {
        public void onAuthenticationCancelled() {
        }

        public void onAuthenticationError(int i17, java.lang.CharSequence charSequence) {
        }

        public void onAuthenticationFailed() {
        }

        public void onAuthenticationHelp(int i17, java.lang.CharSequence charSequence) {
        }

        public void onAuthenticationSucceeded(com.tencent.soter.core.biometric.BiometricManagerCompat.AuthenticationResult authenticationResult) {
        }
    }

    /* loaded from: classes15.dex */
    public static final class AuthenticationResult {
        private com.tencent.soter.core.biometric.BiometricManagerCompat.CryptoObject mCryptoObject;

        public AuthenticationResult(com.tencent.soter.core.biometric.BiometricManagerCompat.CryptoObject cryptoObject) {
            this.mCryptoObject = cryptoObject;
        }

        public com.tencent.soter.core.biometric.BiometricManagerCompat.CryptoObject getCryptoObject() {
            return this.mCryptoObject;
        }
    }

    /* loaded from: classes15.dex */
    public static class FaceidManagerImpl implements com.tencent.soter.core.biometric.BiometricManagerCompat.IBiometricManager {
        private static final java.lang.String TAG = "Soter.BiometricManagerCompat.Faceid";

        /* JADX INFO: Access modifiers changed from: private */
        public static void informTooManyTrial(com.tencent.soter.core.biometric.FaceidManagerProxy.AuthenticationCallback authenticationCallback) {
            zt5.h.f(TAG, "soter: too many fail callback. inform it.", new java.lang.Object[0]);
            authenticationCallback.onAuthenticationError(10308, "Too many failed times");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean shouldInformTooManyTrial(com.tencent.soter.core.biometric.FaceidManagerProxy.AuthenticationCallback authenticationCallback, android.content.Context context) {
            if (com.tencent.soter.core.biometric.SoterBiometricAntiBruteForceStrategy.isSystemHasAntiBruteForce()) {
                zt5.h.e(TAG, "soter: using system anti brute force strategy", new java.lang.Object[0]);
                return false;
            }
            if (com.tencent.soter.core.biometric.SoterBiometricAntiBruteForceStrategy.isCurrentTweenTimeAvailable(context)) {
                if (!com.tencent.soter.core.biometric.SoterBiometricAntiBruteForceStrategy.isCurrentFailTimeAvailable(context)) {
                    zt5.h.e(TAG, "soter: unfreeze former frozen status", new java.lang.Object[0]);
                    com.tencent.soter.core.biometric.SoterBiometricAntiBruteForceStrategy.unFreeze(context);
                }
                return false;
            }
            if (com.tencent.soter.core.biometric.SoterBiometricAntiBruteForceStrategy.isCurrentFailTimeAvailable(context)) {
                zt5.h.e(TAG, "soter: failure time available", new java.lang.Object[0]);
                return false;
            }
            informTooManyTrial(authenticationCallback);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static com.tencent.soter.core.biometric.BiometricManagerCompat.CryptoObject unwrapCryptoObject(com.tencent.soter.core.biometric.FaceidManagerProxy.CryptoObject cryptoObject) {
            if (cryptoObject == null) {
                return null;
            }
            if (cryptoObject.getCipher() != null) {
                return new com.tencent.soter.core.biometric.BiometricManagerCompat.CryptoObject(cryptoObject.getCipher());
            }
            if (cryptoObject.getSignature() != null) {
                return new com.tencent.soter.core.biometric.BiometricManagerCompat.CryptoObject(cryptoObject.getSignature());
            }
            if (cryptoObject.getMac() != null) {
                return new com.tencent.soter.core.biometric.BiometricManagerCompat.CryptoObject(cryptoObject.getMac());
            }
            return null;
        }

        private static com.tencent.soter.core.biometric.FaceidManagerProxy.AuthenticationCallback wrapCallback(final android.content.Context context, final com.tencent.soter.core.biometric.BiometricManagerCompat.AuthenticationCallback authenticationCallback) {
            return new com.tencent.soter.core.biometric.FaceidManagerProxy.AuthenticationCallback() { // from class: com.tencent.soter.core.biometric.BiometricManagerCompat.FaceidManagerImpl.1
                private boolean mMarkPermanentlyCallbacked = false;

                @Override // com.tencent.soter.core.biometric.FaceidManagerProxy.AuthenticationCallback
                public void onAuthenticationError(int i17, java.lang.CharSequence charSequence) {
                    zt5.h.a(com.tencent.soter.core.biometric.BiometricManagerCompat.FaceidManagerImpl.TAG, "soter: basic onAuthenticationError code[%d], msg[%s] entered.", java.lang.Integer.valueOf(i17), charSequence);
                    if (this.mMarkPermanentlyCallbacked) {
                        zt5.h.a(com.tencent.soter.core.biometric.BiometricManagerCompat.FaceidManagerImpl.TAG, "soter: basic onAuthenticationError code[%d], msg[%s] returned cause permanently callback.", java.lang.Integer.valueOf(i17), charSequence);
                        return;
                    }
                    this.mMarkPermanentlyCallbacked = true;
                    if (i17 == 5) {
                        zt5.h.c(com.tencent.soter.core.biometric.BiometricManagerCompat.FaceidManagerImpl.TAG, "soter: basic onAuthenticationError code[%d], msg[%s] callbacked and returned cause FACE_ERROR_CANCELED got.", java.lang.Integer.valueOf(i17), charSequence);
                        com.tencent.soter.core.biometric.BiometricManagerCompat.AuthenticationCallback.this.onAuthenticationCancelled();
                    } else {
                        if (i17 != 7) {
                            zt5.h.a(com.tencent.soter.core.biometric.BiometricManagerCompat.FaceidManagerImpl.TAG, "soter: basic onAuthenticationError code[%d], msg[%s] callbacked and returned.", java.lang.Integer.valueOf(i17), charSequence);
                            com.tencent.soter.core.biometric.BiometricManagerCompat.AuthenticationCallback.this.onAuthenticationError(i17, charSequence);
                            return;
                        }
                        zt5.h.c(com.tencent.soter.core.biometric.BiometricManagerCompat.FaceidManagerImpl.TAG, "soter: basic onAuthenticationError code[%d], msg[%s] callbacked and returned cause FACE_ERROR_LOCKOUT got.", java.lang.Integer.valueOf(i17), charSequence);
                        if (!com.tencent.soter.core.biometric.SoterBiometricAntiBruteForceStrategy.isCurrentFailTimeAvailable(context) && !com.tencent.soter.core.biometric.SoterBiometricAntiBruteForceStrategy.isCurrentTweenTimeAvailable(context) && !com.tencent.soter.core.biometric.SoterBiometricAntiBruteForceStrategy.isSystemHasAntiBruteForce()) {
                            com.tencent.soter.core.biometric.SoterBiometricAntiBruteForceStrategy.freeze(context);
                        }
                        com.tencent.soter.core.biometric.BiometricManagerCompat.AuthenticationCallback.this.onAuthenticationError(10308, "Too many failed times");
                    }
                }

                @Override // com.tencent.soter.core.biometric.FaceidManagerProxy.AuthenticationCallback
                public void onAuthenticationFailed() {
                    zt5.h.a(com.tencent.soter.core.biometric.BiometricManagerCompat.FaceidManagerImpl.TAG, "soter: basic onAuthenticationFailed", new java.lang.Object[0]);
                    if (this.mMarkPermanentlyCallbacked) {
                        return;
                    }
                    this.mMarkPermanentlyCallbacked = true;
                    if (!com.tencent.soter.core.biometric.BiometricManagerCompat.FaceidManagerImpl.shouldInformTooManyTrial(this, context) && !com.tencent.soter.core.biometric.SoterBiometricAntiBruteForceStrategy.isSystemHasAntiBruteForce()) {
                        com.tencent.soter.core.biometric.SoterBiometricAntiBruteForceStrategy.addFailTime(context);
                        if (!com.tencent.soter.core.biometric.SoterBiometricAntiBruteForceStrategy.isCurrentFailTimeAvailable(context)) {
                            zt5.h.f(com.tencent.soter.core.biometric.BiometricManagerCompat.FaceidManagerImpl.TAG, "soter: too many fail trials", new java.lang.Object[0]);
                            com.tencent.soter.core.biometric.SoterBiometricAntiBruteForceStrategy.freeze(context);
                            com.tencent.soter.core.biometric.BiometricManagerCompat.FaceidManagerImpl.informTooManyTrial(this);
                            return;
                        }
                    }
                    com.tencent.soter.core.biometric.BiometricManagerCompat.AuthenticationCallback.this.onAuthenticationFailed();
                }

                @Override // com.tencent.soter.core.biometric.FaceidManagerProxy.AuthenticationCallback
                public void onAuthenticationHelp(int i17, java.lang.CharSequence charSequence) {
                    zt5.h.a(com.tencent.soter.core.biometric.BiometricManagerCompat.FaceidManagerImpl.TAG, "soter: basic onAuthenticationHelp helpMsgId[%d], helpString[%s]", java.lang.Integer.valueOf(i17), charSequence);
                    java.lang.System.currentTimeMillis();
                    if (this.mMarkPermanentlyCallbacked || com.tencent.soter.core.biometric.BiometricManagerCompat.FaceidManagerImpl.shouldInformTooManyTrial(this, context)) {
                        return;
                    }
                    com.tencent.soter.core.biometric.BiometricManagerCompat.AuthenticationCallback.this.onAuthenticationHelp(i17, charSequence);
                }

                @Override // com.tencent.soter.core.biometric.FaceidManagerProxy.AuthenticationCallback
                public void onAuthenticationSucceeded(com.tencent.soter.core.biometric.FaceidManagerProxy.AuthenticationResult authenticationResult) {
                    zt5.h.a(com.tencent.soter.core.biometric.BiometricManagerCompat.FaceidManagerImpl.TAG, "soter: basic onAuthenticationSucceeded", new java.lang.Object[0]);
                    if (this.mMarkPermanentlyCallbacked) {
                        return;
                    }
                    this.mMarkPermanentlyCallbacked = true;
                    if (com.tencent.soter.core.biometric.BiometricManagerCompat.FaceidManagerImpl.shouldInformTooManyTrial(this, context)) {
                        return;
                    }
                    if (!com.tencent.soter.core.biometric.SoterBiometricAntiBruteForceStrategy.isSystemHasAntiBruteForce()) {
                        com.tencent.soter.core.biometric.SoterBiometricAntiBruteForceStrategy.unFreeze(context);
                    }
                    com.tencent.soter.core.biometric.BiometricManagerCompat.AuthenticationCallback.this.onAuthenticationSucceeded(new com.tencent.soter.core.biometric.BiometricManagerCompat.AuthenticationResult(com.tencent.soter.core.biometric.BiometricManagerCompat.FaceidManagerImpl.unwrapCryptoObject(authenticationResult.getCryptoObject())));
                }
            };
        }

        private static com.tencent.soter.core.biometric.FaceidManagerProxy.CryptoObject wrapCryptoObject(com.tencent.soter.core.biometric.BiometricManagerCompat.CryptoObject cryptoObject) {
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

        @Override // com.tencent.soter.core.biometric.BiometricManagerCompat.IBiometricManager
        public void authenticate(android.content.Context context, com.tencent.soter.core.biometric.BiometricManagerCompat.CryptoObject cryptoObject, int i17, android.os.CancellationSignal cancellationSignal, com.tencent.soter.core.biometric.BiometricManagerCompat.AuthenticationCallback authenticationCallback, android.os.Handler handler, android.os.Bundle bundle) {
            com.tencent.soter.core.biometric.FaceidManagerProxy.authenticate(context, wrapCryptoObject(cryptoObject), i17, cancellationSignal, wrapCallback(context, authenticationCallback), handler);
        }

        @Override // com.tencent.soter.core.biometric.BiometricManagerCompat.IBiometricManager
        public java.lang.String getBiometricName(android.content.Context context) {
            return com.tencent.soter.core.biometric.FaceidManagerProxy.getBiometricName(context);
        }

        @Override // com.tencent.soter.core.biometric.BiometricManagerCompat.IBiometricManager
        public boolean hasEnrolledBiometric(android.content.Context context) {
            return com.tencent.soter.core.biometric.FaceidManagerProxy.hasEnrolledFaceids(context);
        }

        @Override // com.tencent.soter.core.biometric.BiometricManagerCompat.IBiometricManager
        public boolean isHardwareDetected(android.content.Context context) {
            return com.tencent.soter.core.biometric.FaceidManagerProxy.isHardwareDetected(context);
        }
    }

    /* loaded from: classes15.dex */
    public static class FingerprintManagerImpl implements com.tencent.soter.core.biometric.BiometricManagerCompat.IBiometricManager {
        private static final java.lang.String TAG = "Soter.BiometricManagerCompat.Fingerprint";

        /* JADX INFO: Access modifiers changed from: private */
        public static void informTooManyTrial(com.tencent.soter.core.biometric.FingerprintManagerProxy.AuthenticationCallback authenticationCallback) {
            zt5.h.f(TAG, "soter: too many fail fingerprint callback. inform it.", new java.lang.Object[0]);
            authenticationCallback.onAuthenticationError(10308, "Too many failed times");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean shouldInformTooManyTrial(com.tencent.soter.core.biometric.FingerprintManagerProxy.AuthenticationCallback authenticationCallback, android.content.Context context) {
            if (com.tencent.soter.core.biometric.SoterBiometricAntiBruteForceStrategy.isSystemHasAntiBruteForce()) {
                zt5.h.e(TAG, "soter: using system anti brute force strategy", new java.lang.Object[0]);
                return false;
            }
            if (com.tencent.soter.core.biometric.SoterBiometricAntiBruteForceStrategy.isCurrentTweenTimeAvailable(context)) {
                if (!com.tencent.soter.core.biometric.SoterBiometricAntiBruteForceStrategy.isCurrentFailTimeAvailable(context)) {
                    zt5.h.e(TAG, "soter: unfreeze former frozen status", new java.lang.Object[0]);
                    com.tencent.soter.core.biometric.SoterBiometricAntiBruteForceStrategy.unFreeze(context);
                }
                return false;
            }
            if (com.tencent.soter.core.biometric.SoterBiometricAntiBruteForceStrategy.isCurrentFailTimeAvailable(context)) {
                zt5.h.e(TAG, "soter: failure time available", new java.lang.Object[0]);
                return false;
            }
            informTooManyTrial(authenticationCallback);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static com.tencent.soter.core.biometric.BiometricManagerCompat.CryptoObject unwrapCryptoObject(com.tencent.soter.core.biometric.FingerprintManagerProxy.CryptoObject cryptoObject) {
            if (cryptoObject == null) {
                return null;
            }
            if (cryptoObject.getCipher() != null) {
                return new com.tencent.soter.core.biometric.BiometricManagerCompat.CryptoObject(cryptoObject.getCipher());
            }
            if (cryptoObject.getSignature() != null) {
                return new com.tencent.soter.core.biometric.BiometricManagerCompat.CryptoObject(cryptoObject.getSignature());
            }
            if (cryptoObject.getMac() != null) {
                return new com.tencent.soter.core.biometric.BiometricManagerCompat.CryptoObject(cryptoObject.getMac());
            }
            return null;
        }

        private static com.tencent.soter.core.biometric.FingerprintManagerProxy.AuthenticationCallback wrapCallback(final android.content.Context context, final com.tencent.soter.core.biometric.BiometricManagerCompat.AuthenticationCallback authenticationCallback) {
            return new com.tencent.soter.core.biometric.FingerprintManagerProxy.AuthenticationCallback() { // from class: com.tencent.soter.core.biometric.BiometricManagerCompat.FingerprintManagerImpl.1
                private boolean mMarkPermanentlyCallbacked = false;

                @Override // com.tencent.soter.core.biometric.FingerprintManagerProxy.AuthenticationCallback
                public void onAuthenticationError(int i17, java.lang.CharSequence charSequence) {
                    zt5.h.a(com.tencent.soter.core.biometric.BiometricManagerCompat.FingerprintManagerImpl.TAG, "soter: basic onAuthenticationError", new java.lang.Object[0]);
                    if (this.mMarkPermanentlyCallbacked) {
                        return;
                    }
                    this.mMarkPermanentlyCallbacked = true;
                    if (i17 == 5 || i17 == 10) {
                        zt5.h.c(com.tencent.soter.core.biometric.BiometricManagerCompat.FingerprintManagerImpl.TAG, "soter: user cancelled fingerprint authen", new java.lang.Object[0]);
                        com.tencent.soter.core.biometric.BiometricManagerCompat.AuthenticationCallback.this.onAuthenticationCancelled();
                        return;
                    }
                    if (i17 != 7 && i17 != 9) {
                        com.tencent.soter.core.biometric.BiometricManagerCompat.AuthenticationCallback.this.onAuthenticationError(i17, charSequence);
                        return;
                    }
                    zt5.h.c(com.tencent.soter.core.biometric.BiometricManagerCompat.FingerprintManagerImpl.TAG, "soter: system call too many trial.", new java.lang.Object[0]);
                    if (!com.tencent.soter.core.biometric.SoterBiometricAntiBruteForceStrategy.isCurrentFailTimeAvailable(context) && !com.tencent.soter.core.biometric.SoterBiometricAntiBruteForceStrategy.isCurrentTweenTimeAvailable(context) && !com.tencent.soter.core.biometric.SoterBiometricAntiBruteForceStrategy.isSystemHasAntiBruteForce()) {
                        com.tencent.soter.core.biometric.SoterBiometricAntiBruteForceStrategy.freeze(context);
                    }
                    this.mMarkPermanentlyCallbacked = false;
                    if (i17 == 7) {
                        onAuthenticationError(10308, "Too many failed times");
                    } else {
                        onAuthenticationError(10309, "Too many failed times");
                    }
                }

                @Override // com.tencent.soter.core.biometric.FingerprintManagerProxy.AuthenticationCallback
                public void onAuthenticationFailed() {
                    zt5.h.a(com.tencent.soter.core.biometric.BiometricManagerCompat.FingerprintManagerImpl.TAG, "soter: basic onAuthenticationFailed", new java.lang.Object[0]);
                    if (this.mMarkPermanentlyCallbacked || com.tencent.soter.core.biometric.BiometricManagerCompat.FingerprintManagerImpl.shouldInformTooManyTrial(this, context)) {
                        return;
                    }
                    if (!com.tencent.soter.core.biometric.SoterBiometricAntiBruteForceStrategy.isSystemHasAntiBruteForce()) {
                        com.tencent.soter.core.biometric.SoterBiometricAntiBruteForceStrategy.addFailTime(context);
                        if (!com.tencent.soter.core.biometric.SoterBiometricAntiBruteForceStrategy.isCurrentFailTimeAvailable(context)) {
                            zt5.h.f(com.tencent.soter.core.biometric.BiometricManagerCompat.FingerprintManagerImpl.TAG, "soter: too many fail trials", new java.lang.Object[0]);
                            com.tencent.soter.core.biometric.SoterBiometricAntiBruteForceStrategy.freeze(context);
                            com.tencent.soter.core.biometric.BiometricManagerCompat.FingerprintManagerImpl.informTooManyTrial(this);
                            return;
                        }
                    }
                    com.tencent.soter.core.biometric.BiometricManagerCompat.AuthenticationCallback.this.onAuthenticationFailed();
                }

                @Override // com.tencent.soter.core.biometric.FingerprintManagerProxy.AuthenticationCallback
                public void onAuthenticationHelp(int i17, java.lang.CharSequence charSequence) {
                    zt5.h.a(com.tencent.soter.core.biometric.BiometricManagerCompat.FingerprintManagerImpl.TAG, "soter: basic onAuthenticationHelp", new java.lang.Object[0]);
                    if (this.mMarkPermanentlyCallbacked || com.tencent.soter.core.biometric.BiometricManagerCompat.FingerprintManagerImpl.shouldInformTooManyTrial(this, context)) {
                        return;
                    }
                    com.tencent.soter.core.biometric.BiometricManagerCompat.AuthenticationCallback.this.onAuthenticationHelp(i17, charSequence);
                }

                @Override // com.tencent.soter.core.biometric.FingerprintManagerProxy.AuthenticationCallback
                public void onAuthenticationSucceeded(com.tencent.soter.core.biometric.FingerprintManagerProxy.AuthenticationResultInternal authenticationResultInternal) {
                    zt5.h.a(com.tencent.soter.core.biometric.BiometricManagerCompat.FingerprintManagerImpl.TAG, "soter: basic onAuthenticationSucceeded", new java.lang.Object[0]);
                    if (this.mMarkPermanentlyCallbacked || com.tencent.soter.core.biometric.BiometricManagerCompat.FingerprintManagerImpl.shouldInformTooManyTrial(this, context)) {
                        return;
                    }
                    if (!com.tencent.soter.core.biometric.SoterBiometricAntiBruteForceStrategy.isSystemHasAntiBruteForce()) {
                        com.tencent.soter.core.biometric.SoterBiometricAntiBruteForceStrategy.unFreeze(context);
                    }
                    this.mMarkPermanentlyCallbacked = true;
                    com.tencent.soter.core.biometric.BiometricManagerCompat.AuthenticationCallback.this.onAuthenticationSucceeded(new com.tencent.soter.core.biometric.BiometricManagerCompat.AuthenticationResult(com.tencent.soter.core.biometric.BiometricManagerCompat.FingerprintManagerImpl.unwrapCryptoObject(authenticationResultInternal.getCryptoObject())));
                }
            };
        }

        private static com.tencent.soter.core.biometric.FingerprintManagerProxy.CryptoObject wrapCryptoObject(com.tencent.soter.core.biometric.BiometricManagerCompat.CryptoObject cryptoObject) {
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

        @Override // com.tencent.soter.core.biometric.BiometricManagerCompat.IBiometricManager
        public void authenticate(android.content.Context context, com.tencent.soter.core.biometric.BiometricManagerCompat.CryptoObject cryptoObject, int i17, android.os.CancellationSignal cancellationSignal, com.tencent.soter.core.biometric.BiometricManagerCompat.AuthenticationCallback authenticationCallback, android.os.Handler handler, android.os.Bundle bundle) {
            com.tencent.soter.core.biometric.FingerprintManagerProxy.authenticate(context, wrapCryptoObject(cryptoObject), i17, cancellationSignal, wrapCallback(context, authenticationCallback), handler, bundle);
        }

        @Override // com.tencent.soter.core.biometric.BiometricManagerCompat.IBiometricManager
        public java.lang.String getBiometricName(android.content.Context context) {
            return com.tencent.soter.core.biometric.FingerprintManagerProxy.FINGERPRINT_SERVICE;
        }

        @Override // com.tencent.soter.core.biometric.BiometricManagerCompat.IBiometricManager
        public boolean hasEnrolledBiometric(android.content.Context context) {
            return com.tencent.soter.core.biometric.FingerprintManagerProxy.hasEnrolledFingerprints(context);
        }

        @Override // com.tencent.soter.core.biometric.BiometricManagerCompat.IBiometricManager
        public boolean isHardwareDetected(android.content.Context context) {
            return com.tencent.soter.core.biometric.FingerprintManagerProxy.isHardwareDetected(context);
        }
    }

    /* loaded from: classes15.dex */
    public interface IBiometricManager {
        void authenticate(android.content.Context context, com.tencent.soter.core.biometric.BiometricManagerCompat.CryptoObject cryptoObject, int i17, android.os.CancellationSignal cancellationSignal, com.tencent.soter.core.biometric.BiometricManagerCompat.AuthenticationCallback authenticationCallback, android.os.Handler handler, android.os.Bundle bundle);

        java.lang.String getBiometricName(android.content.Context context);

        boolean hasEnrolledBiometric(android.content.Context context);

        boolean isHardwareDetected(android.content.Context context);
    }

    /* loaded from: classes15.dex */
    public static class LegacyFingerprintManagerImpl implements com.tencent.soter.core.biometric.BiometricManagerCompat.IBiometricManager {
        @Override // com.tencent.soter.core.biometric.BiometricManagerCompat.IBiometricManager
        public void authenticate(android.content.Context context, com.tencent.soter.core.biometric.BiometricManagerCompat.CryptoObject cryptoObject, int i17, android.os.CancellationSignal cancellationSignal, com.tencent.soter.core.biometric.BiometricManagerCompat.AuthenticationCallback authenticationCallback, android.os.Handler handler, android.os.Bundle bundle) {
        }

        @Override // com.tencent.soter.core.biometric.BiometricManagerCompat.IBiometricManager
        public java.lang.String getBiometricName(android.content.Context context) {
            return null;
        }

        @Override // com.tencent.soter.core.biometric.BiometricManagerCompat.IBiometricManager
        public boolean hasEnrolledBiometric(android.content.Context context) {
            return false;
        }

        @Override // com.tencent.soter.core.biometric.BiometricManagerCompat.IBiometricManager
        public boolean isHardwareDetected(android.content.Context context) {
            zt5.i.a(200, "LegacyFingerprintManagerImpl.isHardwareDetected return false");
            return false;
        }
    }

    private BiometricManagerCompat(android.content.Context context, java.lang.Integer num) {
        this.mContext = context;
        this.mBiometricType = num;
        initImpl();
    }

    public static com.tencent.soter.core.biometric.BiometricManagerCompat from(android.content.Context context, java.lang.Integer num) {
        return new com.tencent.soter.core.biometric.BiometricManagerCompat(context, num);
    }

    private void initImpl() {
        com.tencent.soter.core.biometric.BiometricManagerCompat.IBiometricManager legacyFingerprintManagerImpl;
        if (wt5.a.l()) {
            zt5.h.c(TAG, "soter: set IMPL to FingerprintManagerImpl", new java.lang.Object[0]);
            legacyFingerprintManagerImpl = new com.tencent.soter.core.biometric.BiometricManagerCompat.FingerprintManagerImpl();
        } else {
            zt5.h.c(TAG, "soter: set IMPL to LegacyFingerprintManagerImpl", new java.lang.Object[0]);
            legacyFingerprintManagerImpl = new com.tencent.soter.core.biometric.BiometricManagerCompat.LegacyFingerprintManagerImpl();
        }
        java.util.Map<java.lang.Integer, com.tencent.soter.core.biometric.BiometricManagerCompat.IBiometricManager> map = IMPL_PROVIDER;
        map.put(1, legacyFingerprintManagerImpl);
        if (wt5.a.l() && isNativeSupportFaceid()) {
            map.put(2, new com.tencent.soter.core.biometric.BiometricManagerCompat.FaceidManagerImpl());
        }
    }

    public static boolean isNativeSupportFaceid() {
        try {
            java.lang.Class.forName(com.tencent.soter.core.biometric.FaceidManagerProxy.FACEMANAGER_FACTORY_CLASS_NAME);
            return true;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    public void authenticate(com.tencent.soter.core.biometric.BiometricManagerCompat.CryptoObject cryptoObject, int i17, android.os.CancellationSignal cancellationSignal, com.tencent.soter.core.biometric.BiometricManagerCompat.AuthenticationCallback authenticationCallback, android.os.Handler handler, android.os.Bundle bundle) {
        com.tencent.soter.core.biometric.BiometricManagerCompat.IBiometricManager iBiometricManager = IMPL_PROVIDER.get(this.mBiometricType);
        if (iBiometricManager == null) {
            zt5.h.c(TAG, "soter: Biometric provider not initialized type[" + this.mBiometricType + "]", new java.lang.Object[0]);
            authenticationCallback.onAuthenticationCancelled();
        }
        iBiometricManager.authenticate(this.mContext, cryptoObject, i17, cancellationSignal, authenticationCallback, handler, bundle);
    }

    public java.lang.String getBiometricName() {
        com.tencent.soter.core.biometric.BiometricManagerCompat.IBiometricManager iBiometricManager = IMPL_PROVIDER.get(this.mBiometricType);
        if (iBiometricManager != null) {
            return iBiometricManager.getBiometricName(this.mContext);
        }
        zt5.h.c(TAG, "soter: Biometric provider not initialized type[" + this.mBiometricType + "]", new java.lang.Object[0]);
        return null;
    }

    public boolean hasEnrolledBiometric() {
        com.tencent.soter.core.biometric.BiometricManagerCompat.IBiometricManager iBiometricManager = IMPL_PROVIDER.get(this.mBiometricType);
        if (iBiometricManager != null) {
            return iBiometricManager.hasEnrolledBiometric(this.mContext);
        }
        zt5.h.c(TAG, "soter: Biometric provider not initialized type[" + this.mBiometricType + "]", new java.lang.Object[0]);
        return false;
    }

    public boolean isCurrentFailTimeAvailable() {
        return com.tencent.soter.core.biometric.SoterBiometricAntiBruteForceStrategy.isCurrentFailTimeAvailable(this.mContext);
    }

    public boolean isCurrentTweenTimeAvailable(android.content.Context context) {
        return com.tencent.soter.core.biometric.SoterBiometricAntiBruteForceStrategy.isCurrentTweenTimeAvailable(this.mContext);
    }

    public boolean isHardwareDetected() {
        com.tencent.soter.core.biometric.BiometricManagerCompat.IBiometricManager iBiometricManager = IMPL_PROVIDER.get(this.mBiometricType);
        if (iBiometricManager != null) {
            return iBiometricManager.isHardwareDetected(this.mContext);
        }
        zt5.h.c(TAG, "soter: Biometric provider not initialized type[" + this.mBiometricType + "]", new java.lang.Object[0]);
        return false;
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
