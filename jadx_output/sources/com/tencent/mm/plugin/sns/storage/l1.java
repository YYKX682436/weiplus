package com.tencent.mm.plugin.sns.storage;

/* loaded from: classes4.dex */
public abstract class l1 {
    public static com.tencent.mm.plugin.sns.storage.SnsInfo a(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.plugin.sns.storage.MergeInfoStorage");
        if (com.tencent.mm.plugin.sns.storage.w2.g(str)) {
            com.tencent.mm.plugin.sns.storage.SnsInfo W0 = com.tencent.mm.plugin.sns.model.l4.Fj().W0(com.tencent.mm.plugin.sns.storage.w2.n(str));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.storage.MergeInfoStorage");
            return W0;
        }
        com.tencent.mm.plugin.sns.storage.AdSnsInfo y07 = com.tencent.mm.plugin.sns.model.l4.Vi().y0(com.tencent.mm.plugin.sns.storage.w2.n(str));
        if (y07 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.storage.MergeInfoStorage");
            return null;
        }
        com.tencent.mm.plugin.sns.storage.SnsInfo convertToSnsInfo = y07.convertToSnsInfo();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.storage.MergeInfoStorage");
        return convertToSnsInfo;
    }

    public static com.tencent.mm.plugin.sns.storage.SnsInfo b(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getByLocalId", "com.tencent.mm.plugin.sns.storage.MergeInfoStorage");
        if (com.tencent.mm.plugin.sns.storage.w2.g(str)) {
            com.tencent.mm.plugin.sns.storage.SnsInfo i17 = com.tencent.mm.plugin.sns.model.l4.Fj().i1(com.tencent.mm.plugin.sns.storage.w2.m(str));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getByLocalId", "com.tencent.mm.plugin.sns.storage.MergeInfoStorage");
            return i17;
        }
        com.tencent.mm.plugin.sns.storage.AdSnsInfo L0 = com.tencent.mm.plugin.sns.model.l4.Vi().L0(com.tencent.mm.plugin.sns.storage.w2.m(str));
        if (L0 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getByLocalId", "com.tencent.mm.plugin.sns.storage.MergeInfoStorage");
            return null;
        }
        com.tencent.mm.plugin.sns.storage.SnsInfo convertToSnsInfo = L0.convertToSnsInfo();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getByLocalId", "com.tencent.mm.plugin.sns.storage.MergeInfoStorage");
        return convertToSnsInfo;
    }

    public static boolean c(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        boolean V2;
        androidx.lifecycle.c1 a17;
        androidx.lifecycle.c1 a18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("replace", "com.tencent.mm.plugin.sns.storage.MergeInfoStorage");
        if (snsInfo.isAd()) {
            com.tencent.mm.plugin.sns.storage.AdSnsInfo adSnsInfo = snsInfo.getAdSnsInfo();
            V2 = com.tencent.mm.plugin.sns.model.l4.Vi().replace(adSnsInfo);
            if (V2) {
                synchronized (jm0.k.f300270i) {
                    gm0.j1.b().c();
                    if (!jm0.k.class.isAssignableFrom(zc4.h.class)) {
                        throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                    }
                    a18 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new jm0.h()).a(zc4.h.class);
                }
                ((zc4.g) ((zc4.h) a18).P6(zc4.g.class)).d7(adSnsInfo.localid, o75.b.f343583d);
            }
        } else {
            V2 = com.tencent.mm.plugin.sns.model.l4.Fj().V2(snsInfo);
            if (V2) {
                synchronized (jm0.k.f300270i) {
                    gm0.j1.b().c();
                    if (!jm0.k.class.isAssignableFrom(zc4.h.class)) {
                        throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                    }
                    a17 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new jm0.h()).a(zc4.h.class);
                }
                ((zc4.g) ((zc4.h) a17).P6(zc4.g.class)).i7(snsInfo.field_snsId, o75.b.f343583d);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("replace", "com.tencent.mm.plugin.sns.storage.MergeInfoStorage");
        return V2;
    }

    public static boolean d(java.lang.String str, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("update", "com.tencent.mm.plugin.sns.storage.MergeInfoStorage");
        if (com.tencent.mm.plugin.sns.storage.w2.g(str)) {
            boolean v37 = com.tencent.mm.plugin.sns.model.l4.Fj().v3(com.tencent.mm.plugin.sns.storage.w2.n(str), snsInfo);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("update", "com.tencent.mm.plugin.sns.storage.MergeInfoStorage");
            return v37;
        }
        boolean b17 = com.tencent.mm.plugin.sns.model.l4.Vi().b1(com.tencent.mm.plugin.sns.storage.w2.n(str), snsInfo.getAdSnsInfo());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("update", "com.tencent.mm.plugin.sns.storage.MergeInfoStorage");
        return b17;
    }
}
