package k0;

/* loaded from: classes14.dex */
public final class n0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z0.t f302951d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f302952e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f302953f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f302954g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(z0.t tVar, yz5.p pVar, int i17, int i18) {
        super(2);
        this.f302951d = tVar;
        this.f302952e = pVar;
        this.f302953f = i17;
        this.f302954g = i18;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f302953f | 1;
        k0.o0.a(this.f302951d, this.f302952e, (n0.o) obj, i17, this.f302954g);
        return jz5.f0.f302826a;
    }
}
