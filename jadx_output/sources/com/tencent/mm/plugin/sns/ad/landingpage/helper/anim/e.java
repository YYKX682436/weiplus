package com.tencent.mm.plugin.sns.ad.landingpage.helper.anim;

/* loaded from: classes4.dex */
public class e implements e94.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f163086a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0 f163087b;

    public e(com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0 i0Var, boolean z17) {
        this.f163087b = i0Var;
        this.f163086a = z17;
    }

    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onEggCardEndFlip", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$11");
        com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0 i0Var = this.f163087b;
        if (com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.a(i0Var).isFinishing()) {
            com.tencent.mars.xlog.Log.e("AdLandingPageEggCardHelper", "tryPlayFlyingFlipAnimation, onEggCardEndFlip finishing");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onEggCardEndFlip", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$11");
            return;
        }
        if (com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.a(i0Var).getF65848t()) {
            com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.a(i0Var).getSwipeBackLayout().setEnableGesture(true);
        }
        com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.a(i0Var).b8();
        com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.a(i0Var).e8();
        if (com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.c(i0Var) != null) {
            com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.c(i0Var).P();
            if (com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.f(i0Var) != null) {
                android.view.View f17 = com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.f(i0Var);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Float.valueOf(1.0f));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(f17, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper$11", "onEggCardEndFlip", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                f17.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                yj0.a.f(f17, "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper$11", "onEggCardEndFlip", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            android.view.View S = com.tencent.mm.plugin.sns.ad.landingpage.component.comp.b0.S(com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.c(i0Var).Z());
            if (S != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(java.lang.Float.valueOf(1.0f));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(S, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper$11", "onEggCardEndFlip", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                S.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                yj0.a.f(S, "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper$11", "onEggCardEndFlip", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            if (com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.q(i0Var) != null) {
                com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.q(i0Var).S(true, true);
            }
            int pickStatus = i0Var.O.getPickStatus();
            if (pickStatus == 0 || pickStatus == 3) {
                com.tencent.mm.plugin.sns.ad.landingpage.component.comp.b0 c17 = com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.c(i0Var);
                c17.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showBackgroundViewAlphaAnim", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
                android.widget.ImageView imageView = c17.f162761z;
                if (imageView == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showBackgroundViewAlphaAnim", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
                } else {
                    android.animation.ObjectAnimator b17 = com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.m0.f163131a.b(imageView, new com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.n0(0.17f, 0.17f, 0.64f, 1.0f, 300L), imageView.getAlpha(), 1.0f);
                    if (b17 != null) {
                        b17.start();
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showBackgroundViewAlphaAnim", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
                }
            }
            com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.c(i0Var).l0(true, true, pickStatus);
            if (com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.p(i0Var) != null) {
                com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.p(i0Var).W(true, true, new com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.d(this));
            }
            if (com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.c(i0Var).g0()) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1900", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                boolean R = i0Var.R();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1900", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2200", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkShowFlyingFlipContinuePickToast", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                try {
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("AdLandingPageEggCardHelper", "showFlyingFlipContinuePickToast, exp=" + e17);
                }
                if (i0Var.D()) {
                    if (!R && !i0Var.E() && i0Var.P && i0Var.E != -1) {
                        i0Var.x();
                        com.tencent.mars.xlog.Log.i("AdLandingPageEggCardHelper", "showFlyingFlipContinuePickToast");
                        f54.f fVar = (f54.f) i0Var.f163107g.p();
                        java.lang.String str = fVar.f259719J;
                        com.tencent.mm.plugin.sns.ad.landingpage.component.comp.b0 b0Var = i0Var.f163107g;
                        b0Var.getClass();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getHBCardComp", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
                        com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent adLandingHBCardComponent = b0Var.C;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getHBCardComp", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
                        if (adLandingHBCardComponent != null) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSubCardType", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
                            int i17 = adLandingHBCardComponent.f162736w;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSubCardType", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
                            if (i17 == 2) {
                                str = fVar.K;
                            }
                        }
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                            com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = i0Var.f163101a;
                            int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(snsAdNativeLandingPagesUI);
                            e4Var.f211776c = str;
                            i0Var.K = e4Var.c();
                        }
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(com.tencent.rtmp.TXLiveConstants.PLAY_WARNING_VIDEO_TIMESTAMP_ROLLBACK, 17);
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkShowFlyingFlipContinuePickToast", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2200", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                    com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.c(i0Var).n0();
                    i0Var.L(false, false);
                } else {
                    com.tencent.mars.xlog.Log.w("AdLandingPageEggCardHelper", "showFlyingFlipContinuePickToast, exp disabled");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkShowFlyingFlipContinuePickToast", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2200", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                    com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.c(i0Var).n0();
                    i0Var.L(false, false);
                }
            }
            com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.c(i0Var).R();
            com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.j(i0Var);
            com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.k(i0Var);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onEggCardEndFlip", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$11");
    }

    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onEggCardStartFlip", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$11");
        com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0 i0Var = this.f163087b;
        if (com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.a(i0Var).isFinishing()) {
            com.tencent.mars.xlog.Log.e("AdLandingPageEggCardHelper", "tryPlayFlyingFlipAnimation, onEggCardStartFlip finishing");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onEggCardStartFlip", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$11");
            return;
        }
        i0Var.O.setVisibility(8);
        android.view.View q17 = com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.c(i0Var).q();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(q17, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper$11", "onEggCardStartFlip", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        q17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(q17, "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper$11", "onEggCardStartFlip", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onEggCardStartFlip", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$11");
    }

    public void c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFlyingStart", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$11");
        com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0 i0Var = this.f163087b;
        if (com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.a(i0Var).isFinishing()) {
            com.tencent.mars.xlog.Log.e("AdLandingPageEggCardHelper", "tryPlayFlyingFlipAnimation, onFlyingStart finishing");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFlyingStart", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$11");
            return;
        }
        boolean r17 = com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.r(i0Var);
        boolean z17 = this.f163086a;
        if (!r17 && !z17) {
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.b(i0Var), "alpha", 0.0f, 1.0f);
            ofFloat.setDuration(1700L);
            ofFloat.start();
            android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.h(i0Var), "alpha", com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.h(i0Var).getAlpha(), 0.0f);
            ofFloat2.setDuration(1700L);
            ofFloat2.start();
            android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(i0Var.f163120t, "alpha", 0.0f, 1.0f);
            ofFloat3.setDuration(1700L);
            ofFloat3.start();
            ofFloat.addListener(new com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.c(this));
        }
        if (!z17) {
            if (!com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.i(i0Var)) {
                android.view.View m17 = com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.m(i0Var);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(m17, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper$11", "onFlyingStart", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                m17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(m17, "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper$11", "onFlyingStart", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.m(i0Var), "alpha", 0.0f, 1.0f);
            ofFloat4.setDuration(1700L);
            ofFloat4.start();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFlyingStart", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$11");
    }

    public void d() {
        com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0 i0Var = this.f163087b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPrepareCard", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$11");
        try {
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdLandingPageEggCardHelper", "tryPlayFlyingFlipAnimation, exp=" + th6.toString());
        }
        if (com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.a(i0Var).isFinishing()) {
            com.tencent.mars.xlog.Log.e("AdLandingPageEggCardHelper", "tryPlayFlyingFlipAnimation, onPrepareCard finishing");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPrepareCard", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$11");
            return;
        }
        com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.h0 e17 = com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.e(i0Var);
        java.lang.String str = e17.f163097a;
        java.lang.String h07 = com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.c(i0Var).h0(e17.f163097a, e17.f163098b);
        com.tencent.mars.xlog.Log.i("AdLandingPageEggCardHelper", "tryPlayFlyingFlipAnimation, onPrepareCard, cardInfo=" + e17 + ", displayId=" + h07 + ", cardId=" + str + ", isPreview=" + i0Var.E() + ", isSendEggCardIdReq=" + com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.l(i0Var));
        java.lang.String i17 = com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.a(i0Var).A7().i();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2500", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        r45.d53 d53Var = i0Var.f163100J;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2500", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        if (d53Var != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2500", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            r45.d53 d53Var2 = i0Var.f163100J;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2500", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            p44.b0.l(d53Var2);
        }
        if (!i0Var.E() && com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.l(i0Var)) {
            if (com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.p(i0Var) != null) {
                com.tencent.mars.xlog.Log.i("AdLandingPageEggCardHelper", "onPrepareCard, tryInitRandomCardInfo");
                com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.p(i0Var).X(i17);
            }
            p44.b0.n(i17, h07, com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.o(i0Var));
        } else if (i0Var.E() && !android.text.TextUtils.isEmpty(h07) && !h07.equals(str)) {
            com.tencent.mars.xlog.Log.e("AdLandingPageEggCardHelper", "onPrepareCard, previewMode, err cardId, select default");
            r45.d53 d53Var3 = new r45.d53();
            d53Var3.f372125d = h07;
            d53Var3.f372126e = c01.id.e();
            p44.b0.l(d53Var3);
        }
        if (com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.p(i0Var) != null) {
            com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.p(i0Var).S();
            com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.p(i0Var).T();
            com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.p(i0Var).U(h07);
        }
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(com.tencent.rtmp.TXLiveConstants.PLAY_WARNING_VIDEO_TIMESTAMP_ROLLBACK, 18);
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(com.tencent.rtmp.TXLiveConstants.PLAY_WARNING_VIDEO_TIMESTAMP_ROLLBACK, 19);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1800", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        android.util.Pair w17 = i0Var.w();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1800", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        if (com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.q(i0Var) != null && w17 != null) {
            com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.q(i0Var).P((java.lang.Integer) w17.first, (java.lang.String) w17.second);
            java.lang.Object obj = w17.first;
            if (obj != null) {
                i0Var.O.setPickStatus(((java.lang.Integer) obj).intValue());
            }
        }
        com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.g(i0Var, com.tencent.mm.plugin.sns.ad.landingpage.component.comp.b0.S(com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.c(i0Var).Z()));
        if (com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.f(i0Var) != null) {
            i0Var.O.setAnimCardView(com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.f(i0Var));
            android.view.View f17 = com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.f(i0Var);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(f17, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper$11", "onPrepareCard", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            f17.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(f17, "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper$11", "onPrepareCard", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        } else {
            com.tencent.mars.xlog.Log.e("AdLandingPageEggCardHelper", "tryPlayFlyingFlipAnimation, eggCardAnimView==null");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPrepareCard", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$11");
    }
}
