package org.webrtc;

/* loaded from: classes6.dex */
public class RtcCertificatePem {
    private static final long DEFAULT_EXPIRY = 2592000;
    public final java.lang.String certificate;
    public final java.lang.String privateKey;

    public RtcCertificatePem(java.lang.String str, java.lang.String str2) {
        this.privateKey = str;
        this.certificate = str2;
    }

    public static org.webrtc.RtcCertificatePem generateCertificate() {
        return nativeGenerateCertificate(org.webrtc.PeerConnection.KeyType.ECDSA, DEFAULT_EXPIRY);
    }

    private static native org.webrtc.RtcCertificatePem nativeGenerateCertificate(org.webrtc.PeerConnection.KeyType keyType, long j17);

    public java.lang.String getCertificate() {
        return this.certificate;
    }

    public java.lang.String getPrivateKey() {
        return this.privateKey;
    }

    public static org.webrtc.RtcCertificatePem generateCertificate(org.webrtc.PeerConnection.KeyType keyType) {
        return nativeGenerateCertificate(keyType, DEFAULT_EXPIRY);
    }

    public static org.webrtc.RtcCertificatePem generateCertificate(long j17) {
        return nativeGenerateCertificate(org.webrtc.PeerConnection.KeyType.ECDSA, j17);
    }

    public static org.webrtc.RtcCertificatePem generateCertificate(org.webrtc.PeerConnection.KeyType keyType, long j17) {
        return nativeGenerateCertificate(keyType, j17);
    }
}
