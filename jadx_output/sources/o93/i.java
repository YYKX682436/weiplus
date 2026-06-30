package o93;

/* loaded from: classes7.dex */
public class i {

    /* renamed from: e, reason: collision with root package name */
    public static o93.i f343729e;

    /* renamed from: a, reason: collision with root package name */
    public final o93.a f343730a = new o93.a();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f343731b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final o93.h f343732c = new o93.h();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Set f343733d;

    public i() {
        java.lang.String str;
        java.util.HashSet hashSet = new java.util.HashSet(128);
        this.f343733d = hashSet;
        ((yb1.t) ((com.tencent.mm.plugin.lite.api.i) i95.n0.c(com.tencent.mm.plugin.lite.api.i.class))).getClass();
        str = com.tencent.mm.plugin.appbrand.jsapi.chatbot.JsApiGenRedPackageCover.NAME;
        hashSet.add(str);
    }

    public static o93.i b() {
        if (f343729e == null) {
            synchronized (o93.i.class) {
                f343729e = new o93.i();
            }
        }
        return f343729e;
    }

    public void a(int i17, java.lang.String str) {
        java.util.HashMap hashMap = this.f343731b;
        if (!hashMap.containsKey(java.lang.Integer.valueOf(i17))) {
            com.tencent.mars.xlog.Log.e("WxaLiteApp.LiteAppJsApiService", "[-] callbackJsApi: can not find callback with id: %s. data: %s", java.lang.Integer.valueOf(i17), str);
            return;
        }
        jd.c cVar = (jd.c) hashMap.get(java.lang.Integer.valueOf(i17));
        java.lang.String str2 = cVar.f299027d;
        if (str2.equals(yc1.s.NAME) || str2.equals(com.tencent.mm.plugin.appbrand.jsapi.v5.NAME) || str2.equals(com.tencent.mm.plugin.appbrand.jsapi.media.c4.NAME)) {
            com.tencent.mm.plugin.lite.LiteAppCenter.jsApiCallback(cVar.f299025b, cVar.f299024a, cVar.f299026c, cVar.f299027d, i17, str, false, cVar.f299029f);
        } else {
            java.lang.String str3 = "";
            boolean z17 = false;
            if (((java.util.HashSet) this.f343733d).contains(cVar.f299027d)) {
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                    if (jSONObject.getInt("errno") == 0) {
                        cVar.f(jSONObject, false);
                    } else {
                        cVar.c(jSONObject.has("errMsg") ? jSONObject.getString("errMsg") : "", jSONObject, false);
                    }
                    z17 = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("WxaLiteApp.LiteAppJsApiService", th6, "[-] Fail to parse json data: %s", str);
                }
            }
            if (!z17) {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                try {
                    jSONObject2.put("result", true);
                    jSONObject2.put("errMsg", "");
                    if (str != null) {
                        str3 = str;
                    }
                    jSONObject2.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, new org.json.JSONObject(str3));
                } catch (org.json.JSONException e17) {
                    com.tencent.mars.xlog.Log.e("WxaLiteApp.LiteAppJsApiService", "exception " + e17.toString());
                }
                com.tencent.mm.plugin.lite.LiteAppCenter.jsApiCallback(cVar.f299025b, cVar.f299024a, cVar.f299026c, cVar.f299027d, i17, jSONObject2.toString(), false, cVar.f299029f);
            }
        }
        hashMap.remove(java.lang.Integer.valueOf(i17));
    }
}
