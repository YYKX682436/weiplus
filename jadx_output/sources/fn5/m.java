package fn5;

/* loaded from: classes14.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z0.t f264708d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fn5.n0 f264709e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f264710f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f264711g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(z0.t tVar, fn5.n0 n0Var, yz5.l lVar, int i17) {
        super(2);
        this.f264708d = tVar;
        this.f264709e = n0Var;
        this.f264710f = lVar;
        this.f264711g = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f264711g | 1;
        fn5.n0 n0Var = this.f264709e;
        yz5.l lVar = this.f264710f;
        fn5.p.g(this.f264708d, n0Var, lVar, (n0.o) obj, i17);
        return jz5.f0.f302826a;
    }
}
