package d0;

/* loaded from: classes14.dex */
public final class b2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d0.c2 f225079d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s1.o1 f225080e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s1.x0 f225081f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(d0.c2 c2Var, s1.o1 o1Var, s1.x0 x0Var) {
        super(1);
        this.f225079d = c2Var;
        this.f225080e = o1Var;
        this.f225081f = x0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        s1.n1 layout = (s1.n1) obj;
        kotlin.jvm.internal.o.g(layout, "$this$layout");
        d0.c2 c2Var = this.f225079d;
        boolean z17 = c2Var.f225093h;
        float f17 = c2Var.f225090e;
        float f18 = c2Var.f225089d;
        s1.x0 x0Var = this.f225081f;
        if (z17) {
            s1.n1.e(layout, this.f225080e, x0Var.G(f18), x0Var.G(f17), 0.0f, 4, null);
        } else {
            s1.n1.b(layout, this.f225080e, x0Var.G(f18), x0Var.G(f17), 0.0f, 4, null);
        }
        return jz5.f0.f302826a;
    }
}
