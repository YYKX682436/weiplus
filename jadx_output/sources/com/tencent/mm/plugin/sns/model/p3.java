package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class p3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.wb6 f164576d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.model.q3 f164577e;

    public p3(com.tencent.mm.plugin.sns.model.q3 q3Var, r45.wb6 wb6Var) {
        this.f164577e = q3Var;
        this.f164576d = wb6Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage$1");
        r45.wb6 wb6Var = this.f164576d;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSnsWwUserPage", "doFetchByContinueID continueID:%s", java.lang.Long.valueOf(wb6Var.f389040f));
        gm0.j1.i();
        com.tencent.mm.modelbase.r1 r1Var = gm0.j1.n().f273288b;
        java.lang.String str = wb6Var.f389039e;
        long j17 = wb6Var.f389040f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        com.tencent.mm.plugin.sns.model.q3 q3Var = this.f164577e;
        boolean z17 = q3Var.f164599g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        int i17 = wb6Var.f389041g;
        int i18 = q3Var.f164615z;
        int i19 = wb6Var.f389044m;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        int i27 = q3Var.f164611v;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        int i28 = q3Var.A;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        int i29 = q3Var.C;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        r1Var.g(new com.tencent.mm.plugin.sns.model.q3(str, j17, z17, i17, i18, i19, i27, i28, i29 + 1));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage$1");
    }
}
