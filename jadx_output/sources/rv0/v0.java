package rv0;

/* loaded from: classes5.dex */
public final class v0 implements fy0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f400285a;

    public v0(rv0.n1 n1Var) {
        this.f400285a = n1Var;
    }

    @Override // fy0.a
    public void a(int i17) {
        rv0.n1 n1Var = this.f400285a;
        if (i17 == 0) {
            kotlinx.coroutines.l.d(n1Var.getMainScope(), null, null, new rv0.t0(n1Var, null), 3, null);
        } else {
            if (i17 != 1) {
                return;
            }
            kotlinx.coroutines.l.d(n1Var.getMainScope(), null, null, new rv0.u0(n1Var, null), 3, null);
        }
    }
}
