package j0;

/* loaded from: classes14.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f296212d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z0.t f296213e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.p f296214f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f296215g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(long j17, z0.t tVar, yz5.p pVar, int i17) {
        super(2);
        this.f296212d = j17;
        this.f296213e = tVar;
        this.f296214f = pVar;
        this.f296215g = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        j0.g.a(this.f296212d, this.f296213e, this.f296214f, (n0.o) obj, this.f296215g | 1);
        return jz5.f0.f302826a;
    }
}
