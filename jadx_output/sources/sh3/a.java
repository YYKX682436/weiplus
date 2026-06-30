package sh3;

/* loaded from: classes15.dex */
public final class a extends rh3.c implements com.tencent.thumbplayer.api.ITPPlayerListener.IOnCompletionListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnInfoListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnErrorListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnSeekCompleteListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnPreparedListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnStateChangeListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnVideoSizeChangedListener {

    /* renamed from: v, reason: collision with root package name */
    public final com.tencent.thumbplayer.api.ITPPlayer f408027v;

    /* renamed from: w, reason: collision with root package name */
    public zh3.a f408028w;

    public a(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer, kotlin.jvm.internal.i iVar) {
        java.util.Objects.requireNonNull(iTPPlayer);
        this.f408027v = iTPPlayer;
        iTPPlayer.setLoopback(true);
        iTPPlayer.setOnPreparedListener(this);
        iTPPlayer.setOnCompletionListener(this);
        iTPPlayer.setOnErrorListener(this);
        iTPPlayer.setOnInfoListener(this);
        iTPPlayer.setOnSeekCompleteListener(this);
        iTPPlayer.setOnPlayerStateChangeListener(this);
        iTPPlayer.setOnVideoSizeChangedListener(this);
    }

    @Override // rh3.o
    public void b(boolean z17) {
        this.f408027v.setLoopback(z17);
    }

    @Override // rh3.o
    public void c(float f17, float f18) {
        this.f408027v.setOutputMute(f17 == 0.0f);
    }

    @Override // rh3.o
    public long getCurrentPositionMs() {
        return this.f408027v.getCurrentPositionMs();
    }

    @Override // rh3.o
    public long getDurationMs() {
        return this.f408027v.getDurationMs();
    }

    @Override // rh3.o
    public int getVideoHeight() {
        return this.f408027v.getVideoHeight();
    }

    @Override // rh3.o
    public int getVideoWidth() {
        return this.f408027v.getVideoWidth();
    }

    @Override // rh3.o
    public boolean isPlaying() {
        boolean z17 = this.f395677u == 5;
        com.tencent.mars.xlog.Log.i(getTag(), "isPlaying:" + z17 + " state:" + this.f395677u);
        return z17;
    }

    @Override // rh3.o
    public java.lang.Object m() {
        return this.f408027v;
    }

