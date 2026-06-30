package com.tencent.mm.plugin.sns.ad.landingpage.helper.anim;

/* loaded from: classes4.dex */
public class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0 f163085d;

    public d0(com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0 i0Var) {
        this.f163085d = i0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$6");
        com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0 i0Var = this.f163085d;
        if (!com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.r(i0Var)) {
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.b(i0Var), "alpha", 0.0f, 1.0f);
            ofFloat.setDuration(200L);
            ofFloat.start();
        }
        com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.s(i0Var).e();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$6");
    }
}
