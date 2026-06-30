package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

/* loaded from: classes4.dex */
public class j4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.n4 f165288d;

    public j4(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.n4 n4Var) {
        this.f165288d = n4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String string;
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.n4 n4Var = this.f165288d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$ToDownloadState$3");
        try {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1958, 19);
            double d17 = (((float) com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4.V(n4Var.f165375e.f165485r).E1) / 1024.0f) / 1024.0f;
            if (com.tencent.mm.sdk.platformtools.t8.K0(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4.V(n4Var.f165375e.f165485r).G1)) {
                string = n4Var.f165375e.f165485r.f165049d.getString(com.tencent.mm.R.string.j5z);
            } else if (d17 > 0.0d) {
                java.lang.String format = java.lang.String.format("%.1f", java.lang.Double.valueOf(d17));
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4 u4Var = n4Var.f165375e.f165485r;
                string = u4Var.f165049d.getString(com.tencent.mm.R.string.f493164j61, com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4.V(u4Var).G1, format);
            } else {
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4 u4Var2 = n4Var.f165375e.f165485r;
                string = u4Var2.f165049d.getString(com.tencent.mm.R.string.f493163j60, com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4.V(u4Var2).G1);
            }
            java.lang.String str = string;
            ca4.c0.e(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4.b0(n4Var.f165375e.f165485r), com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4.c0(n4Var.f165375e.f165485r), 0, 13, com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4.d0(n4Var.f165375e.f165485r), com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4.e0(n4Var.f165375e.f165485r), 1);
            l44.z.m(new ca4.d(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4.d0(n4Var.f165375e.f165485r), com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4.g0(n4Var.f165375e.f165485r), com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4.h0(n4Var.f165375e.f165485r), com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4.e0(n4Var.f165375e.f165485r), com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4.i0(n4Var.f165375e.f165485r), com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4.j0(n4Var.f165375e.f165485r), com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4.l0(n4Var.f165375e.f165485r), 1, 101));
            db5.e1.A(n4Var.f165375e.f165485r.f165049d, str, "", "是", "否", new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i4(this), null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("LogStateTransitionState", "showAutoDownloadDialog exp=" + e17.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$ToDownloadState$3");
    }
}
