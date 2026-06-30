package vm2;

/* loaded from: classes3.dex */
public final class c {
    public c(kotlin.jvm.internal.i iVar) {
    }

    public final r45.kv1 a(vm2.d dVar) {
        kotlin.jvm.internal.o.g(dVar, "<this>");
        r45.yp1 yp1Var = dVar.f438088d;
        r45.qa0 qa0Var = dVar.f438089e;
        if (qa0Var == null) {
            java.util.LinkedList list = yp1Var.getList(4);
            kotlin.jvm.internal.o.f(list, "getGifts(...)");
            return (r45.kv1) kz5.n0.Z(list);
        }
        java.util.LinkedList list2 = yp1Var.getList(4);
        java.lang.Object obj = null;
        if (list2 == null) {
            return null;
        }
        java.util.Iterator it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (kotlin.jvm.internal.o.b(((r45.kv1) next).getString(0), qa0Var.getString(1))) {
                obj = next;
                break;
            }
        }
        return (r45.kv1) obj;
    }
}
