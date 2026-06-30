package org.webrtc;

/* loaded from: classes15.dex */
public class RtpReceiver {
    private org.webrtc.MediaStreamTrack cachedTrack;
    private long nativeObserver;
    private long nativeRtpReceiver;

    /* loaded from: classes6.dex */
    public interface Observer {
        void onFirstPacketReceived(org.webrtc.MediaStreamTrack.MediaType mediaType);
    }

    public RtpReceiver(long j17) {
        this.nativeRtpReceiver = j17;
        this.cachedTrack = org.webrtc.MediaStreamTrack.createMediaStreamTrack(nativeGetTrack(j17));
    }

    private void checkRtpReceiverExists() {
        if (this.nativeRtpReceiver == 0) {
            throw new java.lang.IllegalStateException("RtpReceiver has been disposed.");
        }
    }

    private static native java.lang.String nativeGetId(long j17);

    private static native org.webrtc.RtpParameters nativeGetParameters(long j17);

    private static native long nativeGetTrack(long j17);

    private static native void nativeSetFrameDecryptor(long j17, long j18);

    private static native long nativeSetObserver(long j17, org.webrtc.RtpReceiver.Observer observer);

    private static native void nativeUnsetObserver(long j17, long j18);

    public void SetObserver(org.webrtc.RtpReceiver.Observer observer) {
        checkRtpReceiverExists();
        long j17 = this.nativeObserver;
        if (j17 != 0) {
            nativeUnsetObserver(this.nativeRtpReceiver, j17);
        }
        this.nativeObserver = nativeSetObserver(this.nativeRtpReceiver, observer);
    }

    public void dispose() {
        checkRtpReceiverExists();
        this.cachedTrack.dispose();
        long j17 = this.nativeObserver;
        if (j17 != 0) {
            nativeUnsetObserver(this.nativeRtpReceiver, j17);
            this.nativeObserver = 0L;
        }
        org.webrtc.JniCommon.nativeReleaseRef(this.nativeRtpReceiver);
        this.nativeRtpReceiver = 0L;
    }

    public org.webrtc.RtpParameters getParameters() {
        checkRtpReceiverExists();
        return nativeGetParameters(this.nativeRtpReceiver);
    }

    public java.lang.String id() {
        checkRtpReceiverExists();
        return nativeGetId(this.nativeRtpReceiver);
    }

    public void setFrameDecryptor(org.webrtc.FrameDecryptor frameDecryptor) {
        checkRtpReceiverExists();
        nativeSetFrameDecryptor(this.nativeRtpReceiver, frameDecryptor.getNativeFrameDecryptor());
    }

    public org.webrtc.MediaStreamTrack track() {
        return this.cachedTrack;
    }
}
