package com.tencent.mm.plugin.sns.ad.landingpage.component.comp;

/* loaded from: classes4.dex */
public class q1 implements com.tencent.mm.plugin.sns.model.t {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f162916a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.ref.WeakReference f162917b;

    /* renamed from: c, reason: collision with root package name */
    public final f54.o f162918c;

    /* renamed from: d, reason: collision with root package name */
    public final int f162919d;

    /* renamed from: e, reason: collision with root package name */
    public final long f162920e = java.lang.System.currentTimeMillis();

    public q1(com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent adLandingHBCardComponent, o44.c cVar, f54.o oVar, int i17) {
        this.f162917b = new java.lang.ref.WeakReference(adLandingHBCardComponent);
        this.f162916a = new java.lang.ref.WeakReference(cVar);
        this.f162918c = oVar;
        this.f162919d = i17;
    }

    @Override // com.tencent.mm.plugin.sns.model.t
    public void a(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent$HBStatusReqCallback");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent$HBStatusReqCallback");
    }

    @Override // com.tencent.mm.plugin.sns.model.t
    public void b(int i17, int i18, java.lang.Object obj) {
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent$HBStatusReqCallback");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parseTwistCardStatusInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdGetTwistCardStatus");
        com.tencent.mars.xlog.Log.i("NetSceneAdGetTwistCardStatus", "parseTwistCardStatusInfo, errType=" + i17 + ", errNo=" + i18);
        android.os.Bundle bundle = new android.os.Bundle();
        if (i17 == 0 && i18 == 0 && obj != null) {
            r45.qp3 qp3Var = new r45.qp3();
            try {
                qp3Var.parseFrom((byte[]) obj);
                bundle.putInt("status", qp3Var.f384177d);
                java.lang.String str2 = qp3Var.f384178e;
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (str2 == null) {
                    str2 = "";
                }
                bundle.putString("card_id", str2);
                java.lang.String str3 = qp3Var.f384179f;
                if (str3 == null) {
                    str3 = "";
                }
                bundle.putString("give_card_id", str3);
                bundle.putString("receive_url", qp3Var.f384180g);
                com.tencent.mars.xlog.Log.i("NetSceneAdGetTwistCardStatus", "parseTwistCardStatusInfo, status=" + qp3Var.f384177d + ", cardId=" + qp3Var.f384178e + ", giveCardId=" + qp3Var.f384179f + ", jumpUrl=" + qp3Var.f384180g);
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("NetSceneAdGetTwistCardStatus", "parseTwistCardStatusInfo exp=" + th6.toString());
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseTwistCardStatusInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdGetTwistCardStatus");
        int i19 = bundle.getInt("status", -1);
        java.lang.String string = bundle.getString("card_id", "");
        java.lang.String string2 = bundle.getString("give_card_id", "");
        java.lang.String string3 = bundle.getString("receive_url", "");
        com.tencent.mars.xlog.Log.i("AdLandingHBCardComponent", "getHBStatus rsp, errType=" + i17 + ", errNo=" + i18 + ", status=" + i19 + ", cardId=" + string + ", giveCardId=" + string2 + ", timeCost=" + (java.lang.System.currentTimeMillis() - this.f162920e) + ", opType=" + this.f162919d + ", jumpUrl=" + string3);
        com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent adLandingHBCardComponent = (com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent) this.f162917b.get();
        o44.c cVar = (o44.c) this.f162916a.get();
        if (adLandingHBCardComponent == null || cVar == null) {
            com.tencent.mars.xlog.Log.e("AdLandingHBCardComponent", "onCallback, hbComp==null or showCard==null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent$HBStatusReqCallback");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hideLoading", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        android.content.Context context = adLandingHBCardComponent.f165049d;
        if (context instanceof com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI) {
            com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = (com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI) context;
            snsAdNativeLandingPagesUI.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hideLoading", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            a54.e eVar = snsAdNativeLandingPagesUI.D2;
            eVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hideLoading", "com.tencent.mm.plugin.sns.ad.landingpage.AdLandingPageLoadingHelper");
            ((ku5.t0) ku5.t0.f312615d).B(new a54.d(eVar));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hideLoading", "com.tencent.mm.plugin.sns.ad.landingpage.AdLandingPageLoadingHelper");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hideLoading", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hideLoading", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        f54.p pVar = (f54.p) adLandingHBCardComponent.p();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1500", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        android.content.Context context2 = adLandingHBCardComponent.f165049d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1500", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        if (i17 != 0 || i18 != 0 || obj == null) {
            if (this.f162919d == 1) {
                ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.sns.ad.landingpage.component.comp.o1(this, context2));
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent$HBStatusReqCallback");
        } else {
            if (pVar != null && (str = pVar.F) != null && str.equals(string2) && this.f162918c != null) {
                ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.sns.ad.landingpage.component.comp.p1(this, i19, cVar, adLandingHBCardComponent, string3, context2));
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent$HBStatusReqCallback");
        }
    }
}
