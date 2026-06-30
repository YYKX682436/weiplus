package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class z5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164808d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f164809e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f164810f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f164811g;

    public z5(com.tencent.mm.plugin.sns.model.d6 d6Var, java.lang.String str, boolean z17, int i17, int i18) {
        this.f164808d = str;
        this.f164809e = z17;
        this.f164810f = i17;
        this.f164811g = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer$3");
        if (!com.tencent.mm.plugin.sns.model.q3.H(this.f164808d)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer$3");
            return;
        }
        gm0.j1.i();
        com.tencent.mm.modelbase.r1 r1Var = gm0.j1.n().f273288b;
        java.lang.String str = this.f164808d;
        boolean z17 = this.f164809e;
        r1Var.g(new com.tencent.mm.plugin.sns.model.q3(str, 0L, z17, this.f164810f, -1, 0, z17 ? 4 : 8, this.f164811g));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer$3");
    }
}
