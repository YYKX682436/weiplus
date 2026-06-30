package org.webrtc.audio;

/* loaded from: classes15.dex */
class VolumeLogger {
    private static final java.lang.String TAG = "VolumeLogger";
    private static final java.lang.String THREAD_NAME = "WebRtcVolumeLevelLoggerThread";
    private static final int TIMER_PERIOD_IN_SECONDS = 30;
    private final android.media.AudioManager audioManager;
    private java.util.Timer timer;

    /* loaded from: classes15.dex */
    public class LogVolumeTask extends java.util.TimerTask {
        private final int maxRingVolume;
        private final int maxVoiceCallVolume;

        public LogVolumeTask(int i17, int i18) {
            this.maxRingVolume = i17;
            this.maxVoiceCallVolume = i18;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            int mode = org.webrtc.audio.VolumeLogger.this.audioManager.getMode();
            if (mode == 1) {
                org.webrtc.Logging.d(org.webrtc.audio.VolumeLogger.TAG, "STREAM_RING stream volume: " + org.webrtc.audio.VolumeLogger.this.audioManager.getStreamVolume(2) + " (max=" + this.maxRingVolume + ")");
                return;
            }
            if (mode == 3) {
                org.webrtc.Logging.d(org.webrtc.audio.VolumeLogger.TAG, "VOICE_CALL stream volume: " + org.webrtc.audio.VolumeLogger.this.audioManager.getStreamVolume(0) + " (max=" + this.maxVoiceCallVolume + ")");
            }
        }
    }

    public VolumeLogger(android.media.AudioManager audioManager) {
        this.audioManager = audioManager;
    }

    public void start() {
        org.webrtc.Logging.d(TAG, "start" + org.webrtc.audio.WebRtcAudioUtils.getThreadInfo());
        if (this.timer != null) {
            return;
        }
        org.webrtc.Logging.d(TAG, "audio mode is: " + org.webrtc.audio.WebRtcAudioUtils.modeToString(this.audioManager.getMode()));
        java.util.Timer timer = new java.util.Timer(THREAD_NAME);
        this.timer = timer;
        timer.schedule(new org.webrtc.audio.VolumeLogger.LogVolumeTask(this.audioManager.getStreamMaxVolume(2), this.audioManager.getStreamMaxVolume(0)), 0L, 30000L);
    }

    public void stop() {
        org.webrtc.Logging.d(TAG, "stop" + org.webrtc.audio.WebRtcAudioUtils.getThreadInfo());
        java.util.Timer timer = this.timer;
        if (timer != null) {
            timer.cancel();
            this.timer = null;
        }
    }
}
