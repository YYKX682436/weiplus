package xn5;

/* loaded from: classes9.dex */
public abstract class g1 {
    public static final boolean a(r45.hg7 hg7Var, r45.hg7 newData) {
        boolean z17;
        kotlin.jvm.internal.o.g(hg7Var, "<this>");
        kotlin.jvm.internal.o.g(newData, "newData");
        java.util.LinkedList layoutList = newData.f376141e;
        kotlin.jvm.internal.o.f(layoutList, "layoutList");
        java.util.Iterator it = layoutList.iterator();
        do {
            z17 = false;
            if (!it.hasNext()) {
                return false;
            }
            int i17 = ((r45.ig7) it.next()).f377040d;
            java.util.LinkedList layoutList2 = hg7Var.f376141e;
            kotlin.jvm.internal.o.f(layoutList2, "layoutList");
            java.util.Iterator it6 = layoutList2.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                if (((r45.ig7) it6.next()).f377040d == i17) {
                    z17 = true;
                    break;
                }
            }
        } while (z17);
        return true;
    }

    public static final java.lang.String b(r45.hg7 hg7Var) {
        kotlin.jvm.internal.o.g(hg7Var, "<this>");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("x2cPreloadData size:" + hg7Var.f376141e.size() + '\n');
        java.util.LinkedList layoutList = hg7Var.f376141e;
        kotlin.jvm.internal.o.f(layoutList, "layoutList");
        java.util.Iterator it = layoutList.iterator();
        while (it.hasNext()) {
            sb6.append(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getResourceEntryName(((r45.ig7) it.next()).f377040d) + '\n');
        }
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }
}
