package com.tencent.mm.plugin.sns.ad.landingpage.component.comp;

/* loaded from: classes4.dex */
public final class d2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f2 f162784d;

    public d2(com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f2 f2Var) {
        this.f162784d = f2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent$startWishGiftReqCardAnim$1$onAnimationStart$1");
        com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f2 f2Var = this.f162784d;
        android.widget.ImageView a17 = f2Var.V().a();
        c44.a.c();
        a17.setVisibility(8);
        a17.setAlpha(0.0f);
        android.widget.FrameLayout e17 = f2Var.V().e();
        c44.a.n();
        e17.setVisibility(0);
        e17.setAlpha(1.0f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent$startWishGiftReqCardAnim$1$onAnimationStart$1");
    }
}
