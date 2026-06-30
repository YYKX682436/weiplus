package com.tencent.mm.plugin.sns.ad.landingpage.component.comp;

/* loaded from: classes4.dex */
public final class u1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f2 f162953d;

    public u1(com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f2 f2Var) {
        this.f162953d = f2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent$mVideoPlayTask$1");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("try play video, cardId=");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMCurrentShowCardId$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f2 f2Var = this.f162953d;
        java.lang.String str = f2Var.f162813y;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMCurrentShowCardId$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("SnsAd.HalfEggCard.AdLandingComponent", sb6.toString());
        c54.b O = com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f2.O(f2Var);
        if (O != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("triggerCardVideoAppeared", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCard");
            java.util.Iterator it = O.f38670h.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    com.tencent.mars.xlog.Log.w("SnsAd.HalfEggCard.Card", "triggerCardVideoAppeared, not found videoComp, cardId=" + O.c());
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("triggerCardVideoAppeared", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCard");
                    break;
                }
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2 a2Var = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2) ((java.util.Map.Entry) it.next()).getValue();
                if (a2Var instanceof com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f1) {
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("triggerCardVideoAppeared, has videoComp, cardId=");
                    sb7.append(O.c());
                    sb7.append(", compId=");
                    ab4.d0 p17 = ((com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f1) a2Var).p();
                    sb7.append(p17 != null ? p17.f2817d : null);
                    com.tencent.mars.xlog.Log.i("SnsAd.HalfEggCard.Card", sb7.toString());
                    a2Var.K();
                    a2Var.J();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("triggerCardVideoAppeared", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCard");
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent$mVideoPlayTask$1");
    }
}
