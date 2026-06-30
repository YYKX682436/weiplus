package com.tencent.mm.plugin.sns.ad.landingpage.helper.anim;

/* loaded from: classes4.dex */
public class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0 f163081d;

    public b0(com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0 i0Var) {
        this.f163081d = i0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$4");
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(this.f163081d.f163112l, "alpha", 1.0f, 0.0f);
        ofFloat.addListener(new com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.a0(this));
        ofFloat.setDuration(300L);
        ofFloat.start();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$4");
    }
}
