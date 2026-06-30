package yf1;

/* loaded from: classes7.dex */
public class k implements xf.b {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.extendplugin.b f461644a;

    public final void a(com.tencent.mm.plugin.appbrand.jsapi.n5 n5Var, org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.appbrand.jsapi.l m17;
        if (n5Var != null) {
            if (!n5Var.k().equalsIgnoreCase("onXWebLivePlayerEvent") && !n5Var.k().equalsIgnoreCase("onXWebLivePlayerNetStatus") && !n5Var.k().equalsIgnoreCase("onXWebLivePlayerAudioVolume")) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.AppBrandLivePlayerEventHandler", "dispatch event:%s, data:%s", n5Var.k(), jSONObject.toString());
            }
            com.tencent.mm.plugin.appbrand.jsapi.n5 r17 = n5Var.r(jSONObject.toString());
            com.tencent.mm.plugin.appbrand.extendplugin.b bVar = this.f461644a;
            if (bVar == null || (m17 = bVar.m()) == null) {
                return;
            }
            if (!(m17 instanceof com.tencent.mm.plugin.appbrand.e9)) {
                if (m17 instanceof com.tencent.mm.plugin.appbrand.page.v5) {
                    ((com.tencent.mm.plugin.appbrand.page.v5) m17).i(r17, null);
                    return;
                } else {
                    m17.i(r17, null);
                    return;
                }
            }
            com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) m17;
            e9Var.i(r17, null);
            com.tencent.mm.plugin.appbrand.page.v5 V0 = e9Var.V0();
            if (V0 != null) {
                V0.i(r17, null);
            }
        }
    }

    public void b(int i17, boolean z17) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("viewId", i17);
            jSONObject.put("playInBackground", z17);
            a(new yf1.h(null), jSONObject);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SameLayer.AppBrandLivePlayerEventHandler", "onXWebLivePlayerBackgroundPlaybackChange fail", e17);
        }
    }
}
