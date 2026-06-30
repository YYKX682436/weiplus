package il2;

/* loaded from: classes3.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static final il2.s f292086a = new il2.s();

    public final void a(zl2.e5 report, long j17) {
        kotlin.jvm.internal.o.g(report, "report");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", report.f473752d);
        jSONObject.put("remind_amount", j17);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        java.lang.String t17 = r26.i0.t(jSONObject2, ",", ";", false);
        com.tencent.mars.xlog.Log.i("QuotaReportUtil", "reportExpose json: " + jSONObject);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0.hj((ml2.r0) c17, ml2.b4.H1, t17, 0L, null, null, null, null, null, 252, null);
    }

    public final void b(zl2.e5 report, long j17) {
        kotlin.jvm.internal.o.g(report, "report");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", report.f473752d);
        jSONObject.put("total_amount", j17);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        java.lang.String t17 = r26.i0.t(jSONObject2, ",", ";", false);
        com.tencent.mars.xlog.Log.i("QuotaReportUtil", "reportExpose json: " + jSONObject);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0.hj((ml2.r0) c17, ml2.b4.H1, t17, 0L, null, null, null, null, null, 252, null);
    }
}
