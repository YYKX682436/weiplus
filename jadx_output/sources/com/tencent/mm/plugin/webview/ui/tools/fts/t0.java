package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class t0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184617d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f184618e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI f184619f;

    public t0(com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI fTSBaseWebViewUI, java.lang.String str, int i17) {
        this.f184619f = fTSBaseWebViewUI;
        this.f184617d = str;
        this.f184618e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        nw4.n nVar = this.f184619f.f183844p0;
        if (nVar != null) {
            nVar.V(this.f184617d, this.f184618e);
        }
    }
}
