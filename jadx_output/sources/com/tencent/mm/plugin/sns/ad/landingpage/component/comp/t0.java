package com.tencent.mm.plugin.sns.ad.landingpage.component.comp;

/* loaded from: classes4.dex */
public class t0 extends com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2 {
    public int A;
    public int B;
    public int C;
    public final int D;
    public boolean E;
    public boolean F;

    /* renamed from: s, reason: collision with root package name */
    public final f54.m f162939s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.sdk.event.IListener f162940t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.sdk.event.IListener f162941u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.ViewGroup f162942v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.TextView f162943w;

    /* renamed from: x, reason: collision with root package name */
    public android.view.ViewGroup f162944x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z2 f162945y;

    /* renamed from: z, reason: collision with root package name */
    public android.content.BroadcastReceiver f162946z;

    public t0(android.content.Context context, f54.m mVar, android.view.ViewGroup viewGroup, int i17) {
        super(context, mVar, viewGroup);
        this.F = true;
        this.f162939s = mVar;
        this.A = 0;
        this.B = 0;
        this.D = i17;
        this.E = true;
    }

    public static void O(com.tencent.mm.plugin.sns.ad.landingpage.component.comp.t0 t0Var, com.tencent.mm.autogen.events.SnsAdVideoBonusSceneEvent snsAdVideoBonusSceneEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
        t0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAutoJumpEventCall", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
        f54.m mVar = t0Var.f162939s;
        if (mVar != null && mVar.G > 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hasClicked", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
            boolean z17 = t0Var.A > 0 || t0Var.B > 0 || t0Var.C > 0;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasClicked", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
            if (!z17) {
                t0Var.B++;
                t0Var.P(true);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAutoJumpEventCall", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAutoJumpEventCall", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public boolean C(org.json.JSONArray jSONArray) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
        if (jSONArray == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
            return false;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            if (D(jSONObject)) {
                jSONObject.put("clickCount", this.A);
                jSONObject.put("autoJumpCount", this.B);
                jSONObject.put("swipeJumpCount", this.C);
                jSONArray.put(jSONObject);
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z2 z2Var = this.f162945y;
                if (z2Var != null && z2Var.D(jSONObject2)) {
                    jSONArray.put(jSONObject2);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
                return true;
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
        return false;
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void K() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
        try {
            super.K();
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z2 z2Var = this.f162945y;
            if (z2Var != null) {
                z2Var.K();
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void L() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
        try {
            super.L();
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z2 z2Var = this.f162945y;
            if (z2Var != null) {
                z2Var.L();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("unregisterVideoProgressBarReceiver", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
            if (this.f162946z != null) {
                b4.d.a(this.f165049d).d(this.f162946z);
                this.f162946z = null;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("unregisterVideoProgressBarReceiver", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
            com.tencent.mm.sdk.event.IListener iListener = this.f162940t;
            if (iListener != null) {
                iListener.dead();
                this.f162940t = null;
            }
            com.tencent.mm.sdk.event.IListener iListener2 = this.f162941u;
            if (iListener2 != null) {
                iListener2.dead();
                this.f162941u = null;
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void M() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("viewWillDisappear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
        try {
            super.M();
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z2 z2Var = this.f162945y;
            if (z2Var != null) {
                z2Var.M();
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewWillDisappear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
    }

    public final void P(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dispatchClickEventToButtonComp", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z2 z2Var = this.f162945y;
        if (z2Var != null && z2Var.W() != null) {
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z2 z2Var2 = this.f162945y;
            z2Var2.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAutoJump", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
            z2Var2.f165861x = z17;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAutoJump", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
            this.f162945y.W().performClick();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dispatchClickEventToButtonComp", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
    }

    public final void R() {
        ab4.u uVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
        android.view.View view = this.f165056n;
        if (view != null) {
            this.f162942v = (android.view.ViewGroup) view.findViewById(com.tencent.mm.R.id.n3m);
            this.f162943w = (android.widget.TextView) this.f165056n.findViewById(com.tencent.mm.R.id.n3n);
            this.f162944x = (android.view.ViewGroup) this.f165056n.findViewById(com.tencent.mm.R.id.n3l);
        }
        f54.m mVar = this.f162939s;
        if (mVar != null && (uVar = mVar.I) != null) {
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2 a17 = com.tencent.mm.plugin.sns.ui.ta.a(this.f165049d, uVar, this.f162944x, 0);
            if (a17 instanceof com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z2) {
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z2 z2Var = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z2) a17;
                this.f162945y = z2Var;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setInFloatJumpComponent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
                z2Var.f165862y = true;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setInFloatJumpComponent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
                this.f162944x.removeAllViews();
                this.f162944x.addView(a17.x());
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
    }

    public final void S() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("registerVideoProgressBarReceiver", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
        if (this.f162946z == null) {
            android.content.IntentFilter intentFilter = new android.content.IntentFilter();
            intentFilter.addAction("com.tencent.mm.adlanding.video_progressbar_change");
            this.f162946z = new com.tencent.mm.plugin.sns.ad.landingpage.component.comp.s0(this, null);
            b4.d.a(this.f165049d).b(this.f162946z, intentFilter);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("registerVideoProgressBarReceiver", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
        try {
            S();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("ensureAutoJumpEventListener", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
            if (this.f162940t == null) {
                final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
                com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsAdVideoBonusSceneEvent> iListener = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsAdVideoBonusSceneEvent>(a0Var) { // from class: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp$2
                    {
                        this.__eventId = 1309014301;
                    }

                    @Override // com.tencent.mm.sdk.event.IListener
                    public boolean callback(com.tencent.mm.autogen.events.SnsAdVideoBonusSceneEvent snsAdVideoBonusSceneEvent) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp$2");
                        com.tencent.mm.autogen.events.SnsAdVideoBonusSceneEvent snsAdVideoBonusSceneEvent2 = snsAdVideoBonusSceneEvent;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp$2");
                        try {
                            com.tencent.mm.plugin.sns.ad.landingpage.component.comp.t0.O(com.tencent.mm.plugin.sns.ad.landingpage.component.comp.t0.this, snsAdVideoBonusSceneEvent2);
                        } catch (java.lang.Throwable unused) {
                            com.tencent.mars.xlog.Log.w("SnsAd.FloatJumpComp", "onEventCall called has wrong!");
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp$2");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp$2");
                        return true;
                    }
                };
                this.f162940t = iListener;
                iListener.alive();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("ensureAutoJumpEventListener", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("ensureSlideEventListener", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
            if (this.f162941u == null) {
                final com.tencent.mm.app.a0 a0Var2 = com.tencent.mm.app.a0.f53288d;
                com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsAdBonusSlideEvent> iListener2 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsAdBonusSlideEvent>(a0Var2) { // from class: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp$3
                    {
                        this.__eventId = 100492765;
                    }

                    @Override // com.tencent.mm.sdk.event.IListener
                    public boolean callback(com.tencent.mm.autogen.events.SnsAdBonusSlideEvent snsAdBonusSlideEvent) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp$3");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp$3");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
                        com.tencent.mm.plugin.sns.ad.landingpage.component.comp.t0 t0Var = com.tencent.mm.plugin.sns.ad.landingpage.component.comp.t0.this;
                        t0Var.getClass();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSlideEventCall", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
                        am.vu vuVar = snsAdBonusSlideEvent.f54787g;
                        int i17 = vuVar.f8221a;
                        if (vuVar.f8222b == 0) {
                            t0Var.E = true;
                        }
                        t0Var.f162942v.setTranslationY(-i17);
                        if (java.lang.Math.abs(i17) >= t0Var.D && t0Var.E) {
                            t0Var.E = false;
                            t0Var.C++;
                            t0Var.P(false);
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSlideEventCall", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp$3");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp$3");
                        return false;
                    }
                };
                this.f162941u = iListener2;
                iListener2.alive();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("ensureSlideEventListener", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
            R();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initViewAction", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
            android.view.ViewGroup viewGroup = this.f162942v;
            if (viewGroup != null) {
                viewGroup.setOnClickListener(new com.tencent.mm.plugin.sns.ad.landingpage.component.comp.r0(this));
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initViewAction", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void k() {
        f54.m mVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillItem", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
        try {
            super.k();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillTitleContent", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
            android.widget.TextView textView = this.f162943w;
            if (textView != null && (mVar = this.f162939s) != null) {
                textView.setText(mVar.F);
                if (android.text.TextUtils.isEmpty(mVar.F)) {
                    textView.setVisibility(8);
                } else {
                    textView.setVisibility(0);
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillTitleContent", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public int v() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayout", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayout", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
        return com.tencent.mm.R.layout.cpi;
    }

    public t0(android.content.Context context, f54.m mVar, android.view.ViewGroup viewGroup) {
        this(context, mVar, viewGroup, -1);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("computeSlideSlop", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
        int i17 = mVar != null ? mVar.H : 0;
        int b17 = i65.a.b(context, i17 <= 0 ? 130 : i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("computeSlideSlop", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
        this.D = b17;
    }
}
