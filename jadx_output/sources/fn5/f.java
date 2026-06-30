package fn5;

/* loaded from: classes10.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fn5.n0 f264658d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f264659e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f264660f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f264661g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(fn5.n0 n0Var, yz5.l lVar, yz5.l lVar2, int i17) {
        super(2);
        this.f264658d = n0Var;
        this.f264659e = lVar;
        this.f264660f = lVar2;
        this.f264661g = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f264661g | 1;
        yz5.l lVar = this.f264659e;
        yz5.l lVar2 = this.f264660f;
        fn5.p.a(this.f264658d, lVar, lVar2, (n0.o) obj, i17);
        return jz5.f0.f302826a;
    }
}
