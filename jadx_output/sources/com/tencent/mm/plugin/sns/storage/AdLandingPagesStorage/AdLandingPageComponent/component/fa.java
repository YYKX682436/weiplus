package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

/* loaded from: classes4.dex */
public class fa implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f165190d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f165191e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f165192f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f165193g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.app.a5 f165194h;

    public fa(android.content.Context context, android.content.Intent intent, java.lang.String str, int i17, com.tencent.mm.pluginsdk.model.app.a5 a5Var) {
        this.f165190d = context;
        this.f165191e = intent;
        this.f165192f = str;
        this.f165193g = i17;
        this.f165194h = a5Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil$1");
        android.content.Context context = this.f165190d;
        android.content.Intent intent = this.f165191e;
        if (com.tencent.mm.sdk.platformtools.t8.I0(context, intent, true, false)) {
            com.tencent.mars.xlog.Log.i("LandingPageUtil", "openApp, launchAppByWeChat, targetIntent=" + intent + ", appName=" + this.f165192f + ", showType=" + this.f165193g);
            ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).cj(this.f165190d, this.f165191e, this.f165192f, this.f165193g, new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.ea(this), null);
        } else {
            com.tencent.mars.xlog.Log.e("LandingPageUtil", "openApp, isIntentAvailable==false, intent=" + intent);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil$1");
    }
}
