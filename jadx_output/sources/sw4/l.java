package sw4;

/* loaded from: classes8.dex */
public class l extends com.tencent.mm.plugin.webview.luggage.jsapi.q5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.ipc.JsApiMMTask f413488a;

    public l(com.tencent.mm.plugin.webview.luggage.ipc.JsApiMMTask jsApiMMTask) {
        this.f413488a = jsApiMMTask;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.q5
    public void a(java.lang.String str, org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.webview.luggage.ipc.JsApiMMTask jsApiMMTask = this.f413488a;
        jsApiMMTask.f182233i = str;
        if (jSONObject != null) {
            jsApiMMTask.f182234m = jSONObject.toString();
        }
        jsApiMMTask.c();
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.q5
    public void b(java.lang.String str, org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.webview.luggage.ipc.JsApiMMTask jsApiMMTask = this.f413488a;
        jsApiMMTask.f182235n = str;
        if (jSONObject != null) {
            jsApiMMTask.f182234m = jSONObject.toString();
        }
        jsApiMMTask.c();
    }
}
