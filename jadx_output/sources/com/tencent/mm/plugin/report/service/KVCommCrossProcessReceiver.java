package com.tencent.mm.plugin.report.service;

/* loaded from: classes12.dex */
public class KVCommCrossProcessReceiver extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.n3 f158124a;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f158125b;

    /* renamed from: c, reason: collision with root package name */
    public static volatile long f158126c;

    /* renamed from: d, reason: collision with root package name */
    public static volatile int f158127d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.report.service.BroadCastData f158128e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Queue f158129f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.Object f158130g;

    static {
        com.tencent.mm.plugin.report.service.r rVar = new com.tencent.mm.plugin.report.service.r("kv_report");
        f158124a = rVar;
        rVar.setLogging(false);
        f158125b = "";
        f158126c = 10000;
        f158127d = -1;
        f158128e = new com.tencent.mm.plugin.report.service.BroadCastData();
        f158129f = new java.util.LinkedList();
        f158130g = new java.lang.Object();
    }

    public static boolean a(long j17) {
        long j18;
        try {
            if (f158127d > 0) {
                com.tencent.mm.plugin.report.service.BroadCastData broadCastData = f158128e;
                if (broadCastData.f158118e.size() + broadCastData.f158119f.size() + broadCastData.f158117d.size() >= f158127d) {
                    return true;
                }
            }
            com.tencent.mm.plugin.report.service.BroadCastData broadCastData2 = f158128e;
            synchronized (broadCastData2.f158120g) {
                j18 = broadCastData2.f158120g[0];
            }
            if (j18 + j17 >= 307200) {
                com.tencent.mars.xlog.Log.i("MicroMsg.KVCommCrossProcessReceiver", "KV data size > 300K.");
                return true;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.KVCommCrossProcessReceiver", "checkExceedCacheItemCountLimit e = %s", e17);
        }
        return false;
    }

    public static void b() {
        boolean z17;
        synchronized (f158130g) {
            z17 = ((java.util.LinkedList) f158129f).size() > 0;
        }
        if (z17) {
            com.tencent.mm.sdk.platformtools.n3 n3Var = f158124a;
            n3Var.sendMessageDelayed(n3Var.obtainMessage(1), 0L);
            return;
        }
        com.tencent.mm.sdk.platformtools.n3 n3Var2 = f158124a;
        if (n3Var2.hasMessages(1) || com.tencent.mm.sdk.platformtools.x2.f193077g) {
            return;
        }
        n3Var2.sendMessageDelayed(n3Var2.obtainMessage(1), f158126c);
    }

    public static void c() {
        com.tencent.mm.plugin.report.service.BroadCastData broadCastData = f158128e;
        if (broadCastData.f158117d.isEmpty() && broadCastData.f158118e.isEmpty() && broadCastData.f158119f.isEmpty()) {
            return;
        }
        ((java.util.LinkedList) f158129f).offer(new com.tencent.mm.plugin.report.service.BroadCastData(broadCastData));
        broadCastData.f158117d.clear();
        broadCastData.f158118e.clear();
        broadCastData.f158119f.clear();
        synchronized (broadCastData.f158120g) {
            broadCastData.f158120g[0] = 0;
        }
    }

    public static void d() {
        com.tencent.mm.sdk.platformtools.n3 n3Var = f158124a;
        if (n3Var == null || com.tencent.mm.sdk.platformtools.x2.f193077g) {
            return;
        }
        n3Var.sendMessageDelayed(n3Var.obtainMessage(1), 0L);
    }

    public static void e(com.tencent.mm.plugin.report.service.KVReportDataInfo kVReportDataInfo) {
        long j17 = kVReportDataInfo.f158131d;
        synchronized (f158130g) {
            java.lang.String str = kVReportDataInfo.f158133f;
            long length = (str != null ? ((str.length() * 2) + 2 + 3 + 4) & (-4) : 4) + 12 + 16;
            java.lang.String str2 = kVReportDataInfo.f158133f;
            if (str2 != null && str2.getBytes(java.nio.charset.StandardCharsets.UTF_8).length > 7168) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.KVCommCrossProcessReceiver", new java.lang.Throwable(), "kv data too large: %s", java.lang.Long.valueOf(length));
                java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            }
            if (length >= 102400) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.KVCommCrossProcessReceiver", new java.lang.Throwable(), "kv data too large: %s, invalid data = %s", java.lang.Long.valueOf(length), kVReportDataInfo.f158133f);
                java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
            }
            if (length >= 307200) {
                com.tencent.mars.xlog.Log.e("MicroMsg.KVCommCrossProcessReceiver", "kv data too large: %s, invalid data = %s", java.lang.Long.valueOf(length), kVReportDataInfo.f158133f);
                throw new java.lang.OutOfMemoryError("kv data too large: " + length);
            }
            if (f158126c == 0 || a(length)) {
                c();
            }
            com.tencent.mm.plugin.report.service.BroadCastData broadCastData = f158128e;
            broadCastData.f158117d.add(kVReportDataInfo);
            java.lang.String str5 = kVReportDataInfo.f158133f;
            broadCastData.a((str5 != null ? ((str5.length() * 2) + 2 + 3 + 4) & (-4) : 4) + 12 + 16 + 4);
        }
        b();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (intent == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.KVCommCrossProcessReceiver", "onReceive intent == null");
            return;
        }
        com.tencent.mm.plugin.report.service.s sVar = new com.tencent.mm.plugin.report.service.s(this, intent);
        if (gm0.j1.i().f273208a.f273299d || (fp.d0.d("wechatbase") && com.tencent.mars.MarsContext.getContext().getManager(com.tencent.mars.smc.SmcManager.class) != null && ((com.tencent.mars.smc.SmcManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.smc.SmcManager.class)).isInitiated())) {
            f158124a.post(sVar);
        } else {
            gm0.j1.i().c(new com.tencent.mm.plugin.report.service.t(this, sVar));
        }
    }
}
