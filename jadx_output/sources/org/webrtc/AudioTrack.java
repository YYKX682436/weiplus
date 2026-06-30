package org.webrtc;

/* loaded from: classes15.dex */
public class AudioTrack extends org.webrtc.MediaStreamTrack {
    public AudioTrack(long j17) {
        super(j17);
    }

    private static native void nativeSetVolume(long j17, double d17);

    public long getNativeAudioTrack() {
        return getNativeMediaStreamTrack();
    }

    public void setVolume(double d17) {
        nativeSetVolume(getNativeAudioTrack(), d17);
    }
}
