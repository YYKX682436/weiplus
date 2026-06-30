package d0;

/* loaded from: classes14.dex */
public final class f2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s1.o1 f225114d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s1.x0 f225115e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d0.g2 f225116f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(s1.o1 o1Var, s1.x0 x0Var, d0.g2 g2Var) {
        super(1);
        this.f225114d = o1Var;
        this.f225115e = x0Var;
        this.f225116f = g2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        s1.n1 layout = (s1.n1) obj;
        kotlin.jvm.internal.o.g(layout, "$this$layout");
        s1.o1 o1Var = this.f225114d;
        d0.g2 g2Var = this.f225116f;
        d0.d2 d2Var = g2Var.f225122d;
        s1.x0 x0Var = this.f225115e;
        s1.n1.b(layout, o1Var, x0Var.G(((d0.e2) d2Var).a(x0Var.getLayoutDirection())), x0Var.G(((d0.e2) g2Var.f225122d).f225109b), 0.0f, 4, null);
        return jz5.f0.f302826a;
    }
}
