package nd1;

/* loaded from: classes7.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.y f336338d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f336339e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f336340f;

    public m(nd1.n nVar, com.tencent.mm.plugin.appbrand.y yVar, org.json.JSONObject jSONObject, java.lang.String str) {
        this.f336338d = yVar;
        this.f336339e = jSONObject;
        this.f336340f = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.page.v5 a17 = com.tencent.mm.plugin.appbrand.jsapi.gg.a(this.f336338d);
        boolean z17 = false;
        boolean optBoolean = this.f336339e.optBoolean("ignoreWebviewPreload", false);
        int componentId = a17 != null ? a17.getComponentId() : 0;
        if (a17 != null && a17.isRunning()) {
            z17 = true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiInitReady", "invoke, appId:%s, webviewId:%s, isRunning:%b, ignoreWebviewPreload:%b, url:%s", this.f336340f, java.lang.Integer.valueOf(componentId), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(optBoolean), a17 != null ? a17.X1() : "");
        if (z17) {
            if (!optBoolean) {
                a17.t3().x0().d0(a17);
            }
            a17.D2(nd1.n.NAME);
        }
    }
}
