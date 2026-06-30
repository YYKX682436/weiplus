package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

/* loaded from: classes14.dex */
public final class d2 extends com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2 {
    public c01.k A;
    public com.tencent.mm.sdk.event.IListener B;
    public int C;
    public int D;
    public int E;
    public int F;
    public final c01.i G;
    public final java.lang.String H;

    /* renamed from: s, reason: collision with root package name */
    public final android.content.Context f165138s;

    /* renamed from: t, reason: collision with root package name */
    public final f54.a f165139t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f165140u;

    /* renamed from: v, reason: collision with root package name */
    public final o54.n f165141v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f165142w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f165143x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f165144y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f165145z;

    public d2(android.content.Context context, f54.a aVar, android.view.ViewGroup viewGroup, boolean z17) {
        super(context, aVar, viewGroup);
        this.f165138s = context;
        this.f165139t = aVar;
        this.f165140u = z17;
        this.f165141v = new o54.n();
        this.f165142w = "";
        this.G = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.c2();
        this.H = "AdLandingPageBgmVoiceComponent";
    }

    public static final /* synthetic */ c01.k O(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.d2 d2Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMAudioHelperTool$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
        c01.k kVar = d2Var.A;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMAudioHelperTool$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
        return kVar;
    }

    public static final /* synthetic */ java.lang.String P(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.d2 d2Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMBgmVoiceAudioPlayerId$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
        java.lang.String str = d2Var.f165142w;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMBgmVoiceAudioPlayerId$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
        return str;
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public boolean D(org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
        if (!super.D(jSONObject)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
            return false;
        }
        java.lang.String str = this.H;
        if (jSONObject != null) {
            try {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("report", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
                o54.n nVar = this.f165141v;
                nVar.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("report", "com.tencent.mm.plugin.sns.ad.landingpage.helper.PlayedTimeReporter");
                nVar.a();
                long j17 = nVar.f343157a;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("report", "com.tencent.mm.plugin.sns.ad.landingpage.helper.PlayedTimeReporter");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("report", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
                jSONObject.put("playedTime", j17);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e(str, "setComponentKVReportData, exp=" + e17);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
                return false;
            }
        }
        if (jSONObject != null) {
            jSONObject.put("musicDuration", this.F);
        }
        if (jSONObject != null) {
            jSONObject.put("playCompletedCount", this.D);
        }
        if (jSONObject != null) {
            jSONObject.put("playCount", this.C);
        }
        int i17 = this.E;
        n01.d d17 = n01.c.d(this.f165142w);
        this.E = java.lang.Math.max(i17, d17 != null ? d17.f333863b : 0);
        if (this.D > 0) {
            this.E = this.F;
        }
        if (jSONObject != null) {
            jSONObject.put("maxPlayTime", this.E);
        }
        com.tencent.mars.xlog.Log.i(str, "kv13387:" + jSONObject);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
        return true;
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void K() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
        super.K();
        com.tencent.mars.xlog.Log.i(this.H, "viewWillAppear() called");
        if (this.f165143x && !android.text.TextUtils.isEmpty(this.f165142w) && this.f165144y) {
            java.lang.String str = this.f165142w;
            am.f0 f0Var = new am.f0();
            am.d0 d0Var = f0Var.f6621a;
            d0Var.f6413a = 1;
            d0Var.f6414b = str;
            d0Var.f6417e = null;
            dl3.c.a(f0Var);
            boolean z17 = f0Var.f6622b.f6512a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResumePlay", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
            this.f165141v.b();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResumePlay", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
            this.C++;
            c01.k kVar = this.A;
            if (kVar != null) {
                kVar.c(this.G);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void L() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
        super.L();
        com.tencent.mars.xlog.Log.i(this.H, "viewWillDestroy() called");
        com.tencent.mm.sdk.event.IListener iListener = this.B;
        if (iListener != null) {
            iListener.dead();
        }
        if (!android.text.TextUtils.isEmpty(this.f165142w)) {
            n01.d d17 = n01.c.d(this.f165142w);
            this.E = d17 != null ? d17.f333863b : 0;
            n01.c.b(this.f165142w);
        }
        c01.k kVar = this.A;
        if (kVar != null) {
            kVar.a();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void M() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("viewWillDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
        super.M();
        com.tencent.mars.xlog.Log.i(this.H, "viewWillDisappear() called");
        if (this.f165143x && !android.text.TextUtils.isEmpty(this.f165142w)) {
            n01.c.e(this.f165142w);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPausePlay", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
            this.f165141v.a();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPausePlay", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
            c01.k kVar = this.A;
            if (kVar != null) {
                kVar.a();
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewWillDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
    }

    public final boolean R() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getShouldAutoPlay", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
        f54.a aVar = this.f165139t;
        java.lang.Integer valueOf = aVar != null ? java.lang.Integer.valueOf(aVar.G) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getShouldAutoPlay", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
            return false;
        }
        if (valueOf != null && valueOf.intValue() == 1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getShouldAutoPlay", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
            return true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getShouldAutoPlay", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
        return this.f165140u;
    }

    public final java.lang.String S() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTAG", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTAG", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
        return this.H;
    }
}
