package xe1;

/* loaded from: classes15.dex */
public class p implements com.tencent.mm.plugin.appbrand.jsapi.w {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView f453828d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.t f453829e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f453830f;

    /* renamed from: g, reason: collision with root package name */
    public int f453831g;

    public p(com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView appBrandVideoView, com.tencent.mm.plugin.appbrand.jsapi.t tVar) {
        this.f453828d = appBrandVideoView;
        this.f453829e = tVar;
        tVar.w(this);
    }

    public final void a(com.tencent.mm.plugin.appbrand.jsapi.n5 n5Var, org.json.JSONObject jSONObject) {
        if (!(n5Var instanceof xe1.n) && !(n5Var instanceof xe1.k)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Video.JsApiVideoCallback", "dispatchEvent event %s", n5Var.k());
        }
        this.f453829e.i(n5Var.r(jSONObject.toString()), null);
    }

    public final org.json.JSONObject b() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, this.f453828d.getCookieData());
        return jSONObject;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.w
    public void onDestroy() {
        this.f453829e.K(this);
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f453830f;
        if (b4Var != null) {
            b4Var.d();
        }
        this.f453828d.setCallback(null);
    }
}
