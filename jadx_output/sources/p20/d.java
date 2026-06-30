package p20;

/* loaded from: classes12.dex */
public final class d implements com.tencent.mars.cdn.CdnManager.VideoStreamingCallback {
    @Override // com.tencent.mars.cdn.CdnManager.VideoStreamingCallback
    public void onDataAvailable(java.lang.String str, long j17, long j18) {
        com.tencent.mars.xlog.Log.i("EcsPlayerPreloadMgr", "onDataAvailable mediaId:" + str + " offset:" + j17 + " length:" + j18);
    }

    @Override // com.tencent.mars.cdn.CdnManager.VideoStreamingCallback
    public void onDownloadToEnd(java.lang.String str, long j17, long j18) {
        com.tencent.mars.xlog.Log.i("EcsPlayerPreloadMgr", "onDownloadToEnd mediaId:" + str + " offset:" + j17 + " length:" + j18);
    }

    @Override // com.tencent.mars.cdn.CdnManager.VideoStreamingCallback
    public void onM3U8Ready(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("EcsPlayerPreloadMgr", "onM3U8Ready mediaId:" + str + " m3u8:" + str2);
    }

    @Override // com.tencent.mars.cdn.CdnManager.VideoStreamingCallback
    public void onMoovReady(java.lang.String str, long j17, long j18, com.tencent.mars.cdn.CdnManager.VideoInfo videoInfo) {
        com.tencent.mars.xlog.Log.i("EcsPlayerPreloadMgr", "onMoovReady mediaId:" + str + " offset:" + j17 + " length:" + j18 + " info:" + videoInfo);
    }

    @Override // com.tencent.mars.cdn.CdnManager.VideoStreamingCallback
    public void onMoovReadyWithFlag(java.lang.String str, long j17, long j18, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("EcsPlayerPreloadMgr", "onMoovReadyWithFlag mediaId:" + str + " offset:" + j17 + " length:" + j18 + " svrflag:" + str2);
    }

    @Override // com.tencent.mars.cdn.CdnManager.VideoStreamingCallback
    public void onObtainMoovFailed(java.lang.String str, int i17) {
        com.tencent.mars.xlog.Log.i("EcsPlayerPreloadMgr", "onObtainMoovFailed mediaId:" + str + " reason:" + i17);
    }

    @Override // com.tencent.mars.cdn.CdnManager.VideoStreamingCallback
    public void onPreloadCompletedWithResult(java.lang.String str, long j17, long j18, com.tencent.mars.cdn.CdnManager.C2CDownloadResult c2CDownloadResult) {
        com.tencent.mars.xlog.Log.i("EcsPlayerPreloadMgr", "onPreloadCompletedWithResult mediaId:" + str + " finished:" + j17 + " total:" + j18 + " result:" + c2CDownloadResult);
    }
}
