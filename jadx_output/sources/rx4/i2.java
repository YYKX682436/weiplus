package rx4;

/* loaded from: classes5.dex */
public abstract class i2 {
    public static final java.lang.String a(java.lang.String query, java.lang.String parameterName) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(query, "query");
        kotlin.jvm.internal.o.g(parameterName, "parameterName");
        java.util.List e07 = r26.n0.e0(query, new char[]{'&'}, false, 0, 6, null);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(e07, 10));
        java.util.Iterator it = e07.iterator();
        while (it.hasNext()) {
            java.util.List e08 = r26.n0.e0((java.lang.String) it.next(), new char[]{'='}, false, 0, 6, null);
            java.lang.String str = (java.lang.String) kz5.n0.Z(e08);
            java.lang.String str2 = "";
            if (str == null) {
                str = "";
            }
            java.lang.String str3 = (java.lang.String) kz5.n0.Z(kz5.n0.R(e08, 1));
            if (str3 != null) {
                str2 = str3;
            }
            arrayList.add(new jz5.l(str, str2));
        }
        java.util.Iterator it6 = arrayList.iterator();
        while (true) {
            if (!it6.hasNext()) {
                obj = null;
                break;
            }
            obj = it6.next();
            if (kotlin.jvm.internal.o.b(((jz5.l) obj).f302833d, parameterName)) {
                break;
            }
        }
        jz5.l lVar = (jz5.l) obj;
        if (lVar != null) {
            return (java.lang.String) lVar.f302834e;
        }
        return null;
    }
}
