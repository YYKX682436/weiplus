package g73;

/* loaded from: classes15.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final g73.u f269333d = new g73.u();

    public u() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i("HandOffService", "do all list");
        if (!g73.o0.wi(g73.o0.f269311d)) {
            java.util.Collection values = g73.o0.f269314g.values();
            kotlin.jvm.internal.o.f(values, "<get-values>(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : values) {
                com.tencent.mm.plugin.handoff.model.HandOff handOff = (com.tencent.mm.plugin.handoff.model.HandOff) obj;
                g73.o0 o0Var = g73.o0.f269311d;
                kotlin.jvm.internal.o.d(handOff);
                if (g73.o0.Ai(o0Var, handOff)) {
                    arrayList.add(obj);
                }
            }
            java.util.List F0 = kz5.n0.F0(arrayList, new g73.t());
            g73.m2 m2Var = g73.o0.f269320p;
            m2Var.getClass();
            m2Var.c();
            m2Var.f269302s = F0;
            m2Var.a();
        } else if (g73.o0.f269318n) {
            java.util.Collection values2 = g73.o0.f269314g.values();
            kotlin.jvm.internal.o.f(values2, "<get-values>(...)");
            java.util.List F02 = kz5.n0.F0(values2, new g73.r());
            g73.m2 m2Var2 = g73.o0.f269320p;
            m2Var2.getClass();
            m2Var2.c();
            m2Var2.f269302s = F02;
            m2Var2.a();
        } else {
            java.util.Collection values3 = g73.o0.f269314g.values();
            kotlin.jvm.internal.o.f(values3, "<get-values>(...)");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj2 : values3) {
                com.tencent.mm.plugin.handoff.model.HandOff handOff2 = (com.tencent.mm.plugin.handoff.model.HandOff) obj2;
                boolean z17 = true;
                if (handOff2.getHandOffType() != 2 && (!g73.o0.f269319o || handOff2.getDataType() != 1)) {
                    z17 = false;
                }
                if (z17) {
                    arrayList2.add(obj2);
                }
            }
            java.util.List F03 = kz5.n0.F0(arrayList2, new g73.s());
            g73.o0.f269311d.getClass();
            g73.m2 m2Var3 = g73.o0.f269320p;
            m2Var3.getClass();
            m2Var3.c();
            m2Var3.f269302s = F03;
            m2Var3.a();
        }
        return jz5.f0.f302826a;
    }
}
