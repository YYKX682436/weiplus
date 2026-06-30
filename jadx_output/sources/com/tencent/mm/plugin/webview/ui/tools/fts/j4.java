package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class j4 extends com.tencent.mm.plugin.webview.core.f3 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.PreLoadWebViewUI f184477b;

    public j4(com.tencent.mm.plugin.webview.ui.tools.fts.PreLoadWebViewUI preLoadWebViewUI) {
        this.f184477b = preLoadWebViewUI;
    }

    @Override // com.tencent.mm.plugin.webview.core.f3
    public void j() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.PreLoadWebViewUI", "onJsReady");
        this.f184477b.u9();
    }
}
