package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f184444d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184445e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f184446f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI f184447g;

    public j(com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI baseSOSWebViewUI, int i17, java.lang.String str, int i18) {
        this.f184447g = baseSOSWebViewUI;
        this.f184444d = i17;
        this.f184445e = str;
        this.f184446f = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI baseSOSWebViewUI = this.f184447g;
        if (baseSOSWebViewUI.s9() != null) {
            baseSOSWebViewUI.s9().m0(this.f184444d, this.f184445e, this.f184446f);
        }
    }
}
