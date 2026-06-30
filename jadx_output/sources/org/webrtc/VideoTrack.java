package org.webrtc;

/* loaded from: classes15.dex */
public class VideoTrack extends org.webrtc.MediaStreamTrack {
    private final java.util.IdentityHashMap<org.webrtc.VideoSink, java.lang.Long> sinks;

    public VideoTrack(long j17) {
        super(j17);
        this.sinks = new java.util.IdentityHashMap<>();
    }

    private static native void nativeAddSink(long j17, long j18);

    private static native void nativeFreeSink(long j17);

    private static native void nativeRemoveSink(long j17, long j18);

    private static native long nativeWrapSink(org.webrtc.VideoSink videoSink);

    public void addSink(org.webrtc.VideoSink videoSink) {
        if (videoSink == null) {
            throw new java.lang.IllegalArgumentException("The VideoSink is not allowed to be null");
        }
        if (this.sinks.containsKey(videoSink)) {
            return;
        }
        long nativeWrapSink = nativeWrapSink(videoSink);
        this.sinks.put(videoSink, java.lang.Long.valueOf(nativeWrapSink));
        nativeAddSink(getNativeMediaStreamTrack(), nativeWrapSink);
    }

    @Override // org.webrtc.MediaStreamTrack
    public void dispose() {
        java.util.Iterator<java.lang.Long> it = this.sinks.values().iterator();
        while (it.hasNext()) {
            long longValue = it.next().longValue();
            nativeRemoveSink(getNativeMediaStreamTrack(), longValue);
            nativeFreeSink(longValue);
        }
        this.sinks.clear();
        super.dispose();
    }

    public long getNativeVideoTrack() {
        return getNativeMediaStreamTrack();
    }

    public void removeSink(org.webrtc.VideoSink videoSink) {
        java.lang.Long remove = this.sinks.remove(videoSink);
        if (remove != null) {
            nativeRemoveSink(getNativeMediaStreamTrack(), remove.longValue());
            nativeFreeSink(remove.longValue());
        }
    }
}
