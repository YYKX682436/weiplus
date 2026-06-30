package ze5;

/* loaded from: classes9.dex */
public class s6 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f472190a;

    public s6(ze5.t6 t6Var, com.tencent.mm.storage.f9 f9Var) {
        this.f472190a = f9Var;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        com.tencent.mm.storage.f9 f9Var = this.f472190a;
        if (com.tencent.mm.storage.z3.N4(f9Var.Q0())) {
            return;
        }
        el0.i.a(false, f9Var.I0(), f9Var.Q0(), ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).mj(f9Var, f9Var.z0(), true));
    }
}
