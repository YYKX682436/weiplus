package com.tencent.mm.plugin.sns.ad.landingpage.helper.anim;

/* loaded from: classes4.dex */
public class e0 implements a94.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f163088a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0 f163089b;

    public e0(com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0 i0Var, boolean z17) {
        this.f163089b = i0Var;
        this.f163088a = z17;
    }

    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onEndFlip", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$7");
        com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0 i0Var = this.f163089b;
        com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView s17 = com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.s(i0Var);
        s17.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isPAGAniming", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
        boolean z17 = s17.f163827m;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isPAGAniming", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
        com.tencent.mars.xlog.Log.i("AdLandingPageEggCardHelper", "onEndFlip, isPagAniming=" + z17);
        if (com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.a(i0Var).getF65848t()) {
            com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.a(i0Var).getSwipeBackLayout().setEnableGesture(true);
        }
        if (!com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.i(i0Var)) {
            android.view.View m17 = com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.m(i0Var);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(m17, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper$7", "onEndFlip", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            m17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(m17, "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper$7", "onEndFlip", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        boolean z18 = this.f163088a;
        if (!z18) {
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.m(i0Var), "alpha", 0.0f, 1.0f);
            ofFloat.setDuration(500L);
            ofFloat.start();
        }
        if (z18) {
            com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.s(i0Var).setVisibility(8);
        } else {
            com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.a(i0Var).b8();
            com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.a(i0Var).e8();
            if (!z17) {
                com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.s(i0Var).setVisibility(8);
            }
        }
        if (com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.c(i0Var) != null) {
            com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.c(i0Var).P();
            if (com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.c(i0Var).e0()) {
                com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.c(i0Var).i0(true);
                com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.c(i0Var).m0();
                com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.d(i0Var).removeCallbacksAndMessages(null);
                com.tencent.mm.plugin.sns.ad.landingpage.component.comp.b0 c17 = com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.c(i0Var);
                c17.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isShowDoubleHBCard", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
                boolean z19 = c17.B;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isShowDoubleHBCard", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
                if (z19) {
                    com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.d(i0Var).sendEmptyMessageDelayed(3, 7000L);
                } else {
                    com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.d(i0Var).sendEmptyMessageDelayed(1, 3000L);
                }
            } else {
                i0Var.L(true, true);
            }
            com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.c(i0Var).R();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onEndFlip", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$7");
    }

    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPrepareCard", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$7");
        com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0 i0Var = this.f163089b;
        com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.h0 e17 = com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.e(i0Var);
        java.lang.String str = e17.f163097a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onPrepareCard, shakeCardId=");
        sb6.append(str);
        sb6.append(", ext=");
        java.lang.String str2 = e17.f163098b;
        sb6.append(str2);
        com.tencent.mars.xlog.Log.i("AdLandingPageEggCardHelper", sb6.toString());
        try {
            boolean isEmpty = android.text.TextUtils.isEmpty(str);
            boolean z17 = this.f163088a;
            if (isEmpty) {
                a94.m.a(com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.a(i0Var).A7(), 2, z17);
                if (z17) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1572, 14);
                } else {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1572, 6);
                }
            } else {
                a94.m.a(com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.a(i0Var).A7(), 1, z17);
                if (z17) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1572, 13);
                } else {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1572, 5);
                }
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdLandingPageEggCardHelper", "shake report exp=" + th6.toString());
        }
        if (com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.c(i0Var) != null) {
            com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.c(i0Var).h0(str, str2);
            com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.g(i0Var, com.tencent.mm.plugin.sns.ad.landingpage.component.comp.b0.S(com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.c(i0Var).Z()));
            com.tencent.mars.xlog.Log.i("AdLandingPageEggCardHelper", "findAnimCardView, view=" + com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.f(i0Var));
            if (com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.f(i0Var) != null) {
                android.view.View f17 = com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.f(i0Var);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Float.valueOf(0.0f));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(f17, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper$7", "onPrepareCard", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                f17.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                yj0.a.f(f17, "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper$7", "onPrepareCard", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.s(i0Var).setAnimCardView(com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.f(i0Var));
            } else {
                com.tencent.mars.xlog.Log.e("AdLandingPageEggCardHelper", "mShakeCardAnimView==null");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPrepareCard", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$7");
    }
}
