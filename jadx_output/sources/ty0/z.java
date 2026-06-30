package ty0;

/* loaded from: classes14.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f423037d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f423038e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z0.t f423039f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f423040g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f423041h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(boolean z17, yz5.a aVar, z0.t tVar, int i17, int i18) {
        super(2);
        this.f423037d = z17;
        this.f423038e = aVar;
        this.f423039f = tVar;
        this.f423040g = i17;
        this.f423041h = i18;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        ty0.z0.b(this.f423037d, this.f423038e, this.f423039f, (n0.o) obj, this.f423040g | 1, this.f423041h);
        return jz5.f0.f302826a;
    }
}
