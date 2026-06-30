package ib1;

/* loaded from: classes7.dex */
public class l extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 178;
    private static final java.lang.String NAME = "getBluetoothDevices";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.util.ArrayList arrayList;
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.l.a(166);
        java.lang.String appId = lVar.getAppId();
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = appId;
        objArr[1] = jSONObject == null ? "" : jSONObject;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetBluetoothDevices", "appId:%s getBluetoothDevices data:%s", objArr);
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.e b17 = com.tencent.mm.plugin.appbrand.jsapi.bluetooth.b.b(appId);
        if (b17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetBluetoothDevices", "bleWorker is null, may not open ble");
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("errCode", 10000);
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            hashMap.put("errno", 1500101);
            lVar.a(i17, t("fail:not init", hashMap));
            com.tencent.mm.plugin.appbrand.jsapi.bluetooth.l.b(be1.r0.CTRL_INDEX, 170);
            return;
        }
        if (!qb1.b.b()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetBluetoothDevices", "adapter is null or not enabled!");
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put("errCode", 10001);
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            hashMap2.put("errno", 1500102);
            lVar.a(i17, t("fail:not available", hashMap2));
            com.tencent.mm.plugin.appbrand.jsapi.bluetooth.l.b(be1.r0.CTRL_INDEX, 172);
            return;
        }
        kb1.c i18 = b17.i();
        java.util.List list = null;
        if (i18 != null) {
            pb1.i iVar = i18.f306223b;
            synchronized (iVar) {
                arrayList = iVar.f353143d == null ? new java.util.ArrayList() : new java.util.ArrayList(((java.util.HashMap) iVar.f353143d).values());
            }
        } else {
            arrayList = null;
        }
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        if (arrayList != null) {
            boolean optBoolean = jSONObject != null ? jSONObject.optBoolean("useOldImpl", false) : false;
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetBluetoothDevices", "useOldImpl: " + optBoolean);
            kb1.c i19 = b17.i();
            if (i19 != null) {
                lb1.i iVar2 = i19.f306222a;
                list = optBoolean ? iVar2.a() : iVar2.c(lb1.h.f317706a);
            }
            arrayList.addAll(list);
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                try {
                    jSONArray.put(((ob1.f) it.next()).a());
                } catch (org.json.JSONException e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiGetBluetoothDevices", e17, "", new java.lang.Object[0]);
                }
            }
        }
        try {
            jSONObject2.put("errMsg", k() + ":ok");
            jSONObject2.put("devices", jSONArray);
        } catch (org.json.JSONException e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetBluetoothDevices", "put json value error : %s", android.util.Log.getStackTraceString(e18));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetBluetoothDevices", "retJson %s", jSONObject2);
        lVar.a(i17, jSONObject2.toString());
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.l.a(com.tencent.thumbplayer.core.common.TPPixelFormat.TP_PIX_FMT_MEDIACODEC);
    }
}
