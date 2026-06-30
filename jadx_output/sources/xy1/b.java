package xy1;

/* loaded from: classes13.dex */
public abstract class b {
    public static java.lang.Object a(vy1.c cVar, java.lang.String str) {
        if (cVar == null || u46.l.e(str)) {
            return null;
        }
        return ((java.util.concurrent.ConcurrentHashMap) cVar.f441450h).get(str);
    }

    public static java.util.Map b(java.lang.String str, vy1.c cVar) {
        java.lang.Object obj;
        java.util.HashMap hashMap = null;
        if (cVar == null) {
            return null;
        }
        java.util.List list = cVar.f441449g;
        if (list != null && ((java.util.concurrent.CopyOnWriteArrayList) list).size() > 0) {
            hashMap = new java.util.HashMap();
            java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) list).iterator();
            while (it.hasNext()) {
                ly1.a aVar = (ly1.a) it.next();
                if (aVar != null) {
                    java.util.Map hashMap2 = new java.util.HashMap();
                    try {
                        hashMap2 = aVar.b(str);
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.e("Amoeba.ViewDataEntityWrapper", "[getPageDynamicParams] getDynamicParams throw Exception : " + e17.getMessage());
                    }
                    if (hashMap2 != null && hashMap2.size() > 0) {
                        for (java.lang.String str2 : hashMap2.keySet()) {
                            if (!u46.l.e(str2) && (obj = hashMap2.get(str2)) != null) {
                                hashMap.put(str2, obj);
                            }
                        }
                    }
                }
            }
        }
        return hashMap;
    }

    public static void c(vy1.c cVar, java.lang.String str, java.lang.Object obj) {
        if (cVar == null || u46.l.e(str)) {
            return;
        }
        ((java.util.concurrent.ConcurrentHashMap) cVar.f441450h).put(str, obj);
    }
}
