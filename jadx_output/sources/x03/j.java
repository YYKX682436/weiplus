package x03;

/* loaded from: classes12.dex */
public final class j implements com.tencent.mars.cdn.CdnManager.VideoStreamingCallback, com.tencent.mars.cdn.CdnManager.DownloadCallback, com.tencent.mars.cdn.CdnManager.AppCallback {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f451060d = new java.util.HashMap();

    public j() {
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterCdnService", "CdnManager Initialize");
        com.tencent.mars.cdn.CdnManager cdnManager = new com.tencent.mars.cdn.CdnManager(com.tencent.mars.MarsContext.getContext());
        com.tencent.mars.MarsContext.getContext().addManager(com.tencent.mars.cdn.CdnManager.class, cdnManager);
        cdnManager.onCreate(com.tencent.mm.vfs.w6.i(com.tencent.mm.sdk.platformtools.x2.f193071a.getFilesDir().toString() + "/NativeCDNInfo", true), "cdnwx2013usrname", java.lang.Boolean.valueOf(true ^ c01.e2.a0()));
        cdnManager.setAppCallback(this);
        cdnManager.setRSAPublicKeyParams("1", "BFEDFFB5EA28509F9C89ED83FA7FDDA8881435D444E984D53A98AD8E9410F1145EDD537890E10456190B22E6E5006455EFC6C12E41FDA985F38FBBC7213ECB810E3053D4B8D74FFBC70B4600ABD728202322AFCE1406046631261BD5EE3D44721082FEAB74340D73645DC0D02A293B962B9D47E4A64100BD7524DE00D9D3B5C1", "010001");
        cdnManager.setToUserCiper("cdnwx2013usrname");
        com.tencent.mars.cdn.CdnC2Java.setCallback(new com.tencent.mars.cdn.CdnC2JavaCallBack());
        ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).setFlowReportParams("ANDROID.MM.CDN.FlutterCdnService", 5242880L, 60);
    }

    public final int a(dn.o task) {
        kotlin.jvm.internal.o.g(task, "task");
        com.tencent.mars.cdn.CdnManager.C2CDownloadRequest c2CDownloadRequest = new com.tencent.mars.cdn.CdnManager.C2CDownloadRequest();
        c2CDownloadRequest.fileKey = task.field_mediaId;
        c2CDownloadRequest.url = task.M1;
        c2CDownloadRequest.referer = task.N1;
        c2CDownloadRequest.setSavePath(task.field_fullpath);
        c2CDownloadRequest.fileType = 0;
        c2CDownloadRequest.concurrentCount = 10;
        c2CDownloadRequest.preloadRatio = task.field_preloadRatio;
        c2CDownloadRequest.preloadMinSize = task.f241805x;
        int startHttpVideoStreamingDownload = ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).startHttpVideoStreamingDownload(c2CDownloadRequest, this, this, task.H1);
        if (startHttpVideoStreamingDownload == 0) {
            java.util.HashMap hashMap = this.f451060d;
            java.lang.String field_mediaId = task.field_mediaId;
            kotlin.jvm.internal.o.f(field_mediaId, "field_mediaId");
            hashMap.put(field_mediaId, task);
        }
        return startHttpVideoStreamingDownload;
    }

    public final int b(java.lang.String str) {
        int cancelDownloadTaskWithResult = ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).cancelDownloadTaskWithResult(str, new com.tencent.mars.cdn.CdnManager.C2CDownloadResult());
        if (cancelDownloadTaskWithResult == 0) {
            kotlin.jvm.internal.m0.c(this.f451060d).remove(str);
        }
        return cancelDownloadTaskWithResult;
    }

    @Override // com.tencent.mars.cdn.CdnManager.AppCallback
    public java.lang.String[] combineResolveHost(java.lang.String str, int i17, int i18, int[] iArr) {
        com.tencent.mars.xlog.Log.e("MicroMsg.FlutterCdnService", "resolveHost not impl!");
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
        java.util.Objects.toString(c2CDownloadResult);
        dn.o oVar = (dn.o) this.f451060d.get(str);
        dn.h hVar = new dn.h();
        if (c2CDownloadResult == null) {
            if (oVar == null || (nVar = oVar.f241815c2) == null) {
                return;
            }
            nVar.g(str, -1, null);
            return;
        }
        hVar.field_recvedBytes = c2CDownloadResult.recvedBytes;
        hVar.field_fileLength = c2CDownloadResult.fileSize;
        if (oVar == null || (nVar2 = oVar.f241815c2) == null) {
            return;
        }
        nVar2.g(str, c2CDownloadResult.errorCode, hVar);
    }

    @Override // com.tencent.mars.cdn.CdnManager.VideoStreamingCallback
    public void onDataAvailable(java.lang.String str, long j17, long j18) {
        dn.n nVar;
        dn.o oVar = (dn.o) this.f451060d.get(str);
        if (oVar == null || (nVar = oVar.f241815c2) == null) {
            return;
        }
        nVar.onDataAvailable(str, j17, j18);
    }

    @Override // com.tencent.mars.cdn.CdnManager.DownloadCallback
    public void onDownloadProgressChanged(java.lang.String str, long j17, long j18, boolean z17) {
        dn.n nVar;
        dn.o oVar = (dn.o) this.f451060d.get(str);
        if (oVar == null || (nVar = oVar.f241815c2) == null) {
            return;
        }
        nVar.f(str, j17, j18);
    }

    @Override // com.tencent.mars.cdn.CdnManager.VideoStreamingCallback
    public void onDownloadToEnd(java.lang.String str, long j17, long j18) {
    }

    @Override // com.tencent.mars.cdn.CdnManager.VideoStreamingCallback
    public void onM3U8Ready(java.lang.String str, java.lang.String str2) {
        dn.n nVar;
        dn.o oVar = (dn.o) this.f451060d.get(str);
        if (oVar == null || (nVar = oVar.f241815c2) == null) {
            return;
        }
        nVar.onM3U8Ready(str, str2);
    }

    @Override // com.tencent.mars.cdn.CdnManager.VideoStreamingCallback
    public void onMoovReady(java.lang.String str, long j17, long j18, com.tencent.mars.cdn.CdnManager.VideoInfo videoInfo) {
        dn.n nVar;
        dn.o oVar = (dn.o) this.f451060d.get(str);
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
        dn.o oVar = (dn.o) this.f451060d.get(str);
        if (oVar == null || (nVar = oVar.f241815c2) == null) {
            return;
        }
        nVar.f(str, j17, j18);
    }

    @Override // com.tencent.mars.cdn.CdnManager.AppCallback
    public void onTaskTearDown(java.lang.String str, com.tencent.mars.cdn.CdnManager.DownloadTaskProfile downloadTaskProfile, java.lang.String str2) {
    }

    @Override // com.tencent.mars.cdn.CdnManager.AppCallback
    public void reportFlow(int i17, int i18, int i19, int i27) {
    }

    @Override // com.tencent.mars.cdn.CdnManager.AppCallback
    public void reportFlowWithTag(java.lang.String str, int i17, long j17, long j18, long j19, long j27) {
        ((kn4.d0) ((pf0.r) i95.n0.c(pf0.r.class))).getClass();
        kn4.c0.INSTANCE.b(str, j18, j17, j27, j19);
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
        com.tencent.mars.xlog.Log.w("MicroMsg.FlutterCdnService", "!no impl!");
    }

    @Override // com.tencent.mars.cdn.CdnManager.AppCallback
    public void requestGetCDN(int i17) {
        com.tencent.mars.xlog.Log.e("MicroMsg.FlutterCdnService", "requestGetCDN not impl!");
    }

    @Override // com.tencent.mars.cdn.CdnManager.AppCallback
    public void requestSnsGetCdnDistance(int i17, int i18, int i19) {
    }

    @Override // com.tencent.mars.cdn.CdnManager.AppCallback
    public java.lang.String[] resolveHost(java.lang.String str, boolean z17, int[] iArr) {
        com.tencent.mars.xlog.Log.e("MicroMsg.FlutterCdnService", "resolveHost not impl!");
        return new java.lang.String[0];
    }
}
