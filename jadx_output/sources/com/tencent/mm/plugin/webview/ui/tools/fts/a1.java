package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class a1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f184335d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI f184336e;

    public a1(com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI fTSBaseWebViewUI, java.util.Map map) {
        this.f184336e = fTSBaseWebViewUI;
        this.f184335d = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        nw4.n nVar = this.f184336e.f183844p0;
        if (nVar != null) {
            nVar.h0(this.f184335d);
        }
    }
}
