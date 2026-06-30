package j0;

/* loaded from: classes13.dex */
public final class d0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k0.y0 f296253d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f296254e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f296255f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(k0.y0 y0Var, yz5.p pVar, int i17) {
        super(2);
        this.f296253d = y0Var;
        this.f296254e = pVar;
        this.f296255f = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f296255f | 1;
        j0.e0.a(this.f296253d, this.f296254e, (n0.o) obj, i17);
        return jz5.f0.f302826a;
    }
}
