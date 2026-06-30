package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class m3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.db6 f164474d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.model.n3 f164475e;

    public m3(com.tencent.mm.plugin.sns.model.n3 n3Var, r45.db6 db6Var) {
        this.f164475e = n3Var;
        this.f164474d = db6Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage$1");
        r45.db6 db6Var = this.f164474d;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSnsUserPage", "doFetchByContinueID continueID:%s", ca4.z0.t0(db6Var.f372287f));
        gm0.j1.i();
        com.tencent.mm.modelbase.r1 r1Var = gm0.j1.n().f273288b;
        java.lang.String str = db6Var.f372286e;
        long j17 = db6Var.f372287f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        com.tencent.mm.plugin.sns.model.n3 n3Var = this.f164475e;
        boolean z17 = n3Var.f164495g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        int i17 = db6Var.f372288g;
        int i18 = n3Var.A;
        int i19 = db6Var.f372291m;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        int i27 = n3Var.f164508w;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        int i28 = n3Var.B;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        int i29 = n3Var.D;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        r1Var.g(new com.tencent.mm.plugin.sns.model.n3(str, j17, z17, i17, i18, i19, i27, i28, i29 + 1));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage$1");
    }
}
