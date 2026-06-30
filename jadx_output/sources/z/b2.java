package z;

/* loaded from: classes14.dex */
public final class b2 implements n0.e5 {

    /* renamed from: d, reason: collision with root package name */
    public final z.f2 f468595d;

    /* renamed from: e, reason: collision with root package name */
    public yz5.l f468596e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.l f468597f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ z.c2 f468598g;

    public b2(z.c2 c2Var, z.f2 animation, yz5.l transitionSpec, yz5.l targetValueByState) {
        kotlin.jvm.internal.o.g(animation, "animation");
        kotlin.jvm.internal.o.g(transitionSpec, "transitionSpec");
        kotlin.jvm.internal.o.g(targetValueByState, "targetValueByState");
        this.f468598g = c2Var;
        this.f468595d = animation;
        this.f468596e = transitionSpec;
        this.f468597f = targetValueByState;
    }

    public final void b(z.d2 segment) {
        kotlin.jvm.internal.o.g(segment, "segment");
        z.e2 e2Var = (z.e2) segment;
        java.lang.Object invoke = this.f468597f.invoke(e2Var.f468645b);
        boolean e17 = this.f468598g.f468619d.e();
        z.f2 f2Var = this.f468595d;
        if (e17) {
            f2Var.d(this.f468597f.invoke(e2Var.f468644a), invoke, (z.k0) this.f468596e.invoke(segment));
        } else {
            f2Var.e(invoke, (z.k0) this.f468596e.invoke(segment));
        }
    }

    @Override // n0.e5
    public java.lang.Object getValue() {
        b(this.f468598g.f468619d.c());
        return this.f468595d.getValue();
    }
}
