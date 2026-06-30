package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f184528d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f184529e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184530f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI f184531g;

    public n(com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI baseSOSWebViewUI, int i17, long j17, java.lang.String str) {
        this.f184531g = baseSOSWebViewUI;
        this.f184528d = i17;
        this.f184529e = j17;
        this.f184530f = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        nw4.n nVar = this.f184531g.f183844p0;
        if (nVar != null) {
            int i17 = this.f184528d;
            long j17 = this.f184529e;
            java.lang.String str = this.f184530f;
            nVar.n0(i17, j17, str);
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.BaseSOSWebViewUI", "wxaapp_opsearch resp, ret = %d, reqId = %d, json = %s", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17), str);
        }
    }
}
