package l0;

/* loaded from: classes14.dex */
public final class l2 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f314354d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l0.a3 f314355e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b0.y1 f314356f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f314357g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c0.o f314358h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f314359i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ l0.p1 f314360m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ yz5.p f314361n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f314362o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(java.util.Map map, l0.a3 a3Var, b0.y1 y1Var, boolean z17, c0.o oVar, boolean z18, l0.p1 p1Var, yz5.p pVar, float f17) {
        super(3);
        this.f314354d = map;
        this.f314355e = a3Var;
        this.f314356f = y1Var;
        this.f314357g = z17;
        this.f314358h = oVar;
        this.f314359i = z18;
        this.f314360m = p1Var;
        this.f314361n = pVar;
        this.f314362o = f17;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        z0.t composed = (z0.t) obj;
        ((java.lang.Number) obj3).intValue();
        kotlin.jvm.internal.o.g(composed, "$this$composed");
        n0.y0 y0Var = (n0.y0) ((n0.o) obj2);
        y0Var.U(43594985);
        java.util.Map map = this.f314354d;
        if (!(!map.isEmpty())) {
            throw new java.lang.IllegalArgumentException("You must have at least one anchor.".toString());
        }
        if (!(kz5.n0.Q(map.values()).size() == map.size())) {
            throw new java.lang.IllegalArgumentException("You cannot have two anchors mapped to the same state.".toString());
        }
        p2.f fVar = (p2.f) y0Var.i(androidx.compose.ui.platform.m2.f10646e);
        l0.a3 a3Var = this.f314355e;
        a3Var.getClass();
        if (((java.util.Map) ((n0.q4) a3Var.f314036i).getValue()).isEmpty()) {
            java.lang.Float a17 = l0.m2.a(map, a3Var.b());
            if (a17 == null) {
                throw new java.lang.IllegalArgumentException("The initial value must have an associated anchor.".toString());
            }
            ((n0.q4) a3Var.f314032e).setValue(a17);
            ((n0.q4) a3Var.f314034g).setValue(a17);
        }
        java.util.Map map2 = this.f314354d;
        l0.a3 a3Var2 = this.f314355e;
        n0.d2.e(map2, a3Var2, new l0.i2(a3Var2, map2, this.f314360m, fVar, this.f314361n, this.f314362o, null), y0Var, 8);
        z0.p pVar = z0.p.f468921d;
        boolean booleanValue = ((java.lang.Boolean) ((n0.q4) a3Var.f314031d).getValue()).booleanValue();
        b0.n1 state = a3Var.f314043p;
        boolean z17 = this.f314357g;
        c0.o oVar = this.f314358h;
        l0.k2 k2Var = new l0.k2(a3Var, null);
        boolean z18 = this.f314359i;
        b0.y0 y0Var2 = new b0.y0(null);
        kotlin.jvm.internal.o.g(state, "state");
        b0.y1 orientation = this.f314356f;
        kotlin.jvm.internal.o.g(orientation, "orientation");
        z0.t c17 = b0.m1.c(pVar, new b0.z0(state), b0.a1.f16191d, orientation, z17, oVar, new b0.b1(booleanValue), y0Var2, k2Var, z18);
        y0Var.o(false);
        return c17;
    }
}
