package xu4;

@j95.b
/* loaded from: classes8.dex */
public final class e extends i95.w implements ur.m {
    public void wi() {
        xu4.g gVar = xu4.g.f457287a;
        com.tencent.mm.vfs.r6 p17 = ((uv4.b) com.tencent.mm.plugin.websearch.l2.g(10)).p();
        java.util.Properties properties = new java.util.Properties();
        if (p17.A()) {
            try {
                java.io.InputStream C = com.tencent.mm.vfs.w6.C(p17);
                try {
                    properties.load(C);
                    vz5.b.a(C, null);
                } finally {
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebSearch.BaseWebSearchTemplate", e17, "", new java.lang.Object[0]);
            }
        }
        if (kotlin.jvm.internal.o.b(properties.get("supportPreloadJSApi"), "1")) {
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_emotion_search_preload_webview, 0) == 1) {
                su4.v2.a().b(gVar.a(kz5.c1.l(new jz5.l(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "71"), new jz5.l("isPreload", "1"))), false, 2);
            }
        }
    }
}
