package qf1;

/* loaded from: classes13.dex */
public class k implements rf1.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f362274a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qf1.m f362275b;

    public k(qf1.m mVar, com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        this.f362275b = mVar;
        this.f362274a = lVar;
    }

    @Override // rf1.c
    public void a(rf1.h hVar) {
        if (!hVar.a()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiStartWifi", "onConnect, wifiItem is invalid");
            return;
        }
        try {
            qf1.c cVar = new qf1.c();
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("wifi", hVar.b());
            cVar.p(this.f362274a);
            cVar.f82376h = 0;
            cVar.t(hashMap);
            cVar.m();
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiStartWifi", "onConnect error");
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiStartWifi", e17, "", new java.lang.Object[0]);
        }
    }

    @Override // rf1.c
    public void b(rf1.h hVar) {
        if (!hVar.a()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiStartWifi", "onConnectAcceptIncomplete, wifiItem is invalid");
            return;
        }
        try {
            qf1.d dVar = new qf1.d();
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("wifi", hVar.b());
            dVar.p(this.f362274a);
            dVar.f82376h = 0;
            dVar.t(hashMap);
            dVar.m();
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiStartWifi", "onConnectAcceptIncomplete error");
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiStartWifi", e17, "", new java.lang.Object[0]);
        }
    }

    @Override // rf1.c
    public void h() {
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f362274a;
        this.f362275b.getClass();
        try {
            qf1.c cVar = new qf1.c();
            java.util.HashMap hashMap = new java.util.HashMap();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("SSID", "");
            jSONObject.put("BSSID", "");
            hashMap.put("wifi", jSONObject);
            cVar.p(lVar);
            cVar.f82376h = 0;
            cVar.t(hashMap);
            cVar.m();
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiStartWifi", "mWiFiEventReceiver is error");
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiStartWifi", e17, "", new java.lang.Object[0]);
        }
    }
}
