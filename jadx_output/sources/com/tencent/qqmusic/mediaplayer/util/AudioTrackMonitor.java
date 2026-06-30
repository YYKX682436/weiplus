package com.tencent.qqmusic.mediaplayer.util;

/* loaded from: classes16.dex */
public class AudioTrackMonitor {
    private static final boolean ENABLE = false;
    private static final java.lang.String TAG = "AudioTrackMonitor";
    private java.lang.ref.WeakReference<android.media.AudioTrack> mAudioTrackRef;
    private long mLastTime = java.lang.System.nanoTime();
    private long mLastPosition = 0;
    private int mLooperTime = 200;
    private boolean mStop = false;
    private java.lang.StringBuilder mBuilder = new java.lang.StringBuilder(100);
    private java.lang.Thread mMonitorThread = new java.lang.Thread("Monitor-AudioTrack") { // from class: com.tencent.qqmusic.mediaplayer.util.AudioTrackMonitor.1
        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            super.run();
            while (!com.tencent.qqmusic.mediaplayer.util.AudioTrackMonitor.this.mStop) {
                try {
                    java.lang.Thread.currentThread();
                    java.lang.Thread.sleep(com.tencent.qqmusic.mediaplayer.util.AudioTrackMonitor.this.mLooperTime);
                } catch (java.lang.Throwable th6) {
                    com.tencent.qqmusic.mediaplayer.util.Logger.e(com.tencent.qqmusic.mediaplayer.util.AudioTrackMonitor.TAG, th6);
                }
                try {
                } catch (java.lang.Throwable th7) {
                    com.tencent.qqmusic.mediaplayer.util.Logger.e(com.tencent.qqmusic.mediaplayer.util.AudioTrackMonitor.TAG, th7);
                }
                if (com.tencent.qqmusic.mediaplayer.util.AudioTrackMonitor.this.mAudioTrackRef == null || com.tencent.qqmusic.mediaplayer.util.AudioTrackMonitor.this.mAudioTrackRef.get() == null) {
                    return;
                }
                android.media.AudioTrack audioTrack = (android.media.AudioTrack) com.tencent.qqmusic.mediaplayer.util.AudioTrackMonitor.this.mAudioTrackRef.get();
                if (audioTrack != null) {
                    long playbackHeadPosition = audioTrack.getPlaybackHeadPosition();
                    long j17 = playbackHeadPosition - com.tencent.qqmusic.mediaplayer.util.AudioTrackMonitor.this.mLastPosition;
                    com.tencent.qqmusic.mediaplayer.util.AudioTrackMonitor.this.mLastPosition = playbackHeadPosition;
                    long nanoTime = java.lang.System.nanoTime() - com.tencent.qqmusic.mediaplayer.util.AudioTrackMonitor.this.mLastTime;
                    com.tencent.qqmusic.mediaplayer.util.AudioTrackMonitor.this.mLastTime = java.lang.System.nanoTime();
                    java.lang.StringBuilder sb6 = com.tencent.qqmusic.mediaplayer.util.AudioTrackMonitor.this.mBuilder;
                    sb6.append("play-speedTime-");
                    sb6.append(nanoTime);
                    sb6.append(",play-speedPosition-");
                    sb6.append(j17);
                    java.lang.StringBuilder sb7 = com.tencent.qqmusic.mediaplayer.util.AudioTrackMonitor.this.mBuilder;
                    sb7.append(",playstate-");
                    sb7.append(audioTrack.getPlayState());
                    com.tencent.qqmusic.mediaplayer.util.Logger.e(com.tencent.qqmusic.mediaplayer.util.AudioTrackMonitor.TAG, com.tencent.qqmusic.mediaplayer.util.AudioTrackMonitor.this.mBuilder.toString());
                    com.tencent.qqmusic.mediaplayer.util.AudioTrackMonitor.this.mBuilder.delete(0, com.tencent.qqmusic.mediaplayer.util.AudioTrackMonitor.this.mBuilder.length());
                }
            }
        }
    };

    public AudioTrackMonitor(android.media.AudioTrack audioTrack) {
        this.mAudioTrackRef = null;
        this.mAudioTrackRef = new java.lang.ref.WeakReference<>(audioTrack);
    }

    public void start() {
    }

    public void stop() {
    }
}
