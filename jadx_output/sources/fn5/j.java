package fn5;

/* loaded from: classes14.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z0.t f264680d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f264681e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fn5.n0 f264682f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f264683g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f264684h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(z0.t tVar, yz5.l lVar, fn5.n0 n0Var, yz5.l lVar2, int i17) {
        super(2);
        this.f264680d = tVar;
        this.f264681e = lVar;
        this.f264682f = n0Var;
        this.f264683g = lVar2;
        this.f264684h = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        fn5.p.d(this.f264680d, this.f264681e, this.f264682f, this.f264683g, (n0.o) obj, this.f264684h | 1);
        return jz5.f0.f302826a;
    }
}
