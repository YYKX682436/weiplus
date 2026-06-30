package pe3;

/* loaded from: classes5.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pe3.g0 f353690d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ se3.f f353691e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f353692f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(pe3.g0 g0Var, se3.f fVar, int i17) {
        super(2);
        this.f353690d = g0Var;
        this.f353691e = fVar;
        this.f353692f = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f353692f | 1;
        pe3.g0.P6(this.f353690d, this.f353691e, (n0.o) obj, i17);
        return jz5.f0.f302826a;
    }
}
