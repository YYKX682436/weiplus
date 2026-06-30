package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class zm {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.ym f171700a;

    /* renamed from: b, reason: collision with root package name */
    public int f171701b;

    /* renamed from: c, reason: collision with root package name */
    public final android.content.BroadcastReceiver f171702c;

    public zm() {
        com.tencent.mm.plugin.sns.ui.xm xmVar = new com.tencent.mm.plugin.sns.ui.xm(this);
        this.f171702c = xmVar;
        this.f171701b = b();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("registerBroadcastReceiver", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr");
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction(io.flutter.plugins.connectivity.patched.PatchedConnectivityBroadcastReceiver.CONNECTIVITY_ACTION);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("unregisterBroadcastReceiver", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr");
        try {
            com.tencent.mm.sdk.platformtools.x2.f193071a.unregisterReceiver(xmVar);
        } catch (java.lang.IllegalArgumentException unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("unregisterBroadcastReceiver", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr");
        com.tencent.mm.sdk.platformtools.x2.f193071a.registerReceiver(xmVar, intentFilter);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("registerBroadcastReceiver", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr");
    }

    public static /* synthetic */ int a(com.tencent.mm.plugin.sns.ui.zm zmVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr");
        int i17 = zmVar.f171701b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr");
        return i17;
    }

    public final int b() {
        android.net.NetworkInfo networkInfo;
        boolean isWifi;
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("currentNetworkStatus", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr");
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        if (!r75.d.f393261h) {
            networkInfo = com.tencent.mars.comm.NetStatusUtil.getActiveNetworkInfo(context);
        } else if (r75.d.f393256c == null) {
            networkInfo = com.tencent.mars.comm.NetStatusUtil.getActiveNetworkInfo(context);
            r75.d.f393256c = networkInfo;
        } else {
            ((ku5.t0) ku5.t0.f312615d).h(new r75.c(context), "SystemServiceCallingCache-UpdateNetWorkCache");
            com.tencent.mars.xlog.Log.i("NetWorkCache", "getActiveNetworkInfoFromCache");
            networkInfo = r75.d.f393256c;
        }
        if (com.tencent.mars.comm.NetStatusUtil.isConnected(networkInfo)) {
            android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
            if (!r75.d.f393259f) {
                isWifi = com.tencent.mars.comm.NetStatusUtil.isWifi(context2);
            } else if (r75.d.f393257d == -100) {
                int netType = com.tencent.mars.comm.NetStatusUtil.getNetType(context2);
                r75.d.f393257d = netType;
                isWifi = com.tencent.mars.comm.NetStatusUtil.isWifi(netType);
            } else {
                ((ku5.t0) ku5.t0.f312615d).h(new r75.c(context2), "SystemServiceCallingCache-UpdateNetWorkCache");
                isWifi = com.tencent.mars.comm.NetStatusUtil.isWifi(r75.d.f393257d);
            }
            if (isWifi) {
                i17 = 5;
            } else if (com.tencent.mars.comm.NetStatusUtil.is2G(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
                i17 = 2;
            } else if (com.tencent.mars.comm.NetStatusUtil.is3G(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
                i17 = 3;
            } else {
                if (!com.tencent.mars.comm.NetStatusUtil.is4G(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Sns.SnsNetworkMgr", "failed and return 4g");
                }
                i17 = 4;
            }
        } else {
            i17 = 1;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Sns.SnsNetworkMgr", "currentNetworkStatus:%s", java.lang.Integer.valueOf(i17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("currentNetworkStatus", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr");
        return i17;
    }
}
