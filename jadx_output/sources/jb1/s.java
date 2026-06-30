package jb1;

/* loaded from: classes7.dex */
public final class s extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 726;
    private static final java.lang.String NAME = "stopBLEPeripheralAdvertising";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l env, org.json.JSONObject jSONObject, int i17) {
        kotlin.jvm.internal.o.g(env, "env");
        if (jSONObject == null || !jSONObject.has("serverId")) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BLE.JsApiStopBlePeripheralAdvertising", "createBLEPeripheralServer data is invalid");
            qb1.a.a(this, i17, env, 10013, "fail:invalid data", null, 16, null);
        } else {
            ((ku5.t0) ku5.t0.f312615d).h(new jb1.r(jSONObject, this, i17, env), "MicroMsg.BLE.Peripheral");
        }
    }
}
