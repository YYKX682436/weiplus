package km2;

/* loaded from: classes3.dex */
public abstract class o {
    public static final boolean a(r45.xn1 xn1Var) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(xn1Var, "<this>");
        java.util.LinkedList list = xn1Var.getList(11);
        kotlin.jvm.internal.o.f(list, "getBadge_infos(...)");
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((r45.yl1) obj).getInteger(0) == 18) {
                break;
            }
        }
        return obj != null;
    }
}
