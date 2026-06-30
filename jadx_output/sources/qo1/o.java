package qo1;

/* loaded from: classes5.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qo1.f0 f365533d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.aff.affroam.n0 f365534e;

    public o(qo1.f0 f0Var, com.tencent.wechat.aff.affroam.n0 n0Var) {
        this.f365533d = f0Var;
        this.f365534e = n0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qo1.i0 i0Var;
        qo1.f0 f0Var = this.f365533d;
        java.lang.Object obj = f0Var.f365484j;
        com.tencent.wechat.aff.affroam.n0 n0Var = this.f365534e;
        synchronized (obj) {
            kotlin.jvm.internal.o.d(n0Var);
            i0Var = qo1.i0.f365502f;
            f0Var.g(n0Var, i0Var);
            f0Var.r(n0Var);
            f0Var.f365486l = i0Var;
        }
        com.tencent.mm.plugin.backup.roambackup.r0 r0Var = com.tencent.mm.plugin.backup.roambackup.r0.f92684a;
        qo1.f0 f0Var2 = this.f365533d;
        com.tencent.wechat.aff.affroam.n0 state = this.f365534e;
        kotlin.jvm.internal.o.f(state, "$state");
        r0Var.o(f0Var2, state, i0Var);
    }
}
