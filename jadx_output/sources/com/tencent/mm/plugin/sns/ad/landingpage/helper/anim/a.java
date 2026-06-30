package com.tencent.mm.plugin.sns.ad.landingpage.helper.anim;

/* loaded from: classes4.dex */
public class a extends c84.f {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.b f163078e;

    public a(com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.b bVar) {
        this.f163078e = bVar;
    }

    @Override // c84.f, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$10$1");
        com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.p(this.f163078e.f163080d).O();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$10$1");
    }
}
