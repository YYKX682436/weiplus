package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

/* loaded from: classes.dex */
public class b6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f165088d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f165089e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f165090f;

    public b6(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.c6 c6Var, android.content.Context context, android.content.Intent intent, java.lang.String str) {
        this.f165088d = context;
        this.f165089e = intent;
        this.f165090f = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageOpenAppBtnComp$1");
        ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
        com.tencent.mm.pluginsdk.model.app.w.v(this.f165088d, this.f165089e, this.f165090f, null, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageOpenAppBtnComp$1");
    }
}
