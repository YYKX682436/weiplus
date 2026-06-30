package vg0;

/* loaded from: classes8.dex */
public final class g implements ou4.c0 {
    @Override // ou4.c0
    public void a(java.util.Map map, ou4.b0 callback) {
        java.util.Map map2;
        java.lang.String str;
        kotlin.jvm.internal.o.g(callback, "callback");
        if (map != null) {
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            for (java.util.Map.Entry entry : map.entrySet()) {
                if (((java.lang.String) entry.getKey()) != null) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap(kz5.b1.d(linkedHashMap.size()));
            for (java.util.Map.Entry entry2 : linkedHashMap.entrySet()) {
                java.lang.Object key = entry2.getKey();
                kotlin.jvm.internal.o.d(key);
                linkedHashMap2.put((java.lang.String) key, entry2.getValue());
            }
            map2 = new java.util.LinkedHashMap(kz5.b1.d(linkedHashMap2.size()));
            for (java.util.Map.Entry entry3 : linkedHashMap2.entrySet()) {
                java.lang.Object key2 = entry3.getKey();
                java.lang.Object value = entry3.getValue();
                if (value == null || (str = value.toString()) == null) {
                    str = "";
                }
                map2.put(key2, str);
            }
        } else {
            map2 = kz5.q0.f314001d;
        }
        com.tencent.mars.xlog.Log.i("WebSearchApiHandlers", "preCreatePlatformSearchWebView");
        ((yg0.o3) ((tg0.l1) i95.n0.c(tg0.l1.class))).cj(map2);
        ou4.b0.c(callback, null, 1, null);
    }

    @Override // ou4.c0
    public java.lang.String b() {
        return "preCreatePlatformSearchWebView";
    }
}
