package com.tencent.mm.plugin.sns.ad.landingpage.helper.anim;

/* loaded from: classes4.dex */
public class j implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0 f163127d;

    public j(com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0 i0Var) {
        this.f163127d = i0Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$15");
        com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0 i0Var = this.f163127d;
        com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.a(i0Var).t7();
        com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.s(i0Var).getViewTreeObserver().removeOnPreDrawListener(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$15");
        return false;
    }
}
