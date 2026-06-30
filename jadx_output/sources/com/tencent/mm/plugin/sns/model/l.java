package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.z3 f164373d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.e8 f164374e;

    public l(com.tencent.mm.plugin.sns.model.AdLandingPagesProxy adLandingPagesProxy, com.tencent.mm.storage.z3 z3Var, com.tencent.mm.storage.e8 e8Var) {
        this.f164373d = z3Var;
        this.f164374e = e8Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.storage.z3 z3Var = this.f164373d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$8");
        try {
            if (((int) z3Var.E2) == 0) {
                ((com.tencent.mm.storage.k4) this.f164374e).i0(z3Var);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdLandingPagesProxy", th6.toString());
        }
        if (((int) z3Var.E2) <= 0) {
            com.tencent.mars.xlog.Log.e("AdLandingPagesProxy", "addContact : insert contact failed");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$8");
        } else {
            c01.e2.m0(z3Var);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$8");
        }
    }
}
