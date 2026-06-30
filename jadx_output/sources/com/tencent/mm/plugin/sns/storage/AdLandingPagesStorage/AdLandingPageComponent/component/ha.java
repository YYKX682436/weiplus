package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

/* loaded from: classes4.dex */
public class ha implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f165242d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f165243e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f165244f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f165245g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.app.a5 f165246h;

    public ha(android.content.Context context, android.content.Intent intent, java.lang.String str, int i17, com.tencent.mm.pluginsdk.model.app.a5 a5Var) {
        this.f165242d = context;
        this.f165243e = intent;
        this.f165244f = str;
        this.f165245g = i17;
        this.f165246h = a5Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil$2");
        ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).cj(this.f165242d, this.f165243e, this.f165244f, this.f165245g, new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.ga(this), null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil$2");
    }
}
