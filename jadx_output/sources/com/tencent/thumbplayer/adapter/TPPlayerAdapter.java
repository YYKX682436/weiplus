package com.tencent.thumbplayer.adapter;

/* loaded from: classes16.dex */
public class TPPlayerAdapter implements com.tencent.thumbplayer.adapter.ITPPlayerAdapter, com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnStateChangeListener {
    private static final int PLAYER_REOPEN_TYPE_ERROR_RETRY = 1;
    private static final int PLAYER_REOPEN_TYPE_UNKNOWN = 0;
    private static final int PLAYER_REOPEN_TYPE_USER_FORCE_REOPEN = 2;
    private static final java.lang.String TAG = "TPPlayerAdapter";
    private android.content.Context mContext;
    private boolean mIsReopening;
    private com.tencent.thumbplayer.log.TPBaseLogger mLogger;
    private com.tencent.thumbplayer.adapter.player.ITPPlayerBase mPlayerBase;
    private com.tencent.thumbplayer.adapter.TPPlayerAdapter.TPPlayerBaseCallback mPlayerCallback;
    private com.tencent.thumbplayer.adapter.TPPlaybackParams mPlayerInitParams;
    private com.tencent.thumbplayer.adapter.TPPlayerBaseListeners mPlayerListeners;
    private com.tencent.thumbplayer.api.TPPlayerState mPlayerState;
    private int mPlayerType;
    private com.tencent.thumbplayer.richmedia.ITPInnerRichMediaSynchronizer mRichMediaProcessor;
    private com.tencent.thumbplayer.adapter.TPPlayerStateStrategy mStateChecker;
    private com.tencent.thumbplayer.log.TPLoggerContext mTPLoggerContext;
    private com.tencent.thumbplayer.adapter.TPPlaybackInfo mTPPlaybackInfo;
    private com.tencent.thumbplayer.adapter.strategy.ITPStrategy mTpStrategy;
    private int mReopenType = 0;
    private int apiCallGetCurrentPositionMs = 0;

    /* loaded from: classes16.dex */
    public class TPPlayerBaseCallback implements com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnPreparedListener, com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnCompletionListener, com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnInfoListener, com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnErrorListener, com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnSeekCompleteListener, com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnVideoSizeChangedListener, com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnSubtitleDataListener, com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnSubtitleFrameOutListener, com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnVideoFrameOutListener, com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnAudioPcmOutListener, com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnVideoProcessOutListener, com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnAudioProcessOutListener, com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnDetailInfoListener, com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnEventRecordListener, com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnDemuxerListener {
        private TPPlayerBaseCallback() {
        }

        @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnAudioPcmOutListener
        public void onAudioPcmOut(com.tencent.thumbplayer.api.TPAudioFrameBuffer tPAudioFrameBuffer) {
            com.tencent.thumbplayer.adapter.TPPlayerAdapter.this.handleOnAudioFrameOut(tPAudioFrameBuffer);
        }

        @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnAudioProcessOutListener
        public com.tencent.thumbplayer.api.TPPostProcessFrameBuffer onAudioProcessFrameOut(com.tencent.thumbplayer.api.TPPostProcessFrameBuffer tPPostProcessFrameBuffer) {
            return com.tencent.thumbplayer.adapter.TPPlayerAdapter.this.handleOnAudioProcessFrameOut(tPPostProcessFrameBuffer);
        }

        @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnCompletionListener
        public void onCompletion() {
            com.tencent.thumbplayer.adapter.TPPlayerAdapter.this.handleOnComplete();
        }

        @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnDetailInfoListener
        public void onDetailInfo(com.tencent.thumbplayer.api.TPPlayerDetailInfo tPPlayerDetailInfo) {
            com.tencent.thumbplayer.adapter.TPPlayerAdapter.this.handleOnDetailInfo(tPPlayerDetailInfo);
        }

        @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnEventRecordListener
        public void onDrmInfo(com.tencent.thumbplayer.api.TPDrmInfo tPDrmInfo) {
            com.tencent.thumbplayer.adapter.TPPlayerAdapter.this.handleOnDrmInfo(tPDrmInfo);
        }

        @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnErrorListener
        public void onError(int i17, int i18, long j17, long j18) {
            com.tencent.thumbplayer.adapter.TPPlayerAdapter.this.handleOnError(i17, i18, j17, j18);
        }

        @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnInfoListener
        public void onInfo(int i17, long j17, long j18, java.lang.Object obj) {
            com.tencent.thumbplayer.adapter.TPPlayerAdapter.this.handleOnInfo(i17, j17, j18, obj);
        }

        @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnPreparedListener
        public void onPrepared() {
            com.tencent.thumbplayer.adapter.TPPlayerAdapter.this.handleOnPrepared();
        }

        @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnDemuxerListener
        public com.tencent.thumbplayer.api.TPRemoteSdpInfo onSdpExchange(java.lang.String str, int i17) {
            return com.tencent.thumbplayer.adapter.TPPlayerAdapter.this.handleOnSdpExchange(str, i17);
        }

        @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnSeekCompleteListener
        public void onSeekComplete() {
            com.tencent.thumbplayer.adapter.TPPlayerAdapter.this.handleOnSeekComplete();
        }

        @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnSubtitleDataListener
        public void onSubtitleData(com.tencent.thumbplayer.api.TPSubtitleData tPSubtitleData) {
            com.tencent.thumbplayer.adapter.TPPlayerAdapter.this.handleOnSubtitleData(tPSubtitleData);
        }

        @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnSubtitleFrameOutListener
        public void onSubtitleFrameOut(com.tencent.thumbplayer.api.TPSubtitleFrameBuffer tPSubtitleFrameBuffer) {
            com.tencent.thumbplayer.adapter.TPPlayerAdapter.this.handleOnSubtitleFrameOut(tPSubtitleFrameBuffer);
        }

        @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnVideoFrameOutListener
        public void onVideoFrameOut(com.tencent.thumbplayer.api.TPVideoFrameBuffer tPVideoFrameBuffer) {
            com.tencent.thumbplayer.adapter.TPPlayerAdapter.this.handleOnVideoFrameOut(tPVideoFrameBuffer);
        }

        @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnVideoProcessOutListener
        public com.tencent.thumbplayer.api.TPPostProcessFrameBuffer onVideoProcessFrameOut(com.tencent.thumbplayer.api.TPPostProcessFrameBuffer tPPostProcessFrameBuffer) {
            return com.tencent.thumbplayer.adapter.TPPlayerAdapter.this.handleOnVideoProcessFrameOut(tPPostProcessFrameBuffer);
        }

        @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnVideoSizeChangedListener
        public void onVideoSizeChanged(long j17, long j18) {
            com.tencent.thumbplayer.adapter.TPPlayerAdapter.this.handleOnVideoSizeChange(j17, j18);
        }
    }

    public TPPlayerAdapter(android.content.Context context, com.tencent.thumbplayer.log.TPLoggerContext tPLoggerContext) {
        com.tencent.thumbplayer.log.TPLoggerContext tPLoggerContext2 = new com.tencent.thumbplayer.log.TPLoggerContext(tPLoggerContext, TAG);
        this.mTPLoggerContext = tPLoggerContext2;
        this.mLogger = new com.tencent.thumbplayer.log.TPBaseLogger(tPLoggerContext2);
        this.mContext = context;
        com.tencent.thumbplayer.api.TPPlayerState tPPlayerState = new com.tencent.thumbplayer.api.TPPlayerState();
        this.mPlayerState = tPPlayerState;
        tPPlayerState.setOnPlayerStateChangeListener(this);
        this.mPlayerInitParams = new com.tencent.thumbplayer.adapter.TPPlaybackParams();
        this.mPlayerCallback = new com.tencent.thumbplayer.adapter.TPPlayerAdapter.TPPlayerBaseCallback();
        this.mPlayerListeners = new com.tencent.thumbplayer.adapter.TPPlayerBaseListeners(this.mTPLoggerContext.getTag());
        this.mStateChecker = new com.tencent.thumbplayer.adapter.TPPlayerStateStrategy(this.mPlayerState);
        this.mTPPlaybackInfo = new com.tencent.thumbplayer.adapter.TPPlaybackInfo();
    }

