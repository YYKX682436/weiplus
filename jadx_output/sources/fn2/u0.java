package fn2;

/* loaded from: classes10.dex */
public final class u0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fn2.h1 f264408d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f264409e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(fn2.h1 h1Var, int i17) {
        super(0);
        this.f264408d = h1Var;
        this.f264409e = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        bm2.k7 k7Var = this.f264408d.f264272i;
        if (k7Var != null) {
            k7Var.I(2, bm2.y8.f22465h, this.f264409e, 1, null);
            return jz5.f0.f302826a;
        }
        kotlin.jvm.internal.o.o("rvAdapter");
        throw null;
    }
}
