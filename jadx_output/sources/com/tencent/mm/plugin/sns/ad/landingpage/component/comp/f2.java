package com.tencent.mm.plugin.sns.ad.landingpage.component.comp;

/* loaded from: classes4.dex */
public final class f2 extends com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2 {
    public boolean A;
    public final java.util.HashMap B;
    public final java.lang.Runnable C;
    public final com.tencent.mm.plugin.sns.ad.landingpage.component.comp.t1 D;

    /* renamed from: s, reason: collision with root package name */
    public final f54.v f162807s;

    /* renamed from: t, reason: collision with root package name */
    public c54.k f162808t;

    /* renamed from: u, reason: collision with root package name */
    public c54.g f162809u;

    /* renamed from: v, reason: collision with root package name */
    public c54.c f162810v;

    /* renamed from: w, reason: collision with root package name */
    public final android.os.Handler f162811w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ad.landingpage.component.comp.s1 f162812x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f162813y;

    /* renamed from: z, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ad.landingpage.component.comp.r1 f162814z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(android.content.Context context, f54.v mComponentInfo, android.view.ViewGroup viewGroup) {
        super(context, mComponentInfo, viewGroup);
        kotlin.jvm.internal.o.g(mComponentInfo, "mComponentInfo");
        this.f162807s = mComponentInfo;
        this.f162811w = new android.os.Handler(android.os.Looper.getMainLooper());
        this.f162813y = "";
        this.f162814z = new com.tencent.mm.plugin.sns.ad.landingpage.component.comp.r1(0L, null, 0, false, 15, null);
        this.B = new java.util.HashMap();
        this.C = new com.tencent.mm.plugin.sns.ad.landingpage.component.comp.u1(this);
        this.D = new com.tencent.mm.plugin.sns.ad.landingpage.component.comp.t1(this);
    }

    public static final /* synthetic */ c54.b O(com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f2 f2Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getCurrentShowCard", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        c54.b T = f2Var.T();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getCurrentShowCard", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        return T;
    }

