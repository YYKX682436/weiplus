package yc1;

/* loaded from: classes7.dex */
public class a0 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 347;
    public static final java.lang.String NAME = "operateSocketTask";

    /* renamed from: g, reason: collision with root package name */
    public boolean f460757g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f460758h = false;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f460759i = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: m, reason: collision with root package name */
    public final uh1.p0 f460760m;

    public a0(uh1.p0 p0Var) {
        this.f460760m = p0Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        uh1.p0 p0Var;
        if (!this.f460759i.getAndSet(true) && (p0Var = this.f460760m) != null) {
            this.f460757g = p0Var.a(lVar.getAppId());
            this.f460758h = p0Var.b(lVar.getAppId());
        }
        if (jSONObject == null) {
            lVar.a(i17, o("fail:data is null"));
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOperateSocketTask", "data is null");
            return;
        }
        java.lang.String optString = jSONObject.optString("socketTaskId");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOperateSocketTask", "taskId is null");
            lVar.a(i17, o("fail:taskId is null or nil"));
            return;
        }
        java.lang.String optString2 = jSONObject.optString("operationType");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString2)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOperateSocketTask", "operationType is null");
            lVar.a(i17, o("fail:operationType is null or nil"));
            return;
        }
        java.util.concurrent.atomic.AtomicInteger atomicInteger = uh1.t0.f427904b;
        mf1.i a17 = uh1.s0.f427901a.a(lVar.getAppId());
        if (a17 == null) {
            lVar.a(i17, o("fail:no task"));
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiOperateSocketTask", "client is null");
            return;
        }
        mf1.k a18 = a17.a(optString);
        if (a18 == null) {
            lVar.a(i17, o("fail:taskID not exist"));
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiOperateSocketTask", "webSocketClient is null");
            return;
        }
        if (optString2.equals("close")) {
            int optInt = jSONObject.optInt("code", 1000);
            if (optInt != 1000 && (optInt < 3000 || optInt >= 5000)) {
                lVar.a(i17, o("fail:The code must be either 1000, or between 3000 and 4999"));
                return;
            }
            java.lang.String optString3 = jSONObject.optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_REASON, "");
            a17.g(a18, optInt, optString3);
            lVar.a(i17, o("ok"));
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOperateSocketTask", "closeSocket taskId:%s, code %d, reason %s", optString, java.lang.Integer.valueOf(optInt), optString3);
            return;
        }
        if (!optString2.equals("send")) {
            lVar.a(i17, o("fail:unknown operationType"));
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiOperateSocketTask", "sendSocketMessage fail:unknown operationType");
            return;
        }
        if (!a17.d(a18)) {
            lVar.a(i17, o("fail:don't send before socket connected"));
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiOperateSocketTask", "send fail taskId: %s", optString);
            return;
        }
        java.lang.Object opt = jSONObject.opt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
        if (opt == null) {
            lVar.a(i17, o("fail:message is null or nil"));
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiOperateSocketTask", "sendSocketMessage fail:%s", opt);
            return;
        }
        try {
            if (opt instanceof java.nio.ByteBuffer) {
                a17.e(a18, (java.nio.ByteBuffer) opt);
                ((ch1.c) ((com.tencent.mm.plugin.appbrand.profile.a) nd.f.d(com.tencent.mm.plugin.appbrand.profile.a.class, true))).c(972L, 4L, 1L, false);
            } else if (!(opt instanceof java.lang.String)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.JsApiOperateSocketTask", "sendSocketMessage error message type wrong");
                lVar.a(i17, o("fail:unknown data"));
                return;
            } else {
                a17.b(a18, (java.lang.String) opt);
                ((ch1.c) ((com.tencent.mm.plugin.appbrand.profile.a) nd.f.d(com.tencent.mm.plugin.appbrand.profile.a.class, true))).c(972L, 4L, 1L, false);
            }
            lVar.a(i17, o("ok"));
        } catch (java.lang.Exception e17) {
            lVar.a(i17, o("fail:" + e17.getMessage()));
            if (this.f460757g || this.f460758h) {
                ((ch1.c) ((com.tencent.mm.plugin.appbrand.profile.a) nd.f.d(com.tencent.mm.plugin.appbrand.profile.a.class, true))).c(972L, 6L, 1L, false);
            } else {
                ((ch1.c) ((com.tencent.mm.plugin.appbrand.profile.a) nd.f.d(com.tencent.mm.plugin.appbrand.profile.a.class, true))).c(972L, 5L, 1L, false);
            }
        }
    }
}
