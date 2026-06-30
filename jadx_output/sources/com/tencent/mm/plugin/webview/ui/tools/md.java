package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public final class md extends cy4.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.pd f185704a;

    public md(com.tencent.mm.plugin.webview.ui.tools.pd pdVar) {
        this.f185704a = pdVar;
    }

    @Override // cy4.f
    public void a() {
        nw4.n nVar;
        com.tencent.mm.plugin.webview.ui.tools.pd pdVar = this.f185704a;
        try {
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI c17 = pdVar.c();
            if (c17 != null && (nVar = c17.f183844p0) != null) {
                nVar.H();
            }
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewVideoFullScreenHelper", "onEnterFullscreen fail", e17);
        }
        z41.c cVar = pdVar.f186762d;
        if (cVar != null) {
            cVar.enable();
        }
    }

    @Override // cy4.f
    public void b() {
        nw4.n nVar;
        com.tencent.mm.plugin.webview.ui.tools.pd pdVar = this.f185704a;
        try {
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI c17 = pdVar.c();
            if (c17 != null && (nVar = c17.f183844p0) != null) {
                nVar.I();
            }
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewVideoFullScreenHelper", "onExitFullscreen fail", e17);
        }
        z41.c cVar = pdVar.f186762d;
        if (cVar != null) {
            cVar.disable();
        }
    }
}
