package j0;

/* loaded from: classes14.dex */
public final class j1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z0.t f296373d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k0.y0 f296374e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.p f296375f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f296376g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(z0.t tVar, k0.y0 y0Var, yz5.p pVar, int i17) {
        super(2);
        this.f296373d = tVar;
        this.f296374e = y0Var;
        this.f296375f = pVar;
        this.f296376g = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f296376g | 1;
        k0.y0 y0Var = this.f296374e;
        yz5.p pVar = this.f296375f;
        j0.p1.b(this.f296373d, y0Var, pVar, (n0.o) obj, i17);
        return jz5.f0.f302826a;
    }
}
