package com.tencent.mm.plugin.lite.logic;

/* loaded from: classes15.dex */
public enum c1 {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f143913d = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f143914e = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f143915f = new java.util.concurrent.ConcurrentHashMap();

    c1() {
        com.tencent.mm.plugin.lite.logic.w0 w0Var = new com.tencent.mm.plugin.lite.logic.w0(this);
        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
        com.tencent.mm.plugin.downloader.model.r0.i().a(w0Var);
    }

    public static int h(java.lang.String str, java.lang.String str2) {
        return com.tencent.mm.vfs.w6.Q(str, str2);
    }

    public final void a(java.lang.String str, int i17, oq1.c cVar) {
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str);
        java.lang.String str2 = a17.f213279f;
        if (str2 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        if (i17 > 0) {
            com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
            if (!m17.a() ? false : m17.f213266a.F(m17.f213267b)) {
                byte[] bArr = new byte[i17];
                com.tencent.mm.vfs.w6.D(a17, com.tencent.mm.vfs.a3.f212781a.m(a17, m17)).read(bArr);
                com.tencent.mm.vfs.w6.K(str, false).write(com.tenpay.ndk.WxSmCryptoUtil.getInstance().sm4GcmDecrypt(bArr, cVar.f347332c, cVar.f347331b, cVar.f347333d, cVar.f347334e));
            }
        }
    }

    public void b(oq1.q qVar, java.lang.String str, com.tencent.mm.plugin.lite.logic.k2 k2Var, com.tencent.liteapp.gen.LiteAppReporter liteAppReporter, com.tencent.mm.plugin.lite.api.h hVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppDownloadPkg", "startDownloadLiteApp appId: %s, url: %s", qVar.f347346a, qVar.f347349d);
        ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.plugin.lite.logic.x0(this, liteAppReporter, qVar, hVar, str, k2Var), "liteAppDownload");
    }

    public void d(oq1.q qVar, java.lang.String str, com.tencent.mm.plugin.lite.logic.k2 k2Var, com.tencent.liteapp.gen.LiteAppReporter liteAppReporter, com.tencent.mm.plugin.lite.api.f fVar) {
        com.tencent.mm.plugin.lite.w.initLib();
        com.tencent.liteapp.gen.LiteAppReporter liteAppReporter2 = liteAppReporter == null ? com.tencent.mm.plugin.lite.utils.LiteAppReporterDependencyImpl.INSTANCE.getLiteAppReporter(com.tencent.mm.plugin.lite.LiteAppCenter.LITE_APP_BASE_LIB) : liteAppReporter;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1293L, 93L, 1L);
        com.tencent.mm.plugin.downloader.model.t0 t0Var = new com.tencent.mm.plugin.downloader.model.t0(null);
        java.lang.String str2 = qVar.f347349d;
        t0Var.f97150a = str2;
        t0Var.f97153d = qVar.f347350e;
        t0Var.f97155f = 2;
        t0Var.f97159j = false;
        t0Var.B = false;
        java.util.Map map = this.f143914e;
        if (((java.util.concurrent.ConcurrentHashMap) map).containsKey(str2)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppDownloadPkg", qVar.f347349d + " is downloading");
            return;
        }
        if (liteAppReporter2 != null) {
            liteAppReporter2.logDownload(com.tencent.liteapp.gen.DownloadAction.DOWNLOAD_BASE_LIBRARY, qVar.f347360o);
        }
        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
        long b17 = com.tencent.mm.plugin.downloader.model.r0.i().b(t0Var);
        com.tencent.mm.plugin.lite.logic.b1 b1Var = new com.tencent.mm.plugin.lite.logic.b1(this, "downloadLiteAppBaselib", qVar, str, liteAppReporter2, null, fVar);
        b1Var.f143908f = k2Var;
        ((java.util.concurrent.ConcurrentHashMap) this.f143913d).put(java.lang.Long.valueOf(b17), b1Var);
        ((java.util.concurrent.ConcurrentHashMap) map).put(qVar.f347349d, b1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0170 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x016b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x019c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String e(oq1.q r21, java.lang.String r22, com.tencent.liteapp.gen.LiteAppReporter r23) {
        /*
            Method dump skipped, instructions count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.lite.logic.c1.e(oq1.q, java.lang.String, com.tencent.liteapp.gen.LiteAppReporter):java.lang.String");
    }

    public void f(com.tencent.mm.plugin.lite.logic.b1 b1Var) {
        com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppDownloadPkg", "onDownloadFail. appId:%s", b1Var.f143904b.f347346a);
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.f(20752, "0", true, true);
        g0Var.C(1293L, 95L, 1L);
        java.util.Map map = this.f143914e;
        oq1.q qVar = b1Var.f143904b;
        if (((java.util.concurrent.ConcurrentHashMap) map).containsKey(qVar.f347349d)) {
            ((java.util.concurrent.ConcurrentHashMap) map).remove(qVar.f347349d);
        }
        java.util.Map map2 = this.f143915f;
        if (((java.util.concurrent.ConcurrentHashMap) map2).containsKey(qVar.f347349d)) {
            ((java.util.concurrent.ConcurrentHashMap) map2).remove(qVar.f347349d);
        }
        com.tencent.mm.plugin.lite.api.h hVar = b1Var.f143905c;
        if (hVar != null) {
            hVar.fail(qVar.f347346a, 5);
        } else {
            com.tencent.mm.plugin.lite.api.f fVar = b1Var.f143906d;
            if (fVar != null) {
                fVar.a(5);
            }
        }
        com.tencent.liteapp.gen.LiteAppReporter liteAppReporter = b1Var.f143910h;
        if (liteAppReporter != null) {
            liteAppReporter.logDownload(b1Var.f143903a.equals("downloadLiteAppPkg") ? com.tencent.liteapp.gen.DownloadAction.DOWNLOAD_PACKAGE_FAILED : com.tencent.liteapp.gen.DownloadAction.DOWNLOAD_BASE_LIBRARY_FAILED, qVar.f347360o);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0085 A[Catch: MalformedURLException -> 0x0091, TRY_LEAVE, TryCatch #11 {MalformedURLException -> 0x0091, blocks: (B:8:0x003e, B:10:0x0050, B:12:0x005a, B:14:0x0065, B:16:0x006c, B:19:0x006f, B:21:0x007d, B:23:0x0085), top: B:7:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(com.tencent.mm.plugin.lite.logic.b1 r38, java.lang.String r39, java.lang.String r40) {
        /*
            Method dump skipped, instructions count: 2203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.lite.logic.c1.g(com.tencent.mm.plugin.lite.logic.b1, java.lang.String, java.lang.String):void");
    }
}
