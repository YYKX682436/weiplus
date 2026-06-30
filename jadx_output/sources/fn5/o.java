package fn5;

/* loaded from: classes5.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fn5.n0 f264741d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f264742e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(fn5.n0 n0Var, int i17) {
        super(2);
        this.f264741d = n0Var;
        this.f264742e = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f264742e | 1;
        fn5.p.i(this.f264741d, (n0.o) obj, i17);
        return jz5.f0.f302826a;
    }
}
