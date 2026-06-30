package qf1;

/* loaded from: classes13.dex */
public class j extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 317;
    public static final java.lang.String NAME = "getWifiList";

    public static void C(qf1.j jVar, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17, android.content.Context context, rf1.i iVar) {
        jVar.getClass();
        if (!iVar.f394627a.equals("ok")) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetWifiList", "error, mErrorMsg:%s", iVar.f394627a);
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("errCode", 12010);
            java.lang.String str = "fail:" + iVar.f394627a;
            if (str == null) {
                str = "fail:internal error";
            }
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            hashMap.put("errno", 4);
            lVar.a(i17, jVar.t(str, hashMap));
            return;
        }
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetWifiList", "onGetWifiList size:%d", java.lang.Integer.valueOf(((java.util.ArrayList) iVar.f394628b).size()));
            if (((java.util.ArrayList) iVar.f394628b).size() == 0) {
                if (!com.tencent.mm.sdk.platformtools.n2.a()) {
                    java.util.HashMap hashMap2 = new java.util.HashMap();
                    hashMap2.put("errCode", 12006);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                    hashMap2.put("errno", 1505003);
                    lVar.a(i17, jVar.t("fail:may be not open GPS", hashMap2));
                    com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetWifiList", "wifiList is empty, may be not open GPS");
                    return;
                }
                boolean b17 = nf.t.b(context, lVar, "android.permission.ACCESS_FINE_LOCATION");
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetWifiList", "checkLocation:%b", java.lang.Boolean.valueOf(b17));
                if (!b17) {
                    java.util.HashMap hashMap3 = new java.util.HashMap();
                    hashMap3.put("errCode", 12012);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                    hashMap3.put("errno", 1505004);
                    lVar.a(i17, jVar.t("fail:may be not obtain GPS Perrmission", hashMap3));
                    com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetWifiList", "wifiList is empty, may be not obtain GPS Perrmission");
                    return;
                }
            }
            java.util.HashMap hashMap4 = new java.util.HashMap();
            hashMap4.put("errCode", 0);
            java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
            hashMap4.put("errno", 0);
            lVar.a(i17, jVar.t("ok", hashMap4));
            qf1.i iVar2 = new qf1.i();
            java.util.HashMap hashMap5 = new java.util.HashMap();
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            java.util.Iterator it = ((java.util.ArrayList) iVar.f394628b).iterator();
            while (it.hasNext()) {
                jSONArray.put(((rf1.h) it.next()).b());
            }
            hashMap5.put("wifiList", jSONArray);
            iVar2.p(lVar);
            iVar2.f82376h = 0;
            iVar2.t(hashMap5);
            iVar2.m();
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiGetWifiList", e17, "", new java.lang.Object[0]);
            java.util.HashMap hashMap6 = new java.util.HashMap();
            hashMap6.put("errCode", 12010);
            java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
            hashMap6.put("errno", 4);
            lVar.a(i17, jVar.t("fail:parse json err", hashMap6));
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        android.content.Context context = lVar.getContext();
        if (context == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetWifiList", "mContext is null, invoke fail!");
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("errCode", 12010);
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            hashMap.put("errno", 4);
            lVar.a(i17, t("fail:context is null", hashMap));
            return;
        }
        if (!qf1.m.f362278g) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetWifiList", "not invoke startWifi");
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put("errCode", 12000);
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            hashMap2.put("errno", 1505001);
            lVar.a(i17, t("fail:not invoke startWifi", hashMap2));
            return;
        }
        rf1.l.b(context);
        if (!sf1.s.b()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetWifiList", "wifi is disable,invoke fail!");
            java.util.HashMap hashMap3 = new java.util.HashMap();
            hashMap3.put("errCode", 12005);
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            hashMap3.put("errno", 1505002);
            lVar.a(i17, t("fail:wifi is disable", hashMap3));
            return;
        }
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean(false);
        com.tencent.mm.sdk.platformtools.b4 b4Var = new com.tencent.mm.sdk.platformtools.b4(android.os.Looper.getMainLooper(), (com.tencent.mm.sdk.platformtools.a4) new qf1.g(this, atomicBoolean, lVar, i17, context), false);
        qf1.h hVar = new qf1.h(this, b4Var, atomicBoolean, lVar, i17, context);
        com.tencent.mars.xlog.Log.i("MicroMsg.WiFiManagerWrapper", "getWifiListAsync");
        rf1.l.f394631c = null;
        if (rf1.l.f394629a && sf1.s.b()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WiFiManagerWrapper", "getWifiListAsync, startScan");
            sf1.s.d();
            rf1.l.f394635g = hVar;
        } else {
            rf1.i iVar = new rf1.i();
            if (rf1.l.f394629a) {
                iVar.f394627a = "wifi is disable";
            } else {
                iVar.f394627a = "sdk not init";
            }
            hVar.a(iVar);
        }
        long j17 = com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT;
        if (jSONObject != null) {
            j17 = jSONObject.optLong("timeout", com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetWifiList", "invoke, getWifiListAsyncTimeoutMills: " + j17);
        b4Var.c(j17, j17);
    }
}
