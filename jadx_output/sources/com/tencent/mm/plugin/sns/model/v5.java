package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class v5 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.Object f164720a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.Long f164721b;

    public v5(com.tencent.mm.plugin.sns.model.w5 w5Var, java.lang.Object obj) {
        this.f164720a = obj;
        a();
    }

    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("UpTime", "com.tencent.mm.plugin.sns.model.SnsLRUMap$TimeVal");
        this.f164721b = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("UpTime", "com.tencent.mm.plugin.sns.model.SnsLRUMap$TimeVal");
    }
}
