package cr;

/* loaded from: classes8.dex */
public final class c implements com.tencent.mars.cdn.CdnManager.DownloadCallback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cr.d f221556d;

    public c(cr.d dVar) {
        this.f221556d = dVar;
    }

    @Override // com.tencent.mars.cdn.CdnManager.DownloadCallback
    public void onC2CDownloadCompleted(java.lang.String filekey, com.tencent.mars.cdn.CdnManager.C2CDownloadResult result) {
        kotlin.jvm.internal.o.g(filekey, "filekey");
        kotlin.jvm.internal.o.g(result, "result");
        cr.d dVar = this.f221556d;
        dVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiCdnHttpsFetcher", "onC2CDownloadCompleted: " + filekey + ", " + result.errorCode);
        if (result.errorCode != 0) {
            yz5.l lVar = dVar.f221558b;
            if (lVar != null) {
                lVar.invoke(java.lang.Boolean.FALSE);
            }
            dVar.b(false);
            return;
        }
        yz5.l lVar2 = dVar.f221558b;
        if (lVar2 != null) {
            lVar2.invoke(java.lang.Boolean.TRUE);
        }
        dVar.b(true);
    }

    @Override // com.tencent.mars.cdn.CdnManager.DownloadCallback
    public void onDownloadProgressChanged(java.lang.String filekey, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(filekey, "filekey");
    }
}
