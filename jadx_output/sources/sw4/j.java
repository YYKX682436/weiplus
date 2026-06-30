package sw4;

/* loaded from: classes8.dex */
public class j extends com.tencent.mm.plugin.webview.luggage.jsapi.q5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sw4.e f413487a;

    public j(sw4.k kVar, sw4.e eVar) {
        this.f413487a = eVar;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.q5
    public void a(java.lang.String str, org.json.JSONObject jSONObject) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("err_msg", str);
        bundle.putString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, jSONObject != null ? jSONObject.toString() : "");
        this.f413487a.f(bundle);
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.q5
    public void b(java.lang.String str, org.json.JSONObject jSONObject) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("event", str);
        bundle.putString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, jSONObject != null ? jSONObject.toString() : "");
        this.f413487a.a(bundle);
    }
}
