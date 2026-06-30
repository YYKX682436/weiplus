package j0;

/* loaded from: classes14.dex */
public final class g4 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j0.c5 f296301d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k0.y0 f296302e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g2.e0 f296303f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f296304g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f296305h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ g2.v f296306i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ j0.h5 f296307m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ yz5.l f296308n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4(j0.c5 c5Var, k0.y0 y0Var, g2.e0 e0Var, boolean z17, boolean z18, g2.v vVar, j0.h5 h5Var, yz5.l lVar) {
        super(3);
        this.f296301d = c5Var;
        this.f296302e = y0Var;
        this.f296303f = e0Var;
        this.f296304g = z17;
        this.f296305h = z18;
        this.f296306i = vVar;
        this.f296307m = h5Var;
        this.f296308n = lVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        z0.t composed = (z0.t) obj;
        ((java.lang.Number) obj3).intValue();
        kotlin.jvm.internal.o.g(composed, "$this$composed");
        n0.y0 y0Var = (n0.y0) ((n0.o) obj2);
        y0Var.U(58482146);
        y0Var.U(-492369756);
        java.lang.Object y17 = y0Var.y();
        if (y17 == n0.n.f333620a) {
            y17 = new k0.i1();
            y0Var.g0(y17);
        }
        y0Var.o(false);
        j0.e4 e4Var = new j0.e4(this.f296301d, this.f296302e, this.f296303f, this.f296304g, this.f296305h, (k0.i1) y17, this.f296306i, this.f296307m, null, this.f296308n, 256, null);
        z0.p pVar = z0.p.f468921d;
        j0.f4 f4Var = new j0.f4(e4Var);
        t1.f fVar = n1.f.f334036a;
        z0.t a17 = androidx.compose.ui.platform.f3.a(pVar, androidx.compose.ui.platform.e3.f10553d, new n1.d(f4Var, null));
        y0Var.o(false);
        return a17;
    }
}
