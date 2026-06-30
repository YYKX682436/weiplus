package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164243d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164244e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164245f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f164246g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f164247h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f164248i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f164249m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.model.AdLandingPagesProxy f164250n;

    public i(com.tencent.mm.plugin.sns.model.AdLandingPagesProxy adLandingPagesProxy, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, boolean z17, int i18, boolean z18) {
        this.f164250n = adLandingPagesProxy;
        this.f164243d = str;
        this.f164244e = str2;
        this.f164245f = str3;
        this.f164246g = i17;
        this.f164247h = z17;
        this.f164248i = i18;
        this.f164249m = z18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$6");
        gm0.j1.e().j(new com.tencent.mm.plugin.sns.model.h(this, com.tencent.mm.plugin.sns.model.l4.Cj()));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$6");
    }
}
