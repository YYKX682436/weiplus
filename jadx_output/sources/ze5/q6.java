package ze5;

/* loaded from: classes9.dex */
public class q6 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f472165a;

    public q6(ze5.r6 r6Var, com.tencent.mm.storage.f9 f9Var) {
        this.f472165a = f9Var;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        com.tencent.mm.storage.f9 f9Var = this.f472165a;
        if (com.tencent.mm.storage.z3.N4(f9Var.Q0())) {
            return;
        }
        el0.i.a(true, f9Var.I0(), f9Var.Q0(), f9Var.z0());
    }
}
