package com.tencent.mm.plugin.sns.ad.landingpage.component.comp;

/* loaded from: classes4.dex */
public class k3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f162873d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.component.comp.l3 f162874e;

    public k3(com.tencent.mm.plugin.sns.ad.landingpage.component.comp.l3 l3Var, java.lang.Object obj) {
        this.f162874e = l3Var;
        this.f162873d = obj;
    }

    @Override // java.lang.Runnable
    public void run() {
        n74.d dVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingQuickAddFinderBtnComp$FinderLogicCallback$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingQuickAddFinderBtnComp$FinderLogicCallback");
        com.tencent.mm.plugin.sns.ad.landingpage.component.comp.l3 l3Var = this.f162874e;
        java.lang.ref.WeakReference weakReference = l3Var.f162884a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingQuickAddFinderBtnComp$FinderLogicCallback");
        if (weakReference == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingQuickAddFinderBtnComp$FinderLogicCallback$1");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingQuickAddFinderBtnComp$FinderLogicCallback");
        java.lang.ref.WeakReference weakReference2 = l3Var.f162884a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingQuickAddFinderBtnComp$FinderLogicCallback");
        com.tencent.mm.plugin.sns.ad.landingpage.component.comp.m3 m3Var = (com.tencent.mm.plugin.sns.ad.landingpage.component.comp.m3) weakReference2.get();
        if (m3Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingQuickAddFinderBtnComp$FinderLogicCallback$1");
            return;
        }
        java.lang.Object obj = this.f162873d;
        if (obj instanceof java.lang.String) {
            java.lang.String str = (java.lang.String) obj;
            try {
                java.lang.String k17 = m3Var.u().k();
                java.lang.String o17 = m3Var.u().o();
                java.lang.String a17 = m3Var.u().a();
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                int optInt = jSONObject.optInt("followType");
                if (optInt == 1) {
                    int optInt2 = jSONObject.optInt("followFlg");
                    int optInt3 = jSONObject.optInt("followNum");
                    int optInt4 = jSONObject.optInt("feedNum");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateFinderFollowFlag", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingQuickAddFinderBtnComp");
                    com.tencent.mars.xlog.Log.i("AdLandingQuickAddFinderBtnComp", "request ad finder contract status, followFlg is " + optInt2);
                    m3Var.G = optInt3;
                    m3Var.H = optInt4;
                    m3Var.h0(optInt2);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateFinderFollowFlag", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingQuickAddFinderBtnComp");
                } else if (optInt == 2) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingQuickAddFinderBtnComp");
                    n74.d dVar2 = m3Var.E;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingQuickAddFinderBtnComp");
                    if (dVar2 == null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingQuickAddFinderBtnComp$FinderLogicCallback$1");
                        return;
                    }
                    boolean optBoolean = jSONObject.optBoolean("followRet");
                    java.lang.String b17 = dVar2.b();
                    if (optBoolean) {
                        dVar = dVar2;
                        n74.s.b(k17, o17, a17, b17, 0, 2);
                        com.tencent.mars.xlog.Log.i("AdLandingQuickAddFinderBtnComp", "add finder contract success, followFlg is 1");
                        m3Var.h0(1);
                        com.tencent.mm.plugin.sns.model.AdLandingPagesProxy adLandingPagesProxy = com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingQuickAddFinderBtnComp");
                        android.content.Context context = m3Var.f165049d;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingQuickAddFinderBtnComp");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingQuickAddFinderBtnComp");
                        s34.y yVar = m3Var.C;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingQuickAddFinderBtnComp");
                        adLandingPagesProxy.doJumpToFinderProfileUI(context, yVar.f402829a, o17, k17, 5);
                    } else {
                        dVar = dVar2;
                        n74.s.b(k17, o17, a17, b17, 1, 2);
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hideBottomSheet", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
                    n74.d dVar3 = dVar;
                    com.tencent.mm.ui.widget.dialog.k0 k0Var = dVar3.f335325b;
                    if (k0Var != null && k0Var.i()) {
                        dVar3.f335325b.u();
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hideBottomSheet", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
                    dVar3.c();
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("AdLandingQuickAddFinderBtnComp", "FinderLogicCallback callback, exp is " + th6.toString());
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingQuickAddFinderBtnComp$FinderLogicCallback$1");
    }
}
