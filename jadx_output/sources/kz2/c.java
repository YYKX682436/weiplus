package kz2;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f313860a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f313861b;

    /* renamed from: c, reason: collision with root package name */
    public int f313862c;

    /* renamed from: d, reason: collision with root package name */
    public long f313863d;

    public c(java.lang.String traceName) {
        kotlin.jvm.internal.o.g(traceName, "traceName");
        this.f313860a = traceName;
        this.f313861b = new java.util.concurrent.ConcurrentHashMap();
        this.f313862c = 1;
    }

    public final void a(java.lang.String node) {
        kotlin.jvm.internal.o.g(node, "node");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f313861b;
        concurrentHashMap.clear();
        concurrentHashMap.put(node, java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()));
        this.f313862c = 1;
    }

    public void b(java.lang.String node) {
        kotlin.jvm.internal.o.g(node, "node");
        if (this.f313862c == 3) {
            return;
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f313861b;
        concurrentHashMap.put(node, java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()));
        r2 = null;
        for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
        }
        long longValue = entry != null ? ((java.lang.Number) entry.getValue()).longValue() : 0L;
        java.util.Map.Entry entry2 = (java.util.Map.Entry) concurrentHashMap.entrySet().iterator().next();
        this.f313863d = longValue - (entry2 != null ? ((java.lang.Number) entry2.getValue()).longValue() : 0L);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append("TimeConsumingTrace " + this.f313860a + " total:" + this.f313863d + '\n');
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        java.util.Map.Entry entry3 = (java.util.Map.Entry) it.next();
        while (it.hasNext()) {
            java.util.Map.Entry entry4 = (java.util.Map.Entry) it.next();
            sb6.append((java.lang.String) entry3.getKey());
            sb6.append("-->");
            sb6.append((java.lang.String) entry4.getKey());
            sb6.append(":");
            sb6.append(((java.lang.Number) entry4.getValue()).longValue() - ((java.lang.Number) entry3.getValue()).longValue());
            sb6.append("\n");
            entry3 = entry4;
        }
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        this.f313862c = 3;
        com.tencent.mars.xlog.Log.i("TimeConsumingTrace", sb7);
    }

    public final void c(java.lang.String node) {
        kotlin.jvm.internal.o.g(node, "node");
        if (this.f313862c == 3) {
            return;
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f313861b;
        if (concurrentHashMap.get(node) == null) {
            concurrentHashMap.put(node, java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()));
        }
        this.f313862c = 2;
    }

    public final org.json.JSONObject d() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f313861b;
        r2 = null;
        for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
        }
        long longValue = entry != null ? ((java.lang.Number) entry.getValue()).longValue() : 0L;
        java.util.Map.Entry entry2 = (java.util.Map.Entry) concurrentHashMap.entrySet().iterator().next();
        long longValue2 = longValue - (entry2 != null ? ((java.lang.Number) entry2.getValue()).longValue() : 0L);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("traceName", this.f313860a);
        jSONObject.put("totalTime", longValue2);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        java.util.Map.Entry entry3 = (java.util.Map.Entry) it.next();
        while (it.hasNext()) {
            java.util.Map.Entry entry4 = (java.util.Map.Entry) it.next();
            jSONObject.put(((java.lang.String) entry3.getKey()) + "->" + ((java.lang.String) entry4.getKey()), ((java.lang.Number) entry4.getValue()).longValue() - ((java.lang.Number) entry3.getValue()).longValue());
            entry3 = entry4;
        }
        return jSONObject;
    }
}