    private void backupVideoInfo() {
        if (isThumbPlayer()) {
            com.tencent.thumbplayer.adapter.TPPlaybackInfo parseInfo = com.tencent.thumbplayer.adapter.TPPlaybackInfo.parseInfo(getPropertyString(0));
            this.mTPPlaybackInfo = parseInfo;
            parseInfo.setVideoLevel((int) this.mPlayerBase.getPropertyLong(204));
            this.mTPPlaybackInfo.setVideoProfile((int) this.mPlayerBase.getPropertyLong(203));
            this.mTPPlaybackInfo.setAudioProfile((int) this.mPlayerBase.getPropertyLong(102));
            this.mTPPlaybackInfo.setVideoCodedId((int) this.mPlayerBase.getPropertyLong(201));
            this.mTPPlaybackInfo.setVideoColorSpace((int) this.mPlayerBase.getPropertyLong(210));
        }
        if (this.mTPPlaybackInfo == null) {
            this.mTPPlaybackInfo = new com.tencent.thumbplayer.adapter.TPPlaybackInfo();
        }
        this.mTPPlaybackInfo.setDurationMs(this.mPlayerBase.getDurationMs());
        com.tencent.thumbplayer.api.TPOptionalParam optionalParam = this.mPlayerInitParams.getOptionalParam(100);
        if (optionalParam != null) {
            this.mTPPlaybackInfo.setCurrentPositionMs(optionalParam.getParamLong().value);
        }
    }

    private com.tencent.thumbplayer.adapter.player.ITPPlayerBase createPlayerBase(int i17, com.tencent.thumbplayer.log.TPLoggerContext tPLoggerContext) {
        com.tencent.thumbplayer.adapter.player.ITPPlayerBase iTPPlayerBase;
        try {
        } catch (java.lang.Exception e17) {
            this.mLogger.info("to create Player," + e17.toString());
        }
        if (i17 == 1) {
            this.mLogger.info("to create androidPlayer");
            iTPPlayerBase = com.tencent.thumbplayer.adapter.player.TPPlayerBaseFactory.createSystemMediaPlayer(this.mContext, this.mPlayerInitParams.supportClip(), tPLoggerContext);
        } else if (i17 == 2) {
            this.mLogger.info("to create thumbPlayer");
            iTPPlayerBase = com.tencent.thumbplayer.adapter.player.TPPlayerBaseFactory.createThumbPlayer(this.mContext, tPLoggerContext);
        } else if (i17 == 3) {
            this.mLogger.info("to create thumbPlayer software dec");
            iTPPlayerBase = com.tencent.thumbplayer.adapter.player.TPPlayerBaseFactory.createThumbPlayer(this.mContext, tPLoggerContext);
        } else {
            this.mLogger.info("to create no Player");
            iTPPlayerBase = null;
        }
        if (iTPPlayerBase == null) {
            this.mLogger.info("play is null!");
            return null;
        }
        this.mPlayerType = i17;
        setPlayerParamBeforePrepare(iTPPlayerBase);
        return iTPPlayerBase;
    }

