package e02;

/* loaded from: classes5.dex */
public class f implements com.tencent.mars.cdn.CdnManager.DownloadCallback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e02.h f245850d;

    public f(e02.h hVar) {
        this.f245850d = hVar;
    }

    @Override // com.tencent.mars.cdn.CdnManager.DownloadCallback
    public void onC2CDownloadCompleted(java.lang.String str, com.tencent.mars.cdn.CdnManager.C2CDownloadResult c2CDownloadResult) {
        int i17 = c2CDownloadResult.errorCode;
        if (i17 != 0) {
            e02.h.b(this.f245850d, str, 4, i17, "", false);
        } else {
            e02.h.b(this.f245850d, str, 3, i17, "", false);
        }
    }

    @Override // com.tencent.mars.cdn.CdnManager.DownloadCallback
    public void onDownloadProgressChanged(java.lang.String str, long j17, long j18, boolean z17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) this.f245850d.f245854a;
        concurrentHashMap.containsKey(str);
        if (concurrentHashMap.containsKey(str)) {
            kq.p pVar = ((e02.g) concurrentHashMap.get(str)).f245851a;
            if (pVar == null) {
                com.tencent.mars.xlog.Log.e("ChannelPatchDownloader", "error proxy_callback null");
            } else {
                pVar.c(str, j17, j18);
            }
        }
    }
}
