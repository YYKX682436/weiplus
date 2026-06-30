package fn5;

/* loaded from: classes14.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z0.t f264716d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f264717e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f264718f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fn5.n0 f264719g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f264720h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(z0.t tVar, yz5.l lVar, yz5.l lVar2, fn5.n0 n0Var, int i17) {
        super(2);
        this.f264716d = tVar;
        this.f264717e = lVar;
        this.f264718f = lVar2;
        this.f264719g = n0Var;
        this.f264720h = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        fn5.p.h(this.f264716d, this.f264717e, this.f264718f, this.f264719g, (n0.o) obj, this.f264720h | 1);
        return jz5.f0.f302826a;
    }
}
