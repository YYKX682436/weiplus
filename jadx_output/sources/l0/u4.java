package l0;

/* loaded from: classes14.dex */
public final class u4 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public static final l0.u4 f314548d = new l0.u4();

    public u4() {
        super(3);
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        z.d2 animateFloat = (z.d2) obj;
        ((java.lang.Number) obj3).intValue();
        kotlin.jvm.internal.o.g(animateFloat, "$this$animateFloat");
        n0.y0 y0Var = (n0.y0) ((n0.o) obj2);
        y0Var.U(-1079955085);
        l0.l0 l0Var = l0.l0.Focused;
        l0.l0 l0Var2 = l0.l0.UnfocusedEmpty;
        z.e2 e2Var = (z.e2) animateFloat;
        boolean a17 = e2Var.a(l0Var, l0Var2);
        z.i0 i0Var = z.i0.f468696a;
        java.lang.Object d17 = a17 ? z.q.d(67, 0, i0Var, 2, null) : (e2Var.a(l0Var2, l0Var) || e2Var.a(l0.l0.UnfocusedNotEmpty, l0Var2)) ? new z.v2(83, 67, i0Var) : z.q.c(0.0f, 0.0f, null, 7, null);
        y0Var.o(false);
        return d17;
    }
}
