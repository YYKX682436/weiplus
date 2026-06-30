package p20;

/* loaded from: classes12.dex */
public final class e implements com.tencent.mars.cdn.CdnManager.DownloadCallback {
    @Override // com.tencent.mars.cdn.CdnManager.DownloadCallback
    public void onC2CDownloadCompleted(java.lang.String str, com.tencent.mars.cdn.CdnManager.C2CDownloadResult c2CDownloadResult) {
        com.tencent.mars.xlog.Log.i("EcsPlayerPreloadMgr", "onC2CDownloadCompleted mediaId:" + str + " result:" + c2CDownloadResult);
        kotlin.jvm.internal.m0.c(p20.i.f351418d).remove(str);
        kotlin.jvm.internal.m0.a(p20.i.f351420f).remove(str);
        ((kotlinx.coroutines.sync.o) p20.i.f351417c).c();
        p20.i iVar = p20.i.f351415a;
        kotlinx.coroutines.l.d(p20.i.f351416b, null, null, new p20.g(null), 3, null);
    }

    @Override // com.tencent.mars.cdn.CdnManager.DownloadCallback
    public void onDownloadProgressChanged(java.lang.String str, long j17, long j18, boolean z17) {
        com.tencent.mars.xlog.Log.i("EcsPlayerPreloadMgr", "onDownloadProgressChanged mediaId:" + str + " onProgress finished:" + j17 + " total:" + j18);
    }
}
