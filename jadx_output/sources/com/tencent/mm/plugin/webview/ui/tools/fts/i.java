package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f184432d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184433e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI f184434f;

    public i(com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI baseSOSWebViewUI, int i17, java.lang.String str) {
        this.f184434f = baseSOSWebViewUI;
        this.f184432d = i17;
        this.f184433e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI baseSOSWebViewUI = this.f184434f;
        if (baseSOSWebViewUI.s9() != null) {
            baseSOSWebViewUI.s9().c0(this.f184432d, this.f184433e);
        }
    }
}
