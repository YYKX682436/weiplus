package org.webrtc.voiceengine;

/* loaded from: classes15.dex */
public class WebRtcAudioEffects {
    private static final java.util.UUID AOSP_ACOUSTIC_ECHO_CANCELER = java.util.UUID.fromString("bb392ec0-8d4d-11e0-a896-0002a5d5c51b");
    private static final java.util.UUID AOSP_NOISE_SUPPRESSOR = java.util.UUID.fromString("c06c8400-8e06-11e0-9cb6-0002a5d5c51b");
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = "WebRtcAudioEffects";
    private static android.media.audiofx.AudioEffect.Descriptor[] cachedEffects;
    private android.media.audiofx.AcousticEchoCanceler aec;

    /* renamed from: ns, reason: collision with root package name */
    private android.media.audiofx.NoiseSuppressor f347967ns;
    private boolean shouldEnableAec;
    private boolean shouldEnableNs;

    private WebRtcAudioEffects() {
        org.webrtc.Logging.d(TAG, "ctor" + org.webrtc.voiceengine.WebRtcAudioUtils.getThreadInfo());
    }

    private static void assertTrue(boolean z17) {
        if (!z17) {
            throw new java.lang.AssertionError("Expected condition to be true");
        }
    }

    public static boolean canUseAcousticEchoCanceler() {
        boolean z17 = (!isAcousticEchoCancelerSupported() || org.webrtc.voiceengine.WebRtcAudioUtils.useWebRtcBasedAcousticEchoCanceler() || isAcousticEchoCancelerBlacklisted() || isAcousticEchoCancelerExcludedByUUID()) ? false : true;
        org.webrtc.Logging.d(TAG, "canUseAcousticEchoCanceler: " + z17);
        return z17;
    }

    public static boolean canUseNoiseSuppressor() {
        boolean z17 = (!isNoiseSuppressorSupported() || org.webrtc.voiceengine.WebRtcAudioUtils.useWebRtcBasedNoiseSuppressor() || isNoiseSuppressorBlacklisted() || isNoiseSuppressorExcludedByUUID()) ? false : true;
        org.webrtc.Logging.d(TAG, "canUseNoiseSuppressor: " + z17);
        return z17;
    }

    public static org.webrtc.voiceengine.WebRtcAudioEffects create() {
        return new org.webrtc.voiceengine.WebRtcAudioEffects();
    }

    private boolean effectTypeIsVoIP(java.util.UUID uuid) {
        return (android.media.audiofx.AudioEffect.EFFECT_TYPE_AEC.equals(uuid) && isAcousticEchoCancelerSupported()) || (android.media.audiofx.AudioEffect.EFFECT_TYPE_NS.equals(uuid) && isNoiseSuppressorSupported());
    }

    private static android.media.audiofx.AudioEffect.Descriptor[] getAvailableEffects() {
        android.media.audiofx.AudioEffect.Descriptor[] descriptorArr = cachedEffects;
        if (descriptorArr != null) {
            return descriptorArr;
        }
        android.media.audiofx.AudioEffect.Descriptor[] queryEffects = android.media.audiofx.AudioEffect.queryEffects();
        cachedEffects = queryEffects;
        return queryEffects;
    }

    public static boolean isAcousticEchoCancelerBlacklisted() {
        java.util.List<java.lang.String> blackListedModelsForAecUsage = org.webrtc.voiceengine.WebRtcAudioUtils.getBlackListedModelsForAecUsage();
        java.lang.String str = android.os.Build.MODEL;
        boolean contains = blackListedModelsForAecUsage.contains(str);
        if (contains) {
            org.webrtc.Logging.w(TAG, str + " is blacklisted for HW AEC usage!");
        }
        return contains;
    }

    private static boolean isAcousticEchoCancelerEffectAvailable() {
        return isEffectTypeAvailable(android.media.audiofx.AudioEffect.EFFECT_TYPE_AEC);
    }

