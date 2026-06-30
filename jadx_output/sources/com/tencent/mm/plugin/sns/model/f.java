package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.jj4 f164178d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ca4.s0 f164179e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164180f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164181g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.model.AdLandingPagesProxy f164182h;

    public f(com.tencent.mm.plugin.sns.model.AdLandingPagesProxy adLandingPagesProxy, r45.jj4 jj4Var, ca4.s0 s0Var, java.lang.String str, java.lang.String str2) {
        this.f164182h = adLandingPagesProxy;
        this.f164178d = jj4Var;
        this.f164179e = s0Var;
        this.f164180f = str;
        this.f164181g = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$4");
        com.tencent.mm.plugin.sns.model.l4.Cj().c(new com.tencent.mm.plugin.sns.model.q(this.f164182h, this.f164178d.f377855d));
        com.tencent.mm.plugin.sns.model.m0 Cj = com.tencent.mm.plugin.sns.model.l4.Cj();
        r45.jj4 jj4Var = this.f164178d;
        ca4.s0 s0Var = this.f164179e;
        com.tencent.mm.storage.s7 d17 = com.tencent.mm.storage.s7.d();
        d17.f195313b = (int) (java.lang.System.currentTimeMillis() / 1000);
        Cj.g(jj4Var, 8, s0Var, d17, this.f164180f, this.f164181g);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$4");
    }
}
