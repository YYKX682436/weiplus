package rv0;

/* loaded from: classes5.dex */
public final class j0 implements fy0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f400053a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f400054b;

    public j0(rv0.n1 n1Var, ex0.a0 a0Var) {
        this.f400053a = n1Var;
        this.f400054b = a0Var;
    }

    @Override // fy0.b
    public void a(double d17, fy0.q source) {
        kotlin.jvm.internal.o.g(source, "source");
        source.toString();
        int ordinal = source.ordinal();
        rv0.n1 n1Var = this.f400053a;
        if (ordinal == 1 || ordinal == 2) {
            kotlinx.coroutines.l.d(n1Var.getMainScope(), null, null, new rv0.h0(this.f400053a, d17, this.f400054b, null), 3, null);
        } else if (ordinal == 3) {
            kotlinx.coroutines.l.d(n1Var.getMainScope(), null, null, new rv0.i0(d17, this.f400054b, this.f400053a, null), 3, null);
        }
        rv0.j jVar = (rv0.j) n1Var.f69240i;
        if (jVar != null) {
            jVar.B((int) n1Var.r7().getButtonScroll());
        }
    }
}
