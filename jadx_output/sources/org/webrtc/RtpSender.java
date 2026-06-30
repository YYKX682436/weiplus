package org.webrtc;

/* loaded from: classes15.dex */
public class RtpSender {
    private org.webrtc.MediaStreamTrack cachedTrack;
    private final org.webrtc.DtmfSender dtmfSender;
    private long nativeRtpSender;
    private boolean ownsTrack = true;

    public RtpSender(long j17) {
        this.nativeRtpSender = j17;
        this.cachedTrack = org.webrtc.MediaStreamTrack.createMediaStreamTrack(nativeGetTrack(j17));
        long nativeGetDtmfSender = nativeGetDtmfSender(j17);
        this.dtmfSender = nativeGetDtmfSender != 0 ? new org.webrtc.DtmfSender(nativeGetDtmfSender) : null;
    }

    private void checkRtpSenderExists() {
        if (this.nativeRtpSender == 0) {
            throw new java.lang.IllegalStateException("RtpSender has been disposed.");
        }
    }

    private static native long nativeGetDtmfSender(long j17);

    private static native java.lang.String nativeGetId(long j17);

    private static native org.webrtc.RtpParameters nativeGetParameters(long j17);

    private static native java.util.List<java.lang.String> nativeGetStreams(long j17);

    private static native long nativeGetTrack(long j17);

    private static native void nativeSetFrameEncryptor(long j17, long j18);

    private static native boolean nativeSetParameters(long j17, org.webrtc.RtpParameters rtpParameters);

    private static native void nativeSetStreams(long j17, java.util.List<java.lang.String> list);

    private static native boolean nativeSetTrack(long j17, long j18);

    public void dispose() {
        checkRtpSenderExists();
        org.webrtc.DtmfSender dtmfSender = this.dtmfSender;
        if (dtmfSender != null) {
            dtmfSender.dispose();
        }
        org.webrtc.MediaStreamTrack mediaStreamTrack = this.cachedTrack;
        if (mediaStreamTrack != null && this.ownsTrack) {
            mediaStreamTrack.dispose();
        }
        org.webrtc.JniCommon.nativeReleaseRef(this.nativeRtpSender);
        this.nativeRtpSender = 0L;
    }

    public org.webrtc.DtmfSender dtmf() {
        return this.dtmfSender;
    }

    public long getNativeRtpSender() {
        checkRtpSenderExists();
        return this.nativeRtpSender;
    }

    public org.webrtc.RtpParameters getParameters() {
        checkRtpSenderExists();
        return nativeGetParameters(this.nativeRtpSender);
    }

    public java.util.List<java.lang.String> getStreams() {
        checkRtpSenderExists();
        return nativeGetStreams(this.nativeRtpSender);
    }

    public java.lang.String id() {
        checkRtpSenderExists();
        return nativeGetId(this.nativeRtpSender);
    }

    public void setFrameEncryptor(org.webrtc.FrameEncryptor frameEncryptor) {
        checkRtpSenderExists();
        nativeSetFrameEncryptor(this.nativeRtpSender, frameEncryptor.getNativeFrameEncryptor());
    }

    public boolean setParameters(org.webrtc.RtpParameters rtpParameters) {
        checkRtpSenderExists();
        return nativeSetParameters(this.nativeRtpSender, rtpParameters);
    }

    public void setStreams(java.util.List<java.lang.String> list) {
        checkRtpSenderExists();
        nativeSetStreams(this.nativeRtpSender, list);
    }

    public boolean setTrack(org.webrtc.MediaStreamTrack mediaStreamTrack, boolean z17) {
        checkRtpSenderExists();
        if (!nativeSetTrack(this.nativeRtpSender, mediaStreamTrack == null ? 0L : mediaStreamTrack.getNativeMediaStreamTrack())) {
            return false;
        }
        org.webrtc.MediaStreamTrack mediaStreamTrack2 = this.cachedTrack;
        if (mediaStreamTrack2 != null && this.ownsTrack) {
            mediaStreamTrack2.dispose();
        }
        this.cachedTrack = mediaStreamTrack;
        this.ownsTrack = z17;
        return true;
    }

    public org.webrtc.MediaStreamTrack track() {
        return this.cachedTrack;
    }
}
