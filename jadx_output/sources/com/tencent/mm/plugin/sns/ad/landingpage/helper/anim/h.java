package com.tencent.mm.plugin.sns.ad.landingpage.helper.anim;

/* loaded from: classes4.dex */
public class h implements p44.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0 f163096a;

    public h(com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0 i0Var) {
        this.f163096a = i0Var;
    }

    @Override // p44.d0
    public void a(android.view.View view, p44.s sVar, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onItemClick", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$13");
        if (this.f163096a.E()) {
            ca4.z0.I0(new long[]{0, 40});
            com.tencent.mars.xlog.Log.e("AdLandingPageEggCardHelper", "onItemClick, in previewMode, idx=" + i17);
            this.f163096a.M();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onItemClick", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$13");
            return;
        }
        java.lang.String P = com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.p(this.f163096a).P();
        if (P != null && P.equals(sVar.b())) {
            com.tencent.mars.xlog.Log.e("AdLandingPageEggCardHelper", "onItemClick, repeat click same card, idx=" + i17 + ", cardId=" + P);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onItemClick", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$13");
            return;
        }
        boolean g17 = sVar.g();
        com.tencent.mm.plugin.sns.ad.landingpage.component.comp.q3 p17 = com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.p(this.f163096a);
        p17.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onItemClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRandomPickCardComp");
        if (g17) {
            p17.f162924u++;
        } else {
            p17.f162925v++;
        }
        com.tencent.mars.xlog.Log.i("AdLandingRandomPickCardComp", "onItemClick, isPicked=" + g17 + ", pickedClickNum=" + p17.f162924u + ", unPickedClickNum=" + p17.f162925v);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onItemClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRandomPickCardComp");
        com.tencent.mars.xlog.Log.i("AdLandingPageEggCardHelper", "onItemClick, idx=" + i17 + ", isPicked=" + g17 + ", currentSelectCardId=" + P);
        if (g17) {
            java.lang.String b17 = sVar.b();
            if (com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.q(this.f163096a) != null) {
                com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.q(this.f163096a).R(1);
            }
            com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0 i0Var = this.f163096a;
            i0Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("selectLocalCard", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            com.tencent.mm.plugin.sns.ad.landingpage.component.comp.b0 b0Var = i0Var.f163107g;
            if (b0Var == null || b17 == null) {
                com.tencent.mars.xlog.Log.e("AdLandingPageEggCardHelper", "selectLocalCard, err param, cardId=" + b17);
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCurrentShowCompInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
                ab4.d0 d0Var = b0Var.f162759x;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentShowCompInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
                java.lang.String P2 = i0Var.C.P();
                if (d0Var == null || !b17.equals(d0Var.A) || com.tencent.mm.sdk.platformtools.t8.K0(P2)) {
                    ca4.z0.I0(new long[]{0, 40});
                    com.tencent.mars.xlog.Log.i("AdLandingPageEggCardHelper", "maybe click same card, cardId=" + b17 + ", selectCardIdFromPickCardComp=" + P2);
                    java.lang.String b18 = p44.b0.b(i0Var.f163101a.A7().i(), b17);
                    if (i0Var.F() && i0Var.f163126z != null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isHbCardExtInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
                        boolean z17 = com.tencent.mm.plugin.sns.ad.landingpage.component.comp.b0.X(b18) == 2;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isHbCardExtInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
                        if (!z17) {
                            com.tencent.mars.xlog.Log.i("AdLandingPageEggCardHelper", "selectLocalCard, no picked hbCard, show giveHb style");
                            b18 = i0Var.f163126z.c();
                        }
                    }
                    com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.h0 h0Var = new com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.h0(b17, b18);
                    java.lang.String h07 = i0Var.f163107g.h0(h0Var.f163097a, h0Var.f163098b);
                    i0Var.f163108h = h0Var;
                    i0Var.S.removeCallbacksAndMessages(null);
                    i0Var.S.sendEmptyMessageDelayed(4, 150L);
                    android.view.View view2 = i0Var.f163106f;
                    if (view2 != null) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList.add(java.lang.Float.valueOf(1.0f));
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper", "selectLocalCard", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                        yj0.a.f(view2, "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper", "selectLocalCard", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    }
                    android.view.View S = com.tencent.mm.plugin.sns.ad.landingpage.component.comp.b0.S(i0Var.f163107g.Z());
                    if (S != null) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                        arrayList2.add(java.lang.Float.valueOf(1.0f));
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(S, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper", "selectLocalCard", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        S.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                        yj0.a.f(S, "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper", "selectLocalCard", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    }
                    com.tencent.mars.xlog.Log.i("AdLandingPageEggCardHelper", "selectLocalCard, cardInfo=" + h0Var + ", displayCardId=" + h07);
                    com.tencent.mm.plugin.sns.ad.landingpage.component.comp.q3 q3Var = i0Var.C;
                    if (q3Var != null) {
                        q3Var.S();
                        com.tencent.mm.plugin.sns.ad.landingpage.component.comp.q3 q3Var2 = i0Var.C;
                        q3Var2.getClass();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSelectCardWithAnim", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRandomPickCardComp");
                        com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPageRandomPickCardView adLandingPageRandomPickCardView = q3Var2.f162923t;
                        if (adLandingPageRandomPickCardView != null) {
                            adLandingPageRandomPickCardView.setSelectWithAnim(h07);
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSelectCardWithAnim", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRandomPickCardComp");
                    }
                    i0Var.f163107g.c0();
                    i0Var.f163107g.l0(false, false, -1);
                    android.util.Pair w17 = i0Var.w();
                    com.tencent.mm.plugin.sns.ad.landingpage.component.comp.u3 u3Var = i0Var.H;
                    if (u3Var != null && w17 != null) {
                        u3Var.P((java.lang.Integer) w17.first, (java.lang.String) w17.second);
                    }
                    i0Var.f163107g.R();
                } else {
                    com.tencent.mars.xlog.Log.w("AdLandingPageEggCardHelper", "selectLocalCard, same card, cardId=" + b17 + ", selectCardIdFromPickCardComp=" + P2);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("selectLocalCard", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.A(com.tencent.rtmp.TXLiveConstants.PLAY_WARNING_VIDEO_TIMESTAMP_ROLLBACK, 10);
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("selectLocalCard", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(com.tencent.rtmp.TXLiveConstants.PLAY_WARNING_VIDEO_TIMESTAMP_ROLLBACK, 10);
        } else {
            ca4.z0.I0(new long[]{0, 40});
            com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0 i0Var2 = this.f163096a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$502", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            i0Var2.E = i17;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$502", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            com.tencent.mm.plugin.sns.ad.landingpage.component.comp.q3 p18 = com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.p(this.f163096a);
            int o17 = com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.o(this.f163096a);
            p18.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setClickIndex", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRandomPickCardComp");
            p18.f162926w = o17;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setClickIndex", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRandomPickCardComp");
            if (com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.q(this.f163096a) != null) {
                com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.q(this.f163096a).R(0);
            }
            this.f163096a.J();
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(com.tencent.rtmp.TXLiveConstants.PLAY_WARNING_VIDEO_TIMESTAMP_ROLLBACK, 9);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onItemClick", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$13");
    }
}