    private static boolean isAcousticEchoCancelerExcludedByUUID() {
        for (android.media.audiofx.AudioEffect.Descriptor descriptor : getAvailableEffects()) {
            if (descriptor.type.equals(android.media.audiofx.AudioEffect.EFFECT_TYPE_AEC) && descriptor.uuid.equals(AOSP_ACOUSTIC_ECHO_CANCELER)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isAcousticEchoCancelerSupported() {
        return isAcousticEchoCancelerEffectAvailable();
    }

    private static boolean isEffectTypeAvailable(java.util.UUID uuid) {
        android.media.audiofx.AudioEffect.Descriptor[] availableEffects = getAvailableEffects();
        if (availableEffects == null) {
            return false;
        }
        for (android.media.audiofx.AudioEffect.Descriptor descriptor : availableEffects) {
            if (descriptor.type.equals(uuid)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isNoiseSuppressorBlacklisted() {
        java.util.List<java.lang.String> blackListedModelsForNsUsage = org.webrtc.voiceengine.WebRtcAudioUtils.getBlackListedModelsForNsUsage();
        java.lang.String str = android.os.Build.MODEL;
        boolean contains = blackListedModelsForNsUsage.contains(str);
        if (contains) {
            org.webrtc.Logging.w(TAG, str + " is blacklisted for HW NS usage!");
        }
        return contains;
    }

    private static boolean isNoiseSuppressorEffectAvailable() {
        return isEffectTypeAvailable(android.media.audiofx.AudioEffect.EFFECT_TYPE_NS);
    }

    private static boolean isNoiseSuppressorExcludedByUUID() {
        for (android.media.audiofx.AudioEffect.Descriptor descriptor : getAvailableEffects()) {
            if (descriptor.type.equals(android.media.audiofx.AudioEffect.EFFECT_TYPE_NS) && descriptor.uuid.equals(AOSP_NOISE_SUPPRESSOR)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isNoiseSuppressorSupported() {
        return isNoiseSuppressorEffectAvailable();
    }

    public void enable(int i17) {
        org.webrtc.Logging.d(TAG, "enable(audioSession=" + i17 + ")");
        assertTrue(this.aec == null);
        assertTrue(this.f347967ns == null);
        if (isAcousticEchoCancelerSupported()) {
            android.media.audiofx.AcousticEchoCanceler create = android.media.audiofx.AcousticEchoCanceler.create(i17);
            this.aec = create;
            if (create != null) {
                boolean enabled = create.getEnabled();
                boolean z17 = this.shouldEnableAec && canUseAcousticEchoCanceler();
                if (this.aec.setEnabled(z17) != 0) {
                    org.webrtc.Logging.e(TAG, "Failed to set the AcousticEchoCanceler state");
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("AcousticEchoCanceler: was ");
                sb6.append(enabled ? "enabled" : "disabled");
                sb6.append(", enable: ");
                sb6.append(z17);
                sb6.append(", is now: ");
                sb6.append(this.aec.getEnabled() ? "enabled" : "disabled");
                org.webrtc.Logging.d(TAG, sb6.toString());
            } else {
                org.webrtc.Logging.e(TAG, "Failed to create the AcousticEchoCanceler instance");
            }
        }
        if (isNoiseSuppressorSupported()) {
            android.media.audiofx.NoiseSuppressor create2 = android.media.audiofx.NoiseSuppressor.create(i17);
            this.f347967ns = create2;
            if (create2 == null) {
                org.webrtc.Logging.e(TAG, "Failed to create the NoiseSuppressor instance");
                return;
            }
            boolean enabled2 = create2.getEnabled();
            boolean z18 = this.shouldEnableNs && canUseNoiseSuppressor();
            if (this.f347967ns.setEnabled(z18) != 0) {
                org.webrtc.Logging.e(TAG, "Failed to set the NoiseSuppressor state");
            }
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("NoiseSuppressor: was ");
            sb7.append(enabled2 ? "enabled" : "disabled");
            sb7.append(", enable: ");
            sb7.append(z18);
            sb7.append(", is now: ");
            sb7.append(this.f347967ns.getEnabled() ? "enabled" : "disabled");
            org.webrtc.Logging.d(TAG, sb7.toString());
        }
    }

    public void release() {
        org.webrtc.Logging.d(TAG, "release");
        android.media.audiofx.AcousticEchoCanceler acousticEchoCanceler = this.aec;
        if (acousticEchoCanceler != null) {
            acousticEchoCanceler.release();
            this.aec = null;
        }
        android.media.audiofx.NoiseSuppressor noiseSuppressor = this.f347967ns;
        if (noiseSuppressor != null) {
            noiseSuppressor.release();
            this.f347967ns = null;
        }
    }

    public boolean setAEC(boolean z17) {
        org.webrtc.Logging.d(TAG, "setAEC(" + z17 + ")");
        if (!canUseAcousticEchoCanceler()) {
            org.webrtc.Logging.w(TAG, "Platform AEC is not supported");
            this.shouldEnableAec = false;
            return false;
        }
        if (this.aec == null || z17 == this.shouldEnableAec) {
            this.shouldEnableAec = z17;
            return true;
        }
        org.webrtc.Logging.e(TAG, "Platform AEC state can't be modified while recording");
        return false;
    }

    public boolean setNS(boolean z17) {
        org.webrtc.Logging.d(TAG, "setNS(" + z17 + ")");
        if (!canUseNoiseSuppressor()) {
            org.webrtc.Logging.w(TAG, "Platform NS is not supported");
            this.shouldEnableNs = false;
            return false;
        }
        if (this.f347967ns == null || z17 == this.shouldEnableNs) {
            this.shouldEnableNs = z17;
            return true;
        }
        org.webrtc.Logging.e(TAG, "Platform NS state can't be modified while recording");
        return false;
    }
}
