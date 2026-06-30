package s1;

/* loaded from: classes14.dex */
public final class e2 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s1.k2 f402004d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z0.t f402005e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.p f402006f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f402007g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f402008h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(s1.k2 k2Var, z0.t tVar, yz5.p pVar, int i17, int i18) {
        super(2);
        this.f402004d = k2Var;
        this.f402005e = tVar;
        this.f402006f = pVar;
        this.f402007g = i17;
        this.f402008h = i18;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        s1.f2.a(this.f402004d, this.f402005e, this.f402006f, (n0.o) obj, this.f402007g | 1, this.f402008h);
        return jz5.f0.f302826a;
    }
}
