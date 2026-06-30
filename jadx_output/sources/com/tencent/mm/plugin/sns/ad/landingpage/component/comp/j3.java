package com.tencent.mm.plugin.sns.ad.landingpage.component.comp;

/* loaded from: classes14.dex */
public final class j3 extends com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2 {
    public static final com.tencent.mm.plugin.sns.ad.landingpage.component.comp.p2 T = new com.tencent.mm.plugin.sns.ad.landingpage.component.comp.p2(null);
    public com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView A;
    public boolean B;
    public java.lang.String C;
    public final com.tencent.mm.plugin.sns.ad.widget.admedia.PlayActionButton D;
    public final com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView E;
    public kotlinx.coroutines.y0 F;
    public final androidx.lifecycle.o G;
    public final kotlinx.coroutines.flow.i2 H;
    public final java.util.List I;

    /* renamed from: J, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI f162862J;
    public final c01.i K;
    public final c01.k L;
    public final o54.n M;
    public final android.content.BroadcastReceiver N;
    public int P;
    public int Q;
    public int R;
    public int S;

    /* renamed from: s, reason: collision with root package name */
    public final android.content.Context f162863s;

    /* renamed from: t, reason: collision with root package name */
    public final f54.b0 f162864t;

    /* renamed from: u, reason: collision with root package name */
    public final int f162865u;

    /* renamed from: v, reason: collision with root package name */
    public final android.view.View f162866v;

