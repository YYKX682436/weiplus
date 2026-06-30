package ty0;

/* loaded from: classes14.dex */
public final class g1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f422839d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ty0.i1 f422840e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f422841f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f422842g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(java.lang.String str, ty0.i1 i1Var, int i17, int i18) {
        super(2);
        this.f422839d = str;
        this.f422840e = i1Var;
        this.f422841f = i17;
        this.f422842g = i18;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f422841f | 1;
        ty0.h1.a(this.f422839d, this.f422840e, (n0.o) obj, i17, this.f422842g);
        return jz5.f0.f302826a;
    }
}
