package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class u0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f184627d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f184628e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184629f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI f184630g;

    public u0(com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI fTSBaseWebViewUI, int i17, long j17, java.lang.String str) {
        this.f184630g = fTSBaseWebViewUI;
        this.f184627d = i17;
        this.f184628e = j17;
        this.f184629f = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        nw4.n nVar = this.f184630g.f183844p0;
        if (nVar != null) {
            int i17 = this.f184627d;
            long j17 = this.f184628e;
            java.lang.String str = this.f184629f;
            nVar.n0(i17, j17, str);
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSBaseWebViewUI", "wxaapp_opsearch resp, ret = %d, reqId = %d, json = %s", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17), str);
        }
    }
}
