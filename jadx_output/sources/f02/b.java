package f02;

/* loaded from: classes8.dex */
public class b implements java.lang.Runnable {
    public b(f02.c cVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.LinkedList linkedList;
        com.tencent.mm.pluginsdk.model.app.m k17;
        if (com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            java.util.HashMap hashMap = com.tencent.mm.plugin.downloader.model.q.f97116a;
            com.tencent.mars.xlog.Log.i("MicroMsg.DownloadRetry", "gamelog.download, checkRetryFailTask , prepare check");
            java.util.HashSet hashSet = com.tencent.mm.plugin.downloader.model.q.f97117b;
            hashSet.clear();
            h02.b g17 = com.tencent.mm.plugin.downloader.model.m0.g();
            if (g17 == null) {
                linkedList = null;
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloadInfoStorage", "getDownloadInWifiPauseTasks, sql = select * from FileDownloadInfo where status=4");
                android.database.Cursor rawQuery = g17.rawQuery("select * from FileDownloadInfo where status=4", new java.lang.String[0]);
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
                if (com.tencent.mm.plugin.downloader.model.m0.h(aVar2.field_downloadUrl)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.DownloadRetry", "hasDuplicatedTask");
                    com.tencent.mm.plugin.downloader.model.m0.k(aVar2.field_downloadUrl);
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(710L, 26L, 1L, false);
                } else if (aVar2.field_downloaderType == 3 && com.tencent.mm.vfs.w6.j(aVar2.field_filePath)) {
                    int i17 = aVar2.field_errCode;
                    if (!(i17 == 802 || i17 == 806 || i17 == 805) && (k17 = com.tencent.mm.pluginsdk.model.app.w.k(aVar2.field_appId, false)) != null && k17.k()) {
                        if (java.lang.System.currentTimeMillis() - aVar2.field_downloadId <= 259200000) {
                            aVar2.field_downloadType = 3;
                            com.tencent.mm.plugin.downloader.model.m0.l(aVar2);
                            g02.c cVar = new g02.c();
                            cVar.a(aVar2);
                            g02.b.c(24, cVar);
                            com.tencent.mm.plugin.downloader.model.r0.i().x(aVar2);
                            com.tencent.mars.xlog.Log.i("MicroMsg.DownloadRetry", "gamelog.download, checkRetryFailTask , retry downloadId = %d", java.lang.Long.valueOf(aVar2.field_downloadId));
                            hashSet.add(java.lang.Long.valueOf(aVar2.field_downloadId));
                            com.tencent.mm.plugin.downloader.model.q.f97116a.put(java.lang.Long.valueOf(aVar2.field_downloadId), 1);
                        }
                    }
                }
            }
        }
    }
}
