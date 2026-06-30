package xq1;

/* loaded from: classes8.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final wq1.d f456028a;

    public f(wq1.d dVar) {
        this.f456028a = dVar;
    }

    public void a(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Box.BoxWebViewJSApi", "onDataReady %s %s %s", str, java.lang.Integer.valueOf(i17), str2);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("requestId", str);
            jSONObject.put("ret", i17);
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, str3);
            com.tencent.mm.sdk.platformtools.u3.h(new xq1.e(this, jSONObject));
        } catch (java.lang.Exception unused) {
        }
    }

    @android.webkit.JavascriptInterface
    public void closePage() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Box.BoxWebViewJSApi", "closePage");
        this.f456028a.dismiss();
    }

    @android.webkit.JavascriptInterface
    public void log(java.lang.String str) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            com.tencent.mars.xlog.Log.i("MicroMsg.Box.BoxWebViewJSApi", "[%s][%s]", jSONObject.optString(ya.b.LEVEL, ""), jSONObject.optString("msg", ""));
        } catch (java.lang.Exception unused) {
        }
    }

    @android.webkit.JavascriptInterface
    public void openWeAppPage(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Box.BoxWebViewJSApi", "openWeAppPage %s", str);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.lang.String optString = jSONObject.optString("userName", "");
            java.lang.String optString2 = jSONObject.optString("relativeURL", "");
            java.lang.String optString3 = jSONObject.optString("sceneNote", "");
            com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent();
            am.nx nxVar = startAppBrandUIFromOuterEvent.f54857g;
            nxVar.f7466a = optString;
            nxVar.f7467b = optString2;
            nxVar.f7469d = jSONObject.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 1000);
            nxVar.f7470e = optString3;
            startAppBrandUIFromOuterEvent.e();
        } catch (java.lang.Exception unused) {
        }
    }

    @android.webkit.JavascriptInterface
    public void reportKV(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Box.BoxWebViewJSApi", "reportKV %s", str);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            jx3.f.INSTANCE.kvStat(jSONObject.optInt("logid", 0), jSONObject.optString("msg", ""));
        } catch (java.lang.Exception unused) {
        }
    }

    @android.webkit.JavascriptInterface
    public void request(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Box.BoxWebViewJSApi", "request %s", str);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            this.f456028a.o().a(jSONObject.optString("requestId", ""), jSONObject.optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, ""));
        } catch (java.lang.Exception unused) {
        }
    }

    @android.webkit.JavascriptInterface
    public void webviewUIReady() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Box.BoxWebViewJSApi", "webviewUIReady");
        ((ku5.t0) ku5.t0.f312615d).B(new xq1.d(this));
    }
}
