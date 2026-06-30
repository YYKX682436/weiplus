package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class d1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f184376d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184377e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f184378f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI f184379g;

    public d1(com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI fTSBaseWebViewUI, int i17, java.lang.String str, int i18) {
        this.f184379g = fTSBaseWebViewUI;
        this.f184376d = i17;
        this.f184377e = str;
        this.f184378f = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        nw4.n nVar = this.f184379g.f183844p0;
        if (nVar != null) {
            nVar.m0(this.f184376d, this.f184377e, this.f184378f);
        }
    }
}
