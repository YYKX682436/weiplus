package z;

/* loaded from: classes14.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    public final o0.i f468863a = new o0.i(new z.q0[16], 0);

    /* renamed from: b, reason: collision with root package name */
    public final n0.v2 f468864b = n0.s4.c(java.lang.Boolean.FALSE, null, 2, null);

    /* renamed from: c, reason: collision with root package name */
    public long f468865c = Long.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public final n0.v2 f468866d = n0.s4.c(java.lang.Boolean.TRUE, null, 2, null);

    public final void a(n0.o oVar, int i17) {
        java.lang.Object obj = n0.e1.f333492a;
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(-318043801);
        if (((java.lang.Boolean) ((n0.q4) this.f468866d).getValue()).booleanValue() || ((java.lang.Boolean) ((n0.q4) this.f468864b).getValue()).booleanValue()) {
            n0.d2.f(this, new z.u0(this, null), y0Var, 8);
        }
        n0.f4 q17 = y0Var.q();
        if (q17 == null) {
            return;
        }
        ((n0.l3) q17).f333608d = new z.v0(this, i17);
    }
}
