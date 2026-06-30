package l0;

/* loaded from: classes14.dex */
public final class i0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h1.c f314242d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f314243e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z0.t f314244f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f314245g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f314246h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f314247i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(h1.c cVar, java.lang.String str, z0.t tVar, long j17, int i17, int i18) {
        super(2);
        this.f314242d = cVar;
        this.f314243e = str;
        this.f314244f = tVar;
        this.f314245g = j17;
        this.f314246h = i17;
        this.f314247i = i18;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        l0.k0.a(this.f314242d, this.f314243e, this.f314244f, this.f314245g, (n0.o) obj, this.f314246h | 1, this.f314247i);
        return jz5.f0.f302826a;
    }
}
