package y;

/* loaded from: classes14.dex */
public final class m0 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y.y0 f458397d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y.a1 f458398e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(y.y0 y0Var, y.a1 a1Var) {
        super(3);
        this.f458397d = y0Var;
        this.f458398e = a1Var;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        z.p1 p1Var;
        z.d2 animateFloat = (z.d2) obj;
        ((java.lang.Number) obj3).intValue();
        kotlin.jvm.internal.o.g(animateFloat, "$this$animateFloat");
        n0.y0 y0Var = (n0.y0) ((n0.o) obj2);
        y0Var.U(-53984035);
        y.g0 g0Var = y.g0.PreEnter;
        y.g0 g0Var2 = y.g0.Visible;
        z.e2 e2Var = (z.e2) animateFloat;
        if (e2Var.a(g0Var, g0Var2)) {
            ((y.z0) this.f458397d).f458486a.getClass();
            p1Var = y.x0.f458471c;
        } else if (e2Var.a(g0Var2, y.g0.PostExit)) {
            ((y.b1) this.f458398e).f458312a.getClass();
            p1Var = y.x0.f458471c;
        } else {
            p1Var = y.x0.f458471c;
        }
        y0Var.o(false);
        return p1Var;
    }
}
