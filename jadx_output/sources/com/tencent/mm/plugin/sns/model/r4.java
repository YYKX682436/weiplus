package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class r4 implements d95.c0 {
    @Override // d95.c0
    public java.lang.String[] a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSQLs", "com.tencent.mm.plugin.sns.model.SnsCore$15");
        com.tencent.mm.plugin.sns.storage.y1 y1Var = com.tencent.mm.plugin.sns.storage.a2.f165920g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSQL_CREATE", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage$Companion");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getSQL_CREATE$cp", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getSQL_CREATE$cp", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
        java.lang.String[] strArr = com.tencent.mm.plugin.sns.storage.a2.f165921h;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSQL_CREATE", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage$Companion");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSQLs", "com.tencent.mm.plugin.sns.model.SnsCore$15");
        return strArr;
    }
}
