package ct2;

/* loaded from: classes15.dex */
public final class l implements com.tencent.thumbplayer.api.proxy.ITPPreloadProxy.IPreloadListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ct2.m f222287a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f222288b;

    public l(ct2.m mVar, java.lang.String str) {
        this.f222287a = mVar;
        this.f222288b = str;
    }

    @Override // com.tencent.thumbplayer.api.proxy.ITPPreloadProxy.IPreloadListener
    public void onPrepareDownloadProgressUpdate(int i17, int i18, long j17, long j18) {
        com.tencent.mars.xlog.Log.i("LiveReplayTransitionPreloadSlice", "preloadTTPlayer  onPrepareDownloadProgressUpdate   fileId(replayTransitionId):" + this.f222288b + "   playableDurationMS:" + i17 + "  currentDownloadSizeByte：" + j17 + "   totalFileSizeByte:" + j18);
    }

    @Override // com.tencent.thumbplayer.api.proxy.ITPPreloadProxy.IPreloadListener
    public void onPrepareError() {
        this.f222287a.f222290e = 0;
        com.tencent.mars.xlog.Log.e("LiveReplayTransitionPreloadSlice", "preloadTTPlayer  onPrepareError  fileId(replayTransitionId):" + this.f222288b);
    }

    @Override // com.tencent.thumbplayer.api.proxy.ITPPreloadProxy.IPreloadListener
    public void onPrepareSuccess() {
        this.f222287a.f222290e = 0;
        com.tencent.mars.xlog.Log.i("LiveReplayTransitionPreloadSlice", "preloadTTPlayer  onPrepareSuccess  fileId(replayTransitionId):" + this.f222288b);
    }
}
