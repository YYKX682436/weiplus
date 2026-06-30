package ee3;

/* loaded from: classes7.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ee3.c f251585d;

    public b(ee3.c cVar) {
        this.f251585d = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        long j17;
        ee3.d dVar = this.f251585d.f251587b;
        int i17 = dVar.f251596o;
        if (i17 == 0) {
            dVar.f251597p = "image";
        } else if (i17 == 1) {
            dVar.f251597p = "sight";
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicBrushCDNDownloadWorker", "magicbrush_cnddownload_callback_thread run taskid:%s", dVar.f251600s);
        if (this.f251585d.f251587b.f251590f) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicBrushCDNDownloadWorker", "cdndownload onDownloaded already callback taskid:%s", this.f251585d.f251587b.f251600s);
            return;
        }
        this.f251585d.f251587b.f251590f = true;
        java.lang.String str = this.f251585d.f251587b.f251595n;
        if (com.tencent.mm.vfs.w6.j(str)) {
            j17 = com.tencent.mm.vfs.w6.k(str);
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicBrushCDNDownloadWorker", "getFileLength, fileLength :%d", java.lang.Long.valueOf(j17));
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.MagicBrushCDNDownloadWorker", "getFileLength, file not exist");
            j17 = 0;
        }
        if (this.f251585d.f251587b.f251589e) {
            ee3.d dVar2 = this.f251585d.f251587b;
            dVar2.f251588d.b(dVar2.f251595n, dVar2.f251597p, dVar2.f251592h, 0, j17, null);
            ee3.d dVar3 = this.f251585d.f251587b;
            long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f251585d.f251587b.f251599r;
            dVar3.getClass();
            if (j17 <= 0 || currentTimeMillis <= 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MagicBrushCDNDownloadWorker", "reportCDNSpeed len:%d, time:%d return", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(currentTimeMillis));
            } else {
                java.lang.String name = com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$Key.MagicNetworkCDNDownloadTaskSpeedOtherNet.name();
                double d17 = (j17 / currentTimeMillis) * 0.9765625d;
                if (com.tencent.mars.comm.NetStatusUtil.is2G(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
                    name = com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$Key.MagicNetworkCDNDownloadTaskSpeed2G.name();
                } else if (com.tencent.mars.comm.NetStatusUtil.is3G(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
                    name = com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$Key.MagicNetworkCDNDownloadTaskSpeed3G.name();
                } else if (com.tencent.mars.comm.NetStatusUtil.is4G(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
                    name = com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$Key.MagicNetworkCDNDownloadTaskSpeed4G.name();
                } else if (com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
                    name = com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$Key.MagicNetworkCDNDownloadTaskSpeedWIFI.name();
                }
                ((je3.i) i95.n0.c(je3.i.class)).Sc(name, 1, null, 0.01f);
                com.tencent.mars.xlog.Log.i("MicroMsg.MagicBrushCDNDownloadWorker", "reportCDNSpeed len:%d, time:%d, speed:%f, key:%s", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(currentTimeMillis), java.lang.Double.valueOf(d17), name);
            }
        } else {
            ee3.d dVar4 = this.f251585d.f251587b;
            dVar4.f251588d.d(dVar4.f251595n, dVar4.f251592h, "force stop", 300004);
        }
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        ee3.d dVar5 = this.f251585d.f251587b;
        int i18 = (int) (currentTimeMillis2 - dVar5.f251599r);
        java.lang.String str2 = dVar5.f251600s;
        java.lang.String str3 = dVar5.f251597p;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i18);
        ee3.d dVar6 = this.f251585d.f251587b;
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicBrushCDNDownloadWorker", "cdndownload file finished taskid:%s,contentType:%s,cost time:%d,filePath:%s,uri:%s", str2, str3, valueOf, dVar6.f251595n, dVar6.f251592h);
        ee3.d dVar7 = this.f251585d.f251587b;
        dVar7.f251588d.e(dVar7.f251600s);
        ee3.d dVar8 = this.f251585d.f251587b;
        java.lang.String str4 = dVar8.f251591g;
        java.lang.String str5 = dVar8.f251602u;
        java.lang.String str6 = dVar8.f251592h;
        int currentTimeMillis3 = (int) (java.lang.System.currentTimeMillis() - dVar8.f251601t);
        ee3.d dVar9 = this.f251585d.f251587b;
        je3.p.a(str4, str5, "GET", str6, 0L, j17, 0, 1, currentTimeMillis3, dVar9.f251595n, dVar9.f251597p);
        ((je3.i) i95.n0.c(je3.i.class)).Sc(com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$Key.MagicNetworkCDNDownloadTaskSuccess.name(), 1, null, 0.01f);
        ((je3.i) i95.n0.c(je3.i.class)).Sc(com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$Key.MagicNetworkCDNDownloadTaskSuccessCost.name(), i18, null, 0.01f);
    }
}
