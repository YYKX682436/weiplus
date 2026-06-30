package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f184361d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184362e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184363f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184364g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI f184365h;

    public c0(com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI baseSearchWebViewUI, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f184365h = baseSearchWebViewUI;
        this.f184361d = i17;
        this.f184362e = str;
        this.f184363f = str2;
        this.f184364g = str3;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f184365h.s9().R(this.f184361d, this.f184362e, this.f184363f, this.f184364g, "onSearchWebQueryReady");
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.BaseSearchWebViewUI", "onSearchWebQueryReady, ret = %d, errMsg = %s, json = %s", java.lang.Integer.valueOf(this.f184361d), this.f184362e, this.f184363f);
    }
}
