package com.tencent.mm.plugin.sns.ad.landingpage.helper.anim;

/* loaded from: classes4.dex */
public class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0 f163150d;

    public z(com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0 i0Var) {
        this.f163150d = i0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$3");
        com.tencent.mars.xlog.Log.i("AdLandingPageEggCardHelper", "tryPlayLongPressAnim, after delay");
        com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0 i0Var = this.f163150d;
        android.view.View b17 = com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.b(i0Var);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(b17, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper$3", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        b17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(b17, "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper$3", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (!com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.i(i0Var)) {
            android.view.View m17 = com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.m(i0Var);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(m17, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper$3", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            m17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(m17, "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper$3", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View m18 = com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.m(i0Var);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(m18, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper$3", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        m18.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
        yj0.a.f(m18, "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper$3", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.b(i0Var), "alpha", 0.0f, 1.0f);
        ofFloat.addUpdateListener(new com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.x(this));
        ofFloat.addListener(new com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.y(this));
        ofFloat.setDuration(500L);
        ofFloat.start();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$3");
    }
}
