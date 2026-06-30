package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class b5 implements d95.c0 {
    @Override // d95.c0
    public java.lang.String[] a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSQLs", "com.tencent.mm.plugin.sns.model.SnsCore$4");
        java.lang.String[] strArr = com.tencent.mm.plugin.sns.storage.w0.f166153e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSQLs", "com.tencent.mm.plugin.sns.model.SnsCore$4");
        return strArr;
    }
}
