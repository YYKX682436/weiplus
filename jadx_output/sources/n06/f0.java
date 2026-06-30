package n06;

/* loaded from: classes16.dex */
public abstract class f0 {
    public static final f26.f2 a(o06.g from, o06.g to6) {
        kotlin.jvm.internal.o.g(from, "from");
        kotlin.jvm.internal.o.g(to6, "to");
        from.m().size();
        to6.m().size();
        f26.e2 e2Var = f26.f2.f259161b;
        java.util.List m17 = from.m();
        kotlin.jvm.internal.o.f(m17, "getDeclaredTypeParameters(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m17, 10));
        java.util.Iterator it = m17.iterator();
        while (it.hasNext()) {
            arrayList.add(((o06.e2) it.next()).g());
        }
        java.util.List m18 = to6.m();
        kotlin.jvm.internal.o.f(m18, "getDeclaredTypeParameters(...)");
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(m18, 10));
        java.util.Iterator it6 = m18.iterator();
        while (it6.hasNext()) {
            f26.z0 k17 = ((o06.e2) it6.next()).k();
            kotlin.jvm.internal.o.f(k17, "getDefaultType(...)");
            arrayList2.add(j26.c.a(k17));
        }
        return f26.e2.c(e2Var, kz5.c1.q(kz5.n0.a1(arrayList, arrayList2)), false, 2, null);
    }
}
