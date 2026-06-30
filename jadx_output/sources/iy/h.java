package iy;

/* loaded from: classes14.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z0.t f295691d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f295692e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f295693f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f295694g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(z0.t tVar, yz5.a aVar, yz5.a aVar2, int i17) {
        super(2);
        this.f295691d = tVar;
        this.f295692e = aVar;
        this.f295693f = aVar2;
        this.f295694g = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f295694g | 1;
        yz5.a aVar = this.f295692e;
        yz5.a aVar2 = this.f295693f;
        iy.n.b(this.f295691d, aVar, aVar2, (n0.o) obj, i17);
        return jz5.f0.f302826a;
    }
}
