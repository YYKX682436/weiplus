package e94;

/* loaded from: classes4.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e94.n f250383d;

    public m(e94.n nVar) {
        this.f250383d = nVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView$6$1");
        e94.n nVar = this.f250383d;
        if (com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView.h(nVar.f250384d) != null) {
            com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.g0 g0Var = (com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.g0) com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView.h(nVar.f250384d);
            g0Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStartFlip", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$9");
            com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0 i0Var = g0Var.f163095a;
            if (!com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.r(i0Var)) {
                android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.b(i0Var), "alpha", 0.0f, 1.0f);
                ofFloat.setDuration(500L);
                ofFloat.start();
                android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.h(i0Var), "alpha", com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.h(i0Var).getAlpha(), 0.0f);
                ofFloat2.setDuration(300L);
                ofFloat2.start();
            }
            if (!com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.i(i0Var)) {
                android.view.View m17 = com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.m(i0Var);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(m17, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper$9", "onStartFlip", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                m17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(m17, "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper$9", "onStartFlip", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.m(i0Var), "alpha", 0.0f, 1.0f);
            ofFloat3.setDuration(500L);
            ofFloat3.start();
            android.view.View q17 = com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.c(i0Var).q();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(q17, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper$9", "onStartFlip", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            q17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(q17, "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper$9", "onStartFlip", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStartFlip", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$9");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView$6$1");
    }
}
