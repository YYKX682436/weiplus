package e94;

/* loaded from: classes4.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e94.p f250385d;

    public o(e94.p pVar) {
        this.f250385d = pVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView$7$1");
        com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.g0 g0Var = (com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.g0) com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView.h(this.f250385d.f250386d);
        g0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onEndFlip", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$9");
        com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0 i0Var = g0Var.f163095a;
        if (com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.a(i0Var).getF65848t()) {
            com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.a(i0Var).getSwipeBackLayout().setEnableGesture(true);
        }
        com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.a(i0Var).b8();
        com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.a(i0Var).e8();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1700", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView gLTwistRoateCardsView = i0Var.f163103c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1700", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        if (gLTwistRoateCardsView != null) {
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.a(i0Var).findViewById(com.tencent.mm.R.id.m7g);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1700", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView gLTwistRoateCardsView2 = i0Var.f163103c;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1700", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            frameLayout.removeView(gLTwistRoateCardsView2);
        }
        if (com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.c(i0Var) != null) {
            com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.c(i0Var).P();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onEndFlip", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$9");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView$7$1");
    }
}
