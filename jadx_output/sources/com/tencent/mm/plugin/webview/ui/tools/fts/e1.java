package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class e1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184393d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI f184394e;

    public e1(com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI fTSBaseWebViewUI, java.lang.String str) {
        this.f184394e = fTSBaseWebViewUI;
        this.f184393d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        nw4.n nVar = this.f184394e.f183844p0;
        if (nVar != null) {
            nVar.f0(this.f184393d);
        }
    }
}
