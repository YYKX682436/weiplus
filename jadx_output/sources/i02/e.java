package i02;

/* loaded from: classes8.dex */
public class e implements com.tencent.tmassistantsdk.downloadclient.ITMAssistantDownloadSDKClientListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i02.h f286508a;

    public e(i02.h hVar) {
        this.f286508a = hVar;
    }

    @Override // com.tencent.tmassistantsdk.downloadclient.ITMAssistantDownloadSDKClientListener
    public void OnDownloadSDKTaskProgressChanged(com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClient tMAssistantDownloadSDKClient, java.lang.String str, long j17, long j18) {
        h02.a f17 = com.tencent.mm.plugin.downloader.model.m0.f(str);
        if (f17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FileDownloaderImplTMAssistant", "getDownloadInfoByURL failed");
            return;
        }
        i02.h hVar = this.f286508a;
        java.lang.Long valueOf = java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.r1((java.lang.Long) hVar.f286523j.get(f17.field_downloadUrl)));
        if (valueOf.longValue() == 0) {
            valueOf = java.lang.Long.valueOf(j17);
            hVar.f286523j.put(f17.field_downloadUrl, java.lang.Long.valueOf(j17));
        }
        long longValue = j17 - valueOf.longValue();
        if (j18 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloaderImplTMAssistant", "onDownloadTaskProgressChanged, totalDataLen = 0");
        } else {
            int i17 = (int) ((((float) j17) / ((float) j18)) * 100.0f);
            if ((longValue * 100) / j18 >= 1) {
                long k17 = com.tencent.mm.sdk.platformtools.t8.k1((java.lang.Long) hVar.f286524k.get(f17.field_downloadUrl), f17.field_startTime);
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                k02.m.a(f17.field_downloadId, ((((float) longValue) * 1000.0f) / ((float) (currentTimeMillis - k17))) / 1048576.0f, i17);
                hVar.f286524k.put(f17.field_downloadUrl, java.lang.Long.valueOf(currentTimeMillis));
                hVar.f286523j.put(f17.field_downloadUrl, java.lang.Long.valueOf(j17));
            }
        }
        java.lang.Long l17 = (java.lang.Long) hVar.f286519f.get(str);
        java.lang.Long valueOf2 = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
        if (l17 != null) {
            long longValue2 = valueOf2.longValue() - l17.longValue();
            if (longValue2 > 0 && longValue2 < 500) {
                return;
            }
        }
        hVar.f286519f.put(str, valueOf2);
        com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloaderImplTMAssistant", "onProgressChanged");
        i02.h.g(hVar, str, 2, (int) ((100 * j17) / j18), false);
        long j19 = f17.field_downloadId;
        h02.b g17 = com.tencent.mm.plugin.downloader.model.m0.g();
        if (g17 != null) {
            g17.execSQL("FileDownloadInfo", "update FileDownloadInfo set downloadedSize = " + j17 + ",totalSize= " + j18 + " where downloadId = " + j19);
        }
        hVar.f97212a.f(f17.field_downloadId, str, j17, j18);
    }

    @Override // com.tencent.tmassistantsdk.downloadclient.ITMAssistantDownloadSDKClientListener
    public void OnDownloadSDKTaskStateChanged(com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClient tMAssistantDownloadSDKClient, java.lang.String str, int i17, int i18, java.lang.String str2, boolean z17, boolean z18) {
        com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadTaskInfo tMAssistantDownloadTaskInfo;
        com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloaderImplTMAssistant", "OnDownloadSDKTaskStateChanged State: " + i17 + " | ErrorCode: " + i18 + " | ErrorMsg: " + str2);
        h02.a f17 = com.tencent.mm.plugin.downloader.model.m0.f(str);
        if (f17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FileDownloaderImplTMAssistant", "getDownloadInfoByURL failed");
            return;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.Long valueOf2 = java.lang.Long.valueOf(f17.field_downloadId);
        java.lang.String str3 = f17.field_filePath;
        com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloaderImplTMAssistant", "State: %d, Id: %d, Path: %s, File Exists: %b, URL: %s", valueOf, valueOf2, str3, java.lang.Boolean.valueOf(com.tencent.mm.vfs.w6.j(str3)), str);
        i02.h hVar = this.f286508a;
        if (i17 != 1 && i17 != 2) {
            com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo d17 = hVar.d(f17.field_downloadId);
            long k17 = com.tencent.mm.sdk.platformtools.t8.k1((java.lang.Long) hVar.f286524k.get(f17.field_downloadUrl), f17.field_startTime);
            long k18 = com.tencent.mm.sdk.platformtools.t8.k1((java.lang.Long) hVar.f286523j.get(f17.field_downloadUrl), f17.field_startSize);
            long currentTimeMillis = java.lang.System.currentTimeMillis() - k17;
            long j17 = d17.f96967m;
            k02.m.a(f17.field_downloadId, ((((float) (j17 - k18)) * 1000.0f) / ((float) currentTimeMillis)) / 1048576.0f, (int) ((((float) j17) / ((float) d17.f96968n)) * 100.0f));
            hVar.f286523j.remove(f17.field_downloadUrl);
            hVar.f286524k.remove(f17.field_downloadUrl);
        }
        try {
            tMAssistantDownloadTaskInfo = hVar.j().getDownloadTaskState(f17.field_downloadUrl);
        } catch (java.lang.Exception unused) {
            tMAssistantDownloadTaskInfo = null;
        }
        if (i17 == 2) {
            f17.field_status = 1;
            if (tMAssistantDownloadTaskInfo != null) {
                f17.field_filePath = tMAssistantDownloadTaskInfo.mSavePath;
            }
            com.tencent.mm.plugin.downloader.model.m0.l(f17);
            return;
        }
        if (i17 == 3) {
            f17.field_finishTime = java.lang.System.currentTimeMillis();
            f17.field_status = 2;
            com.tencent.mm.plugin.downloader.model.m0.l(f17);
            hVar.h(str);
            hVar.f286521h.remove(java.lang.Long.valueOf(f17.field_downloadId));
            hVar.f97212a.e(f17.field_downloadId);
            return;
        }
        if (i17 != 4) {
            if (i17 != 5) {
                return;
            }
            if (i18 == 601 || i18 == 602 || i18 == 603 || i18 == 605 || i18 == 606) {
                hVar.f286526m.c(240000L, 240000L);
            }
            if (com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a) && f17.field_downloadInWifi) {
                f17.field_downloadInWifi = false;
                f17.field_reserveInWifi = false;
            }
            i02.h.g(hVar, str, i17, 0, false);
            hVar.f286521h.remove(java.lang.Long.valueOf(f17.field_downloadId));
            f17.field_finishTime = java.lang.System.currentTimeMillis();
            f17.field_errCode = i18;
            f17.field_status = 4;
            com.tencent.mm.plugin.downloader.model.m0.l(f17);
            hVar.f97212a.c(f17.field_downloadId, i18, z17);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloaderImplTMAssistant", "TMAssistant Download Succeed event received");
        f17.field_status = 6;
        f17.field_finishTime = java.lang.System.currentTimeMillis();
        long j18 = f17.field_totalSize;
        f17.field_downloadedSize = j18;
        if (tMAssistantDownloadTaskInfo != null) {
            f17.field_filePath = tMAssistantDownloadTaskInfo.mSavePath;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloaderImplTMAssistant", "download succeed, downloadedSize = %d, startSize = %d", java.lang.Long.valueOf(j18), java.lang.Long.valueOf(f17.field_startSize));
        com.tencent.mm.plugin.downloader.model.m0.l(f17);
        hVar.f97212a.b(f17.field_downloadId);
        if (z18) {
            com.tencent.mm.autogen.events.GameWatchReportEvent gameWatchReportEvent = new com.tencent.mm.autogen.events.GameWatchReportEvent();
            java.lang.String str4 = f17.field_appId;
            am.ze zeVar = gameWatchReportEvent.f54372g;
            zeVar.f8556a = str4;
            zeVar.f8557b = 6;
            gameWatchReportEvent.e();
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra(com.tencent.mm.plugin.downloader.model.FileDownloadService.f96957n, 1);
        intent.setClass(hVar.f286517d, com.tencent.mm.plugin.downloader.model.FileDownloadService.class);
        intent.putExtra(com.tencent.mm.plugin.downloader.model.FileDownloadService.f96956m, f17.field_downloadId);
        intent.putExtra(com.tencent.mm.plugin.downloader.model.FileDownloadService.f96960q, z17);
        try {
            j45.l.A(intent);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FileDownloaderImplTMAssistant", e17.getMessage());
        }
        hVar.h(str);
        hVar.f286521h.remove(java.lang.Long.valueOf(f17.field_downloadId));
    }

    @Override // com.tencent.tmassistantsdk.downloadclient.ITMAssistantDownloadSDKClientListener
    public void OnDwonloadSDKServiceInvalid(com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClient tMAssistantDownloadSDKClient) {
        com.tencent.mars.xlog.Log.e("MicroMsg.FileDownloaderImplTMAssistant", "TMAssistant Service unavailable");
        i02.h hVar = this.f286508a;
        java.util.Iterator it = hVar.f286521h.iterator();
        while (it.hasNext()) {
            h02.a c17 = com.tencent.mm.plugin.downloader.model.m0.c(((java.lang.Long) it.next()).longValue());
            if (c17 != null) {
                c17.field_finishTime = java.lang.System.currentTimeMillis();
                c17.field_status = 4;
                c17.field_errCode = 101;
                com.tencent.mm.plugin.downloader.model.m0.l(c17);
                hVar.f97212a.c(c17.field_downloadId, 101, false);
                i02.h.g(hVar, c17.field_downloadUrl, 5, 0, false);
            }
        }
        hVar.f286521h.clear();
    }
}
