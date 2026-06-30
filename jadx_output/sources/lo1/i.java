package lo1;

/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final lo1.i f320102a = new lo1.i();

    public final void a(boolean z17) {
        org.json.JSONObject put = new org.json.JSONObject().put("result", z17);
        kotlin.jvm.internal.o.f(put, "put(...)");
        c("remarkResult", put);
    }

    public final void b(java.lang.String deviceId, boolean z17) {
        kotlin.jvm.internal.o.g(deviceId, "deviceId");
        org.json.JSONObject put = new org.json.JSONObject().put("deviceId", deviceId).put("isConnected", z17);
        kotlin.jvm.internal.o.f(put, "put(...)");
        c("connectState", put);
    }

    public final void c(java.lang.String str, org.json.JSONObject jSONObject) {
        com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackup.RoamJsApiEvent", "post event:" + str + ", data:" + jSONObject);
        jSONObject.put("notify_type", str);
        ((xc1.t) ((ft.q4) i95.n0.c(ft.q4.class))).Ai("wxd930c3b7cf7c92e6", jSONObject.toString());
    }
}
