package i02;

/* loaded from: classes8.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h02.a f286512d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f286513e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f286514f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ i02.h f286515g;

    public g(i02.h hVar, h02.a aVar, boolean z17, long j17) {
        this.f286515g = hVar;
        this.f286512d = aVar;
        this.f286513e = z17;
        this.f286514f = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        i02.h hVar = this.f286515g;
        h02.a aVar = this.f286512d;
        try {
            com.tencent.mm.plugin.downloader.api.f.c(aVar.field_appId, aVar.field_downloadUrl, aVar.field_secondaryUrl);
            zo3.p.Ui().d(aVar.field_appId);
            com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadTaskInfo downloadTaskState = hVar.j().getDownloadTaskState(aVar.field_downloadUrl);
            if (downloadTaskState != null && ((i17 = downloadTaskState.mState) == 1 || i17 == 2)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.FileDownloaderImplTMAssistant", "resumeDownloadTask, is running");
                return;
            }
            com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClient j17 = hVar.j();
            java.lang.String str = aVar.field_downloadUrl;
            int startDownloadTask = j17.startDownloadTask(str, aVar.field_secondaryUrl, aVar.field_fileSize, 0, "resource/tm.android.unknown", com.tencent.mm.plugin.downloader.model.z0.f(str), aVar.field_autoDownload, hVar.f286522i);
            com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadTaskInfo downloadTaskState2 = hVar.j().getDownloadTaskState(aVar.field_downloadUrl);
            if (startDownloadTask == 0) {
                aVar.field_status = 1;
                aVar.field_startTime = java.lang.System.currentTimeMillis();
                aVar.field_filePath = downloadTaskState2.mSavePath;
                aVar.field_totalSize = downloadTaskState2.mTotalDataLen;
                aVar.field_status = 1;
                com.tencent.mm.plugin.downloader.model.m0.l(aVar);
                hVar.f286521h.add(java.lang.Long.valueOf(aVar.field_downloadId));
                i02.h.g(hVar, aVar.field_downloadUrl, 2, 0, true);
                if (this.f286513e) {
                    hVar.f97212a.h(aVar.field_downloadId, aVar.field_filePath);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloaderImplTMAssistant", "resumeDownloadTask: %d", java.lang.Long.valueOf(this.f286514f));
                return;
            }
            if (startDownloadTask == 1) {
                aVar.field_status = 4;
                aVar.field_errCode = 803;
                com.tencent.mm.plugin.downloader.model.m0.l(aVar);
                hVar.f97212a.c(aVar.field_downloadId, 803, false);
                return;
            }
            if (startDownloadTask == 2) {
                aVar.field_status = 4;
                aVar.field_errCode = 104;
                com.tencent.mm.plugin.downloader.model.m0.l(aVar);
                hVar.f97212a.c(aVar.field_downloadId, 104, false);
                return;
            }
            if (startDownloadTask == 3) {
                aVar.field_status = 4;
                aVar.field_errCode = 700;
                com.tencent.mm.plugin.downloader.model.m0.l(aVar);
                hVar.f97212a.c(aVar.field_downloadId, 700, false);
                return;
            }
            if (startDownloadTask != 4) {
                if (startDownloadTask != 5) {
                    return;
                }
                aVar.field_startTime = java.lang.System.currentTimeMillis();
                aVar.field_status = 1;
                com.tencent.mm.plugin.downloader.model.m0.l(aVar);
                hVar.f286521h.add(java.lang.Long.valueOf(aVar.field_downloadId));
                i02.h.g(hVar, aVar.field_downloadUrl, 2, 0, true);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloaderImplTMAssistant", "file has existed");
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            aVar.field_finishTime = currentTimeMillis;
            aVar.field_startTime = currentTimeMillis;
            aVar.field_status = 6;
            aVar.field_filePath = downloadTaskState2.mSavePath;
            long j18 = downloadTaskState2.mReceiveDataLen;
            aVar.field_startSize = j18;
            aVar.field_downloadedSize = j18;
            aVar.field_totalSize = downloadTaskState2.mTotalDataLen;
            com.tencent.mm.plugin.downloader.model.m0.l(aVar);
            hVar.f97212a.b(aVar.field_downloadId);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra(com.tencent.mm.plugin.downloader.model.FileDownloadService.f96957n, 1);
            intent.setClass(hVar.f286517d, com.tencent.mm.plugin.downloader.model.FileDownloadService.class);
            intent.putExtra(com.tencent.mm.plugin.downloader.model.FileDownloadService.f96956m, aVar.field_downloadId);
            try {
                j45.l.A(intent);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.FileDownloaderImplTMAssistant", e17.getMessage());
            }
            hVar.f286521h.remove(java.lang.Long.valueOf(aVar.field_downloadId));
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FileDownloaderImplTMAssistant", "resumeDownloadTask: %s", e18.toString());
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FileDownloaderImplTMAssistant", e18, "", new java.lang.Object[0]);
            aVar.field_status = 4;
            aVar.field_errCode = 103;
            com.tencent.mm.plugin.downloader.model.m0.l(aVar);
            hVar.f97212a.c(aVar.field_downloadId, 103, false);
        }
    }
}
