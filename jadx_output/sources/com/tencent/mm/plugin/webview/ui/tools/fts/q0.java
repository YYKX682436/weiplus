package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class q0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f184587d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184588e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184589f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI f184590g;

    public q0(com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI baseSearchWebViewUI, int i17, java.lang.String str, java.lang.String str2) {
        this.f184590g = baseSearchWebViewUI;
        this.f184587d = i17;
        this.f184588e = str;
        this.f184589f = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f184590g.s9().R(this.f184587d, this.f184588e, this.f184589f, "", "onSimilarEmoticonReady");
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.BaseSearchWebViewUI", "wxaapp_opsearch resp, ret = %d, errMsg = %s, json = %s", java.lang.Integer.valueOf(this.f184587d), this.f184588e, this.f184589f);
    }
}
