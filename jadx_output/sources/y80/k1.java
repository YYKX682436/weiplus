package y80;

/* loaded from: classes2.dex */
public final class k1 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z80.s0 f459873d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y80.n1 f459874e;

    public k1(z80.s0 s0Var, y80.n1 n1Var) {
        this.f459873d = s0Var;
        this.f459874e = n1Var;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        z80.s0 s0Var = this.f459873d;
        java.util.Iterator it = s0Var.f470670b.iterator();
        while (it.hasNext()) {
            y80.n1.wi(this.f459874e, g4Var, (z80.v0) it.next(), s0Var);
        }
    }
}
