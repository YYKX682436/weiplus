package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class c1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f184366d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184367e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI f184368f;

    public c1(com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI fTSBaseWebViewUI, int i17, java.lang.String str) {
        this.f184368f = fTSBaseWebViewUI;
        this.f184366d = i17;
        this.f184367e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        nw4.n nVar = this.f184368f.f183844p0;
        if (nVar != null) {
            nVar.c0(this.f184366d, this.f184367e);
        }
    }
}
