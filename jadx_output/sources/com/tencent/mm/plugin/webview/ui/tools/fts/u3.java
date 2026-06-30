package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class u3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f184635d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.FTSWeAppBaseWebViewUI f184636e;

    public u3(com.tencent.mm.plugin.webview.ui.tools.fts.FTSWeAppBaseWebViewUI fTSWeAppBaseWebViewUI, java.util.Map map) {
        this.f184636e = fTSWeAppBaseWebViewUI;
        this.f184635d = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        nw4.n nVar = this.f184636e.f183844p0;
        if (nVar != null) {
            nVar.h0(this.f184635d);
        }
    }
}
