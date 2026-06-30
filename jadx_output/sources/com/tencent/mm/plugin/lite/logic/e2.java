package com.tencent.mm.plugin.lite.logic;

/* loaded from: classes15.dex */
public class e2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.logic.k2 f143924d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.api.h f143925e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f143926f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f143927g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.gen.LiteAppReporter f143928h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f143929i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.logic.g1 f143930m;

    public e2(com.tencent.mm.plugin.lite.logic.g1 g1Var, com.tencent.mm.plugin.lite.logic.k2 k2Var, com.tencent.mm.plugin.lite.api.h hVar, boolean z17, java.lang.String str, com.tencent.liteapp.gen.LiteAppReporter liteAppReporter, long j17) {
        this.f143930m = g1Var;
        this.f143924d = k2Var;
        this.f143925e = hVar;
        this.f143926f = z17;
        this.f143927g = str;
        this.f143928h = liteAppReporter;
        this.f143929i = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.lite.api.h hVar = this.f143924d.f143998c;
        com.tencent.mm.plugin.lite.api.h hVar2 = this.f143925e;
        if (hVar != hVar2 || hVar2 == null) {
            return;
        }
        if (!this.f143926f) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "checkDownloadTimeout, appId:%s syncCheckUpdate:false", this.f143927g);
            this.f143925e.fail(this.f143927g, 10);
            com.tencent.liteapp.gen.LiteAppReporter liteAppReporter = this.f143928h;
            if (liteAppReporter != null) {
                liteAppReporter.logStart(com.tencent.liteapp.gen.StartAction.ASYNC_UPDATE_PACKAGE_TIMEOUT);
                return;
            }
            return;
        }
        com.tencent.liteapp.storage.WxaLiteAppInfo y17 = this.f143930m.y(this.f143927g, null);
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = this.f143927g;
        objArr[1] = java.lang.Integer.valueOf(y17 == null ? 0 : 1);
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "checkDownloadTimeout, appId:%s info:%d", objArr);
        if (y17 != null) {
            this.f143925e.success(y17, 10);
        } else {
            if (!this.f143930m.I(this.f143927g) || !j62.e.g().l("clicfg_enable_pay_lite_app_backup_download_android", false, true, true)) {
                this.f143925e.fail(this.f143927g, 10);
                return;
            }
            java.lang.String netTypeString = com.tencent.mars.comm.NetStatusUtil.getNetTypeString(com.tencent.mm.sdk.platformtools.x2.f193071a);
            oq1.q qVar = (oq1.q) ((java.util.concurrent.ConcurrentHashMap) this.f143930m.f143958l).get(this.f143927g);
            ((java.util.concurrent.ConcurrentHashMap) this.f143930m.f143958l).remove(this.f143927g);
            com.tencent.liteapp.gen.LiteAppReporter liteAppReporter2 = this.f143928h;
            if (liteAppReporter2 != null) {
                liteAppReporter2.logDownload(com.tencent.liteapp.gen.DownloadAction.LITE_APP_PACKAGE_DOWNLOAD_TIMEOUT_NET_INFO, netTypeString, qVar != null ? 1L : 2L);
            }
            com.tencent.mm.plugin.lite.logic.g1 g1Var = this.f143930m;
            final com.tencent.liteapp.gen.LiteAppReporter liteAppReporter3 = this.f143928h;
            g1Var.getClass();
            ((ku5.t0) ku5.t0.f312615d).g(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.lite.logic.g1$$b
                /* JADX WARN: Not initialized variable reg: 5, insn: 0x0087: MOVE (r2 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:21:0x0087 */
                /* JADX WARN: Removed duplicated region for block: B:23:0x008a  */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void run() {
                    /*
                        r13 = this;
                        com.tencent.liteapp.gen.LiteAppReporter r0 = com.tencent.liteapp.gen.LiteAppReporter.this
                        java.lang.String r1 = "MicroMsg.LiteApp.LiteAppLogic"
                        r2 = 0
                        long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6b
                        java.net.URL r5 = new java.net.URL     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6b
                        java.lang.String r6 = "https://qq.com"
                        r5.<init>(r6)     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6b
                        java.net.URLConnection r5 = r5.openConnection()     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6b
                        java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6b
                        r5.connect()     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L86
                        long r6 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L86
                        long r8 = r6 - r3
                        java.lang.String r2 = "reportNetworkLatency, response code: %s, start: %d, end: %d latency: %d"
                        r10 = 4
                        java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L86
                        int r11 = r5.getResponseCode()     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L86
                        java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L86
                        r12 = 0
                        r10[r12] = r11     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L86
                        java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L86
                        r4 = 1
                        r10[r4] = r3     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L86
                        java.lang.Long r3 = java.lang.Long.valueOf(r6)     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L86
                        r4 = 2
                        r10[r4] = r3     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L86
                        java.lang.Long r3 = java.lang.Long.valueOf(r8)     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L86
                        r4 = 3
                        r10[r4] = r3     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L86
                        com.tencent.mars.xlog.Log.i(r1, r2, r10)     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L86
                        if (r0 == 0) goto L63
                        com.tencent.liteapp.gen.DownloadAction r2 = com.tencent.liteapp.gen.DownloadAction.LITE_APP_PACKAGE_NETWORK_LATENCY     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L86
                        java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L86
                        r3.<init>()     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L86
                        int r4 = r5.getResponseCode()     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L86
                        r3.append(r4)     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L86
                        java.lang.String r4 = ""
                        r3.append(r4)     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L86
                        java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L86
                        r0.logDownload(r2, r3, r8)     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L86
                    L63:
                        r5.disconnect()     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L86
                        goto L82
                    L67:
                        r2 = move-exception
                        goto L6e
                    L69:
                        r0 = move-exception
                        goto L88
                    L6b:
                        r3 = move-exception
                        r5 = r2
                        r2 = r3
                    L6e:
                        java.lang.String r3 = "reportNetworkLatency, exception: %s"
                        java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch: java.lang.Throwable -> L86
                        com.tencent.mars.xlog.Log.e(r1, r3, r2)     // Catch: java.lang.Throwable -> L86
                        if (r0 == 0) goto L80
                        com.tencent.liteapp.gen.DownloadAction r1 = com.tencent.liteapp.gen.DownloadAction.LITE_APP_PACKAGE_NETWORK_LATENCY     // Catch: java.lang.Throwable -> L86
                        java.lang.String r2 = "fail"
                        r0.logDownload(r1, r2)     // Catch: java.lang.Throwable -> L86
                    L80:
                        if (r5 == 0) goto L85
                    L82:
                        r5.disconnect()
                    L85:
                        return
                    L86:
                        r0 = move-exception
                        r2 = r5
                    L88:
                        if (r2 == 0) goto L8d
                        r2.disconnect()
                    L8d:
                        throw r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.lite.logic.g1$$b.run():void");
                }
            });
            if (qVar != null && qVar.f347367v) {
                com.tencent.mm.plugin.lite.logic.c1 c1Var = com.tencent.mm.plugin.lite.logic.c1.INSTANCE;
                java.lang.String str = qVar.f347349d;
                c1Var.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppDownloadPkg", "removeDownloadTask, cdnUrl: %s", str);
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) c1Var.f143915f;
                if (concurrentHashMap.containsKey(str)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppDownloadPkg", "removeDownloadTask, taskId: %d", concurrentHashMap.get(str));
                    java.lang.Long l17 = (java.lang.Long) concurrentHashMap.get(str);
                    ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
                    com.tencent.mm.plugin.downloader.model.r0.i().t(l17.longValue());
                    java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = (java.util.concurrent.ConcurrentHashMap) c1Var.f143913d;
                    oq1.q qVar2 = ((com.tencent.mm.plugin.lite.logic.b1) concurrentHashMap2.get(l17)).f143904b;
                    java.util.concurrent.ConcurrentHashMap concurrentHashMap3 = (java.util.concurrent.ConcurrentHashMap) c1Var.f143914e;
                    if (concurrentHashMap3.containsKey(qVar2.f347349d)) {
                        concurrentHashMap3.remove(qVar2.f347349d);
                    }
                    if (concurrentHashMap2.containsKey(l17)) {
                        concurrentHashMap2.remove(l17);
                    }
                    concurrentHashMap.remove(str);
                    com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppDownloadPkg", "removeDownloadTask, success");
                }
                this.f143924d.f143996a = java.lang.System.currentTimeMillis();
                com.tencent.mm.plugin.lite.logic.k2 k2Var = this.f143924d;
                long j17 = k2Var.f143996a;
                k2Var.f143997b = j17;
                k2Var.f144000e = j17;
                k2Var.f144001f = j17;
                oq1.o oVar = qVar.f347364s;
                qVar.f347349d = oVar.f347343c;
                qVar.f347350e = oVar.f347342b;
                qVar.f347353h = oVar.f347344d;
                qVar.f347363r = oVar.f347341a;
                qVar.f347362q = oVar.f347345e;
                qVar.f347366u = true;
                c1Var.b(qVar, "release", k2Var, this.f143928h, this.f143930m.f143949c);
                this.f143930m.i(this.f143927g, true, this.f143924d, this.f143929i, this.f143928h, this.f143925e);
                return;
            }
        }
        com.tencent.liteapp.gen.LiteAppReporter liteAppReporter4 = this.f143928h;
        if (liteAppReporter4 != null) {
            liteAppReporter4.logStart(com.tencent.liteapp.gen.StartAction.SYNC_UPDATE_PACKAGE_TIMEOUT);
        }
    }
}
