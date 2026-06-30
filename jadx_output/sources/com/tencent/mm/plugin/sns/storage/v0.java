package com.tencent.mm.plugin.sns.storage;

/* loaded from: classes4.dex */
public final class v0 extends dm.i {
    public static final l75.e0 B;

    static {
        new com.tencent.mm.plugin.sns.storage.u0(null);
        B = dm.i.initAutoDBInfo(com.tencent.mm.plugin.sns.storage.v0.class);
    }

    @Override // dm.i, l75.f0
    public l75.e0 getDBInfo() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDBInfo", "com.tencent.mm.plugin.sns.storage.AdPullRecordsInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDBInfo", "com.tencent.mm.plugin.sns.storage.AdPullRecordsInfo");
        return B;
    }
}
