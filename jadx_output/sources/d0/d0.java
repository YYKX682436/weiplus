package d0;

/* loaded from: classes14.dex */
public final class d0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z0.t f225095d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z0.d f225096e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f225097f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.q f225098g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f225099h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f225100i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(z0.t tVar, z0.d dVar, boolean z17, yz5.q qVar, int i17, int i18) {
        super(2);
        this.f225095d = tVar;
        this.f225096e = dVar;
        this.f225097f = z17;
        this.f225098g = qVar;
        this.f225099h = i17;
        this.f225100i = i18;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        d0.e0.a(this.f225095d, this.f225096e, this.f225097f, this.f225098g, (n0.o) obj, this.f225099h | 1, this.f225100i);
        return jz5.f0.f302826a;
    }
}
