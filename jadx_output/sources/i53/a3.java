package i53;

/* loaded from: classes8.dex */
public class a3 implements com.tencent.mm.plugin.webview.model.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i53.d3 f288516a;

    public a3(i53.d3 d3Var) {
        this.f288516a = d3Var;
    }

    @Override // com.tencent.mm.plugin.webview.model.m0
    public void a(boolean z17, int i17, int i18, java.lang.String str, java.lang.String str2) {
        i53.d3 d3Var = this.f288516a;
        if (!((java.util.HashSet) d3Var.f288552f).contains(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Haowan.GameUploadMediaEngine", "onFinish, not in uploadingList, localId: %s", str);
            return;
        }
        int size = d3Var.f288548b.size();
        float f17 = size;
        final float f18 = (((size - r0) / f17) + ((1.0f / f17) * (i18 / 100.0f))) * 0.95f;
        com.tencent.mars.xlog.Log.i("MicroMsg.Haowan.GameUploadMediaEngine", "onProgress, localId : %s, percent : %d, initSize : %d, uploadingSize : %d, uploadProgress : %f", str, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(size), java.lang.Integer.valueOf(((java.util.HashSet) d3Var.f288552f).size() + ((java.util.HashSet) d3Var.f288553g).size()), java.lang.Float.valueOf(f18));
        d3Var.getClass();
        java.util.Iterator it = m33.s0.f323330a.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            final java.lang.String str3 = d3Var.f288547a;
            if (!hasNext) {
                fs.g.b(m33.x1.class, new fs.o() { // from class: m33.s0$$b
                    @Override // fs.o
                    public final boolean a(fs.n nVar) {
                        java.lang.String str4 = str3;
                        float f19 = f18;
                        ((ah0.w0) ((m33.x1) nVar)).getClass();
                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                        try {
                            jSONObject.put("postId", str4);
                            jSONObject.put("percent", f19);
                            android.os.Bundle bundle = new android.os.Bundle();
                            bundle.putString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "onPublishHaowanProgress");
                            bundle.putString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, jSONObject.toString());
                            ((h80.k) ((com.tencent.mm.ipcinvoker.wx_extension.j0) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.j0.class))).getClass();
                            com.tencent.mm.ipcinvoker.wx_extension.service.ToolsProcessIPCService.a(bundle, tw4.a.class, null);
                            if (!((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).Ij()) {
                                return false;
                            }
                            ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
                            com.tencent.mm.plugin.lite.w.l("onPublishHaowanProgress", jSONObject);
                            return false;
                        } catch (java.lang.Exception e17) {
                            java.lang.String obj = e17.toString();
                            int i19 = rl.b.f397143a;
                            com.tencent.mars.xlog.Log.e("MicroMsg.HaowanPublishStateEvent", obj, null);
                            return false;
                        }
                    }
                });
                return;
            }
            m33.w1 w1Var = (m33.w1) it.next();
            if (w1Var != null) {
                com.tencent.mm.plugin.webview.stub.g0 g0Var = (com.tencent.mm.plugin.webview.stub.g0) w1Var;
                try {
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putString("game_haowan_publish_post_id", str3);
                    bundle.putFloat("game_haowan_publish_progress", f18);
                    java.util.Iterator it6 = ((java.util.ArrayList) g0Var.f183532a.f183486i).iterator();
                    while (it6.hasNext()) {
                        ((com.tencent.mm.plugin.webview.ui.tools.WebViewStubCallbackWrapper) it6.next()).f183795d.callback(255, bundle);
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.WebViewStubService", "notify network change failed :%s", e17.getMessage());
                }
            }
        }
    }
}
