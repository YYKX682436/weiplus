package me4;

/* loaded from: classes4.dex */
public class a implements java.lang.Runnable {
    public a(me4.b bVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.waid.InitTaskMgr$1");
        try {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            synchronized (v34.b.class) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initAllDeviceInfo", "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initAllDeviceInfo", "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo");
            }
            com.tencent.mars.xlog.Log.i("InitTaskMgr", "DeviceIdInitTask run, timeCost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("InitTaskMgr", "mDeviceIdInitTask exp=" + e17.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.waid.InitTaskMgr$1");
    }
}
