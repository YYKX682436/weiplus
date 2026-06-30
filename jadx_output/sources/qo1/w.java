package qo1;

/* loaded from: classes5.dex */
public final class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qo1.f0 f365558d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.aff.affroam.n0 f365559e;

    public w(qo1.f0 f0Var, com.tencent.wechat.aff.affroam.n0 n0Var) {
        this.f365558d = f0Var;
        this.f365559e = n0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j17;
        long j18;
        long j19;
        qo1.f0 f0Var = this.f365558d;
        com.tencent.wechat.aff.affroam.u uVar = f0Var.f365475a.f215832g;
        int i17 = uVar != null ? uVar.f215988d : 0;
        com.tencent.wechat.aff.affroam.n0 n0Var = this.f365559e;
        if (n0Var.f215928d > 2) {
            com.tencent.wechat.aff.affroam.a2 a2Var = f0Var.f365479e;
            kotlin.jvm.internal.o.d(a2Var);
            com.tencent.wechat.aff.affroam.p0 c17 = a2Var.c();
            j17 = c17.f215947e;
            j19 = c17.f215948f;
            j18 = (1000 * j17) / (1 + j19);
        } else {
            j17 = 0;
            j18 = 0;
            j19 = 0;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("report31328 ROAM_REPORT_KV, type = ");
        com.tencent.wechat.aff.affroam.a2 a2Var2 = f0Var.f365479e;
        kotlin.jvm.internal.o.d(a2Var2);
        sb6.append(a2Var2.a().f215911p.f215937d);
        sb6.append(", state = ");
        sb6.append(n0Var);
        sb6.append(", deviceType = ");
        sb6.append(i17);
        sb6.append(", avgSpeed = ");
        sb6.append(j18);
        sb6.append(", transferredSize = ");
        sb6.append(j17);
        sb6.append(", elapsedTime = ");
        sb6.append(j19);
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseRoamTask", sb6.toString());
        jx3.f fVar = jx3.f.INSTANCE;
        com.tencent.wechat.aff.affroam.a2 a2Var3 = f0Var.f365479e;
        kotlin.jvm.internal.o.d(a2Var3);
        fVar.d(31328, 1, java.lang.Integer.valueOf(a2Var3.a().f215911p.f215937d), java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j19), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Integer.valueOf(n0Var.f215928d));
    }
}
