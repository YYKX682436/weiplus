package f02;

/* loaded from: classes8.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f258413d;

    public d(f02.e eVar, android.content.Context context) {
        this.f258413d = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!gm0.j1.a() || gm0.m.r()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Downloader.NetWorkManager", "acc has not ready");
            return;
        }
        int netType = com.tencent.mars.comm.NetStatusUtil.getNetType(com.tencent.mm.sdk.platformtools.x2.f193071a);
        if (netType == f02.f.f258415b) {
            return;
        }
        f02.f.f258415b = netType;
        com.tencent.mars.xlog.Log.i("MicroMsg.Downloader.NetWorkManager", "onNetStateChange, netState = " + netType);
        if (!com.tencent.mars.comm.NetStatusUtil.isConnected(this.f258413d)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Downloader.NetWorkManager", "network is not connected");
            return;
        }
        java.util.LinkedList linkedList = null;
        if (!com.tencent.mars.comm.NetStatusUtil.isWifi(netType)) {
            h02.b g17 = com.tencent.mm.plugin.downloader.model.m0.g();
            if (g17 != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloadInfoStorage", "getDownloadInWifiRunningTasks, sql = select * from FileDownloadInfo where status=1 and downloadInWifi=1");
                android.database.Cursor rawQuery = g17.rawQuery("select * from FileDownloadInfo where status=1 and downloadInWifi=1", new java.lang.String[0]);
                linkedList = new java.util.LinkedList();
                if (rawQuery != null) {
                    while (rawQuery.moveToNext()) {
                        h02.a aVar = new h02.a();
                        aVar.convertFrom(rawQuery);
                        linkedList.add(aVar);
                    }
                    rawQuery.close();
                }
            }
            if (linkedList != null) {
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    h02.a aVar2 = (h02.a) it.next();
                    com.tencent.mars.xlog.Log.i("MicroMsg.Downloader.NetWorkManager", "pauseTask, appId: " + aVar2.field_appId);
                    com.tencent.mm.plugin.downloader.model.r0.i().d(aVar2.field_downloadId);
                }
                return;
            }
            return;
        }
        h02.b g18 = com.tencent.mm.plugin.downloader.model.m0.g();
        if (g18 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloadInfoStorage", "getDownloadInWifiPauseTasks, sql = select * from FileDownloadInfo where status<>1 and status<>3 and downloadInWifi=1");
            android.database.Cursor rawQuery2 = g18.rawQuery("select * from FileDownloadInfo where status<>1 and status<>3 and downloadInWifi=1", new java.lang.String[0]);
            linkedList = new java.util.LinkedList();
            if (rawQuery2 != null) {
                while (rawQuery2.moveToNext()) {
                    h02.a aVar3 = new h02.a();
                    aVar3.convertFrom(rawQuery2);
                    linkedList.add(aVar3);
                }
                rawQuery2.close();
            }
        }
        if (linkedList != null) {
            java.util.Iterator it6 = linkedList.iterator();
            while (it6.hasNext()) {
                h02.a aVar4 = (h02.a) it6.next();
                com.tencent.mars.xlog.Log.i("MicroMsg.Downloader.NetWorkManager", "resumeTask, appId = %s, state = %d", aVar4.field_appId, java.lang.Integer.valueOf(aVar4.field_status));
                if (com.tencent.mm.plugin.downloader.model.m0.h(aVar4.field_downloadUrl)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Downloader.NetWorkManager", "hasDuplicatedTask");
                    com.tencent.mm.plugin.downloader.model.m0.k(aVar4.field_downloadUrl);
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(710L, 26L, 1L, false);
                } else {
                    int i17 = aVar4.field_status;
                    if (i17 == 2) {
                        com.tencent.mm.plugin.downloader.model.r0 i18 = com.tencent.mm.plugin.downloader.model.r0.i();
                        long j17 = aVar4.field_downloadId;
                        i18.getClass();
                        h02.a c17 = com.tencent.mm.plugin.downloader.model.m0.c(j17);
                        if (c17 == null || c17.field_downloaderType != 3) {
                            i02.h l17 = i18.l();
                            l17.getClass();
                            h02.a c18 = com.tencent.mm.plugin.downloader.model.m0.c(j17);
                            if (c18 != null) {
                                c18.field_downloadType = 2;
                                com.tencent.mm.plugin.downloader.model.m0.l(c18);
                            }
                            g02.b.e(j17, 14);
                            l17.k(j17, true);
                        } else {
                            com.tencent.mm.plugin.downloader.model.b0 g19 = i18.g();
                            g19.getClass();
                            h02.a c19 = com.tencent.mm.plugin.downloader.model.m0.c(j17);
                            if (c19 != null) {
                                c19.field_downloadType = 2;
                                com.tencent.mm.plugin.downloader.model.m0.l(c19);
                            }
                            g02.b.e(j17, 14);
                            g19.k(j17, true);
                        }
                    } else if (i17 == 0 && aVar4.field_reserveInWifi) {
                        com.tencent.mm.plugin.downloader.model.r0 i19 = com.tencent.mm.plugin.downloader.model.r0.i();
                        i19.getClass();
                        if (aVar4.field_downloaderType == 3) {
                            i19.g().e(aVar4);
                        } else {
                            i19.h().e(aVar4);
                        }
                    }
                }
            }
        }
        m43.c.b().a("failed_download_resume", new f02.c(this));
    }
}
