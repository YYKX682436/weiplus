package com.tencent.trtc.hardwareearmonitor;

@com.tencent.liteav.base.annotations.JNINamespace("liteav::extensions")
/* loaded from: classes15.dex */
public class HardwareEarMonitorSilentTrack {
    private static final int DEFAULT_SAMPLE_RATE = 48000;
    private static final java.lang.String TAG = "HardwareEarMonitorSilentTrack";
    private com.tencent.trtc.hardwareearmonitor.HardwareEarMonitorSilentTrack.PlaybackThread mPlaybackThread;
    private int mChannelConfig = 12;
    private int mAudioFormat = 2;
    private boolean mIsPlaying = false;

    /* loaded from: classes15.dex */
    public class PlaybackThread extends java.lang.Thread {
        private boolean isStop = false;

        public PlaybackThread() {
        }

        public synchronized void closeThread() {
            this.isStop = true;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            int minBufferSize = android.media.AudioTrack.getMinBufferSize(48000, com.tencent.trtc.hardwareearmonitor.HardwareEarMonitorSilentTrack.this.mChannelConfig, com.tencent.trtc.hardwareearmonitor.HardwareEarMonitorSilentTrack.this.mAudioFormat);
            android.media.AudioTrack audioTrack = new android.media.AudioTrack(3, 48000, com.tencent.trtc.hardwareearmonitor.HardwareEarMonitorSilentTrack.this.mChannelConfig, com.tencent.trtc.hardwareearmonitor.HardwareEarMonitorSilentTrack.this.mAudioFormat, minBufferSize, 1);
            if (audioTrack.getState() == 1) {
                audioTrack.play();
                byte[] bArr = new byte[minBufferSize];
                for (int i17 = 0; i17 < minBufferSize; i17++) {
                    bArr[i17] = 0;
                }
                while (!this.isStop && !isInterrupted()) {
                    try {
                        audioTrack.write(bArr, 0, minBufferSize);
                    } catch (java.lang.Throwable th6) {
                        com.tencent.liteav.base.util.LiteavLog.e(com.tencent.trtc.hardwareearmonitor.HardwareEarMonitorSilentTrack.TAG, "audioTrack write,Throwable ex : %s", th6.getMessage());
                    }
                }
                audioTrack.stop();
                audioTrack.flush();
            }
            audioTrack.release();
        }
    }

    public static com.tencent.trtc.hardwareearmonitor.HardwareEarMonitorSilentTrack create() {
        return new com.tencent.trtc.hardwareearmonitor.HardwareEarMonitorSilentTrack();
    }

    public void StartAudioTrack() {
        if (this.mIsPlaying || this.mPlaybackThread != null) {
            return;
        }
        this.mIsPlaying = true;
        com.tencent.trtc.hardwareearmonitor.HardwareEarMonitorSilentTrack.PlaybackThread playbackThread = new com.tencent.trtc.hardwareearmonitor.HardwareEarMonitorSilentTrack.PlaybackThread();
        this.mPlaybackThread = playbackThread;
        playbackThread.start();
    }

    public void StopAudioTrack() {
        com.tencent.trtc.hardwareearmonitor.HardwareEarMonitorSilentTrack.PlaybackThread playbackThread = this.mPlaybackThread;
        if (playbackThread != null) {
            this.mIsPlaying = false;
            playbackThread.closeThread();
            try {
                this.mPlaybackThread.join();
            } catch (java.lang.Throwable th6) {
                com.tencent.liteav.base.util.LiteavLog.e(TAG, "mPlaybackThread join,Throwable ex : %s", th6.getMessage());
            }
            this.mPlaybackThread = null;
        }
    }
}
