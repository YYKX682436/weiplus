package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class l3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f184506d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f184507e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184508f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.FTSWeAppBaseWebViewUI f184509g;

    public l3(com.tencent.mm.plugin.webview.ui.tools.fts.FTSWeAppBaseWebViewUI fTSWeAppBaseWebViewUI, int i17, long j17, java.lang.String str) {
        this.f184509g = fTSWeAppBaseWebViewUI;
        this.f184506d = i17;
        this.f184507e = j17;
        this.f184508f = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        nw4.n nVar = this.f184509g.f183844p0;
        if (nVar != null) {
            int i17 = this.f184506d;
            long j17 = this.f184507e;
            java.lang.String str = this.f184508f;
            nVar.n0(i17, j17, str);
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSWeAppBaseWebViewUI", "wxaapp_opsearch resp, ret = %d, reqId = %d, json = %s", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17), str);
        }
    }
}
