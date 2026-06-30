package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class f4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184412d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.MMFTSSearchTabWebViewUI f184413e;

    public f4(com.tencent.mm.plugin.webview.ui.tools.fts.MMFTSSearchTabWebViewUI mMFTSSearchTabWebViewUI, java.lang.String str) {
        this.f184413e = mMFTSSearchTabWebViewUI;
        this.f184412d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f184413e.F4.getFtsEditText().n(this.f184412d, new java.util.LinkedList());
    }
}
