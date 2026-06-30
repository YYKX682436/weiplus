package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

/* loaded from: classes4.dex */
public abstract class o2 extends com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2 {

    /* renamed from: s, reason: collision with root package name */
    public int f165385s;

    /* renamed from: t, reason: collision with root package name */
    public ib4.h f165386t;

    public o2(android.content.Context context, ab4.d0 d0Var, android.view.ViewGroup viewGroup) {
        super(context, d0Var, viewGroup);
        this.f165385s = 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initClickReportInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnBaseComp");
        this.f165386t = new ib4.h();
        T(d0Var, u());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initClickReportInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnBaseComp");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public boolean D(org.json.JSONObject jSONObject) {
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnBaseComp");
        if (!super.D(jSONObject)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnBaseComp");
            return false;
        }
        try {
            jSONObject.put("clickCount", R());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSubType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnBaseComp");
            ab4.d0 d0Var = this.f165050e;
            if (d0Var != null) {
                i17 = d0Var.f2826p;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSubType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnBaseComp");
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSubType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnBaseComp");
                i17 = 0;
            }
            jSONObject.putOpt("subType", java.lang.Integer.valueOf(i17));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnBaseComp");
            return true;
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Sns.AdLandingPageBtnBaseComp", e17, "", new java.lang.Object[0]);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnBaseComp");
            return false;
        }
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void G() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPadding", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnBaseComp");
        android.view.ViewGroup.LayoutParams layoutParams = this.f165056n.getLayoutParams();
        if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
            ab4.d0 d0Var = this.f165050e;
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams).setMargins((int) d0Var.f2821h, (int) d0Var.f2819f, (int) d0Var.f2822i, (int) d0Var.f2820g);
        }
        this.f165056n.setLayoutParams(layoutParams);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPadding", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnBaseComp");
    }

    public void O() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addClickCount", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnBaseComp");
        this.f165385s++;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addClickCount", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnBaseComp");
    }

    public void P() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clickReport", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnBaseComp");
        this.f165386t.e("13387");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clickReport", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnBaseComp");
    }

    public int R() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getClickCount", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnBaseComp");
        int i17 = this.f165385s;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getClickCount", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnBaseComp");
        return i17;
    }

    public void S(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setClickCount", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnBaseComp");
        this.f165385s = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setClickCount", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnBaseComp");
    }

    public void T(ab4.d0 d0Var, ab4.n0 n0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setClickReportInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnBaseComp");
        if (d0Var != null && n0Var != null) {
            try {
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Sns.AdLandingPageBtnBaseComp", "setClickReportInfo exp=" + th6.toString());
            }
            if (this.f165386t != null) {
                java.lang.String o17 = n0Var.o();
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                java.lang.String str = "";
                java.lang.String str2 = o17 == null ? "" : o17;
                int g17 = n0Var.g();
                int l17 = n0Var.l();
                long E1 = com.tencent.mm.sdk.platformtools.t8.E1(n0Var.e());
                int i17 = d0Var.f2826p;
                java.lang.String p17 = n0Var.p();
                java.lang.String str3 = p17 == null ? "" : p17;
                java.lang.String f17 = n0Var.f();
                java.lang.String str4 = f17 == null ? "" : f17;
                java.lang.String str5 = d0Var.f2817d;
                if (str5 == null) {
                    str5 = "";
                }
                java.lang.String str6 = d0Var.C;
                if (str6 != null) {
                    str = str6;
                }
                this.f165386t.d(str2, l17, g17, E1, 21, i17, 1, str3, str4);
                ib4.h hVar = this.f165386t;
                long j17 = n0Var.s() ? 1 : 0;
                cl0.g gVar = hVar.f290228a;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("appendContentInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdLadingPageClick$ContentBuilder");
                try {
                    gVar.p("halfScreenMode", j17);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("NetSceneAdLadingPageClick", "appendExtInfo exp=" + e17.toString());
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("appendContentInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdLadingPageClick$ContentBuilder");
                this.f165386t.b("cid", str5);
                this.f165386t.b("jumpExtInfo", str);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setClickReportInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnBaseComp");
                return;
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.Sns.AdLandingPageBtnBaseComp", "setClickReportInfo null");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setClickReportInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnBaseComp");
    }
}
