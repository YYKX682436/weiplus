package k92;

/* loaded from: classes2.dex */
public abstract class a {
    public static final r45.ao2 a(m92.b bVar) {
        r45.wn2 wn2Var;
        java.util.LinkedList list;
        java.lang.Object obj = null;
        if (bVar == null || (wn2Var = (r45.wn2) bVar.u0().getCustom(28)) == null || (list = wn2Var.getList(0)) == null) {
            return null;
        }
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            boolean z17 = true;
            if (((r45.ao2) next).getInteger(0) != 1) {
                z17 = false;
            }
            if (z17) {
                obj = next;
                break;
            }
        }
        return (r45.ao2) obj;
    }
}
