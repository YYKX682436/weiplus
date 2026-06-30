package ty0;

/* loaded from: classes14.dex */
public final class u0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.q f422990d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f422991e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ty0.b1 f422992f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f422993g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(yz5.q qVar, yz5.a aVar, ty0.b1 b1Var, int i17) {
        super(2);
        this.f422990d = qVar;
        this.f422991e = aVar;
        this.f422992f = b1Var;
        this.f422993g = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f422993g | 1;
        yz5.a aVar = this.f422991e;
        ty0.b1 b1Var = this.f422992f;
        ty0.z0.i(this.f422990d, aVar, b1Var, (n0.o) obj, i17);
        return jz5.f0.f302826a;
    }
}
