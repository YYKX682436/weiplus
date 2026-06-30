package com.tencent.mm.plugin.sns.ad.landingpage.helper.anim;

/* loaded from: classes4.dex */
public class a0 extends c84.f {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.b0 f163079e;

    public a0(com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.b0 b0Var) {
        this.f163079e = b0Var;
    }

    @Override // c84.f, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.b0 b0Var = this.f163079e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$4$1");
        try {
            com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0 i0Var = b0Var.f163081d;
            com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0 i0Var2 = b0Var.f163081d;
            i0Var.f163112l.setVisibility(4);
            com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI a17 = com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.a(i0Var2);
            a17.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRootView", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            android.widget.FrameLayout frameLayout = a17.L1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRootView", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            if (frameLayout != null) {
                com.tencent.mars.xlog.Log.i("AdLandingPageEggCardHelper", "removeView LongPressAnimView");
                frameLayout.removeView(i0Var2.f163112l);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdLandingPageEggCardHelper", "remove LongPressAnimView, exp=" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$4$1");
    }
}
