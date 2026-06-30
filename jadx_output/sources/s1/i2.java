package s1;

/* loaded from: classes14.dex */
public final class i2 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s1.k2 f402015d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(s1.k2 k2Var) {
        super(2);
        this.f402015d = k2Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        u1.w wVar = (u1.w) obj;
        yz5.p it = (yz5.p) obj2;
        kotlin.jvm.internal.o.g(wVar, "$this$null");
        kotlin.jvm.internal.o.g(it, "it");
        s1.q0 a17 = this.f402015d.a();
        wVar.L(new s1.n0(a17, it, a17.f402072l));
        return jz5.f0.f302826a;
    }
}
