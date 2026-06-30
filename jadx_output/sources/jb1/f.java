package jb1;

/* loaded from: classes7.dex */
public final class f extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 722;
    private static final java.lang.String NAME = "closeBLEPeripheralServer";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l env, org.json.JSONObject jSONObject, int i17) {
        kotlin.jvm.internal.o.g(env, "env");
        if (jSONObject == null || !jSONObject.has("serverId")) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BLE.JsApiCloseBlePeripheralServer", "createBLEPeripheralServer data is invalid");
            qb1.a.a(this, i17, env, 10013, "fail:invalid data", null, 16, null);
            return;
        }
        int optInt = jSONObject.optInt("serverId");
        jb1.d0 d0Var = jb1.d0.f298705a;
        boolean z17 = false;
        if (!jb1.d0.f298709e) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) jb1.d0.f298706b;
            jb1.a0 a0Var = (jb1.a0) concurrentHashMap.get(java.lang.Integer.valueOf(optInt));
            if (a0Var != null) {
                a0Var.c();
                if (concurrentHashMap.remove(java.lang.Integer.valueOf(optInt)) != null) {
                    z17 = true;
                }
            }
        }
        if (z17) {
            qb1.a.b(this, i17, env, null);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BLE.JsApiCloseBlePeripheralServer", "invoke: fail: #" + optInt + " server is not exists");
        qb1.a.a(this, i17, env, 10020, "fail: no server", null, 16, null);
    }
}
