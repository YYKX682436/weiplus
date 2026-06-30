package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes.dex */
public class i4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184821d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184822e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184823f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.WebViewDownloadUI f184824g;

    public i4(com.tencent.mm.plugin.webview.ui.tools.WebViewDownloadUI webViewDownloadUI, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f184824g = webViewDownloadUI;
        this.f184821d = str;
        this.f184822e = str2;
        this.f184823f = str3;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/WebViewDownloadUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.webview.ui.tools.WebViewDownloadUI webViewDownloadUI = this.f184824g;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewDownloadUI", "doCancelDownloadTask, downloadId = %d, state=%s", java.lang.Long.valueOf(webViewDownloadUI.f183765w), webViewDownloadUI.f183764v);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14217, this.f184821d, 3, this.f184822e, this.f184823f, java.lang.Integer.valueOf(webViewDownloadUI.D));
        if (webViewDownloadUI.f183765w <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewDownloadUI", "doCancelDownloadTask fail, unexpected branch! ");
            dp.a.makeText(webViewDownloadUI.getContext(), webViewDownloadUI.getString(com.tencent.mm.R.string.l5s), 1).show();
        } else {
            ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
            int t17 = com.tencent.mm.plugin.downloader.model.r0.i().t(webViewDownloadUI.f183765w);
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewDownloadUI", "doCancelDownloadTask, ret = %d", java.lang.Integer.valueOf(t17));
            if (t17 > 0) {
                dp.a.makeText(webViewDownloadUI.getContext(), webViewDownloadUI.getString(com.tencent.mm.R.string.l5t), 1).show();
                webViewDownloadUI.U6();
            } else {
                dp.a.makeText(webViewDownloadUI.getContext(), webViewDownloadUI.getString(com.tencent.mm.R.string.l5s), 1).show();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/WebViewDownloadUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
