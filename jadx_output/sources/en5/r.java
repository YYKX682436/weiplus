package en5;

/* loaded from: classes5.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f255491d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fn5.n0 f255492e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f255493f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(yz5.l lVar, fn5.n0 n0Var, int i17) {
        super(2);
        this.f255491d = lVar;
        this.f255492e = n0Var;
        this.f255493f = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f255493f | 1;
        en5.w.b(this.f255491d, this.f255492e, (n0.o) obj, i17);
        return jz5.f0.f302826a;
    }
}
