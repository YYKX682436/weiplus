package q85;

/* loaded from: classes14.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z0.t f360811d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q85.g f360812e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f360813f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f360814g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(z0.t tVar, q85.g gVar, int i17, int i18) {
        super(2);
        this.f360811d = tVar;
        this.f360812e = gVar;
        this.f360813f = i17;
        this.f360814g = i18;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f360813f | 1;
        q85.k.a(this.f360811d, this.f360812e, (n0.o) obj, i17, this.f360814g);
        return jz5.f0.f302826a;
    }
}
