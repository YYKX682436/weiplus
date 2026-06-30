package org.webrtc.voiceengine;

/* loaded from: classes15.dex */
public class WebRtcAudioManager {
    private static final int BITS_PER_SAMPLE = 16;
    private static final boolean DEBUG = false;
    private static final int DEFAULT_FRAME_PER_BUFFER = 256;
    private static final java.lang.String TAG = "WebRtcAudioManager";
    private static final boolean blacklistDeviceForAAudioUsage = true;
    private static boolean blacklistDeviceForOpenSLESUsage;
    private static boolean blacklistDeviceForOpenSLESUsageIsOverridden;
    private static boolean useStereoInput;
    private static boolean useStereoOutput;
    private boolean aAudio;
    private final android.media.AudioManager audioManager;
    private boolean hardwareAEC;
    private boolean hardwareAGC;
    private boolean hardwareNS;
    private boolean initialized;
    private int inputBufferSize;
    private int inputChannels;
    private boolean lowLatencyInput;
    private boolean lowLatencyOutput;
    private final long nativeAudioManager;
    private int nativeChannels;
    private int nativeSampleRate;
    private int outputBufferSize;
    private int outputChannels;
    private boolean proAudio;
    private int sampleRate;
    private final org.webrtc.voiceengine.WebRtcAudioManager.VolumeLogger volumeLogger;

