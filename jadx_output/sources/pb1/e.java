package pb1;

/* loaded from: classes7.dex */
public class e extends pb1.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pb1.i f353134a;

    public e(pb1.i iVar) {
        this.f353134a = iVar;
    }

    @Override // pb1.x
    public void a(int i17, com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan.ScanResultCompat scanResultCompat) {
        if (scanResultCompat == null || scanResultCompat.a() == null) {
            com.tencent.mars.xlog.Log.e(this.f353134a.f353140a, "[onScanResult]result is null, err", new java.lang.Object[0]);
            return;
        }
        if (!this.f353134a.f353145f.get()) {
            com.tencent.mars.xlog.Log.e(this.f353134a.f353140a, "[onScanResult]not init, err", new java.lang.Object[0]);
            return;
        }
        synchronized (this.f353134a) {
            pb1.i iVar = this.f353134a;
            if (iVar.f353143d == null) {
                com.tencent.mars.xlog.Log.w(iVar.f353140a, "[onScanResult]may be close, err", new java.lang.Object[0]);
                return;
            }
            iVar.f353153n.a(i17, scanResultCompat);
            java.lang.String address = scanResultCompat.a().getAddress();
            boolean z17 = !((java.util.HashMap) this.f353134a.f353143d).containsKey(address) || kb1.b.a().f306218b;
            ob1.f fVar = new ob1.f(scanResultCompat);
            ((java.util.HashMap) this.f353134a.f353143d).put(address, fVar);
            if (z17) {
                if (kb1.b.a().f306217a > 0) {
                    synchronized (this.f353134a) {
                        java.util.List list = this.f353134a.f353147h;
                        if (list != null) {
                            ((java.util.ArrayList) list).add(fVar);
                        }
                    }
                    return;
                }
                ob1.l lVar = this.f353134a.f353154o;
                if (lVar != null) {
                    com.tencent.mm.plugin.appbrand.jsapi.l lVar2 = ((ib1.i0) lVar).f290068a;
                    if (lVar2 == null) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.JsApiStartBluetoothDevicesDiscovery", "OnBluetoothAdapterStateChangeEvent dispatch fail, service is null");
                        return;
                    }
                    org.json.JSONArray jSONArray = new org.json.JSONArray();
                    try {
                        jSONArray.put(fVar.a());
                    } catch (org.json.JSONException e17) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.JsApiStartBluetoothDevicesDiscovery", "put JSON data error : %s", e17);
                    }
                    ib1.j0 j0Var = new ib1.j0();
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    try {
                        jSONObject.remove("devices");
                        jSONObject.put("devices", jSONArray);
                    } catch (org.json.JSONException e18) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.JsApiStartBluetoothDevicesDiscovery", "put JSON data error : %s", e18);
                    }
                    int componentId = lVar2.getComponentId();
                    j0Var.p(lVar2);
                    j0Var.f82376h = componentId;
                    j0Var.f82374f = jSONObject.toString();
                    j0Var.m();
                    if (pb1.b.f353128d) {
                        jSONObject.toString();
                    }
                }
            }
        }
    }
}
