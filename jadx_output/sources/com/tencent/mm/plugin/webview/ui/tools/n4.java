package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes.dex */
public class n4 implements com.tencent.mm.plugin.downloader.model.g1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.WebViewDownloadUI f185855d;

    public n4(com.tencent.mm.plugin.webview.ui.tools.WebViewDownloadUI webViewDownloadUI) {
        this.f185855d = webViewDownloadUI;
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void b(long j17, int i17, boolean z17) {
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void c(long j17, java.lang.String str, boolean z17) {
        com.tencent.mm.plugin.webview.ui.tools.WebViewDownloadUI webViewDownloadUI = this.f185855d;
        if (j17 == webViewDownloadUI.f183765w) {
            java.lang.String stringExtra = webViewDownloadUI.getIntent().getStringExtra("task_url");
            java.lang.String stringExtra2 = webViewDownloadUI.getIntent().getStringExtra("task_name");
            java.lang.String stringExtra3 = webViewDownloadUI.getIntent().getStringExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra3)) {
                if (stringExtra2 == null) {
                    stringExtra2 = "";
                }
                stringExtra3 = stringExtra2;
            }
            webViewDownloadUI.getClass();
            if (((qg5.e3) ((ct.k3) i95.n0.c(ct.k3.class))).xj(stringExtra, stringExtra3)) {
                qg5.e3 e3Var = (qg5.e3) ((ct.k3) i95.n0.c(ct.k3.class));
                java.util.Map nj6 = e3Var.nj(e3Var.f362963n);
                if (nj6.isEmpty()) {
                    return;
                }
                ((cy1.a) e3Var.ij()).Ej("jump_yuanbao_download_succ", nj6, 35480);
            }
        }
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void f(long j17) {
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void h(long j17, java.lang.String str, long j18, long j19) {
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void i(long j17, java.lang.String str) {
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void k(long j17) {
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void l(long j17, java.lang.String str) {
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void m(long j17) {
    }
}
