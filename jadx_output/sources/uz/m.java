package uz;

@j95.b
/* loaded from: classes8.dex */
public class m extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.downloader.model.b0[] f432066d = {null};

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        if (com.tencent.mm.plugin.downloader.event.c.f96907d == null) {
            com.tencent.mm.plugin.downloader.event.c.f96907d = new com.tencent.mm.plugin.downloader.event.c();
        }
        if (com.tencent.mm.plugin.downloader.event.c.f96908e == null) {
            com.tencent.mm.plugin.downloader.event.c.f96908e = new com.tencent.mm.plugin.downloader.event.a(null);
        }
        com.tencent.mm.plugin.downloader.model.r0.i().a(com.tencent.mm.plugin.downloader.event.c.f96907d);
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
        intentFilter.addDataScheme("package");
        com.tencent.mm.sdk.platformtools.x2.f193071a.registerReceiver(com.tencent.mm.plugin.downloader.event.c.f96908e, intentFilter);
        com.tencent.mm.plugin.downloader.event.c.f96911h.alive();
        m43.c.b().a("md5_check", new uz.j(this));
        m43.c.b().a("download_resume", new uz.l(this));
        if (f02.f.f258414a == null) {
            f02.f.f258414a = new f02.e(null);
        }
        android.content.IntentFilter intentFilter2 = new android.content.IntentFilter();
        intentFilter2.addAction("android.net.wifi.STATE_CHANGE");
        intentFilter2.addAction("android.net.wifi.WIFI_STATE_CHANGED");
        intentFilter2.addAction(io.flutter.plugins.connectivity.patched.PatchedConnectivityBroadcastReceiver.CONNECTIVITY_ACTION);
        try {
            com.tencent.mm.sdk.platformtools.x2.f193071a.registerReceiver(f02.f.f258414a, intentFilter2);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Downloader.NetWorkManager", e17.getMessage());
        }
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        com.tencent.mars.xlog.Log.i("MicroMsg.DownloaderFeatureService", "onAccountRelease");
        android.content.BroadcastReceiver broadcastReceiver = f02.f.f258414a;
        if (broadcastReceiver != null) {
            try {
                com.tencent.mm.sdk.platformtools.x2.f193071a.unregisterReceiver(broadcastReceiver);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Downloader.NetWorkManager", e17.getMessage());
            }
        }
        f02.f.f258414a = null;
        com.tencent.mm.plugin.downloader.event.c cVar = com.tencent.mm.plugin.downloader.event.c.f96907d;
        com.tencent.mm.plugin.downloader.model.r0.i().s(com.tencent.mm.plugin.downloader.event.c.f96907d);
        com.tencent.mm.sdk.platformtools.x2.f193071a.unregisterReceiver(com.tencent.mm.plugin.downloader.event.c.f96908e);
        com.tencent.mm.plugin.downloader.event.c.f96907d = null;
        com.tencent.mm.plugin.downloader.event.c.f96908e = null;
        ((java.util.concurrent.CopyOnWriteArraySet) com.tencent.mm.plugin.downloader.event.c.f96909f).clear();
        com.tencent.mm.plugin.downloader.event.c.f96911h.dead();
        ((java.util.concurrent.ConcurrentHashMap) com.tencent.mm.plugin.downloader.api.f.f96905b).clear();
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        new a02.a(com.tencent.mm.plugin.downloader.model.b0.f96980j).startWatching();
    }

    public final void wi(h02.a aVar) {
        aVar.field_downloadType = 3;
        com.tencent.mm.plugin.downloader.model.m0.l(aVar);
        com.tencent.mm.plugin.downloader.model.r0 i17 = com.tencent.mm.plugin.downloader.model.r0.i();
        long j17 = aVar.field_downloadId;
        i17.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloadManager", "resumeDownloadTask, id = " + j17);
        com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloadManager", "gamelog.restart,resumeDownloadTaskWhenProcessRestart id = " + j17);
        if (!i17.m(j17)) {
            h02.a c17 = com.tencent.mm.plugin.downloader.model.m0.c(j17);
            if (c17 == null || c17.field_downloaderType != 3) {
                i02.h l17 = i17.l();
                l17.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloaderImplTMAssistant", "resumeDownloadTaskWhenProcessRestart, id = " + j17);
                l17.k(j17, false);
            } else {
                com.tencent.mm.plugin.downloader.model.b0 g17 = i17.g();
                g17.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.FileCDNDownloader", "resumeDownloadTaskWhenProcessRestart, id = " + j17);
                g17.k(j17, false);
            }
        }
        g02.c cVar = new g02.c();
        cVar.a(aVar);
        g02.b.c(24, cVar);
    }
}
