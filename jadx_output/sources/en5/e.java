package en5;

/* loaded from: classes14.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h1.c f255380d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z0.t f255381e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f255382f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f255383g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f255384h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h1.c cVar, z0.t tVar, java.lang.String str, int i17, int i18) {
        super(2);
        this.f255380d = cVar;
        this.f255381e = tVar;
        this.f255382f = str;
        this.f255383g = i17;
        this.f255384h = i18;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        en5.g.a(this.f255380d, this.f255381e, this.f255382f, (n0.o) obj, this.f255383g | 1, this.f255384h);
        return jz5.f0.f302826a;
    }
}
