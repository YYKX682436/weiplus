package ha3;

/* loaded from: classes12.dex */
public final class i0 implements com.tencent.mars.cdn.CdnManager.VideoStreamingCallback, com.tencent.mars.cdn.CdnManager.DownloadCallback, com.tencent.mars.cdn.CdnManager.AppCallback {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f279873d = new java.util.HashMap();

    public final int a(dn.o task) {
        kotlin.jvm.internal.o.g(task, "task");
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayerCdnService", "addDownloadTask mediaId: " + task.field_mediaId);
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
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayerCdnService", "startHttpVideoStreamingDownload result: " + startHttpVideoStreamingDownload);
        if (startHttpVideoStreamingDownload == 0) {
            java.util.HashMap hashMap = this.f279873d;
            java.lang.String field_mediaId = task.field_mediaId;
            kotlin.jvm.internal.o.f(field_mediaId, "field_mediaId");
            hashMap.put(field_mediaId, task);
        }
        return startHttpVideoStreamingDownload;
    }

    public final int b(java.lang.String mediaId) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayerCdnService", "cancelDownloadTask mediaId: ".concat(mediaId));
        int cancelDownloadTaskWithResult = ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).cancelDownloadTaskWithResult(mediaId, new com.tencent.mars.cdn.CdnManager.C2CDownloadResult());
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayerCdnService", "cancelDownloadTaskWithResult result: " + cancelDownloadTaskWithResult);
        if (cancelDownloadTaskWithResult == 0) {
            this.f279873d.remove(mediaId);
        }
        return cancelDownloadTaskWithResult;
    }

    public final int c(java.lang.String mediaId, long j17, long j18, int i17) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayerCdnService", "requestVideoData mediaId: " + mediaId + " offset: " + j17 + " length: " + j18 + " duration_ms: " + i17);
        return ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).requestVideoData(mediaId, j17, j18, i17);
    }

    @Override // com.tencent.mars.cdn.CdnManager.AppCallback
    public java.lang.String[] combineResolveHost(java.lang.String str, int i17, int i18, int[] iArr) {
        return new java.lang.String[0];
    }

    @Override // com.tencent.mars.cdn.CdnManager.AppCallback
    public boolean isUsingWangKaService(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayerCdnService", "isUsingWangKaService wkType: " + i17);
        return false;
    }

    @Override // com.tencent.mars.cdn.CdnManager.AppCallback
    public void onBadNetworkProbed() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayerCdnService", "onBadNetworkProbed");
    }

    @Override // com.tencent.mars.cdn.CdnManager.DownloadCallback
    public void onC2CDownloadCompleted(java.lang.String str, com.tencent.mars.cdn.CdnManager.C2CDownloadResult c2CDownloadResult) {
        dn.n nVar;
        dn.n nVar2;
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayerCdnService", "onC2CDownloadCompleted mediaId: " + str + " result: " + c2CDownloadResult);
        dn.o oVar = (dn.o) this.f279873d.get(str);
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
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayerCdnService", "onDataAvailable mediaId: " + str + " offset: " + j17 + " length: " + j18);
        dn.o oVar = (dn.o) this.f279873d.get(str);
        if (oVar == null || (nVar = oVar.f241815c2) == null) {
            return;
        }
        nVar.onDataAvailable(str, j17, j18);
    }

    @Override // com.tencent.mars.cdn.CdnManager.DownloadCallback
    public void onDownloadProgressChanged(java.lang.String str, long j17, long j18, boolean z17) {
        dn.n nVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayerCdnService", "onDownloadProgressChanged mediaId: " + str + " offset: " + j17 + " total: " + j18 + " tryShow: " + z17);
        dn.o oVar = (dn.o) this.f279873d.get(str);
        if (oVar == null || (nVar = oVar.f241815c2) == null) {
            return;
        }
        nVar.f(str, j17, j18);
    }

    @Override // com.tencent.mars.cdn.CdnManager.VideoStreamingCallback
    public void onDownloadToEnd(java.lang.String str, long j17, long j18) {
        dn.n nVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayerCdnService", "onDataAvailable mediaId: " + str + " offset: " + j17 + " length: " + j18);
        dn.o oVar = (dn.o) this.f279873d.get(str);
        if (oVar == null || (nVar = oVar.f241815c2) == null) {
            return;
        }
        nVar.f(str, j17, j18);
    }

    @Override // com.tencent.mars.cdn.CdnManager.VideoStreamingCallback
    public void onM3U8Ready(java.lang.String str, java.lang.String str2) {
        dn.n nVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayerCdnService", "onM3U8Ready mediaId: " + str + ", m3u8: " + str2);
        dn.o oVar = (dn.o) this.f279873d.get(str);
        if (oVar == null || (nVar = oVar.f241815c2) == null) {
            return;
        }
        nVar.onM3U8Ready(str, str2);
    }

    @Override // com.tencent.mars.cdn.CdnManager.VideoStreamingCallback
    public void onMoovReady(java.lang.String str, long j17, long j18, com.tencent.mars.cdn.CdnManager.VideoInfo videoInfo) {
        dn.n nVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayerCdnService", "onMoovReady mediaId: " + str + " offset: " + j17 + " length: " + j18 + " videoInfo: " + videoInfo);
        dn.o oVar = (dn.o) this.f279873d.get(str);
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
        com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppVideoPlayerCdnService", "onObtainMoovFailed mediaId: " + str + " reason: " + i17);
    }

    @Override // com.tencent.mars.cdn.CdnManager.VideoStreamingCallback
    public void onPreloadCompletedWithResult(java.lang.String str, long j17, long j18, com.tencent.mars.cdn.CdnManager.C2CDownloadResult c2CDownloadResult) {
        dn.n nVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayerCdnService", "onPreloadCompletedWithResult mediaId: " + str + " offset: " + j17 + " length: " + j18 + " result: " + c2CDownloadResult);
        dn.o oVar = (dn.o) this.f279873d.get(str);
        if (oVar == null || (nVar = oVar.f241815c2) == null) {
            return;
        }
        nVar.f(str, j17, j18);
    }

    @Override // com.tencent.mars.cdn.CdnManager.AppCallback
    public void onTaskTearDown(java.lang.String str, com.tencent.mars.cdn.CdnManager.DownloadTaskProfile downloadTaskProfile, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayerCdnService", "onTaskTearDown mediaKey: " + str + ", profile: " + downloadTaskProfile + ", reportJson: " + str2);
    }

    @Override // com.tencent.mars.cdn.CdnManager.AppCallback
    public void reportFlow(int i17, int i18, int i19, int i27) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayerCdnService", "reportFlow wifi_recv: " + i17 + ", wifi_send: " + i18 + ", mobile_recv: " + i19 + ", mobile_send: " + i27);
    }

    @Override // com.tencent.mars.cdn.CdnManager.AppCallback
    public void reportFlowWithTag(java.lang.String str, int i17, long j17, long j18, long j19, long j27) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayerCdnService", "reportFlowWithTag tag: " + str + ", durationSeconds: " + i17 + ", wifi_recv: " + j17 + ", wifi_send: " + j18 + ", mobile_recv: " + j19 + ", mobile_send: " + j27);
    }

    @Override // com.tencent.mars.cdn.CdnManager.AppCallback
    public void reportGroupIDKey(int[] iArr, int[] iArr2, int[] iArr3, int i17, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayerCdnService", "reportGroupIDKey idArray: " + iArr + ", keyArray: " + iArr2 + ", valueArray: " + iArr3 + ", arraySize: " + i17 + ", isImportant: " + z17);
    }

    @Override // com.tencent.mars.cdn.CdnManager.AppCallback
    public void reportIDKey(long j17, long j18, long j19, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayerCdnService", "reportIDKey ID: " + j17 + ", key: " + j18 + ", value: " + j19 + ", isImportant: " + z17);
    }

    @Override // com.tencent.mars.cdn.CdnManager.AppCallback
    public void reportKV(long j17, java.lang.String str, boolean z17, boolean z18, long j18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayerCdnService", "reportKV logId: " + j17 + ", value: " + str + ", isImportant: " + z17 + ", isReportNow: " + z18 + ", type: " + j18);
    }

    @Override // com.tencent.mars.cdn.CdnManager.AppCallback
    public void reportKVNoFreqLimit(long j17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayerCdnService", "reportKVNoFreqLimit logId: " + j17 + ", value: " + str);
    }

    @Override // com.tencent.mars.cdn.CdnManager.AppCallback
    public void requestGetCDN(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayerCdnService", "requestGetCDN reason: " + i17);
    }

    @Override // com.tencent.mars.cdn.CdnManager.AppCallback
    public void requestSnsGetCdnDistance(int i17, int i18, int i19) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayerCdnService", "requestSnsGetCdnDistance version: " + i17 + ", myProvince: " + i18 + ", myCity: " + i19);
    }

    @Override // com.tencent.mars.cdn.CdnManager.AppCallback
    public java.lang.String[] resolveHost(java.lang.String str, boolean z17, int[] iArr) {
        return new java.lang.String[0];
    }
}
