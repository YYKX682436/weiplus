package lu4;

/* loaded from: classes7.dex */
public final class x extends lu4.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(lu4.y context) {
        super("wxVideoPrefetcher", context);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @android.webkit.JavascriptInterface
    public final void cacheVideo(java.lang.String data) {
        kotlin.jvm.internal.o.g(data, "data");
        ((com.tencent.mm.plugin.brandservice.ui.timeline.preload.q0) ((lu4.y) this.f321430b)).getClass();
        com.tencent.mm.plugin.brandservice.ui.timeline.preload.u uVar = com.tencent.mm.plugin.brandservice.ui.timeline.preload.u.f94451a;
        try {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1379L, 51L, 1L, false);
            cl0.e eVar = new cl0.e(data);
            int length = eVar.length();
            for (int i17 = 0; i17 < length; i17++) {
                cl0.g jSONObject = eVar.getJSONObject(i17);
                java.lang.String optString = jSONObject.optString("url");
                long optLong = jSONObject.optLong("position");
                int optInt = jSONObject.optInt("preloadType");
                long optLong2 = jSONObject.optLong("length");
                if (optLong2 > 10485760) {
                    optLong2 = 10485760;
                }
                int optInt2 = jSONObject.optInt("videoType", 0);
                if (optLong2 < 512000) {
                    optLong2 = 512000;
                }
                if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.BizVideoPreloadLogic", "cacheVideo url is null");
                    return;
                }
                java.lang.String str = com.tencent.mm.pluginsdk.model.g4.b() ? com.tencent.mm.sdk.platformtools.w9.f193053a : com.tencent.mm.sdk.platformtools.w9.f193055c;
                if (optInt != 0) {
                    str = com.tencent.mm.sdk.platformtools.w9.f193058f;
                }
                java.lang.String str2 = str;
                kotlin.jvm.internal.o.d(str2);
                kotlin.jvm.internal.o.d(optString);
                uVar.b(str2, optString, optLong, optLong2, optInt2);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BizVideoPreloadLogic", "cacheVideo ex " + e17.getMessage());
        }
    }
}
