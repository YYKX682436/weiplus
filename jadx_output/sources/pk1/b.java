package pk1;

/* loaded from: classes12.dex */
public final class b implements com.tencent.mars.cdn.CdnManager.DownloadCallback, com.tencent.mars.cdn.CdnManager.VideoStreamingCallback, com.tencent.mars.cdn.CdnManager.AppCallback {

    /* renamed from: d, reason: collision with root package name */
    public static final pk1.b f355416d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String f355417e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f355418f;

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f355419g;

    static {
        pk1.b bVar = new pk1.b();
        f355416d = bVar;
        f355417e = "User-Agent:" + bVar.b() + "\r\nAccept-Encoding:identity\nContent-Type:\r\n";
        f355418f = new java.util.concurrent.ConcurrentHashMap();
        f355419g = jz5.h.b(pk1.a.f355415d);
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            return;
        }
        com.tencent.mars.WeChatMars.loadDependentLibraries();
        java.lang.String i17 = com.tencent.mm.vfs.w6.i(new com.tencent.mm.vfs.r6(lp0.b.D(), "ThumbVideoCache/CdnDownload/History").o(), true);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCdnService", "<init>, historyPath: " + i17);
        com.tencent.mars.cdn.CdnManager cdnManager = new com.tencent.mars.cdn.CdnManager(com.tencent.mars.MarsContext.getContext());
        com.tencent.mars.MarsContext.getContext().addManager(com.tencent.mars.cdn.CdnManager.class, cdnManager);
        cdnManager.onCreate(com.tencent.mm.vfs.w6.i(i17, true), "cdnwx2013usrname", java.lang.Boolean.valueOf(true ^ c01.e2.a0()));
        cdnManager.setAppCallback(bVar);
        cdnManager.setRSAPublicKeyParams("1", "BFEDFFB5EA28509F9C89ED83FA7FDDA8881435D444E984D53A98AD8E9410F1145EDD537890E10456190B22E6E5006455EFC6C12E41FDA985F38FBBC7213ECB810E3053D4B8D74FFBC70B4600ABD728202322AFCE1406046631261BD5EE3D44721082FEAB74340D73645DC0D02A293B962B9D47E4A64100BD7524DE00D9D3B5C1", "010001");
        cdnManager.setToUserCiper("cdnwx2013usrname");
        com.tencent.mars.cdn.CdnC2Java.setCallback(new com.tencent.mars.cdn.CdnC2JavaCallBack());
    }

    public final int a(java.lang.String mediaId) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCdnService", "cancelDownloadTask mediaId: ".concat(mediaId));
        int cancelDownloadTaskWithResult = ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).cancelDownloadTaskWithResult(mediaId, new com.tencent.mars.cdn.CdnManager.C2CDownloadResult());
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCdnService", "cancelDownloadTask, cancelDownloadTaskWithResult, result: " + cancelDownloadTaskWithResult);
        f355418f.remove(mediaId);
        return cancelDownloadTaskWithResult;
    }

    public final java.lang.String b() {
        java.lang.String str;
        if (com.tencent.mm.plugin.appbrand.utils.p.e()) {
            str = k91.d3.a(com.tencent.mm.sdk.platformtools.x2.f193071a, k91.n0.a());
        } else {
            str = com.tencent.mm.sdk.platformtools.x2.f193072b;
            kotlin.jvm.internal.o.f(str, "getApplicationId(...)");
        }
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.x2.f193072b;
        kotlin.jvm.internal.o.f(str2, "getApplicationId(...)");
        if (r26.n0.B(str, str2, false)) {
            return str;
        }
        return str + ' ' + com.tencent.mm.sdk.platformtools.x2.f193072b;
    }

    @Override // com.tencent.mars.cdn.CdnManager.AppCallback
    public java.lang.String[] combineResolveHost(java.lang.String str, int i17, int i18, int[] iArr) {
        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandCdnService", "resolveHost not impl!");
        return new java.lang.String[0];
    }

    @Override // com.tencent.mars.cdn.CdnManager.AppCallback
    public boolean isUsingWangKaService(int i17) {
        return false;
    }

    @Override // com.tencent.mars.cdn.CdnManager.AppCallback
    public void onBadNetworkProbed() {
    }

    @Override // com.tencent.mars.cdn.CdnManager.DownloadCallback
    public void onC2CDownloadCompleted(java.lang.String str, com.tencent.mars.cdn.CdnManager.C2CDownloadResult c2CDownloadResult) {
        dn.n nVar;
        dn.n nVar2;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCdnService", "onC2CDownloadCompleted, mediaId: " + str + ", result: " + c2CDownloadResult);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f355418f;
        if (c2CDownloadResult == null) {
            dn.o oVar = (dn.o) concurrentHashMap.get(str);
            if (oVar == null || (nVar = oVar.f241815c2) == null) {
                return;
            }
            nVar.g(str, -1, null);
            return;
        }
        dn.o oVar2 = (dn.o) concurrentHashMap.get(str);
        if (oVar2 == null || (nVar2 = oVar2.f241815c2) == null) {
            return;
        }
        int i17 = c2CDownloadResult.errorCode;
        dn.h hVar = new dn.h();
        hVar.field_recvedBytes = c2CDownloadResult.recvedBytes;
        hVar.field_fileLength = c2CDownloadResult.fileSize;
        nVar2.g(str, i17, hVar);
    }

    @Override // com.tencent.mars.cdn.CdnManager.VideoStreamingCallback
    public void onDataAvailable(java.lang.String str, long j17, long j18) {
        dn.n nVar;
        dn.o oVar = (dn.o) f355418f.get(str);
        if (oVar == null || (nVar = oVar.f241815c2) == null) {
            return;
        }
        nVar.onDataAvailable(str, j17, j18);
    }

    @Override // com.tencent.mars.cdn.CdnManager.DownloadCallback
    public void onDownloadProgressChanged(java.lang.String str, long j17, long j18, boolean z17) {
        dn.n nVar;
        dn.o oVar = (dn.o) f355418f.get(str);
        if (oVar == null || (nVar = oVar.f241815c2) == null) {
            return;
        }
        nVar.f(str, j17, j18);
    }

    @Override // com.tencent.mars.cdn.CdnManager.VideoStreamingCallback
    public void onDownloadToEnd(java.lang.String str, long j17, long j18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCdnService", "onDownloadToEnd, mediaId: " + str + ", offset: " + j17 + ", length: " + j18);
    }

    @Override // com.tencent.mars.cdn.CdnManager.VideoStreamingCallback
    public void onM3U8Ready(java.lang.String str, java.lang.String str2) {
        dn.n nVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCdnService", "onM3U8Ready, mediaId: " + str + ", m3u8: " + str2);
        dn.o oVar = (dn.o) f355418f.get(str);
        if (oVar == null || (nVar = oVar.f241815c2) == null) {
            return;
        }
        nVar.onM3U8Ready(str, str2);
    }

    @Override // com.tencent.mars.cdn.CdnManager.VideoStreamingCallback
    public void onMoovReady(java.lang.String str, long j17, long j18, com.tencent.mars.cdn.CdnManager.VideoInfo videoInfo) {
        dn.n nVar;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onMoovReadyWithFlag, mediaId: ");
        sb6.append(str);
        sb6.append(", offset: ");
        sb6.append(j17);
        sb6.append(", length: ");
        sb6.append(j18);
        sb6.append(", svrflag: ");
        sb6.append(videoInfo != null ? videoInfo.svrFlag : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCdnService", sb6.toString());
        dn.o oVar = (dn.o) f355418f.get(str);
        if (oVar == null || (nVar = oVar.f241815c2) == null) {
            return;
        }
        nVar.onMoovReady(str, j17, j18, videoInfo);
    }

    @Override // com.tencent.mars.cdn.CdnManager.VideoStreamingCallback
    public void onMoovReadyWithFlag(java.lang.String str, long j17, long j18, java.lang.String str2) {
    }

    @Override // com.tencent.mars.cdn.CdnManager.VideoStreamingCallback
    public void onObtainMoovFailed(java.lang.String str, int i17) {
    }

    @Override // com.tencent.mars.cdn.CdnManager.VideoStreamingCallback
    public void onPreloadCompletedWithResult(java.lang.String str, long j17, long j18, com.tencent.mars.cdn.CdnManager.C2CDownloadResult c2CDownloadResult) {
        dn.n nVar;
        dn.n nVar2;
        dn.n nVar3;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCdnService", "onPreloadCompletedWithResult, mediaId: " + str + ", offset: " + j17 + ", total: " + j18 + ", result: " + c2CDownloadResult);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f355418f;
        dn.o oVar = (dn.o) concurrentHashMap.get(str);
        if (oVar != null && (nVar3 = oVar.f241815c2) != null) {
            nVar3.f(str, j17, j18);
        }
        if (c2CDownloadResult == null) {
            dn.o oVar2 = (dn.o) concurrentHashMap.get(str);
            if (oVar2 == null || (nVar = oVar2.f241815c2) == null) {
                return;
            }
            nVar.g(str, -1, null);
            return;
        }
        dn.o oVar3 = (dn.o) concurrentHashMap.get(str);
        if (oVar3 == null || (nVar2 = oVar3.f241815c2) == null) {
            return;
        }
        int i17 = c2CDownloadResult.errorCode;
        dn.h hVar = new dn.h();
        hVar.field_recvedBytes = c2CDownloadResult.recvedBytes;
        hVar.field_fileLength = c2CDownloadResult.fileSize;
        nVar2.g(str, i17, hVar);
    }

    @Override // com.tencent.mars.cdn.CdnManager.AppCallback
    public void onTaskTearDown(java.lang.String str, com.tencent.mars.cdn.CdnManager.DownloadTaskProfile downloadTaskProfile, java.lang.String str2) {
    }

    @Override // com.tencent.mars.cdn.CdnManager.AppCallback
    public void reportFlow(int i17, int i18, int i19, int i27) {
    }

    @Override // com.tencent.mars.cdn.CdnManager.AppCallback
    public void reportFlowWithTag(java.lang.String str, int i17, long j17, long j18, long j19, long j27) {
    }

    @Override // com.tencent.mars.cdn.CdnManager.AppCallback
    public void reportGroupIDKey(int[] idArray, int[] keyArray, int[] valueArray, int i17, boolean z17) {
        kotlin.jvm.internal.o.g(idArray, "idArray");
        kotlin.jvm.internal.o.g(keyArray, "keyArray");
        kotlin.jvm.internal.o.g(valueArray, "valueArray");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i18 = 0; i18 < i17; i18++) {
            arrayList.add(new com.tencent.mars.smc.IDKey(idArray[i18], keyArray[i18], valueArray[i18]));
        }
        jx3.f.INSTANCE.b(arrayList, z17);
    }

    @Override // com.tencent.mars.cdn.CdnManager.AppCallback
    public void reportIDKey(long j17, long j18, long j19, boolean z17) {
        jx3.f.INSTANCE.idkeyStat(j17, j18, j19, z17);
    }

    @Override // com.tencent.mars.cdn.CdnManager.AppCallback
    public void reportKV(long j17, java.lang.String str, boolean z17, boolean z18, long j18) {
        jx3.f.INSTANCE.n((int) j17, (int) j18, str, z18, z17);
    }

    @Override // com.tencent.mars.cdn.CdnManager.AppCallback
    public void reportKVNoFreqLimit(long j17, java.lang.String str) {
        com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandCdnService", "!no impl!");
    }

    @Override // com.tencent.mars.cdn.CdnManager.AppCallback
    public void requestGetCDN(int i17) {
    }

    @Override // com.tencent.mars.cdn.CdnManager.AppCallback
    public void requestSnsGetCdnDistance(int i17, int i18, int i19) {
    }

    @Override // com.tencent.mars.cdn.CdnManager.AppCallback
    public java.lang.String[] resolveHost(java.lang.String str, boolean z17, int[] iArr) {
        if (iArr != null) {
            kotlin.jvm.internal.o.f(java.util.Arrays.toString(iArr), "toString(...)");
        }
        return new java.lang.String[0];
    }
}
