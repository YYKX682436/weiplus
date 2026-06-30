package l0;

/* loaded from: classes14.dex */
public final class l1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z0.t f314349d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f314350e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f314351f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f314352g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f314353h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(z0.t tVar, long j17, float f17, int i17, int i18) {
        super(2);
        this.f314349d = tVar;
        this.f314350e = j17;
        this.f314351f = f17;
        this.f314352g = i17;
        this.f314353h = i18;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        l0.o1.a(this.f314349d, this.f314350e, this.f314351f, (n0.o) obj, this.f314352g | 1, this.f314353h);
        return jz5.f0.f302826a;
    }
}
