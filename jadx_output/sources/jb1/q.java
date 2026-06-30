package jb1;

/* loaded from: classes7.dex */
public final class q extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 725;
    private static final java.lang.String NAME = "startBLEPeripheralAdvertising";

    /* renamed from: g, reason: collision with root package name */
    public static final jb1.n f298742g = new jb1.n(null);

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l env, org.json.JSONObject jSONObject, int i17) {
        kotlin.jvm.internal.o.g(env, "env");
        if (!qb1.b.b()) {
            qb1.a.a(this, i17, env, 10001, "fail:not available", null, 16, null);
            com.tencent.mars.xlog.Log.i("MicroMsg.BLE.JsApiStartBlePeripheralAdvertising", "invoke: Ble is not available");
        } else {
            ((ku5.t0) ku5.t0.f312615d).h(new jb1.o(this, jSONObject, i17, env), "MicroMsg.BLE.Peripheral");
        }
    }
}
