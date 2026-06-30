package en5;

/* loaded from: classes5.dex */
public final class k0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fn5.n0 f255448d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f255449e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(fn5.n0 n0Var, int i17) {
        super(2);
        this.f255448d = n0Var;
        this.f255449e = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f255449e | 1;
        en5.n0.e(this.f255448d, (n0.o) obj, i17);
        return jz5.f0.f302826a;
    }
}
