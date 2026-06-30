package pc1;

/* loaded from: classes7.dex */
public class a extends android.content.BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        boolean z17;
        if (intent == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BeaconManager", "Receive intent failed");
            return;
        }
        android.bluetooth.BluetoothAdapter defaultAdapter = android.bluetooth.BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null) {
            int state = defaultAdapter.getState();
            com.tencent.mars.xlog.Log.i("MicroMsg.BeaconManager", "state:%d", java.lang.Integer.valueOf(state));
            boolean z18 = state == 12;
            boolean z19 = pc1.e.f353350c;
            if ((z19 && !z18) || (!z19 && z18)) {
                for (pc1.d dVar : ((java.util.concurrent.ConcurrentHashMap) pc1.e.f353348a).values()) {
                    synchronized (dVar) {
                        z17 = dVar.f353344e;
                    }
                    if (z17 && !z18) {
                        dVar.a();
                    }
                    pc1.c cVar = dVar.f353343d;
                    if (cVar != null) {
                        pc1.h hVar = (pc1.h) cVar;
                        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiStartBeaconDiscovery", "onBluetoothStateChange:%b", java.lang.Boolean.valueOf(z18));
                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                        try {
                            jSONObject.put("available", z18);
                            jSONObject.put("discovering", false);
                        } catch (org.json.JSONException e17) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiStartBeaconDiscovery", "put JSON data error : %s", e17);
                        }
                        jSONObject.toString();
                        com.tencent.mm.plugin.appbrand.jsapi.l lVar = hVar.f353359c;
                        int componentId = lVar.getComponentId();
                        pc1.j jVar = hVar.f353358b;
                        jVar.p(lVar);
                        jVar.f82376h = componentId;
                        jVar.f82374f = jSONObject.toString();
                        jVar.m();
                    }
                }
            }
            pc1.e.f353350c = z18;
        }
    }
}
