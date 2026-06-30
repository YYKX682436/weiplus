package org.webrtc;

/* loaded from: classes15.dex */
public class MediaStream {
    private static final java.lang.String TAG = "MediaStream";
    private long nativeStream;
    public final java.util.List<org.webrtc.AudioTrack> audioTracks = new java.util.ArrayList();
    public final java.util.List<org.webrtc.VideoTrack> videoTracks = new java.util.ArrayList();
    public final java.util.List<org.webrtc.VideoTrack> preservedVideoTracks = new java.util.ArrayList();

    public MediaStream(long j17) {
        this.nativeStream = j17;
    }

    private void checkMediaStreamExists() {
        if (this.nativeStream == 0) {
            throw new java.lang.IllegalStateException("MediaStream has been disposed.");
        }
    }

    private static native boolean nativeAddAudioTrackToNativeStream(long j17, long j18);

    private static native boolean nativeAddVideoTrackToNativeStream(long j17, long j18);

    private static native java.lang.String nativeGetId(long j17);

    private static native boolean nativeRemoveAudioTrack(long j17, long j18);

    private static native boolean nativeRemoveVideoTrack(long j17, long j18);

    private static void removeMediaStreamTrack(java.util.List<? extends org.webrtc.MediaStreamTrack> list, long j17) {
        java.util.Iterator<? extends org.webrtc.MediaStreamTrack> it = list.iterator();
        while (it.hasNext()) {
            org.webrtc.MediaStreamTrack next = it.next();
            if (next.getNativeMediaStreamTrack() == j17) {
                next.dispose();
                it.remove();
                return;
            }
        }
        org.webrtc.Logging.e(TAG, "Couldn't not find track");
    }

    public void addNativeAudioTrack(long j17) {
        this.audioTracks.add(new org.webrtc.AudioTrack(j17));
    }

    public void addNativeVideoTrack(long j17) {
        this.videoTracks.add(new org.webrtc.VideoTrack(j17));
    }

    public boolean addPreservedTrack(org.webrtc.VideoTrack videoTrack) {
        checkMediaStreamExists();
        if (!nativeAddVideoTrackToNativeStream(this.nativeStream, videoTrack.getNativeVideoTrack())) {
            return false;
        }
        this.preservedVideoTracks.add(videoTrack);
        return true;
    }

    public boolean addTrack(org.webrtc.AudioTrack audioTrack) {
        checkMediaStreamExists();
        if (!nativeAddAudioTrackToNativeStream(this.nativeStream, audioTrack.getNativeAudioTrack())) {
            return false;
        }
        this.audioTracks.add(audioTrack);
        return true;
    }

    public void dispose() {
        checkMediaStreamExists();
        while (!this.audioTracks.isEmpty()) {
            org.webrtc.AudioTrack audioTrack = this.audioTracks.get(0);
            removeTrack(audioTrack);
            audioTrack.dispose();
        }
        while (!this.videoTracks.isEmpty()) {
            org.webrtc.VideoTrack videoTrack = this.videoTracks.get(0);
            removeTrack(videoTrack);
            videoTrack.dispose();
        }
        while (!this.preservedVideoTracks.isEmpty()) {
            removeTrack(this.preservedVideoTracks.get(0));
        }
        org.webrtc.JniCommon.nativeReleaseRef(this.nativeStream);
        this.nativeStream = 0L;
    }

    public java.lang.String getId() {
        checkMediaStreamExists();
        return nativeGetId(this.nativeStream);
    }

    public long getNativeMediaStream() {
        checkMediaStreamExists();
        return this.nativeStream;
    }

    public void removeAudioTrack(long j17) {
        removeMediaStreamTrack(this.audioTracks, j17);
    }

    public boolean removeTrack(org.webrtc.AudioTrack audioTrack) {
        checkMediaStreamExists();
        this.audioTracks.remove(audioTrack);
        return nativeRemoveAudioTrack(this.nativeStream, audioTrack.getNativeAudioTrack());
    }

    public void removeVideoTrack(long j17) {
        removeMediaStreamTrack(this.videoTracks, j17);
    }

    public java.lang.String toString() {
        return "[" + getId() + ":A=" + this.audioTracks.size() + ":V=" + this.videoTracks.size() + "]";
    }

    public boolean addTrack(org.webrtc.VideoTrack videoTrack) {
        checkMediaStreamExists();
        if (!nativeAddVideoTrackToNativeStream(this.nativeStream, videoTrack.getNativeVideoTrack())) {
            return false;
        }
        this.videoTracks.add(videoTrack);
        return true;
    }

    public boolean removeTrack(org.webrtc.VideoTrack videoTrack) {
        checkMediaStreamExists();
        this.videoTracks.remove(videoTrack);
        this.preservedVideoTracks.remove(videoTrack);
        return nativeRemoveVideoTrack(this.nativeStream, videoTrack.getNativeVideoTrack());
    }
}
