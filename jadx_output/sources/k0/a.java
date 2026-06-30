package k0;

/* loaded from: classes14.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z0.t f302857d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f302858e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l2.e f302859f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f302860g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f302861h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(z0.t tVar, boolean z17, l2.e eVar, boolean z18, int i17) {
        super(2);
        this.f302857d = tVar;
        this.f302858e = z17;
        this.f302859f = eVar;
        this.f302860g = z18;
        this.f302861h = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        k0.i.a(this.f302857d, this.f302858e, this.f302859f, this.f302860g, (n0.o) obj, this.f302861h | 1);
        return jz5.f0.f302826a;
    }
}
