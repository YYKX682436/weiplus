package w0;

/* loaded from: classes14.dex */
public final class p implements w0.h {

    /* renamed from: d, reason: collision with root package name */
    public static final w0.x f441855d = w0.b0.a(w0.i.f441839d, w0.j.f441840d);

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f441856a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f441857b;

    /* renamed from: c, reason: collision with root package name */
    public w0.s f441858c;

    public p(java.util.Map savedStates) {
        kotlin.jvm.internal.o.g(savedStates, "savedStates");
        this.f441856a = savedStates;
        this.f441857b = new java.util.LinkedHashMap();
    }

    public void a(java.lang.Object key, yz5.p content, n0.o oVar, int i17) {
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(content, "content");
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(-111644091);
        y0Var.U(-1530021272);
        y0Var.W(207, key);
        y0Var.U(1516495192);
        y0Var.U(-3687241);
        java.lang.Object y17 = y0Var.y();
        if (y17 == n0.n.f333620a) {
            w0.s sVar = this.f441858c;
            if (!(sVar == null ? true : sVar.b(key))) {
                throw new java.lang.IllegalArgumentException(("Type of the key " + key + " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
            }
            y17 = new w0.l(this, key);
            y0Var.g0(y17);
        }
        y0Var.o(false);
        w0.l lVar = (w0.l) y17;
        n0.n1.a(new n0.i3[]{w0.w.f441867a.b(lVar.f441844c)}, content, y0Var, (i17 & 112) | 8);
        n0.d2.c(jz5.f0.f302826a, new w0.n(this, key, lVar), y0Var, 0);
        y0Var.o(false);
        if (y0Var.f333784y && y0Var.E.f333576h == y0Var.f333785z) {
            y0Var.f333785z = -1;
            y0Var.f333784y = false;
        }
        y0Var.o(false);
        y0Var.o(false);
        n0.f4 q17 = y0Var.q();
        if (q17 == null) {
            return;
        }
        ((n0.l3) q17).f333608d = new w0.o(this, key, content, i17);
    }
}
