package mc1;

/* loaded from: classes7.dex */
public class l extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 1077;
    public static final java.lang.String NAME = "shareInvitationToLiveRoom";

    /* renamed from: g, reason: collision with root package name */
    public static volatile boolean f325611g = true;

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = (com.tencent.mm.plugin.appbrand.service.c0) lVar;
        com.tencent.mars.xlog.Log.i("JsApiShareInvitationToLiveRoom", "invoke jsapi");
        if (!f325611g) {
            com.tencent.mars.xlog.Log.i("JsApiShareInvitationToLiveRoom", "enableInvoke is false");
            java.lang.String str = android.text.TextUtils.isEmpty(null) ? "cancel" : null;
            if (str == null) {
                str = "";
            }
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 1);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            c0Var.a(i17, u(str, jSONObject2));
            return;
        }
        f325611g = false;
        ((ku5.t0) ku5.t0.f312615d).k(new mc1.l$$a(), 300L);
        h63.r1 r1Var = (h63.r1) i95.n0.c(h63.r1.class);
        android.content.Context context = c0Var.getContext();
        java.lang.String appId = c0Var.getAppId();
        int i18 = c0Var.t3().u0().f77281g;
        mc1.l$$b l__b = new mc1.l$$b(this, c0Var, i17);
        h63.v0 v0Var = (h63.v0) r1Var;
        v0Var.getClass();
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(appId, "appId");
        if (((p60.u) i95.n0.c(p60.u.class)).Bi(appId, i18).booleanValue()) {
            ((ku5.t0) ku5.t0.f312615d).B(new h63.q0(v0Var, context, jSONObject, appId, i18, l__b));
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.GameLiveAppbrandProcessService", "startPlayGameAnchorSetting failed, not gameliving");
        }
    }
}
