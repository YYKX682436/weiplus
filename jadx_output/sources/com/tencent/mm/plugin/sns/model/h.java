package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.model.m0 f164214d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.model.i f164215e;

    public h(com.tencent.mm.plugin.sns.model.i iVar, com.tencent.mm.plugin.sns.model.m0 m0Var) {
        this.f164215e = iVar;
        this.f164214d = m0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$6$1");
        com.tencent.mm.plugin.sns.model.m0 m0Var = this.f164214d;
        com.tencent.mm.plugin.sns.model.i iVar = this.f164215e;
        java.lang.String str = iVar.f164243d;
        m0Var.i(str, iVar.f164244e, iVar.f164245f, iVar.f164246g, iVar.f164247h, iVar.f164248i, iVar.f164249m, new com.tencent.mm.plugin.sns.model.r(iVar.f164250n, str));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$6$1");
    }
}
