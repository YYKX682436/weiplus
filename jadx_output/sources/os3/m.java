package os3;

/* loaded from: classes8.dex */
public class m implements com.tencent.mars.cdn.CdnManager.DownloadCallback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.qqmail.ui.AttachDownloadPage f348147d;

    public m(com.tencent.mm.plugin.qqmail.ui.AttachDownloadPage attachDownloadPage) {
        this.f348147d = attachDownloadPage;
    }

    @Override // com.tencent.mars.cdn.CdnManager.DownloadCallback
    public void onC2CDownloadCompleted(java.lang.String str, com.tencent.mars.cdn.CdnManager.C2CDownloadResult c2CDownloadResult) {
        int i17 = c2CDownloadResult.errorCode;
        com.tencent.mars.xlog.Log.i("MicroMsg.AttachDownloadPage", "cdn get response code = %d", java.lang.Integer.valueOf(i17));
        com.tencent.mm.plugin.qqmail.ui.AttachDownloadPage attachDownloadPage = this.f348147d;
        if (i17 == 0) {
            com.tencent.mm.vfs.w6.P(attachDownloadPage.f154821r, attachDownloadPage.X6() + ".temp", attachDownloadPage.X6());
            attachDownloadPage.A = 3;
            attachDownloadPage.runOnUiThread(new os3.k(this));
            return;
        }
        attachDownloadPage.A = 4;
        int i18 = attachDownloadPage.C;
        if (i18 >= 5) {
            attachDownloadPage.runOnUiThread(new os3.l(this));
        } else {
            attachDownloadPage.C = i18 + 1;
            attachDownloadPage.W6();
        }
    }

    @Override // com.tencent.mars.cdn.CdnManager.DownloadCallback
    public void onDownloadProgressChanged(java.lang.String str, long j17, long j18, boolean z17) {
        com.tencent.mm.plugin.qqmail.ui.AttachDownloadPage attachDownloadPage = this.f348147d;
        com.tencent.mm.plugin.qqmail.ui.AttachDownloadPage.U6(attachDownloadPage);
        attachDownloadPage.A = 1;
    }
}
