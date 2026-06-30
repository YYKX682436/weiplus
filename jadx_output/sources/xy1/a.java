package xy1;

/* loaded from: classes13.dex */
public abstract class a {
    public static java.util.List a(vy1.b bVar) {
        if (bVar == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(bVar.f441431j);
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) bVar.f441430i).iterator();
        while (it.hasNext()) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
            if (weakReference != null && weakReference.get() != null) {
                arrayList.add((ly1.a) weakReference.get());
            }
        }
        return arrayList;
    }

    public static java.util.Map b(java.lang.String str, vy1.b bVar) {
        java.lang.Object obj;
        if (bVar == null) {
            return null;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.List a17 = a(bVar);
        if (a17 != null) {
            java.util.ArrayList arrayList = (java.util.ArrayList) a17;
            if (arrayList.size() > 0) {
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ly1.a aVar = (ly1.a) it.next();
                    java.util.Map hashMap2 = new java.util.HashMap();
                    try {
                        hashMap2 = aVar.b(str);
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.e("Amoeba.PageDataEntityWrapper", "[getPageDynamicParams] getDynamicParams throw Exception : " + e17.getMessage());
                    }
                    if (hashMap2 != null && hashMap2.size() > 0) {
                        for (java.lang.String str2 : hashMap2.keySet()) {
                            if (!u46.l.e(str2) && (obj = hashMap2.get(str2)) != null) {
                                hashMap.put(str2, obj);
                            }
                        }
                    }
                }
                return hashMap;
            }
        }
        if (u46.l.c(str, "biz_out")) {
            hashMap.putAll(bVar.f441440s);
        } else if (u46.l.c(str, "session_out")) {
            hashMap.putAll(bVar.f441441t);
        } else if (u46.l.c(str, "page_out")) {
            hashMap.putAll(bVar.f441442u);
        }
        com.tencent.mars.xlog.Log.e("Amoeba.PageDataEntityWrapper", "[getPageDynamicParams] fail, pageName : " + bVar.f441423b + ", dynamicParam is null");
        java.lang.String str3 = bVar.f441423b;
        if (pz1.a.a() && !u46.l.e(str3)) {
            java.util.ArrayList arrayList2 = (java.util.ArrayList) pz1.a.f359180e;
            if (!arrayList2.contains(str3)) {
                if (arrayList2.size() > 10) {
                    arrayList2.remove(0);
                }
                arrayList2.add(str3);
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add("6");
                arrayList3.add(str3);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.l(24504, arrayList3);
            }
        }
        return hashMap;
    }
}
