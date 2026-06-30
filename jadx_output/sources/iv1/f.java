package iv1;

/* loaded from: classes8.dex */
public class f implements vk0.a {

    /* renamed from: o, reason: collision with root package name */
    public static iv1.f f295108o;

    /* renamed from: p, reason: collision with root package name */
    public static final java.lang.Object f295109p = new java.lang.Object();

    /* renamed from: e, reason: collision with root package name */
    public fv1.c f295111e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f295112f;

    /* renamed from: h, reason: collision with root package name */
    public iv1.g f295114h;

    /* renamed from: d, reason: collision with root package name */
    public long f295110d = 0;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Set f295113g = new kv1.a(new iv1.a(this));

    /* renamed from: i, reason: collision with root package name */
    public final android.content.ServiceConnection f295115i = new iv1.b(this);

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f295116m = new com.tencent.mm.sdk.platformtools.b4(((android.os.HandlerThread) com.tencent.mm.ipcinvoker.w0.a().f68410a.getLooper().getThread()).getLooper(), (com.tencent.mm.sdk.platformtools.a4) new iv1.c(this), true);

    /* renamed from: n, reason: collision with root package name */
    public final fv1.f f295117n = new iv1.d(this);

    public f() {
        iv1.e eVar = new iv1.e(this);
        this.f295112f = com.tencent.mm.sdk.platformtools.x2.f193071a;
        gm0.j1.i();
        gm0.j1.n().a(eVar);
        d();
    }

    public static void a(iv1.f fVar) {
        fv1.c cVar = fVar.f295111e;
        if (cVar != null) {
            try {
                cVar.m5();
            } catch (android.os.RemoteException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.CDNDownloadClient", "removeIPCTaskMarker: " + e17);
            }
        }
        fVar.f295110d = 0L;
    }

    public static synchronized iv1.f f() {
        iv1.f fVar;
        synchronized (iv1.f.class) {
            if (f295108o == null) {
                f295108o = new iv1.f();
            }
            fVar = f295108o;
        }
        return fVar;
    }

    public final void b() {
        fv1.c cVar = this.f295111e;
        if (cVar != null) {
            try {
                cVar.Wb();
            } catch (android.os.RemoteException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.CDNDownloadClient", "addIPCTaskMarker: " + e17);
            }
        }
    }

    public final void c(com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskInfo cDNTaskInfo) {
        ((kv1.a) this.f295113g).add(cDNTaskInfo);
        mv1.a aVar = new mv1.a();
        aVar.field_mediaId = cDNTaskInfo.f95500f;
        aVar.field_downloadUrlHashCode = cDNTaskInfo.f95499e.hashCode();
        aVar.field_downloadUrl = cDNTaskInfo.f95499e;
        aVar.field_httpsUrl = cDNTaskInfo.f95502h;
        aVar.field_filePath = cDNTaskInfo.f95501g;
        aVar.field_verifyHeaders = cDNTaskInfo.f95503i;
        aVar.field_allowMobileNetDownload = java.lang.Boolean.valueOf(cDNTaskInfo.f95506o);
        aVar.field_wifiAutoDownload = java.lang.Boolean.valueOf(cDNTaskInfo.f95507p);
        aVar.field_game_package_download = java.lang.Boolean.valueOf(cDNTaskInfo.f95498d);
        mv1.c a17 = mv1.b.a();
        if (a17 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CdnDownloadInfoDBHelp", "insert: " + a17.insert(aVar));
        }
    }

