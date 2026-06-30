package t41;

/* loaded from: classes11.dex */
public abstract class f {
    public static java.util.LinkedList a(java.util.List list) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (list == null) {
            return linkedList;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            r45.zz4 zz4Var = (r45.zz4) it.next();
            r45.wy wyVar = new r45.wy();
            wyVar.f389565d = zz4Var.f392484d;
            wyVar.f389566e = zz4Var.f392485e;
            wyVar.f389567f = zz4Var.f392486f;
            wyVar.f389568g = zz4Var.f392487g;
            wyVar.f389569h = zz4Var.f392488h;
            wyVar.f389570i = zz4Var.f392489i;
            wyVar.f389571m = zz4Var.f392492o;
            linkedList.add(wyVar);
        }
        return linkedList;
    }
}
