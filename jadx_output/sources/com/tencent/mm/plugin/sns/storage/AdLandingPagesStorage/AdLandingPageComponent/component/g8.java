package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

/* loaded from: classes4.dex */
public class g8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f165217d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h8 f165218e;

    public g8(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h8 h8Var, long j17) {
        this.f165218e = h8Var;
        this.f165217d = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent$3$3");
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h8 h8Var = this.f165218e;
        h8Var.f165239a.f165261s.k();
        h8Var.f165239a.f165261s.d();
        java.lang.String str = h8Var.f165239a.O().sphereImageUrl;
        if (!jb4.v.c(str, "scene_ad_landing")) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Sns.SphereImageView.AdLandingPageSphereImageComponent", "do shoot");
            jb4.v.f(h8Var.f165239a.f165261s, str, "scene_ad_landing");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Sns.SphereImageView.AdLandingPageSphereImageComponent", "enable sensor after shoot");
        h8Var.f165239a.f165261s.setSensorEnabled(true);
        com.tencent.mars.xlog.Log.i("MicroMsg.Sns.SphereImageView.AdLandingPageSphereImageComponent", "enable touch, delay=" + this.f165217d);
        h8Var.f165239a.f165261s.setTouchEnabled(true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent$3$3");
    }
}
