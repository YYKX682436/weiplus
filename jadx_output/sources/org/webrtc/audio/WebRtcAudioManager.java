package org.webrtc.audio;

/* loaded from: classes14.dex */
class WebRtcAudioManager {
    private static final int BITS_PER_SAMPLE = 16;
    private static final int DEFAULT_FRAME_PER_BUFFER = 256;
    private static final int DEFAULT_SAMPLE_RATE_HZ = 16000;
    private static final java.lang.String TAG = "WebRtcAudioManagerExternal";

    public static android.media.AudioManager getAudioManager(android.content.Context context) {
        return (android.media.AudioManager) context.getSystemService("audio");
    }

    public static int getInputBufferSize(android.content.Context context, android.media.AudioManager audioManager, int i17, int i18) {
        return isLowLatencyInputSupported(context) ? getLowLatencyFramesPerBuffer(audioManager) : getMinInputFrameSize(i17, i18);
    }

    private static int getLowLatencyFramesPerBuffer(android.media.AudioManager audioManager) {
        java.lang.String property = audioManager.getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER");
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

    public static int getOutputBufferSize(android.content.Context context, android.media.AudioManager audioManager, int i17, int i18) {
        return isLowLatencyOutputSupported(context) ? getLowLatencyFramesPerBuffer(audioManager) : getMinOutputFrameSize(i17, i18);
    }

    public static int getSampleRate(android.media.AudioManager audioManager) {
        if (org.webrtc.audio.WebRtcAudioUtils.runningOnEmulator()) {
            org.webrtc.Logging.d(TAG, "Running emulator, overriding sample rate to 8 kHz.");
            return 8000;
        }
        int sampleRateForApiLevel = getSampleRateForApiLevel(audioManager);
        org.webrtc.Logging.d(TAG, "Sample rate is set to " + sampleRateForApiLevel + " Hz");
        return sampleRateForApiLevel;
    }

    private static int getSampleRateForApiLevel(android.media.AudioManager audioManager) {
        java.lang.String property = audioManager.getProperty("android.media.property.OUTPUT_SAMPLE_RATE");
        if (property == null) {
            return 16000;
        }
        return java.lang.Integer.parseInt(property);
    }

    private static boolean isLowLatencyInputSupported(android.content.Context context) {
        return isLowLatencyOutputSupported(context);
    }

    private static boolean isLowLatencyOutputSupported(android.content.Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.audio.low_latency");
    }
}
