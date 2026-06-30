package i02;

/* loaded from: classes8.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h02.a f286501d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i02.h f286502e;

    public a(i02.h hVar, h02.a aVar) {
        this.f286502e = hVar;
        this.f286501d = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        i02.h hVar = this.f286502e;
        h02.a aVar = this.f286501d;
        int i17 = -1;
        try {
            com.tencent.mm.plugin.downloader.api.f.c(aVar.field_appId, aVar.field_downloadUrl, aVar.field_secondaryUrl);
            zo3.p.Ui().d(aVar.field_appId);
            com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClient j17 = hVar.j();
            java.lang.String str = aVar.field_downloadUrl;
            i17 = j17.startDownloadTask(str, aVar.field_secondaryUrl, aVar.field_fileSize, 0, "resource/tm.android.unknown", com.tencent.mm.plugin.downloader.model.z0.f(str), aVar.field_autoDownload, hVar.f286522i);
            if (i17 == 0) {
                com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadTaskInfo downloadTaskState = hVar.j().getDownloadTaskState(aVar.field_downloadUrl);
                java.lang.String str2 = downloadTaskState.mSavePath;
                com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloaderImplTMAssistant", "Task Info from TMAssistant: URL: %s, PATH: %s, fileLen: %d, receiveLen: %d", aVar.field_downloadUrl, str2, java.lang.Long.valueOf(com.tencent.mm.vfs.w6.k(str2)), java.lang.Long.valueOf(downloadTaskState.mReceiveDataLen));
                aVar.field_status = 1;
                aVar.field_startTime = java.lang.System.currentTimeMillis();
                long j18 = downloadTaskState.mReceiveDataLen;
                aVar.field_startSize = j18;
                aVar.field_filePath = downloadTaskState.mSavePath;
                aVar.field_downloadedSize = j18;
                aVar.field_totalSize = downloadTaskState.mTotalDataLen;
                com.tencent.mm.plugin.downloader.model.m0.l(aVar);
                hVar.f286521h.add(java.lang.Long.valueOf(aVar.field_downloadId));
                i02.h.g(hVar, aVar.field_downloadUrl, downloadTaskState.mState, 0, true);
                hVar.f97212a.i(aVar.field_downloadId, downloadTaskState.mSavePath);
                com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloaderImplTMAssistant", "addDownloadTask: id: %d, url: %s, path: %s", java.lang.Long.valueOf(aVar.field_downloadId), aVar.field_downloadUrl, aVar.field_filePath);
                return;
            }
            if (i17 == 1) {
                aVar.field_status = 4;
                aVar.field_errCode = 803;
                com.tencent.mm.plugin.downloader.model.m0.l(aVar);
                hVar.f97212a.c(aVar.field_downloadId, 803, false);
                return;
            }
            if (i17 == 2) {
                aVar.field_status = 4;
                aVar.field_errCode = 104;
                com.tencent.mm.plugin.downloader.model.m0.l(aVar);
                hVar.f97212a.c(aVar.field_downloadId, 104, false);
                return;
            }
            if (i17 == 3) {
                aVar.field_status = 4;
                aVar.field_errCode = 700;
                com.tencent.mm.plugin.downloader.model.m0.l(aVar);
                com.tencent.mm.plugin.downloader.model.m0.l(aVar);
                hVar.f97212a.c(aVar.field_downloadId, 700, false);
                return;
            }
            if (i17 != 4) {
                if (i17 != 5) {
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
            com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadTaskInfo downloadTaskState2 = hVar.j().getDownloadTaskState(aVar.field_downloadUrl);
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            aVar.field_finishTime = currentTimeMillis;
            aVar.field_startTime = currentTimeMillis;
            aVar.field_status = 6;
            aVar.field_filePath = downloadTaskState2.mSavePath;
            long j19 = downloadTaskState2.mReceiveDataLen;
            aVar.field_startSize = j19;
            aVar.field_downloadedSize = j19;
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
            com.tencent.mars.xlog.Log.e("MicroMsg.FileDownloaderImplTMAssistant", "Adding task to TMAssistant failed: ", e18.getMessage());
            aVar.field_errCode = 102;
            aVar.field_status = 4;
            com.tencent.mm.plugin.downloader.model.m0.l(aVar);
            com.tencent.mars.xlog.Log.e("MicroMsg.FileDownloaderImplTMAssistant", "Adding Task via TMAssistant Failed: %d, url: %s", java.lang.Integer.valueOf(i17), aVar.field_downloadUrl);
            hVar.f97212a.c(aVar.field_downloadId, 102, false);
        }
    }
}
