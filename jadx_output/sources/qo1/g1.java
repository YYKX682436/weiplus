package qo1;

/* loaded from: classes5.dex */
public final class g1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qo1.g0 f365499d;

    public g1(qo1.g0 g0Var) {
        this.f365499d = g0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qo1.g0 g0Var = this.f365499d;
        g0Var.d();
        com.tencent.mm.plugin.backup.roambackup.r0.f92684a.o(g0Var, com.tencent.wechat.aff.affroam.n0.AFFROAM_TASK_STATE_INITED, qo1.i0.f365502f);
    }
}
