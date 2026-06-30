package pb1;

/* loaded from: classes7.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pb1.i f353132d;

    public c(pb1.i iVar) {
        this.f353132d = iVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.ArrayList arrayList;
        if (this.f353132d.f353144e.get()) {
            synchronized (this.f353132d) {
                arrayList = new java.util.ArrayList(this.f353132d.f353147h);
                ((java.util.ArrayList) this.f353132d.f353147h).clear();
            }
            ob1.l lVar = this.f353132d.f353154o;
            if (lVar != null && arrayList.size() > 0) {
                com.tencent.mm.plugin.appbrand.jsapi.l lVar2 = ((ib1.i0) lVar).f290068a;
                if (lVar2 == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.JsApiStartBluetoothDevicesDiscovery", "OnBluetoothAdapterStateChangeEvent dispatch fail, service is null");
                } else {
                    org.json.JSONArray jSONArray = new org.json.JSONArray();
                    java.util.Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        try {
                            jSONArray.put(((ob1.f) it.next()).a());
                        } catch (org.json.JSONException e17) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiStartBluetoothDevicesDiscovery", "put JSON data error : %s", e17);
                        }
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
                    com.tencent.mars.xlog.Log.i("MicroMsg.JsApiStartBluetoothDevicesDiscovery", "OnBluetoothDeviceFoundEvent %s", jSONObject.toString());
                }
            }
            pb1.i iVar = this.f353132d;
            iVar.f353146g.postDelayed(iVar.f353148i, kb1.b.a().f306217a);
        }
    }
}
