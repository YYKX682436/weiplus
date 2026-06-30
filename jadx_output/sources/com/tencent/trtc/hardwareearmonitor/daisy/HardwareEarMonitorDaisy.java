package com.tencent.trtc.hardwareearmonitor.daisy;

@com.tencent.liteav.base.annotations.JNINamespace("liteav::extensions")
/* loaded from: classes16.dex */
public class HardwareEarMonitorDaisy implements com.tencent.trtc.hardwareearmonitor.daisy.IDaisyAudioKitCallback {
    private com.tencent.trtc.hardwareearmonitor.daisy.DaisyAudioKit mDaisyAudioKit;
    private com.tencent.trtc.hardwareearmonitor.daisy.DaisyAudioKaraokeFeatureKit mDaisyKaraokeKit;
    private long mNativeHardwareEarMonitorHandle;
    private java.lang.Object mLock = new java.lang.Object();
    private android.media.AudioManager mAudioManager = (android.media.AudioManager) com.tencent.liteav.base.ContextUtils.getApplicationContext().getSystemService("audio");
    private android.content.Context mContext = com.tencent.liteav.base.ContextUtils.getApplicationContext();

    public HardwareEarMonitorDaisy(long j17) {
        this.mNativeHardwareEarMonitorHandle = j17;
        com.tencent.trtc.hardwareearmonitor.daisy.DaisyAudioKit daisyAudioKit = new com.tencent.trtc.hardwareearmonitor.daisy.DaisyAudioKit(com.tencent.liteav.base.ContextUtils.getApplicationContext(), this);
        this.mDaisyAudioKit = daisyAudioKit;
        daisyAudioKit.initialize();
    }

    public static com.tencent.trtc.hardwareearmonitor.daisy.HardwareEarMonitorDaisy create(long j17) {
        return new com.tencent.trtc.hardwareearmonitor.daisy.HardwareEarMonitorDaisy(j17);
    }

    public static boolean isAudioKitSupport() {
        return com.tencent.trtc.hardwareearmonitor.daisy.DaisyFeatureKitManager.isAudioKitSupport(com.tencent.liteav.base.ContextUtils.getApplicationContext());
    }

    private static native void nativeHandleResult(long j17, int i17);

    private int setEqualizer(int i17) {
        com.tencent.trtc.hardwareearmonitor.daisy.DaisyAudioKaraokeFeatureKit daisyAudioKaraokeFeatureKit = this.mDaisyKaraokeKit;
        if (daisyAudioKaraokeFeatureKit == null) {
            return 1806;
        }
        return daisyAudioKaraokeFeatureKit.setParameter(com.tencent.trtc.hardwareearmonitor.daisy.DaisyAudioKaraokeFeatureKit.ParameName.CMD_SET_VOCAL_EQUALIZER_MODE, i17);
    }

    private int setVolume(int i17) {
        com.tencent.trtc.hardwareearmonitor.daisy.DaisyAudioKaraokeFeatureKit daisyAudioKaraokeFeatureKit = this.mDaisyKaraokeKit;
        if (daisyAudioKaraokeFeatureKit == null) {
            return 1806;
        }
        return daisyAudioKaraokeFeatureKit.setParameter(com.tencent.trtc.hardwareearmonitor.daisy.DaisyAudioKaraokeFeatureKit.ParameName.CMD_SET_VOCAL_VOLUME_BASE, i17);
    }

    public void createKaraokeService() {
        this.mDaisyKaraokeKit = (com.tencent.trtc.hardwareearmonitor.daisy.DaisyAudioKaraokeFeatureKit) this.mDaisyAudioKit.createFeature(com.tencent.trtc.hardwareearmonitor.daisy.DaisyAudioKit.FeatureType.HWAUDIO_FEATURE_KARAOKE);
    }

    public void destroy() {
        synchronized (this.mLock) {
            this.mNativeHardwareEarMonitorHandle = 0L;
        }
        com.tencent.trtc.hardwareearmonitor.daisy.DaisyAudioKit daisyAudioKit = this.mDaisyAudioKit;
        if (daisyAudioKit != null) {
            daisyAudioKit.destroy();
            this.mDaisyAudioKit = null;
        }
        com.tencent.trtc.hardwareearmonitor.daisy.DaisyAudioKaraokeFeatureKit daisyAudioKaraokeFeatureKit = this.mDaisyKaraokeKit;
        if (daisyAudioKaraokeFeatureKit != null) {
            daisyAudioKaraokeFeatureKit.destroy();
            this.mDaisyKaraokeKit = null;
        }
    }

    public int enableKaraoke(boolean z17) {
        com.tencent.trtc.hardwareearmonitor.daisy.DaisyAudioKaraokeFeatureKit daisyAudioKaraokeFeatureKit = this.mDaisyKaraokeKit;
        if (daisyAudioKaraokeFeatureKit == null) {
            return 1806;
        }
        return daisyAudioKaraokeFeatureKit.enableKaraokeFeature(z17);
    }

    public int[] getKaraokeSupportedServices() {
        java.util.List<java.lang.Integer> supportedFeatures = this.mDaisyAudioKit.getSupportedFeatures();
        if (supportedFeatures == null) {
            return null;
        }
        int[] iArr = new int[supportedFeatures.size()];
        for (int i17 = 0; i17 < supportedFeatures.size(); i17++) {
            iArr[i17] = supportedFeatures.get(i17).intValue();
        }
        return iArr;
    }

    public boolean isHardwareEarMonitorSupported() {
        com.tencent.trtc.hardwareearmonitor.daisy.DaisyAudioKit daisyAudioKit = this.mDaisyAudioKit;
        if (daisyAudioKit == null) {
            return false;
        }
        return daisyAudioKit.isFeatureSupported(com.tencent.trtc.hardwareearmonitor.daisy.DaisyAudioKit.FeatureType.HWAUDIO_FEATURE_KARAOKE);
    }

    public boolean isKaraokeServiceSupport() {
        return this.mDaisyAudioKit.isFeatureSupported(com.tencent.trtc.hardwareearmonitor.daisy.DaisyAudioKit.FeatureType.HWAUDIO_FEATURE_KARAOKE);
    }

    @Override // com.tencent.trtc.hardwareearmonitor.daisy.IDaisyAudioKitCallback
    public void onResult(int i17) {
        synchronized (this.mLock) {
            nativeHandleResult(this.mNativeHardwareEarMonitorHandle, i17);
        }
    }

    public boolean setAudioParams(java.lang.String str) {
        try {
            this.mAudioManager.setParameters(str);
            return true;
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    public int setReverberation(int i17) {
        com.tencent.trtc.hardwareearmonitor.daisy.DaisyAudioKaraokeFeatureKit daisyAudioKaraokeFeatureKit = this.mDaisyKaraokeKit;
        if (daisyAudioKaraokeFeatureKit == null) {
            return 1806;
        }
        return daisyAudioKaraokeFeatureKit.setParameter(com.tencent.trtc.hardwareearmonitor.daisy.DaisyAudioKaraokeFeatureKit.ParameName.CMD_SET_AUDIO_EFFECT_MODE_BASE, i17);
    }
}