    /* renamed from: w, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.MMRoundCornerImageView f162867w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.LinearLayout f162868x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView f162869y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.LinearLayout f162870z;

    /* JADX WARN: Multi-variable type inference failed */
    public j3(android.content.Context context, f54.b0 b0Var, android.view.ViewGroup viewGroup) {
        super(context, b0Var, viewGroup);
        this.f162863s = context;
        this.f162864t = b0Var;
        this.f162865u = b0Var != null ? b0Var.F : 0;
        this.f162866v = new android.view.View(context);
        this.f162867w = new com.tencent.mm.ui.widget.MMRoundCornerImageView(context);
        this.C = "";
        this.D = new com.tencent.mm.plugin.sns.ad.widget.admedia.PlayActionButton(context);
        this.E = new com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView(context);
        androidx.lifecycle.y yVar = context instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) context : null;
        this.G = yVar != null ? yVar.mo133getLifecycle() : null;
        this.H = kotlinx.coroutines.flow.r2.b(0, 1, u26.u.DROP_OLDEST, 1, null);
        this.I = new java.util.ArrayList();
        this.f162862J = context instanceof com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI ? (com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI) context : null;
        this.K = new com.tencent.mm.plugin.sns.ad.landingpage.component.comp.q2();
        this.L = new c01.k();
        this.M = new o54.n();
        this.N = new android.content.BroadcastReceiver() { // from class: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$receiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(android.content.Context context2, android.content.Intent intent) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onReceive", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$receiver$1");
                kotlin.jvm.internal.o.g(context2, "context");
                kotlin.jvm.internal.o.g(intent, "intent");
                java.lang.String stringExtra = intent.getStringExtra("identity");
                com.tencent.mm.plugin.sns.ad.landingpage.component.comp.j3 j3Var = com.tencent.mm.plugin.sns.ad.landingpage.component.comp.j3.this;
                if (kotlin.jvm.internal.o.b(stringExtra, com.tencent.mm.plugin.sns.ad.landingpage.component.comp.j3.R(j3Var))) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onReceive", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$receiver$1");
                    return;
                }
                try {
                    if (kotlin.jvm.internal.o.b("com.tencent.mm.adlanding.close_exposure_voice", intent.getAction())) {
                        ((kotlinx.coroutines.flow.q2) j3Var.Z()).e(2);
                    }
                } catch (java.lang.Throwable unused) {
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onReceive", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$receiver$1");
            }
        };
    }

    public static final /* synthetic */ c01.k O(com.tencent.mm.plugin.sns.ad.landingpage.component.comp.j3 j3Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getAudioHelperTool$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        c01.k kVar = j3Var.L;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getAudioHelperTool$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        return kVar;
    }

    public static final /* synthetic */ android.content.Context P(com.tencent.mm.plugin.sns.ad.landingpage.component.comp.j3 j3Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getContext$p$s1258133964", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        android.content.Context context = j3Var.f162863s;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getContext$p$s1258133964", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        return context;
    }

    public static final /* synthetic */ java.lang.String R(com.tencent.mm.plugin.sns.ad.landingpage.component.comp.j3 j3Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getPlayerId$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        java.lang.String str = j3Var.C;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getPlayerId$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object S(com.tencent.mm.plugin.sns.ad.landingpage.component.comp.j3 r11, kotlin.coroutines.Continuation r12) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.j3.S(com.tencent.mm.plugin.sns.ad.landingpage.component.comp.j3, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final void T(com.tencent.mm.plugin.sns.ad.landingpage.component.comp.j3 j3Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$sendPlayBroadcast", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        j3Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("sendPlayBroadcast", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        b4.d a17 = b4.d.a(j3Var.f162863s);
        kotlin.jvm.internal.o.f(a17, "getInstance(...)");
        android.content.Intent intent = new android.content.Intent("com.tencent.mm.adlanding.close_exposure_voice");
        intent.putExtra("identity", j3Var.C);
        a17.c(intent);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("sendPlayBroadcast", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$sendPlayBroadcast", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public boolean D(org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        if (!super.D(jSONObject)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
            return false;
        }
        if (jSONObject != null) {
            try {
                o54.n nVar = this.M;
                nVar.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("report", "com.tencent.mm.plugin.sns.ad.landingpage.helper.PlayedTimeReporter");
                nVar.a();
                long j17 = nVar.f343157a;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("report", "com.tencent.mm.plugin.sns.ad.landingpage.helper.PlayedTimeReporter");
                jSONObject.put("playedTime", j17);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Sns.AdLandingMusicComponent", "setComponentKVReportData, exp=" + e17);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
                return false;
            }
        }
        if (jSONObject != null) {
            jSONObject.put("musicDuration", this.S);
        }
        if (jSONObject != null) {
            jSONObject.put("playCompletedCount", this.Q);
        }
        if (jSONObject != null) {
            jSONObject.put("playCount", this.P);
        }
        if (this.Q > 0) {
            this.R = this.S;
        }
        if (jSONObject != null) {
            jSONObject.put("maxPlayTime", this.R);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Sns.AdLandingMusicComponent", "kv13387:" + jSONObject);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        return true;
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void J() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("viewAppeared", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        super.J();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewAppeared", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void K() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        super.K();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void L() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        super.L();
        kotlinx.coroutines.y0 y0Var = this.F;
        if (y0Var != null) {
            kotlinx.coroutines.z0.c(y0Var, null);
        }
        java.util.List list = this.I;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.sdk.event.IListener) it.next()).dead();
        }
        ((java.util.ArrayList) list).clear();
        b4.d a17 = b4.d.a(this.f162863s);
        kotlin.jvm.internal.o.f(a17, "getInstance(...)");
        a17.d(this.N);
        c01.k kVar = this.L;
        if (kVar != null) {
            kVar.a();
        }
        try {
            n01.c.b(this.C);
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void M() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("viewWillDisappear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        super.M();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewWillDisappear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
    }

    public final float U(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("convertXmlPx", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        f54.b0 b0Var = this.f162864t;
        if (b0Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("convertXmlPx", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
            return 0.0f;
        }
        float o17 = za4.z0.o(i17, b0Var.N, b0Var.P, b0Var.Q);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("convertXmlPx", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        return o17;
    }

    public final com.tencent.mm.plugin.sns.ad.widget.admedia.PlayActionButton V() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getActionBtn", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getActionBtn", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        return this.D;
    }

    public final o54.n W() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPlayedTimeReporter", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPlayedTimeReporter", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        return this.M;
    }

    public final com.tencent.mm.ui.widget.RoundCornerRelativeLayout X() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRootView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        android.view.View view = this.f165056n;
        com.tencent.mm.ui.widget.RoundCornerRelativeLayout roundCornerRelativeLayout = view != null ? (com.tencent.mm.ui.widget.RoundCornerRelativeLayout) view.findViewById(com.tencent.mm.R.id.f482659kh) : null;
        com.tencent.mm.ui.widget.RoundCornerRelativeLayout roundCornerRelativeLayout2 = roundCornerRelativeLayout instanceof com.tencent.mm.ui.widget.RoundCornerRelativeLayout ? roundCornerRelativeLayout : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRootView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        return roundCornerRelativeLayout2;
    }

    public final com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView Y() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSeekBar", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSeekBar", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        return this.E;
    }

    public final kotlinx.coroutines.flow.i2 Z() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUserControlFlow", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        kotlinx.coroutines.flow.i2 i2Var = this.H;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUserControlFlow", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        return i2Var;
    }

    public final void a0(int i17) {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initCommon", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView adAppCompatTextView = this.f162869y;
        if (adAppCompatTextView == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initCommon", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
            return;
        }
        adAppCompatTextView.setTextColor(i17);
        adAppCompatTextView.setGravity(16);
        java.lang.String str3 = "";
        f54.b0 b0Var = this.f162864t;
        if (b0Var == null || (str = b0Var.H) == null) {
            str = "";
        }
        adAppCompatTextView.setText(str);
        adAppCompatTextView.setMarqueeRepeatLimit(Integer.MAX_VALUE);
        adAppCompatTextView.setSelected(true);
        adAppCompatTextView.requestFocus();
        com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView adAppCompatTextView2 = this.A;
        if (adAppCompatTextView2 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initCommon", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
            return;
        }
        adAppCompatTextView2.setGravity(16);
        adAppCompatTextView2.setMarqueeRepeatLimit(Integer.MAX_VALUE);
        adAppCompatTextView2.setTextColor(i17);
        if (b0Var != null && (str2 = b0Var.I) != null) {
            str3 = str2;
        }
        adAppCompatTextView2.setText(str3);
        adAppCompatTextView2.setSelected(true);
        adAppCompatTextView2.setAlpha(0.5f);
        adAppCompatTextView2.requestFocus();
        com.tencent.mm.plugin.sns.ad.landingpage.component.comp.w2 w2Var = new com.tencent.mm.plugin.sns.ad.landingpage.component.comp.w2(this);
        com.tencent.mm.plugin.sns.ad.widget.admedia.PlayActionButton playActionButton = this.D;
        playActionButton.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ad.widget.admedia.PlayActionButton");
        playActionButton.f163294f = i17;
        playActionButton.setGravity(17);
        playActionButton.f163293e = new i84.a(playActionButton.getContext(), ((java.lang.Number) w2Var.invoke(2)).floatValue(), i17);
        int floatValue = (int) ((java.lang.Number) w2Var.invoke(64)).floatValue();
        int floatValue2 = (int) ((java.lang.Number) w2Var.invoke(64)).floatValue();
        android.view.View view = playActionButton.actionImg;
        playActionButton.addView(view, floatValue, floatValue2);
        playActionButton.addView(playActionButton.f163293e, (int) ((java.lang.Number) w2Var.invoke(88)).floatValue(), (int) ((java.lang.Number) w2Var.invoke(88)).floatValue());
        playActionButton.setShowLoading(false);
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        android.widget.RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.addRule(13);
        }
        i84.a aVar = playActionButton.f163293e;
        java.lang.Object layoutParams3 = aVar != null ? aVar.getLayoutParams() : null;
        android.widget.RelativeLayout.LayoutParams layoutParams4 = layoutParams3 instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams3 : null;
        if (layoutParams4 != null) {
            layoutParams4.addRule(13);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ad.widget.admedia.PlayActionButton");
        this.E.setProgress(0.0f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initCommon", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
    }

    public final boolean b0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isPlayingInFront", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        boolean z17 = false;
        com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = this.f162862J;
        if (snsAdNativeLandingPagesUI != null ? snsAdNativeLandingPagesUI.I2 : false) {
            if (kotlin.jvm.internal.o.b(snsAdNativeLandingPagesUI != null ? snsAdNativeLandingPagesUI.J2 : null, this.C)) {
                z17 = true;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isPlayingInFront", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        return z17;
    }

    public final void c0(final androidx.lifecycle.y yVar, final java.lang.String playerId, final boolean z17, final yz5.l callback) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("listenAudioEvent", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        kotlin.jvm.internal.o.g(playerId, "playerId");
        kotlin.jvm.internal.o.g(callback, "callback");
        if (yVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("listenAudioEvent", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
            return;
        }
        final kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.AudioPlayerEvent> iListener = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.AudioPlayerEvent>(yVar) { // from class: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$listenAudioEvent$1
            {
                this.__eventId = 1218151603;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.AudioPlayerEvent audioPlayerEvent) {
                java.lang.String str;
                com.tencent.mm.sdk.event.IListener iListener2;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$listenAudioEvent$1");
                com.tencent.mm.autogen.events.AudioPlayerEvent event = audioPlayerEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$listenAudioEvent$1");
                kotlin.jvm.internal.o.g(event, "event");
                am.g0 g0Var = event.f53990g;
                if (g0Var == null || (str = g0Var.f6718c) == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$listenAudioEvent$1");
                } else if (kotlin.jvm.internal.o.b(str, playerId)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Sns.AdLandingMusicComponent", "music comp event called with: action = [" + g0Var.f6716a + ']');
                    boolean booleanValue = ((java.lang.Boolean) callback.invoke(g0Var)).booleanValue();
                    if (z17 && booleanValue && (iListener2 = (com.tencent.mm.sdk.event.IListener) h0Var.f310123d) != null) {
                        iListener2.dead();
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$listenAudioEvent$1");
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$listenAudioEvent$1");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$listenAudioEvent$1");
                return false;
            }
        };
        h0Var.f310123d = iListener;
        iListener.alive();
        ((java.util.ArrayList) this.I).add(h0Var.f310123d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("listenAudioEvent", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void g() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("applyLayoutParams", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        super.g();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("applyLayoutParams", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x059e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x05d9  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0611  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0618  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0634  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x064e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x061c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0615  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x05dc  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010e  */
    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h() {
        /*
            Method dump skipped, instructions count: 1634
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.j3.h():void");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public int v() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayout", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayout", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        return com.tencent.mm.R.layout.cps;
    }
}
