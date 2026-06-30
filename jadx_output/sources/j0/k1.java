package j0;

/* loaded from: classes14.dex */
public final class k1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k0.y0 f296397d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f296398e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f296399f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(k0.y0 y0Var, boolean z17, int i17) {
        super(2);
        this.f296397d = y0Var;
        this.f296398e = z17;
        this.f296399f = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f296399f | 1;
        j0.p1.d(this.f296397d, this.f296398e, (n0.o) obj, i17);
        return jz5.f0.f302826a;
    }
}
