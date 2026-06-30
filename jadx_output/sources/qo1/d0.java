package qo1;

/* loaded from: classes5.dex */
public final class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qo1.f0 f365460d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.aff.affroam.n0 f365461e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qo1.i0 f365462f;

    public d0(qo1.f0 f0Var, com.tencent.wechat.aff.affroam.n0 n0Var, qo1.i0 i0Var) {
        this.f365460d = f0Var;
        this.f365461e = n0Var;
        this.f365462f = i0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qo1.f0 f0Var = this.f365460d;
        java.lang.Object obj = f0Var.f365484j;
        com.tencent.wechat.aff.affroam.n0 n0Var = this.f365461e;
        qo1.i0 i0Var = this.f365462f;
        synchronized (obj) {
            f0Var.g(n0Var, i0Var);
            kotlin.jvm.internal.o.g(i0Var, "<set-?>");
            f0Var.f365486l = i0Var;
            f0Var.r(n0Var);
        }
        com.tencent.mm.plugin.backup.roambackup.r0.f92684a.o(this.f365460d, this.f365461e, this.f365462f);
    }
}
