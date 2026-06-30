package jb1;

/* loaded from: classes7.dex */
public final class j extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 724;
    private static final java.lang.String NAME = "removeBLEPeripheralService";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l env, org.json.JSONObject jSONObject, int i17) {
        kotlin.jvm.internal.o.g(env, "env");
        if (!qb1.b.b()) {
            qb1.a.a(this, i17, env, 10001, "fail:not available", null, 16, null);
            com.tencent.mars.xlog.Log.i("MicroMsg.BLE.JsApiRemoveBlePeripheralService", "invoke: Ble is not available");
            return;
        }
        if (jSONObject == null || !jSONObject.has("serverId") || !jSONObject.has("serviceId")) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BLE.JsApiRemoveBlePeripheralService", "invoke data is invalid");
            qb1.a.a(this, i17, env, 10013, "fail:invalid data", null, 16, null);
            return;
        }
        jb1.a0 b17 = jb1.d0.f298705a.b(jSONObject.optInt("serverId"));
        if (b17 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BLE.JsApiRemoveBlePeripheralService", "invoke: retrieve a null server");
            qb1.a.a(this, i17, env, 10020, "fail: no server", null, 16, null);
            return;
        }
        try {
            java.util.UUID a17 = rb1.a.a(jSONObject.optString("serviceId"));
            kotlin.jvm.internal.o.f(a17, "fromString(...)");
            android.bluetooth.BluetoothGattService service = b17.a().getService(a17);
            if (service == null) {
                qb1.a.a(this, i17, env, com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NOT_VALID, "fail:no service", null, 16, null);
                return;
            }
            if (!qb1.a.d("android.permission.BLUETOOTH_CONNECT")) {
                qb1.a.a(this, i17, env, 3, "fail:system permission denied", null, 16, null);
                return;
            }
            try {
                if (b17.a().removeService(service)) {
                    qb1.a.b(this, i17, env, null);
                } else {
                    qb1.a.a(this, i17, env, 10008, "fail: remove #" + a17 + " service fail", null, 16, null);
                }
            } catch (java.lang.SecurityException unused) {
                qb1.a.a(this, i17, env, 3, "fail:system permission denied", null, 16, null);
            }
        } catch (java.lang.Exception unused2) {
            qb1.a.a(this, i17, env, 10013, "fail:invalid data", null, 16, null);
        }
    }
}
