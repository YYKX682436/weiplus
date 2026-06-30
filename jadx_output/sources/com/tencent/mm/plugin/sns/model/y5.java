package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class y5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164769d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f164770e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f164771f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f164772g;

    public y5(com.tencent.mm.plugin.sns.model.d6 d6Var, java.lang.String str, boolean z17, int i17, int i18) {
        this.f164769d = str;
        this.f164770e = z17;
        this.f164771f = i17;
        this.f164772g = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer$2");
        if (!com.tencent.mm.plugin.sns.model.n3.H(this.f164769d)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer$2");
            return;
        }
        gm0.j1.i();
        com.tencent.mm.modelbase.r1 r1Var = gm0.j1.n().f273288b;
        java.lang.String str = this.f164769d;
        boolean z17 = this.f164770e;
        r1Var.g(new com.tencent.mm.plugin.sns.model.n3(str, 0L, z17, this.f164771f, -1, 0, z17 ? 4 : 8, this.f164772g));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer$2");
    }
}
