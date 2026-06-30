package e22;

/* loaded from: classes10.dex */
public final class e0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e22.d1 f246642d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f246643e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f246644f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f246645g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f246646h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f246647i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(e22.d1 d1Var, yz5.l lVar, yz5.a aVar, yz5.l lVar2, int i17, int i18) {
        super(2);
        this.f246642d = d1Var;
        this.f246643e = lVar;
        this.f246644f = aVar;
        this.f246645g = lVar2;
        this.f246646h = i17;
        this.f246647i = i18;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        e22.a1.d(this.f246642d, this.f246643e, this.f246644f, this.f246645g, (n0.o) obj, this.f246646h | 1, this.f246647i);
        return jz5.f0.f302826a;
    }
}
