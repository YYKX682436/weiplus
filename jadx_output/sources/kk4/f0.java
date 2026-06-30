package kk4;

/* loaded from: classes15.dex */
public class f0 implements com.tencent.thumbplayer.api.ITPPlayer, kk4.c {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.thumbplayer.api.ITPPlayer f308525a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f308526b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f308527c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f308528d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f308529e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.thumbplayer.api.ITPPlayerListener.IOnInfoListener f308530f;

    /* renamed from: g, reason: collision with root package name */
    public long f308531g;

    /* renamed from: h, reason: collision with root package name */
    public long f308532h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f308533i = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f308534j;

    /* renamed from: k, reason: collision with root package name */
    public com.tencent.thumbplayer.datatransport.resourceloader.ITPAssetResourceLoader f308535k;

    /* renamed from: l, reason: collision with root package name */
    public android.view.Surface f308536l;

    /* renamed from: m, reason: collision with root package name */
    public int f308537m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.thumbplayer.api.ITPPlayerListener.IOnInfoListener f308538n;

    /* renamed from: o, reason: collision with root package name */
    public lk4.a f308539o;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.thumbplayer.api.ITPPlayerListener.IOnStateChangeListener f308540p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.thumbplayer.api.ITPPlayerListener.IOnStateChangeListener f308541q;

