package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class k3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184494d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f184495e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.FTSWeAppBaseWebViewUI f184496f;

    public k3(com.tencent.mm.plugin.webview.ui.tools.fts.FTSWeAppBaseWebViewUI fTSWeAppBaseWebViewUI, java.lang.String str, int i17) {
        this.f184496f = fTSWeAppBaseWebViewUI;
        this.f184494d = str;
        this.f184495e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        nw4.n nVar = this.f184496f.f183844p0;
        if (nVar != null) {
            nVar.V(this.f184494d, this.f184495e);
        }
    }
}
