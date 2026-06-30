package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

/* loaded from: classes4.dex */
public class m4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.n4 f165349d;

    public m4(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.n4 n4Var) {
        this.f165349d = n4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$ToDownloadState$4");
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.n4 n4Var = this.f165349d;
        if (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4.m0(n4Var.f165375e.f165485r)) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1958, 21);
            com.tencent.mars.xlog.Log.i("LogStateTransitionState", "download not in wifi!");
            ca4.c0.e(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4.b0(n4Var.f165375e.f165485r), com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4.c0(n4Var.f165375e.f165485r), 0, 14, com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4.d0(n4Var.f165375e.f165485r), com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4.e0(n4Var.f165375e.f165485r), 1);
            l44.z.m(new ca4.d(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4.d0(n4Var.f165375e.f165485r), com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4.g0(n4Var.f165375e.f165485r), com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4.h0(n4Var.f165375e.f165485r), com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4.e0(n4Var.f165375e.f165485r), com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4.i0(n4Var.f165375e.f165485r), com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4.j0(n4Var.f165375e.f165485r), com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4.l0(n4Var.f165375e.f165485r), com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4.Z(n4Var.f165375e.f165485r), 102));
            db5.e1.n(n4Var.f165375e.f165485r.f165049d, com.tencent.mm.R.string.l5x, com.tencent.mm.R.string.l5y, new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.k4(this), new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.l4(this));
        } else {
            int i17 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4.V(n4Var.f165375e.f165485r).X1;
            com.tencent.mars.xlog.Log.i("MicroMsg.AdLandingPageDownloadApkBtnComp.GroceryDownload", "showDownloadTip = " + i17);
            if (i17 != 1) {
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4.U(n4Var.f165375e.f165485r).l(12);
            } else if (com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().isPaused(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4.V(n4Var.f165375e.f165485r).B1)) {
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.s4.r(n4Var.f165375e, 1);
            } else {
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.s4.r(n4Var.f165375e, 0);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$ToDownloadState$4");
    }
}
