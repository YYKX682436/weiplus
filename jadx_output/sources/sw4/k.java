package sw4;

/* loaded from: classes8.dex */
public class k implements sw4.h {
    @Override // sw4.h
    public void a(android.content.Context context, android.os.Bundle bundle, sw4.e eVar) {
        java.lang.String string = bundle.getString("jsapi_name");
        java.lang.String string2 = bundle.getString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
        if (string == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiMMActivityTask", "jsapi is null");
            eVar.f(new android.os.Bundle());
            return;
        }
        try {
            ((com.tencent.mm.plugin.webview.luggage.jsapi.r5) java.lang.Class.forName(string).newInstance()).d(context, string2, new sw4.j(this, eVar));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiMMActivityTask", e17, "", new java.lang.Object[0]);
            eVar.f(new android.os.Bundle());
        }
    }
}
