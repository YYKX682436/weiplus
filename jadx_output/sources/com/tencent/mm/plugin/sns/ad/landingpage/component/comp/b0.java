package com.tencent.mm.plugin.sns.ad.landingpage.component.comp;

/* loaded from: classes4.dex */
public class b0 extends com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.a implements com.tencent.mm.plugin.sns.ad.landingpage.component.comp.n1 {
    public android.widget.ImageView A;
    public boolean B;
    public com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent C;
    public com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0 D;
    public int E;
    public android.view.View.OnClickListener F;
    public final android.view.View.OnClickListener G;

    /* renamed from: s, reason: collision with root package name */
    public f54.f f162754s;

    /* renamed from: t, reason: collision with root package name */
    public java.util.List f162755t;

    /* renamed from: u, reason: collision with root package name */
    public za4.m1 f162756u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView f162757v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2 f162758w;

    /* renamed from: x, reason: collision with root package name */
    public ab4.d0 f162759x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView f162760y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.ImageView f162761z;

    public b0(android.content.Context context, f54.f fVar, android.view.ViewGroup viewGroup) {
        super(context, fVar, viewGroup);
        this.B = false;
        this.E = 0;
        this.G = new com.tencent.mm.plugin.sns.ad.landingpage.component.comp.a0(this);
        this.f162754s = fVar;
        this.f162755t = new java.util.ArrayList();
    }

