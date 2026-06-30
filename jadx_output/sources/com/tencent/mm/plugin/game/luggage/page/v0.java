package com.tencent.mm.plugin.game.luggage.page;

/* loaded from: classes8.dex */
public class v0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f139943d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f139944e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.page.x0 f139945f;

    public v0(com.tencent.mm.plugin.game.luggage.page.x0 x0Var, java.lang.String str, android.os.Bundle bundle) {
        this.f139945f = x0Var;
        this.f139943d = str;
        this.f139944e = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        zq1.l0 l0Var;
        java.lang.String str = this.f139943d;
        com.tencent.mm.plugin.game.luggage.page.x0 x0Var = this.f139945f;
        boolean z17 = x0Var.T;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuggageMMWebPage", "load url, url: %s, fromStash: %b  mFirstLoad : %b", str, java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(x0Var.N));
        sd.o0 o0Var = x0Var.f406655i;
        o0Var.f406638q = str;
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuggageMMWebPage", "stash url");
            x0Var.f182186t.setOptionEnable(true);
            android.os.Bundle bundle = x0Var.f406657n;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(bundle.getString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE))) {
                x0Var.I(bundle.getString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE), 0);
            }
            x0Var.N = false;
            if (x0Var.f182178J == null) {
                x0Var.f182178J = new com.tencent.mm.plugin.webview.permission.d(null);
            }
            x0Var.f182178J.f183383c = 32;
            x0Var.V(str);
            return;
        }
        x0Var.U();
        java.lang.String string = this.f139944e.getString("game_open_html");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(string)) {
            x0Var.f182181p0 = true;
            x0Var.f182180p.loadDataWithBaseURL(str, string, "text/html", com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding, null);
        } else if (x0Var.y(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuggageMMWebPage", "loadUrlWithoutCache, url: %s, __Time__: %d", str, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            java.util.HashMap hashMap = new java.util.HashMap(2);
            hashMap.put("Pragma", "no-cache");
            hashMap.put("Cache-Control", "no-cache");
            x0Var.f182180p.loadUrl(str, hashMap);
            com.tencent.mm.game.report.api.GameWebPerformanceInfo gameWebPerformanceInfo = x0Var.M1;
            if (gameWebPerformanceInfo.D == 0) {
                gameWebPerformanceInfo.D = java.lang.System.currentTimeMillis();
            }
        } else if (!x0Var.N) {
            x0Var.b(str, null);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LuggageMMWebPage", "before GetA8Key stopLoading and load url, url: %s,", str);
        zq1.j0 b17 = ((yq1.x0) ((zq1.m0) gm0.j1.s(zq1.m0.class))).b(str, null);
        if (b17 != null && (l0Var = b17.f475001g) != null && l0Var.f475013a != null) {
            x0Var.Z = true;
            o0Var.f406633i.stopLoading();
            o0Var.j(str);
        }
        x0Var.V(str);
        x0Var.N = false;
    }
}
