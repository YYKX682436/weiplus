package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184512d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f184513e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI f184514f;

    public m(com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI baseSOSWebViewUI, java.lang.String str, int i17) {
        this.f184514f = baseSOSWebViewUI;
        this.f184512d = str;
        this.f184513e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI baseSOSWebViewUI = this.f184514f;
        if (baseSOSWebViewUI.s9() != null) {
            baseSOSWebViewUI.s9().V(this.f184512d, this.f184513e);
        }
    }
}
