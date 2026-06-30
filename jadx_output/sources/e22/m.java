package e22;

/* loaded from: classes14.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f246682d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f246683e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z0.t f246684f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f246685g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f246686h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(boolean z17, boolean z18, z0.t tVar, int i17, int i18) {
        super(2);
        this.f246682d = z17;
        this.f246683e = z18;
        this.f246684f = tVar;
        this.f246685g = i17;
        this.f246686h = i18;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        e22.a1.g(this.f246682d, this.f246683e, this.f246684f, (n0.o) obj, this.f246685g | 1, this.f246686h);
        return jz5.f0.f302826a;
    }
}
