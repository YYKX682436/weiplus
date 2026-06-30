package com.tencent.thumbplayer.adapter.player.systemplayer;

/* loaded from: classes16.dex */
public class TPSystemClipPlayer implements com.tencent.thumbplayer.adapter.player.ITPPlayerBase {
    private static final java.lang.String TAG = "TPSystemClipPlayer";
    private boolean isPlayingClip;
    private boolean isSwitchingDef;
    private java.util.List<com.tencent.thumbplayer.api.composition.ITPMediaTrackClip> mClipList;
    private android.content.Context mContext;
    private int mCurrentClip = 0;
    private com.tencent.thumbplayer.log.TPBaseLogger mLogger;
    private com.tencent.thumbplayer.adapter.player.ITPPlayerBase mPlayerBase;
    private com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemClipPlayer.TPPlayerBaseCallback mPlayerCallback;
    private com.tencent.thumbplayer.adapter.TPPlaybackParams mPlayerInitParams;
    private com.tencent.thumbplayer.adapter.TPPlayerBaseListeners mPlayerListeners;
    private com.tencent.thumbplayer.api.TPPlayerState mPlayerState;
    private com.tencent.thumbplayer.adapter.TPPlayerStateStrategy mStateChecker;
    private java.util.LinkedList<java.lang.Long> mSwitchingDefTagQueue;
    private com.tencent.thumbplayer.log.TPLoggerContext mTPLoggerContext;
    private com.tencent.thumbplayer.adapter.TPPlaybackInfo mTPPlaybackInfo;

    /* loaded from: classes16.dex */
    public class TPPlayerBaseCallback implements com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnPreparedListener, com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnCompletionListener, com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnInfoListener, com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnErrorListener, com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnSeekCompleteListener, com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnVideoSizeChangedListener, com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnSubtitleDataListener, com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnVideoFrameOutListener, com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnAudioPcmOutListener, com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnVideoProcessOutListener, com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnAudioProcessOutListener {
        private TPPlayerBaseCallback() {
        }

        @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnAudioPcmOutListener
        public void onAudioPcmOut(com.tencent.thumbplayer.api.TPAudioFrameBuffer tPAudioFrameBuffer) {
            com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemClipPlayer.this.handleOnAudioFrameOut(tPAudioFrameBuffer);
        }

        @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnAudioProcessOutListener
        public com.tencent.thumbplayer.api.TPPostProcessFrameBuffer onAudioProcessFrameOut(com.tencent.thumbplayer.api.TPPostProcessFrameBuffer tPPostProcessFrameBuffer) {
            return com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemClipPlayer.this.handleOnAudioProcessFrameOut(tPPostProcessFrameBuffer);
        }

        @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnCompletionListener
        public void onCompletion() {
            com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemClipPlayer.this.handleOnComplete();
        }

        @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnErrorListener
        public void onError(int i17, int i18, long j17, long j18) {
            com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemClipPlayer.this.handleOnError(i17, i18, j17, j18);
        }

        @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnInfoListener
        public void onInfo(int i17, long j17, long j18, java.lang.Object obj) {
            com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemClipPlayer.this.handleOnInfo(i17, j17, j18, obj);
        }

        @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnPreparedListener
        public void onPrepared() {
            com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemClipPlayer.this.handleOnPrepared();
        }

        @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnSeekCompleteListener
        public void onSeekComplete() {
            com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemClipPlayer.this.handleOnSeekComplete();
        }

        @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnSubtitleDataListener
        public void onSubtitleData(com.tencent.thumbplayer.api.TPSubtitleData tPSubtitleData) {
            com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemClipPlayer.this.handleOnSubtitleData(tPSubtitleData);
        }

        @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnVideoFrameOutListener
        public void onVideoFrameOut(com.tencent.thumbplayer.api.TPVideoFrameBuffer tPVideoFrameBuffer) {
            com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemClipPlayer.this.handleOnVideoFrameOut(tPVideoFrameBuffer);
        }

        @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnVideoProcessOutListener
        public com.tencent.thumbplayer.api.TPPostProcessFrameBuffer onVideoProcessFrameOut(com.tencent.thumbplayer.api.TPPostProcessFrameBuffer tPPostProcessFrameBuffer) {
            return com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemClipPlayer.this.handleOnVideoProcessFrameOut(tPPostProcessFrameBuffer);
        }

        @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnVideoSizeChangedListener
        public void onVideoSizeChanged(long j17, long j18) {
            com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemClipPlayer.this.handleOnVideoSizeChange(j17, j18);
        }
    }

