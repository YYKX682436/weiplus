package r2;

/* loaded from: classes7.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f368695d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z0.t f368696e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f368697f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f368698g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f368699h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(yz5.l lVar, z0.t tVar, yz5.l lVar2, int i17, int i18) {
        super(2);
        this.f368695d = lVar;
        this.f368696e = tVar;
        this.f368697f = lVar2;
        this.f368698g = i17;
        this.f368699h = i18;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        r2.f0.a(this.f368695d, this.f368696e, this.f368697f, (n0.o) obj, this.f368698g | 1, this.f368699h);
        return jz5.f0.f302826a;
    }
}
