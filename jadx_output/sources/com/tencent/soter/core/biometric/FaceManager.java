package com.tencent.soter.core.biometric;

/* loaded from: classes15.dex */
public abstract class FaceManager {
    public static final int FACE_ACQUIRED_BRIGHT = 1112;
    public static final int FACE_ACQUIRED_DARK = 1110;
    public static final int FACE_ACQUIRED_DOWN = 1116;
    public static final int FACE_ACQUIRED_FAR_FACE = 1106;
    public static final int FACE_ACQUIRED_GOOD = 1101;
    public static final int FACE_ACQUIRED_HACKER = 1111;
    public static final int FACE_ACQUIRED_IMAGER_DIRTY = 1103;
    public static final int FACE_ACQUIRED_INSUFFICIENT = 1102;
    public static final int FACE_ACQUIRED_LEFT = 1113;
    public static final int FACE_ACQUIRED_MOUTH_OCCLUSION = 1119;
    public static final int FACE_ACQUIRED_MULTI_FACE = 1121;
    public static final int FACE_ACQUIRED_NEAR_FACE = 1107;
    public static final int FACE_ACQUIRED_NOSE_OCCLUSION = 1120;
    public static final int FACE_ACQUIRED_NO_FACE = 1108;
    public static final int FACE_ACQUIRED_NO_FOCUS = 1118;
    public static final int FACE_ACQUIRED_RIGHT = 1114;
    public static final int FACE_ACQUIRED_SHIFTING = 1109;
    public static final int FACE_ACQUIRED_TOO_FAST = 1105;
    public static final int FACE_ACQUIRED_TOO_SLOW = 1104;
    public static final int FACE_ACQUIRED_UP = 1115;
    public static final int FACE_ERROR_CAMERA_UNAVAILABLE = 8;
    public static final int FACE_ERROR_CANCELED = 5;
    public static final int FACE_ERROR_HW_UNAVAILABLE = 1;
    public static final int FACE_ERROR_LOCKOUT = 7;
    public static final int FACE_ERROR_TIMEOUT = 3;
    public static final int FACE_ERROR_UNABLE_TO_PROCESS = 2;
    public static final int FACE_ERROR_VENDOR_BASE = 1000;
    public static final int FACE_WITH_EYES_CLOSED = 1117;
    private static final java.lang.String TAG = "Soter.FaceManager";

    /* loaded from: classes15.dex */
    public static abstract class AuthenticationCallback {
        public void onAuthenticationError(int i17, java.lang.CharSequence charSequence) {
        }

        public void onAuthenticationFailed() {
        }

        public void onAuthenticationHelp(int i17, java.lang.CharSequence charSequence) {
        }

        public void onAuthenticationSucceeded(com.tencent.soter.core.biometric.FaceManager.AuthenticationResult authenticationResult) {
        }
    }

    /* loaded from: classes15.dex */
    public static class AuthenticationResult {
        private com.tencent.soter.core.biometric.FaceManager.CryptoObject mCryptoObject;

        public AuthenticationResult(com.tencent.soter.core.biometric.FaceManager.CryptoObject cryptoObject) {
            this.mCryptoObject = cryptoObject;
        }

        public com.tencent.soter.core.biometric.FaceManager.CryptoObject getCryptoObject() {
            return this.mCryptoObject;
        }
    }

    public abstract void authenticate(com.tencent.soter.core.biometric.FaceManager.CryptoObject cryptoObject, android.os.CancellationSignal cancellationSignal, int i17, com.tencent.soter.core.biometric.FaceManager.AuthenticationCallback authenticationCallback, android.os.Handler handler);

    public abstract java.lang.String getBiometricName(android.content.Context context);

    public abstract boolean hasEnrolledFaces();

    public abstract boolean isHardwareDetected();

    /* loaded from: classes15.dex */
    public static final class CryptoObject {
        private final java.lang.Object mCrypto;

        public CryptoObject(java.security.Signature signature) {
            this.mCrypto = signature;
        }

        public javax.crypto.Cipher getCipher() {
            java.lang.Object obj = this.mCrypto;
            if (obj instanceof javax.crypto.Cipher) {
                return (javax.crypto.Cipher) obj;
            }
            return null;
        }

        public javax.crypto.Mac getMac() {
            java.lang.Object obj = this.mCrypto;
            if (obj instanceof javax.crypto.Mac) {
                return (javax.crypto.Mac) obj;
            }
            return null;
        }

        public java.security.Signature getSignature() {
            java.lang.Object obj = this.mCrypto;
            if (obj instanceof java.security.Signature) {
                return (java.security.Signature) obj;
            }
            return null;
        }

        public CryptoObject(javax.crypto.Cipher cipher) {
            this.mCrypto = cipher;
        }

        public CryptoObject(javax.crypto.Mac mac) {
            this.mCrypto = mac;
        }
    }
}