    public final synchronized void d() {
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.CDNDownloadClient", "bindService: " + this.f295112f.bindService(new android.content.Intent(this.f295112f, (java.lang.Class<?>) com.tencent.mm.plugin.cdndownloader.service.CDNDownloadServiceSlot.class), this.f295115i, 1));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CDNDownloadClient", "bindService: " + e17.getMessage());
        }
    }

    public final com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskInfo e(java.lang.String str) {
        mv1.a aVar;
        android.database.Cursor rawQuery;
        mv1.c a17 = mv1.b.a();
        if (a17 == null || (rawQuery = a17.rawQuery(java.lang.String.format("select * from %s where %s=%s", "CdnDownloadInfo", "downloadUrlHashCode", java.lang.Integer.valueOf(str.hashCode())), new java.lang.String[0])) == null) {
            aVar = null;
        } else {
            aVar = null;
            while (rawQuery.moveToNext()) {
                aVar = new mv1.a();
                aVar.convertFrom(rawQuery);
            }
            rawQuery.close();
        }
        if (aVar == null) {
            return null;
        }
        com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskInfo cDNTaskInfo = new com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskInfo(str);
        cDNTaskInfo.f95502h = aVar.field_httpsUrl;
        cDNTaskInfo.f95500f = aVar.field_mediaId;
        cDNTaskInfo.f95501g = aVar.field_filePath;
        cDNTaskInfo.f95503i = aVar.field_verifyHeaders;
        cDNTaskInfo.f95506o = aVar.field_allowMobileNetDownload.booleanValue();
        cDNTaskInfo.f95507p = aVar.field_wifiAutoDownload.booleanValue();
        cDNTaskInfo.f95498d = aVar.field_game_package_download.booleanValue();
        cDNTaskInfo.f95504m = 15;
        cDNTaskInfo.f95505n = 3600;
        return cDNTaskInfo;
    }

    public synchronized boolean g(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CDNDownloadClient", "pauseDownloadTask: " + str);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.CDNDownloadClient", "pauseDownloadTask, url invalid");
            return false;
        }
        i(new com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskInfo(str));
        fv1.c cVar = this.f295111e;
        if (cVar != null) {
            try {
                return cVar.Je(str);
            } catch (android.os.RemoteException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.CDNDownloadClient", "pauseDownloadTask, " + e17.getMessage());
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CDNDownloadClient", "pauseDownloadTask false, service interface is null");
        return false;
    }

    public synchronized com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskState h(java.lang.String str) {
        com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskInfo e17;
        com.tencent.mars.xlog.Log.i("MicroMsg.CDNDownloadClient", "queryDownloadTask: " + str);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.CDNDownloadClient", "queryDownloadTask, url invalid");
            return null;
        }
        fv1.c cVar = this.f295111e;
        if (cVar != null) {
            try {
                com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskState p66 = cVar.p6(str);
                int i17 = p66.f95511d;
                if (i17 != 100 && i17 != 101) {
                    if (((java.util.HashSet) this.f295113g).contains(new com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskInfo(str))) {
                        p66.f95511d = 101;
                    }
                    return p66;
                }
                if (!((java.util.HashSet) this.f295113g).contains(new com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskInfo(str)) && (e17 = e(str)) != null) {
                    ((kv1.a) this.f295113g).add(e17);
                }
                return p66;
            } catch (android.os.RemoteException e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.CDNDownloadClient", "queryDownloadTask, " + e18.getMessage());
            }
        }
        if (!((java.util.HashSet) this.f295113g).contains(new com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskInfo(str))) {
            return null;
        }
        com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskState cDNTaskState = new com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskState();
        cDNTaskState.f95511d = 101;
        return cDNTaskState;
    }

    public final void i(com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskInfo cDNTaskInfo) {
        ((kv1.a) this.f295113g).remove(cDNTaskInfo);
        java.lang.String str = cDNTaskInfo.f95499e;
        mv1.c a17 = mv1.b.a();
        if (a17 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CdnDownloadInfoDBHelp", "removeDownloadInfoByDownloadUrl: " + a17.execSQL("CdnDownloadInfo", java.lang.String.format("delete from %s where %s=%s", "CdnDownloadInfo", "downloadUrlHashCode", java.lang.Integer.valueOf(str.hashCode()))));
        }
    }
}
