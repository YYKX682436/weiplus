package gx0;

/* loaded from: classes5.dex */
public final class d2 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ow0.g f276311d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.u2 f276312e;

    public d2(ow0.g gVar, gx0.u2 u2Var) {
        this.f276311d = gVar;
        this.f276312e = u2Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        ex0.r n17;
        if (this.f276311d.getCurrentPage() == sw0.f.f413432g) {
            gx0.u2 u2Var = this.f276312e;
            if (!u2Var.R7().m7()) {
                ((du0.o) ((jz5.n) u2Var.f349281o).getValue()).U6(false);
                return;
            }
            ex0.a0 a0Var = u2Var.S7().f276642r;
            if (a0Var == null || (n17 = a0Var.n()) == null || gx0.c2.f276276a[n17.f257169c.ordinal()] != 1) {
                return;
            }
            u2Var.W7(n17.f257168b);
        }
    }
}
