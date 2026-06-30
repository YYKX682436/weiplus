package com.tencent.mm.plugin.sns.model;

/* loaded from: classes8.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f164334d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164335e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f164336f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.model.AdLandingPagesProxy f164337g;

    public k(com.tencent.mm.plugin.sns.model.AdLandingPagesProxy adLandingPagesProxy, int i17, java.lang.String str, long j17) {
        this.f164337g = adLandingPagesProxy;
        this.f164334d = i17;
        this.f164335e = str;
        this.f164336f = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$7");
        ((jd0.q2) ((kd0.x2) i95.n0.c(kd0.x2.class))).getClass();
        new com.tencent.mm.plugin.scanner.y().a(this.f164334d, new kd0.f2(this.f164335e)).a(new com.tencent.mm.plugin.sns.model.j(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$7");
    }
}
