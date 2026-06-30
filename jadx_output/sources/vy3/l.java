package vy3;

/* loaded from: classes.dex */
public final class l extends wy3.c {

    /* renamed from: e, reason: collision with root package name */
    public static final vy3.l f441475e = new vy3.l();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(msg.f340790a);
            int optInt = jSONObject.optInt("logid", 0);
            java.lang.String optString = jSONObject.optString("msg", "");
            kotlin.jvm.internal.o.f(optString, "optString(...)");
            jx3.f.INSTANCE.kvStat(optInt, optString);
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiReportKV", e17, "ScanJsApi-Call:reportKV exception", new java.lang.Object[0]);
            return true;
        }
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "reportKV";
    }
}
