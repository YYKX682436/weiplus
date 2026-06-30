package yy0;

@j95.b
/* loaded from: classes5.dex */
public final class o7 extends i95.w implements pp0.m0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f468267d = "MicroMsg.MJTimeCostReporterFeatureService";

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f468268e = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f468269f = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f468270g = "|";

    public final java.lang.String Ai(java.lang.String str, java.lang.String str2) {
        if (str2 == null) {
            return str;
        }
        return str + this.f468270g + str2;
    }

    public void Bi(java.lang.String eventName, java.lang.String str) {
        kotlin.jvm.internal.o.g(eventName, "eventName");
        this.f468268e.put(Ai(eventName, str), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
    }

    public void Di(java.lang.String eventName, java.lang.String str, java.lang.String str2, java.util.Map map) {
        java.lang.Object putIfAbsent;
        kotlin.jvm.internal.o.g(eventName, "eventName");
        java.lang.String Ai = Ai(eventName, str);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f468268e;
        java.lang.Long l17 = (java.lang.Long) concurrentHashMap.get(Ai);
        java.lang.String str3 = this.f468267d;
        if (l17 == null) {
            com.tencent.mars.xlog.Log.e(str3, "Event " + Ai + " was not started");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis() - l17.longValue();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = this.f468269f;
        java.lang.Object obj = concurrentHashMap2.get(Ai);
        if (obj == null && (putIfAbsent = concurrentHashMap2.putIfAbsent(Ai, (obj = new java.util.LinkedHashMap()))) != null) {
            obj = putIfAbsent;
        }
        java.util.Map map2 = (java.util.Map) obj;
        if (map != null) {
            map2.putAll(map);
        }
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        java.util.Map c17 = kotlin.jvm.internal.m0.c(kz5.c1.l(new jz5.l("view_id", eventName), new jz5.l("time_cost", java.lang.Long.valueOf(currentTimeMillis))));
        if (str2 != null) {
            c17.put("end_reason", str2);
        }
        c17.putAll(map2);
        com.tencent.mars.xlog.Log.i(str3, "reportTimeCostEvent: eventName=" + eventName + ", timeCost=" + currentTimeMillis + ", reportingParams=" + c17);
        ((cy1.a) rVar).yj(eventName, null, c17, 6, false);
        concurrentHashMap.remove(Ai);
        concurrentHashMap2.remove(Ai);
    }

    public void Ni(java.lang.String eventName, java.util.Map map) {
        kotlin.jvm.internal.o.g(eventName, "eventName");
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        java.util.Map c17 = kotlin.jvm.internal.m0.c(kz5.c1.l(new jz5.l("view_id", eventName)));
        if (map != null) {
            c17.putAll(map);
        }
        com.tencent.mars.xlog.Log.i(this.f468267d, "reportEvent: eventName=" + eventName + ", reportingParams=" + c17);
        ((cy1.a) rVar).yj(eventName, null, c17, 6, false);
    }

    public void wi(java.util.Map params, java.lang.String eventName, java.lang.String str) {
        java.lang.Object putIfAbsent;
        kotlin.jvm.internal.o.g(params, "params");
        kotlin.jvm.internal.o.g(eventName, "eventName");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f468269f;
        java.lang.String Ai = Ai(eventName, str);
        java.lang.Object obj = concurrentHashMap.get(Ai);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(Ai, (obj = new java.util.LinkedHashMap()))) != null) {
            obj = putIfAbsent;
        }
        ((java.util.Map) obj).putAll(params);
    }
}
