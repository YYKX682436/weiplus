package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class v3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f184670d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184671e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f184672f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184673g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.FTSWeAppBaseWebViewUI f184674h;

    public v3(com.tencent.mm.plugin.webview.ui.tools.fts.FTSWeAppBaseWebViewUI fTSWeAppBaseWebViewUI, android.os.Bundle bundle, java.lang.String str, boolean z17, java.lang.String str2) {
        this.f184674h = fTSWeAppBaseWebViewUI;
        this.f184670d = bundle;
        this.f184671e = str;
        this.f184672f = z17;
        this.f184673g = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.ui.tools.fts.FTSWeAppBaseWebViewUI fTSWeAppBaseWebViewUI = this.f184674h;
        if (fTSWeAppBaseWebViewUI.f183844p0 != null) {
            java.lang.String str = this.f184671e;
            android.os.Bundle bundle = this.f184670d;
            if (bundle == null || bundle.getInt("isRefresh") != 1 || bundle.getString("widgetId") == null) {
                fTSWeAppBaseWebViewUI.f183844p0.b0(str, this.f184672f, this.f184673g);
            } else {
                fTSWeAppBaseWebViewUI.f183844p0.g0(bundle.getString("widgetId"), str);
            }
        }
    }
}
