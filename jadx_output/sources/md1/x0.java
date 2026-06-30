package md1;

/* loaded from: classes7.dex */
public class x0 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = -2;
    public static final java.lang.String NAME = "waitVoIPChat";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f325814g = "";

    /* renamed from: h, reason: collision with root package name */
    public u81.f f325815h = null;

    /* renamed from: i, reason: collision with root package name */
    public final md1.k1 f325816i = new md1.k1();

    /* renamed from: m, reason: collision with root package name */
    public volatile boolean f325817m = false;

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = (com.tencent.mm.plugin.appbrand.service.c0) lVar;
        boolean optBoolean = jSONObject.optBoolean("status", false);
        java.lang.String appId = c0Var.getAppId();
        this.f325814g = appId;
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.JsApiWaitVoIPChat", "appId:%s, data:%s", appId, jSONObject);
        gp1.v Bi = ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi();
        if (Bi != null) {
            Bi.D0(new md1.v0(this, optBoolean, c0Var));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.JsApiWaitVoIPChat", "service is null");
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
        c0Var.a(i17, u(str, jSONObject2));
    }
}
