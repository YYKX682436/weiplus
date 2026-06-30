package vg0;

/* loaded from: classes8.dex */
public final class k implements ou4.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f436458a;

    /* renamed from: b, reason: collision with root package name */
    public long f436459b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f436460c;

    public k(java.lang.ref.WeakReference callbackRef) {
        kotlin.jvm.internal.o.g(callbackRef, "callbackRef");
        this.f436458a = callbackRef;
        this.f436460c = com.tencent.mm.plugin.appbrand.jsapi.me.NAME;
    }

    @Override // ou4.c0
    public void a(java.util.Map map, ou4.b0 callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        java.lang.Object obj = map != null ? map.get("jsonParams") : null;
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (str == null) {
            str = "{}";
        }
        if (c01.id.c() - this.f436459b < 1500) {
            callback.a(kz5.b1.e(new jz5.l("ret", -1)));
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            com.tencent.mars.xlog.Log.i("WebSearchApiHandlers", "startWebSearch %s", str);
            this.f436459b = c01.id.c();
            su4.j2 j2Var = new su4.j2();
            j2Var.f412961x = java.net.URLDecoder.decode(jSONObject.optString("extParams", ""), com.tencent.mapsdk.internal.rv.f51270c);
            j2Var.f412962y = jSONObject.optString("extReqParams", "");
            tg0.q1 q1Var = (tg0.q1) this.f436458a.get();
            androidx.appcompat.app.AppCompatActivity appCompatActivity = q1Var != null ? ((rx4.e) q1Var).f401134a : null;
            j2Var.f412938a = appCompatActivity;
            if (appCompatActivity == null) {
                j2Var.f412938a = com.tencent.mm.sdk.platformtools.x2.f193071a;
            }
            j2Var.f412939b = jSONObject.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
            j2Var.f412941d = jSONObject.optString("query", "");
            j2Var.f412940c = jSONObject.optInt("type", 0);
            j2Var.f412942e = jSONObject.optString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, "");
            j2Var.f412943f = jSONObject.optBoolean("isHomePage", false);
            boolean z17 = true;
            j2Var.f412945h = true;
            j2Var.f412946i = false;
            int optInt = jSONObject.optInt("ftsNeedHideKeyBoard", 0);
            if (optInt == 1 || optInt == 2) {
                if (optInt != 1) {
                    z17 = false;
                }
                j2Var.A = z17;
            }
            j2Var.f412958u = false;
            j2Var.f412952o = i65.a.d(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.color.aaw);
            j2Var.f412953p = false;
            j2Var.f412963z = jSONObject.optString("searchPlaceHolder", "");
            ((com.tencent.mm.plugin.websearch.h2) ((su4.a1) i95.n0.c(su4.a1.class))).Vi(j2Var);
            callback.a(kz5.b1.e(new jz5.l("ret", 0)));
        } catch (java.lang.Exception unused) {
            callback.a(kz5.b1.e(new jz5.l("ret", -1)));
        }
    }

    @Override // ou4.c0
    public java.lang.String b() {
        return this.f436460c;
    }
}
