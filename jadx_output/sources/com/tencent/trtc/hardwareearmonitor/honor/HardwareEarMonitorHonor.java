package com.tencent.trtc.hardwareearmonitor.honor;

@com.tencent.liteav.base.annotations.JNINamespace("liteav::extensions")
/* loaded from: classes16.dex */
public class HardwareEarMonitorHonor implements com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioServiceCallback {
    private com.tencent.trtc.hardwareearmonitor.honor.HonorAudioClient mHnAudioClient;
    private com.tencent.trtc.hardwareearmonitor.honor.HonorEarReturnClient mHnEarReturnClient;
    private long mNativeHardwareEarMonitorHandle;
    private java.lang.Object mLock = new java.lang.Object();
    private android.media.AudioManager mAudioManager = (android.media.AudioManager) com.tencent.liteav.base.ContextUtils.getApplicationContext().getSystemService("audio");
    private android.content.Context mContext = com.tencent.liteav.base.ContextUtils.getApplicationContext();

    public HardwareEarMonitorHonor(long j17) {
        this.mNativeHardwareEarMonitorHandle = j17;
        com.tencent.trtc.hardwareearmonitor.honor.HonorAudioClient honorAudioClient = new com.tencent.trtc.hardwareearmonitor.honor.HonorAudioClient(this.mContext, this);
        this.mHnAudioClient = honorAudioClient;
        honorAudioClient.initialize();
    }

    public static com.tencent.trtc.hardwareearmonitor.honor.HardwareEarMonitorHonor create(long j17) {
        return new com.tencent.trtc.hardwareearmonitor.honor.HardwareEarMonitorHonor(j17);
    }

    public static boolean isAudioKitSupport() {
        return com.tencent.trtc.hardwareearmonitor.honor.HonorAudioClient.isDeviceSupported(com.tencent.liteav.base.ContextUtils.getApplicationContext());
    }

    private static native void nativeHandleResult(long j17, int i17);

    public void createKaraokeService() {
        this.mHnEarReturnClient = (com.tencent.trtc.hardwareearmonitor.honor.HonorEarReturnClient) this.mHnAudioClient.createService(com.tencent.trtc.hardwareearmonitor.honor.HonorAudioClient.ServiceType.HNAUDIO_SERVICE_EARRETURN);
    }

    public void destroy() {
        synchronized (this.mLock) {
            this.mNativeHardwareEarMonitorHandle = 0L;
        }
        com.tencent.trtc.hardwareearmonitor.honor.HonorAudioClient honorAudioClient = this.mHnAudioClient;
        if (honorAudioClient != null) {
            honorAudioClient.destroy();
            this.mHnAudioClient = null;
        }
        com.tencent.trtc.hardwareearmonitor.honor.HonorEarReturnClient honorEarReturnClient = this.mHnEarReturnClient;
        if (honorEarReturnClient != null) {
            honorEarReturnClient.destroy();
            this.mHnEarReturnClient = null;
        }
    }

    public int enableKaraoke(boolean z17) {
        com.tencent.trtc.hardwareearmonitor.honor.HonorEarReturnClient honorEarReturnClient = this.mHnEarReturnClient;
        if (honorEarReturnClient == null) {
            return 1806;
        }
        return honorEarReturnClient.enableEarReturn(z17);
    }

    public int[] getKaraokeSupportedServices() {
        java.util.List<java.lang.Integer> supportedServices = this.mHnAudioClient.getSupportedServices();
        if (supportedServices == null) {
            return null;
        }
        int[] iArr = new int[supportedServices.size()];
        for (int i17 = 0; i17 < supportedServices.size(); i17++) {
            iArr[i17] = supportedServices.get(i17).intValue();
        }
        return iArr;
    }

    public boolean isHardwareEarMonitorSupported() {
        com.tencent.trtc.hardwareearmonitor.honor.HonorEarReturnClient honorEarReturnClient = this.mHnEarReturnClient;
        if (honorEarReturnClient == null) {
            return false;
        }
        return honorEarReturnClient.isServiceSupported();
    }

    public boolean isKaraokeServiceSupport() {
        return this.mHnAudioClient.isServiceSupported(com.tencent.trtc.hardwareearmonitor.honor.HonorAudioClient.ServiceType.HNAUDIO_SERVICE_EARRETURN);
    }

    @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioServiceCallback
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

    public int setEqualizer(int i17) {
        com.tencent.trtc.hardwareearmonitor.honor.HonorEarReturnClient honorEarReturnClient = this.mHnEarReturnClient;
        if (honorEarReturnClient == null) {
            return 1806;
        }
        return honorEarReturnClient.setParameter(com.tencent.trtc.hardwareearmonitor.honor.HonorEarReturnClient.ParameName.CMD_SET_VOCAL_EQUALIZER_MODE, i17);
    }

    public int setReverberation(int i17) {
        com.tencent.trtc.hardwareearmonitor.honor.HonorEarReturnClient honorEarReturnClient = this.mHnEarReturnClient;
        if (honorEarReturnClient == null) {
            return 1806;
        }
        return honorEarReturnClient.setParameter(com.tencent.trtc.hardwareearmonitor.honor.HonorEarReturnClient.ParameName.CMD_SET_AUDIO_EFFECT_MODE_BASE, i17);
    }

    public int setVolume(int i17) {
        com.tencent.trtc.hardwareearmonitor.honor.HonorEarReturnClient honorEarReturnClient = this.mHnEarReturnClient;
        if (honorEarReturnClient == null) {
            return 1806;
        }
        return honorEarReturnClient.setParameter(com.tencent.trtc.hardwareearmonitor.honor.HonorEarReturnClient.ParameName.CMD_SET_VOCAL_VOLUME_BASE, i17);
    }
}
