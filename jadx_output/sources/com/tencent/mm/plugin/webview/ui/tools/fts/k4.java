package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class k4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f184497d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.PreLoadWebViewUI f184498e;

    public k4(com.tencent.mm.plugin.webview.ui.tools.fts.PreLoadWebViewUI preLoadWebViewUI, java.lang.Runnable runnable) {
        this.f184498e = preLoadWebViewUI;
        this.f184497d = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = com.tencent.mm.plugin.webview.ui.tools.fts.PreLoadWebViewUI.Q3;
        this.f184498e.p9(this.f184497d);
    }
}
