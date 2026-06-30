package com.tencent.mm.plugin.sns.storage;

/* loaded from: classes4.dex */
public final class o0 extends dm.h {
    public static final l75.e0 D;

    static {
        new com.tencent.mm.plugin.sns.storage.n0(null);
        D = dm.h.initAutoDBInfo(com.tencent.mm.plugin.sns.storage.o0.class);
    }

    @Override // dm.h, l75.f0
    public l75.e0 getDBInfo() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDBInfo", "com.tencent.mm.plugin.sns.storage.AdDynamicCanvasInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDBInfo", "com.tencent.mm.plugin.sns.storage.AdDynamicCanvasInfo");
        return D;
    }
}