    public static final void P(com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f2 f2Var) {
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$selectCardAfterReqAnim", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        f2Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("selectCardAfterReqAnim", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        com.tencent.mm.plugin.sns.ad.landingpage.component.comp.s1 s1Var = f2Var.f162812x;
        if (s1Var != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getServerCardId", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardComponentController$mCardRequestInterface$1");
            c54.j jVar = ((c54.i) s1Var).f38689a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMHalfEggCardPageInterface$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardComponentController");
            c54.h hVar = jVar.f38691b;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMHalfEggCardPageInterface$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardComponentController");
            com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.u uVar = (com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.u) hVar;
            uVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getServerEggCardId", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$22");
            com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0 i0Var = uVar.f163146a;
            i0Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getEggCardId", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            str = i0Var.f163108h.f163097a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getEggCardId", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getServerEggCardId", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$22");
            if (str == null) {
                str = "";
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMHalfEggCardPageInterface$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardComponentController");
            c54.h hVar2 = jVar.f38691b;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMHalfEggCardPageInterface$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardComponentController");
            com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.u uVar2 = (com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.u) hVar2;
            uVar2.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLandingPageData", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$22");
            ab4.n0 A7 = com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.a(uVar2.f163146a).A7();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLandingPageData", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$22");
            if (str.length() == 0) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1970, 4);
                com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.j0.h(A7, "", 2);
            } else {
                com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.j0.h(A7, str, 1);
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onGetServerCardId, pageId=");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMPageId$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardComponentController");
            java.lang.String str2 = jVar.f38692c;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMPageId$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardComponentController");
            sb6.append(str2);
            sb6.append(", animDuration=");
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMAnimStartTime$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardComponentController");
            long j17 = jVar.f38693d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMAnimStartTime$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardComponentController");
            sb6.append(currentTimeMillis - j17);
            sb6.append(", ret=");
            sb6.append(str);
            com.tencent.mars.xlog.Log.i("SnsAd.HalfEggCard.ComponentController", sb6.toString());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getServerCardId", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardComponentController$mCardRequestInterface$1");
        } else {
            str = null;
        }
        com.tencent.mars.xlog.Log.i("SnsAd.HalfEggCard.AdLandingComponent", "--selectCardAfterReqAnim--, onGetServerCardId cardId=" + str);
        f2Var.S(str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("selectCardAfterReqAnim", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$selectCardAfterReqAnim", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
    }

    public static final void R(com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f2 f2Var, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$startReqCardAnim", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        f2Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startReqCardAnim", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        com.tencent.mars.xlog.Log.i("SnsAd.HalfEggCard.AdLandingComponent", "startReqCardAnim, needSelectCard=" + z17);
        c54.c U = f2Var.U();
        com.tencent.mm.plugin.sns.ad.landingpage.component.comp.c2 c2Var = new com.tencent.mm.plugin.sns.ad.landingpage.component.comp.c2(z17, f2Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startReqCardAnim", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardAnimController");
        c54.k kVar = U.f38675b;
        kVar.a().setVisibility(0);
        kVar.a().setAlpha(1.0f);
        kVar.a().setCameraDistance(U.f38674a.getResources().getDisplayMetrics().density * (-4000));
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(kVar.a(), "translationY", kVar.k().getLayoutParams().height / 2.0f, 0.0f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getEaseOutInterpolator", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardAnimController$Companion");
        android.view.animation.PathInterpolator pathInterpolator = new android.view.animation.PathInterpolator(0.0f, 0.0f, 0.2f, 1.0f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getEaseOutInterpolator", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardAnimController$Companion");
        ofFloat.setInterpolator(pathInterpolator);
        ofFloat.setDuration(1000L);
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(kVar.a(), "rotationY", 720.0f, 0.0f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getEaseOutInterpolator", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardAnimController$Companion");
        android.view.animation.PathInterpolator pathInterpolator2 = new android.view.animation.PathInterpolator(0.0f, 0.0f, 0.2f, 1.0f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getEaseOutInterpolator", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardAnimController$Companion");
        ofFloat2.setInterpolator(pathInterpolator2);
        ofFloat2.setDuration(1500L);
        android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(kVar.a(), "alpha", 1.0f, 0.0f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getEaseOutInterpolator", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardAnimController$Companion");
        android.view.animation.PathInterpolator pathInterpolator3 = new android.view.animation.PathInterpolator(0.0f, 0.0f, 0.2f, 1.0f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getEaseOutInterpolator", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardAnimController$Companion");
        ofFloat3.setInterpolator(pathInterpolator3);
        ofFloat3.setDuration(500L);
        ofFloat3.setStartDelay(1500 - ofFloat3.getDuration());
        ofFloat2.addListener(c2Var);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3);
        animatorSet.start();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startReqCardAnim", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardAnimController");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startReqCardAnim", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$startReqCardAnim", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public boolean C(org.json.JSONArray jSONArray) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (D(jSONObject)) {
            java.lang.String str = this.f162813y;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str == null) {
                str = "";
            }
            jSONObject.put("cardId", str);
            if (jSONArray != null) {
                jSONArray.put(jSONObject);
            }
        }
        java.util.Iterator it = this.B.entrySet().iterator();
        while (it.hasNext()) {
            c54.b bVar = (c54.b) ((java.util.Map.Entry) it.next()).getValue();
            bVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCard");
            for (java.util.Map.Entry entry : bVar.f38670h.entrySet()) {
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2 a2Var = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2) entry.getValue();
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                if (a2Var.D(jSONObject2) && jSONArray != null) {
                    jSONArray.put(jSONObject2);
                }
                bVar.c();
                jSONObject2.toString();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCard");
        }
        com.tencent.mars.xlog.Log.i("SnsAd.HalfEggCard.AdLandingComponent", "setComponentKVReportData, json=" + jSONArray);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        return true;
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void G() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPadding", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPadding", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void J() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("viewAppeared", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        super.J();
        com.tencent.mars.xlog.Log.i("SnsAd.HalfEggCard.AdLandingComponent", "viewAppeared");
        c54.b T = T();
        if (T != null) {
            T.g(true);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewAppeared", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void K() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        super.K();
        com.tencent.mars.xlog.Log.i("SnsAd.HalfEggCard.AdLandingComponent", "viewWillAppear");
        c54.b T = T();
        if (T != null) {
            T.h(true);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void L() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        super.L();
        com.tencent.mars.xlog.Log.i("SnsAd.HalfEggCard.AdLandingComponent", "viewWillDestroy");
        this.f162811w.removeCallbacksAndMessages(null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("triggerAllCardsWillDestroy", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("triggerAllCardsWillDestroy, size=");
        java.util.HashMap hashMap = this.B;
        sb6.append(hashMap.size());
        com.tencent.mars.xlog.Log.i("SnsAd.HalfEggCard.AdLandingComponent", sb6.toString());
        java.util.Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            c54.b bVar = (c54.b) ((java.util.Map.Entry) it.next()).getValue();
            bVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("triggerCardWillDestroy", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCard");
            com.tencent.mars.xlog.Log.i("SnsAd.HalfEggCard.Card", "triggerCardWillDestroy, cardId=" + bVar.c());
            java.util.Iterator it6 = bVar.f38670h.entrySet().iterator();
            while (it6.hasNext()) {
                ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2) ((java.util.Map.Entry) it6.next()).getValue()).L();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("triggerCardWillDestroy", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCard");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("triggerAllCardsWillDestroy", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        com.tencent.mm.plugin.finder.webview.p0 p17 = V().p();
        if (p17 != null) {
            p17.release();
        }
        this.A = true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void M() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("viewWillDisappear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        super.M();
        com.tencent.mars.xlog.Log.i("SnsAd.HalfEggCard.AdLandingComponent", "viewWillDisappear");
        c54.b T = T();
        if (T != null) {
            T.i();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewWillDisappear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
    }

    public final void S(java.lang.String str) {
        java.lang.String str2;
        f54.r rVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkSelectCard", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        boolean z17 = false;
        boolean z18 = str == null || str.length() == 0;
        f54.v vVar = this.f162807s;
        if (z18) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDefaultCardId", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
            java.util.Iterator it = ((java.util.ArrayList) vVar.c()).iterator();
            while (true) {
                if (it.hasNext()) {
                    f54.r rVar2 = (f54.r) it.next();
                    rVar2.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isDefaultCard", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$CardInfo");
                    boolean z19 = rVar2.f259740e;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isDefaultCard", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$CardInfo");
                    if (z19) {
                        str2 = rVar2.a();
                        com.tencent.mars.xlog.Log.i("SnsAd.HalfEggCard.AdLandingComponent", "getDefaultCardId, use xml default card=" + str2);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDefaultCardId", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
                        break;
                    }
                } else if (!((java.util.ArrayList) vVar.c()).isEmpty()) {
                    str2 = ((f54.r) ((java.util.ArrayList) vVar.c()).get(0)).a();
                    com.tencent.mars.xlog.Log.e("SnsAd.HalfEggCard.AdLandingComponent", "getDefaultCardId, no xml default, firstCardId=" + str2);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDefaultCardId", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
                } else {
                    com.tencent.mars.xlog.Log.e("SnsAd.HalfEggCard.AdLandingComponent", "getDefaultCardId, empty");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDefaultCardId", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
                    str2 = "";
                }
            }
            com.tencent.mars.xlog.Log.e("SnsAd.HalfEggCard.AdLandingComponent", "checkSelectCard, cardId empty, use defaultId=" + str2);
        } else {
            str2 = str;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getShowCardInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        if (((java.util.ArrayList) vVar.c()).isEmpty()) {
            com.tencent.mars.xlog.Log.e("SnsAd.HalfEggCard.AdLandingComponent", "getShowCardInfo, cardId=" + str2 + ", cardInfoList empty");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getShowCardInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
            rVar = null;
        } else {
            int size = ((java.util.ArrayList) vVar.c()).size();
            java.util.Iterator it6 = ((java.util.ArrayList) vVar.c()).iterator();
            while (true) {
                if (!it6.hasNext()) {
                    rVar = null;
                    break;
                }
                rVar = (f54.r) it6.next();
                java.lang.String a17 = rVar.a();
                if (a17 != null && a17.equals(str2)) {
                    com.tencent.mars.xlog.Log.i("SnsAd.HalfEggCard.AdLandingComponent", "getShowCardInfo, has cardInfo, cardId=" + str2 + ", cardCount=" + size);
                    break;
                }
            }
            if (rVar == null) {
                com.tencent.mars.xlog.Log.e("SnsAd.HalfEggCard.AdLandingComponent", "getShowCardInfo, not found cardInfo, cardId=" + str2 + ", cardCount=" + size);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1970, 7);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getShowCardInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        }
        if (rVar == null) {
            com.tencent.mars.xlog.Log.e("SnsAd.HalfEggCard.AdLandingComponent", "checkSelectCard, cardInfo==null, cardId=" + str2);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkSelectCard", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
            return;
        }
        java.lang.String a18 = rVar.a();
        if ((a18 == null || a18.length() == 0) || kotlin.jvm.internal.o.b(rVar.a(), this.f162813y)) {
            com.tencent.mars.xlog.Log.w("SnsAd.HalfEggCard.AdLandingComponent", "checkSelectCard, card not changed, cardId=" + str2 + ", curId=" + this.f162813y);
        } else {
            com.tencent.mars.xlog.Log.w("SnsAd.HalfEggCard.AdLandingComponent", "checkSelectCard, card changed, cardId=" + str2 + ", curId=" + this.f162813y + ", cardInfo.Id=" + rVar.a() + ", supportRepeat=" + rVar.d());
            this.f162813y = rVar.a();
            if (!rVar.d()) {
                java.lang.String a19 = rVar.a();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("saveSelectCardResult", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
                com.tencent.mars.xlog.Log.w("SnsAd.HalfEggCard.AdLandingComponent", "saveSelectCardResult, cardId=" + a19);
                com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.j0.j(u().i(), a19);
                com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().notifyFinderCnyEggCardResult(u().i(), a19);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("saveSelectCardResult", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
            }
            java.util.HashMap hashMap = this.B;
            c54.b bVar = (c54.b) hashMap.get(rVar.a());
            if (bVar == null) {
                android.content.Context context = this.f165049d;
                kotlin.jvm.internal.o.f(context, "context");
                c54.k V = V();
                com.tencent.mm.plugin.sns.ad.landingpage.component.comp.r1 r1Var = this.f162814z;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMBulletCommentBuilder", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
                c54.g gVar = this.f162809u;
                if (gVar == null) {
                    kotlin.jvm.internal.o.o("mBulletCommentBuilder");
                    throw null;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMBulletCommentBuilder", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
                ab4.n0 u17 = u();
                kotlin.jvm.internal.o.f(u17, "getLandingPageData(...)");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isWishGiftPage", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
                boolean b17 = vVar.d().b();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isWishGiftPage", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
                bVar = new c54.b(context, V, rVar, r1Var, gVar, u17, b17);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnRepeatPickListener", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCard");
                bVar.f38673k = this.D;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnRepeatPickListener", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCard");
                hashMap.put(rVar.a(), bVar);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("show", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCard");
            f54.r rVar3 = bVar.f38665c;
            c54.k kVar = bVar.f38664b;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doSetCardContentView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCard");
            try {
                android.widget.TextView m17 = kVar.m();
                rVar3.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTopTitle", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$CardInfo");
                java.lang.String str3 = rVar3.f259737b;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTopTitle", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$CardInfo");
                m17.setText(str3);
                android.widget.TextView l17 = kVar.l();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTitle", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$CardInfo");
                java.lang.String str4 = rVar3.f259738c;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTitle", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$CardInfo");
                l17.setText(str4);
                android.widget.TextView g17 = kVar.g();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDesc", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$CardInfo");
                java.lang.String str5 = rVar3.f259739d;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDesc", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$CardInfo");
                g17.setText(str5);
                android.widget.TextView m18 = kVar.m();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTopTitleTextColor", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$CardInfo");
                java.lang.String str6 = rVar3.f259741f;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTopTitleTextColor", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$CardInfo");
                m18.setTextColor(ca4.n0.e(str6, android.graphics.Color.parseColor("#80000000")));
                bVar.f(kVar, rVar3);
                bVar.d(kVar, rVar3);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSupportBulletComment", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCard");
                com.tencent.mm.plugin.sns.ad.landingpage.component.comp.r1 r1Var2 = bVar.f38666d;
                r1Var2.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isFinderEnableBulletComment", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent$FinderConfig");
                boolean z27 = r1Var2.f162932d;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFinderEnableBulletComment", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent$FinderConfig");
                if (z27 && !bVar.f38671i && !rVar3.d()) {
                    z17 = true;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSupportBulletComment", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCard");
                com.tencent.mars.xlog.Log.i("SnsAd.HalfEggCard.Card", "setBulletCommentView, isSupportDanmu=" + z17);
                bVar.f38667e.c(kVar, rVar3, z17);
                c54.n.f38713a.a(kVar, rVar3, z17);
                kVar.k().requestLayout();
            } catch (java.lang.Throwable th6) {
                ca4.q.c("SnsAd.HalfEggCard.Card_doSetCardContentView", th6);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doSetCardContentView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCard");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("show", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCard");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkSelectCard", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
    }

    public final c54.b T() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCurrentShowCard", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        c54.b bVar = (c54.b) this.B.get(this.f162813y);
        if (bVar != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentShowCard", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
            return bVar;
        }
        com.tencent.mars.xlog.Log.e("SnsAd.HalfEggCard.AdLandingComponent", "getCurrentShowCard, card==null, cardId=" + this.f162813y);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentShowCard", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        return null;
    }

    public final c54.c U() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMAnimController", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        c54.c cVar = this.f162810v;
        if (cVar != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMAnimController", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
            return cVar;
        }
        kotlin.jvm.internal.o.o("mAnimController");
        throw null;
    }

    public final c54.k V() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMViewHolder", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        c54.k kVar = this.f162808t;
        if (kVar != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMViewHolder", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
            return kVar;
        }
        kotlin.jvm.internal.o.o("mViewHolder");
        throw null;
    }

    public final void W(ab4.n0 n0Var, java.lang.String str, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportAutoJumpH5", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        if (n0Var == null) {
            com.tencent.mars.xlog.Log.e("SnsAd.HalfEggCard.AdLandingComponent", "reportAutoJumpH5, landingPageData==null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportAutoJumpH5", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            java.lang.String o17 = n0Var.o();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (o17 == null) {
                o17 = "";
            }
            jSONObject.put("uxinfo", o17);
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, n0Var.l());
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            java.lang.String e17 = n0Var.e();
            if (e17 == null) {
                e17 = "";
            }
            jSONObject2.put("canvasId", e17);
            java.lang.String i18 = n0Var.i();
            if (i18 == null) {
                i18 = "";
            }
            jSONObject2.put("pageId", i18);
            if (str == null) {
                str = "";
            }
            jSONObject2.put("cardId", str);
            jSONObject2.put("cardIdType", i17);
            jSONObject.put("extInfo", jSONObject2);
            java.lang.String jSONObject3 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
            ca4.m0.a("finder_cny_auto_jump_h5", jSONObject3);
            com.tencent.mars.xlog.Log.i("SnsAd.HalfEggCard.AdLandingComponent", "reportAutoJumpH5, content=".concat(jSONObject3));
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("SnsAd.HalfEggCard.AdLandingComponent", "reportAutoJumpH5 exp:" + e18);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportAutoJumpH5", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
    }

    public final void X() {
        float f17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetCardVisibility", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        com.tencent.mars.xlog.Log.i("SnsAd.HalfEggCard.AdLandingComponent", "resetCardVisibility");
        c54.k V = V();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetCardVisibility", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardLayoutBuilder");
        android.widget.ImageView b17 = V.b();
        b17.setVisibility(4);
        b17.setAlpha(0.0f);
        android.widget.TextView m17 = V.m();
        m17.setVisibility(4);
        m17.setAlpha(0.0f);
        android.widget.TextView l17 = V.l();
        l17.setVisibility(4);
        l17.setAlpha(0.0f);
        android.widget.TextView g17 = V.g();
        g17.setVisibility(4);
        g17.setAlpha(0.0f);
        android.widget.FrameLayout e17 = V.e();
        e17.setVisibility(4);
        e17.setAlpha(0.0f);
        android.widget.LinearLayout c17 = V.c();
        c17.setVisibility(4);
        c17.setAlpha(0.0f);
        android.widget.ImageView a17 = V.a();
        a17.setVisibility(4);
        a17.setAlpha(0.0f);
        android.view.View o17 = V.o();
        if (o17 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(o17, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/halfeggcard/HalfEggCardLayoutBuilder", "resetCardVisibility", "(Lcom/tencent/mm/plugin/sns/ad/landingpage/component/comp/halfeggcard/HalfEggCardLayoutBuilder$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            o17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(o17, "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/halfeggcard/HalfEggCardLayoutBuilder", "resetCardVisibility", "(Lcom/tencent/mm/plugin/sns/ad/landingpage/component/comp/halfeggcard/HalfEggCardLayoutBuilder$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(o17, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/halfeggcard/HalfEggCardLayoutBuilder", "resetCardVisibility", "(Lcom/tencent/mm/plugin/sns/ad/landingpage/component/comp/halfeggcard/HalfEggCardLayoutBuilder$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            o17.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(o17, "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/halfeggcard/HalfEggCardLayoutBuilder", "resetCardVisibility", "(Lcom/tencent/mm/plugin/sns/ad/landingpage/component/comp/halfeggcard/HalfEggCardLayoutBuilder$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        android.widget.FrameLayout d17 = V.d();
        if (d17 != null) {
            d17.setVisibility(4);
            f17 = 0.0f;
            d17.setAlpha(0.0f);
        } else {
            f17 = 0.0f;
        }
        android.widget.ImageView h17 = V.h();
        h17.setVisibility(4);
        h17.setAlpha(f17);
        android.widget.TextView j17 = V.j();
        j17.setVisibility(4);
        j17.setAlpha(f17);
        android.widget.TextView i17 = V.i();
        i17.setVisibility(4);
        i17.setAlpha(f17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetCardVisibility", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardLayoutBuilder");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetCardVisibility", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
    }

    public final void Y(boolean z17) {
        boolean z18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showCardContent", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        c54.b T = T();
        if (T != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isCardDoSideRotateAnim", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCard");
            z18 = T.f38672j;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isCardDoSideRotateAnim", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCard");
        } else {
            z18 = false;
        }
        com.tencent.mars.xlog.Log.i("SnsAd.HalfEggCard.AdLandingComponent", "showCardContent, directShow=" + z17 + ", isDoSideRotateAnim=" + z18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isWishGiftPage", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        boolean b17 = this.f162807s.d().b();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isWishGiftPage", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        boolean z19 = b17 && z18 && !z17;
        V().m().setVisibility(0);
        V().l().setVisibility(0);
        V().g().setVisibility(0);
        V().c().setVisibility(0);
        V().e().setVisibility(0);
        android.widget.FrameLayout d17 = V().d();
        if (d17 != null && d17.getChildCount() > 0) {
            d17.setVisibility(0);
        }
        android.widget.FrameLayout e17 = V().e();
        if (z19) {
            e17.setAlpha(1.0f);
        }
        if (z17) {
            V().a().setVisibility(4);
            V().a().setAlpha(0.0f);
            V().b().setVisibility(0);
        }
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(z17 ? 200L : 500L);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getEaseInInterpolator", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardAnimController$Companion");
        android.view.animation.PathInterpolator pathInterpolator = new android.view.animation.PathInterpolator(0.42f, 0.0f, 1.0f, 1.0f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getEaseInInterpolator", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardAnimController$Companion");
        ofFloat.setInterpolator(pathInterpolator);
        ofFloat.addUpdateListener(new com.tencent.mm.plugin.sns.ad.landingpage.component.comp.w1(this, z19, z17));
        ofFloat.addListener(new com.tencent.mm.plugin.sns.ad.landingpage.component.comp.x1(this));
        ofFloat.start();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showCardContent", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
    }

    public final void Z(boolean z17) {
        com.tencent.mm.ui.widget.MMProcessBar n17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showH5Content", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        android.view.View o17 = V().o();
        if (o17 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(o17, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingHalfEggCardComponent", "showH5Content", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            o17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(o17, "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingHalfEggCardComponent", "showH5Content", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.ui.widget.MMProcessBar n18 = V().n();
        java.lang.Object tag = n18 != null ? n18.getTag(com.tencent.mm.R.id.v7_) : null;
        java.lang.Boolean bool = tag instanceof java.lang.Boolean ? (java.lang.Boolean) tag : null;
        if (!kotlin.jvm.internal.o.b(bool, java.lang.Boolean.TRUE) && (n17 = V().n()) != null) {
            n17.setVisibility(0);
        }
        com.tencent.mars.xlog.Log.i("SnsAd.HalfEggCard.AdLandingComponent", "showH5Content, directShow=" + z17 + ", isH5Ready=" + bool);
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(200L);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getEaseInInterpolator", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardAnimController$Companion");
        android.view.animation.PathInterpolator pathInterpolator = new android.view.animation.PathInterpolator(0.42f, 0.0f, 1.0f, 1.0f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getEaseInInterpolator", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardAnimController$Companion");
        ofFloat.setInterpolator(pathInterpolator);
        ofFloat.addUpdateListener(new com.tencent.mm.plugin.sns.ad.landingpage.component.comp.y1(this));
        ofFloat.addListener(new com.tencent.mm.plugin.sns.ad.landingpage.component.comp.z1(this));
        ofFloat.start();
        if (z17) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1970, 5);
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1970, 6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showH5Content", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void g() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("applyLayoutParams", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("applyLayoutParams", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        com.tencent.mars.xlog.Log.i("SnsAd.HalfEggCard.AdLandingComponent", "createView");
        X();
        f54.v vVar = this.f162807s;
        f54.u b17 = vVar.b();
        b17.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAnimImgUrl", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$RotateAnimInfo");
        java.lang.String str = b17.f259751a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAnimImgUrl", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$RotateAnimInfo");
        boolean z17 = true;
        if (str != null) {
            if (!(str.length() > 0)) {
                str = null;
            }
            if (str != null) {
                a84.z.h(str, V().a());
            }
        }
        android.widget.ImageView b18 = V().b();
        b18.setImageDrawable(null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBackgroundImgUrl", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo");
        java.lang.String str2 = vVar.I;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBackgroundImgUrl", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo");
        if (!(str2 == null || str2.length() == 0)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBackgroundImgUrl", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo");
            java.lang.String str3 = vVar.I;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBackgroundImgUrl", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo");
            a84.z.h(str3, b18);
        }
        android.widget.ImageView h17 = V().h();
        h17.setImageResource(com.tencent.mm.R.raw.ad_native_half_egg_pre_anim_default);
        java.lang.String a17 = vVar.d().a();
        if (a17 != null && a17.length() != 0) {
            z17 = false;
        }
        if (!z17) {
            a84.z.h(vVar.d().a(), h17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public android.view.View j() {
        com.tencent.mm.plugin.finder.webview.FinderWebViewHelper finderWebViewHelper;
        android.view.Window window;
        com.tencent.mm.ui.widget.MMWebView mMWebView;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("customLayout", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        java.lang.String h17 = u().h();
        boolean z17 = h17 == null || h17.length() == 0;
        com.tencent.mm.plugin.sns.ad.landingpage.component.comp.r1 r1Var = this.f162814z;
        if (z17) {
            com.tencent.mars.xlog.Log.e("SnsAd.HalfEggCard.AdLandingComponent", "initData, finderConfig empty");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        } else {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(h17);
                long optLong = jSONObject.optLong("finderFeedId");
                r1Var.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setFinderFeedId", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent$FinderConfig");
                r1Var.f162929a = optLong;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFinderFeedId", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent$FinderConfig");
                java.lang.String optString = jSONObject.optString("finderJumpId", "");
                kotlin.jvm.internal.o.f(optString, "optString(...)");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setFinderJumpId", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent$FinderConfig");
                r1Var.f162930b = optString;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFinderJumpId", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent$FinderConfig");
                int optInt = jSONObject.optInt("commentScene");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setFinderCommentScene", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent$FinderConfig");
                r1Var.f162931c = optInt;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFinderCommentScene", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent$FinderConfig");
                boolean optBoolean = jSONObject.optBoolean("finderEnableDanmaku", false);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setFinderEnableBulletComment", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent$FinderConfig");
                r1Var.f162932d = optBoolean;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFinderEnableBulletComment", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent$FinderConfig");
                com.tencent.mars.xlog.Log.i("SnsAd.HalfEggCard.AdLandingComponent", "initData, finderCfg=" + h17);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("SnsAd.HalfEggCard.AdLandingComponent", "initData, exp=" + e17 + ", cfg=" + h17);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doCustomLayout", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        com.tencent.mars.xlog.Log.i("SnsAd.HalfEggCard.AdLandingComponent", "doCustomLayout");
        c54.n nVar = c54.n.f38713a;
        android.content.Context context = this.f165049d;
        kotlin.jvm.internal.o.f(context, "context");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildLayout", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardLayoutBuilder");
        com.tencent.mars.xlog.Log.i("SnsAd.HalfEggCard.LayoutBuilder", "buildLayout");
        c54.k kVar = new c54.k();
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
        frameLayout.setLayoutParams(new android.view.ViewGroup.LayoutParams(this.f165058p, this.f165059q));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setRoot", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardLayoutBuilder$ViewHolder");
        kVar.f38695a = frameLayout;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setRoot", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardLayoutBuilder$ViewHolder");
        android.widget.ImageView imageView = new android.widget.ImageView(context);
        imageView.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
        imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setBgView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardLayoutBuilder$ViewHolder");
        kVar.f38696b = imageView;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBgView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardLayoutBuilder$ViewHolder");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initWebView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardLayoutBuilder");
        com.tencent.mm.ui.widget.MMProcessBar mMProcessBar = new com.tencent.mm.ui.widget.MMProcessBar(context);
        int s17 = ca4.m0.s(20);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(s17, s17);
        layoutParams.gravity = 17;
        mMProcessBar.setLayoutParams(layoutParams);
        mMProcessBar.setBackgroundResource(com.tencent.mm.R.drawable.avm);
        mMProcessBar.setVisibility(4);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setWebLoadingView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardLayoutBuilder$ViewHolder");
        kVar.f38708n = mMProcessBar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setWebLoadingView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardLayoutBuilder$ViewHolder");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ((j40.p) ((zy2.r7) i95.n0.c(zy2.r7.class))).getClass();
        r45.sn snVar = new r45.sn();
        snVar.f385851e = java.util.UUID.randomUUID().toString();
        snVar.f385852f = "";
        com.tencent.mm.plugin.finder.webview.FinderWebViewHelper finderWebViewHelper2 = new com.tencent.mm.plugin.finder.webview.FinderWebViewHelper(context, snVar, null, 89, null, 20, null);
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null) {
            window = activity.getWindow();
            finderWebViewHelper = finderWebViewHelper2;
        } else {
            finderWebViewHelper = finderWebViewHelper2;
            window = null;
        }
        finderWebViewHelper.setDialogWindow(window);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setWebViewHelper", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardLayoutBuilder$ViewHolder");
        kVar.f38710p = finderWebViewHelper;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setWebViewHelper", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardLayoutBuilder$ViewHolder");
        com.tencent.mm.plugin.finder.webview.p0 p17 = kVar.p();
        if (p17 != null) {
            p17.addWebViewStateListener(new c54.m(kVar));
        }
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.finder.webview.p0 p18 = kVar.p();
        if (p18 == null || (mMWebView = p18.getWithInitWebView()) == null) {
            mMWebView = null;
        } else {
            mMWebView.setVisibility(4);
            mMWebView.setAlpha(0.0f);
            mMWebView.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setWebView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardLayoutBuilder$ViewHolder");
        kVar.f38709o = mMWebView;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setWebView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardLayoutBuilder$ViewHolder");
        com.tencent.mars.xlog.Log.i("SnsAd.HalfEggCard.LayoutBuilder", "--createWebView, t1=" + (currentTimeMillis2 - currentTimeMillis) + ", t2=" + (java.lang.System.currentTimeMillis() - currentTimeMillis2));
        android.view.View o17 = kVar.o();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initWebView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardLayoutBuilder");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initCardContent", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardLayoutBuilder");
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-1, -1);
        layoutParams2.topMargin = ca4.m0.s(36);
        linearLayout.setLayoutParams(layoutParams2);
        linearLayout.setGravity(1);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        android.widget.TextView b17 = nVar.b(context, "#80000000", com.tencent.mm.R.dimen.a_j, 24);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTopTitleView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardLayoutBuilder$ViewHolder");
        kVar.f38697c = b17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTopTitleView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardLayoutBuilder$ViewHolder");
        android.widget.TextView b18 = nVar.b(context, "#e5000000", com.tencent.mm.R.dimen.a_k, 24);
        com.tencent.mm.ui.bk.q0(b18.getPaint());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTitleView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardLayoutBuilder$ViewHolder");
        kVar.f38698d = b18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTitleView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardLayoutBuilder$ViewHolder");
        android.widget.TextView b19 = nVar.b(context, "#8c000000", com.tencent.mm.R.dimen.a_i, 4);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setDescView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardLayoutBuilder$ViewHolder");
        kVar.f38699e = b19;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setDescView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardLayoutBuilder$ViewHolder");
        android.widget.FrameLayout frameLayout2 = new android.widget.FrameLayout(context);
        android.widget.LinearLayout.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(ca4.m0.s(174), ca4.m0.s(com.tencent.cloud.huiyan.exception.CallbackErrorCode.HY_API_RESPONSE_ERROR));
        layoutParams3.topMargin = ca4.m0.s(24);
        frameLayout2.setLayoutParams(layoutParams3);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCenterContainer", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardLayoutBuilder$ViewHolder");
        kVar.f38700f = frameLayout2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCenterContainer", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardLayoutBuilder$ViewHolder");
        android.widget.FrameLayout frameLayout3 = new android.widget.FrameLayout(context);
        frameLayout3.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -1));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCenterCompContainer", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardLayoutBuilder$ViewHolder");
        kVar.f38701g = frameLayout3;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCenterCompContainer", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardLayoutBuilder$ViewHolder");
        android.widget.ImageView imageView2 = new android.widget.ImageView(context);
        imageView2.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        imageView2.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAnimView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardLayoutBuilder$ViewHolder");
        kVar.f38702h = imageView2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAnimView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardLayoutBuilder$ViewHolder");
        kVar.f().addView(kVar.e());
        kVar.f().addView(kVar.a());
        android.widget.LinearLayout linearLayout2 = new android.widget.LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(1);
        android.widget.LinearLayout.LayoutParams layoutParams4 = new android.widget.LinearLayout.LayoutParams(-2, -2);
        layoutParams4.topMargin = ca4.m0.s(32);
        linearLayout2.setLayoutParams(layoutParams4);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setBtnCompContainer", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardLayoutBuilder$ViewHolder");
        kVar.f38703i = linearLayout2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBtnCompContainer", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardLayoutBuilder$ViewHolder");
        android.widget.FrameLayout frameLayout4 = new android.widget.FrameLayout(context);
        android.widget.LinearLayout.LayoutParams layoutParams5 = new android.widget.LinearLayout.LayoutParams(-2, -2);
        layoutParams5.topMargin = ca4.m0.s(24);
        frameLayout4.setLayoutParams(layoutParams5);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setBulletCommentContainer", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardLayoutBuilder$ViewHolder");
        kVar.f38707m = frameLayout4;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBulletCommentContainer", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardLayoutBuilder$ViewHolder");
        linearLayout.addView(kVar.m());
        linearLayout.addView(kVar.l());
        linearLayout.addView(kVar.g());
        linearLayout.addView(kVar.f());
        linearLayout.addView(kVar.c());
        linearLayout.addView(kVar.d());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initCardContent", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardLayoutBuilder");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initPreAnimContainer", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardLayoutBuilder");
        android.widget.RelativeLayout relativeLayout = new android.widget.RelativeLayout(context);
        android.widget.FrameLayout.LayoutParams layoutParams6 = new android.widget.FrameLayout.LayoutParams(-1, -1);
        layoutParams6.topMargin = ca4.m0.s(36);
        relativeLayout.setLayoutParams(layoutParams6);
        relativeLayout.setClipChildren(false);
        android.widget.ImageView imageView3 = new android.widget.ImageView(context);
        imageView3.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(148, 148));
        android.view.ViewGroup.LayoutParams layoutParams7 = imageView3.getLayoutParams();
        android.widget.RelativeLayout.LayoutParams layoutParams8 = layoutParams7 instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams7 : null;
        if (layoutParams8 != null) {
            layoutParams8.addRule(13, -1);
        }
        imageView3.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        imageView3.setId(android.view.View.generateViewId());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPreAnimImageView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardLayoutBuilder$ViewHolder");
        kVar.f38704j = imageView3;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPreAnimImageView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardLayoutBuilder$ViewHolder");
        android.widget.TextView c17 = nVar.c(context, "#CC9C00", com.tencent.mm.R.dimen.a_k, 64);
        c17.setId(android.view.View.generateViewId());
        int id6 = kVar.h().getId();
        android.view.ViewGroup.LayoutParams layoutParams9 = c17.getLayoutParams();
        android.widget.RelativeLayout.LayoutParams layoutParams10 = layoutParams9 instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams9 : null;
        if (layoutParams10 != null) {
            layoutParams10.addRule(2, id6);
        }
        android.view.ViewGroup.LayoutParams layoutParams11 = c17.getLayoutParams();
        android.widget.RelativeLayout.LayoutParams layoutParams12 = layoutParams11 instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams11 : null;
        if (layoutParams12 != null) {
            layoutParams12.addRule(14, -1);
        }
        c17.setGravity(c44.a.d());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPreAnimSubTitleTextView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardLayoutBuilder$ViewHolder");
        kVar.f38706l = c17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPreAnimSubTitleTextView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardLayoutBuilder$ViewHolder");
        android.widget.TextView c18 = nVar.c(context, "#CC9C00", com.tencent.mm.R.dimen.a_k, 16);
        int id7 = kVar.i().getId();
        android.view.ViewGroup.LayoutParams layoutParams13 = c18.getLayoutParams();
        android.widget.RelativeLayout.LayoutParams layoutParams14 = layoutParams13 instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams13 : null;
        if (layoutParams14 != null) {
            layoutParams14.addRule(2, id7);
        }
        android.view.ViewGroup.LayoutParams layoutParams15 = c18.getLayoutParams();
        android.widget.RelativeLayout.LayoutParams layoutParams16 = layoutParams15 instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams15 : null;
        if (layoutParams16 != null) {
            layoutParams16.addRule(14, -1);
        }
        c18.setGravity(c44.a.d());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPreAnimTitleTextView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardLayoutBuilder$ViewHolder");
        kVar.f38705k = c18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPreAnimTitleTextView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardLayoutBuilder$ViewHolder");
        relativeLayout.addView(kVar.h());
        relativeLayout.addView(kVar.j());
        relativeLayout.addView(kVar.i());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initPreAnimContainer", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardLayoutBuilder");
        kVar.k().addView(kVar.b());
        if (o17 != null) {
            kVar.k().addView(o17);
            kVar.k().addView(kVar.n());
        }
        kVar.k().addView(linearLayout);
        kVar.k().addView(relativeLayout);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildLayout", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardLayoutBuilder");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMViewHolder", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        this.f162808t = kVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMViewHolder", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        f54.v vVar = this.f162807s;
        r1Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFinderFeedId", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent$FinderConfig");
        long j17 = r1Var.f162929a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFinderFeedId", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent$FinderConfig");
        ab4.n0 u17 = u();
        kotlin.jvm.internal.o.f(u17, "getLandingPageData(...)");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isFinderEnableBulletComment", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent$FinderConfig");
        boolean z18 = r1Var.f162932d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFinderEnableBulletComment", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent$FinderConfig");
        c54.g gVar = new c54.g(context, vVar, j17, u17, z18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMBulletCommentBuilder", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        this.f162809u = gVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMBulletCommentBuilder", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        c54.c cVar = new c54.c(context, V());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMAnimController", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        this.f162810v = cVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMAnimController", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        android.widget.ImageView a17 = V().a();
        f54.u b27 = this.f162807s.b();
        b27.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBgColor", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$RotateAnimInfo");
        java.lang.String str = b27.f259752b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBgColor", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$RotateAnimInfo");
        if (str != null) {
            java.lang.String str2 = str.length() > 0 ? str : null;
            if (str2 != null) {
                try {
                    a17.setImageDrawable(new android.graphics.drawable.ColorDrawable(android.graphics.Color.parseColor(str2)));
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.i("SnsAd.HalfEggCard.AdLandingComponent", "parseColor exp=" + e18 + ", color=" + str2);
                }
            }
        }
        android.widget.FrameLayout k17 = V().k();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doCustomLayout", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("customLayout", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        return k17;
    }
}
