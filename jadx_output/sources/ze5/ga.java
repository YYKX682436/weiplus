package ze5;

/* loaded from: classes9.dex */
public class ga extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f471954a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f471955b;

    public ga(com.tencent.mm.storage.f9 f9Var, boolean z17) {
        this.f471954a = f9Var;
        this.f471955b = z17;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        if (com.tencent.mm.storage.z3.N4(this.f471954a.Q0())) {
            return;
        }
        boolean z18 = this.f471955b;
        long I0 = this.f471954a.I0();
        java.lang.String Q0 = this.f471954a.Q0();
        tg3.u0 u0Var = (tg3.u0) i95.n0.c(tg3.u0.class);
        com.tencent.mm.storage.f9 f9Var = this.f471954a;
        ((k90.b) u0Var).rj(f9Var, bm5.f0.f22571s, f9Var.z0(), false);
        el0.f fVar = el0.i.f253726g;
        if (fVar != null) {
            wl0.j jVar = (wl0.j) fVar;
            ((ku5.t0) ku5.t0.f312615d).r(new wl0.i(jVar, I0, z18, Q0), "KaraEvent");
        }
    }
}
