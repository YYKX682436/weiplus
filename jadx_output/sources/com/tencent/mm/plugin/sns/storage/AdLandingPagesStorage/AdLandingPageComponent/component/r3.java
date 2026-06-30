package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

/* loaded from: classes4.dex */
public class r3 extends k75.b {

    /* renamed from: e, reason: collision with root package name */
    public long f165450e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.s4 f165451f;

    public r3(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.s4 s4Var) {
        this.f165451f = s4Var;
    }

    @Override // k75.b, k75.c
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enter", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$DoNetSceneState");
        super.a();
        int i17 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4.V(this.f165451f.f165485r).V1;
        this.f165450e = java.lang.System.currentTimeMillis();
        java.lang.String d07 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4.d0(this.f165451f.f165485r);
        java.lang.String g07 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4.g0(this.f165451f.f165485r);
        int h07 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4.h0(this.f165451f.f165485r);
        java.lang.String e07 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4.e0(this.f165451f.f165485r);
        java.lang.String i07 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4.i0(this.f165451f.f165485r);
        java.lang.String j07 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4.j0(this.f165451f.f165485r);
        java.lang.String l07 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4.l0(this.f165451f.f165485r);
        java.util.ArrayList arrayList = l44.z.f316428a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportDoNetSceneBeforeDownload", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
        try {
            ca4.f fVar = new ca4.f();
            fVar.m(4001021);
            fVar.o(d07);
            fVar.f(g07);
            fVar.l(h07);
            fVar.c(e07);
            fVar.p(i07);
            fVar.n(j07);
            fVar.q(l07);
            fVar.k(4);
            a84.t0.a(fVar.a());
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdConversionOnlineReportHelper", "reportDoNetSceneBeforeDownload, exp is " + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportDoNetSceneBeforeDownload", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
        com.tencent.mm.plugin.sns.model.AdLandingPagesProxy adLandingPagesProxy = com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance();
        java.lang.String str = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4.V(this.f165451f.f165485r).B1;
        java.lang.String str2 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4.V(this.f165451f.f165485r).H1;
        java.lang.String str3 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4.V(this.f165451f.f165485r).D1;
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4 u4Var = this.f165451f.f165485r;
        adLandingPagesProxy.doAdChannelScene(str, str2, str3, u4Var.f165537x0, com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4.V(u4Var).F1);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1958, 24);
        com.tencent.mars.xlog.Log.i("LogStateTransitionState", "[DoNetSceneState], appid=" + com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4.V(this.f165451f.f165485r).B1 + ", pkg=" + com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4.V(this.f165451f.f165485r).H1 + ", channelId=" + com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4.V(this.f165451f.f165485r).D1 + ", useGameDownloadWidget=" + com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4.V(this.f165451f.f165485r).F1 + ", hash=" + hashCode());
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.q3(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enter", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$DoNetSceneState");
    }

    @Override // k75.c
    public boolean c(android.os.Message message) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("processMessage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$DoNetSceneState");
        int i17 = message.what;
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.s4 s4Var = this.f165451f;
        int i18 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4.V(s4Var.f165485r).V1;
        com.tencent.mars.xlog.Log.i("LogStateTransitionState", hashCode() + "[DoNetSceneState]recv msg.what " + message.what);
        if (com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().isApkExist(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4.V(s4Var.f165485r).B1)) {
            k75.c cVar = s4Var.f165480m;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$4300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine");
            s4Var.o(cVar);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$4300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processMessage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$DoNetSceneState");
            return true;
        }
        int i19 = message.what;
        if (i19 == 5) {
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.s4.q(s4Var, s4Var.f165485r.f165049d.getString(com.tencent.mm.R.string.j6z));
            k75.c cVar2 = s4Var.f165482o;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$4500", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine");
            s4Var.o(cVar2);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$4500", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processMessage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$DoNetSceneState");
            return true;
        }
        if (i19 != 6) {
            if (i19 != 10) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processMessage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$DoNetSceneState");
                return false;
            }
            k75.c cVar3 = s4Var.f165478h;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$4600", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine");
            s4Var.o(cVar3);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$4600", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processMessage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$DoNetSceneState");
            return true;
        }
        int currentTimeMillis = (int) (java.lang.System.currentTimeMillis() - this.f165450e);
        k75.c cVar4 = s4Var.f165478h;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$4400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine");
        s4Var.o(cVar4);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$4400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine");
        java.lang.String d07 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4.d0(s4Var.f165485r);
        java.lang.String g07 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4.g0(s4Var.f165485r);
        int h07 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4.h0(s4Var.f165485r);
        java.lang.String e07 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4.e0(s4Var.f165485r);
        java.lang.String i07 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4.i0(s4Var.f165485r);
        java.lang.String j07 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4.j0(s4Var.f165485r);
        java.lang.String l07 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4.l0(s4Var.f165485r);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCostTime", "com.tencent.mm.plugin.sns.data.AdConversionOnlineParams");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCostTime", "com.tencent.mm.plugin.sns.data.AdConversionOnlineParams");
        java.util.ArrayList arrayList = l44.z.f316428a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportDoNetSceneSuccBeforeDownload", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
        try {
            ca4.f fVar = new ca4.f();
            fVar.m(4001022);
            fVar.o(d07);
            fVar.f(g07);
            fVar.l(h07);
            fVar.c(e07);
            fVar.p(i07);
            fVar.n(j07);
            fVar.q(l07);
            fVar.k(4);
            fVar.g(currentTimeMillis);
            a84.t0.a(fVar.a());
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdConversionOnlineReportHelper", "reportDoNetSceneSuccBeforeDownload, exp is " + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportDoNetSceneSuccBeforeDownload", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
        this.f165450e = 0L;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processMessage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$DoNetSceneState");
        return true;
    }
}
