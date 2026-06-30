package qo1;

/* loaded from: classes5.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f365472d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qo1.f0 f365473e;

    public f(boolean z17, qo1.f0 f0Var) {
        this.f365472d = z17;
        this.f365473e = f0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.wechat.aff.affroam.n0 n0Var;
        qo1.i0 i0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseRoamTask", "Continue start Task, isConnected=" + this.f365472d + ", runnable=" + this.f365473e.f365493s);
        qo1.f0 f0Var = this.f365473e;
        if (!f0Var.f365493s) {
            f0Var.g(com.tencent.wechat.aff.affroam.n0.AFFROAM_TASK_STATE_STOPPED, qo1.i0.f365502f);
            return;
        }
        if (this.f365472d) {
            f0Var.s();
            return;
        }
        f0Var.f365487m = 0;
        qo1.f0 f0Var2 = this.f365473e;
        synchronized (f0Var2.f365484j) {
            n0Var = com.tencent.wechat.aff.affroam.n0.AFFROAM_TASK_STATE_ERROR;
            i0Var = qo1.i0.f365509p;
            f0Var2.g(n0Var, i0Var);
            f0Var2.r(n0Var);
            f0Var2.f365486l = i0Var;
        }
        com.tencent.mm.plugin.backup.roambackup.r0.f92684a.o(this.f365473e, n0Var, i0Var);
    }
}
