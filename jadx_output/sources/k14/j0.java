package k14;

/* loaded from: classes5.dex */
public abstract class j0 {
    public static final java.util.List a(java.util.List authItems) {
        kotlin.jvm.internal.o.g(authItems, "authItems");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator it = authItems.iterator();
        while (it.hasNext()) {
            r45.pv6 pv6Var = (r45.pv6) it.next();
            java.lang.String str = pv6Var.f383421e;
            if ((str == null || str.length() == 0) || hashSet.contains(pv6Var.f383421e)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.SettingsAuthUtils", "filterAuthScopeList scope_desc exist and ignore: " + pv6Var.f383420d + ", " + pv6Var.f383421e);
            } else {
                hashSet.add(pv6Var.f383421e);
                arrayList.add(pv6Var);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsAuthUtils", "filterAuthScopeList final size: " + arrayList.size() + ", origin size: " + authItems.size());
        return arrayList;
    }
}
