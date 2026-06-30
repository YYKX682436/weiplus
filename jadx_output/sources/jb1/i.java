package jb1;

/* loaded from: classes7.dex */
public final class i extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 721;
    private static final java.lang.String NAME = "createBLEPeripheralServer";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l env, org.json.JSONObject jSONObject, int i17) {
        kotlin.jvm.internal.o.g(env, "env");
        if (!qb1.b.b()) {
            qb1.a.a(this, i17, env, 10001, "fail:not available", null, 16, null);
            com.tencent.mars.xlog.Log.i("MicroMsg.BLE.JsApiCreateBLEPeripheralServer", "invoke: Ble is not available");
            return;
        }
        jb1.h hVar = new jb1.h(this, i17, env);
        if (android.os.Build.VERSION.SDK_INT < 31) {
            hVar.invoke();
            return;
        }
        java.lang.String[] strArr = {"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_ADVERTISE"};
        boolean z17 = true;
        for (int i18 = 0; i18 < 2; i18++) {
            z17 = b3.l.checkSelfPermission(com.tencent.mm.sdk.platformtools.x2.f193071a, strArr[i18]) == 0;
        }
        if (z17) {
            hVar.invoke();
        } else {
            kotlinx.coroutines.l.d(com.tencent.mm.plugin.appbrand.utils.y.a(env), null, null, new com.tencent.mm.plugin.appbrand.utils.x(new jb1.g(env, i17, this, hVar), env, strArr, 144, "", "", null), 3, null);
        }
    }
}