    /* loaded from: classes15.dex */
    public static class VolumeLogger {
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
                int mode = org.webrtc.voiceengine.WebRtcAudioManager.VolumeLogger.this.audioManager.getMode();
                if (mode == 1) {
                    org.webrtc.Logging.d(org.webrtc.voiceengine.WebRtcAudioManager.TAG, "STREAM_RING stream volume: " + org.webrtc.voiceengine.WebRtcAudioManager.VolumeLogger.this.audioManager.getStreamVolume(2) + " (max=" + this.maxRingVolume + ")");
                    return;
                }
                if (mode == 3) {
                    org.webrtc.Logging.d(org.webrtc.voiceengine.WebRtcAudioManager.TAG, "VOICE_CALL stream volume: " + org.webrtc.voiceengine.WebRtcAudioManager.VolumeLogger.this.audioManager.getStreamVolume(0) + " (max=" + this.maxVoiceCallVolume + ")");
                }
            }
        }

        public VolumeLogger(android.media.AudioManager audioManager) {
            this.audioManager = audioManager;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void stop() {
            java.util.Timer timer = this.timer;
            if (timer != null) {
                timer.cancel();
                this.timer = null;
            }
        }

        public void start() {
            java.util.Timer timer = new java.util.Timer(THREAD_NAME);
            this.timer = timer;
            timer.schedule(new org.webrtc.voiceengine.WebRtcAudioManager.VolumeLogger.LogVolumeTask(this.audioManager.getStreamMaxVolume(2), this.audioManager.getStreamMaxVolume(0)), 0L, 30000L);
        }
    }

    public WebRtcAudioManager(long j17) {
        org.webrtc.Logging.d(TAG, "ctor" + org.webrtc.voiceengine.WebRtcAudioUtils.getThreadInfo());
        this.nativeAudioManager = j17;
        android.media.AudioManager audioManager = (android.media.AudioManager) org.webrtc.ContextUtils.getApplicationContext().getSystemService("audio");
        this.audioManager = audioManager;
        this.volumeLogger = new org.webrtc.voiceengine.WebRtcAudioManager.VolumeLogger(audioManager);
        storeAudioParameters();
        nativeCacheAudioParameters(this.sampleRate, this.outputChannels, this.inputChannels, this.hardwareAEC, this.hardwareAGC, this.hardwareNS, this.lowLatencyOutput, this.lowLatencyInput, this.proAudio, this.aAudio, this.outputBufferSize, this.inputBufferSize, j17);
        org.webrtc.voiceengine.WebRtcAudioUtils.logAudioState(TAG);
    }

    private static void assertTrue(boolean z17) {
        if (!z17) {
            throw new java.lang.AssertionError("Expected condition to be true");
        }
    }

    private void dispose() {
        org.webrtc.Logging.d(TAG, "dispose" + org.webrtc.voiceengine.WebRtcAudioUtils.getThreadInfo());
        if (this.initialized) {
            this.volumeLogger.stop();
        }
    }

    private int getLowLatencyInputFramesPerBuffer() {
        assertTrue(isLowLatencyInputSupported());
        return getLowLatencyOutputFramesPerBuffer();
    }

    private int getLowLatencyOutputFramesPerBuffer() {
        assertTrue(isLowLatencyOutputSupported());
        java.lang.String property = this.audioManager.getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER");
        if (property == null) {
            return 256;
        }
        return java.lang.Integer.parseInt(property);
    }

    private static int getMinInputFrameSize(int i17, int i18) {
        return android.media.AudioRecord.getMinBufferSize(i17, i18 == 1 ? 16 : 12, 2) / (i18 * 2);
    }

    private static int getMinOutputFrameSize(int i17, int i18) {
        return android.media.AudioTrack.getMinBufferSize(i17, i18 == 1 ? 4 : 12, 2) / (i18 * 2);
    }

    private int getNativeOutputSampleRate() {
        if (org.webrtc.voiceengine.WebRtcAudioUtils.runningOnEmulator()) {
            org.webrtc.Logging.d(TAG, "Running emulator, overriding sample rate to 8 kHz.");
            return 8000;
        }
        if (org.webrtc.voiceengine.WebRtcAudioUtils.isDefaultSampleRateOverridden()) {
            org.webrtc.Logging.d(TAG, "Default sample rate is overriden to " + org.webrtc.voiceengine.WebRtcAudioUtils.getDefaultSampleRateHz() + " Hz");
            return org.webrtc.voiceengine.WebRtcAudioUtils.getDefaultSampleRateHz();
        }
        int sampleRateForApiLevel = getSampleRateForApiLevel();
        org.webrtc.Logging.d(TAG, "Sample rate is set to " + sampleRateForApiLevel + " Hz");
        return sampleRateForApiLevel;
    }

    private int getSampleRateForApiLevel() {
        java.lang.String property = this.audioManager.getProperty("android.media.property.OUTPUT_SAMPLE_RATE");
        return property == null ? org.webrtc.voiceengine.WebRtcAudioUtils.getDefaultSampleRateHz() : java.lang.Integer.parseInt(property);
    }

    public static synchronized boolean getStereoInput() {
        boolean z17;
        synchronized (org.webrtc.voiceengine.WebRtcAudioManager.class) {
            z17 = useStereoInput;
        }
        return z17;
    }

    public static synchronized boolean getStereoOutput() {
        boolean z17;
        synchronized (org.webrtc.voiceengine.WebRtcAudioManager.class) {
            z17 = useStereoOutput;
        }
        return z17;
    }

    private boolean hasEarpiece() {
        return org.webrtc.ContextUtils.getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.telephony");
    }

    private boolean init() {
        org.webrtc.Logging.d(TAG, com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT + org.webrtc.voiceengine.WebRtcAudioUtils.getThreadInfo());
        if (this.initialized) {
            return true;
        }
        org.webrtc.Logging.d(TAG, "audio mode is: " + org.webrtc.voiceengine.WebRtcAudioUtils.modeToString(this.audioManager.getMode()));
        this.initialized = true;
        this.volumeLogger.start();
        return true;
    }

    private boolean isAAudioSupported() {
        org.webrtc.Logging.w(TAG, "AAudio support is currently disabled on all devices!");
        return false;
    }

    private static boolean isAcousticEchoCancelerSupported() {
        return org.webrtc.voiceengine.WebRtcAudioEffects.canUseAcousticEchoCanceler();
    }

    private boolean isCommunicationModeEnabled() {
        return this.audioManager.getMode() == 3;
    }

    private boolean isDeviceBlacklistedForOpenSLESUsage() {
        boolean deviceIsBlacklistedForOpenSLESUsage = blacklistDeviceForOpenSLESUsageIsOverridden ? blacklistDeviceForOpenSLESUsage : org.webrtc.voiceengine.WebRtcAudioUtils.deviceIsBlacklistedForOpenSLESUsage();
        if (deviceIsBlacklistedForOpenSLESUsage) {
            org.webrtc.Logging.d(TAG, android.os.Build.MODEL + " is blacklisted for OpenSL ES usage!");
        }
        return deviceIsBlacklistedForOpenSLESUsage;
    }

    private boolean isLowLatencyOutputSupported() {
        return org.webrtc.ContextUtils.getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.audio.low_latency");
    }

    private static boolean isNoiseSuppressorSupported() {
        return org.webrtc.voiceengine.WebRtcAudioEffects.canUseNoiseSuppressor();
    }

    private boolean isProAudioSupported() {
        return org.webrtc.ContextUtils.getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.audio.pro");
    }

    private native void nativeCacheAudioParameters(int i17, int i18, int i19, boolean z17, boolean z18, boolean z19, boolean z27, boolean z28, boolean z29, boolean z37, int i27, int i28, long j17);

    public static synchronized void setBlacklistDeviceForOpenSLESUsage(boolean z17) {
        synchronized (org.webrtc.voiceengine.WebRtcAudioManager.class) {
            blacklistDeviceForOpenSLESUsageIsOverridden = true;
            blacklistDeviceForOpenSLESUsage = z17;
        }
    }

    public static synchronized void setStereoInput(boolean z17) {
        synchronized (org.webrtc.voiceengine.WebRtcAudioManager.class) {
            org.webrtc.Logging.w(TAG, "Overriding default input behavior: setStereoInput(" + z17 + ')');
            useStereoInput = z17;
        }
    }

    public static synchronized void setStereoOutput(boolean z17) {
        synchronized (org.webrtc.voiceengine.WebRtcAudioManager.class) {
            org.webrtc.Logging.w(TAG, "Overriding default output behavior: setStereoOutput(" + z17 + ')');
            useStereoOutput = z17;
        }
    }

    private void storeAudioParameters() {
        this.outputChannels = getStereoOutput() ? 2 : 1;
        this.inputChannels = getStereoInput() ? 2 : 1;
        this.sampleRate = getNativeOutputSampleRate();
        this.hardwareAEC = isAcousticEchoCancelerSupported();
        this.hardwareAGC = false;
        this.hardwareNS = isNoiseSuppressorSupported();
        this.lowLatencyOutput = isLowLatencyOutputSupported();
        this.lowLatencyInput = isLowLatencyInputSupported();
        this.proAudio = isProAudioSupported();
        this.aAudio = isAAudioSupported();
        this.outputBufferSize = this.lowLatencyOutput ? getLowLatencyOutputFramesPerBuffer() : getMinOutputFrameSize(this.sampleRate, this.outputChannels);
        this.inputBufferSize = this.lowLatencyInput ? getLowLatencyInputFramesPerBuffer() : getMinInputFrameSize(this.sampleRate, this.inputChannels);
    }

    public boolean isLowLatencyInputSupported() {
        return isLowLatencyOutputSupported();
    }
}
