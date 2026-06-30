package jb1;

/* loaded from: classes7.dex */
public abstract class a {
    public static final void a(com.tencent.mm.plugin.appbrand.jsapi.l component, java.lang.String deviceID, java.lang.String serverID, boolean z17) {
        kotlin.jvm.internal.o.g(component, "component");
        kotlin.jvm.internal.o.g(deviceID, "deviceID");
        kotlin.jvm.internal.o.g(serverID, "serverID");
        com.tencent.mars.xlog.Log.i("MicroMsg.BLE.BlePeripheralPublishEventFuns", "jOnBLEPeripheralConnectionStateChanged: connected = " + z17 + ", deviceID = " + deviceID + ", serverID = " + serverID);
        try {
            jb1.u uVar = new jb1.u();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("deviceId", deviceID);
            jSONObject.put("serverId", serverID);
            jSONObject.put("connected", z17);
            uVar.r(jSONObject.toString());
            uVar.p(component);
            uVar.m();
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BLE.BlePeripheralPublishEventFuns", "BlePeripheralPublishEventFuns fail", e17);
        }
    }
}
