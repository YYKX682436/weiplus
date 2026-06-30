package com.tencent.mm.plugin.sns.ad.landingpage.helper.anim;

/* loaded from: classes4.dex */
public class g implements e94.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f163093a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0 f163094b;

    public g(com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0 i0Var, boolean z17) {
        this.f163094b = i0Var;
        this.f163093a = z17;
    }

    @Override // e94.f0
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStartFlip", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$12");
        com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0 i0Var = this.f163094b;
        if (com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.a(i0Var).isFinishing()) {
            com.tencent.mars.xlog.Log.e("AdLandingPageEggCardHelper", "tryPlayHugeDiskAnimation, onStartFlip finishing");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStartFlip", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$12");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2100", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        i0Var.S(true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2100", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        boolean r17 = com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.r(i0Var);
        boolean z17 = this.f163093a;
        if (!r17 && !z17) {
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.b(i0Var), "alpha", 0.0f, 1.0f);
            ofFloat.setDuration(500L);
            ofFloat.start();
            android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.h(i0Var), "alpha", com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.h(i0Var).getAlpha(), 0.0f);
            ofFloat2.setDuration(300L);
            ofFloat2.start();
            android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(i0Var.f163120t, "alpha", 0.0f, 1.0f);
            ofFloat3.setDuration(500L);
            ofFloat3.start();
        }
        if (!z17) {
            if (!com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.i(i0Var)) {
                android.view.View m17 = com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.m(i0Var);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(m17, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper$12", "onStartFlip", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                m17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(m17, "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper$12", "onStartFlip", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.m(i0Var), "alpha", 0.0f, 1.0f);
            ofFloat4.setDuration(500L);
            ofFloat4.start();
        }
        android.view.View q17 = com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.c(i0Var).q();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(q17, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper$12", "onStartFlip", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        q17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(q17, "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper$12", "onStartFlip", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStartFlip", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$12");
    }

    @Override // e94.f0
    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPrepareCard", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$12");
        com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0 i0Var = this.f163094b;
        if (com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.a(i0Var).isFinishing()) {
            com.tencent.mars.xlog.Log.e("AdLandingPageEggCardHelper", "tryPlayHugeDiskAnimation, onPrepareCard finishing");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPrepareCard", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$12");
            return;
        }
        com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.h0 e17 = com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.e(i0Var);
        java.lang.String str = e17.f163097a;
        java.lang.String h07 = com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.c(i0Var).h0(e17.f163097a, e17.f163098b);
        com.tencent.mars.xlog.Log.i("AdLandingPageEggCardHelper", "tryPlayHugeDiskAnimation, onPrepareCard, cardInfo=" + e17 + ", displayId=" + h07 + ", cardId=" + str + ", isPreview=" + i0Var.E() + ", isSendEggCardIdReq=" + com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.l(i0Var));
        java.lang.String i17 = com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.a(i0Var).A7().i();
        if (!i0Var.E() && com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.l(i0Var)) {
            p44.b0.n(i17, h07, com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.o(i0Var));
        } else if (i0Var.E() && !android.text.TextUtils.isEmpty(h07) && !h07.equals(str)) {
            com.tencent.mars.xlog.Log.e("AdLandingPageEggCardHelper", "onPrepareCard, previewMode, err cardId, select default");
            r45.d53 d53Var = new r45.d53();
            d53Var.f372125d = h07;
            d53Var.f372126e = c01.id.e();
            p44.b0.l(d53Var);
        }
        if (com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.p(i0Var) != null) {
            com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.p(i0Var).S();
            com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.p(i0Var).T();
            com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.p(i0Var).U(h07);
        }
        try {
            if (android.text.TextUtils.isEmpty(str)) {
                com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView.g(com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.a(i0Var).A7(), 2);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1572, 8);
            } else {
                com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView.g(com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.a(i0Var).A7(), 1);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1572, 7);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdLandingPageEggCardHelper", "tryPlayHugeDiskAnimation report exp=" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.g(i0Var, com.tencent.mm.plugin.sns.ad.landingpage.component.comp.b0.S(com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.c(i0Var).Z()));
        if (com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.f(i0Var) != null) {
            i0Var.N.setAnimCardView(com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.f(i0Var));
            android.view.View f17 = com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.f(i0Var);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(f17, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper$12", "onPrepareCard", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            f17.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(f17, "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper$12", "onPrepareCard", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        } else {
            com.tencent.mars.xlog.Log.e("AdLandingPageEggCardHelper", "tryPlayHugeDiskAnimation, eggCardAnimView==null");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPrepareCard", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$12");
    }

    @Override // e94.f0
    public void c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onEndFlip", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$12");
        com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0 i0Var = this.f163094b;
        if (com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.a(i0Var).isFinishing()) {
            com.tencent.mars.xlog.Log.e("AdLandingPageEggCardHelper", "tryPlayHugeDiskAnimation, onEndFlip finishing");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onEndFlip", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$12");
            return;
        }
        if (com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.a(i0Var).getF65848t()) {
            com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.a(i0Var).getSwipeBackLayout().setEnableGesture(true);
        }
        com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.a(i0Var).b8();
        com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.a(i0Var).e8();
        i0Var.N.setVisibility(8);
        if (com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.c(i0Var) != null) {
            com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.c(i0Var).P();
            if (com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.f(i0Var) != null) {
                android.view.View f17 = com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.f(i0Var);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Float.valueOf(1.0f));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(f17, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper$12", "onEndFlip", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                f17.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                yj0.a.f(f17, "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper$12", "onEndFlip", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            android.view.View S = com.tencent.mm.plugin.sns.ad.landingpage.component.comp.b0.S(com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.c(i0Var).Z());
            if (S != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(java.lang.Float.valueOf(1.0f));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(S, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper$12", "onEndFlip", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                S.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                yj0.a.f(S, "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper$12", "onEndFlip", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            if (com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.p(i0Var) != null) {
                com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.p(i0Var).W(true, true, new com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.f(this));
            }
            if (com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.c(i0Var).g0()) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1900", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                boolean R = i0Var.R();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1900", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2600", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkShowPickToast", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                if (i0Var.D()) {
                    boolean C = i0Var.C();
                    com.tencent.mars.xlog.Log.i("AdLandingPageEggCardHelper", "checkShowPickToast, isUnPickedChanged=" + R + ", isAllPicked=" + C + ", hasSendReq=" + i0Var.P + ", source=" + i0Var.A);
                    if (!R && !C && !i0Var.E() && i0Var.P) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showContinuePickToast", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                        try {
                            i0Var.x();
                            com.tencent.mars.xlog.Log.i("AdLandingPageEggCardHelper", "showContinuePickToast");
                            com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = i0Var.f163101a;
                            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(snsAdNativeLandingPagesUI);
                            e4Var.f211776c = snsAdNativeLandingPagesUI.getString(com.tencent.mm.R.string.m6n);
                            i0Var.K = e4Var.c();
                        } catch (java.lang.Exception e17) {
                            com.tencent.mars.xlog.Log.e("AdLandingPageEggCardHelper", "showContinuePickToast, exp=" + e17);
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showContinuePickToast", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(com.tencent.rtmp.TXLiveConstants.PLAY_WARNING_VIDEO_TIMESTAMP_ROLLBACK, 13);
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkShowPickToast", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                } else {
                    com.tencent.mars.xlog.Log.w("AdLandingPageEggCardHelper", "checkShowPickToast, exp disabled");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkShowPickToast", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2600", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.c(i0Var).n0();
                i0Var.L(false, false);
            }
            com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.c(i0Var).R();
            com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.j(i0Var);
            com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.k(i0Var);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onEndFlip", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$12");
    }
}
