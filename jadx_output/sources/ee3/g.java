package ee3;

/* loaded from: classes7.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mars.cdn.CronetLogic.CronetTaskResult f251604d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ee3.h f251605e;

    public g(ee3.h hVar, com.tencent.mars.cdn.CronetLogic.CronetTaskResult cronetTaskResult) {
        this.f251605e = hVar;
        this.f251604d = cronetTaskResult;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        java.lang.String c17;
        com.tencent.mars.cdn.CronetLogic.CronetTaskResult cronetTaskResult = this.f251604d;
        int i18 = (int) cronetTaskResult.totalReceiveByte;
        int i19 = cronetTaskResult.statusCode;
        java.lang.String str = "";
        ee3.j jVar = this.f251605e.f251608c;
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicBrushDownloadWorker", "magicbrush_cronetdownload_callback_thread run taskid:%s,CronetRequestId:%s", jVar.f251624t, jVar.f251625u);
        com.tencent.mars.cdn.CronetLogic.CronetTaskResult cronetTaskResult2 = this.f251604d;
        if (cronetTaskResult2.errorCode != 0) {
            if (this.f251605e.f251608c.f251615h) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MagicBrushDownloadWorker", "cronet onCronetTaskCompleted downloadFile fail already callback");
                return;
            }
            this.f251605e.f251608c.f251615h = true;
            ee3.j jVar2 = this.f251605e.f251608c;
            jVar2.f251613f.d(jVar2.f251618n, jVar2.f251617m, "download fail:" + this.f251604d.errorCode + ":" + this.f251604d.errorMsg, 300002);
            ee3.j jVar3 = this.f251605e.f251608c;
            je3.p.a(jVar3.f251616i, jVar3.f251627w, "GET", jVar3.f251617m, 0L, (long) i18, i19, 2, (int) (java.lang.System.currentTimeMillis() - jVar3.f251626v), this.f251605e.f251608c.f251618n, "");
            int currentTimeMillis = (int) (java.lang.System.currentTimeMillis() - this.f251605e.f251608c.f251623s);
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicBrushDownloadWorker", "fail request time is " + currentTimeMillis);
            ((je3.i) i95.n0.c(je3.i.class)).Sc(com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$Key.MagicNetworkDownloadTaskFail.name(), 1, null, 0.01f);
            ((je3.i) i95.n0.c(je3.i.class)).Sc(com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$Key.MagicNetworkDownloadTaskFailCost.name(), currentTimeMillis, null, 0.01f);
            return;
        }
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : cronetTaskResult2.getHeaderMap().entrySet()) {
            java.lang.String key = entry.getKey();
            java.lang.String value = entry.getValue();
            if (key.equalsIgnoreCase("Content-Type") || key.equalsIgnoreCase("content-type")) {
                java.lang.String str2 = this.f251605e.f251608c.f251617m;
                q75.e a17 = q75.e.a(value);
                if (a17 == null) {
                    c17 = q75.g.c(str2);
                } else {
                    c17 = a17.f360607a;
                    if (c17.contains("application/octet-stream")) {
                        str = q75.g.c(str2);
                        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                        }
                    }
                }
                str = c17;
            }
        }
        if (i19 != 200) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i19);
            ee3.j jVar4 = this.f251605e.f251608c;
            com.tencent.mars.xlog.Log.e("MicroMsg.MagicBrushDownloadWorker", "failed code: %d,url is %s,filename is %s ", valueOf, jVar4.f251617m, jVar4.f251618n);
            if (i19 == 301 || i19 == 302 || i19 == 307) {
                java.lang.String str3 = this.f251604d.newLocation;
                if (!android.text.TextUtils.isEmpty(str3)) {
                    ee3.j jVar5 = this.f251605e.f251608c;
                    int i27 = jVar5.f251611d;
                    int i28 = i27 - 1;
                    jVar5.f251611d = i28;
                    if (i27 > 0) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.MagicBrushDownloadWorker", "redirect(%d) URL(%s) to URL(%s)", java.lang.Integer.valueOf(i28), this.f251605e.f251608c.f251617m, str3);
                        ee3.j jVar6 = this.f251605e.f251608c;
                        jVar6.f251617m = str3;
                        jVar6.run();
                        return;
                    }
                    com.tencent.mars.xlog.Log.w("MicroMsg.MagicBrushDownloadWorker", "reach the max redirect count(%d)", 15);
                    if (this.f251605e.f251608c.f251615h) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.MagicBrushDownloadWorker", "cronet onCronetTaskCompleted max redirect already callback");
                        return;
                    }
                    this.f251605e.f251608c.f251615h = true;
                    ee3.j jVar7 = this.f251605e.f251608c;
                    if (jVar7.B) {
                        jVar7.f251613f.b(jVar7.f251618n, str, jVar7.f251617m, i19, 0L, de3.b.a(this.f251604d.webPageProfile));
                    } else {
                        jVar7.f251613f.b(jVar7.f251618n, str, jVar7.f251617m, i19, 0L, null);
                    }
                    ee3.j jVar8 = this.f251605e.f251608c;
                    je3.p.a(jVar8.f251616i, jVar8.f251627w, "GET", jVar8.f251617m, 0L, i18, i19, 1, (int) (java.lang.System.currentTimeMillis() - jVar8.f251626v), this.f251605e.f251608c.f251618n, str);
                    ((je3.i) i95.n0.c(je3.i.class)).Sc(com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$Key.MagicNetworkDownloadTaskSuccess.name(), 1, null, 0.01f);
                    ((je3.i) i95.n0.c(je3.i.class)).Sc(com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$Key.MagicNetworkDownloadTaskSuccessCost.name(), (int) (java.lang.System.currentTimeMillis() - this.f251605e.f251608c.f251623s), null, 0.01f);
                    return;
                }
            }
        }
        if (this.f251605e.f251608c.f251615h) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MagicBrushDownloadWorker", "cronet onCronetTaskCompleted already callback");
            return;
        }
        this.f251605e.f251608c.f251615h = true;
        if (this.f251605e.f251608c.f251614g) {
            ee3.j jVar9 = this.f251605e.f251608c;
            if (jVar9.B) {
                jVar9.f251613f.b(jVar9.f251618n, str, jVar9.f251617m, i19, i18, de3.b.a(this.f251604d.webPageProfile));
            } else {
                jVar9.f251613f.b(jVar9.f251618n, str, jVar9.f251617m, i19, i18, null);
            }
            ee3.j jVar10 = this.f251605e.f251608c;
            long j17 = this.f251604d.totalReceiveByte;
            long currentTimeMillis2 = java.lang.System.currentTimeMillis() - this.f251605e.f251608c.f251623s;
            jVar10.getClass();
            if (j17 <= 0 || currentTimeMillis2 <= 0) {
                i17 = i18;
                com.tencent.mars.xlog.Log.i("MicroMsg.MagicBrushDownloadWorker", "reportCronetSpeed len:%d, time:%d return", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(currentTimeMillis2));
            } else {
                java.lang.String name = com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$Key.MagicNetworkDownloadTaskSpeedOtherNet.name();
                i17 = i18;
                double d17 = (j17 / currentTimeMillis2) * 0.9765625d;
                if (com.tencent.mars.comm.NetStatusUtil.is2G(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
                    name = com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$Key.MagicNetworkDownloadTaskSpeed2G.name();
                } else if (com.tencent.mars.comm.NetStatusUtil.is3G(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
                    name = com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$Key.MagicNetworkDownloadTaskSpeed3G.name();
                } else if (com.tencent.mars.comm.NetStatusUtil.is4G(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
                    name = com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$Key.MagicNetworkDownloadTaskSpeed4G.name();
                } else if (com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
                    name = com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$Key.MagicNetworkDownloadTaskSpeedWIFI.name();
                }
                ((je3.i) i95.n0.c(je3.i.class)).Sc(name, (int) d17, null, 0.01f);
                com.tencent.mars.xlog.Log.i("MicroMsg.MagicBrushDownloadWorker", "reportCronetSpeed len:%d, time:%d, speed:%f, key:%s", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(currentTimeMillis2), java.lang.Double.valueOf(d17), name);
            }
            this.f251605e.f251607b.getClass();
        } else {
            i17 = i18;
            ee3.j jVar11 = this.f251605e.f251608c;
            jVar11.f251613f.d(jVar11.f251618n, jVar11.f251617m, "force stop", 300004);
        }
        ee3.j jVar12 = this.f251605e.f251608c;
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicBrushDownloadWorker", "cronet download file finished taskid:%s,CronetRequestId:%s,contentType:%s,filename: %s, url:%s ", jVar12.f251624t, jVar12.f251625u, str, jVar12.f251618n, jVar12.f251617m);
        ee3.j jVar13 = this.f251605e.f251608c;
        jVar13.f251613f.e(jVar13.f251624t);
        ee3.j jVar14 = this.f251605e.f251608c;
        je3.p.a(jVar14.f251616i, jVar14.f251627w, "GET", jVar14.f251617m, 0L, i17, i19, 1, (int) (java.lang.System.currentTimeMillis() - jVar14.f251626v), this.f251605e.f251608c.f251618n, str);
        int currentTimeMillis3 = (int) (java.lang.System.currentTimeMillis() - this.f251605e.f251608c.f251623s);
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicBrushDownloadWorker", "success request time is " + currentTimeMillis3);
        ((je3.i) i95.n0.c(je3.i.class)).Sc(com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$Key.MagicNetworkDownloadTaskSuccess.name(), 1, null, 0.01f);
        ((je3.i) i95.n0.c(je3.i.class)).Sc(com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$Key.MagicNetworkDownloadTaskSuccessCost.name(), currentTimeMillis3, null, 0.01f);
    }
}