    public static android.view.View S(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2 a2Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("findAnimCardView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
        if (a2Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findAnimCardView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
            return null;
        }
        if (a2Var.p().f2835y || a2Var.p().B) {
            android.view.View q17 = a2Var.q();
            j0(q17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findAnimCardView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
            return q17;
        }
        if (a2Var instanceof com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.a) {
            java.util.Iterator it = ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.a) a2Var).O().iterator();
            while (it.hasNext()) {
                android.view.View S = S((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2) it.next());
                if (S != null) {
                    j0(S);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findAnimCardView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
                    return S;
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findAnimCardView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
        return null;
    }

    public static com.tencent.mm.plugin.sns.ad.landingpage.component.comp.b0 T(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2 a2Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("findEggCardComponent", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
        if (a2Var instanceof com.tencent.mm.plugin.sns.ad.landingpage.component.comp.b0) {
            com.tencent.mm.plugin.sns.ad.landingpage.component.comp.b0 b0Var = (com.tencent.mm.plugin.sns.ad.landingpage.component.comp.b0) a2Var;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findEggCardComponent", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
            return b0Var;
        }
        if (a2Var instanceof com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.a) {
            java.util.Iterator it = ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.a) a2Var).O().iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.sns.ad.landingpage.component.comp.b0 T = T((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2) it.next());
                if (T != null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findEggCardComponent", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
                    return T;
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findEggCardComponent", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
        return null;
    }

    public static int X(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCardTypeFromExtInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
        if (!android.text.TextUtils.isEmpty(str)) {
            try {
                int optInt = new org.json.JSONObject(str).optInt("cardType");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCardTypeFromExtInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
                return optInt;
            } catch (java.lang.Exception unused) {
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCardTypeFromExtInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
        return 0;
    }

    public static void j0(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setNotClipChild", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
        if (view == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setNotClipChild", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
            return;
        }
        com.tencent.mars.xlog.Log.i("AdLandingEggCardComponent", "setNotClipChild");
        for (android.view.ViewParent parent = view.getParent(); (parent instanceof android.view.ViewGroup) && !(parent instanceof com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdlandingDummyViewPager); parent = parent.getParent()) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setNotClipChild", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public boolean D(org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
        if (!super.D(jSONObject)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
            return false;
        }
        try {
            jSONObject.put("randomPickTipViewClickNum", this.E);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("AdLandingEggCardComponent", "setComponentKVReportData exp=" + e17.toString());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
            return false;
        }
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void G() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPadding", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
        android.view.ViewGroup.LayoutParams layoutParams = this.f165056n.getLayoutParams();
        if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
            ab4.d0 d0Var = this.f165050e;
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams).setMargins((int) d0Var.f2821h, (int) d0Var.f2819f, (int) d0Var.f2822i, (int) d0Var.f2820g);
        }
        this.f165056n.setLayoutParams(layoutParams);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPadding", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void H(ab4.d0 d0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateDataSet", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
        java.util.Objects.toString(d0Var);
        if (d0Var instanceof f54.f) {
            this.f162754s = (f54.f) d0Var;
        }
        super.H(d0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateDataSet", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void J() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("viewAppeared", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
        Y();
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2 a2Var = this.f162758w;
        if (a2Var != null && a2Var.A()) {
            this.f162758w.J();
        }
        super.J();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewAppeared", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void K() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
        Y();
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2 a2Var = this.f162758w;
        if (a2Var != null && a2Var.A()) {
            this.f162758w.K();
        }
        super.K();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void L() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
        com.tencent.mars.xlog.Log.i("AdLandingEggCardComponent", "viewWillDestroy, curComp=".concat(Y()));
        super.L();
        java.util.Iterator it = this.f162755t.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2) it.next()).L();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void M() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("viewWillDisappear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
        Y();
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2 a2Var = this.f162758w;
        if (a2Var != null) {
            a2Var.M();
        }
        super.M();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewWillDisappear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.a
    public java.util.List O() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getChildrenComp", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
        if (this.f162756u != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList(this.f162756u.a());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getChildrenComp", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
            return arrayList;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getChildrenComp", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
        return arrayList2;
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.a
    public void P() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateChildExposure", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
        Y();
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2 a2Var = this.f162758w;
        if (a2Var != null) {
            if (a2Var.A()) {
                this.f162758w.K();
                this.f162758w.J();
            } else {
                this.f162758w.M();
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateChildExposure", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
    }

    public void R() {
        com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent adLandingHBCardComponent;
        o44.c cVar;
        android.view.View view;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkShowDoubleHbCardAppearAnim", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
        if (this.B && (adLandingHBCardComponent = this.C) != null) {
            adLandingHBCardComponent.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startDoubleCardAppearAnim", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
            if (adLandingHBCardComponent.f162736w == 3 && (cVar = adLandingHBCardComponent.f162733t) != null && (view = cVar.f342865c) != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doDoubleCardAppearAnim", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
                com.tencent.mars.xlog.Log.i("AdLandingHBCardComponent", "doDoubleCardAppearAnim");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingHBCardComponent", "doDoubleCardAppearAnim", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingHBCardComponent", "doDoubleCardAppearAnim", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(view, "Rotation", 0.0f, 8.0f);
                ofFloat.setDuration(400L);
                android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(view, "Rotation", 8.0f, 5.0f);
                ofFloat2.setDuration(200L);
                android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
                animatorSet.playSequentially(ofFloat, ofFloat2);
                animatorSet.start();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doDoubleCardAppearAnim", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startDoubleCardAppearAnim", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkShowDoubleHbCardAppearAnim", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
    }

    public final com.tencent.mm.plugin.sns.ad.landingpage.component.comp.g4 U(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2 a2Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("findSocialCardComp", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
        if (a2Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findSocialCardComp", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
            return null;
        }
        if (a2Var instanceof com.tencent.mm.plugin.sns.ad.landingpage.component.comp.g4) {
            com.tencent.mm.plugin.sns.ad.landingpage.component.comp.g4 g4Var = (com.tencent.mm.plugin.sns.ad.landingpage.component.comp.g4) a2Var;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findSocialCardComp", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
            return g4Var;
        }
        try {
            if (a2Var instanceof com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.a) {
                java.util.Iterator it = ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.a) a2Var).O().iterator();
                while (it.hasNext()) {
                    com.tencent.mm.plugin.sns.ad.landingpage.component.comp.g4 U = U((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2) it.next());
                    if (U != null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findSocialCardComp", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
                        return U;
                    }
                }
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdLandingEggCardComponent", "findSocialCardComp, exp=" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findSocialCardComp", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
        return null;
    }

    public final f54.g0 V(ab4.d0 d0Var) {
        java.util.List a17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("findSocialCardInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
        if (d0Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findSocialCardInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
            return null;
        }
        if (d0Var instanceof f54.g0) {
            f54.g0 g0Var = (f54.g0) d0Var;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findSocialCardInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
            return g0Var;
        }
        try {
            if (za4.z0.s(d0Var.f2827q) && (a17 = d0Var.a()) != null) {
                java.util.Iterator it = a17.iterator();
                while (it.hasNext()) {
                    f54.g0 V = V((ab4.d0) it.next());
                    if (V != null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findSocialCardInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
                        return V;
                    }
                }
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdLandingEggCardComponent", "findSocialCardInfo, exp=" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findSocialCardInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
        return null;
    }

    public ab4.d0 W(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCardInfoById", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCardInfoById", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
            return null;
        }
        for (ab4.d0 d0Var : this.f162754s.F) {
            if (str.equals(d0Var.A)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCardInfoById", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
                return d0Var;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCardInfoById", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
        return null;
    }

    public java.lang.String Y() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCurCompInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2 a2Var = this.f162758w;
        java.lang.String simpleName = a2Var == null ? "null" : a2Var.getClass().getSimpleName();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurCompInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
        return simpleName;
    }

    public com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2 Z() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCurrentShowComp", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2 a2Var = this.f162758w;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentShowComp", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
        return a2Var;
    }

    public ab4.d0 a0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDefaultCardInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
        for (ab4.d0 d0Var : this.f162754s.F) {
            if (d0Var.f2836z) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDefaultCardInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
                return d0Var;
            }
        }
        if (this.f162754s.F.size() <= 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDefaultCardInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
            return null;
        }
        ab4.d0 d0Var2 = (ab4.d0) this.f162754s.F.get(0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDefaultCardInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
        return d0Var2;
    }

    public android.util.Pair b0() {
        float f17;
        float f18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTwistCardSize", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
        ab4.d0 a07 = a0();
        if (a07 != null) {
            f18 = a07.f2823m;
            f17 = a07.f2824n;
        } else {
            f17 = 0.0f;
            f18 = 0.0f;
        }
        if (f18 <= 0.0f || f17 <= 0.0f) {
            com.tencent.mars.xlog.Log.e("AdLandingEggCardComponent", "default card size is 0, w=" + f18 + ", h=" + f17);
        }
        android.util.Pair pair = new android.util.Pair(java.lang.Integer.valueOf((int) f18), java.lang.Integer.valueOf((int) f17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTwistCardSize", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
        return pair;
    }

    public void c0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hideBackgroundViewAlphaAnim", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
        android.widget.ImageView imageView = this.f162761z;
        if (imageView == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hideBackgroundViewAlphaAnim", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
            return;
        }
        android.animation.ObjectAnimator b17 = com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.m0.f163131a.b(imageView, new com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.n0(0.17f, 0.17f, 0.64f, 1.0f, 500L), imageView.getAlpha(), 0.0f);
        if (b17 != null) {
            b17.setStartDelay(100L);
            b17.addListener(new com.tencent.mm.plugin.sns.ad.landingpage.component.comp.z(this));
            b17.start();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hideBackgroundViewAlphaAnim", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
    }

    public void d0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hideEncoreView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
        com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView shakeRandomEncoreView = this.f162757v;
        if (shakeRandomEncoreView == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hideEncoreView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
            return;
        }
        if (shakeRandomEncoreView.getVisibility() != 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hideEncoreView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
            return;
        }
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(this.f162757v, "alpha", 1.0f, 0.0f);
        ofFloat.addListener(new com.tencent.mm.plugin.sns.ad.landingpage.component.comp.y(this));
        ofFloat.setDuration(400L);
        ofFloat.start();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hideEncoreView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
    
        if (r2.f259703a == 1) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean e0() {
        /*
            r4 = this;
            java.lang.String r0 = "isSupportEncoreShake"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            f54.f r2 = r4.f162754s
            if (r2 == 0) goto L16
            f54.d r2 = r2.G
            if (r2 == 0) goto L16
            int r2 = r2.f259703a
            r3 = 1
            if (r2 != r3) goto L16
            goto L17
        L16:
            r3 = 0
        L17:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.b0.e0():boolean");
    }

    public boolean g0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSupportRandomPickCard", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
        f54.f fVar = this.f162754s;
        boolean z17 = (fVar == null || fVar.randomPickCardTipInfo == null) ? false : true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSupportRandomPickCard", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
        return z17;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|2|3|(2:5|(5:7|8|(14:14|15|(2:17|(1:19))(1:(2:76|(1:78)))|20|(1:22)(1:74)|23|(7:28|29|(1:31)|32|(7:35|(2:37|(7:39|40|41|(2:43|(1:45))(2:49|(2:51|(3:53|(1:55)(1:57)|56)))|46|47|48)(1:58))(1:69)|59|(1:63)|(2:65|66)(2:67|68)|48|33)|70|71)|73|29|(0)|32|(1:33)|70|71)(1:10)|11|12)(1:84))|85|8|(0)(0)|11|12|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x019b, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x022f A[Catch: all -> 0x019b, TRY_LEAVE, TryCatch #1 {all -> 0x019b, blocks: (B:41:0x010b, B:43:0x0154, B:45:0x015a, B:51:0x0161, B:53:0x0178, B:56:0x0198, B:59:0x01a8, B:61:0x01ae, B:63:0x01b8, B:65:0x01bd, B:67:0x020d, B:71:0x0222, B:10:0x022f), top: B:8:0x006b }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d3 A[Catch: all -> 0x022b, TryCatch #2 {all -> 0x022b, blocks: (B:15:0x006d, B:17:0x0075, B:19:0x007b, B:20:0x00b8, B:23:0x00c3, B:25:0x00c7, B:29:0x00cf, B:31:0x00d3, B:32:0x00d8, B:33:0x00e0, B:35:0x00e6, B:37:0x00f0, B:39:0x00fc, B:74:0x00bf, B:76:0x0090, B:78:0x00a9), top: B:14:0x006d }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e6 A[Catch: all -> 0x022b, TryCatch #2 {all -> 0x022b, blocks: (B:15:0x006d, B:17:0x0075, B:19:0x007b, B:20:0x00b8, B:23:0x00c3, B:25:0x00c7, B:29:0x00cf, B:31:0x00d3, B:32:0x00d8, B:33:0x00e0, B:35:0x00e6, B:37:0x00f0, B:39:0x00fc, B:74:0x00bf, B:76:0x0090, B:78:0x00a9), top: B:14:0x006d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String h0(java.lang.String r28, java.lang.String r29) {
        /*
            Method dump skipped, instructions count: 640
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.b0.h0(java.lang.String, java.lang.String):java.lang.String");
    }

    public void i0(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setEncoreShakeEnable", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
        com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView shakeRandomEncoreView = this.f162757v;
        if (shakeRandomEncoreView != null) {
            if (z17) {
                shakeRandomEncoreView.b();
            } else {
                shakeRandomEncoreView.c();
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setEncoreShakeEnable", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public android.view.View j() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("customLayout", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(this.f165049d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("customLayout", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
        return frameLayout;
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void k() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillItem", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
        za4.m1 m1Var = this.f162756u;
        android.content.Context context = this.f165049d;
        if (m1Var == null) {
            za4.m1 m1Var2 = new za4.m1(this.f162754s.F, context, 0, (android.widget.FrameLayout) this.f165056n);
            this.f162756u = m1Var2;
            m1Var2.b();
            this.f162755t = O();
        } else {
            m1Var.c(this.f162754s.F);
        }
        for (java.util.Iterator it = this.f162755t.iterator(); it.hasNext(); it = it) {
            android.view.View q17 = ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2) it.next()).q();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(q17, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingEggCardComponent", "fillItem", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            q17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(q17, "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingEggCardComponent", "fillItem", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f162754s.newCollectionBackImg)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addEggCardBackgroundImageView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
            if (this.f162761z == null) {
                android.widget.ImageView imageView = new android.widget.ImageView(context);
                this.f162761z = imageView;
                imageView.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
                android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
                a84.y0.b((android.widget.FrameLayout) this.f165056n, this.f162761z, 0);
                this.f162761z.setLayoutParams(layoutParams);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addEggCardBackgroundImageView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
            android.widget.ImageView imageView2 = this.f162761z;
            if (imageView2 != null) {
                imageView2.setAlpha(0.0f);
                a84.z.f(this.f162754s.newCollectionBackImg, this.f162761z);
            }
        }
        if (e0()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addEncoreShakeView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
            if (this.f162757v == null) {
                com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView shakeRandomEncoreView = new com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView(context);
                this.f162757v = shakeRandomEncoreView;
                f54.d dVar = this.f162754s.G;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initData", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView");
                shakeRandomEncoreView.f163852g = dVar;
                shakeRandomEncoreView.f163851f.setText(dVar.f259704b);
                if (android.text.TextUtils.isEmpty(dVar.f259705c)) {
                    shakeRandomEncoreView.f163850e.setVisibility(8);
                } else {
                    a84.z.h(dVar.f259705c, shakeRandomEncoreView.f163850e);
                }
                if (dVar.f259703a == 1 && shakeRandomEncoreView.f163853h == null) {
                    shakeRandomEncoreView.f163853h = new a94.b0(shakeRandomEncoreView.f163849d);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initData", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView");
                android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-2, -2);
                layoutParams2.gravity = 81;
                layoutParams2.bottomMargin = i65.a.b(context, 12);
                ((android.widget.FrameLayout) this.f165056n).addView(this.f162757v, layoutParams2);
                this.f162757v.setOnShakeListener(new com.tencent.mm.plugin.sns.ad.landingpage.component.comp.x(this));
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addEncoreShakeView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
            this.f162757v.setVisibility(4);
        }
        f54.f fVar = this.f162754s;
        if (!com.tencent.mm.sdk.platformtools.t8.N0(fVar.newCollectionCoverImg, fVar.recollectedCoverImg)) {
            f54.f fVar2 = this.f162754s;
            if (fVar2.H > 0.0f && fVar2.I > 0.0f) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addEggCardCoverImageView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
                if (this.A == null) {
                    android.widget.ImageView imageView3 = new android.widget.ImageView(context);
                    this.A = imageView3;
                    imageView3.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
                    f54.f fVar3 = this.f162754s;
                    android.widget.FrameLayout.LayoutParams layoutParams3 = new android.widget.FrameLayout.LayoutParams((int) fVar3.H, (int) fVar3.I);
                    a84.y0.b((android.widget.FrameLayout) this.f165056n, this.A, -1);
                    this.A.setLayoutParams(layoutParams3);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addEggCardCoverImageView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
                android.widget.ImageView imageView4 = this.A;
                if (imageView4 != null) {
                    imageView4.setAlpha(0.0f);
                }
            }
        }
        if (g0()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addRandomPickCardTipView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
            if (this.f162760y == null && (context instanceof com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI)) {
                com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = (com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI) context;
                snsAdNativeLandingPagesUI.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFloatBottomContainer", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                snsAdNativeLandingPagesUI.i7();
                android.widget.FrameLayout frameLayout = snsAdNativeLandingPagesUI.P2;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFloatBottomContainer", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                if (frameLayout != null) {
                    kotlin.jvm.internal.o.g(context, "context");
                    com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView adLandingPagePickCardTipView = new com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView(context, null);
                    this.f162760y = adLandingPagePickCardTipView;
                    adLandingPagePickCardTipView.setOnBtnClickListener(this.G);
                    android.widget.FrameLayout.LayoutParams layoutParams4 = new android.widget.FrameLayout.LayoutParams(-1, -2);
                    layoutParams4.gravity = 1;
                    layoutParams4.bottomMargin = (int) za4.z0.n(34.0d, 375);
                    frameLayout.addView(this.f162760y, layoutParams4);
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addRandomPickCardTipView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
    }

    public void l0(boolean z17, boolean z18, int i17) {
        int i18;
        android.animation.ObjectAnimator a17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setVisibility", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
        if (this.A == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setVisibility", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
            return;
        }
        com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent adLandingHBCardComponent = this.C;
        if (adLandingHBCardComponent != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSubCardType", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
            i18 = adLandingHBCardComponent.f162736w;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSubCardType", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        } else {
            i18 = -1;
        }
        com.tencent.mars.xlog.Log.i("AdLandingEggCardComponent", "setVisibility, visible is " + z17 + ", withAnim is " + z18 + ", pickStatus is " + i17 + ", subCardType is " + i18);
        if (z17 && i17 == 1 && (i18 == 2 || i18 == 4)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setVisibility", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
            return;
        }
        if (z17) {
            if (i17 == 0 || i17 == 3) {
                a84.z.f(this.f162754s.newCollectionCoverImg, this.A);
            } else if (i17 == 1) {
                a84.z.f(this.f162754s.recollectedCoverImg, this.A);
            }
        }
        if (z18) {
            com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.m0 m0Var = com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.m0.f163131a;
            if (z17) {
                com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.n0 n0Var = new com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.n0(0.17f, 0.17f, 0.64f, 1.0f, 150L);
                android.widget.ImageView imageView = this.A;
                a17 = m0Var.b(imageView, n0Var, imageView.getAlpha(), 1.0f);
            } else {
                com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.n0 n0Var2 = new com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.n0(0.17f, 0.17f, 0.64f, 1.0f, 200L);
                android.widget.ImageView imageView2 = this.A;
                a17 = m0Var.a(imageView2, n0Var2, imageView2.getAlpha(), 0.0f);
            }
            if (a17 != null) {
                a17.start();
            }
        } else {
            this.A.setAlpha(z17 ? 1.0f : 0.0f);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setVisibility", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
    }

    public void m0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showEncoreView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
        com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView shakeRandomEncoreView = this.f162757v;
        if (shakeRandomEncoreView == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showEncoreView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
            return;
        }
        if (shakeRandomEncoreView.getVisibility() == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showEncoreView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
            return;
        }
        this.f162757v.setVisibility(0);
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(this.f162757v, "alpha", 0.0f, 1.0f);
        ofFloat.setDuration(400L);
        ofFloat.start();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showEncoreView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
    }

    public void n0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showRandomPickCardTipView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
        com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView adLandingPagePickCardTipView = this.f162760y;
        if (adLandingPagePickCardTipView != null) {
            adLandingPagePickCardTipView.setVisibility(0);
            this.f162760y.a();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showRandomPickCardTipView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
    }
}
