package fg1;

/* loaded from: classes7.dex */
public final class g implements dg.a {

    /* renamed from: a, reason: collision with root package name */
    public int f261865a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f261866b = "";

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.extendplugin.b f261867c;

    public final void a(com.tencent.mm.plugin.appbrand.jsapi.n5 n5Var, org.json.JSONObject jSONObject) {
        if (n5Var != null) {
            if (!(n5Var instanceof fg1.e) && !(n5Var instanceof fg1.d)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.AppBrandVideoCastEventHandler", "dispatch event:%s, data:%s", n5Var.k(), jSONObject.toString());
            }
            com.tencent.mm.plugin.appbrand.jsapi.n5 r17 = n5Var.r(jSONObject.toString());
            com.tencent.mm.plugin.appbrand.extendplugin.b bVar = this.f261867c;
            if (bVar != null) {
                kotlin.jvm.internal.o.d(bVar);
                com.tencent.mm.plugin.appbrand.jsapi.l m17 = bVar.m();
                if (m17 != null) {
                    if (!(m17 instanceof com.tencent.mm.plugin.appbrand.e9)) {
                        if (!(m17 instanceof com.tencent.mm.plugin.appbrand.page.v5)) {
                            m17.i(r17, null);
                            return;
                        } else {
                            kotlin.jvm.internal.o.d(r17);
                            ((com.tencent.mm.plugin.appbrand.page.v5) m17).i(r17, null);
                            return;
                        }
                    }
                    com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) m17;
                    kotlin.jvm.internal.o.d(r17);
                    e9Var.i(r17, null);
                    com.tencent.mm.plugin.appbrand.page.v5 V0 = e9Var.V0();
                    if (V0 != null) {
                        V0.i(r17, null);
                    }
                }
            }
        }
    }

    public final org.json.JSONObject b() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, this.f261866b);
        return jSONObject;
    }

    public void c() {
        try {
            org.json.JSONObject b17 = b();
            b17.put("timeStamp", java.lang.System.currentTimeMillis());
            b17.put("type", "DLNA");
            a(new fg1.f(), b17);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SameLayer.AppBrandVideoCastEventHandler", "OnXWebVideoWaiting fail", e17);
        }
    }

    public void d(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.AppBrandVideoCastEventHandler", "onXWebCastingUserSelect: ");
        try {
            org.json.JSONObject b17 = b();
            b17.put("type", "DLNA");
            b17.put("state", z17 ? ya.b.SUCCESS : "fail");
            a(new uf.f2(), b17);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SameLayer.AppBrandVideoCastEventHandler", "OnXWebCastingUserSelect fail", e17);
        }
    }

    public void e(boolean z17) {
        java.lang.String str = z17 ? ya.b.SUCCESS : "fail";
        com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.AppBrandVideoCastEventHandler", "onXWebDLNACastingStateChange: status = ".concat(str));
        try {
            org.json.JSONObject b17 = b();
            b17.put("status", str);
            a(new uf.g2(), b17);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SameLayer.AppBrandVideoCastEventHandler", "onXWebDLNACastingStateChange fail", e17);
        }
    }
}
