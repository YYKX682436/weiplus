package com.tencent.mm.plugin.finder.report;

/* loaded from: classes2.dex */
public final class s3 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.report.s3 f125345a = new com.tencent.mm.plugin.finder.report.s3();

    /* renamed from: b, reason: collision with root package name */
    public static final android.util.ArrayMap f125346b = new android.util.ArrayMap();

    /* renamed from: c, reason: collision with root package name */
    public static com.tencent.mm.plugin.finder.report.n4 f125347c;

    public static org.json.JSONObject c(com.tencent.mm.plugin.finder.report.s3 s3Var, java.lang.String contextId, java.lang.String str, int i17, java.lang.Object obj) {
        org.json.JSONArray b17;
        if ((i17 & 1) != 0) {
            contextId = "";
        }
        if ((i17 & 2) != 0) {
            com.tencent.mm.plugin.finder.report.n4 n4Var = f125347c;
            str = pm0.v.u(n4Var != null ? n4Var.f125153a : 0L);
        }
        s3Var.getClass();
        kotlin.jvm.internal.o.g(contextId, "contextId");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("referrer_feed_id", str);
        com.tencent.mm.plugin.finder.report.s3 s3Var2 = f125345a;
        synchronized (s3Var2) {
            int i18 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.i("Finder.SearchFeedInfoCollector", "reportBatch count:10", null);
            java.util.Collection values = f125346b.values();
            kotlin.jvm.internal.o.f(values, "<get-values>(...)");
            b17 = s3Var2.b(kz5.n0.K0(kz5.n0.F0(values, new com.tencent.mm.plugin.finder.report.r3()), 10));
        }
        jSONObject.put("finderInfo", b17);
        if (!android.text.TextUtils.isEmpty(contextId)) {
            jSONObject.put("contextID", contextId);
        }
        return jSONObject;
    }

    public final synchronized void a(java.util.LinkedList status) {
        kotlin.jvm.internal.o.g(status, "status");
        long c17 = c01.id.c();
        java.util.Iterator it = status.iterator();
        while (it.hasNext()) {
            r45.vd6 vd6Var = (r45.vd6) it.next();
            r45.yw6 yw6Var = (r45.yw6) vd6Var.getCustom(2);
            long j17 = yw6Var != null ? yw6Var.getLong(2) : 0L;
            r45.yw6 yw6Var2 = (r45.yw6) vd6Var.getCustom(2);
            long j18 = yw6Var2 != null ? yw6Var2.getLong(6) : 0L;
            if (j17 == 0 && j18 > 0) {
                j17 = c17 - j18;
            }
            long j19 = j17;
            long j27 = vd6Var.getLong(0);
            java.lang.String u17 = pm0.v.u(j27);
            int i17 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.i("Finder.SearchFeedInfoCollector", "stayTimeMs:" + j19 + " id:" + u17, null);
            android.util.ArrayMap arrayMap = f125346b;
            com.tencent.mm.plugin.finder.report.q3 q3Var = (com.tencent.mm.plugin.finder.report.q3) arrayMap.get(java.lang.Long.valueOf(j27));
            if (q3Var == null) {
            } else if (q3Var.f125266b < j19) {
                q3Var.f125266b = j19;
                q3Var.f125267c = j18;
            }
        }
    }

    public final org.json.JSONArray b(java.util.Collection collection) {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        try {
            java.util.Iterator it = collection.iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.finder.report.q3 q3Var = (com.tencent.mm.plugin.finder.report.q3) it.next();
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("feed_id", q3Var.f125265a);
                jSONObject.put("start_play_time_ms", q3Var.f125267c);
                jSONObject.put("stay_time_ms", q3Var.f125266b);
                jSONArray.put(jSONObject);
            }
        } catch (java.lang.Exception e17) {
            int i17 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.printErrStackTrace("Finder.SearchFeedInfoCollector", e17, "report", new java.lang.Object[0]);
        }
        int i18 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("Finder.SearchFeedInfoCollector", "report:" + jSONArray, null);
        return jSONArray;
    }
}
