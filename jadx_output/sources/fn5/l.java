package fn5;

/* loaded from: classes14.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z0.t f264693d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fn5.n0 f264694e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f264695f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f264696g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(z0.t tVar, fn5.n0 n0Var, float f17, int i17) {
        super(2);
        this.f264693d = tVar;
        this.f264694e = n0Var;
        this.f264695f = f17;
        this.f264696g = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f264696g | 1;
        fn5.n0 n0Var = this.f264694e;
        float f17 = this.f264695f;
        fn5.p.f(this.f264693d, n0Var, f17, (n0.o) obj, i17);
        return jz5.f0.f302826a;
    }
}
