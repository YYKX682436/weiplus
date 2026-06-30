package org.webrtc.voiceengine;

/* loaded from: classes15.dex */
public final class WebRtcAudioUtils {
    private static final int DEFAULT_SAMPLE_RATE_HZ = 16000;
    private static final java.lang.String TAG = "WebRtcAudioUtils";
    private static int defaultSampleRateHz = 16000;
    private static boolean isDefaultSampleRateOverridden;
    private static boolean useWebRtcBasedAcousticEchoCanceler;
    private static boolean useWebRtcBasedNoiseSuppressor;
    private static final java.lang.String[] BLACKLISTED_OPEN_SL_ES_MODELS = new java.lang.String[0];
    private static final java.lang.String[] BLACKLISTED_AEC_MODELS = new java.lang.String[0];
    private static final java.lang.String[] BLACKLISTED_NS_MODELS = new java.lang.String[0];

    public static boolean deviceIsBlacklistedForOpenSLESUsage() {
        return java.util.Arrays.asList(BLACKLISTED_OPEN_SL_ES_MODELS).contains(android.os.Build.MODEL);
    }

    private static java.lang.String deviceTypeToString(int i17) {
        switch (i17) {
            case 1:
                return "TYPE_BUILTIN_EARPIECE";
            case 2:
                return "TYPE_BUILTIN_SPEAKER";
            case 3:
                return "TYPE_WIRED_HEADSET";
            case 4:
                return "TYPE_WIRED_HEADPHONES";
            case 5:
                return "TYPE_LINE_ANALOG";
            case 6:
                return "TYPE_LINE_DIGITAL";
            case 7:
                return "TYPE_BLUETOOTH_SCO";
            case 8:
                return "TYPE_BLUETOOTH_A2DP";
            case 9:
                return "TYPE_HDMI";
            case 10:
                return "TYPE_HDMI_ARC";
            case 11:
                return "TYPE_USB_DEVICE";
            case 12:
                return "TYPE_USB_ACCESSORY";
            case 13:
                return "TYPE_DOCK";
            case 14:
                return "TYPE_FM";
            case 15:
                return "TYPE_BUILTIN_MIC";
            case 16:
                return "TYPE_FM_TUNER";
            case 17:
                return "TYPE_TV_TUNER";
            case 18:
                return "TYPE_TELEPHONY";
            case 19:
                return "TYPE_AUX_LINE";
            case 20:
                return "TYPE_IP";
            case 21:
                return "TYPE_BUS";
            case 22:
                return "TYPE_USB_HEADSET";
            default:
                return "TYPE_UNKNOWN";
        }
    }

    public static java.util.List<java.lang.String> getBlackListedModelsForAecUsage() {
        return java.util.Arrays.asList(BLACKLISTED_AEC_MODELS);
    }

    public static java.util.List<java.lang.String> getBlackListedModelsForNsUsage() {
        return java.util.Arrays.asList(BLACKLISTED_NS_MODELS);
    }

    public static synchronized int getDefaultSampleRateHz() {
        int i17;
        synchronized (org.webrtc.voiceengine.WebRtcAudioUtils.class) {
            i17 = defaultSampleRateHz;
        }
        return i17;
    }

    public static java.lang.String getThreadInfo() {
        return "@[name=" + java.lang.Thread.currentThread().getName() + ", id=" + java.lang.Thread.currentThread().getId() + "]";
    }

    private static boolean hasMicrophone() {
        return org.webrtc.ContextUtils.getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.microphone");
    }

    public static boolean isAcousticEchoCancelerSupported() {
        return org.webrtc.voiceengine.WebRtcAudioEffects.canUseAcousticEchoCanceler();
    }

    public static boolean isAutomaticGainControlSupported() {
        return false;
    }

    public static synchronized boolean isDefaultSampleRateOverridden() {
        boolean z17;
        synchronized (org.webrtc.voiceengine.WebRtcAudioUtils.class) {
            z17 = isDefaultSampleRateOverridden;
        }
        return z17;
    }

    public static boolean isNoiseSuppressorSupported() {
        return org.webrtc.voiceengine.WebRtcAudioEffects.canUseNoiseSuppressor();
    }

    private static boolean isVolumeFixed(android.media.AudioManager audioManager) {
        return audioManager.isVolumeFixed();
    }

