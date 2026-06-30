package l0;

/* loaded from: classes14.dex */
public final class r3 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f314496d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f314497e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c0.n f314498f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l0.m3 f314499g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f314500h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f314501i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(boolean z17, boolean z18, c0.n nVar, l0.m3 m3Var, float f17, float f18) {
        super(3);
        this.f314496d = z17;
        this.f314497e = z18;
        this.f314498f = nVar;
        this.f314499g = m3Var;
        this.f314500h = f17;
        this.f314501i = f18;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        z0.t composed = (z0.t) obj;
        ((java.lang.Number) obj3).intValue();
        kotlin.jvm.internal.o.g(composed, "$this$composed");
        n0.y0 y0Var = (n0.y0) ((n0.o) obj2);
        y0Var.U(1398930845);
        n0.e5 a17 = l0.t3.a(this.f314496d, this.f314497e, this.f314498f, this.f314499g, this.f314500h, this.f314501i, y0Var, 0);
        int i17 = z0.t.f468922q1;
        z0.p pVar = z0.p.f468921d;
        a0.k indicatorBorder = (a0.k) a17.getValue();
        float f17 = l0.m4.f314380a;
        kotlin.jvm.internal.o.g(indicatorBorder, "indicatorBorder");
        z0.t c17 = b1.j.c(pVar, new l0.l4(indicatorBorder.f192a, indicatorBorder));
        y0Var.o(false);
        return c17;
    }
}
