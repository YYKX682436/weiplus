package mm2;

/* loaded from: classes3.dex */
public final class x0 {
    public x0(kotlin.jvm.internal.i iVar) {
    }

    public final java.lang.String a(java.util.List list) {
        if (list == null || list.isEmpty()) {
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            sb6.append("[" + pm0.b0.g((r45.yl1) it.next()) + ']');
        }
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }

    public final void b(java.util.List list, java.lang.String prefix) {
        kotlin.jvm.internal.o.g(prefix, "prefix");
        com.tencent.mars.xlog.Log.i("BadgeInfoList", prefix + ':' + a(list));
    }

    public final void c(java.util.List list, java.util.List list2) {
        int size;
        int i17;
        if (list2 != null) {
            try {
                size = list2.size();
            } catch (java.lang.Exception e17) {
                hc2.c.a(e17, "printNewBadgeList");
                return;
            }
        } else {
            size = 0;
        }
        if (size != (list != null ? list.size() : 0)) {
            b(list2, "printNewBadgeList");
            return;
        }
        if (list2 == null || list == null) {
            return;
        }
        for (0; i17 < size; i17 + 1) {
            i17 = (((r45.yl1) list2.get(i17)).getInteger(0) == ((r45.yl1) list.get(i17)).getInteger(0) && ((r45.yl1) list2.get(i17)).getInteger(2) == ((r45.yl1) list.get(i17)).getInteger(2)) ? i17 + 1 : 0;
            b(list2, "printNewBadgeList");
            return;
        }
    }
}
