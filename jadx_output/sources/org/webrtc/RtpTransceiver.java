package org.webrtc;

/* loaded from: classes15.dex */
public class RtpTransceiver {
    private org.webrtc.RtpReceiver cachedReceiver;
    private org.webrtc.RtpSender cachedSender;
    private long nativeRtpTransceiver;

    /* loaded from: classes11.dex */
    public enum RtpTransceiverDirection {
        SEND_RECV(0),
        SEND_ONLY(1),
        RECV_ONLY(2),
        INACTIVE(3);

        private final int nativeIndex;

        RtpTransceiverDirection(int i17) {
            this.nativeIndex = i17;
        }

        public static org.webrtc.RtpTransceiver.RtpTransceiverDirection fromNativeIndex(int i17) {
            for (org.webrtc.RtpTransceiver.RtpTransceiverDirection rtpTransceiverDirection : values()) {
                if (rtpTransceiverDirection.getNativeIndex() == i17) {
                    return rtpTransceiverDirection;
                }
            }
            throw new java.lang.IllegalArgumentException("Uknown native RtpTransceiverDirection type" + i17);
        }

        public int getNativeIndex() {
            return this.nativeIndex;
        }
    }

    /* loaded from: classes11.dex */
    public static final class RtpTransceiverInit {
        private final org.webrtc.RtpTransceiver.RtpTransceiverDirection direction;
        private final java.util.List<org.webrtc.RtpParameters.Encoding> sendEncodings;
        private final java.util.List<java.lang.String> streamIds;

        public RtpTransceiverInit() {
            this(org.webrtc.RtpTransceiver.RtpTransceiverDirection.SEND_RECV);
        }

        public int getDirectionNativeIndex() {
            return this.direction.getNativeIndex();
        }

        public java.util.List<org.webrtc.RtpParameters.Encoding> getSendEncodings() {
            return new java.util.ArrayList(this.sendEncodings);
        }

        public java.util.List<java.lang.String> getStreamIds() {
            return new java.util.ArrayList(this.streamIds);
        }

        public RtpTransceiverInit(org.webrtc.RtpTransceiver.RtpTransceiverDirection rtpTransceiverDirection) {
            this(rtpTransceiverDirection, java.util.Collections.emptyList(), java.util.Collections.emptyList());
        }

        public RtpTransceiverInit(org.webrtc.RtpTransceiver.RtpTransceiverDirection rtpTransceiverDirection, java.util.List<java.lang.String> list) {
            this(rtpTransceiverDirection, list, java.util.Collections.emptyList());
        }

        public RtpTransceiverInit(org.webrtc.RtpTransceiver.RtpTransceiverDirection rtpTransceiverDirection, java.util.List<java.lang.String> list, java.util.List<org.webrtc.RtpParameters.Encoding> list2) {
            this.direction = rtpTransceiverDirection;
            this.streamIds = new java.util.ArrayList(list);
            this.sendEncodings = new java.util.ArrayList(list2);
        }
    }

    public RtpTransceiver(long j17) {
        this.nativeRtpTransceiver = j17;
        this.cachedSender = nativeGetSender(j17);
        this.cachedReceiver = nativeGetReceiver(j17);
    }

    private void checkRtpTransceiverExists() {
        if (this.nativeRtpTransceiver == 0) {
            throw new java.lang.IllegalStateException("RtpTransceiver has been disposed.");
        }
    }

    private static native org.webrtc.RtpTransceiver.RtpTransceiverDirection nativeCurrentDirection(long j17);

    private static native org.webrtc.RtpTransceiver.RtpTransceiverDirection nativeDirection(long j17);

    private static native org.webrtc.MediaStreamTrack.MediaType nativeGetMediaType(long j17);

    private static native java.lang.String nativeGetMid(long j17);

    private static native org.webrtc.RtpReceiver nativeGetReceiver(long j17);

    private static native org.webrtc.RtpSender nativeGetSender(long j17);

    private static native boolean nativeSetDirection(long j17, org.webrtc.RtpTransceiver.RtpTransceiverDirection rtpTransceiverDirection);

    private static native void nativeStopInternal(long j17);

    private static native void nativeStopStandard(long j17);

    private static native boolean nativeStopped(long j17);

    public void dispose() {
        checkRtpTransceiverExists();
        this.cachedSender.dispose();
        this.cachedReceiver.dispose();
        org.webrtc.JniCommon.nativeReleaseRef(this.nativeRtpTransceiver);
        this.nativeRtpTransceiver = 0L;
    }

    public org.webrtc.RtpTransceiver.RtpTransceiverDirection getCurrentDirection() {
        checkRtpTransceiverExists();
        return nativeCurrentDirection(this.nativeRtpTransceiver);
    }

    public org.webrtc.RtpTransceiver.RtpTransceiverDirection getDirection() {
        checkRtpTransceiverExists();
        return nativeDirection(this.nativeRtpTransceiver);
    }

    public org.webrtc.MediaStreamTrack.MediaType getMediaType() {
        checkRtpTransceiverExists();
        return nativeGetMediaType(this.nativeRtpTransceiver);
    }

    public java.lang.String getMid() {
        checkRtpTransceiverExists();
        return nativeGetMid(this.nativeRtpTransceiver);
    }

    public org.webrtc.RtpReceiver getReceiver() {
        return this.cachedReceiver;
    }

    public org.webrtc.RtpSender getSender() {
        return this.cachedSender;
    }

    public boolean isStopped() {
        checkRtpTransceiverExists();
        return nativeStopped(this.nativeRtpTransceiver);
    }

    public boolean setDirection(org.webrtc.RtpTransceiver.RtpTransceiverDirection rtpTransceiverDirection) {
        checkRtpTransceiverExists();
        return nativeSetDirection(this.nativeRtpTransceiver, rtpTransceiverDirection);
    }

    public void stop() {
        checkRtpTransceiverExists();
        nativeStopInternal(this.nativeRtpTransceiver);
    }

    public void stopInternal() {
        checkRtpTransceiverExists();
        nativeStopInternal(this.nativeRtpTransceiver);
    }

    public void stopStandard() {
        checkRtpTransceiverExists();
        nativeStopStandard(this.nativeRtpTransceiver);
    }
}