    private static void logAudioDeviceInfo(java.lang.String str, android.media.AudioManager audioManager) {
        android.media.AudioDeviceInfo[] devices = audioManager.getDevices(3);
        if (devices.length == 0) {
            return;
        }
        org.webrtc.Logging.d(str, "Audio Devices: ");
        for (android.media.AudioDeviceInfo audioDeviceInfo : devices) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("  ");
            sb6.append(deviceTypeToString(audioDeviceInfo.getType()));
            sb6.append(audioDeviceInfo.isSource() ? "(in): " : "(out): ");
            if (audioDeviceInfo.getChannelCounts().length > 0) {
                sb6.append("channels=");
                sb6.append(java.util.Arrays.toString(audioDeviceInfo.getChannelCounts()));
                sb6.append(", ");
            }
            if (audioDeviceInfo.getEncodings().length > 0) {
                sb6.append("encodings=");
                sb6.append(java.util.Arrays.toString(audioDeviceInfo.getEncodings()));
                sb6.append(", ");
            }
            if (audioDeviceInfo.getSampleRates().length > 0) {
                sb6.append("sample rates=");
                sb6.append(java.util.Arrays.toString(audioDeviceInfo.getSampleRates()));
                sb6.append(", ");
            }
            sb6.append("id=");
            sb6.append(audioDeviceInfo.getId());
            org.webrtc.Logging.d(str, sb6.toString());
        }
    }

    public static void logAudioState(java.lang.String str) {
        logDeviceInfo(str);
        android.media.AudioManager audioManager = (android.media.AudioManager) org.webrtc.ContextUtils.getApplicationContext().getSystemService("audio");
        logAudioStateBasic(str, audioManager);
        logAudioStateVolume(str, audioManager);
        logAudioDeviceInfo(str, audioManager);
    }

    private static void logAudioStateBasic(java.lang.String str, android.media.AudioManager audioManager) {
        org.webrtc.Logging.d(str, "Audio State: audio mode: " + modeToString(audioManager.getMode()) + ", has mic: " + hasMicrophone() + ", mic muted: " + audioManager.isMicrophoneMute() + ", music active: " + audioManager.isMusicActive() + ", speakerphone: " + audioManager.isSpeakerphoneOn() + ", BT SCO: " + audioManager.isBluetoothScoOn());
    }

    private static void logAudioStateVolume(java.lang.String str, android.media.AudioManager audioManager) {
        int[] iArr = {0, 3, 2, 4, 5, 1};
        org.webrtc.Logging.d(str, "Audio State: ");
        boolean isVolumeFixed = isVolumeFixed(audioManager);
        org.webrtc.Logging.d(str, "  fixed volume=" + isVolumeFixed);
        if (isVolumeFixed) {
            return;
        }
        for (int i17 = 0; i17 < 6; i17++) {
            int i18 = iArr[i17];
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append("  " + streamTypeToString(i18) + ": ");
            sb6.append("volume=");
            sb6.append(audioManager.getStreamVolume(i18));
            sb6.append(", max=");
            sb6.append(audioManager.getStreamMaxVolume(i18));
            logIsStreamMute(str, audioManager, i18, sb6);
            org.webrtc.Logging.d(str, sb6.toString());
        }
    }

    public static void logDeviceInfo(java.lang.String str) {
        org.webrtc.Logging.d(str, "Android SDK: " + android.os.Build.VERSION.SDK_INT + ", Release: " + android.os.Build.VERSION.RELEASE + ", Brand: " + android.os.Build.BRAND + ", Device: " + android.os.Build.DEVICE + ", Id: " + android.os.Build.ID + ", Hardware: " + android.os.Build.HARDWARE + ", Manufacturer: " + android.os.Build.MANUFACTURER + ", Model: " + android.os.Build.MODEL + ", Product: " + android.os.Build.PRODUCT);
    }

    private static void logIsStreamMute(java.lang.String str, android.media.AudioManager audioManager, int i17, java.lang.StringBuilder sb6) {
        sb6.append(", muted=");
        sb6.append(audioManager.isStreamMute(i17));
    }

    public static java.lang.String modeToString(int i17) {
        return i17 != 0 ? i17 != 1 ? i17 != 2 ? i17 != 3 ? "MODE_INVALID" : "MODE_IN_COMMUNICATION" : "MODE_IN_CALL" : "MODE_RINGTONE" : "MODE_NORMAL";
    }

    public static boolean runningOnEmulator() {
        return android.os.Build.HARDWARE.equals("goldfish") && android.os.Build.BRAND.startsWith("generic_");
    }

    public static synchronized void setDefaultSampleRateHz(int i17) {
        synchronized (org.webrtc.voiceengine.WebRtcAudioUtils.class) {
            isDefaultSampleRateOverridden = true;
            defaultSampleRateHz = i17;
        }
    }

    public static synchronized void setWebRtcBasedAcousticEchoCanceler(boolean z17) {
        synchronized (org.webrtc.voiceengine.WebRtcAudioUtils.class) {
            useWebRtcBasedAcousticEchoCanceler = z17;
        }
    }

    public static synchronized void setWebRtcBasedAutomaticGainControl(boolean z17) {
        synchronized (org.webrtc.voiceengine.WebRtcAudioUtils.class) {
            org.webrtc.Logging.w(TAG, "setWebRtcBasedAutomaticGainControl() is deprecated");
        }
    }

    public static synchronized void setWebRtcBasedNoiseSuppressor(boolean z17) {
        synchronized (org.webrtc.voiceengine.WebRtcAudioUtils.class) {
            useWebRtcBasedNoiseSuppressor = z17;
        }
    }

    private static java.lang.String streamTypeToString(int i17) {
        return i17 != 0 ? i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 4 ? i17 != 5 ? "STREAM_INVALID" : "STREAM_NOTIFICATION" : "STREAM_ALARM" : "STREAM_MUSIC" : "STREAM_RING" : "STREAM_SYSTEM" : "STREAM_VOICE_CALL";
    }

    public static synchronized boolean useWebRtcBasedAcousticEchoCanceler() {
        boolean z17;
        synchronized (org.webrtc.voiceengine.WebRtcAudioUtils.class) {
            if (useWebRtcBasedAcousticEchoCanceler) {
                org.webrtc.Logging.w(TAG, "Overriding default behavior; now using WebRTC AEC!");
            }
            z17 = useWebRtcBasedAcousticEchoCanceler;
        }
        return z17;
    }

    public static synchronized boolean useWebRtcBasedAutomaticGainControl() {
        synchronized (org.webrtc.voiceengine.WebRtcAudioUtils.class) {
        }
        return true;
    }

    public static synchronized boolean useWebRtcBasedNoiseSuppressor() {
        boolean z17;
        synchronized (org.webrtc.voiceengine.WebRtcAudioUtils.class) {
            if (useWebRtcBasedNoiseSuppressor) {
                org.webrtc.Logging.w(TAG, "Overriding default behavior; now using WebRTC NS!");
            }
            z17 = useWebRtcBasedNoiseSuppressor;
        }
        return z17;
    }
}
