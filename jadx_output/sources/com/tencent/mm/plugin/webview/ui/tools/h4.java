package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class h4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184789d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184790e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184791f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184792g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184793h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184794i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184795m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f184796n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.WebViewDownloadUI f184797o;

    public h4(com.tencent.mm.plugin.webview.ui.tools.WebViewDownloadUI webViewDownloadUI, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, int i17) {
        this.f184797o = webViewDownloadUI;
        this.f184789d = str;
        this.f184790e = str2;
        this.f184791f = str3;
        this.f184792g = str4;
        this.f184793h = str5;
        this.f184794i = str6;
        this.f184795m = str7;
        this.f184796n = i17;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/WebViewDownloadUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.webview.ui.tools.WebViewDownloadUI webViewDownloadUI = this.f184797o;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewDownloadUI", "downloadOpBtn.onClick state=%s", webViewDownloadUI.f183764v);
        webViewDownloadUI.getClass();
        boolean isTeenMode = ((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode();
        if (isTeenMode) {
            ((uh4.c0) i95.n0.c(uh4.c0.class)).O8(webViewDownloadUI);
        }
        if (!(!isTeenMode)) {
            yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/WebViewDownloadUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (webViewDownloadUI.f183764v.ordinal() != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewDownloadUI", "downloadOpBtn.onClick unexpected download state");
        } else if (!com.tencent.mars.comm.NetStatusUtil.isNetworkConnected(webViewDownloadUI.A)) {
            dp.a.makeText(webViewDownloadUI.A, webViewDownloadUI.getString(com.tencent.mm.R.string.f492208fm1), 0).show();
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewDownloadUI", "startDownload fail, network not ready");
            yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/WebViewDownloadUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        } else if (com.tencent.mars.comm.NetStatusUtil.isWifi(webViewDownloadUI.A)) {
            com.tencent.mm.plugin.webview.ui.tools.WebViewDownloadUI webViewDownloadUI2 = this.f184797o;
            com.tencent.mm.plugin.webview.ui.tools.WebViewDownloadUI.T6(webViewDownloadUI2, this.f184789d, this.f184790e, this.f184791f, this.f184792g, this.f184793h, this.f184794i, this.f184795m, webViewDownloadUI2.E, this.f184796n);
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14217, this.f184792g, 4, this.f184794i, this.f184789d, java.lang.Integer.valueOf(webViewDownloadUI.D));
            com.tencent.mm.plugin.webview.ui.tools.WebViewDownloadUI webViewDownloadUI3 = this.f184797o;
            db5.e1.D(webViewDownloadUI3, webViewDownloadUI3.getString(com.tencent.mm.R.string.l5x), webViewDownloadUI.getString(com.tencent.mm.R.string.l5y), webViewDownloadUI.getString(com.tencent.mm.R.string.l5q), webViewDownloadUI.getString(com.tencent.mm.R.string.f490347sg), false, new com.tencent.mm.plugin.webview.ui.tools.f4(this), new com.tencent.mm.plugin.webview.ui.tools.g4(this), com.tencent.mm.R.color.aaq);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/WebViewDownloadUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
