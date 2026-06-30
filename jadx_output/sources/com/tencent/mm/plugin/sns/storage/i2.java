package com.tencent.mm.plugin.sns.storage;

/* loaded from: classes4.dex */
public final class i2 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.sns.storage.i2 f166022a = new com.tencent.mm.plugin.sns.storage.i2();

    public final java.util.List a(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsInfoLargeThanCreateTime", "com.tencent.mm.plugin.sns.storage.SnsInfoStorageKt");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsInfoStorageKt", "getSnsInfoLargeThanCreateTime >> createTime: " + i17);
        p75.i0 i18 = dm.va.TABLE.i();
        p75.d dVar = dm.va.CREATETIME;
        java.lang.String value = java.lang.String.valueOf(i17);
        dVar.getClass();
        kotlin.jvm.internal.o.g(value, "value");
        i18.f352657d = new p75.u0(dVar.z(), value);
        i18.e(dVar.u());
        java.util.List<com.tencent.mm.plugin.sns.storage.SnsInfo> k17 = i18.a().k(com.tencent.mm.plugin.sns.model.l4.aj(), com.tencent.mm.plugin.sns.storage.SnsInfo.class);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsInfoStorageKt", "getSnsInfoLargeThanCreateTime >> createTime: " + i17 + ", size: " + ((java.util.ArrayList) k17).size());
        for (com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo : k17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsInfoStorageKt", "getSnsInfoLargeThanCreateTime >> " + snsInfo.getCreateTime() + ", " + snsInfo.getSnsId() + ". " + snsInfo.localid);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsInfoLargeThanCreateTime", "com.tencent.mm.plugin.sns.storage.SnsInfoStorageKt");
        return k17;
    }

    public final java.util.List b(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsInfoSmallThanCreateTimeAndLimit", "com.tencent.mm.plugin.sns.storage.SnsInfoStorageKt");
        p75.i0 i19 = dm.va.TABLE.i();
        p75.d dVar = dm.va.CREATETIME;
        java.lang.String value = java.lang.String.valueOf(i17);
        dVar.getClass();
        kotlin.jvm.internal.o.g(value, "value");
        i19.f352657d = new p75.d1(dVar.z(), value);
        i19.e(dVar.u());
        i19.c(i18, 0);
        java.util.List k17 = i19.a().k(com.tencent.mm.plugin.sns.model.l4.aj(), com.tencent.mm.plugin.sns.storage.SnsInfo.class);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getSnsInfoSmallThanCreateTimeAndLimit >> createTime: ");
        sb6.append(i17);
        sb6.append(", size: ");
        java.util.ArrayList arrayList = (java.util.ArrayList) k17;
        sb6.append(arrayList.size());
        sb6.append(", limit: ");
        sb6.append(i18);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsInfoStorageKt", sb6.toString());
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = (com.tencent.mm.plugin.sns.storage.SnsInfo) it.next();
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsInfoStorageKt", "getSnsInfoSmallThanCreateTimeAndLimit >> " + snsInfo.getCreateTime() + ", " + snsInfo.getSnsId() + ". " + snsInfo.localid);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsInfoSmallThanCreateTimeAndLimit", "com.tencent.mm.plugin.sns.storage.SnsInfoStorageKt");
        return k17;
    }
}
