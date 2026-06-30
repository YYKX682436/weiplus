package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

/* loaded from: classes4.dex */
public class r4 extends k75.b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.s4 f165452e;

    public r4(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.s4 s4Var) {
        this.f165452e = s4Var;
    }

    @Override // k75.b, k75.c
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enter", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$ToOpenState");
        super.a();
        int i17 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4.V(this.f165452e.f165485r).V1;
        if (com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().isPkgInstalled(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4.V(this.f165452e.f165485r).H1)) {
            ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.q4(this));
        } else {
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.s4 s4Var = this.f165452e;
            k75.c cVar = s4Var.f165480m;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$6900", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine");
            s4Var.o(cVar);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$6900", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enter", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$ToOpenState");
    }

    @Override // k75.c
    public boolean c(android.os.Message message) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("processMessage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$ToOpenState");
        int i17 = message.what;
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.s4 s4Var = this.f165452e;
        int i18 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4.V(s4Var.f165485r).V1;
        com.tencent.mars.xlog.Log.i("LogStateTransitionState", hashCode() + "[ToOpenState] recv msg.what " + message.what);
        int i19 = message.what;
        if (i19 == 0) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1958, 12);
            i64.p0 p0Var = new i64.p0(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4.b0(s4Var.f165485r), com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4.d0(s4Var.f165485r), com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4.e0(s4Var.f165485r), 1, com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4.g0(s4Var.f165485r), com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4.h0(s4Var.f165485r), com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4.i0(s4Var.f165485r), com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4.j0(s4Var.f165485r), com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4.l0(s4Var.f165485r));
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4 u4Var = s4Var.f165485r;
            if (ca4.m0.o0(u4Var.f165049d, com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4.V(u4Var).B1, com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4.V(s4Var.f165485r).H1, "", com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4.V(s4Var.f165485r).U1, 2, p0Var)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processMessage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$ToOpenState");
                return true;
            }
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.s4.q(s4Var, s4Var.f165485r.f165049d.getString(com.tencent.mm.R.string.f493175j73));
            k75.c cVar = s4Var.f165481n;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$7000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine");
            s4Var.o(cVar);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$7000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processMessage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$ToOpenState");
            return true;
        }
        if (i19 == 2) {
            if (!com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().isPkgInstalled(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4.V(s4Var.f165485r).H1)) {
                k75.c cVar2 = s4Var.f165478h;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$7200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine");
                s4Var.o(cVar2);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$7200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processMessage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$ToOpenState");
            return true;
        }
        if (i19 != 4) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processMessage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$ToOpenState");
            return false;
        }
        k75.c cVar3 = s4Var.f165478h;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$7100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine");
        s4Var.o(cVar3);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$7100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processMessage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$ToOpenState");
        return true;
    }
}
