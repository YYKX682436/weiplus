package jb1;

/* loaded from: classes7.dex */
public final class t extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 727;
    private static final java.lang.String NAME = "writeBLEPeripheralCharacteristicValue";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l env, org.json.JSONObject jSONObject, int i17) {
        kotlin.jvm.internal.o.g(env, "env");
        if (!qb1.b.b()) {
            qb1.a.a(this, i17, env, 10001, "fail:not available", null, 16, null);
            com.tencent.mars.xlog.Log.i("MicroMsg.BLE.JsApiWriteBlePeripheralCharacteristicValue", "invoke: Ble is not available");
            return;
        }
        if (jSONObject == null || !jSONObject.has("serverId")) {
            qb1.a.a(this, i17, env, 10013, "fail:invalid data", null, 16, null);
            return;
        }
        jb1.a0 b17 = jb1.d0.f298705a.b(jSONObject.optInt("serverId"));
        if (b17 == null) {
            qb1.a.a(this, i17, env, 10020, "fail: no server", null, 16, null);
            return;
        }
        if (b17.f298688a != jb1.e0.f298712f) {
            qb1.a.a(this, i17, env, 10000, "fail:not init", null, 16, null);
            return;
        }
        try {
            java.lang.String optString = jSONObject.optString("serviceId", "");
            java.lang.String optString2 = jSONObject.optString("characteristicId", "");
            boolean optBoolean = jSONObject.optBoolean("needNotify", false);
            int optInt = jSONObject.optInt("callbackId", -1);
            java.lang.String optString3 = jSONObject.optString("value");
            com.tencent.mars.xlog.Log.i("MicroMsg.BLE.JsApiWriteBlePeripheralCharacteristicValue", "invoke: write = " + optString3 + " serviceId = %s, characteristicId = %s, needNotify = %s, jCallbackId = %s", optString, optString2, java.lang.String.valueOf(optBoolean), java.lang.String.valueOf(optInt));
            java.util.UUID a17 = rb1.a.a(optString);
            kotlin.jvm.internal.o.f(a17, "fromString(...)");
            java.util.UUID a18 = rb1.a.a(optString2);
            kotlin.jvm.internal.o.f(a18, "fromString(...)");
            kotlin.jvm.internal.o.d(optString3);
            b17.b(a17, a18, optBoolean, optInt, optString3);
            qb1.a.b(this, i17, env, null);
        } catch (java.lang.IllegalArgumentException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BLE.JsApiWriteBlePeripheralCharacteristicValue", "invoke: fail: " + e17);
            qb1.a.a(this, i17, env, 10013, "fail:invalid data", null, 16, null);
        } catch (org.json.JSONException e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BLE.JsApiWriteBlePeripheralCharacteristicValue", "invoke: fail: " + e18);
            qb1.a.a(this, i17, env, 10013, "fail:invalid data", null, 16, null);
        }
    }
}
