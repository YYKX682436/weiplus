package ha1;

/* loaded from: classes7.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ha1.t f279787d = new ha1.t();

    public t() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.List k17 = kz5.c0.k(ha1.i.f279769c, ha1.q.f279784c, ha1.r.f279785c, ha1.n.f279781c, ha1.p.f279783c, ha1.s.f279786c, ha1.o.f279782c);
        k17.add(ha1.j.f279776c);
        java.util.Collection values = ha1.l.f279777f.values();
        kotlin.jvm.internal.o.f(values, "<get-values>(...)");
        k17.addAll(values);
        jz5.g gVar = ha1.v.f279789b;
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        java.util.Iterator it = k17.iterator();
        while (it.hasNext()) {
            java.lang.String d17 = ((ha1.v) it.next()).d();
            if (d17 != null) {
                linkedHashSet.contains(d17);
                linkedHashSet.add(d17);
            }
        }
        return k17;
    }
}
