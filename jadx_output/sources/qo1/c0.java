package qo1;

/* loaded from: classes5.dex */
public final class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qo1.f0 f365455d;

    public c0(qo1.f0 f0Var) {
        this.f365455d = f0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.wechat.aff.affroam.n0 n0Var;
        qo1.i0 i0Var;
        qo1.f0 f0Var = this.f365455d;
        synchronized (f0Var.f365484j) {
            n0Var = com.tencent.wechat.aff.affroam.n0.AFFROAM_TASK_STATE_STOPPED;
            i0Var = qo1.i0.f365502f;
            f0Var.g(n0Var, i0Var);
            f0Var.f365486l = i0Var;
            f0Var.r(n0Var);
        }
        com.tencent.mm.plugin.backup.roambackup.r0.f92684a.o(this.f365455d, n0Var, i0Var);
    }
}
