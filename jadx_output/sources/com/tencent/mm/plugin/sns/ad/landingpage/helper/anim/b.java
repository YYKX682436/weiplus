package com.tencent.mm.plugin.sns.ad.landingpage.helper.anim;

/* loaded from: classes4.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0 f163080d;

    public b(com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0 i0Var) {
        this.f163080d = i0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$10");
        com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0 i0Var = this.f163080d;
        com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.a(i0Var).b8();
        com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.a(i0Var).e8();
        if (com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.c(i0Var) != null) {
            com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.c(i0Var).P();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1800", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            android.util.Pair w17 = i0Var.w();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1800", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            if (com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.q(i0Var) != null && w17 != null) {
                com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.q(i0Var).P((java.lang.Integer) w17.first, (java.lang.String) w17.second);
            }
            if (com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.q(i0Var) != null) {
                com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.q(i0Var).S(true, true);
            }
            if (com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.p(i0Var) != null) {
                com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.p(i0Var).W(true, true, new com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.a(this));
            }
            if (com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.c(i0Var).g0()) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1900", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                i0Var.R();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1900", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.c(i0Var).n0();
                i0Var.L(false, false);
            }
            com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.c(i0Var).R();
            com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.j(i0Var);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$10");
    }
}
