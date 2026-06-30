package com.tencent.trtc.hardwareearmonitor.vivo;

@com.tencent.liteav.base.annotations.JNINamespace("liteav::extensions")
/* loaded from: classes15.dex */
public class HardwareEarMonitorVivo {
    private android.media.AudioManager mAudioManager = (android.media.AudioManager) com.tencent.liteav.base.ContextUtils.getApplicationContext().getSystemService("audio");
    private long mNativeHardwareEarMonitorHandle;

    public HardwareEarMonitorVivo(long j17) {
        this.mNativeHardwareEarMonitorHandle = j17;
    }

    public static com.tencent.trtc.hardwareearmonitor.vivo.HardwareEarMonitorVivo create(long j17) {
        return new com.tencent.trtc.hardwareearmonitor.vivo.HardwareEarMonitorVivo(j17);
    }

    public java.lang.String getParameters(java.lang.String str) {
        try {
            return this.mAudioManager.getParameters(str);
        } catch (java.lang.Throwable unused) {
            return "";
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
}
