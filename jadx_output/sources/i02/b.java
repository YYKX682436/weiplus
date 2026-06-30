package i02;

/* loaded from: classes8.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f286503d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i02.h f286504e;

    public b(i02.h hVar, long j17) {
        this.f286504e = hVar;
        this.f286503d = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        i02.h hVar = this.f286504e;
        long j17 = this.f286503d;
        h02.a c17 = com.tencent.mm.plugin.downloader.model.m0.c(j17);
        if (c17 == null) {
            return;
        }
        try {
            hVar.j().cancelDownloadTask(c17.field_downloadUrl);
            com.tencent.mm.vfs.w6.h(c17.field_filePath);
            com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloaderImplTMAssistant", "removeDownloadTask, delete file, path: %s", c17.field_filePath);
            hVar.f286521h.remove(java.lang.Long.valueOf(c17.field_downloadId));
            hVar.h(c17.field_downloadUrl);
            com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloaderImplTMAssistant", "removeDownloadTask: status = " + c17.field_status);
            if (c17.field_status == 5) {
                return;
            }
            c17.field_status = 5;
            c17.field_finishTime = java.lang.System.currentTimeMillis();
            com.tencent.mm.plugin.downloader.model.m0.l(c17);
            long k17 = com.tencent.mm.sdk.platformtools.t8.k1((java.lang.Long) hVar.f286524k.get(c17.field_downloadUrl), c17.field_startTime);
            long k18 = com.tencent.mm.sdk.platformtools.t8.k1((java.lang.Long) hVar.f286523j.get(c17.field_downloadUrl), c17.field_startSize);
            long currentTimeMillis = java.lang.System.currentTimeMillis() - k17;
            long j18 = c17.field_downloadedSize;
            k02.m.a(c17.field_downloadId, ((((float) (j18 - k18)) * 1000.0f) / ((float) currentTimeMillis)) / 1048576.0f, (int) ((((float) j18) / ((float) c17.field_totalSize)) * 100.0f));
            hVar.f97212a.g(c17.field_downloadId);
            com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloaderImplTMAssistant", "removeDownloadTask: id: %d, path: %s", java.lang.Long.valueOf(j17), c17.field_filePath);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FileDownloaderImplTMAssistant", "TMAssistant remove task failed: " + e17.toString());
        }
    }
}
