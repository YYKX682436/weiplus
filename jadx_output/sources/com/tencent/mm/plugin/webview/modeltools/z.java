package com.tencent.mm.plugin.webview.modeltools;

@j95.b
/* loaded from: classes.dex */
public class z extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.model.i4 f183368d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.model.l4 f183369e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.modeltools.j1 f183370f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.model.t0 f183371g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.model.s4 f183372h;

    /* renamed from: i, reason: collision with root package name */
    public ew4.g f183373i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.emojistore.b f183374m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f183375n = true;

    public static com.tencent.mm.plugin.webview.modeltools.z Ai() {
        return (com.tencent.mm.plugin.webview.modeltools.z) i95.n0.c(com.tencent.mm.plugin.webview.modeltools.z.class);
    }

    public static com.tencent.mm.plugin.webview.emojistore.b Bi() {
        if (Ai().f183374m == null) {
            Ai().f183374m = new com.tencent.mm.plugin.webview.emojistore.b();
        }
        return Ai().f183374m;
    }

    public static su4.u0 Di() {
        return ((com.tencent.mm.plugin.websearch.w1) ((su4.x0) i95.n0.c(su4.x0.class))).Zi();
    }

    public static su4.v0 Ni() {
        com.tencent.mm.plugin.websearch.w1 w1Var = (com.tencent.mm.plugin.websearch.w1) ((su4.x0) i95.n0.c(su4.x0.class));
        if (w1Var.f181700o == null) {
            w1Var.f181700o = new com.tencent.mm.plugin.websearch.d0();
        }
        return w1Var.f181700o;
    }

    public static su4.w0 Ri() {
        return ((com.tencent.mm.plugin.websearch.w1) ((su4.x0) i95.n0.c(su4.x0.class))).aj();
    }

    public static com.tencent.mm.plugin.webview.model.t0 Ui() {
        if (Ai().f183371g == null) {
            com.tencent.mm.plugin.webview.modeltools.z Ai = Ai();
            gm0.j1.i();
            Ai.f183371g = new com.tencent.mm.plugin.webview.model.t0(gm0.j1.u().f273153f);
        }
        return Ai().f183371g;
    }

    public static ew4.g Vi() {
        if (Ai().f183373i == null) {
            com.tencent.mm.plugin.webview.modeltools.z Ai = Ai();
            gm0.j1.i();
            Ai.f183373i = new ew4.g(gm0.j1.u().f273153f);
        }
        return Ai().f183373i;
    }

    public static com.tencent.mm.plugin.webview.model.l4 Zi() {
        if (Ai().f183369e == null) {
            Ai().f183369e = com.tencent.mm.plugin.webview.model.l4.f183002b;
        }
        return Ai().f183369e;
    }

    public static com.tencent.mm.plugin.webview.model.s4 aj() {
        if (Ai().f183372h == null) {
            com.tencent.mm.plugin.webview.modeltools.z Ai = Ai();
            gm0.j1.i();
            Ai.f183372h = new com.tencent.mm.plugin.webview.model.s4(gm0.j1.u().f273153f);
        }
        return Ai().f183372h;
    }

    public static com.tencent.mm.plugin.webview.model.i4 bj() {
        if (Ai().f183368d == null) {
            Ai().f183368d = new com.tencent.mm.plugin.webview.model.i4();
        }
        return Ai().f183368d;
    }

    public static com.tencent.mm.plugin.webview.modeltools.j1 cj() {
        if (Ai().f183370f == null) {
            com.tencent.mm.plugin.webview.modeltools.z Ai = Ai();
            gm0.j1.i();
            Ai.f183370f = new com.tencent.mm.plugin.webview.modeltools.j1(gm0.j1.u().f273153f);
        }
        return Ai().f183370f;
    }

    public static void wi(java.lang.String str) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(com.tencent.tmassistantsdk.downloadservice.DownloadInfo.NETTYPE, str);
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            if (com.tencent.mars.comm.NetStatusUtil.is2G(context)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreTools", "onNetWorkChange 2g");
                jSONObject.put("networkType", "2g");
            }
            if (com.tencent.mars.comm.NetStatusUtil.is3G(context)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreTools", "onNetWorkChange 3g");
                jSONObject.put("networkType", "3g");
            }
            if (com.tencent.mars.comm.NetStatusUtil.is4G(context)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreTools", "onNetWorkChange 4g");
                jSONObject.put("networkType", "4g");
            }
            if (com.tencent.mars.comm.NetStatusUtil.is5G(context)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreTools", "onNetWorkChange 5g");
                jSONObject.put("networkType", "5g");
            }
            if (com.tencent.mars.comm.NetStatusUtil.isWifi(context)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreTools", "onNetWorkChange wifi");
                jSONObject.put("networkType", "wifi");
            }
            int i17 = 0;
            int Ai = i95.n0.c(kh3.f.class) != null ? ((lh3.n) ((kh3.f) i95.n0.c(kh3.f.class))).Ai(16) : 0;
            if (Ai != 0) {
                i17 = 1;
                if (Ai != 1) {
                    i17 = 2;
                }
            }
            jSONObject.put("simType", i17);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "onNetWorkChange");
            bundle.putString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, jSONObject.toString());
            ((h80.k) ((com.tencent.mm.ipcinvoker.wx_extension.j0) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.j0.class))).getClass();
            com.tencent.mm.ipcinvoker.wx_extension.service.ToolsProcessIPCService.a(bundle, tw4.a.class, null);
        } catch (org.json.JSONException unused) {
        }
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        super.onAccountReleased(context);
        com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreTools", "onAccountRelease hc:%d", java.lang.Integer.valueOf(hashCode()));
        com.tencent.mm.plugin.webview.model.t0 t0Var = this.f183371g;
        if (t0Var != null) {
            t0Var.f183112e.a(true);
        }
    }
}
