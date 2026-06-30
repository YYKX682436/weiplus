package e94;

/* loaded from: classes4.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView f250382d;

    public l(com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView gLTwistRoateCardsView) {
        this.f250382d = gLTwistRoateCardsView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView$5");
        com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView gLTwistRoateCardsView = this.f250382d;
        if (com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView.h(gLTwistRoateCardsView) != null) {
            com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.g0 g0Var = (com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.g0) com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView.h(gLTwistRoateCardsView);
            g0Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPrepareCard", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$9");
            com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0 i0Var = g0Var.f163095a;
            com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.h0 e17 = com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.e(i0Var);
            java.lang.String str = e17.f163097a;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onPrepareCard, twistId=");
            sb6.append(str);
            sb6.append(", ext=");
            java.lang.String str2 = e17.f163098b;
            sb6.append(str2);
            com.tencent.mars.xlog.Log.i("AdLandingPageEggCardHelper", sb6.toString());
            com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.c(i0Var).h0(str, str2);
            try {
                if (android.text.TextUtils.isEmpty(str)) {
                    com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView.g(com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.a(i0Var).A7(), 2);
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1572, 8);
                } else {
                    com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView.g(com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.a(i0Var).A7(), 1);
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1572, 7);
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("AdLandingPageEggCardHelper", "twist report exp=" + th6.toString());
            }
            com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.g(i0Var, com.tencent.mm.plugin.sns.ad.landingpage.component.comp.b0.S(com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.c(i0Var).Z()));
            if (com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.f(i0Var) != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1700", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView gLTwistRoateCardsView2 = i0Var.f163103c;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1700", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                gLTwistRoateCardsView2.setAnimCardView(com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.f(i0Var));
                android.view.View f17 = com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.f(i0Var);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Float.valueOf(0.0f));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(f17, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper$9", "onPrepareCard", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                f17.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                yj0.a.f(f17, "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper$9", "onPrepareCard", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            } else {
                com.tencent.mars.xlog.Log.e("AdLandingPageEggCardHelper", "mTwistCardAnimView==null");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPrepareCard", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$9");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView$5");
    }
}
