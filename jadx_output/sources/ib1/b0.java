package ib1;

/* loaded from: classes7.dex */
public class b0 extends com.tencent.mm.plugin.appbrand.jsapi.n5 {
    private static final int CTRL_INDEX = 189;
    private static final java.lang.String NAME = "onBluetoothAdapterStateChange";

    public static void u(com.tencent.mm.plugin.appbrand.jsapi.l lVar, boolean z17, boolean z18) {
        if (lVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOpenBluetoothAdapter", "OnBluetoothAdapterStateChangeEvent dispatch fail, service is null");
            return;
        }
        ib1.b0 b0Var = new ib1.b0();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.remove("available");
            jSONObject.put("available", z17);
            jSONObject.remove("discovering");
            jSONObject.put("discovering", z18);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOpenBluetoothAdapter", "put JSON data error : %s", e17);
        }
        int componentId = lVar.getComponentId();
        b0Var.p(lVar);
        b0Var.f82376h = componentId;
        b0Var.f82374f = jSONObject.toString();
        b0Var.m();
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenBluetoothAdapter", "OnBluetoothAdapterStateChange %s", jSONObject.toString());
    }
}