    public TPSystemClipPlayer(android.content.Context context, com.tencent.thumbplayer.log.TPLoggerContext tPLoggerContext) {
        com.tencent.thumbplayer.log.TPLoggerContext tPLoggerContext2 = new com.tencent.thumbplayer.log.TPLoggerContext(tPLoggerContext, TAG);
        this.mTPLoggerContext = tPLoggerContext2;
        this.mLogger = new com.tencent.thumbplayer.log.TPBaseLogger(tPLoggerContext2);
        this.mContext = context;
        this.mPlayerState = new com.tencent.thumbplayer.api.TPPlayerState();
        this.mPlayerInitParams = new com.tencent.thumbplayer.adapter.TPPlaybackParams();
        this.mPlayerCallback = new com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemClipPlayer.TPPlayerBaseCallback();
        this.mPlayerListeners = new com.tencent.thumbplayer.adapter.TPPlayerBaseListeners(this.mLogger.getTag());
        this.mStateChecker = new com.tencent.thumbplayer.adapter.TPPlayerStateStrategy(this.mPlayerState);
        this.mClipList = new java.util.ArrayList();
    }

    private com.tencent.thumbplayer.adapter.player.ITPPlayerBase createPlayerBase() {
        com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer tPSystemMediaPlayer = new com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer(this.mContext, this.mTPLoggerContext);
        if (this.mTPPlaybackInfo == null) {
            this.mTPPlaybackInfo = new com.tencent.thumbplayer.adapter.TPPlaybackInfo();
        }
        setPlayerParamBeforePrepare(tPSystemMediaPlayer);
        return tPSystemMediaPlayer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private java.util.List<com.tencent.thumbplayer.api.composition.ITPMediaTrackClip> getClipListWithAsset(com.tencent.thumbplayer.api.composition.ITPMediaAsset iTPMediaAsset) {
        java.util.List list;
        boolean z17 = iTPMediaAsset instanceof com.tencent.thumbplayer.composition.TPMediaComposition;
        if (!z17 && !(iTPMediaAsset instanceof com.tencent.thumbplayer.composition.TPMediaCompositionTrack) && !(iTPMediaAsset instanceof com.tencent.thumbplayer.composition.TPMediaCompositionTrackClip)) {
            throw new java.lang.IllegalStateException("system mediaPlayer : media asset is illegal source!");
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (z17) {
            java.util.List<com.tencent.thumbplayer.api.composition.ITPMediaTrack> allAVTracks = ((com.tencent.thumbplayer.composition.TPMediaComposition) iTPMediaAsset).getAllAVTracks();
            if (com.tencent.thumbplayer.utils.TPCommonUtils.isEmpty(allAVTracks) || allAVTracks.get(0) == null) {
                throw new java.lang.IllegalStateException("empty av tracks when set data source!");
            }
            list = allAVTracks.get(0).getAllTrackClips();
        } else if (iTPMediaAsset instanceof com.tencent.thumbplayer.composition.TPMediaCompositionTrack) {
            list = ((com.tencent.thumbplayer.composition.TPMediaCompositionTrack) iTPMediaAsset).getAllTrackClips();
        } else {
            arrayList.add((com.tencent.thumbplayer.api.composition.ITPMediaTrackClip) iTPMediaAsset);
            list = arrayList;
        }
        long j17 = 0;
        for (int i17 = 0; i17 < list.size(); i17++) {
            ((com.tencent.thumbplayer.api.composition.ITPMediaTrackClip) list.get(i17)).setStartPositionMs(j17);
            j17 += ((com.tencent.thumbplayer.api.composition.ITPMediaTrackClip) list.get(i17)).getOriginalDurationMs();
        }
        return list;
    }

    private com.tencent.thumbplayer.api.composition.ITPMediaTrackClip getCurrentClip() {
        return this.mClipList.get(this.mCurrentClip);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleOnAudioFrameOut(com.tencent.thumbplayer.api.TPAudioFrameBuffer tPAudioFrameBuffer) {
        if (this.mStateChecker.validStateCallback(7)) {
            this.mPlayerListeners.onAudioPcmOut(tPAudioFrameBuffer);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.tencent.thumbplayer.api.TPPostProcessFrameBuffer handleOnAudioProcessFrameOut(com.tencent.thumbplayer.api.TPPostProcessFrameBuffer tPPostProcessFrameBuffer) {
        if (this.mStateChecker.validStateCallback(7)) {
            return this.mPlayerListeners.onAudioProcessFrameOut(tPPostProcessFrameBuffer);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleOnComplete() {
        if (this.mStateChecker.validStateCallback(2)) {
            if (this.mCurrentClip >= this.mClipList.size() - 1) {
                this.mPlayerState.changeState(7);
                this.mPlayerListeners.onCompletion();
                return;
            }
            try {
                switchPlayer(this.mCurrentClip + 1, 0L);
            } catch (java.io.IOException e17) {
                this.mLogger.info("handleOnComplete:" + e17.toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleOnError(int i17, int i18, long j17, long j18) {
        if (this.mStateChecker.validStateCallback(4)) {
            this.mPlayerListeners.onError(i17, i18, j17, j18);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleOnInfo(int i17, long j17, long j18, java.lang.Object obj) {
        if (this.mStateChecker.validStateCallback(3)) {
            this.mPlayerListeners.onInfo(i17, j17, j18, obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleOnPrepared() {
        com.tencent.thumbplayer.adapter.TPPlayerBaseListeners tPPlayerBaseListeners = this.mPlayerListeners;
        if (tPPlayerBaseListeners != null) {
            tPPlayerBaseListeners.onInfo(152, this.mCurrentClip, 0L, null);
        }
        if (!this.isPlayingClip) {
            if (this.mStateChecker.validStateCallback(1)) {
                this.mPlayerState.changeState(4);
                com.tencent.thumbplayer.adapter.TPPlayerBaseListeners tPPlayerBaseListeners2 = this.mPlayerListeners;
                if (tPPlayerBaseListeners2 != null) {
                    tPPlayerBaseListeners2.onPrepared();
                }
                setPlayerParamAfterPrepared(this.mPlayerBase);
                return;
            }
            return;
        }
        start();
        if (!this.isSwitchingDef || this.mPlayerListeners == null || com.tencent.thumbplayer.utils.TPCommonUtils.isEmpty(this.mSwitchingDefTagQueue)) {
            return;
        }
        java.lang.Long poll = this.mSwitchingDefTagQueue.poll();
        if (poll != null) {
            this.mPlayerListeners.onInfo(3, poll.longValue(), 0L, null);
        }
        this.isSwitchingDef = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleOnSeekComplete() {
        if (this.mStateChecker.validStateCallback(5)) {
            if (this.mPlayerState.is(7)) {
                start();
            }
            this.mPlayerListeners.onSeekComplete();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleOnSubtitleData(com.tencent.thumbplayer.api.TPSubtitleData tPSubtitleData) {
        if (this.mStateChecker.validStateCallback(7)) {
            this.mPlayerListeners.onSubtitleData(tPSubtitleData);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleOnVideoFrameOut(com.tencent.thumbplayer.api.TPVideoFrameBuffer tPVideoFrameBuffer) {
        if (this.mStateChecker.validStateCallback(7)) {
            this.mPlayerListeners.onVideoFrameOut(tPVideoFrameBuffer);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.tencent.thumbplayer.api.TPPostProcessFrameBuffer handleOnVideoProcessFrameOut(com.tencent.thumbplayer.api.TPPostProcessFrameBuffer tPPostProcessFrameBuffer) {
        if (this.mStateChecker.validStateCallback(7)) {
            return this.mPlayerListeners.onVideoProcessFrameOut(tPPostProcessFrameBuffer);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleOnVideoSizeChange(long j17, long j18) {
        if (this.mStateChecker.validStateCallback(6)) {
            this.mTPPlaybackInfo.setHeight(j18);
            this.mTPPlaybackInfo.setWidth(j17);
            this.mPlayerListeners.onVideoSizeChanged(j17, j18);
        }
    }

    private void selectClipPlayer(int i17) {
        for (int i18 = 0; i18 < this.mClipList.size(); i18++) {
            long j17 = i17;
            if (this.mClipList.get(i18).getStartPositionMs() <= j17 && j17 <= this.mClipList.get(i18).getStartPositionMs() + this.mClipList.get(i18).getOriginalDurationMs()) {
                try {
                    switchPlayer(i18, j17 - this.mClipList.get(i18).getStartPositionMs());
                } catch (java.io.IOException e17) {
                    this.mLogger.info("selectClipPlayer:" + e17.toString());
                }
            }
        }
    }

    private void setPlayerParamAfterPrepared(com.tencent.thumbplayer.adapter.player.ITPPlayerBase iTPPlayerBase) {
        com.tencent.thumbplayer.api.TPTrackInfo[] trackInfo = getTrackInfo();
        if (trackInfo == null) {
            return;
        }
        for (int i17 = 0; i17 < trackInfo.length; i17++) {
            if (trackInfo[i17].equals(this.mPlayerInitParams.getTrackInfoByType(trackInfo[i17].getTrackType()))) {
                iTPPlayerBase.selectTrack(i17, -1L);
            }
        }
    }

    private void setPlayerParamBeforePrepare(com.tencent.thumbplayer.adapter.player.ITPPlayerBase iTPPlayerBase) {
        if (1 == this.mPlayerInitParams.dataSource().getType()) {
            iTPPlayerBase.setDataSource(this.mPlayerInitParams.dataSource().parcelFileDescriptor());
        } else if (4 == this.mPlayerInitParams.dataSource().getType()) {
            iTPPlayerBase.setDataSource(this.mPlayerInitParams.dataSource().assetFileDescriptor());
        }
        if (this.mPlayerInitParams.dataSource().getType() == 0) {
            iTPPlayerBase.setDataSource(this.mPlayerInitParams.dataSource().url(), this.mPlayerInitParams.dataSource().httpHeaders());
        }
        java.util.Iterator<com.tencent.thumbplayer.api.TPOptionalParam> it = this.mPlayerInitParams.optionalParams().iterator();
        while (it.hasNext()) {
            iTPPlayerBase.setPlayerOptionalParam(it.next());
        }
        for (com.tencent.thumbplayer.adapter.TPPlaybackParams.SubtitleAttribute subtitleAttribute : this.mPlayerInitParams.subtitleSources()) {
            iTPPlayerBase.addSubtitleSource(subtitleAttribute.url, subtitleAttribute.httpHeader, subtitleAttribute.mimeType, subtitleAttribute.name);
        }
        for (com.tencent.thumbplayer.adapter.TPPlaybackParams.AudioTrackAttribute audioTrackAttribute : this.mPlayerInitParams.audioTrackSources()) {
            iTPPlayerBase.addAudioTrackSource(audioTrackAttribute.url, audioTrackAttribute.httpHeader, audioTrackAttribute.name, audioTrackAttribute.audioTrackParams);
        }
        if (this.mPlayerInitParams.loopback() != null) {
            iTPPlayerBase.setLoopback(this.mPlayerInitParams.loopback().isLoopback, this.mPlayerInitParams.loopback().startPositionMs, this.mPlayerInitParams.loopback().endPositionMs);
        }
        iTPPlayerBase.setOutputMute(this.mPlayerInitParams.outputMute());
        if (this.mPlayerInitParams.audioGainRatio() != 0.0f) {
            iTPPlayerBase.setAudioGainRatio(this.mPlayerInitParams.audioGainRatio());
        }
        if (this.mPlayerInitParams.speedRatio() != 0.0f) {
            iTPPlayerBase.setPlaySpeedRatio(this.mPlayerInitParams.speedRatio());
        }
        if (this.mPlayerInitParams.surface() instanceof android.view.SurfaceHolder) {
            iTPPlayerBase.setSurfaceHolder((android.view.SurfaceHolder) this.mPlayerInitParams.surface());
        } else if (this.mPlayerInitParams.surface() instanceof android.view.Surface) {
            iTPPlayerBase.setSurface((android.view.Surface) this.mPlayerInitParams.surface(), this.mPlayerInitParams.surfaceType());
        }
        iTPPlayerBase.setOnInfoListener(this.mPlayerCallback);
        iTPPlayerBase.setOnPreparedListener(this.mPlayerCallback);
        iTPPlayerBase.setOnCompletionListener(this.mPlayerCallback);
        iTPPlayerBase.setOnErrorListener(this.mPlayerCallback);
        iTPPlayerBase.setOnSeekCompleteListener(this.mPlayerCallback);
        iTPPlayerBase.setOnVideoSizeChangedListener(this.mPlayerCallback);
        iTPPlayerBase.setOnSubtitleDataListener(this.mPlayerCallback);
    }

    private void switchPlayer(int i17, long j17) {
        this.mLogger.debug("switchPlayer: clipNo:" + i17 + "   startPostion:" + j17);
        com.tencent.thumbplayer.adapter.player.ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
        if (iTPPlayerBase != null) {
            iTPPlayerBase.release();
        }
        this.isPlayingClip = true;
        this.mCurrentClip = i17;
        this.mPlayerInitParams.setDataSource(this.mClipList.get(i17).getFilePath(), this.mClipList.get(this.mCurrentClip).getHttpHeader());
        com.tencent.thumbplayer.adapter.player.ITPPlayerBase createPlayerBase = createPlayerBase();
        this.mPlayerBase = createPlayerBase;
        if (createPlayerBase == null) {
            throw new java.lang.RuntimeException("error , create player failed");
        }
        this.mPlayerBase.setPlayerOptionalParam(new com.tencent.thumbplayer.api.TPOptionalParam().buildLong(100, j17));
        this.mPlayerBase.prepare();
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void addAudioTrackSource(java.lang.String str, java.lang.String str2, java.util.List<com.tencent.thumbplayer.api.TPOptionalParam> list) {
        this.mLogger.error("addAudioTrackSource not supported.");
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void addSubtitleSource(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.mLogger.error("addSubtitleSource not supported.");
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void captureVideo(com.tencent.thumbplayer.api.TPCaptureParams tPCaptureParams, com.tencent.thumbplayer.api.TPCaptureCallBack tPCaptureCallBack) {
        com.tencent.thumbplayer.adapter.player.ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
        if (iTPPlayerBase != null) {
            iTPPlayerBase.captureVideo(tPCaptureParams, tPCaptureCallBack);
        }
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public int configBufferDurationAsync(int i17, long j17, long j18, long j19) {
        return 0;
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void deselectTrack(int i17, long j17) {
        this.mLogger.error("deselectTrack not supported.");
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public int getAutoExpendBufferCount() {
        return 0;
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public long getBufferIOMaxReadDurationPosMs() {
        return 0L;
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public long getBufferIOMaxReadFileOffset() {
        return 0L;
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public long getBufferIOMaxWriteDurationPosMs() {
        return 0L;
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public long getBufferIOMaxWriteFileOffset() {
        return 0L;
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public long getBufferedDurationMs() {
        return 0L;
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public long getBufferedSize() {
        return 0L;
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public long getCurrentPositionMs() {
        long j17 = 0;
        for (int i17 = 0; i17 < this.mClipList.size() && i17 < this.mCurrentClip; i17++) {
            j17 += this.mClipList.get(i17).getOriginalDurationMs();
        }
        return !this.mStateChecker.validStateCall(12) ? j17 : j17 + this.mPlayerBase.getCurrentPositionMs();
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public long getDemuxerOffsetInFile() {
        return -1L;
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public long getDurationMs() {
        java.util.Iterator<com.tencent.thumbplayer.api.composition.ITPMediaTrackClip> it = this.mClipList.iterator();
        long j17 = 0;
        while (it.hasNext()) {
            j17 += it.next().getOriginalDurationMs();
        }
        return j17;
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public com.tencent.thumbplayer.core.player.TPDynamicStatisticParams getDynamicStatisticParams(boolean z17) {
        return null;
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public com.tencent.thumbplayer.core.player.TPGeneralPlayFlowParams getGeneralPlayFlowParams() {
        return null;
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public long getPlayableDurationMs() {
        if (this.mStateChecker.validStateCall(15)) {
            return this.mPlayerBase.getPlayableDurationMs();
        }
        com.tencent.thumbplayer.adapter.TPPlaybackInfo tPPlaybackInfo = this.mTPPlaybackInfo;
        if (tPPlaybackInfo != null) {
            return tPPlaybackInfo.getPlayableDurationMs();
        }
        return 0L;
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public com.tencent.thumbplayer.api.TPProgramInfo[] getProgramInfo() {
        this.mLogger.error("getProgramInfo not supported.");
        return new com.tencent.thumbplayer.api.TPProgramInfo[0];
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public long getPropertyLong(int i17) {
        com.tencent.thumbplayer.adapter.player.ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
        if (iTPPlayerBase != null) {
            return iTPPlayerBase.getPropertyLong(i17);
        }
        return -1L;
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public java.lang.String getPropertyString(int i17) {
        com.tencent.thumbplayer.adapter.player.ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
        return iTPPlayerBase != null ? iTPPlayerBase.getPropertyString(i17) : "";
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public com.tencent.thumbplayer.api.TPTrackInfo[] getTrackInfo() {
        this.mLogger.error("getTrackInfo not supported.");
        return new com.tencent.thumbplayer.api.TPTrackInfo[0];
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public int getVideoHeight() {
        long height;
        com.tencent.thumbplayer.adapter.TPPlaybackInfo tPPlaybackInfo = this.mTPPlaybackInfo;
        if (tPPlaybackInfo == null) {
            return 0;
        }
        if (tPPlaybackInfo.getHeight() > 0) {
            height = this.mTPPlaybackInfo.getHeight();
        } else {
            if (!this.mStateChecker.validStateCall(13)) {
                return 0;
            }
            this.mTPPlaybackInfo.setHeight(this.mPlayerBase.getVideoHeight());
            height = this.mTPPlaybackInfo.getHeight();
        }
        return (int) height;
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public int getVideoWidth() {
        long width;
        com.tencent.thumbplayer.adapter.TPPlaybackInfo tPPlaybackInfo = this.mTPPlaybackInfo;
        if (tPPlaybackInfo == null) {
            return 0;
        }
        if (tPPlaybackInfo.getWidth() > 0) {
            width = this.mTPPlaybackInfo.getWidth();
        } else {
            if (!this.mStateChecker.validStateCall(13)) {
                return 0;
            }
            this.mTPPlaybackInfo.setWidth(this.mPlayerBase.getVideoWidth());
            width = this.mTPPlaybackInfo.getWidth();
        }
        return (int) width;
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void pause() {
        if (this.mStateChecker.validStateCall(6)) {
            com.tencent.thumbplayer.adapter.player.ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
            if (iTPPlayerBase == null) {
                throw new java.lang.IllegalStateException("error , pause , player is null");
            }
            try {
                iTPPlayerBase.pause();
                this.mPlayerState.changeState(6);
            } catch (java.lang.IllegalStateException unused) {
                throw new java.lang.IllegalStateException("error , pause ,state invalid");
            }
        }
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void prepare() {
        if (this.mStateChecker.validStateCall(1)) {
            if (!this.mPlayerInitParams.validDataSource()) {
                throw new java.io.IOException("error , prepare , data source invalid");
            }
            com.tencent.thumbplayer.adapter.player.ITPPlayerBase createPlayerBase = createPlayerBase();
            this.mPlayerBase = createPlayerBase;
            if (createPlayerBase == null) {
                throw new java.lang.RuntimeException("error , create player failed");
            }
            this.mPlayerState.changeState(3);
            this.mPlayerBase.prepare();
        }
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void prepareAsync() {
        if (this.mStateChecker.validStateCall(1)) {
            if (!this.mPlayerInitParams.validDataSource()) {
                throw new java.lang.IllegalStateException("error , prepare , state invalid , data source invalid");
            }
            com.tencent.thumbplayer.adapter.player.ITPPlayerBase createPlayerBase = createPlayerBase();
            this.mPlayerBase = createPlayerBase;
            if (createPlayerBase == null) {
                throw new java.lang.RuntimeException("error , create player failed");
            }
            this.mPlayerState.changeState(3);
            this.mPlayerBase.prepareAsync();
        }
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void release() {
        this.mLogger.info("release, current state:" + this.mPlayerState);
        com.tencent.thumbplayer.adapter.player.ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
        if (iTPPlayerBase != null) {
            iTPPlayerBase.release();
            this.mPlayerBase = null;
        }
        this.mPlayerInitParams.reset();
        this.mPlayerListeners.clear();
        this.mPlayerState.changeState(11);
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void reset() {
        this.mLogger.info("reset, current state:" + this.mPlayerState);
        com.tencent.thumbplayer.adapter.player.ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
        if (iTPPlayerBase != null) {
            iTPPlayerBase.reset();
        }
        this.mPlayerInitParams.reset();
        this.mPlayerListeners.clear();
        this.mPlayerState.changeState(1);
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void seekTo(int i17) {
        if (this.mStateChecker.validStateCall(9)) {
            long j17 = i17;
            if (j17 >= getCurrentClip().getStartPositionMs() && j17 <= getCurrentClip().getStartPositionMs() + getCurrentClip().getOriginalDurationMs()) {
                if (this.mPlayerBase != null) {
                    this.mLogger.debug("seek to:" + i17);
                    this.mPlayerBase.seekTo((int) (j17 - getCurrentClip().getStartPositionMs()));
                    return;
                }
                return;
            }
            selectClipPlayer(i17);
        }
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void selectProgram(int i17, long j17) {
        this.mLogger.error("selectProgram not supported.");
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void selectTrack(int i17, long j17) {
        this.mLogger.error("selectTrack not supported.");
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setAudioGainRatio(float f17) {
        if (this.mStateChecker.validStateCall(3)) {
            com.tencent.thumbplayer.adapter.player.ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
            if (iTPPlayerBase != null) {
                iTPPlayerBase.setAudioGainRatio(f17);
            }
            this.mPlayerInitParams.setAudioGainRatio(f17);
        }
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setAudioNormalizeVolumeParams(java.lang.String str) {
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setDataSource(java.lang.String str) {
        setDataSource(str, null);
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setLoopback(boolean z17) {
        if (this.mStateChecker.validStateCall(3)) {
            com.tencent.thumbplayer.adapter.player.ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
            if (iTPPlayerBase != null) {
                iTPPlayerBase.setLoopback(z17);
            }
            this.mPlayerInitParams.setLoopback(z17);
        }
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setOnAudioPcmOutputListener(com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnAudioPcmOutListener iOnAudioPcmOutListener) {
        throw new java.lang.IllegalStateException("system Mediaplayer cannot support audio frame out");
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setOnAudioProcessOutputListener(com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnAudioProcessOutListener iOnAudioProcessOutListener) {
        throw new java.lang.IllegalStateException("system Mediaplayer cannot support audio postprocess frame out");
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setOnCompletionListener(com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnCompletionListener iOnCompletionListener) {
        this.mPlayerListeners.setOnCompletionListener(iOnCompletionListener);
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setOnDemuxerListener(com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnDemuxerListener iOnDemuxerListener) {
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setOnDetailInfoListener(com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnDetailInfoListener iOnDetailInfoListener) {
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setOnErrorListener(com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnErrorListener iOnErrorListener) {
        this.mPlayerListeners.setOnErrorListener(iOnErrorListener);
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setOnEventRecordListener(com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnEventRecordListener iOnEventRecordListener) {
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setOnInfoListener(com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnInfoListener iOnInfoListener) {
        this.mPlayerListeners.setOnInfoListener(iOnInfoListener);
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setOnPreparedListener(com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnPreparedListener iOnPreparedListener) {
        this.mPlayerListeners.setOnPreparedListener(iOnPreparedListener);
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setOnSeekCompleteListener(com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnSeekCompleteListener iOnSeekCompleteListener) {
        this.mPlayerListeners.setOnSeekCompleteListener(iOnSeekCompleteListener);
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setOnSubtitleDataListener(com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnSubtitleDataListener iOnSubtitleDataListener) {
        this.mPlayerListeners.setOnSubtitleDataListener(iOnSubtitleDataListener);
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setOnSubtitleFrameOutListener(com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnSubtitleFrameOutListener iOnSubtitleFrameOutListener) {
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setOnVideoFrameOutListener(com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnVideoFrameOutListener iOnVideoFrameOutListener) {
        throw new java.lang.IllegalStateException("system Mediaplayer cannot support video frame out");
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setOnVideoProcessOutputListener(com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnVideoProcessOutListener iOnVideoProcessOutListener) {
        throw new java.lang.IllegalStateException("system Mediaplayer cannot support video postprocess frame out");
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setOnVideoSizeChangedListener(com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnVideoSizeChangedListener iOnVideoSizeChangedListener) {
        this.mPlayerListeners.setOnVideoSizeChangedListener(iOnVideoSizeChangedListener);
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setOutputMute(boolean z17) {
        if (this.mStateChecker.validStateCall(3)) {
            com.tencent.thumbplayer.adapter.player.ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
            if (iTPPlayerBase != null) {
                iTPPlayerBase.setOutputMute(z17);
            }
            this.mPlayerInitParams.setOutputMute(z17);
        }
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setPlaySharpenSwitch() {
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setPlaySpeedRatio(float f17) {
        if (this.mStateChecker.validStateCall(3)) {
            com.tencent.thumbplayer.adapter.player.ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
            if (iTPPlayerBase != null) {
                iTPPlayerBase.setPlaySpeedRatio(f17);
            }
            this.mPlayerInitParams.setSpeedRatio(f17);
        }
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setPlayerOptionalParam(com.tencent.thumbplayer.api.TPOptionalParam tPOptionalParam) {
        if (tPOptionalParam.getKey() == 100) {
            int i17 = (int) tPOptionalParam.getParamLong().value;
            this.mLogger.debug("start position:" + i17);
            for (int i18 = 0; i18 < this.mClipList.size(); i18++) {
                long j17 = i17;
                if (this.mClipList.get(i18).getStartPositionMs() <= j17 && j17 <= this.mClipList.get(i18).getStartPositionMs() + this.mClipList.get(i18).getOriginalDurationMs()) {
                    this.mCurrentClip = i18;
                    this.mPlayerInitParams.setDataSource(this.mClipList.get(i18).getFilePath());
                    tPOptionalParam.getParamLong().value = j17 - this.mClipList.get(i18).getStartPositionMs();
                }
            }
        }
        com.tencent.thumbplayer.adapter.player.ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
        if (iTPPlayerBase != null) {
            iTPPlayerBase.setPlayerOptionalParam(tPOptionalParam);
        }
        this.mPlayerInitParams.addOptionalParams(tPOptionalParam);
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setSurface(android.view.Surface surface, @com.tencent.thumbplayer.api.TPCommonEnum.TPSurfaceType int i17) {
        if (!this.mStateChecker.validStateCall(4)) {
            throw new java.lang.IllegalStateException("setSurface , state invalid");
        }
        com.tencent.thumbplayer.adapter.player.ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
        if (iTPPlayerBase != null) {
            iTPPlayerBase.setSurface(surface, i17);
        }
        this.mPlayerInitParams.setSurface(surface, i17);
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setSurfaceHolder(android.view.SurfaceHolder surfaceHolder) {
        if (!this.mStateChecker.validStateCall(4)) {
            throw new java.lang.IllegalStateException("setSurfaceHolder , state invalid");
        }
        com.tencent.thumbplayer.adapter.player.ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
        if (iTPPlayerBase != null) {
            iTPPlayerBase.setSurfaceHolder(surfaceHolder);
        }
        this.mPlayerInitParams.setSurfaceHolder(surfaceHolder);
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void start() {
        if (this.mStateChecker.validStateCall(5)) {
            com.tencent.thumbplayer.adapter.player.ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
            if (iTPPlayerBase == null) {
                throw new java.lang.IllegalStateException("error , start , player is null");
            }
            try {
                iTPPlayerBase.start();
                this.mPlayerState.changeState(5);
            } catch (java.lang.IllegalStateException unused) {
                throw new java.lang.IllegalStateException("error , start ,state invalid");
            }
        }
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void stop() {
        if (this.mStateChecker.validStateCall(7)) {
            if (this.mPlayerBase == null) {
                throw new java.lang.IllegalStateException("error , stop , player is null");
            }
            try {
                try {
                    this.mPlayerState.changeState(8);
                    this.mPlayerBase.stop();
                } catch (java.lang.IllegalStateException unused) {
                    throw new java.lang.IllegalStateException("error , pause ,state invalid");
                }
            } finally {
                this.mPlayerState.changeState(9);
            }
        }
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void switchDefinition(java.lang.String str, @com.tencent.thumbplayer.api.TPCommonEnum.TPSwitchDefMode int i17, long j17) {
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void switchHdrModeWithSurface(android.view.Surface surface, int i17, int i18) {
        com.tencent.thumbplayer.adapter.player.ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
        if (iTPPlayerBase != null) {
            iTPPlayerBase.switchHdrModeWithSurface(surface, i17, i18);
        }
        this.mPlayerInitParams.setSurface(surface, i17);
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void updateLoggerContext(com.tencent.thumbplayer.log.TPLoggerContext tPLoggerContext) {
        this.mLogger.updateContext(new com.tencent.thumbplayer.log.TPLoggerContext(tPLoggerContext, TAG));
        com.tencent.thumbplayer.adapter.TPPlayerBaseListeners tPPlayerBaseListeners = this.mPlayerListeners;
        if (tPPlayerBaseListeners == null || tPLoggerContext == null) {
            return;
        }
        tPPlayerBaseListeners.updateTag(this.mLogger.getTPLoggerContext().getTag());
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void addAudioTrackSource(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str2, java.util.List<com.tencent.thumbplayer.api.TPOptionalParam> list) {
        this.mLogger.error("addAudioTrackSource not supported.");
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void addSubtitleSource(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str2, java.lang.String str3) {
        this.mLogger.error("addSubtitleSource not supported.");
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setDataSource(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        this.mPlayerInitParams.setDataSource(str, map);
        this.mPlayerState.changeState(2);
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void switchDefinition(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, @com.tencent.thumbplayer.api.TPCommonEnum.TPSwitchDefMode int i17, long j17) {
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void switchDefinition(com.tencent.thumbplayer.api.composition.ITPMediaAsset iTPMediaAsset, @com.tencent.thumbplayer.api.TPCommonEnum.TPSwitchDefMode int i17, long j17) {
        java.util.List<com.tencent.thumbplayer.api.composition.ITPMediaTrackClip> clipListWithAsset = getClipListWithAsset(iTPMediaAsset);
        if (!com.tencent.thumbplayer.utils.TPCommonUtils.isEmpty(clipListWithAsset)) {
            long currentPositionMs = getCurrentPositionMs();
            try {
                this.mClipList = clipListWithAsset;
                this.isSwitchingDef = true;
                if (com.tencent.thumbplayer.utils.TPCommonUtils.isEmpty(this.mSwitchingDefTagQueue)) {
                    this.mSwitchingDefTagQueue = new java.util.LinkedList<>();
                }
                this.mSwitchingDefTagQueue.offer(java.lang.Long.valueOf(j17));
                this.mLogger.info("try to switch definition with system clip player, current clipNo:" + this.mCurrentClip);
                selectClipPlayer((int) currentPositionMs);
                return;
            } catch (java.lang.Exception e17) {
                this.mLogger.printException(e17);
                throw new java.lang.IllegalStateException("exception when system clip player switch definition!");
            }
        }
        throw new java.lang.IllegalStateException("exception when switch Definition with clip mediaAsset empty source!");
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setDataSource(android.os.ParcelFileDescriptor parcelFileDescriptor) {
        this.mPlayerInitParams.setDataSource(parcelFileDescriptor);
        this.mPlayerState.changeState(2);
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setLoopback(boolean z17, long j17, long j18) {
        if (this.mStateChecker.validStateCall(3)) {
            com.tencent.thumbplayer.adapter.player.ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
            if (iTPPlayerBase != null) {
                iTPPlayerBase.setLoopback(z17, j17, j18);
            }
            this.mPlayerInitParams.setLoopback(z17, j17, j18);
        }
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setDataSource(android.content.res.AssetFileDescriptor assetFileDescriptor) {
        this.mPlayerInitParams.setDataSource(assetFileDescriptor);
        this.mPlayerState.changeState(2);
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void seekTo(int i17, @com.tencent.thumbplayer.api.TPCommonEnum.TPSeekMode int i18) {
        if (this.mStateChecker.validStateCall(9)) {
            long j17 = i17;
            if (j17 >= getCurrentClip().getStartPositionMs() && j17 <= getCurrentClip().getStartPositionMs() + getCurrentClip().getOriginalDurationMs()) {
                if (this.mPlayerBase != null) {
                    this.mLogger.debug("seek to:" + i17 + "/mode=" + i18);
                    this.mPlayerBase.seekTo((int) (j17 - getCurrentClip().getStartPositionMs()), i18);
                    return;
                }
                return;
            }
            selectClipPlayer(i17);
        }
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setDataSource(com.tencent.thumbplayer.api.composition.ITPMediaAsset iTPMediaAsset) {
        java.util.List<com.tencent.thumbplayer.api.composition.ITPMediaTrackClip> clipListWithAsset = getClipListWithAsset(iTPMediaAsset);
        try {
            this.mClipList = clipListWithAsset;
            this.mPlayerInitParams.setDataSource(clipListWithAsset.get(this.mCurrentClip).getFilePath(), this.mClipList.get(this.mCurrentClip).getHttpHeader());
            this.mPlayerState.changeState(2);
        } catch (java.lang.Exception e17) {
            this.mLogger.printException(e17);
            throw new java.lang.IllegalStateException("exception when system clip player set data source!");
        }
    }
}
