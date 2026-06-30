package yv1;

/* loaded from: classes12.dex */
public final class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bw1.f f466012d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yv1.i0 f466013e;

    public d0(com.tencent.wcdb.support.CancellationSignal cancellationSignal, bw1.f fVar, yv1.i0 i0Var) {
        this.f466012d = fVar;
        this.f466013e = i0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yv1.i0 i0Var = this.f466013e;
        jz5.f0 f0Var = jz5.f0.f302826a;
        bw1.f fVar = this.f466012d;
        try {
            tg3.b.f419181a.b("msg_c2c_path_clean_for_manual_scan");
        } finally {
            fVar.a(f0Var);
            yv1.i0.e(i0Var, true, false, 2, null);
        }
    }
}
