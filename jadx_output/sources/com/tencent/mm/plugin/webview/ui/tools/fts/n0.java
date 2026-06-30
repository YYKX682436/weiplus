package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class n0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184532d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f184533e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI f184534f;

    public n0(com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI baseSearchWebViewUI, java.lang.String str, boolean z17) {
        this.f184534f = baseSearchWebViewUI;
        this.f184532d = str;
        this.f184533e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI.y9(this.f184534f, this.f184532d, "loading", -1, this.f184533e);
    }
}
