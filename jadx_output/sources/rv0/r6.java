package rv0;

/* loaded from: classes5.dex */
public final class r6 implements fy0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rv0.z6 f400224a;

    public r6(rv0.z6 z6Var) {
        this.f400224a = z6Var;
    }

    @Override // fy0.b
    public void a(double d17, fy0.q source) {
        kotlin.jvm.internal.o.g(source, "source");
        rv0.z6 z6Var = this.f400224a;
        z6Var.o7().invalidate();
        if (source == fy0.q.f267220d) {
            return;
        }
        boolean z17 = source == fy0.q.f267222f;
        rv0.z6 z6Var2 = this.f400224a;
        pf5.e.launchUI$default(z6Var2, null, null, new rv0.q6(z6Var2, z17, null), 3, null);
        rv0.z6.k7(z6Var);
        rv0.o5 o5Var = (rv0.o5) z6Var.f69240i;
        if (o5Var != null) {
            o5Var.J();
        }
    }
}
