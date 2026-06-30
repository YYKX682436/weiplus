package qo1;

/* loaded from: classes5.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qo1.f0 f365521d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qo1.i0 f365522e;

    public j(qo1.f0 f0Var, qo1.i0 i0Var) {
        this.f365521d = f0Var;
        this.f365522e = i0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.wechat.aff.affroam.n0 n0Var;
        qo1.f0 f0Var = this.f365521d;
        java.lang.Object obj = f0Var.f365484j;
        qo1.i0 i0Var = this.f365522e;
        synchronized (obj) {
            n0Var = com.tencent.wechat.aff.affroam.n0.AFFROAM_TASK_STATE_ERROR;
            f0Var.g(n0Var, i0Var);
            f0Var.r(n0Var);
            kotlin.jvm.internal.o.g(i0Var, "<set-?>");
            f0Var.f365486l = i0Var;
        }
        com.tencent.mm.plugin.backup.roambackup.r0.f92684a.o(this.f365521d, n0Var, this.f365522e);
    }
}
