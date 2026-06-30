package org.webrtc;

/* loaded from: classes6.dex */
public final class CryptoOptions {
    private final org.webrtc.CryptoOptions.SFrame sframe;
    private final org.webrtc.CryptoOptions.Srtp srtp;

    /* loaded from: classes6.dex */
    public static class Builder {
        private boolean enableAes128Sha1_32CryptoCipher;
        private boolean enableEncryptedRtpHeaderExtensions;
        private boolean enableGcmCryptoSuites;
        private boolean requireFrameEncryption;

        private Builder() {
        }

        public org.webrtc.CryptoOptions createCryptoOptions() {
            return new org.webrtc.CryptoOptions(this.enableGcmCryptoSuites, this.enableAes128Sha1_32CryptoCipher, this.enableEncryptedRtpHeaderExtensions, this.requireFrameEncryption);
        }

        public org.webrtc.CryptoOptions.Builder setEnableAes128Sha1_32CryptoCipher(boolean z17) {
            this.enableAes128Sha1_32CryptoCipher = z17;
            return this;
        }

        public org.webrtc.CryptoOptions.Builder setEnableEncryptedRtpHeaderExtensions(boolean z17) {
            this.enableEncryptedRtpHeaderExtensions = z17;
            return this;
        }

        public org.webrtc.CryptoOptions.Builder setEnableGcmCryptoSuites(boolean z17) {
            this.enableGcmCryptoSuites = z17;
            return this;
        }

        public org.webrtc.CryptoOptions.Builder setRequireFrameEncryption(boolean z17) {
            this.requireFrameEncryption = z17;
            return this;
        }
    }

    /* loaded from: classes6.dex */
    public final class SFrame {
        private final boolean requireFrameEncryption;

        public boolean getRequireFrameEncryption() {
            return this.requireFrameEncryption;
        }

        private SFrame(boolean z17) {
            this.requireFrameEncryption = z17;
        }
    }

    /* loaded from: classes6.dex */
    public final class Srtp {
        private final boolean enableAes128Sha1_32CryptoCipher;
        private final boolean enableEncryptedRtpHeaderExtensions;
        private final boolean enableGcmCryptoSuites;

        public boolean getEnableAes128Sha1_32CryptoCipher() {
            return this.enableAes128Sha1_32CryptoCipher;
        }

        public boolean getEnableEncryptedRtpHeaderExtensions() {
            return this.enableEncryptedRtpHeaderExtensions;
        }

        public boolean getEnableGcmCryptoSuites() {
            return this.enableGcmCryptoSuites;
        }

        private Srtp(boolean z17, boolean z18, boolean z19) {
            this.enableGcmCryptoSuites = z17;
            this.enableAes128Sha1_32CryptoCipher = z18;
            this.enableEncryptedRtpHeaderExtensions = z19;
        }
    }

    public static org.webrtc.CryptoOptions.Builder builder() {
        return new org.webrtc.CryptoOptions.Builder();
    }

    public org.webrtc.CryptoOptions.SFrame getSFrame() {
        return this.sframe;
    }

    public org.webrtc.CryptoOptions.Srtp getSrtp() {
        return this.srtp;
    }

    private CryptoOptions(boolean z17, boolean z18, boolean z19, boolean z27) {
        this.srtp = new org.webrtc.CryptoOptions.Srtp(z17, z18, z19);
        this.sframe = new org.webrtc.CryptoOptions.SFrame(z27);
    }
}
