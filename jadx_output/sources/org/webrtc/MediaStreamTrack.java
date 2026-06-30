package org.webrtc;

/* loaded from: classes15.dex */
public class MediaStreamTrack {
    public static final java.lang.String AUDIO_TRACK_KIND = "audio";
    public static final java.lang.String VIDEO_TRACK_KIND = "video";
    private long nativeTrack;

    /* loaded from: classes11.dex */
    public enum MediaType {
        MEDIA_TYPE_AUDIO(0),
        MEDIA_TYPE_VIDEO(1);

        private final int nativeIndex;

        MediaType(int i17) {
            this.nativeIndex = i17;
        }

        public static org.webrtc.MediaStreamTrack.MediaType fromNativeIndex(int i17) {
            for (org.webrtc.MediaStreamTrack.MediaType mediaType : values()) {
                if (mediaType.getNative() == i17) {
                    return mediaType;
                }
            }
            throw new java.lang.IllegalArgumentException("Unknown native media type: " + i17);
        }

        public int getNative() {
            return this.nativeIndex;
        }
    }

    /* loaded from: classes6.dex */
    public enum State {
        LIVE,
        ENDED;

        public static org.webrtc.MediaStreamTrack.State fromNativeIndex(int i17) {
            return values()[i17];
        }
    }

    public MediaStreamTrack(long j17) {
        if (j17 == 0) {
            throw new java.lang.IllegalArgumentException("nativeTrack may not be null");
        }
        this.nativeTrack = j17;
    }

    private void checkMediaStreamTrackExists() {
        if (this.nativeTrack == 0) {
            throw new java.lang.IllegalStateException("MediaStreamTrack has been disposed.");
        }
    }

    public static org.webrtc.MediaStreamTrack createMediaStreamTrack(long j17) {
        if (j17 == 0) {
            return null;
        }
        java.lang.String nativeGetKind = nativeGetKind(j17);
        if (nativeGetKind.equals("audio")) {
            return new org.webrtc.AudioTrack(j17);
        }
        if (nativeGetKind.equals("video")) {
            return new org.webrtc.VideoTrack(j17);
        }
        return null;
    }

    private static native boolean nativeGetEnabled(long j17);

    private static native java.lang.String nativeGetId(long j17);

    private static native java.lang.String nativeGetKind(long j17);

    private static native org.webrtc.MediaStreamTrack.State nativeGetState(long j17);

    private static native boolean nativeSetEnabled(long j17, boolean z17);

    public void dispose() {
        checkMediaStreamTrackExists();
        org.webrtc.JniCommon.nativeReleaseRef(this.nativeTrack);
        this.nativeTrack = 0L;
    }

    public boolean enabled() {
        checkMediaStreamTrackExists();
        return nativeGetEnabled(this.nativeTrack);
    }

    public long getNativeMediaStreamTrack() {
        checkMediaStreamTrackExists();
        return this.nativeTrack;
    }

    public java.lang.String id() {
        checkMediaStreamTrackExists();
        return nativeGetId(this.nativeTrack);
    }

    public java.lang.String kind() {
        checkMediaStreamTrackExists();
        return nativeGetKind(this.nativeTrack);
    }

    public boolean setEnabled(boolean z17) {
        checkMediaStreamTrackExists();
        return nativeSetEnabled(this.nativeTrack, z17);
    }

    public org.webrtc.MediaStreamTrack.State state() {
        checkMediaStreamTrackExists();
        return nativeGetState(this.nativeTrack);
    }
}