    @Override // rh3.o
    public void n(wh3.b mediaSource) {
        kotlin.jvm.internal.o.g(mediaSource, "mediaSource");
        boolean z17 = mediaSource instanceof wh3.a;
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer = this.f408027v;
        java.lang.String str = mediaSource.f445966b;
        if (z17) {
            iTPPlayer.setDataSource(str);
            return;
        }
        if (!(mediaSource instanceof wh3.d)) {
            com.tencent.mars.xlog.Log.w("MMPlayerTPProxy", "setMediaSource unSupport mediaSource:" + mediaSource);
            return;
        }
        zh3.a aVar = this.f408028w;
        if (aVar != null) {
            aVar.b();
        }
        rh3.p pVar = this.f395663d;
        if (pVar == null) {
            kotlin.jvm.internal.o.o("onePlayContext");
            throw null;
        }
        zh3.a aVar2 = new zh3.a(pVar, (wh3.d) mediaSource, this.f395674r);
        this.f408028w = aVar2;
        iTPPlayer.enableTPAssetResourceLoader(aVar2);
        com.tencent.thumbplayer.api.TPVideoInfo.Builder builder = new com.tencent.thumbplayer.api.TPVideoInfo.Builder();
        builder.fileId(mediaSource.f445965a);
        builder.downloadParam(new com.tencent.thumbplayer.api.proxy.TPDownloadParamData(11));
        iTPPlayer.setVideoInfo(builder.build());
        iTPPlayer.setDataSource(str);
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnCompletionListener
    public void onCompletion(com.tencent.thumbplayer.api.ITPPlayer player) {
        kotlin.jvm.internal.o.g(player, "player");
        com.tencent.mars.xlog.Log.i(getTag(), "onCompletion");
        u();
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnErrorListener
    public void onError(com.tencent.thumbplayer.api.ITPPlayer player, int i17, int i18, long j17, long j18) {
        kotlin.jvm.internal.o.g(player, "player");
        v(i17, i18);
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnInfoListener
    public void onInfo(com.tencent.thumbplayer.api.ITPPlayer player, int i17, long j17, long j18, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(player, "player");
        if (i17 == 106) {
            w();
            return;
        }
        if (i17 == 204) {
            com.tencent.mars.xlog.Log.i(getTag(), "video decoder tyep: ", java.lang.Long.valueOf(j17));
            x(this, i17, j17, j18, obj);
            return;
        }
        if (i17 == 1001) {
            com.tencent.mars.xlog.Log.i(getTag(), "play video download finish");
            return;
        }
        if (i17 == 1003) {
            if (obj == null || !(obj instanceof com.tencent.thumbplayer.api.TPPlayerMsg.TPCDNURLInfo)) {
                com.tencent.mars.xlog.Log.i(getTag(), "play cdn info:" + obj);
                return;
            }
            java.lang.String tag = getTag();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onPlayCdnInfoUpdateInternal play cdn info, uip:");
            com.tencent.thumbplayer.api.TPPlayerMsg.TPCDNURLInfo tPCDNURLInfo = (com.tencent.thumbplayer.api.TPPlayerMsg.TPCDNURLInfo) obj;
            sb6.append(tPCDNURLInfo.uIp);
            sb6.append(",cdnIp:");
            sb6.append(tPCDNURLInfo.cdnIp);
            sb6.append(",err:");
            sb6.append(tPCDNURLInfo.errorStr);
            sb6.append(",url:");
            sb6.append(tPCDNURLInfo.url);
            com.tencent.mars.xlog.Log.i(tag, sb6.toString());
            return;
        }
        if (i17 == 1006) {
            if (obj == null || !(obj instanceof com.tencent.thumbplayer.api.TPPlayerMsg.TPDownLoadProgressInfo)) {
                com.tencent.mars.xlog.Log.i(getTag(), "play download process:" + obj);
                return;
            }
            java.lang.String tag2 = getTag();
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("play download process:");
            com.tencent.thumbplayer.api.TPPlayerMsg.TPDownLoadProgressInfo tPDownLoadProgressInfo = (com.tencent.thumbplayer.api.TPPlayerMsg.TPDownLoadProgressInfo) obj;
            sb7.append(tPDownLoadProgressInfo.playableDurationMS);
            sb7.append("ms,");
            sb7.append(tPDownLoadProgressInfo.downloadSpeedKBps);
            sb7.append("KB/s,");
            sb7.append(tPDownLoadProgressInfo.currentDownloadSize);
            sb7.append(',');
            sb7.append(tPDownLoadProgressInfo.totalFileSize);
            com.tencent.mars.xlog.Log.i(tag2, sb7.toString());
            return;
        }
        if (i17 == 200) {
            t();
            return;
        }
        if (i17 == 201) {
            s();
            return;
        }
        if (i17 == 1008) {
            com.tencent.mars.xlog.Log.i(getTag(), "play no more data");
            return;
        }
        if (i17 == 1009) {
            com.tencent.mars.xlog.Log.i(getTag(), "play use proxy:" + j17);
            return;
        }
        x(this, i17, j17, j18, obj);
        com.tencent.mars.xlog.Log.i(getTag(), "onInfo what :" + i17);
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnPreparedListener
    public void onPrepared(com.tencent.thumbplayer.api.ITPPlayer player) {
        kotlin.jvm.internal.o.g(player, "player");
        rh3.s sVar = new rh3.s();
        player.getPropertyLong(101);
        player.getPropertyLong(202);
        player.getPropertyLong(206);
        y(sVar);
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnSeekCompleteListener
    public void onSeekComplete(com.tencent.thumbplayer.api.ITPPlayer player) {
        kotlin.jvm.internal.o.g(player, "player");
        z();
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnStateChangeListener
    public void onStateChange(int i17, int i18) {
        com.tencent.mars.xlog.Log.i(getTag(), "onStateChange from:" + i17 + " to:" + i18);
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnVideoSizeChangedListener
    public void onVideoSizeChanged(com.tencent.thumbplayer.api.ITPPlayer player, long j17, long j18) {
        kotlin.jvm.internal.o.g(player, "player");
        A((int) j17, (int) j18);
    }

    @Override // rh3.c, rh3.o
    public void pause() {
        super.pause();
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer = this.f408027v;
        iTPPlayer.pauseDownload();
        iTPPlayer.pause();
    }

    @Override // rh3.c, rh3.o
    public void prepareAsync() {
        super.prepareAsync();
        try {
            zh3.a aVar = this.f408028w;
            if (aVar != null) {
                aVar.f472964h.c();
            }
            this.f408027v.prepareAsync();
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.e(getTag(), "prepareAsync", e17);
        }
    }

    @Override // rh3.c, rh3.o
    public void release() {
        super.release();
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer = this.f408027v;
        iTPPlayer.pauseDownload();
        zh3.a aVar = this.f408028w;
        if (aVar != null) {
            aVar.b();
        }
        iTPPlayer.release();
    }

    @Override // rh3.c, rh3.o
    public void reset() {
        super.reset();
        this.f408027v.reset();
    }

    @Override // rh3.c, rh3.o
    public void seekTo(long j17) {
        try {
            super.seekTo(j17);
            this.f408027v.seekTo((int) j17, 3);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i(getTag(), "seekTo error" + e17);
        }
    }

    @Override // rh3.o
    public void setOutputMute(boolean z17) {
        this.f408027v.setOutputMute(z17);
    }

    @Override // rh3.o
    public void setPlaySpeedRatio(float f17) {
        this.f408027v.setPlaySpeedRatio(f17);
    }

    @Override // rh3.c, rh3.o
    public void setSurface(android.view.Surface surface) {
        super.setSurface(surface);
        this.f408027v.setSurface(surface);
    }

    @Override // rh3.c, rh3.o
    public void start() {
        super.start();
        this.f408027v.start();
    }

    @Override // rh3.c, rh3.o
    public void stop() {
        super.stop();
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer = this.f408027v;
        iTPPlayer.pauseDownload();
        zh3.a aVar = this.f408028w;
        if (aVar != null) {
            aVar.b();
        }
        iTPPlayer.stop();
        a(9, this + "#stop");
    }
}
