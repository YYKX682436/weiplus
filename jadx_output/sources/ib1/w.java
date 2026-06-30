package ib1;

/* loaded from: classes7.dex */
public class w implements ob1.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f290090a;

    public w(ib1.t tVar, com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        this.f290090a = lVar;
    }

    @Override // ob1.j
    public void a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f290090a;
        if (lVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOpenBluetoothAdapter", "OnBLECharacteristicValueChangeEvent dispatch fail, service is null");
            return;
        }
        ib1.y yVar = new ib1.y();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.remove("value");
            jSONObject.put("value", str4);
            jSONObject.remove("deviceId");
            jSONObject.put("deviceId", str);
            jSONObject.remove("serviceId");
            jSONObject.put("serviceId", str2);
            jSONObject.remove("characteristicId");
            jSONObject.put("characteristicId", str3);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOpenBluetoothAdapter", "put JSON data error : %s", e17);
        }
        int componentId = lVar.getComponentId();
        yVar.p(lVar);
        yVar.f82376h = componentId;
        yVar.f82374f = jSONObject.toString();
        yVar.m();
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenBluetoothAdapter", "OnBLECharacteristicValueChangeEvent %s", jSONObject.toString());
    }
}
