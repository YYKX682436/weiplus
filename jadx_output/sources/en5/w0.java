package en5;

/* loaded from: classes14.dex */
public final class w0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fn5.n0 f255522d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f255523e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f255524f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(fn5.n0 n0Var, yz5.a aVar, int i17) {
        super(2);
        this.f255522d = n0Var;
        this.f255523e = aVar;
        this.f255524f = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f255524f | 1;
        en5.i1.b(this.f255522d, this.f255523e, (n0.o) obj, i17);
        return jz5.f0.f302826a;
    }
}
