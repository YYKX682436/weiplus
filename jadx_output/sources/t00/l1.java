package t00;

/* loaded from: classes.dex */
public final class l1 implements t00.r0 {
    @Override // t00.r0
    public t00.m a() {
        t00.m mVar = t00.n.f414320a;
        return t00.n.f414328i;
    }

    @Override // t00.r0
    public void c(int i17, android.content.Context context, org.json.JSONObject data, c00.n3 callback, org.json.JSONObject jSONObject) {
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(callback, "callback");
        org.json.JSONObject optJSONObject = data.optJSONObject("logInfo");
        java.lang.String optString = optJSONObject != null ? optJSONObject.optString("logStr") : null;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            java.lang.String optString2 = optJSONObject != null ? optJSONObject.optString("logLevel") : null;
            if (kotlin.jvm.internal.o.b(optString2, "warning")) {
                com.tencent.mars.xlog.Log.w("[Ecs jsapi log]", optString);
            } else if (kotlin.jvm.internal.o.b(optString2, "error")) {
                com.tencent.mars.xlog.Log.e("[Ecs jsapi log]", optString);
            } else {
                com.tencent.mars.xlog.Log.i("[Ecs jsapi log]", optString);
            }
        }
        callback.b(null);
    }
}
