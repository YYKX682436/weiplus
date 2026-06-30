package gr3;

/* loaded from: classes9.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final gr3.f f274857a = new gr3.f();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f274858b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static volatile java.lang.String f274859c = "";

    public final void a(java.lang.String pageId, java.lang.String key, java.lang.String eventAttributeKey, long j17) {
        kotlin.jvm.internal.o.g(pageId, "pageId");
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(eventAttributeKey, "eventAttributeKey");
        a51.a aVar = (a51.a) f274858b.get(pageId);
        if (aVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BizProfileTracerMgr", "addEvent: span not found for pageId=" + pageId + ", key=" + key);
            return;
        }
        if (!(eventAttributeKey.length() > 0)) {
            a51.a.a(aVar, key, 0L, null, 6, null);
            return;
        }
        com.tencent.wechat.aff.otel.b bVar = new com.tencent.wechat.aff.otel.b();
        bVar.f217413d = eventAttributeKey;
        boolean[] zArr = bVar.f217418i;
        zArr[1] = true;
        bVar.f217415f = j17;
        zArr[3] = true;
        a51.a.a(aVar, key, 0L, kz5.b0.c(bVar), 2, null);
    }

    public final void b(java.lang.String pageId, java.lang.String externalParent) {
        kotlin.jvm.internal.o.g(pageId, "pageId");
        kotlin.jvm.internal.o.g(externalParent, "externalParent");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("createProfileSpan pageId=");
        sb6.append(pageId);
        sb6.append(", externalParent=");
        sb6.append(externalParent);
        sb6.append(", spanMapSize=");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f274858b;
        sb6.append(concurrentHashMap.size());
        sb6.append(", parentSpanId=");
        sb6.append(f274859c);
        com.tencent.mars.xlog.Log.i("MicroMsg.BizProfileTracerMgr", sb6.toString());
        if (concurrentHashMap.isEmpty()) {
            if (externalParent.length() > 0) {
                f274859c = externalParent;
            }
            a51.a a17 = a51.c.a(a51.c.f1570a, "biz", "biz.profile.behavior", f274859c.length() > 0 ? f274859c : "", false, 8, null);
            concurrentHashMap.put(pageId, a17);
            if (f274859c.length() == 0) {
                f274859c = a17.f1565b;
            }
        } else if (externalParent.length() > 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BizProfileTracerMgr", "createProfileSpan reset chain, new externalParent=".concat(externalParent));
            for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
                java.lang.String str = (java.lang.String) entry.getKey();
                try {
                    ((a51.a) entry.getValue()).b();
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.BizProfileTracerMgr", "clearAll error ending span " + str + ": " + e17.getMessage());
                }
            }
            java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = f274858b;
            concurrentHashMap2.clear();
            f274859c = "";
            f274859c = externalParent;
            concurrentHashMap2.put(pageId, a51.c.a(a51.c.f1570a, "biz", "biz.profile.behavior", f274859c, false, 8, null));
        } else {
            concurrentHashMap.put(pageId, a51.c.a(a51.c.f1570a, "biz", "biz.profile.behavior", f274859c, false, 8, null));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BizProfileTracerMgr", "createProfileSpan done, spanMapSize=" + f274858b.size() + ", parentSpanId=" + f274859c);
    }
}
