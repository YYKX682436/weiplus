package l0;

/* loaded from: classes14.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z0.t f314683d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f314684e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f314685f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f314686g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f314687h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f314688i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(z0.t tVar, long j17, float f17, float f18, int i17, int i18) {
        super(2);
        this.f314683d = tVar;
        this.f314684e = j17;
        this.f314685f = f17;
        this.f314686g = f18;
        this.f314687h = i17;
        this.f314688i = i18;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        l0.a0.a(this.f314683d, this.f314684e, this.f314685f, this.f314686g, (n0.o) obj, this.f314687h | 1, this.f314688i);
        return jz5.f0.f302826a;
    }
}
