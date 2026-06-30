package st2;

/* loaded from: classes3.dex */
public final class q2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f412428d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f412429e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gk2.e f412430f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(kotlin.jvm.internal.h0 h0Var, st2.r2 r2Var, r45.qt2 qt2Var, gk2.e eVar) {
        super(0);
        this.f412428d = h0Var;
        this.f412429e = qt2Var;
        this.f412430f = eVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        kotlin.jvm.internal.h0 h0Var = this.f412428d;
        java.util.LinkedList linkedList = (java.util.LinkedList) h0Var.f310123d;
        int i17 = 0;
        int size = linkedList != null ? linkedList.size() : 0;
        java.util.LinkedList linkedList2 = (java.util.LinkedList) h0Var.f310123d;
        if (linkedList2 != null) {
            for (java.lang.Object obj : linkedList2) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                long longValue = ((java.lang.Number) obj).longValue();
                if (i17 >= 9) {
                    break;
                }
                sb6.append(longValue);
                if (i17 < size - 1) {
                    sb6.append("|");
                }
                i17 = i18;
            }
        }
        c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
        zl2.r4 r4Var = zl2.r4.f473950a;
        gk2.e eVar = this.f412430f;
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        ((c61.p2) ybVar).Kj(this.f412429e, 18054, zl2.r4.k0(r4Var, eVar, 32, sb7, 0, null, 24, null));
        return jz5.f0.f302826a;
    }
}
