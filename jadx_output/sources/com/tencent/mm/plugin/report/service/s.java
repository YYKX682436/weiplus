package com.tencent.mm.plugin.report.service;

/* loaded from: classes12.dex */
public class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f158305d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.report.service.KVCommCrossProcessReceiver f158306e;

    public s(com.tencent.mm.plugin.report.service.KVCommCrossProcessReceiver kVCommCrossProcessReceiver, android.content.Intent intent) {
        this.f158306e = kVCommCrossProcessReceiver;
        this.f158305d = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.report.service.BroadCastData broadCastData;
        com.tencent.mars.xlog.Log.i("MicroMsg.KVCommCrossProcessReceiver", "summeranrt true report runnable run tid:%d", java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        android.content.Intent intent = this.f158305d;
        com.tencent.mm.sdk.platformtools.n3 n3Var = com.tencent.mm.plugin.report.service.KVCommCrossProcessReceiver.f158124a;
        com.tencent.mm.plugin.report.service.KVCommCrossProcessReceiver kVCommCrossProcessReceiver = this.f158306e;
        kVCommCrossProcessReceiver.getClass();
        try {
            int g17 = com.tencent.mm.sdk.platformtools.c2.g(intent, "type", 0);
            if (g17 == 1) {
                android.os.Bundle bundleExtra = intent.getBundleExtra("INTENT_IDKEYGROUP");
                if (bundleExtra != null && (broadCastData = (com.tencent.mm.plugin.report.service.BroadCastData) bundleExtra.getParcelable("BUNDLE_IDKEYGROUP")) != null) {
                    java.util.ArrayList arrayList = broadCastData.f158119f;
                    java.util.ArrayList arrayList2 = broadCastData.f158118e;
                    java.util.ArrayList arrayList3 = broadCastData.f158117d;
                    com.tencent.mars.xlog.Log.i("MicroMsg.KVCommCrossProcessReceiver", "KVBroadCast onReceive kvdata lenght: %d, idkey data lenght:%d,group lenght:%d", java.lang.Integer.valueOf(arrayList3.size()), java.lang.Integer.valueOf(arrayList2.size()), java.lang.Integer.valueOf(arrayList.size()));
                    java.util.Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        com.tencent.mm.plugin.report.service.GroupIDKeyDataInfo groupIDKeyDataInfo = (com.tencent.mm.plugin.report.service.GroupIDKeyDataInfo) it.next();
                        if (groupIDKeyDataInfo != null) {
                            com.tencent.mm.plugin.report.service.x.a(groupIDKeyDataInfo.f158121d, groupIDKeyDataInfo.f158122e, groupIDKeyDataInfo.f158123f);
                        }
                    }
                    java.util.Iterator it6 = arrayList2.iterator();
                    while (it6.hasNext()) {
                        com.tencent.mm.plugin.report.service.StIDKeyDataInfo stIDKeyDataInfo = (com.tencent.mm.plugin.report.service.StIDKeyDataInfo) it6.next();
                        if (stIDKeyDataInfo != null) {
                            com.tencent.mm.plugin.report.service.x.b(stIDKeyDataInfo.f158142d, stIDKeyDataInfo.f158143e, stIDKeyDataInfo.f158144f, stIDKeyDataInfo.f158145g);
                        }
                    }
                    java.util.Iterator it7 = arrayList3.iterator();
                    while (it7.hasNext()) {
                        com.tencent.mm.plugin.report.service.KVReportDataInfo kVReportDataInfo = (com.tencent.mm.plugin.report.service.KVReportDataInfo) it7.next();
                        if (kVReportDataInfo != null) {
                            com.tencent.mm.plugin.report.service.x.h(kVReportDataInfo.f158131d, kVReportDataInfo.f158132e, kVReportDataInfo.f158133f, kVReportDataInfo.f158134g, kVReportDataInfo.f158135h, kVReportDataInfo.f158136i);
                        }
                    }
                }
            } else if (g17 == 2) {
                com.tencent.mars.xlog.Log.i("MicroMsg.KVCommCrossProcessReceiver", "KVBroadCast onReceive TYPE_ONCRASHOREXCEPTION");
                com.tencent.mars.WeChatMars.onSingalCrash(0);
                if (com.tencent.paymars.WeChatMars.isEnable()) {
                    com.tencent.paymars.WeChatMars.onSingalCrash(0);
                }
            }
            if (gm0.k2.d(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
                new com.tencent.mm.sdk.platformtools.n3().postDelayed(new com.tencent.mm.plugin.report.service.u(kVCommCrossProcessReceiver), 5000L);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.KVCommCrossProcessReceiver", e17, "", new java.lang.Object[0]);
        }
    }
}
