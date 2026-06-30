package l26;

/* loaded from: classes16.dex */
public final class d0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final l26.d0 f315220d = new l26.d0();

    public d0() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        o06.n0 $receiver = (o06.n0) obj;
        kotlin.jvm.internal.o.g($receiver, "$this$$receiver");
        java.util.List W = $receiver.W();
        kotlin.jvm.internal.o.f(W, "getValueParameters(...)");
        o06.l2 l2Var = (o06.l2) kz5.n0.k0(W);
        boolean z17 = false;
        if (l2Var != null) {
            if (!v16.f.a(l2Var) && ((r06.s1) l2Var).f368526p == null) {
                z17 = true;
            }
        }
        java.util.List list = l26.g0.f315228a;
        if (z17) {
            return null;
        }
        return "last parameter should not have a default value or be a vararg";
    }
}
