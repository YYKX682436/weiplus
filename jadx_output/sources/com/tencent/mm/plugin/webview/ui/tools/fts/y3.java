package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class y3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184731d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.FTSWeAppBaseWebViewUI f184732e;

    public y3(com.tencent.mm.plugin.webview.ui.tools.fts.FTSWeAppBaseWebViewUI fTSWeAppBaseWebViewUI, java.lang.String str) {
        this.f184732e = fTSWeAppBaseWebViewUI;
        this.f184731d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        nw4.n nVar = this.f184732e.f183844p0;
        if (nVar != null) {
            nVar.f0(this.f184731d);
        }
    }
}
