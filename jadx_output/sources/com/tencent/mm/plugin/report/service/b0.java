package com.tencent.mm.plugin.report.service;

/* loaded from: classes12.dex */
public final class b0 extends com.tencent.mm.plugin.report.service.m {
    @Override // com.tencent.mm.plugin.report.service.n
    public void X3(android.os.Bundle bundle) {
        com.tencent.mm.plugin.report.service.BroadCastData broadCastData;
        bm5.f1.a();
        if (bundle == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.KVReportService", "bundle is null");
            return;
        }
        try {
            bundle.setClassLoader(com.tencent.mm.plugin.report.service.BroadCastData.class.getClassLoader());
            if (bundle.getInt("type") != 1 || (broadCastData = (com.tencent.mm.plugin.report.service.BroadCastData) bundle.getParcelable("BUNDLE_IDKEYGROUP")) == null) {
                return;
            }
            java.util.ArrayList arrayList = broadCastData.f158119f;
            java.util.ArrayList arrayList2 = broadCastData.f158118e;
            java.util.ArrayList arrayList3 = broadCastData.f158117d;
            com.tencent.mars.xlog.Log.i("MicroMsg.KVReportService", "KVReportService onReceive kvdata lenght: %d, idkey data lenght:%d,group lenght:%d", java.lang.Integer.valueOf(arrayList3.size()), java.lang.Integer.valueOf(arrayList2.size()), java.lang.Integer.valueOf(arrayList.size()));
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
            com.tencent.mars.xlog.Log.i("MicroMsg.KVReportService", "KVReportService received done");
        } catch (java.lang.Throwable th6) {
            oj.j.d("MicroMsg.KVReportService", th6, "", new java.lang.Object[0]);
        }
    }
}