    public f0(android.content.Context context, android.os.Looper looper) {
        new androidx.lifecycle.v() { // from class: com.tencent.mm.plugin.thumbplayer.player.MMTPPlayer$lifecycleEventObserver$1
            @Override // androidx.lifecycle.v
            public void onStateChanged(androidx.lifecycle.y source, androidx.lifecycle.m event) {
                kotlin.jvm.internal.o.g(source, "source");
                kotlin.jvm.internal.o.g(event, "event");
                if (event == androidx.lifecycle.m.ON_DESTROY) {
                    source.mo133getLifecycle().c(this);
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(source);
                    sb6.append(" ON_DESTROY  state:");
                    kk4.f0 f0Var = kk4.f0.this;
                    sb6.append(f0Var.getCurrentState());
                    sb6.append(" null");
                    f0Var.getClass();
                    com.tencent.mars.xlog.Log.i("MMTPPlayer#" + this, sb6.toString());
                    f0Var.getClass();
                }
            }
        };
        kk4.e0 e0Var = new kk4.e0(this);
        this.f308540p = e0Var;
        androidx.fragment.app.FragmentActivity fragmentActivity = context instanceof androidx.fragment.app.FragmentActivity ? (androidx.fragment.app.FragmentActivity) context : null;
        if (fragmentActivity != null && fragmentActivity.mo133getLifecycle().b() == androidx.lifecycle.n.DESTROYED) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            com.tencent.mars.xlog.Log.w(e(), "can't create player in invalid state:" + fragmentActivity.mo133getLifecycle().b());
        }
        com.tencent.thumbplayer.api.ITPPlayer createTPPlayer = com.tencent.thumbplayer.api.TPPlayerFactory.createTPPlayer(context, looper, null);
        kotlin.jvm.internal.o.f(createTPPlayer, "createTPPlayer(...)");
        this.f308525a = createTPPlayer;
        createTPPlayer.setOnPlayerStateChangeListener(e0Var);
        com.tencent.mm.sdk.platformtools.Log.c(e(), "create tp player instance", new java.lang.Object[0]);
    }

    public final void a() {
        com.tencent.mars.xlog.Log.i(e(), "resetData setDataSource false");
        this.f308533i = "";
        this.f308527c = false;
        this.f308528d = false;
        this.f308531g = 0L;
        this.f308532h = 0L;
        this.f308529e = false;
        this.f308538n = null;
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void addAudioTrackSource(java.lang.String str, java.lang.String str2) {
        this.f308525a.addAudioTrackSource(str, str2);
        com.tencent.mars.xlog.Log.i(e(), "addAudioTrackSource url:" + str + " name:" + str2);
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void addSubtitleSource(java.lang.String url, java.lang.String str, java.lang.String name) {
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(name, "name");
        this.f308525a.addSubtitleSource(url, str, name);
        com.tencent.mars.xlog.Log.i(e(), "addSubtitleSource url:" + url + " mimeType:" + str + " name:" + name);
    }

    public void b(lk4.a filter) {
        kotlin.jvm.internal.o.g(filter, "filter");
        this.f308539o = filter;
        setOnAudioProcessFrameOutputListener(new kk4.w(this));
    }

    public final void c(java.lang.String str, yz5.a aVar) {
        if (this.f308527c) {
            com.tencent.mars.xlog.Log.e(e(), "already setDataSource " + str);
            return;
        }
        this.f308527c = true;
        this.f308531g = java.lang.System.currentTimeMillis();
        com.tencent.mm.sdk.platformtools.Log.c(e(), "setDataSource with " + str, new java.lang.Object[0]);
        aVar.invoke();
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void captureVideo(com.tencent.thumbplayer.api.TPCaptureParams tPCaptureParams, com.tencent.thumbplayer.api.TPCaptureCallBack tPCaptureCallBack) {
        this.f308525a.captureVideo(tPCaptureParams, tPCaptureCallBack);
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public int configBufferDurationAsync(int i17, long j17, long j18, long j19) {
        return this.f308525a.configBufferDurationAsync(i17, j17, j18, j19);
    }

    public void d(java.lang.String mediaId, java.lang.String str) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        this.f308533i = mediaId;
        this.f308534j = str;
        com.tencent.mars.xlog.Log.i(e(), "setMediaId " + mediaId + " downloadFlag:" + str);
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void deselectTrack(int i17, long j17) {
        this.f308525a.deselectTrack(i17, j17);
        com.tencent.mars.xlog.Log.i(e(), "deselectTrack index:" + i17 + " opaque:" + j17);
    }

    public final java.lang.String e() {
        return "MicroMsg.TP.MMTPPlayer@" + hashCode();
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void enableTPAssetResourceLoader(com.tencent.thumbplayer.api.resourceloader.ITPAssetResourceLoaderListener iTPAssetResourceLoaderListener, android.os.Looper looper) {
        this.f308525a.enableTPAssetResourceLoader(iTPAssetResourceLoaderListener, looper);
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public int getAutoExpendBufferCount() {
        return this.f308525a.getAutoExpendBufferCount();
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public long getBufferIOMaxReadDurationPosMs() {
        return this.f308525a.getBufferIOMaxReadDurationPosMs();
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public long getBufferIOMaxReadFileOffset() {
        return this.f308525a.getBufferIOMaxReadFileOffset();
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public long getBufferIOMaxWriteDurationPosMs() {
        return this.f308525a.getBufferIOMaxWriteDurationPosMs();
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public long getBufferIOMaxWriteFileOffset() {
        return this.f308525a.getBufferIOMaxWriteFileOffset();
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public int getBufferPercent() {
        return this.f308525a.getBufferPercent();
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public long getBufferedDurationMs() {
        return this.f308525a.getBufferedDurationMs();
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public long getBufferedSize() {
        return this.f308525a.getBufferedSize();
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public long getCurrentPositionMs() {
        return this.f308525a.getCurrentPositionMs();
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public int getCurrentState() {
        return this.f308525a.getCurrentState();
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public long getDurationMs() {
        return this.f308525a.getDurationMs();
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public com.tencent.thumbplayer.api.reportv2.ITPExtendReportController getExtendReportController() {
        return this.f308525a.getExtendReportController();
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public long getPlayableDurationMs() {
        return this.f308525a.getPlayableDurationMs();
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public long getPlayerBufferedDurationMs() {
        return this.f308525a.getPlayerBufferedDurationMs();
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public com.tencent.thumbplayer.api.proxy.ITPPlayerProxy getPlayerProxy() {
        com.tencent.thumbplayer.api.proxy.ITPPlayerProxy playerProxy = this.f308525a.getPlayerProxy();
        kotlin.jvm.internal.o.f(playerProxy, "getPlayerProxy(...)");
        return playerProxy;
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public int getPlayerType() {
        return this.f308525a.getPlayerType();
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public com.tencent.thumbplayer.api.TPProgramInfo[] getProgramInfo() {
        com.tencent.thumbplayer.api.TPProgramInfo[] programInfo = this.f308525a.getProgramInfo();
        kotlin.jvm.internal.o.f(programInfo, "getProgramInfo(...)");
        return programInfo;
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public long getPropertyLong(int i17) {
        return this.f308525a.getPropertyLong(i17);
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public java.lang.String getPropertyString(int i17) {
        java.lang.String propertyString = this.f308525a.getPropertyString(i17);
        kotlin.jvm.internal.o.f(propertyString, "getPropertyString(...)");
        return propertyString;
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public com.tencent.thumbplayer.api.report.ITPBusinessReportManager getReportManager() {
        return this.f308525a.getReportManager();
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public com.tencent.thumbplayer.api.TPTrackInfo[] getTrackInfo() {
        com.tencent.thumbplayer.api.TPTrackInfo[] trackInfo = this.f308525a.getTrackInfo();
        kotlin.jvm.internal.o.f(trackInfo, "getTrackInfo(...)");
        return trackInfo;
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public int getVideoHeight() {
        return this.f308525a.getVideoHeight();
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public int getVideoWidth() {
        return this.f308525a.getVideoWidth();
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void pause() {
        this.f308525a.pause();
        com.tencent.mars.xlog.Log.i(e(), "pause");
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void pauseDownload() {
        this.f308525a.pauseDownload();
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void prepareAsync() {
        if (this.f308528d) {
            com.tencent.mars.xlog.Log.i(e(), "already prepareAsync");
            return;
        }
        this.f308528d = true;
        if (this.f308539o != null) {
            setPlayerOptionalParam(new com.tencent.thumbplayer.api.TPOptionalParam().buildLong(505, 1L));
            setPlayerOptionalParam(new com.tencent.thumbplayer.api.TPOptionalParam().buildLong(305, 20));
        }
        this.f308525a.prepareAsync();
        com.tencent.mars.xlog.Log.i(e(), "prepareAsync mediaId:" + this.f308533i);
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void release() {
        this.f308525a.release();
        lk4.a aVar = this.f308539o;
        if (aVar != null) {
            lk4.b bVar = (lk4.b) aVar;
            if (bVar.f319017d != 0) {
                ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Bi(bVar.f319017d);
                bVar.f319017d = 0L;
                com.tencent.mars.xlog.Log.i(bVar.f319016c, "release");
            }
        }
        this.f308539o = null;
        a();
        com.tencent.mars.xlog.Log.i(e(), "release");
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void reset() {
        this.f308525a.reset();
        a();
        com.tencent.mars.xlog.Log.i(e(), "reset");
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void resumeDownload() {
        this.f308525a.resumeDownload();
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void seekTo(int i17) {
        this.f308525a.seekTo(i17);
        com.tencent.mars.xlog.Log.i(e(), "seekTo:" + i17);
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void selectProgram(int i17, long j17) {
        this.f308525a.selectProgram(i17, j17);
        com.tencent.mars.xlog.Log.i(e(), "selectProgram index:" + i17 + " opaque:" + j17);
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void selectTrack(int i17, long j17) {
        this.f308525a.selectTrack(i17, j17);
        com.tencent.mars.xlog.Log.i(e(), "selectTrack index:" + i17 + " opaque:" + j17);
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void setAudioGainRatio(float f17) {
        this.f308525a.setAudioGainRatio(f17);
        com.tencent.mars.xlog.Log.i(e(), "setAudioGainRatio " + this.f308526b);
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void setAudioNormalizeVolumeParams(java.lang.String str) {
        this.f308525a.setAudioNormalizeVolumeParams(str);
        com.tencent.mars.xlog.Log.i(e(), "setAudioNormalizeVolumeParams " + str);
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void setDataSource(java.lang.String str) {
        c("url", new kk4.x(this, str));
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void setLoopback(boolean z17) {
        this.f308525a.setLoopback(z17);
        com.tencent.mars.xlog.Log.i(e(), "setLoopback:" + z17);
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void setOnAudioFrameOutputListener(com.tencent.thumbplayer.api.ITPPlayerListener.IOnAudioFrameOutputListener iOnAudioFrameOutputListener) {
        this.f308525a.setOnAudioFrameOutputListener(iOnAudioFrameOutputListener);
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void setOnAudioProcessFrameOutputListener(com.tencent.thumbplayer.api.ITPPlayerListener.IOnAudioProcessFrameOutputListener iOnAudioProcessFrameOutputListener) {
        this.f308525a.setOnAudioProcessFrameOutputListener(iOnAudioProcessFrameOutputListener);
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void setOnCompletionListener(com.tencent.thumbplayer.api.ITPPlayerListener.IOnCompletionListener iOnCompletionListener) {
        this.f308525a.setOnCompletionListener(iOnCompletionListener);
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void setOnDemuxerListener(com.tencent.thumbplayer.api.ITPPlayerListener.IOnDemuxerListener iOnDemuxerListener) {
        this.f308525a.setOnDemuxerListener(iOnDemuxerListener);
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void setOnDetailInfoListener(com.tencent.thumbplayer.api.ITPPlayerListener.IOnDetailInfoListener iOnDetailInfoListener) {
        this.f308525a.setOnDetailInfoListener(iOnDetailInfoListener);
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void setOnErrorListener(com.tencent.thumbplayer.api.ITPPlayerListener.IOnErrorListener iOnErrorListener) {
        this.f308525a.setOnErrorListener(iOnErrorListener);
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void setOnInfoListener(com.tencent.thumbplayer.api.ITPPlayerListener.IOnInfoListener iOnInfoListener) {
        this.f308530f = iOnInfoListener;
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer = this.f308525a;
        if (iOnInfoListener == null) {
            iTPPlayer.setOnInfoListener(null);
        } else {
            iTPPlayer.setOnInfoListener(new kk4.c0(this));
        }
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void setOnPlayerStateChangeListener(com.tencent.thumbplayer.api.ITPPlayerListener.IOnStateChangeListener iOnStateChangeListener) {
        this.f308541q = iOnStateChangeListener;
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void setOnPreparedListener(com.tencent.thumbplayer.api.ITPPlayerListener.IOnPreparedListener iOnPreparedListener) {
        this.f308525a.setOnPreparedListener(new kk4.d0(this, iOnPreparedListener));
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void setOnSeekCompleteListener(com.tencent.thumbplayer.api.ITPPlayerListener.IOnSeekCompleteListener iOnSeekCompleteListener) {
        this.f308525a.setOnSeekCompleteListener(iOnSeekCompleteListener);
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void setOnStopAsyncCompleteListener(com.tencent.thumbplayer.api.ITPPlayerListener.IOnStopAsyncCompleteListener iOnStopAsyncCompleteListener) {
        this.f308525a.setOnStopAsyncCompleteListener(iOnStopAsyncCompleteListener);
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void setOnSubtitleDataListener(com.tencent.thumbplayer.api.ITPPlayerListener.IOnSubtitleDataListener iOnSubtitleDataListener) {
        this.f308525a.setOnSubtitleDataListener(iOnSubtitleDataListener);
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void setOnSubtitleFrameOutListener(com.tencent.thumbplayer.api.ITPPlayerListener.IOnSubtitleFrameOutListener iOnSubtitleFrameOutListener) {
        this.f308525a.setOnSubtitleFrameOutListener(iOnSubtitleFrameOutListener);
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void setOnVideoFrameOutListener(com.tencent.thumbplayer.api.ITPPlayerListener.IOnVideoFrameOutListener iOnVideoFrameOutListener) {
        this.f308525a.setOnVideoFrameOutListener(iOnVideoFrameOutListener);
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void setOnVideoProcessFrameOutputListener(com.tencent.thumbplayer.api.ITPPlayerListener.IOnVideoProcessFrameOutputListener iOnVideoProcessFrameOutputListener) {
        this.f308525a.setOnVideoProcessFrameOutputListener(iOnVideoProcessFrameOutputListener);
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void setOnVideoSizeChangedListener(com.tencent.thumbplayer.api.ITPPlayerListener.IOnVideoSizeChangedListener iOnVideoSizeChangedListener) {
        this.f308525a.setOnVideoSizeChangedListener(iOnVideoSizeChangedListener);
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void setOutputMute(boolean z17) {
        com.tencent.mm.sdk.platformtools.Log.c(e(), "setOutputMute " + z17, new java.lang.Object[0]);
        this.f308525a.setOutputMute(z17);
        this.f308526b = z17;
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void setPlaySharpenSwitch() {
        this.f308525a.setPlaySharpenSwitch();
        com.tencent.mars.xlog.Log.i(e(), "setPlaySharpenSwitch");
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void setPlaySpeedRatio(float f17) {
        this.f308525a.setPlaySpeedRatio(f17);
        com.tencent.mars.xlog.Log.i(e(), "setPlaySpeedRatio " + f17);
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void setPlayerOptionalParam(com.tencent.thumbplayer.api.TPOptionalParam tPOptionalParam) {
        this.f308525a.setPlayerOptionalParam(tPOptionalParam);
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void setRichMediaSynchronizer(com.tencent.thumbplayer.api.richmedia.ITPRichMediaSynchronizer iTPRichMediaSynchronizer) {
        this.f308525a.setRichMediaSynchronizer(iTPRichMediaSynchronizer);
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void setSurface(android.view.Surface surface) {
        this.f308525a.setSurface(surface);
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void setSurfaceHolder(android.view.SurfaceHolder surfaceHolder) {
        this.f308525a.setSurfaceHolder(surfaceHolder);
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void setTPSurface(com.tencent.thumbplayer.api.TPSurface tPSurface) {
        this.f308525a.setTPSurface(tPSurface);
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void setVideoInfo(com.tencent.thumbplayer.api.TPVideoInfo tPVideoInfo) {
        this.f308525a.setVideoInfo(tPVideoInfo);
        com.tencent.mars.xlog.Log.i(e(), "setVideoInfo:" + tPVideoInfo);
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void start() {
        this.f308525a.start();
        com.tencent.mars.xlog.Log.i(e(), "start");
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void stop() {
        this.f308525a.stop();
        a();
        com.tencent.mars.xlog.Log.i(e(), "stop");
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void stopAsync() {
        this.f308525a.stopAsync();
        com.tencent.mars.xlog.Log.i(e(), "stopAsync");
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void switchDefinition(java.lang.String defUrl, long j17, com.tencent.thumbplayer.api.TPVideoInfo tPVideoInfo) {
        kotlin.jvm.internal.o.g(defUrl, "defUrl");
        this.f308525a.switchDefinition(defUrl, j17, tPVideoInfo);
        com.tencent.mars.xlog.Log.i(e(), "switchDefinition:" + defUrl + " id:" + j17 + " info:" + tPVideoInfo);
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void switchHdrModeWithSurface(android.view.Surface surface, int i17) {
        this.f308525a.switchHdrModeWithSurface(surface, i17);
        com.tencent.mars.xlog.Log.i(e(), "switchHdrModeWithSurface surface:" + surface + " hdrMode:" + i17);
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void updateLoggerContext(com.tencent.thumbplayer.log.TPLoggerContext tPLoggerContext) {
        this.f308525a.updateLoggerContext(tPLoggerContext);
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void enableTPAssetResourceLoader(com.tencent.thumbplayer.datatransport.resourceloader.ITPAssetResourceLoader iTPAssetResourceLoader) {
        this.f308535k = iTPAssetResourceLoader;
        this.f308525a.enableTPAssetResourceLoader(iTPAssetResourceLoader);
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void setDataSource(java.lang.String str, java.util.Map map) {
        c("url with header", new kk4.y(this, str, map));
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void setSurface(android.view.Surface surface, int i17) {
        this.f308525a.setSurface(surface, i17);
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void addAudioTrackSource(java.lang.String str, java.lang.String str2, com.tencent.thumbplayer.api.proxy.TPDownloadParamData tPDownloadParamData) {
        this.f308525a.addAudioTrackSource(str, str2, tPDownloadParamData);
        com.tencent.mars.xlog.Log.i(e(), "addAudioTrackSource url:" + str + " name:" + str2 + " data:" + tPDownloadParamData);
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void addSubtitleSource(java.lang.String url, java.lang.String str, java.lang.String name, com.tencent.thumbplayer.api.proxy.TPDownloadParamData tPDownloadParamData) {
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(name, "name");
        this.f308525a.addSubtitleSource(url, str, name, tPDownloadParamData);
        com.tencent.mars.xlog.Log.i(e(), "addSubtitleSource url:" + url + " mimeType:" + str + " name:" + name + " data:" + tPDownloadParamData);
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void seekTo(int i17, int i18) {
        this.f308525a.seekTo(i17, i18);
        com.tencent.mars.xlog.Log.i(e(), "seekTo:" + i17 + " mode:" + i18);
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void setDataSource(android.os.ParcelFileDescriptor parcelFileDescriptor) {
        c("pfd", new kk4.z(this, parcelFileDescriptor));
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void setLoopback(boolean z17, long j17, long j18) {
        this.f308525a.setLoopback(z17, j17, j18);
        com.tencent.mars.xlog.Log.i(e(), "setLoopback:" + z17 + " start:" + j17 + " end:" + j18);
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void switchDefinition(java.lang.String defUrl, long j17, com.tencent.thumbplayer.api.TPVideoInfo tPVideoInfo, java.util.Map map) {
        kotlin.jvm.internal.o.g(defUrl, "defUrl");
        this.f308525a.switchDefinition(defUrl, j17, tPVideoInfo, (java.util.Map<java.lang.String, java.lang.String>) map);
        com.tencent.mars.xlog.Log.i(e(), "header switchDefinition:" + defUrl + " id:" + j17 + " info:" + tPVideoInfo);
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void setDataSource(android.content.res.AssetFileDescriptor assetFileDescriptor) {
        c("afd", new kk4.a0(this, assetFileDescriptor));
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void setDataSource(com.tencent.thumbplayer.api.composition.ITPMediaAsset iTPMediaAsset) {
        c("mat", new kk4.b0(this, iTPMediaAsset));
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void switchDefinition(com.tencent.thumbplayer.api.composition.ITPMediaAsset mediaAsset, long j17, com.tencent.thumbplayer.api.TPVideoInfo tPVideoInfo) {
        kotlin.jvm.internal.o.g(mediaAsset, "mediaAsset");
        this.f308525a.switchDefinition(mediaAsset, j17, tPVideoInfo);
        com.tencent.mars.xlog.Log.i(e(), "header switchDefinition asset id:" + j17 + " info:" + tPVideoInfo);
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void switchDefinition(java.lang.String defUrl, long j17, com.tencent.thumbplayer.api.TPVideoInfo tPVideoInfo, int i17) {
        kotlin.jvm.internal.o.g(defUrl, "defUrl");
        this.f308525a.switchDefinition(defUrl, j17, tPVideoInfo, i17);
        com.tencent.mars.xlog.Log.i(e(), "switchDefinition:" + defUrl + " id:" + j17 + " info:" + tPVideoInfo + " mode:" + i17);
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void switchDefinition(java.lang.String defUrl, long j17, com.tencent.thumbplayer.api.TPVideoInfo tPVideoInfo, java.util.Map map, int i17) {
        kotlin.jvm.internal.o.g(defUrl, "defUrl");
        this.f308525a.switchDefinition(defUrl, j17, tPVideoInfo, map, i17);
        com.tencent.mars.xlog.Log.i(e(), "header switchDefinition:" + defUrl + " id:" + j17 + " info:" + tPVideoInfo + " mode:" + i17);
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void switchDefinition(com.tencent.thumbplayer.api.composition.ITPMediaAsset mediaAsset, long j17, com.tencent.thumbplayer.api.TPVideoInfo tPVideoInfo, int i17) {
        kotlin.jvm.internal.o.g(mediaAsset, "mediaAsset");
        this.f308525a.switchDefinition(mediaAsset, j17, tPVideoInfo, i17);
        com.tencent.mars.xlog.Log.i(e(), "switchDefinition asset id:" + j17 + " info:" + tPVideoInfo + " mode:" + i17);
    }
}
