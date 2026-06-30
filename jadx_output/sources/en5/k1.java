package en5;

/* loaded from: classes14.dex */
public final class k1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ en5.d f255450d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ en5.d f255451e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f255452f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f255453g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(en5.d dVar, en5.d dVar2, yz5.l lVar, int i17) {
        super(2);
        this.f255450d = dVar;
        this.f255451e = dVar2;
        this.f255452f = lVar;
        this.f255453g = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f255453g | 1;
        en5.d dVar = this.f255451e;
        yz5.l lVar = this.f255452f;
        en5.p1.a(this.f255450d, dVar, lVar, (n0.o) obj, i17);
        return jz5.f0.f302826a;
    }
}
