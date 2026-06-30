package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

/* loaded from: classes4.dex */
public class ja implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f165291d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f165292e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f165293f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f165294g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.app.a5 f165295h;

    public ja(android.content.Context context, java.lang.String str, java.lang.String str2, int i17, com.tencent.mm.pluginsdk.model.app.a5 a5Var) {
        this.f165291d = context;
        this.f165292e = str;
        this.f165293f = str2;
        this.f165294g = i17;
        this.f165295h = a5Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil$3");
        android.content.Intent launchIntentForPackage = this.f165291d.getPackageManager().getLaunchIntentForPackage(this.f165292e);
        com.tencent.mars.xlog.Log.i("LandingPageUtil", "openApp, default, launchAppByWeChat, intent=" + launchIntentForPackage + ", appName=" + this.f165293f + ", showType=" + this.f165294g);
        ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).cj(this.f165291d, launchIntentForPackage, this.f165293f, this.f165294g, new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.ia(this), null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil$3");
    }
}
