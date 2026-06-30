package ib1;

/* loaded from: classes7.dex */
public class v implements ob1.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f290089a;

    public v(ib1.t tVar, com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        this.f290089a = lVar;
    }

    @Override // ob1.k
    public void a(java.lang.String str, boolean z17) {
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f290089a;
        synchronized (ib1.z.class) {
            if (lVar == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOpenBluetoothAdapter", "OnBLEConnectionStateChangedEvent dispatch fail, service is null");
                return;
            }
            ib1.z zVar = new ib1.z();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.remove("deviceId");
                jSONObject.put("deviceId", str);
                jSONObject.remove("connected");
                jSONObject.put("connected", z17);
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOpenBluetoothAdapter", "put JSON data error : %s", e17);
            }
            int componentId = lVar.getComponentId();
            zVar.p(lVar);
            zVar.f82376h = componentId;
            zVar.f82374f = jSONObject.toString();
            zVar.m();
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenBluetoothAdapter", "OnBLEConnectionStateChangedEvent %s", jSONObject.toString());
        }
    }
}
