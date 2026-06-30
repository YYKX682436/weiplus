package org.webrtc;

/* loaded from: classes15.dex */
public class AudioSource extends org.webrtc.MediaSource {
    public AudioSource(long j17) {
        super(j17);
    }

    public long getNativeAudioSource() {
        return getNativeMediaSource();
    }
}