    private com.tencent.thumbplayer.adapter.strategy.ITPStrategy createPlayerStrategy(com.tencent.thumbplayer.adapter.TPPlaybackParams tPPlaybackParams) {
        com.tencent.thumbplayer.adapter.strategy.model.TPStrategyConfig tPStrategyConfig;
        try {
            tPStrategyConfig = new com.tencent.thumbplayer.adapter.strategy.model.TPStrategyConfig(tPPlaybackParams);
        } catch (java.lang.IllegalArgumentException unused) {
            tPStrategyConfig = new com.tencent.thumbplayer.adapter.strategy.model.TPStrategyConfig(null);
        }
        return com.tencent.thumbplayer.adapter.strategy.TPStrategyFactory.createStrategy(tPStrategyConfig);
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
        if (!this.mStateChecker.validStateCallback(2)) {
            this.mLogger.info("handleOnComplete, invalid state");
        } else {
            this.mPlayerState.changeState(7);
            this.mPlayerListeners.onCompletion();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleOnDetailInfo(com.tencent.thumbplayer.api.TPPlayerDetailInfo tPPlayerDetailInfo) {
        this.mPlayerListeners.onDetailInfo(tPPlayerDetailInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleOnDrmInfo(com.tencent.thumbplayer.api.TPDrmInfo tPDrmInfo) {
        this.mPlayerListeners.onDrmInfo(tPDrmInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleOnError(int i17, int i18, long j17, long j18) {
        if (this.mStateChecker.validStateCallback(4)) {
            com.tencent.thumbplayer.adapter.strategy.ITPStrategy iTPStrategy = this.mTpStrategy;
            com.tencent.thumbplayer.adapter.TPPlaybackInfo tPPlaybackInfo = this.mTPPlaybackInfo;
            int strategyForRetry = iTPStrategy.strategyForRetry(tPPlaybackInfo, new com.tencent.thumbplayer.adapter.strategy.model.TPStrategyContext(this.mPlayerType, i17, i18, tPPlaybackInfo.getDefinition()));
            if (strategyForRetry == 0) {
                this.mPlayerState.changeState(10);
                this.mPlayerListeners.onError(i17, i18, j17, j18);
                return;
            }
            try {
                reopenPlayer(strategyForRetry, 1);
            } catch (java.io.IOException e17) {
                this.mLogger.printException(e17);
                this.mPlayerState.changeState(10);
                this.mPlayerListeners.onError(i17, i18, j17, j18);
            } catch (java.lang.IllegalStateException e18) {
                this.mLogger.printException(e18);
                this.mPlayerState.changeState(10);
                this.mPlayerListeners.onError(i17, i18, j17, j18);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleOnInfo(int i17, long j17, long j18, java.lang.Object obj) {
        com.tencent.thumbplayer.adapter.TPPlaybackInfo tPPlaybackInfo;
        if (this.mIsReopening) {
            this.mLogger.info("handleOnInfo, mIsReopening");
            return;
        }
        if (i17 == 152 && (tPPlaybackInfo = this.mTPPlaybackInfo) != null) {
            tPPlaybackInfo.setCurrentPlayClipNo(((int) j17) + 1);
        }
        this.mPlayerListeners.onInfo(i17, j17, j18, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleOnPrepared() {
        this.mPlayerListeners.onInfo(1000, this.mPlayerType, 0L, null);
        if (this.mIsReopening) {
            if (this.mPlayerState.innerPlayState() != 3) {
                this.mLogger.warn("handleOnPrepared, invalid state, mIsRetrying.");
                return;
            }
        } else if (!this.mStateChecker.validStateCallback(1)) {
            this.mLogger.info("handleOnPrepared, invalid state");
            return;
        }
        backupVideoInfo();
        setPlayerParamAfterPrepared(this.mPlayerBase);
        if (!this.mIsReopening) {
            this.mPlayerState.setInnerPlayStateState(4);
            this.mPlayerState.changeState(4);
            this.mPlayerListeners.onPrepared();
            return;
        }
        this.mIsReopening = false;
        this.mLogger.info("handleOnPrepared, mIsRetrying, recoverState, state:" + this.mPlayerState.state());
        int state = this.mPlayerState.state();
        this.mPlayerState.changeState(4);
        if (this.mPlayerState.lastState() == 3) {
            this.mPlayerListeners.onPrepared();
        }
        if (this.mReopenType == 1) {
            this.mPlayerListeners.onInfo(1014, 0L, 0L, null);
        } else {
            this.mPlayerListeners.onInfo(201, 0L, 0L, null);
        }
        this.mReopenType = 0;
        recoverPlayer(state);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.tencent.thumbplayer.api.TPRemoteSdpInfo handleOnSdpExchange(java.lang.String str, int i17) {
        return this.mPlayerListeners.onSdpExchange(str, i17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleOnSeekComplete() {
        if (this.mStateChecker.validStateCallback(5)) {
            this.mPlayerListeners.onSeekComplete();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleOnSubtitleData(com.tencent.thumbplayer.api.TPSubtitleData tPSubtitleData) {
        if (this.mStateChecker.validStateCallback(7)) {
            this.mPlayerListeners.onSubtitleData(tPSubtitleData);
        } else {
            this.mLogger.info("handleOnSubtitleData, invalid state");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleOnSubtitleFrameOut(com.tencent.thumbplayer.api.TPSubtitleFrameBuffer tPSubtitleFrameBuffer) {
        if (this.mStateChecker.validStateCallback(7)) {
            this.mPlayerListeners.onSubtitleFrameOut(tPSubtitleFrameBuffer);
        } else {
            this.mLogger.info("handleOnSubtitleFrameOut, invalid state");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleOnVideoFrameOut(com.tencent.thumbplayer.api.TPVideoFrameBuffer tPVideoFrameBuffer) {
        if (this.mStateChecker.validStateCallback(7)) {
            this.mPlayerListeners.onVideoFrameOut(tPVideoFrameBuffer);
        } else {
            this.mLogger.info("handleOnVideoFrameOut, invalid state");
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
        if (!this.mStateChecker.validStateCallback(6)) {
            this.mLogger.info("handleOnVideoSizeChange, invalid state");
            return;
        }
        this.mTPPlaybackInfo.setHeight(j18);
        this.mTPPlaybackInfo.setWidth(j17);
        this.mPlayerListeners.onVideoSizeChanged(j17, j18);
    }

    private boolean isThumbPlayer() {
        int i17 = this.mPlayerType;
        return i17 == 2 || i17 == 3;
    }

    private void recoverPlayer(int i17) {
        if (i17 != 5) {
            return;
        }
        try {
            this.mPlayerBase.start();
            this.mPlayerState.changeState(5);
        } catch (java.lang.IllegalStateException e17) {
            this.mLogger.printException(e17);
        }
    }

    private int selectPlayer() {
        if (this.mTpStrategy == null) {
            this.mTpStrategy = createPlayerStrategy(this.mPlayerInitParams);
        }
        return this.mTpStrategy.strategyForOpen(this.mTPPlaybackInfo);
    }

    private void setPlayerParamAfterPrepared(com.tencent.thumbplayer.adapter.player.ITPPlayerBase iTPPlayerBase) {
        com.tencent.thumbplayer.api.TPProgramInfo selectProgramInfo;
        com.tencent.thumbplayer.api.TPProgramInfo tPProgramInfo;
        com.tencent.thumbplayer.api.TPProgramInfo[] programInfo = getProgramInfo();
        if (programInfo == null || (selectProgramInfo = this.mPlayerInitParams.getSelectProgramInfo()) == null) {
            return;
        }
        for (int i17 = 0; i17 < programInfo.length; i17++) {
            if (!android.text.TextUtils.isEmpty(selectProgramInfo.url) && (tPProgramInfo = programInfo[i17]) != null && selectProgramInfo.url.equals(tPProgramInfo.url)) {
                iTPPlayerBase.selectProgram(i17, -1L);
                return;
            }
        }
    }

    private void setPlayerParamBeforePrepare(com.tencent.thumbplayer.adapter.player.ITPPlayerBase iTPPlayerBase) {
        iTPPlayerBase.setOnInfoListener(this.mPlayerCallback);
        iTPPlayerBase.setOnPreparedListener(this.mPlayerCallback);
        iTPPlayerBase.setOnCompletionListener(this.mPlayerCallback);
        iTPPlayerBase.setOnErrorListener(this.mPlayerCallback);
        iTPPlayerBase.setOnSeekCompleteListener(this.mPlayerCallback);
        iTPPlayerBase.setOnVideoSizeChangedListener(this.mPlayerCallback);
        iTPPlayerBase.setOnSubtitleDataListener(this.mPlayerCallback);
        iTPPlayerBase.setOnSubtitleFrameOutListener(this.mPlayerCallback);
        iTPPlayerBase.setOnDetailInfoListener(this.mPlayerCallback);
        iTPPlayerBase.setOnEventRecordListener(this.mPlayerCallback);
        iTPPlayerBase.setOnDemuxerListener(this.mPlayerCallback);
        if (isThumbPlayer()) {
            iTPPlayerBase.setOnVideoFrameOutListener(this.mPlayerCallback);
            iTPPlayerBase.setOnAudioPcmOutputListener(this.mPlayerCallback);
            iTPPlayerBase.setOnVideoProcessOutputListener(this.mPlayerCallback);
            iTPPlayerBase.setOnAudioProcessOutputListener(this.mPlayerCallback);
        }
        if (1 == this.mPlayerInitParams.dataSource().getType()) {
            iTPPlayerBase.setDataSource(this.mPlayerInitParams.dataSource().parcelFileDescriptor());
        } else if (4 == this.mPlayerInitParams.dataSource().getType()) {
            iTPPlayerBase.setDataSource(this.mPlayerInitParams.dataSource().assetFileDescriptor());
        } else if (3 == this.mPlayerInitParams.dataSource().getType()) {
            int i17 = this.mPlayerType;
            if (i17 == 2) {
                iTPPlayerBase.setDataSource(this.mPlayerInitParams.dataSource().getTpUrlDataSource().getSelfPlayerUrl(), this.mPlayerInitParams.dataSource().httpHeaders());
            } else if (i17 == 1) {
                iTPPlayerBase.setDataSource(this.mPlayerInitParams.dataSource().getTpUrlDataSource().getSystemPlayerUrl(), this.mPlayerInitParams.dataSource().httpHeaders());
            }
        } else if (2 == this.mPlayerInitParams.dataSource().getType()) {
            iTPPlayerBase.setDataSource(this.mPlayerInitParams.dataSource().mediaAsset());
        }
        java.util.Iterator<com.tencent.thumbplayer.api.TPOptionalParam> it = this.mPlayerInitParams.optionalParams().iterator();
        while (it.hasNext()) {
            iTPPlayerBase.setPlayerOptionalParam(it.next());
        }
        for (int i18 = 0; i18 < this.mPlayerInitParams.getTrackInfos().size(); i18++) {
            com.tencent.thumbplayer.api.TPTrackInfo tPTrackInfo = this.mPlayerInitParams.getTrackInfos().get(i18);
            int i19 = tPTrackInfo.trackType;
            if (i19 == 3) {
                java.util.Iterator<com.tencent.thumbplayer.adapter.TPPlaybackParams.SubtitleAttribute> it6 = this.mPlayerInitParams.subtitleSources().iterator();
                while (true) {
                    if (it6.hasNext()) {
                        com.tencent.thumbplayer.adapter.TPPlaybackParams.SubtitleAttribute next = it6.next();
                        if (!android.text.TextUtils.isEmpty(next.name) && next.name.equals(tPTrackInfo.name)) {
                            iTPPlayerBase.addSubtitleSource(next.url, next.httpHeader, next.mimeType, next.name);
                            break;
                        }
                    }
                }
            } else if (i19 == 2) {
                java.util.Iterator<com.tencent.thumbplayer.adapter.TPPlaybackParams.AudioTrackAttribute> it7 = this.mPlayerInitParams.audioTrackSources().iterator();
                while (true) {
                    if (it7.hasNext()) {
                        com.tencent.thumbplayer.adapter.TPPlaybackParams.AudioTrackAttribute next2 = it7.next();
                        if (!android.text.TextUtils.isEmpty(next2.name) && next2.name.equals(tPTrackInfo.name)) {
                            iTPPlayerBase.addAudioTrackSource(next2.url, next2.httpHeader, next2.name, next2.audioTrackParams);
                            break;
                        }
                    }
                }
            }
        }
        java.util.Iterator<com.tencent.thumbplayer.adapter.TPPlaybackParams.SelectTrackAttribute> it8 = this.mPlayerInitParams.getSelectTrackAttributes().iterator();
        while (it8.hasNext()) {
            com.tencent.thumbplayer.adapter.TPPlaybackParams.SelectTrackAttribute next3 = it8.next();
            if (next3.trackInfo.isSelected) {
                com.tencent.thumbplayer.api.TPTrackInfo[] trackInfo = iTPPlayerBase.getTrackInfo();
                if (trackInfo == null) {
                    this.mLogger.error("playerTrackInfoList is null.");
                } else {
                    for (int i27 = 0; i27 < trackInfo.length; i27++) {
                        if (next3.trackInfo.name.equals(trackInfo[i27].name)) {
                            iTPPlayerBase.selectTrack(i27, next3.opaque);
                        }
                    }
                }
            }
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
        if (!"".equals(this.mPlayerInitParams.audioNormalizeVolumeParams())) {
            iTPPlayerBase.setAudioNormalizeVolumeParams(this.mPlayerInitParams.audioNormalizeVolumeParams());
        }
        if (this.mPlayerInitParams.surface() instanceof android.view.SurfaceHolder) {
            iTPPlayerBase.setSurfaceHolder((android.view.SurfaceHolder) this.mPlayerInitParams.surface());
        } else if (this.mPlayerInitParams.surface() instanceof android.view.Surface) {
            iTPPlayerBase.setSurface((android.view.Surface) this.mPlayerInitParams.surface(), this.mPlayerInitParams.surfaceType());
        }
        iTPPlayerBase.setPlayerOptionalParam(new com.tencent.thumbplayer.api.TPOptionalParam().buildQueueInt(204, this.mTpStrategy.strategyForDec()));
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void addAudioTrackSource(java.lang.String str, java.lang.String str2, java.util.List<com.tencent.thumbplayer.api.TPOptionalParam> list) {
        addAudioTrackSource(str, null, str2, list);
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void addSubtitleSource(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        addSubtitleSource(str, null, str2, str3);
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void captureVideo(com.tencent.thumbplayer.api.TPCaptureParams tPCaptureParams, com.tencent.thumbplayer.api.TPCaptureCallBack tPCaptureCallBack) {
        com.tencent.thumbplayer.adapter.player.ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
        if (iTPPlayerBase != null) {
            iTPPlayerBase.captureVideo(tPCaptureParams, tPCaptureCallBack);
        } else {
            throw new java.lang.IllegalStateException("error , no player for capture :" + this.mPlayerState);
        }
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public int configBufferDurationAsync(int i17, long j17, long j18, long j19) {
        com.tencent.thumbplayer.adapter.player.ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
        if (iTPPlayerBase != null) {
            return iTPPlayerBase.configBufferDurationAsync(i17, j17, j18, j19);
        }
        this.mLogger.warn("configBufferDurationAsync, mPlayerBase = null, return !");
        return -1;
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void deselectTrack(int i17, long j17) {
        if (!this.mStateChecker.validStateCall(3)) {
            throw new java.lang.IllegalStateException("error : deselectTrack , state invalid");
        }
        com.tencent.thumbplayer.api.TPTrackInfo[] trackInfo = getTrackInfo();
        if (trackInfo == null) {
            this.mLogger.error("fatal err, tpTrackInfos is null");
            return;
        }
        if (i17 < 0 || i17 > trackInfo.length - 1) {
            throw new java.lang.IllegalArgumentException("error : track not found");
        }
        com.tencent.thumbplayer.adapter.player.ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
        if (iTPPlayerBase != null) {
            iTPPlayerBase.deselectTrack(i17, j17);
        }
        this.mPlayerInitParams.setDeselectTrackInfo(i17, j17, trackInfo[i17]);
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public int getAutoExpendBufferCount() {
        com.tencent.thumbplayer.adapter.player.ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
        if (iTPPlayerBase != null) {
            return iTPPlayerBase.getAutoExpendBufferCount();
        }
        this.mLogger.warn("getAutoExpendBufferCount, mPlayerBase = null, return !");
        return -1;
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public long getBufferIOMaxReadDurationPosMs() {
        com.tencent.thumbplayer.adapter.player.ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
        if (iTPPlayerBase != null) {
            return iTPPlayerBase.getBufferIOMaxReadDurationPosMs();
        }
        this.mLogger.warn("getBufferIOMaxReadDurationPosMs, mPlayerBase = null, return !");
        return -1L;
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public long getBufferIOMaxReadFileOffset() {
        com.tencent.thumbplayer.adapter.player.ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
        if (iTPPlayerBase != null) {
            return iTPPlayerBase.getBufferIOMaxReadFileOffset();
        }
        this.mLogger.warn("getBufferIOMaxReadFileOffset, mPlayerBase = null, return !");
        return -1L;
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public long getBufferIOMaxWriteDurationPosMs() {
        com.tencent.thumbplayer.adapter.player.ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
        if (iTPPlayerBase != null) {
            return iTPPlayerBase.getBufferIOMaxWriteDurationPosMs();
        }
        this.mLogger.warn("getBufferIOMaxWriteDurationPosMs, mPlayerBase = null, return !");
        return -1L;
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public long getBufferIOMaxWriteFileOffset() {
        com.tencent.thumbplayer.adapter.player.ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
        if (iTPPlayerBase != null) {
            return iTPPlayerBase.getBufferIOMaxWriteFileOffset();
        }
        this.mLogger.warn("getBufferIOMaxWriteFileOffset, mPlayerBase = null, return !");
        return -1L;
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public long getBufferedDurationMs() {
        com.tencent.thumbplayer.adapter.player.ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
        if (iTPPlayerBase != null) {
            return iTPPlayerBase.getBufferedDurationMs();
        }
        this.mLogger.warn("getBufferedDuration, mPlayerBase = null, return !");
        return -1L;
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public long getBufferedSize() {
        com.tencent.thumbplayer.adapter.player.ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
        if (iTPPlayerBase != null) {
            return iTPPlayerBase.getBufferedSize();
        }
        this.mLogger.warn("getBufferedSize, mPlayerBase = null, return !");
        return -1L;
    }

    @Override // com.tencent.thumbplayer.adapter.ITPPlayerAdapter
    public int getCurrentPlayClipNo() {
        com.tencent.thumbplayer.adapter.TPPlaybackInfo tPPlaybackInfo = this.mTPPlaybackInfo;
        if (tPPlaybackInfo != null) {
            return tPPlaybackInfo.getCurrentPlayClipNo();
        }
        return 0;
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public long getCurrentPositionMs() {
        if (!this.mStateChecker.validStateCall(12)) {
            com.tencent.thumbplayer.adapter.TPPlaybackInfo tPPlaybackInfo = this.mTPPlaybackInfo;
            if (tPPlaybackInfo != null) {
                return tPPlaybackInfo.getCurrentPositionMs();
            }
            return 0L;
        }
        com.tencent.thumbplayer.adapter.player.ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
        if (iTPPlayerBase == null && this.apiCallGetCurrentPositionMs % 10 == 0) {
            this.mLogger.warn("getCurrentPositionMs, mPlayerBase = null, return 0! apiCallGetCurrentPositionMs:" + this.apiCallGetCurrentPositionMs);
            return 0L;
        }
        long currentPositionMs = iTPPlayerBase.getCurrentPositionMs();
        com.tencent.thumbplayer.adapter.TPPlaybackInfo tPPlaybackInfo2 = this.mTPPlaybackInfo;
        if (tPPlaybackInfo2 != null) {
            tPPlaybackInfo2.setCurrentPositionMs(currentPositionMs);
        }
        return currentPositionMs;
    }

    @Override // com.tencent.thumbplayer.adapter.ITPPlayerAdapter
    public int getCurrentState() {
        return this.mPlayerState.state();
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public long getDemuxerOffsetInFile() {
        if (!this.mStateChecker.validStateCall(19)) {
            com.tencent.thumbplayer.adapter.TPPlaybackInfo tPPlaybackInfo = this.mTPPlaybackInfo;
            if (tPPlaybackInfo != null) {
                return tPPlaybackInfo.getDemuxerOffset();
            }
            return -1L;
        }
        com.tencent.thumbplayer.adapter.player.ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
        if (iTPPlayerBase == null) {
            this.mLogger.warn("getDemuxerOffsetInFile, mPlayerBase = null, return 0!");
            return -1L;
        }
        long demuxerOffsetInFile = iTPPlayerBase.getDemuxerOffsetInFile();
        com.tencent.thumbplayer.adapter.TPPlaybackInfo tPPlaybackInfo2 = this.mTPPlaybackInfo;
        if (tPPlaybackInfo2 != null) {
            tPPlaybackInfo2.setDemuxerOffset(demuxerOffsetInFile);
        }
        return demuxerOffsetInFile;
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public long getDurationMs() {
        com.tencent.thumbplayer.adapter.TPPlaybackInfo tPPlaybackInfo = this.mTPPlaybackInfo;
        if (tPPlaybackInfo != null && tPPlaybackInfo.getDurationMs() > 0) {
            return this.mTPPlaybackInfo.getDurationMs();
        }
        if (!this.mStateChecker.validStateCall(11)) {
            return 0L;
        }
        com.tencent.thumbplayer.adapter.player.ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
        if (iTPPlayerBase == null) {
            this.mLogger.warn("getDurationMs, mPlayerBase = null, return 0!");
            return 0L;
        }
        long durationMs = iTPPlayerBase.getDurationMs();
        com.tencent.thumbplayer.adapter.TPPlaybackInfo tPPlaybackInfo2 = this.mTPPlaybackInfo;
        if (tPPlaybackInfo2 != null) {
            tPPlaybackInfo2.setDurationMs(durationMs);
        }
        return durationMs;
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public com.tencent.thumbplayer.core.player.TPDynamicStatisticParams getDynamicStatisticParams(boolean z17) {
        com.tencent.thumbplayer.adapter.player.ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
        if (iTPPlayerBase == null) {
            return null;
        }
        return iTPPlayerBase.getDynamicStatisticParams(z17);
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public com.tencent.thumbplayer.core.player.TPGeneralPlayFlowParams getGeneralPlayFlowParams() {
        com.tencent.thumbplayer.adapter.player.ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
        if (iTPPlayerBase == null) {
            return null;
        }
        return iTPPlayerBase.getGeneralPlayFlowParams();
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public long getPlayableDurationMs() {
        if (!this.mStateChecker.validStateCall(12)) {
            return 0L;
        }
        com.tencent.thumbplayer.adapter.player.ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
        if (iTPPlayerBase == null) {
            this.mLogger.warn("getBufferedDurationMs, mPlayerBase = null, return 0!");
            return 0L;
        }
        long playableDurationMs = iTPPlayerBase.getPlayableDurationMs();
        com.tencent.thumbplayer.adapter.TPPlaybackInfo tPPlaybackInfo = this.mTPPlaybackInfo;
        if (tPPlaybackInfo != null) {
            tPPlaybackInfo.setPlayableDurationMs(playableDurationMs);
        }
        return playableDurationMs;
    }

    @Override // com.tencent.thumbplayer.adapter.ITPPlayerAdapter
    public com.tencent.thumbplayer.adapter.TPPlaybackInfo getPlaybackInfo() {
        return this.mTPPlaybackInfo;
    }

    @Override // com.tencent.thumbplayer.adapter.ITPPlayerAdapter
    public int getPlayerType() {
        return this.mPlayerType;
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public com.tencent.thumbplayer.api.TPProgramInfo[] getProgramInfo() {
        com.tencent.thumbplayer.adapter.player.ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
        return (iTPPlayerBase == null || iTPPlayerBase.getProgramInfo() == null) ? new com.tencent.thumbplayer.api.TPProgramInfo[0] : this.mPlayerBase.getProgramInfo();
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public long getPropertyLong(int i17) {
        com.tencent.thumbplayer.adapter.player.ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
        if (iTPPlayerBase != null) {
            return iTPPlayerBase.getPropertyLong(i17);
        }
        this.mLogger.warn("getPropertyLong, mPlayerBase = null, return !");
        return -1L;
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public java.lang.String getPropertyString(int i17) {
        com.tencent.thumbplayer.adapter.player.ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
        if (iTPPlayerBase != null) {
            return iTPPlayerBase.getPropertyString(i17);
        }
        this.mLogger.warn("getPropertyString, mPlayerBase = null, return !");
        return "";
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public com.tencent.thumbplayer.api.TPTrackInfo[] getTrackInfo() {
        com.tencent.thumbplayer.adapter.player.ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
        return iTPPlayerBase != null ? iTPPlayerBase.getTrackInfo() : (com.tencent.thumbplayer.api.TPTrackInfo[]) this.mPlayerInitParams.getTrackInfos().toArray(new com.tencent.thumbplayer.api.TPTrackInfo[0]);
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public int getVideoHeight() {
        com.tencent.thumbplayer.adapter.TPPlaybackInfo tPPlaybackInfo = this.mTPPlaybackInfo;
        if (tPPlaybackInfo != null && tPPlaybackInfo.getHeight() > 0) {
            return (int) this.mTPPlaybackInfo.getHeight();
        }
        if (!this.mStateChecker.validStateCall(13)) {
            this.mLogger.warn("getVideoHeight, state error!");
            return 0;
        }
        com.tencent.thumbplayer.adapter.player.ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
        if (iTPPlayerBase == null) {
            this.mLogger.warn("getVideoHeight, mPlayerBase = null, return 0!");
            return 0;
        }
        int videoHeight = iTPPlayerBase.getVideoHeight();
        com.tencent.thumbplayer.adapter.TPPlaybackInfo tPPlaybackInfo2 = this.mTPPlaybackInfo;
        if (tPPlaybackInfo2 != null) {
            tPPlaybackInfo2.setHeight(videoHeight);
        }
        return videoHeight;
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public int getVideoWidth() {
        com.tencent.thumbplayer.adapter.TPPlaybackInfo tPPlaybackInfo = this.mTPPlaybackInfo;
        if (tPPlaybackInfo != null && tPPlaybackInfo.getWidth() > 0) {
            return (int) this.mTPPlaybackInfo.getWidth();
        }
        if (!this.mStateChecker.validStateCall(13)) {
            this.mLogger.warn("getVideoWidth, state error!");
            return 0;
        }
        com.tencent.thumbplayer.adapter.player.ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
        if (iTPPlayerBase == null) {
            this.mLogger.warn("getVideoWidth, mPlayerBase = null, return 0!");
            return 0;
        }
        int videoWidth = iTPPlayerBase.getVideoWidth();
        com.tencent.thumbplayer.adapter.TPPlaybackInfo tPPlaybackInfo2 = this.mTPPlaybackInfo;
        if (tPPlaybackInfo2 != null) {
            tPPlaybackInfo2.setWidth(videoWidth);
        }
        return videoWidth;
    }

    @Override // com.tencent.thumbplayer.adapter.ITPPlayerAdapter
    public boolean isPlaying() {
        com.tencent.thumbplayer.api.TPPlayerState tPPlayerState = this.mPlayerState;
        return tPPlayerState != null && tPPlayerState.state() == 5;
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnStateChangeListener
    public void onStateChange(int i17, int i18) {
        this.mPlayerListeners.onStateChange(i17, i18);
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void pause() {
        if (!this.mStateChecker.validStateCall(6)) {
            throw new java.lang.IllegalStateException("error , pause , state invalid , current state :" + this.mPlayerState);
        }
        com.tencent.thumbplayer.adapter.player.ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
        if (iTPPlayerBase == null) {
            throw new java.lang.IllegalStateException("error , pause , player is null");
        }
        if (this.mIsReopening) {
            this.mPlayerState.changeState(6);
            return;
        }
        try {
            iTPPlayerBase.pause();
            this.mPlayerState.changeState(6);
        } catch (java.lang.IllegalStateException unused) {
            throw new java.lang.IllegalStateException("error , pause ,state invalid");
        }
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void prepare() {
        if (!this.mStateChecker.validStateCall(1)) {
            throw new java.lang.IllegalStateException("error , prepare , state invalid , current state :" + this.mPlayerState);
        }
        if (!this.mPlayerInitParams.validDataSource()) {
            throw new java.io.IOException("error , prepare , data source invalid");
        }
        com.tencent.thumbplayer.adapter.player.ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
        if (iTPPlayerBase != null) {
            iTPPlayerBase.reset();
            this.mPlayerBase.release();
        }
        com.tencent.thumbplayer.adapter.player.ITPPlayerBase createPlayerBase = createPlayerBase(selectPlayer(), this.mTPLoggerContext);
        this.mPlayerBase = createPlayerBase;
        if (createPlayerBase == null) {
            throw new java.lang.RuntimeException("error , create player failed");
        }
        this.mPlayerState.setInnerPlayStateState(3);
        this.mPlayerState.changeState(3);
        this.mPlayerBase.prepare();
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void prepareAsync() {
        if (!this.mStateChecker.validStateCall(1)) {
            throw new java.lang.IllegalStateException("error , prepare , state invalid , current state :" + this.mPlayerState);
        }
        if (!this.mPlayerInitParams.validDataSource()) {
            throw new java.lang.IllegalStateException("error , prepare , state invalid , data source invalid");
        }
        com.tencent.thumbplayer.adapter.player.ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
        if (iTPPlayerBase != null) {
            iTPPlayerBase.reset();
            this.mPlayerBase.release();
        }
        com.tencent.thumbplayer.adapter.player.ITPPlayerBase createPlayerBase = createPlayerBase(selectPlayer(), this.mTPLoggerContext);
        this.mPlayerBase = createPlayerBase;
        if (createPlayerBase == null) {
            throw new java.lang.RuntimeException("error , create player failed");
        }
        this.mPlayerState.setInnerPlayStateState(3);
        this.mPlayerState.changeState(3);
        this.mPlayerBase.prepareAsync();
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void release() {
        this.mLogger.info("release, current state :" + this.mPlayerState);
        com.tencent.thumbplayer.adapter.player.ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
        if (iTPPlayerBase != null) {
            iTPPlayerBase.release();
            this.mPlayerBase = null;
        }
        this.mPlayerInitParams.reset();
        this.mPlayerListeners.clear();
        this.mTpStrategy = null;
        this.mIsReopening = false;
        this.mPlayerState.changeState(11);
    }

    @Override // com.tencent.thumbplayer.adapter.ITPPlayerAdapter
    public void reopenPlayer() {
        reopenPlayer(this.mPlayerType, 2);
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void reset() {
        this.mLogger.info("reset, current state :" + this.mPlayerState);
        com.tencent.thumbplayer.adapter.player.ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
        if (iTPPlayerBase != null) {
            iTPPlayerBase.reset();
            this.mPlayerBase.release();
            this.mPlayerBase = null;
        }
        this.mPlayerInitParams.reset();
        com.tencent.thumbplayer.adapter.TPPlaybackInfo tPPlaybackInfo = this.mTPPlaybackInfo;
        if (tPPlaybackInfo != null) {
            tPPlaybackInfo.clear();
        }
        this.mTpStrategy = null;
        this.mIsReopening = false;
        this.mPlayerState.changeState(1);
        this.mPlayerState.setLastState(1);
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void seekTo(int i17) {
        if (this.mStateChecker.validStateCall(9)) {
            if (this.mPlayerBase != null) {
                if (this.mPlayerState.state() == 7) {
                    this.mPlayerState.changeState(5);
                }
                this.mPlayerBase.seekTo(i17);
                com.tencent.thumbplayer.richmedia.ITPInnerRichMediaSynchronizer iTPInnerRichMediaSynchronizer = this.mRichMediaProcessor;
                if (iTPInnerRichMediaSynchronizer != null) {
                    try {
                        iTPInnerRichMediaSynchronizer.seek(i17);
                        return;
                    } catch (java.lang.Exception unused) {
                        this.mLogger.warn("seekTo, rich media processor seek err.");
                        return;
                    }
                }
                return;
            }
            this.mLogger.warn("seekTo, mPlayerBase = null!");
            return;
        }
        throw new java.lang.IllegalStateException("error , seek to , state invalid , current state :" + this.mPlayerState);
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void selectProgram(int i17, long j17) {
        if (!this.mStateChecker.validStateCall(18)) {
            throw new java.lang.IllegalStateException("error : selectProgram , state invalid");
        }
        com.tencent.thumbplayer.api.TPProgramInfo[] programInfo = getProgramInfo();
        if (programInfo == null) {
            programInfo = new com.tencent.thumbplayer.api.TPProgramInfo[0];
        }
        if (i17 < 0 || i17 > programInfo.length - 1) {
            throw new java.lang.IllegalArgumentException("error : program index not found");
        }
        com.tencent.thumbplayer.adapter.player.ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
        if (iTPPlayerBase != null) {
            iTPPlayerBase.selectProgram(i17, j17);
        }
        this.mPlayerInitParams.setSelectProgramInfo(programInfo[i17]);
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void selectTrack(int i17, long j17) {
        if (!this.mStateChecker.validStateCall(3)) {
            throw new java.lang.IllegalStateException("error : selectTrack , state invalid");
        }
        com.tencent.thumbplayer.api.TPTrackInfo[] trackInfo = getTrackInfo();
        if (trackInfo == null) {
            this.mLogger.error("fatal err, tpTrackInfos is null");
            return;
        }
        if (i17 < 0 || i17 > trackInfo.length - 1) {
            throw new java.lang.IllegalArgumentException("error : track not found");
        }
        com.tencent.thumbplayer.adapter.player.ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
        if (iTPPlayerBase != null) {
            iTPPlayerBase.selectTrack(i17, j17);
        }
        this.mPlayerInitParams.addSelectedTrackInfo(i17, j17, trackInfo[i17]);
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setAudioGainRatio(float f17) {
        if (!this.mStateChecker.validStateCall(3)) {
            throw new java.lang.IllegalStateException("error , setAudioGainRatio , state invalid , current state :" + this.mPlayerState);
        }
        com.tencent.thumbplayer.adapter.player.ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
        if (iTPPlayerBase != null) {
            iTPPlayerBase.setAudioGainRatio(f17);
        } else {
            this.mLogger.info("setAudioGainRatio, mPlayerBase = null!");
        }
        this.mPlayerInitParams.setAudioGainRatio(f17);
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setAudioNormalizeVolumeParams(java.lang.String str) {
        if (!this.mStateChecker.validStateCall(3)) {
            throw new java.lang.IllegalStateException("error , setAudioNormalizeVolumeParams , state invalid , current state :" + this.mPlayerState);
        }
        com.tencent.thumbplayer.adapter.player.ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
        if (iTPPlayerBase != null) {
            iTPPlayerBase.setAudioNormalizeVolumeParams(str);
        } else {
            this.mLogger.info("setAudioGainRatio, mPlayerBase = null!");
        }
        this.mPlayerInitParams.setAudioNormalizeVolumeParams(str);
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setDataSource(java.lang.String str) {
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setLoopback(boolean z17) {
        if (this.mStateChecker.validStateCall(3)) {
            com.tencent.thumbplayer.adapter.player.ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
            if (iTPPlayerBase != null) {
                iTPPlayerBase.setLoopback(z17);
            } else {
                this.mLogger.info("setLoopback, mPlayerBase = null!");
            }
            this.mPlayerInitParams.setLoopback(z17);
            return;
        }
        throw new java.lang.IllegalStateException("error , setLoopback , state invalid , current state :" + this.mPlayerState);
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setOnAudioPcmOutputListener(com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnAudioPcmOutListener iOnAudioPcmOutListener) {
        this.mPlayerListeners.setOnAudioPcmOutListener(iOnAudioPcmOutListener);
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setOnAudioProcessOutputListener(com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnAudioProcessOutListener iOnAudioProcessOutListener) {
        this.mPlayerListeners.setOnAudioProcessFrameListener(iOnAudioProcessOutListener);
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setOnCompletionListener(com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnCompletionListener iOnCompletionListener) {
        this.mPlayerListeners.setOnCompletionListener(iOnCompletionListener);
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setOnDemuxerListener(com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnDemuxerListener iOnDemuxerListener) {
        this.mPlayerListeners.setOnDemuxerListener(iOnDemuxerListener);
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setOnDetailInfoListener(com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnDetailInfoListener iOnDetailInfoListener) {
        this.mPlayerListeners.setOnDetailInfoListener(iOnDetailInfoListener);
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setOnErrorListener(com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnErrorListener iOnErrorListener) {
        this.mPlayerListeners.setOnErrorListener(iOnErrorListener);
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setOnEventRecordListener(com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnEventRecordListener iOnEventRecordListener) {
        this.mPlayerListeners.setOnEventRecordListener(iOnEventRecordListener);
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setOnInfoListener(com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnInfoListener iOnInfoListener) {
        this.mPlayerListeners.setOnInfoListener(iOnInfoListener);
    }

    @Override // com.tencent.thumbplayer.adapter.ITPPlayerAdapter
    public void setOnPlayerStateChangeListener(com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnStateChangeListener iOnStateChangeListener) {
        this.mPlayerListeners.setOnStateChangeListener(iOnStateChangeListener);
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
        this.mPlayerListeners.setOnSubtitleFrameOutListener(iOnSubtitleFrameOutListener);
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setOnVideoFrameOutListener(com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnVideoFrameOutListener iOnVideoFrameOutListener) {
        this.mPlayerListeners.setOnVideoFrameOutListener(iOnVideoFrameOutListener);
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setOnVideoProcessOutputListener(com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnVideoProcessOutListener iOnVideoProcessOutListener) {
        this.mPlayerListeners.setOnVideoProcessFrameListener(iOnVideoProcessOutListener);
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setOnVideoSizeChangedListener(com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnVideoSizeChangedListener iOnVideoSizeChangedListener) {
        this.mPlayerListeners.setOnVideoSizeChangedListener(iOnVideoSizeChangedListener);
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setOutputMute(boolean z17) {
        if (!this.mStateChecker.validStateCall(3)) {
            throw new java.lang.IllegalStateException("error , setOutputMute , state invalid , current state :" + this.mPlayerState);
        }
        com.tencent.thumbplayer.adapter.player.ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
        if (iTPPlayerBase != null) {
            iTPPlayerBase.setOutputMute(z17);
        } else {
            this.mLogger.info("setOutputMute, mPlayerBase = null!");
        }
        this.mPlayerInitParams.setOutputMute(z17);
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setPlaySharpenSwitch() {
        if (!this.mStateChecker.validStateCall(3)) {
            throw new java.lang.IllegalStateException("error , setSharpenSwitch , state invalid , current state :" + this.mPlayerState);
        }
        com.tencent.thumbplayer.adapter.player.ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
        if (iTPPlayerBase != null) {
            iTPPlayerBase.setPlaySharpenSwitch();
        } else {
            this.mLogger.info("setSharpenSwitch, mPlayerBase = null!");
        }
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setPlaySpeedRatio(float f17) {
        if (!this.mStateChecker.validStateCall(3)) {
            throw new java.lang.IllegalStateException("error , setPlaySpeedRatio , state invalid , current state :" + this.mPlayerState);
        }
        com.tencent.thumbplayer.adapter.player.ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
        if (iTPPlayerBase != null) {
            iTPPlayerBase.setPlaySpeedRatio(f17);
        } else {
            this.mLogger.info("setPlaySpeedRatio, mPlayerBase = null!");
        }
        this.mPlayerInitParams.setSpeedRatio(f17);
        com.tencent.thumbplayer.richmedia.ITPInnerRichMediaSynchronizer iTPInnerRichMediaSynchronizer = this.mRichMediaProcessor;
        if (iTPInnerRichMediaSynchronizer != null) {
            try {
                iTPInnerRichMediaSynchronizer.setPlaybackRate(f17);
            } catch (java.lang.Exception unused) {
                this.mLogger.warn("setPlaySpeedRatio, rich media processor setPlaySpeedRatio err.");
            }
        }
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setPlayerOptionalParam(com.tencent.thumbplayer.api.TPOptionalParam tPOptionalParam) {
        if (!this.mStateChecker.validStateCall(3)) {
            throw new java.lang.IllegalStateException("setPlayerOptionalParam , state invalid");
        }
        com.tencent.thumbplayer.adapter.player.ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
        if (iTPPlayerBase != null) {
            iTPPlayerBase.setPlayerOptionalParam(tPOptionalParam);
        }
        this.mPlayerInitParams.addOptionalParams(tPOptionalParam);
    }

    @Override // com.tencent.thumbplayer.adapter.ITPPlayerAdapter
    public void setRichMediaSynchronizer(com.tencent.thumbplayer.api.richmedia.ITPRichMediaSynchronizer iTPRichMediaSynchronizer) {
        if (iTPRichMediaSynchronizer == null) {
            com.tencent.thumbplayer.richmedia.ITPInnerRichMediaSynchronizer iTPInnerRichMediaSynchronizer = this.mRichMediaProcessor;
            if (iTPInnerRichMediaSynchronizer != null) {
                iTPInnerRichMediaSynchronizer.setInnerListener(null);
            }
            this.mRichMediaProcessor = null;
            return;
        }
        if (iTPRichMediaSynchronizer instanceof com.tencent.thumbplayer.richmedia.ITPInnerRichMediaSynchronizer) {
            com.tencent.thumbplayer.richmedia.ITPInnerRichMediaSynchronizer iTPInnerRichMediaSynchronizer2 = (com.tencent.thumbplayer.richmedia.ITPInnerRichMediaSynchronizer) iTPRichMediaSynchronizer;
            this.mRichMediaProcessor = iTPInnerRichMediaSynchronizer2;
            iTPInnerRichMediaSynchronizer2.setInnerListener(new com.tencent.thumbplayer.richmedia.ITPInnerRichMediaSynchronizer.ITPRichMediaInnerSynchronizerListener() { // from class: com.tencent.thumbplayer.adapter.TPPlayerAdapter.1
                @Override // com.tencent.thumbplayer.richmedia.ITPInnerRichMediaSynchronizer.ITPRichMediaInnerSynchronizerListener
                public long onGetCurrentPositionMs(com.tencent.thumbplayer.api.richmedia.ITPRichMediaSynchronizer iTPRichMediaSynchronizer2) {
                    return com.tencent.thumbplayer.adapter.TPPlayerAdapter.this.getCurrentPositionMs();
                }
            });
        }
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
        com.tencent.thumbplayer.adapter.player.ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
        if (iTPPlayerBase != null) {
            iTPPlayerBase.setSurfaceHolder(surfaceHolder);
        }
        this.mPlayerInitParams.setSurfaceHolder(surfaceHolder);
    }

    @Override // com.tencent.thumbplayer.adapter.ITPPlayerAdapter
    public void setVideoInfo(com.tencent.thumbplayer.api.TPVideoInfo tPVideoInfo) {
        if (!this.mStateChecker.validStateCall(2)) {
            this.mLogger.error("setVideoInfo state invalid");
        }
        if (tPVideoInfo != null) {
            this.mTPPlaybackInfo.setHeight(tPVideoInfo.getHeight());
            this.mTPPlaybackInfo.setWidth(tPVideoInfo.getWidth());
            this.mTPPlaybackInfo.setDefinition(tPVideoInfo.getDefinition());
            this.mTPPlaybackInfo.setVideoCodedId(tPVideoInfo.getVideoCodecId());
        }
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void start() {
        if (!this.mStateChecker.validStateCall(5)) {
            throw new java.lang.IllegalStateException("error , start , state invalid , current state :" + this.mPlayerState);
        }
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

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void stop() {
        if (!this.mStateChecker.validStateCall(7)) {
            throw new java.lang.IllegalStateException("error , stop , state invalid , current state :" + this.mPlayerState);
        }
        if (this.mPlayerBase == null) {
            throw new java.lang.IllegalStateException("error , stop , player is null");
        }
        try {
            try {
                this.mPlayerState.changeState(8);
                this.mPlayerBase.stop();
            } catch (java.lang.IllegalStateException unused) {
                throw new java.lang.IllegalStateException("error , stop ,state invalid");
            }
        } finally {
            this.mPlayerState.changeState(9);
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
        } else {
            this.mLogger.info("setOutputMute, mPlayerBase = null!");
        }
        this.mPlayerInitParams.setSurface(surface, i17);
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void updateLoggerContext(com.tencent.thumbplayer.log.TPLoggerContext tPLoggerContext) {
        this.mTPLoggerContext.update(tPLoggerContext, TAG);
        this.mLogger.updateContext(this.mTPLoggerContext);
        this.mPlayerListeners.updateTag(this.mTPLoggerContext.getTag());
        com.tencent.thumbplayer.adapter.player.ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
        if (iTPPlayerBase != null) {
            iTPPlayerBase.updateLoggerContext(this.mTPLoggerContext);
        }
    }

    @Override // com.tencent.thumbplayer.adapter.ITPPlayerAdapter
    public void updateVideoInfo(com.tencent.thumbplayer.api.TPVideoInfo tPVideoInfo) {
        if (!this.mStateChecker.validStateCall(3)) {
            this.mLogger.error("updateVideoInfo state invalid");
        }
        if (tPVideoInfo != null) {
            this.mTPPlaybackInfo.setHeight(tPVideoInfo.getHeight());
            this.mTPPlaybackInfo.setWidth(tPVideoInfo.getWidth());
            this.mTPPlaybackInfo.setDefinition(tPVideoInfo.getDefinition());
            this.mTPPlaybackInfo.setVideoCodedId(tPVideoInfo.getVideoCodecId());
        }
    }

    private void reopenPlayer(int i17, int i18) {
        if (i18 == 1) {
            this.mPlayerListeners.onInfo(1013, i17, 0L, null);
        } else {
            this.mPlayerListeners.onInfo(200, 0L, 0L, null);
        }
        this.mReopenType = i18;
        com.tencent.thumbplayer.api.TPPlayerState tPPlayerState = this.mPlayerState;
        tPPlayerState.setLastState(tPPlayerState.state());
        com.tencent.thumbplayer.adapter.player.ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
        if (iTPPlayerBase != null) {
            long currentPositionMs = iTPPlayerBase.getCurrentPositionMs();
            this.mLogger.info("switchPlayer, current position:" + currentPositionMs);
            this.mTPPlaybackInfo.setCurrentPositionMs(currentPositionMs);
            this.mTPPlaybackInfo.setPlayableDurationMs(this.mPlayerBase.getPlayableDurationMs());
            this.mPlayerBase.reset();
            this.mPlayerBase.release();
        }
        com.tencent.thumbplayer.adapter.player.ITPPlayerBase createPlayerBase = createPlayerBase(i17, this.mTPLoggerContext);
        this.mPlayerBase = createPlayerBase;
        if (createPlayerBase != null) {
            this.mIsReopening = true;
            this.mLogger.info("switch player to type:" + this.mPlayerType);
            if (this.mTPPlaybackInfo != null) {
                this.mPlayerBase.setPlayerOptionalParam(new com.tencent.thumbplayer.api.TPOptionalParam().buildLong(100, this.mTPPlaybackInfo.getCurrentPositionMs()));
            }
            this.mPlayerState.setInnerPlayStateState(3);
            this.mPlayerBase.prepareAsync();
            return;
        }
        throw new java.lang.RuntimeException("error , create player failed");
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void addAudioTrackSource(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str2, java.util.List<com.tencent.thumbplayer.api.TPOptionalParam> list) {
        if (this.mStateChecker.validStateCall(3)) {
            com.tencent.thumbplayer.adapter.player.ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
            if (iTPPlayerBase != null) {
                iTPPlayerBase.addAudioTrackSource(str, map, str2, list);
            }
            this.mPlayerInitParams.addAudioTrackSource(str, map, str2, list);
            return;
        }
        throw new java.lang.IllegalStateException("error : addAudioTrackSource, state invalid");
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void addSubtitleSource(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str2, java.lang.String str3) {
        if (this.mStateChecker.validStateCall(3)) {
            com.tencent.thumbplayer.adapter.player.ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
            if (iTPPlayerBase != null) {
                iTPPlayerBase.addSubtitleSource(str, map, str2, str3);
            }
            this.mPlayerInitParams.addSubtitleSource(str, map, str2, str3);
            return;
        }
        throw new java.lang.IllegalStateException("error : addSubtitleSource, state invalid");
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setDataSource(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void switchDefinition(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, int i17, long j17) {
    }

    @Override // com.tencent.thumbplayer.adapter.ITPPlayerAdapter
    public void setDataSource(com.tencent.thumbplayer.adapter.player.TPUrlDataSource tPUrlDataSource) {
        setDataSource(tPUrlDataSource, (java.util.Map<java.lang.String, java.lang.String>) null);
    }

    @Override // com.tencent.thumbplayer.adapter.ITPPlayerAdapter
    public void switchDefinition(com.tencent.thumbplayer.adapter.player.TPUrlDataSource tPUrlDataSource, int i17, long j17) {
        java.lang.String systemPlayerUrl;
        if (this.mStateChecker.validStateCall(17)) {
            this.mPlayerInitParams.setDataSource(tPUrlDataSource, (java.util.Map<java.lang.String, java.lang.String>) null);
            if (this.mPlayerBase != null) {
                int i18 = this.mPlayerType;
                if (i18 == 2) {
                    systemPlayerUrl = tPUrlDataSource.getSelfPlayerUrl();
                } else {
                    systemPlayerUrl = i18 == 1 ? tPUrlDataSource.getSystemPlayerUrl() : "";
                }
                this.mPlayerBase.switchDefinition(systemPlayerUrl, i17, j17);
                return;
            }
            this.mLogger.warn("switchDefinition, mPlayerBase = null!");
            return;
        }
        throw new java.lang.IllegalStateException("error , switch definition , state invalid , current state :" + this.mPlayerState);
    }

    @Override // com.tencent.thumbplayer.adapter.ITPPlayerAdapter
    public void setDataSource(com.tencent.thumbplayer.adapter.player.TPUrlDataSource tPUrlDataSource, java.util.Map<java.lang.String, java.lang.String> map) {
        if (this.mStateChecker.validStateCall(2)) {
            this.mPlayerInitParams.setDataSource(tPUrlDataSource, map);
            this.mPlayerState.changeState(2);
            return;
        }
        throw new java.lang.IllegalStateException("error : setDataSource , state invalid");
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setLoopback(boolean z17, long j17, long j18) {
        if (this.mStateChecker.validStateCall(3)) {
            com.tencent.thumbplayer.adapter.player.ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
            if (iTPPlayerBase != null) {
                iTPPlayerBase.setLoopback(z17, j17, j18);
            } else {
                this.mLogger.info("setLoopback, mPlayerBase = null!");
            }
            this.mPlayerInitParams.setLoopback(z17, j17, j18);
            return;
        }
        throw new java.lang.IllegalStateException("error , setLoopback , state invalid , current state :" + this.mPlayerState);
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setDataSource(android.os.ParcelFileDescriptor parcelFileDescriptor) {
        if (!this.mStateChecker.validStateCall(2)) {
            throw new java.lang.IllegalStateException("error : setDataSource , state invalid");
        }
        if (parcelFileDescriptor != null) {
            this.mPlayerInitParams.setDataSource(parcelFileDescriptor);
            this.mPlayerState.changeState(2);
            return;
        }
        throw new java.lang.IllegalArgumentException("error : setDataSource , pfd invalid");
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void seekTo(int i17, @com.tencent.thumbplayer.api.TPCommonEnum.TPSeekMode int i18) {
        if (this.mStateChecker.validStateCall(9)) {
            if (this.mPlayerBase != null) {
                if (this.mPlayerState.state() == 7) {
                    this.mPlayerState.changeState(5);
                }
                this.mPlayerBase.seekTo(i17, i18);
                com.tencent.thumbplayer.richmedia.ITPInnerRichMediaSynchronizer iTPInnerRichMediaSynchronizer = this.mRichMediaProcessor;
                if (iTPInnerRichMediaSynchronizer != null) {
                    try {
                        iTPInnerRichMediaSynchronizer.seek(i17);
                        return;
                    } catch (java.lang.Exception unused) {
                        this.mLogger.warn("seekTo, rich media processor seek err.");
                        return;
                    }
                }
                return;
            }
            this.mLogger.warn("seekTo, mPlayerBase = null!");
            return;
        }
        throw new java.lang.IllegalStateException("error , seek to , state invalid , current state :" + this.mPlayerState);
    }

    @Override // com.tencent.thumbplayer.adapter.ITPPlayerAdapter
    public void switchDefinition(com.tencent.thumbplayer.adapter.player.TPUrlDataSource tPUrlDataSource, java.util.Map<java.lang.String, java.lang.String> map, int i17, long j17) {
        java.lang.String systemPlayerUrl;
        if (this.mStateChecker.validStateCall(17)) {
            this.mPlayerInitParams.setDataSource(tPUrlDataSource, map);
            if (this.mPlayerBase != null) {
                int i18 = this.mPlayerType;
                if (i18 == 2) {
                    systemPlayerUrl = tPUrlDataSource.getSelfPlayerUrl();
                } else {
                    systemPlayerUrl = i18 == 1 ? tPUrlDataSource.getSystemPlayerUrl() : "";
                }
                this.mPlayerBase.switchDefinition(systemPlayerUrl, map, i17, j17);
                return;
            }
            this.mLogger.warn("switchDefinition, mPlayerBase = null!");
            return;
        }
        throw new java.lang.IllegalStateException("error , switch definition , state invalid , current state :" + this.mPlayerState);
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setDataSource(android.content.res.AssetFileDescriptor assetFileDescriptor) {
        if (!this.mStateChecker.validStateCall(2)) {
            throw new java.lang.IllegalStateException("error : setDataSource , state invalid");
        }
        if (assetFileDescriptor != null) {
            this.mPlayerInitParams.setDataSource(assetFileDescriptor);
            this.mPlayerState.changeState(2);
            return;
        }
        throw new java.lang.IllegalArgumentException("error : setDataSource , afd invalid");
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setDataSource(com.tencent.thumbplayer.api.composition.ITPMediaAsset iTPMediaAsset) {
        if (!this.mStateChecker.validStateCall(2)) {
            throw new java.lang.IllegalStateException("error : setDataSource , state invalid");
        }
        if (iTPMediaAsset != null) {
            this.mPlayerInitParams.setDataSource(iTPMediaAsset);
            this.mPlayerState.changeState(2);
            return;
        }
        throw new java.lang.IllegalArgumentException("error : setDataSource , mediaAsset invalid");
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void switchDefinition(com.tencent.thumbplayer.api.composition.ITPMediaAsset iTPMediaAsset, @com.tencent.thumbplayer.api.TPCommonEnum.TPSwitchDefMode int i17, long j17) {
        if (this.mStateChecker.validStateCall(17)) {
            this.mPlayerInitParams.setDataSource(iTPMediaAsset);
            com.tencent.thumbplayer.adapter.player.ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
            if (iTPPlayerBase != null) {
                iTPPlayerBase.switchDefinition(iTPMediaAsset, i17, j17);
                return;
            } else {
                this.mLogger.warn("switchDefinition, mPlayerBase = null!");
                return;
            }
        }
        throw new java.lang.IllegalStateException("error , switch definition , state invalid , current state :" + this.mPlayerState);
    }
}
