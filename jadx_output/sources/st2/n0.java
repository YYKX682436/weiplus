package st2;

/* loaded from: classes3.dex */
public final class n0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final st2.n0 f412400d = new st2.n0();

    public n0() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        so2.j5 it = (so2.j5) obj;
        kotlin.jvm.internal.o.g(it, "it");
        boolean z17 = false;
        if (it instanceof cm2.m0) {
            zl2.r4 r4Var = zl2.r4.f473950a;
            cm2.m0 m0Var = (cm2.m0) it;
            if (m0Var.H > 0) {
                r45.y23 data = m0Var.f43368v;
                kotlin.jvm.internal.o.g(data, "data");
                if (data.getInteger(37) != 0) {
                    z17 = true;
                }
            }
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
