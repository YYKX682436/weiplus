package wu0;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f449660a = new java.util.concurrent.ConcurrentHashMap();

    public final java.util.List a() {
        java.lang.Object obj;
        java.lang.Object obj2;
        r45.ne4 ne4Var;
        java.util.Collection values = this.f449660a.values();
        kotlin.jvm.internal.o.f(values, "<get-values>(...)");
        jz5.l lVar = new jz5.l(java.lang.Boolean.TRUE, new java.util.ArrayList());
        java.util.Iterator it = values.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            obj = lVar.f302834e;
            obj2 = lVar.f302833d;
            if (!hasNext) {
                break;
            }
            wu0.e eVar = (wu0.e) it.next();
            java.util.List list = (java.util.List) obj;
            boolean z17 = ((java.lang.Boolean) obj2).booleanValue() && eVar.f449659c;
            if (eVar.f449659c && (ne4Var = eVar.f449658b) != null) {
                list.add(ne4Var);
            }
            lVar = new jz5.l(java.lang.Boolean.valueOf(z17), list);
        }
        if (((java.lang.Boolean) obj2).booleanValue()) {
            return (java.util.List) obj;
        }
        return null;
    }

    public final void b(java.lang.String groupID, r45.ne4 ne4Var, boolean z17, yz5.l lVar) {
        kotlin.jvm.internal.o.g(groupID, "groupID");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f449660a;
        wu0.e eVar = (wu0.e) concurrentHashMap.get(groupID);
        if (eVar != null) {
            ru0.h uniqueHexKey = eVar.f449657a;
            kotlin.jvm.internal.o.g(uniqueHexKey, "uniqueHexKey");
            wu0.e eVar2 = new wu0.e(uniqueHexKey, ne4Var, z17);
            concurrentHashMap.put(groupID, eVar2);
            if (lVar != null) {
                lVar.invoke(eVar2.f449657a);
            }
        }
    }
}
