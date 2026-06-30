package k16;

/* loaded from: classes16.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f303461a;

    public k(i16.v1 typeTable) {
        kotlin.jvm.internal.o.g(typeTable, "typeTable");
        java.util.List list = typeTable.f287787f;
        int i17 = 0;
        if ((typeTable.f287786e & 1) == 1) {
            int i18 = typeTable.f287788g;
            kotlin.jvm.internal.o.f(list, "getTypeList(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
            for (java.lang.Object obj : list) {
                int i19 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                i16.l1 l1Var = (i16.l1) obj;
                if (i17 >= i18) {
                    l1Var.getClass();
                    i16.k1 m17 = i16.l1.m(l1Var);
                    m17.f287563g |= 2;
                    m17.f287565i = true;
                    l1Var = m17.d();
                    if (!l1Var.isInitialized()) {
                        throw new p16.x0(l1Var);
                    }
                }
                arrayList.add(l1Var);
                i17 = i19;
            }
            list = arrayList;
        }
        kotlin.jvm.internal.o.f(list, "run(...)");
        this.f303461a = list;
    }

    public final i16.l1 a(int i17) {
        return (i16.l1) this.f303461a.get(i17);
    }
}
