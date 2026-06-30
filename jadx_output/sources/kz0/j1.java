package kz0;

/* loaded from: classes5.dex */
public final class j1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f313756d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f313757e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.p f313758f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f313759g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(yz5.a aVar, yz5.a aVar2, yz5.p pVar, int i17) {
        super(2);
        this.f313756d = aVar;
        this.f313757e = aVar2;
        this.f313758f = pVar;
        this.f313759g = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f313759g | 1;
        yz5.a aVar = this.f313757e;
        yz5.p pVar = this.f313758f;
        kz0.k1.f(this.f313756d, aVar, pVar, (n0.o) obj, i17);
        return jz5.f0.f302826a;
    }
}
