package en5;

/* loaded from: classes14.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z0.t f255419d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f255420e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f255421f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f255422g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f255423h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(z0.t tVar, int i17, java.util.ArrayList arrayList, yz5.l lVar, int i18) {
        super(2);
        this.f255419d = tVar;
        this.f255420e = i17;
        this.f255421f = arrayList;
        this.f255422g = lVar;
        this.f255423h = i18;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        en5.l.a(this.f255419d, this.f255420e, this.f255421f, this.f255422g, (n0.o) obj, this.f255423h | 1);
        return jz5.f0.f302826a;
    }
}
