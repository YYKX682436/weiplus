package w34;

/* loaded from: classes4.dex */
public class b implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.device.utils.DeviceInfoUtils$1");
        try {
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdDeviceInfo.DeviceInfoUtils", "UaInfo.getWebViewUAInfo, exp=" + android.util.Log.getStackTraceString(th6));
        }
        synchronized (w34.c.class) {
            try {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.device.utils.DeviceInfoUtils");
                java.lang.String str = w34.c.f442720c;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.device.utils.DeviceInfoUtils");
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    com.tencent.mars.xlog.Log.w("AdDeviceInfo.DeviceInfoUtils", "UaInfo.getWebViewUAInfo, already inited");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.device.utils.DeviceInfoUtils$1");
                    return;
                }
                java.lang.String a17 = w34.c.a();
                if (!com.tencent.mm.sdk.platformtools.t8.K0(a17)) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$002", "com.tencent.mm.plugin.sns.ad.device.utils.DeviceInfoUtils");
                    w34.c.f442720c = a17;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$002", "com.tencent.mm.plugin.sns.ad.device.utils.DeviceInfoUtils");
                    p34.o.g("wv_ua_info", a17);
                    com.tencent.mars.xlog.Log.i("AdDeviceInfo.DeviceInfoUtils", "UaInfo.getWebViewUAInfo, refresh");
                }
            } finally {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.device.utils.DeviceInfoUtils$1");
            }
        }
    }
}
