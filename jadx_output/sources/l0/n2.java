package l0;

/* loaded from: classes14.dex */
public final class n2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b0.u0 f314386d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.e0 f314387e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(b0.u0 u0Var, kotlin.jvm.internal.e0 e0Var) {
        super(1);
        this.f314386d = u0Var;
        this.f314387e = e0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        z.e animateTo = (z.e) obj;
        kotlin.jvm.internal.o.g(animateTo, "$this$animateTo");
        float floatValue = ((java.lang.Number) animateTo.d()).floatValue();
        kotlin.jvm.internal.e0 e0Var = this.f314387e;
        ((b0.j) this.f314386d).f16352a.f16373a.invoke(java.lang.Float.valueOf(floatValue - e0Var.f310115d));
        e0Var.f310115d = ((java.lang.Number) animateTo.d()).floatValue();
        return jz5.f0.f302826a;
    }
}
