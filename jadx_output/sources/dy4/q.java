package dy4;

/* loaded from: classes8.dex */
public final class q implements com.tencent.mm.plugin.webview.model.l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dy4.w f244696a;

    public q(dy4.w wVar) {
        this.f244696a = wVar;
    }

    @Override // com.tencent.mm.plugin.webview.model.l0
    public void a(int i17, android.os.Bundle bundle) {
        dy4.w wVar = this.f244696a;
        org.json.JSONObject c17 = wVar.c();
        if (i17 == 1) {
            com.tencent.mars.xlog.Log.i(wVar.f244715a, "onEnterFinderFullscreen data: " + c17);
            wVar.a("onEnterFinderFullscreen", c17);
            return;
        }
        if (bundle != null) {
            ((yg0.q4) ((zg0.p3) i95.n0.c(zg0.p3.class))).getClass();
            com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.b bVar = com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.b.f186984a;
            c17.put("status", bundle.getString("status", ""));
            c17.put("playbackTime", java.lang.Float.valueOf(bundle.getFloat("playbackTime")));
            c17.put("playbackRate", java.lang.Float.valueOf(bundle.getFloat("playbackRate")));
            c17.put("isPause", bundle.getBoolean("isPause"));
            c17.put("showBarrage", bundle.getBoolean("showBarrage"));
        }
        com.tencent.mars.xlog.Log.i(wVar.f244715a, "onExitFinderFullscreen data: " + c17);
        wVar.a("onExitFinderFullscreen", c17);
    }
}
