package i06;

/* loaded from: classes15.dex */
public final class o3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i06.q3 f286714d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(i06.q3 q3Var) {
        super(0);
        this.f286714d = q3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        i06.q3 q3Var = this.f286714d;
        i06.u1 u1Var = q3Var.f286731m;
        u1Var.getClass();
        java.lang.String name = q3Var.f286732n;
        kotlin.jvm.internal.o.g(name, "name");
        java.lang.String signature = q3Var.f286733o;
        kotlin.jvm.internal.o.g(signature, "signature");
        r26.m d17 = i06.u1.f286756d.d(signature);
        if (d17 != null) {
            java.lang.String str = (java.lang.String) ((r26.q) d17).a().get(1);
            o06.o1 m17 = u1Var.m(java.lang.Integer.parseInt(str));
            if (m17 != null) {
                return m17;
            }
            throw new i06.a4("Local property #" + str + " not found in " + u1Var.f());
        }
        java.util.Collection p17 = u1Var.p(n16.g.k(name));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : p17) {
            if (kotlin.jvm.internal.o.b(i06.k4.f286686a.b((o06.o1) obj).a(), signature)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            throw new i06.a4("Property '" + name + "' (JVM signature: " + signature + ") not resolved in " + u1Var);
        }
        if (arrayList.size() == 1) {
            return (o06.o1) kz5.n0.z0(arrayList);
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            o06.g0 visibility = ((o06.o1) next).getVisibility();
            java.lang.Object obj2 = linkedHashMap.get(visibility);
            if (obj2 == null) {
                obj2 = new java.util.ArrayList();
                linkedHashMap.put(visibility, obj2);
            }
            ((java.util.List) obj2).add(next);
        }
        java.util.Collection values = ((java.util.TreeMap) kz5.b1.g(linkedHashMap, new i06.m1(i06.s1.f286746d))).values();
        kotlin.jvm.internal.o.f(values, "<get-values>(...)");
        java.util.List list = (java.util.List) kz5.n0.h0(values);
        if (list.size() == 1) {
            return (o06.o1) kz5.n0.X(list);
        }
        java.lang.String g07 = kz5.n0.g0(u1Var.p(n16.g.k(name)), "\n", null, null, 0, null, i06.r1.f286740d, 30, null);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Property '");
        sb6.append(name);
        sb6.append("' (JVM signature: ");
        sb6.append(signature);
        sb6.append(") not resolved in ");
        sb6.append(u1Var);
        sb6.append(':');
        sb6.append(g07.length() == 0 ? " no members found" : "\n".concat(g07));
        throw new i06.a4(sb6.toString());
    }
}
