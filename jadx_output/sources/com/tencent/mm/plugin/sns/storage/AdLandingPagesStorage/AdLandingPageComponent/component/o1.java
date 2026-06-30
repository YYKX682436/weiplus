package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

/* loaded from: classes4.dex */
public class o1 extends com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z2 {
    public final ab4.a0 B;
    public final ab4.n0 C;
    public final u94.f D;

    public o1(android.content.Context context, ab4.a0 a0Var, android.view.ViewGroup viewGroup) {
        super(context, a0Var, viewGroup);
        this.B = a0Var;
        this.C = u();
        this.D = new u94.f();
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void H(ab4.d0 d0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateDataSet", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAddBrandComp");
        super.H(this.B);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateDataSet", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAddBrandComp");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void K() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAddBrandComp");
        super.K();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAddBrandComp");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.o2
    public void P() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clickReport", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAddBrandComp");
        this.f165386t.e("13387");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clickReport", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAddBrandComp");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z2
    public void Y() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBtnClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAddBrandComp");
        boolean h07 = h0();
        long j17 = 0;
        android.content.Context context = this.f165049d;
        ab4.a0 a0Var = this.B;
        if (!h07) {
            if (com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().isBrandAdded(a0Var.f2805z1)) {
                u94.f.f(context, a0Var.f2805z1);
            } else {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1612, be1.r0.CTRL_INDEX);
                u94.f fVar = this.D;
                fVar.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setData", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
                fVar.f425848c = context;
                fVar.f425853h = false;
                ab4.n0 n0Var = this.C;
                fVar.f425856k = n0Var.k();
                fVar.f425854i = n0Var.o();
                fVar.f425855j = n0Var.a();
                ca4.k kVar = new ca4.k();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.data.AddBrandUIData");
                java.lang.String str = a0Var.f2805z1;
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (str == null) {
                    str = "";
                }
                kVar.f39965a = str;
                java.lang.String str2 = a0Var.A1;
                if (str2 == null) {
                    str2 = "";
                }
                kVar.f39966b = str2;
                java.lang.String str3 = a0Var.B1;
                if (str3 == null) {
                    str3 = "";
                }
                kVar.f39967c = str3;
                java.lang.String str4 = a0Var.C1;
                if (str4 == null) {
                    str4 = "";
                }
                kVar.f39968d = str4;
                kVar.f39969e = a0Var.E1;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.data.AddBrandUIData");
                fVar.f425852g = kVar;
                fVar.f425857l = n0Var.l();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCanvasDynamicInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
                java.lang.String str5 = n0Var.f2883z;
                java.lang.String str6 = str5 != null ? str5 : "";
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCanvasDynamicInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
                fVar.f425858m = str6;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setData", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("sendAddBrandFromNativeUI", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
                if (fVar.f425853h) {
                    com.tencent.mars.xlog.Log.i("HalfScreenAddBrandController", "sendAddBrandFromNativeUI isAddContact is true");
                    fVar.e(true, fVar.f425852g.f39965a);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("sendAddBrandFromNativeUI", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
                } else {
                    android.content.Context context2 = fVar.f425848c;
                    fVar.f425851f = db5.e1.Q(context2, context2.getString(com.tencent.mm.R.string.f490573yv), fVar.f425848c.getString(com.tencent.mm.R.string.j7k), true, true, null);
                    com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().doAddBrandScene(fVar.f425852g.f39965a, 182, new u94.e(fVar, 182, null));
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("sendAddBrandFromNativeUI", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
                }
            }
            this.f165386t.a("addBrandBtnJumpType", 0L);
            P();
        } else if (android.text.TextUtils.isEmpty(a0Var.D1)) {
            com.tencent.mars.xlog.Log.e("AdLandingPageAddBrandComp", "canNotJumpAddBrand and jumpUrl is empty");
        } else {
            java.lang.String str7 = a0Var.D1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("jumpH5", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAddBrandComp");
            try {
                int l17 = u().l();
                if (context instanceof com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI) {
                    j17 = com.tencent.mm.plugin.sns.storage.w2.n(((android.app.Activity) context).getIntent().getStringExtra("sns_landing_pages_share_sns_id"));
                    com.tencent.mars.xlog.Log.i("AdLandingPageAddBrandComp", "jumpH5, snsId=" + j17 + ", snsIdStr=" + ca4.z0.t0(j17) + ", source=" + l17);
                }
                a84.a0.b(this.f165049d, str7, u(), l17, j17, X().f2817d, false);
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("AdLandingPageAddBrandComp", "jumpH5 exp=" + th6.toString());
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("jumpH5", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAddBrandComp");
            this.f165386t.a("addBrandBtnJumpType", 1L);
            P();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBtnClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAddBrandComp");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z2, com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAddBrandComp");
        super.h();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setBtnView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAddBrandComp");
        ab4.a0 a0Var = this.B;
        if (a0Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBtnView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAddBrandComp");
        } else {
            try {
                boolean h07 = h0();
                com.tencent.mars.xlog.Log.i("AdLandingPageAddBrandComp", "setBtnView, canNotAddBrand=" + h07 + ", compatibleJumpUrl=" + a0Var.D1);
                if (h07 && android.text.TextUtils.isEmpty(a0Var.D1)) {
                    int A1 = (int) (com.tencent.mm.sdk.platformtools.t8.A1("0.6") * 255.0d);
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(a0Var.M)) {
                        X().M = java.lang.String.format("#%02x%s", java.lang.Integer.valueOf(A1), a0Var.M.substring(1));
                    }
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(a0Var.I)) {
                        X().I = java.lang.String.format("#%02x%s", java.lang.Integer.valueOf(A1), a0Var.I.substring(1));
                    }
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(a0Var.N)) {
                        X().N = java.lang.String.format("#%02x%s", java.lang.Integer.valueOf(A1), a0Var.N.substring(1));
                    }
                    android.widget.Button button = this.f165859v;
                    if (button != null) {
                        button.setEnabled(false);
                    }
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("AdLandingPageAddBrandComp", th6.toString());
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBtnView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAddBrandComp");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAddBrandComp");
    }

    public final boolean h0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("canNotJumpAddBrand", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAddBrandComp");
        ab4.n0 n0Var = this.C;
        int l17 = n0Var.l();
        int g17 = n0Var.g();
        com.tencent.mars.xlog.Log.i("AdLandingPageAddBrandComp", "canNotJumpAddBrand, source=" + l17 + ", originSource=" + g17);
        boolean z17 = com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.Q7(l17) || com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.Q7(g17) || l17 == 27 || g17 == 27 || l17 == 7 || g17 == 7;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("canNotJumpAddBrand", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAddBrandComp");
        return z17;
    }
}
