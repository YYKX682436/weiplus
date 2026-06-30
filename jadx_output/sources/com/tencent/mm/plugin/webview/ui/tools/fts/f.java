package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f184401d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184402e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f184403f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184404g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI f184405h;

    public f(com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI baseSOSWebViewUI, android.os.Bundle bundle, java.lang.String str, boolean z17, java.lang.String str2) {
        this.f184405h = baseSOSWebViewUI;
        this.f184401d = bundle;
        this.f184402e = str;
        this.f184403f = z17;
        this.f184404g = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.BaseSOSWebViewUI", "[handleFTSAction] onSearchDataReady");
        this.f184405h.o9(new com.tencent.mm.plugin.webview.ui.tools.fts.e(this));
    }
}
