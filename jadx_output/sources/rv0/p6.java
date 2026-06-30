package rv0;

/* loaded from: classes5.dex */
public final class p6 implements fy0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rv0.z6 f400187a;

    public p6(rv0.z6 z6Var) {
        this.f400187a = z6Var;
    }

    @Override // fy0.a
    public void a(int i17) {
        if (i17 != 0) {
            if (i17 != 1) {
                return;
            }
            rv0.z6 z6Var = this.f400187a;
            pf5.e.launchUI$default(z6Var, null, null, new rv0.o6(z6Var, null), 3, null);
            return;
        }
        rv0.z6 z6Var2 = this.f400187a;
        rv0.z6.k7(z6Var2);
        rv0.o5 o5Var = (rv0.o5) z6Var2.f69240i;
        if (o5Var != null) {
            o5Var.J();
        }
        rv0.z6 z6Var3 = this.f400187a;
        z6Var3.A = pf5.e.launchUI$default(z6Var3, null, null, new rv0.n6(z6Var3, null), 3, null);
    }
}
