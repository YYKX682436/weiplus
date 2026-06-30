package s2;

/* loaded from: classes14.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s2.b0 f402257d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f402258e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(s2.b0 b0Var, int i17) {
        super(2);
        this.f402257d = b0Var;
        this.f402258e = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f402258e | 1;
        this.f402257d.a((n0.o) obj, i17);
        return jz5.f0.f302826a;
    }
}
