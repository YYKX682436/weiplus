package org.webrtc;

/* loaded from: classes16.dex */
public class MediaSource {
    private long nativeSource;
    private final org.webrtc.RefCountDelegate refCountDelegate;

    /* loaded from: classes6.dex */
    public enum State {
        INITIALIZING,
        LIVE,
        ENDED,
        MUTED;

        public static org.webrtc.MediaSource.State fromNativeIndex(int i17) {
            return values()[i17];
        }
    }

    public MediaSource(final long j17) {
        this.refCountDelegate = new org.webrtc.RefCountDelegate(new java.lang.Runnable() { // from class: org.webrtc.MediaSource$$a
            @Override // java.lang.Runnable
            public final void run() {
                org.webrtc.JniCommon.nativeReleaseRef(j17);
            }
        });
        this.nativeSource = j17;
    }

    private void checkMediaSourceExists() {
        if (this.nativeSource == 0) {
            throw new java.lang.IllegalStateException("MediaSource has been disposed.");
        }
    }

    private static native org.webrtc.MediaSource.State nativeGetState(long j17);

    public void dispose() {
        checkMediaSourceExists();
        this.refCountDelegate.release();
        this.nativeSource = 0L;
    }

    public long getNativeMediaSource() {
        checkMediaSourceExists();
        return this.nativeSource;
    }

    public void runWithReference(java.lang.Runnable runnable) {
        if (this.refCountDelegate.safeRetain()) {
            try {
                runnable.run();
            } finally {
                this.refCountDelegate.release();
            }
        }
    }

    public org.webrtc.MediaSource.State state() {
        checkMediaSourceExists();
        return nativeGetState(this.nativeSource);
    }
}
