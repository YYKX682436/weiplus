package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class m0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184515d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184516e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f184517f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f184518g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI f184519h;

    public m0(com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI baseSearchWebViewUI, java.lang.String str, java.lang.String str2, int i17, boolean z17) {
        this.f184519h = baseSearchWebViewUI;
        this.f184515d = str;
        this.f184516e = str2;
        this.f184517f = i17;
        this.f184518g = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI.y9(this.f184519h, this.f184515d, this.f184516e, this.f184517f, this.f184518g);
    }
}
