package qo1;

/* loaded from: classes5.dex */
public final class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qo1.f0 f365566d;

    public z(qo1.f0 f0Var) {
        this.f365566d = f0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.wechat.aff.affroam.n0 n0Var;
        qo1.i0 i0Var;
        com.tencent.wechat.aff.affroam.m0 a17;
        com.tencent.wechat.aff.affroam.n0 n0Var2;
        if (this.f365566d.b()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BaseRoamTask", "State error. Try start a task at " + this.f365566d.f365485k);
            return;
        }
        com.tencent.wechat.aff.affroam.a2 a2Var = this.f365566d.f365479e;
        if (a2Var != null && (a17 = a2Var.a()) != null && (n0Var2 = a17.f215905g) != null && (n0Var2 == com.tencent.wechat.aff.affroam.n0.AFFROAM_TASK_STATE_PREPARING || n0Var2 == com.tencent.wechat.aff.affroam.n0.AFFROAM_TASK_STATE_RUNNING || n0Var2 == com.tencent.wechat.aff.affroam.n0.AFFROAM_TASK_STATE_IMPORTING)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BaseRoamTask", "State error. State of inner task is " + n0Var2);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseRoamTask", "There is no running task for pkgId=" + this.f365566d.f365483i + ". Now, we can start a new task or resume the exist task.");
        qo1.f0 f0Var = this.f365566d;
        ((ku5.t0) ku5.t0.f312615d).A(f0Var.n());
        f0Var.f365493s = true;
        f0Var.f365478d = java.lang.System.currentTimeMillis();
        f0Var.f365487m = 1;
        synchronized (f0Var.f365484j) {
            n0Var = com.tencent.wechat.aff.affroam.n0.AFFROAM_TASK_STATE_PREPARING;
            i0Var = qo1.i0.f365502f;
            f0Var.g(n0Var, i0Var);
            f0Var.r(n0Var);
            f0Var.f365486l = i0Var;
        }
        com.tencent.mm.plugin.backup.roambackup.r0.f92684a.o(f0Var, n0Var, i0Var);
        f0Var.j();
    }
}
