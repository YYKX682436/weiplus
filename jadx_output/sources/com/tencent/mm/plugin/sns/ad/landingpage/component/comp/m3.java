package com.tencent.mm.plugin.sns.ad.landingpage.component.comp;

/* loaded from: classes4.dex */
public class m3 extends com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z2 {
    public final f54.d0 B;
    public final s34.y C;
    public final com.tencent.mm.plugin.sns.ad.landingpage.component.comp.l3 D;
    public n74.d E;
    public int F;
    public int G;
    public int H;

    public m3(android.content.Context context, f54.d0 d0Var, android.view.ViewGroup viewGroup) {
        super(context, d0Var, viewGroup);
        this.F = 0;
        this.B = d0Var;
        s34.y yVar = d0Var.f259708z1;
        this.C = yVar;
        this.D = new com.tencent.mm.plugin.sns.ad.landingpage.component.comp.l3(this);
        if (yVar != null) {
            this.f165386t.b("finderExportId", yVar.f402834f);
            this.f165386t.b("finderUsername", yVar.f402829a);
        }
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void K() {
        s34.y yVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingQuickAddFinderBtnComp");
        super.K();
        if (this.B == null || (yVar = this.C) == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingQuickAddFinderBtnComp");
            return;
        }
        com.tencent.mars.xlog.Log.i("AdLandingQuickAddFinderBtnComp", "viewWillAppear, mLastFollowFlg is " + this.F);
        h0(this.F);
        com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().getAdFinderContact(yVar.f402829a, this.D);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingQuickAddFinderBtnComp");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z2
    public void U() {
        s34.y yVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doBtnClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingQuickAddFinderBtnComp");
        f54.d0 d0Var = this.B;
        if (d0Var == null || (yVar = this.C) == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doBtnClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingQuickAddFinderBtnComp");
            return;
        }
        if (this.F == 0) {
            if (this.E == null) {
                this.E = new n74.d(this.f165049d, 1000, null);
            }
            this.f165386t.a("opType", 0L);
            n74.d dVar = this.E;
            java.lang.String str = d0Var.F;
            int i17 = this.G;
            int i18 = this.H;
            dVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showBottomSheet", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
            dVar.f335329f = yVar;
            dVar.f335341r = str;
            dVar.f335330g = this.D;
            dVar.d(yVar, i17, i18);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showBottomSheet", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
        } else {
            java.lang.String o17 = u().o();
            java.lang.String k17 = u().k();
            this.f165386t.a("opType", 1L);
            com.tencent.mars.xlog.Log.i("AdLandingQuickAddFinderBtnComp", "doBtnClick, uxInfo = " + o17 + ", snsId = " + k17);
            com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().doJumpToFinderProfileUI(this.f165049d, yVar.f402829a, o17, k17, 5);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doBtnClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingQuickAddFinderBtnComp");
    }

    public void h0(int i17) {
        s34.y yVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateBtnUI", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingQuickAddFinderBtnComp");
        this.F = i17;
        f54.d0 d0Var = this.B;
        if (d0Var == null || (yVar = this.C) == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateBtnUI", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingQuickAddFinderBtnComp");
            return;
        }
        android.widget.Button W = W();
        if (W == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateBtnUI", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingQuickAddFinderBtnComp");
            return;
        }
        if (i17 == 0) {
            W.setText(d0Var.F);
        } else {
            W.setText(yVar.f402833e);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateBtnUI", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingQuickAddFinderBtnComp");
    }
}
