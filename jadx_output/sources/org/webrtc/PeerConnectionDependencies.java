package org.webrtc;

/* loaded from: classes15.dex */
public final class PeerConnectionDependencies {
    private final org.webrtc.PeerConnection.Observer observer;
    private final org.webrtc.SSLCertificateVerifier sslCertificateVerifier;

    /* loaded from: classes15.dex */
    public static class Builder {
        private org.webrtc.PeerConnection.Observer observer;
        private org.webrtc.SSLCertificateVerifier sslCertificateVerifier;

        public org.webrtc.PeerConnectionDependencies createPeerConnectionDependencies() {
            return new org.webrtc.PeerConnectionDependencies(this.observer, this.sslCertificateVerifier);
        }

        public org.webrtc.PeerConnectionDependencies.Builder setSSLCertificateVerifier(org.webrtc.SSLCertificateVerifier sSLCertificateVerifier) {
            this.sslCertificateVerifier = sSLCertificateVerifier;
            return this;
        }

        private Builder(org.webrtc.PeerConnection.Observer observer) {
            this.observer = observer;
        }
    }

    public static org.webrtc.PeerConnectionDependencies.Builder builder(org.webrtc.PeerConnection.Observer observer) {
        return new org.webrtc.PeerConnectionDependencies.Builder(observer);
    }

    public org.webrtc.PeerConnection.Observer getObserver() {
        return this.observer;
    }

    public org.webrtc.SSLCertificateVerifier getSSLCertificateVerifier() {
        return this.sslCertificateVerifier;
    }

    private PeerConnectionDependencies(org.webrtc.PeerConnection.Observer observer, org.webrtc.SSLCertificateVerifier sSLCertificateVerifier) {
        this.observer = observer;
        this.sslCertificateVerifier = sSLCertificateVerifier;
    }
}
