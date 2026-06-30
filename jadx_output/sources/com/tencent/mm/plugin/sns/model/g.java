package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.jj4 f164196d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164197e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164198f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.model.AdLandingPagesProxy f164199g;

    public g(com.tencent.mm.plugin.sns.model.AdLandingPagesProxy adLandingPagesProxy, r45.jj4 jj4Var, java.lang.String str, java.lang.String str2) {
        this.f164199g = adLandingPagesProxy;
        this.f164196d = jj4Var;
        this.f164197e = str;
        this.f164198f = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$5");
        com.tencent.mm.plugin.sns.model.l4.Cj().c(new com.tencent.mm.plugin.sns.model.q(this.f164199g, this.f164196d.f377855d));
        com.tencent.mm.plugin.sns.model.m0 Cj = com.tencent.mm.plugin.sns.model.l4.Cj();
        r45.jj4 jj4Var = this.f164196d;
        com.tencent.mm.storage.s7 d17 = com.tencent.mm.storage.s7.d();
        d17.f195313b = (int) (java.lang.System.currentTimeMillis() / 1000);
        Cj.g(jj4Var, 4, null, d17, this.f164197e, this.f164198f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$5");
    }
}
