package com.tencent.trtc.hardwareearmonitor.oppo;

@com.tencent.liteav.base.annotations.JNINamespace("liteav::extensions")
/* loaded from: classes15.dex */
public class HardwareEarMonitorOppo {
    private android.media.AudioManager mAudioManager = (android.media.AudioManager) com.tencent.liteav.base.ContextUtils.getApplicationContext().getSystemService("audio");
    private android.content.Context mContext = com.tencent.liteav.base.ContextUtils.getApplicationContext();
    private long mNativeHardwareEarMonitorHandle;

    public HardwareEarMonitorOppo(long j17) {
        this.mNativeHardwareEarMonitorHandle = j17;
    }

    public static com.tencent.trtc.hardwareearmonitor.oppo.HardwareEarMonitorOppo create(long j17) {
        return new com.tencent.trtc.hardwareearmonitor.oppo.HardwareEarMonitorOppo(j17);
    }

    public java.lang.String getParameters(java.lang.String str) {
        try {
            return this.mAudioManager.getParameters(str);
        } catch (java.lang.Throwable unused) {
            return "";
        }
    }

    public int getUidFromPackage() {
        try {
            return this.mContext.getPackageManager().getPackageUid(this.mContext.getPackageName(), 0);
        } catch (java.lang.Throwable unused) {
            return 0;
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

    public boolean systemFeatureSupported(java.lang.String str) {
        try {
            return this.mContext.getPackageManager().hasSystemFeature(str);
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }
}
