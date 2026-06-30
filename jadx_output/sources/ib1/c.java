package ib1;

/* loaded from: classes7.dex */
public class c extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 174;
    private static final java.lang.String NAME = "closeBluetoothAdapter";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.l.a(116);
        java.lang.String appId = lVar.getAppId();
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiCloseBluetoothAdapter", "appId:%s closeBluetoothAdapter!", appId);
        ob1.m a17 = com.tencent.mm.plugin.appbrand.jsapi.bluetooth.b.a(appId);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiCloseBluetoothAdapter", "result:%s", a17);
        if (a17.f344038a != 0) {
            lVar.a(i17, r(a17.f344039b, a17.f344040c, null));
            com.tencent.mm.plugin.appbrand.jsapi.bluetooth.l.a(118);
            return;
        }
        java.lang.String str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("errno", 0);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        lVar.a(i17, u(str, jSONObject2));
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.l.a(117);
    }
}
