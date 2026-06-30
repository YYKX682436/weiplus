package fc3;

/* loaded from: classes9.dex */
public final class a {
    public a(kotlin.jvm.internal.i iVar) {
    }

    public final java.lang.String a(java.util.List list, int i17) {
        int i18 = 0;
        if (list == null || list.isEmpty()) {
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            int i19 = i18 + 1;
            z21.c cVar = (z21.c) it.next();
            java.lang.String str = (i18 == 0 ? "" : "|") + cVar.f469560b + '-' + cVar.f469559a;
            if (i17 > 0) {
                byte[] bytes = (sb6.toString() + str).getBytes(r26.c.f368865a);
                kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
                if (bytes.length > i17) {
                    break;
                }
            }
            sb6.append(str);
            i18 = i19;
        }
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.d(sb7);
        return sb7;
    }
}
