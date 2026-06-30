package k0;

/* loaded from: classes14.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f302917d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l2.e f302918e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f302919f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(boolean z17, l2.e eVar, boolean z18) {
        super(3);
        this.f302917d = z17;
        this.f302918e = eVar;
        this.f302919f = z18;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        z0.t composed = (z0.t) obj;
        ((java.lang.Number) obj3).intValue();
        kotlin.jvm.internal.o.g(composed, "$this$composed");
        n0.y0 y0Var = (n0.y0) ((n0.o) obj2);
        y0Var.U(-1538687176);
        long j17 = ((k0.j1) y0Var.i(k0.l1.f302944a)).f302934a;
        int i17 = z0.t.f468922q1;
        z0.t k17 = composed.k(b1.j.b(z0.p.f468921d, new k0.g(j17, this.f302917d, this.f302918e, this.f302919f)));
        y0Var.o(false);
        return k17;
    }
}
