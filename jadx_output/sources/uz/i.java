package uz;

/* loaded from: classes8.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uz.j f432056d;

    public i(uz.j jVar) {
        this.f432056d = jVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.LinkedList linkedList;
        this.f432056d.f432060a.getClass();
        h02.b g17 = com.tencent.mm.plugin.downloader.model.m0.g();
        if (g17 == null) {
            linkedList = null;
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloadInfoStorage", "getDownloadInWifiPauseTasks, sql = select * from FileDownloadInfo where status=6");
            android.database.Cursor rawQuery = g17.rawQuery("select * from FileDownloadInfo where status=6", new java.lang.String[0]);
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            if (rawQuery != null) {
                while (rawQuery.moveToNext()) {
                    h02.a aVar = new h02.a();
                    aVar.convertFrom(rawQuery);
                    linkedList2.add(aVar);
                }
                rawQuery.close();
            }
            linkedList = linkedList2;
        }
        if (com.tencent.mm.sdk.platformtools.t8.L0(linkedList)) {
            return;
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            h02.a aVar2 = (h02.a) it.next();
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra(com.tencent.mm.plugin.downloader.model.FileDownloadService.f96957n, 1);
            intent.setClass(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.plugin.downloader.model.FileDownloadService.class);
            intent.putExtra(com.tencent.mm.plugin.downloader.model.FileDownloadService.f96956m, aVar2.field_downloadId);
            try {
                j45.l.A(intent);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.DownloaderFeatureService", e17.getMessage());
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(710L, 25L, 1L, false);
        }
    }
}
