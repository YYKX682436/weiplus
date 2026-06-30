package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes.dex */
public class m4 implements com.tencent.mm.plugin.downloader.model.g1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.WebViewDownloadUI f185680d;

    public m4(com.tencent.mm.plugin.webview.ui.tools.WebViewDownloadUI webViewDownloadUI) {
        this.f185680d = webViewDownloadUI;
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void b(long j17, int i17, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewDownloadUI", "onTaskFailed id=%d, errCode=%d, hasChangeUrl=%b", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
        com.tencent.mm.plugin.webview.ui.tools.WebViewDownloadUI webViewDownloadUI = this.f185680d;
        dp.a.makeText(webViewDownloadUI.getContext(), webViewDownloadUI.getString(com.tencent.mm.R.string.l5w), 1).show();
        java.util.List list = com.tencent.mm.plugin.webview.ui.tools.WebViewDownloadUI.K;
        webViewDownloadUI.V6(null);
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void c(long j17, java.lang.String str, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewDownloadUI", "onTaskFinished id=%d, savedFilePath=%s, hasChangeUrl=%b", java.lang.Long.valueOf(j17), str, java.lang.Boolean.valueOf(z17));
        com.tencent.mm.plugin.webview.ui.tools.WebViewDownloadUI webViewDownloadUI = this.f185680d;
        dp.a.makeText(webViewDownloadUI.getContext(), webViewDownloadUI.getString(com.tencent.mm.R.string.l5z), 1).show();
        java.util.List list = com.tencent.mm.plugin.webview.ui.tools.WebViewDownloadUI.K;
        webViewDownloadUI.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_result_err_code", 0);
        webViewDownloadUI.setResult(-1, intent);
        webViewDownloadUI.finish();
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void f(long j17) {
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void h(long j17, java.lang.String str, long j18, long j19) {
        com.tencent.mm.plugin.webview.ui.tools.WebViewDownloadUI webViewDownloadUI = this.f185680d;
        android.widget.TextView textView = webViewDownloadUI.f183768z;
        if (textView == null || j19 == 0) {
            return;
        }
        textView.setText(webViewDownloadUI.getString(com.tencent.mm.R.string.f493660l60, java.lang.Long.valueOf((j18 * 100) / j19)));
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void i(long j17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewDownloadUI", "onTaskResumed id=%d, savedFilePath=%s", java.lang.Long.valueOf(j17), str);
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void k(long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewDownloadUI", "onTaskPaused id=%d", java.lang.Long.valueOf(j17));
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void l(long j17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewDownloadUI", "onTaskStarted id=%d, savedFilePath=%s", java.lang.Long.valueOf(j17), str);
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void m(long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewDownloadUI", "onTaskRemoved id=%d", java.lang.Long.valueOf(j17));
        java.util.List list = com.tencent.mm.plugin.webview.ui.tools.WebViewDownloadUI.K;
        this.f185680d.U6();
    }
}
