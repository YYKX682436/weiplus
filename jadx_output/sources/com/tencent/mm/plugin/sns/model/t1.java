package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class t1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164684d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.model.u1 f164685e;

    public t1(com.tencent.mm.plugin.sns.model.u1 u1Var, java.lang.String str) {
        this.f164685e = u1Var;
        this.f164684d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$5$1");
        java.lang.String str = this.f164684d;
        new com.tencent.mm.plugin.sns.model.g2(ca4.z0.x(0, str), str, this.f164685e.f164699d).d("");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$5$1");
    }
}
