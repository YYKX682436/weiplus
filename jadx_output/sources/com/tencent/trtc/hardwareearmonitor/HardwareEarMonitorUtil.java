package com.tencent.trtc.hardwareearmonitor;

@com.tencent.liteav.base.annotations.JNINamespace("liteav::extensions")
/* loaded from: classes7.dex */
public class HardwareEarMonitorUtil extends android.content.BroadcastReceiver {
    private android.content.IntentFilter mFilter;
    private long mNativeHardwareEarMonitorHandle;
    private int mHeadsetState = -1;
    private int mHasMicrophone = -1;
    private java.lang.String mDeviceName = "NotDefine";
    private java.lang.String mPortName = "NotDefine";
    private java.lang.String mDeviceAddress = "NotDefine";
    private java.lang.Object mLock = new java.lang.Object();
    private android.content.Context mContext = com.tencent.liteav.base.ContextUtils.getApplicationContext();

    public HardwareEarMonitorUtil(long j17) {
        this.mNativeHardwareEarMonitorHandle = 0L;
        this.mNativeHardwareEarMonitorHandle = j17;
        try {
            android.content.IntentFilter intentFilter = new android.content.IntentFilter("android.intent.action.HEADSET_PLUG");
            this.mFilter = intentFilter;
            this.mContext.registerReceiver(this, intentFilter);
        } catch (java.lang.Throwable unused) {
        }
    }

    public static com.tencent.trtc.hardwareearmonitor.HardwareEarMonitorUtil create(long j17) {
        return new com.tencent.trtc.hardwareearmonitor.HardwareEarMonitorUtil(j17);
    }

    private static native void nativeHeadsetDescChanged(long j17, int i17, int i18, java.lang.String str, java.lang.String str2, java.lang.String str3);

    public void destroy() {
        android.content.Context context = this.mContext;
        if (context != null) {
            context.unregisterReceiver(this);
        }
        if (this.mFilter != null) {
            this.mFilter = null;
        }
        synchronized (this.mLock) {
            this.mNativeHardwareEarMonitorHandle = 0L;
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (intent != null && "android.intent.action.HEADSET_PLUG".equals(intent.getAction())) {
            synchronized (this.mLock) {
                this.mHeadsetState = intent.getIntExtra("state", -1);
                this.mHasMicrophone = intent.getIntExtra("microphone", -1);
                this.mDeviceName = intent.getStringExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_DEVICE_NAME);
                this.mPortName = intent.getStringExtra("portName");
                java.lang.String stringExtra = intent.getStringExtra("address");
                this.mDeviceAddress = stringExtra;
                long j17 = this.mNativeHardwareEarMonitorHandle;
                int i17 = this.mHeadsetState;
                int i18 = this.mHasMicrophone;
                java.lang.String str = this.mDeviceName;
                if (str == null) {
                    str = "";
                }
                java.lang.String str2 = this.mPortName;
                if (str2 == null) {
                    str2 = "";
                }
                if (stringExtra == null) {
                    stringExtra = "";
                }
                nativeHeadsetDescChanged(j17, i17, i18, str, str2, stringExtra);
            }
        }
    }
}
