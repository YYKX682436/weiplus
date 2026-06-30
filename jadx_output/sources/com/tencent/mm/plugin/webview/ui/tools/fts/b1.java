package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class b1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f184348d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184349e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f184350f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184351g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI f184352h;

    public b1(com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI fTSBaseWebViewUI, android.os.Bundle bundle, java.lang.String str, boolean z17, java.lang.String str2) {
        this.f184352h = fTSBaseWebViewUI;
        this.f184348d = bundle;
        this.f184349e = str;
        this.f184350f = z17;
        this.f184351g = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI fTSBaseWebViewUI = this.f184352h;
        if (fTSBaseWebViewUI.f183844p0 != null) {
            java.lang.String str = this.f184349e;
            android.os.Bundle bundle = this.f184348d;
            if (bundle == null || bundle.getInt("isRefresh") != 1 || bundle.getString("widgetId") == null) {
                fTSBaseWebViewUI.f183844p0.b0(str, this.f184350f, this.f184351g);
            } else {
                fTSBaseWebViewUI.f183844p0.g0(bundle.getString("widgetId"), str);
            }
        }
    }
}
