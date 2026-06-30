package com.tencent.thumbplayer.adapter.player.systemplayer;

/* loaded from: classes16.dex */
public class TPSysPlayerExternalSubtitle implements com.tencent.thumbplayer.adapter.player.systemplayer.ITPSysPlayerExternalSubtitle {
    private static final int SUB_POLL_INTV_MS = 200;
    private static final java.lang.String TAG = "TPSysPlayerExternalSubtitle";
    private java.lang.String mLastSubText;
    com.tencent.thumbplayer.core.subtitle.TPNativeSubtitleRenderParams mNativeSubtitleRenderParams;
    private com.tencent.thumbplayer.adapter.player.systemplayer.ITPSysPlayerExternalSubtitle.IPlayPositionListener mPlayPosLis;
    private com.tencent.thumbplayer.adapter.player.systemplayer.ITPSysPlayerExternalSubtitle.IOnSubTitleListener mSubLis;
    private com.tencent.thumbplayer.adapter.player.systemplayer.ITPSysPlayerExternalSubtitle.IOnSubtitleErrorListener mSubtitleErrorLis;
    private com.tencent.thumbplayer.core.subtitle.TPSubtitleParser mTpSubParser;
    private com.tencent.thumbplayer.adapter.player.systemplayer.ITPSysPlayerExternalSubtitle.IOnTrackSelectListener mTrackSelectLis;
    int mSubtitleType = 0;
    private java.util.concurrent.Future<?> mSubPoll = null;
    private final java.lang.Object mSubPollLock = new java.lang.Object();
    private com.tencent.thumbplayer.adapter.player.systemplayer.TPSysPlayerExternalSubtitle.SubtitleState mState = com.tencent.thumbplayer.adapter.player.systemplayer.TPSysPlayerExternalSubtitle.SubtitleState.IDLE;

    /* loaded from: classes16.dex */
    public enum SubtitleState {
        IDLE,
        INITED,
        PREPARED,
        STOPED,
        ERROR
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleSubtitleLoadResult(long j17) {
        if (this.mState != com.tencent.thumbplayer.adapter.player.systemplayer.TPSysPlayerExternalSubtitle.SubtitleState.INITED) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "prepare, illegalState, state:" + this.mState);
            return;
        }
        com.tencent.thumbplayer.core.common.TPMediaTrackInfo[] trackInfo = this.mTpSubParser.getTrackInfo();
        if (trackInfo == null || trackInfo.length <= 0) {
            com.tencent.thumbplayer.utils.TPLogUtil.w(TAG, "prepare, err, trackInfos is empty.");
            this.mState = com.tencent.thumbplayer.adapter.player.systemplayer.TPSysPlayerExternalSubtitle.SubtitleState.ERROR;
            return;
        }
        if (trackInfo[0].trackType != 3) {
            this.mState = com.tencent.thumbplayer.adapter.player.systemplayer.TPSysPlayerExternalSubtitle.SubtitleState.ERROR;
            com.tencent.thumbplayer.utils.TPLogUtil.w(TAG, "prepare, err, track type not match.");
            return;
        }
        this.mTpSubParser.selectTrackAsync(0, j17);
        this.mState = com.tencent.thumbplayer.adapter.player.systemplayer.TPSysPlayerExternalSubtitle.SubtitleState.PREPARED;
        if (this.mSubtitleType == 0) {
            synchronized (this.mSubPollLock) {
                java.util.concurrent.Future<?> future = this.mSubPoll;
                if (future != null) {
                    future.cancel(true);
                    this.mSubPoll = null;
                }
                this.mSubPoll = com.tencent.thumbplayer.utils.TPThreadPool.getInstance().obtainScheduledExecutorService().scheduleAtFixedRate(new java.lang.Runnable() { // from class: com.tencent.thumbplayer.adapter.player.systemplayer.TPSysPlayerExternalSubtitle.2
                    @Override // java.lang.Runnable
                    public void run() {
                        com.tencent.thumbplayer.adapter.player.systemplayer.TPSysPlayerExternalSubtitle.this.subPollFunc(0);
                    }
                }, 0L, 200L, java.util.concurrent.TimeUnit.MILLISECONDS);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void subPollFunc(int i17) {
        com.tencent.thumbplayer.adapter.player.systemplayer.ITPSysPlayerExternalSubtitle.IPlayPositionListener iPlayPositionListener = this.mPlayPosLis;
        com.tencent.thumbplayer.adapter.player.systemplayer.ITPSysPlayerExternalSubtitle.IOnSubTitleListener iOnSubTitleListener = this.mSubLis;
        if (iPlayPositionListener == null || iOnSubTitleListener == null) {
            com.tencent.thumbplayer.utils.TPLogUtil.w(TAG, "subPollFunc, posLis:" + iPlayPositionListener + ", subLis:" + iOnSubTitleListener);
            return;
        }
        long currentPosition = iPlayPositionListener.getCurrentPosition();
        if (currentPosition < 0) {
            com.tencent.thumbplayer.utils.TPLogUtil.w(TAG, "subPollFunc, cur position:" + currentPosition);
        } else {
            java.lang.String subtitleText = this.mTpSubParser.getSubtitleText(currentPosition, i17);
            if (android.text.TextUtils.equals(this.mLastSubText, subtitleText)) {
                return;
            }
            this.mLastSubText = subtitleText;
            iOnSubTitleListener.onSubtitleInfo(new com.tencent.thumbplayer.adapter.player.systemplayer.ITPSysPlayerExternalSubtitle.SubtitleData(subtitleText));
        }
    }

    @Override // com.tencent.thumbplayer.adapter.player.systemplayer.ITPSysPlayerExternalSubtitle
    public void pauseAsync() {
        if (this.mState == com.tencent.thumbplayer.adapter.player.systemplayer.TPSysPlayerExternalSubtitle.SubtitleState.PREPARED) {
            com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "pauseAsync");
            this.mTpSubParser.pauseAsync();
        } else {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "pauseAsync, illegalState, state:" + this.mState);
        }
    }

    @Override // com.tencent.thumbplayer.adapter.player.systemplayer.ITPSysPlayerExternalSubtitle
    public void prepare() {
        if (this.mState != com.tencent.thumbplayer.adapter.player.systemplayer.TPSysPlayerExternalSubtitle.SubtitleState.INITED) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "prepare, illegalState, state:" + this.mState);
            return;
        }
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "prepare.");
        this.mTpSubParser.init();
        this.mTpSubParser.loadAsync();
        com.tencent.thumbplayer.core.subtitle.TPNativeSubtitleRenderParams tPNativeSubtitleRenderParams = this.mNativeSubtitleRenderParams;
        if (tPNativeSubtitleRenderParams != null) {
            this.mTpSubParser.setRenderParams(tPNativeSubtitleRenderParams);
        }
    }

    @Override // com.tencent.thumbplayer.adapter.player.systemplayer.ITPSysPlayerExternalSubtitle
    public void release() {
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "release.");
        this.mPlayPosLis = null;
        this.mSubLis = null;
    }

    @Override // com.tencent.thumbplayer.adapter.player.systemplayer.ITPSysPlayerExternalSubtitle
    public void reset() {
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "reset.");
        if (this.mState != com.tencent.thumbplayer.adapter.player.systemplayer.TPSysPlayerExternalSubtitle.SubtitleState.IDLE) {
            com.tencent.thumbplayer.core.subtitle.TPSubtitleParser tPSubtitleParser = this.mTpSubParser;
            if (tPSubtitleParser != null) {
                try {
                    tPSubtitleParser.stop();
                    this.mTpSubParser.unInit();
                } catch (java.lang.Exception e17) {
                    com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, e17);
                }
            }
            this.mTpSubParser = null;
        }
        synchronized (this.mSubPollLock) {
            java.util.concurrent.Future<?> future = this.mSubPoll;
            if (future != null) {
                future.cancel(true);
                this.mSubPoll = null;
            }
        }
        this.mState = com.tencent.thumbplayer.adapter.player.systemplayer.TPSysPlayerExternalSubtitle.SubtitleState.IDLE;
    }

    @Override // com.tencent.thumbplayer.adapter.player.systemplayer.ITPSysPlayerExternalSubtitle
    public void setDataSource(java.lang.String str, long j17) {
        setDataSource(str, null, j17);
    }

    @Override // com.tencent.thumbplayer.adapter.player.systemplayer.ITPSysPlayerExternalSubtitle
    public void setOnSubTitleListener(com.tencent.thumbplayer.adapter.player.systemplayer.ITPSysPlayerExternalSubtitle.IOnSubTitleListener iOnSubTitleListener) {
        this.mSubLis = iOnSubTitleListener;
    }

    @Override // com.tencent.thumbplayer.adapter.player.systemplayer.ITPSysPlayerExternalSubtitle
    public void setPlayerPositionListener(com.tencent.thumbplayer.adapter.player.systemplayer.ITPSysPlayerExternalSubtitle.IPlayPositionListener iPlayPositionListener) {
        this.mPlayPosLis = iPlayPositionListener;
    }

    @Override // com.tencent.thumbplayer.adapter.player.systemplayer.ITPSysPlayerExternalSubtitle
    public void setSubtitleErrorListener(com.tencent.thumbplayer.adapter.player.systemplayer.ITPSysPlayerExternalSubtitle.IOnSubtitleErrorListener iOnSubtitleErrorListener) {
        this.mSubtitleErrorLis = iOnSubtitleErrorListener;
    }

    @Override // com.tencent.thumbplayer.adapter.player.systemplayer.ITPSysPlayerExternalSubtitle
    public void setSubtitleRenderModel(com.tencent.thumbplayer.api.TPSubtitleRenderModel tPSubtitleRenderModel) {
        com.tencent.thumbplayer.core.subtitle.TPNativeSubtitleRenderParams convert2TPNativeSubtitleRenderParams = com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayerUtils.convert2TPNativeSubtitleRenderParams(tPSubtitleRenderModel);
        this.mNativeSubtitleRenderParams = convert2TPNativeSubtitleRenderParams;
        com.tencent.thumbplayer.core.subtitle.TPSubtitleParser tPSubtitleParser = this.mTpSubParser;
        if (tPSubtitleParser != null) {
            tPSubtitleParser.setRenderParams(convert2TPNativeSubtitleRenderParams);
        }
    }

    @Override // com.tencent.thumbplayer.adapter.player.systemplayer.ITPSysPlayerExternalSubtitle
    public void setSubtitleType(int i17) {
        this.mSubtitleType = i17;
    }

    @Override // com.tencent.thumbplayer.adapter.player.systemplayer.ITPSysPlayerExternalSubtitle
    public void setTrackSelectListener(com.tencent.thumbplayer.adapter.player.systemplayer.ITPSysPlayerExternalSubtitle.IOnTrackSelectListener iOnTrackSelectListener) {
        this.mTrackSelectLis = iOnTrackSelectListener;
    }

    @Override // com.tencent.thumbplayer.adapter.player.systemplayer.ITPSysPlayerExternalSubtitle
    public void startAsync() {
        if (this.mState == com.tencent.thumbplayer.adapter.player.systemplayer.TPSysPlayerExternalSubtitle.SubtitleState.PREPARED) {
            com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "startAsync");
            this.mTpSubParser.startAsync();
        } else {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "startAsync, illegalState, state:" + this.mState);
        }
    }

    @Override // com.tencent.thumbplayer.adapter.player.systemplayer.ITPSysPlayerExternalSubtitle
    public void stop() {
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "stop.");
        com.tencent.thumbplayer.adapter.player.systemplayer.TPSysPlayerExternalSubtitle.SubtitleState subtitleState = this.mState;
        if (subtitleState == com.tencent.thumbplayer.adapter.player.systemplayer.TPSysPlayerExternalSubtitle.SubtitleState.INITED || subtitleState == com.tencent.thumbplayer.adapter.player.systemplayer.TPSysPlayerExternalSubtitle.SubtitleState.PREPARED || subtitleState == com.tencent.thumbplayer.adapter.player.systemplayer.TPSysPlayerExternalSubtitle.SubtitleState.ERROR) {
            com.tencent.thumbplayer.core.subtitle.TPSubtitleParser tPSubtitleParser = this.mTpSubParser;
            if (tPSubtitleParser != null) {
                try {
                    tPSubtitleParser.stop();
                    this.mTpSubParser.unInit();
                } catch (java.lang.Exception e17) {
                    com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, e17);
                }
            }
            this.mTpSubParser = null;
        }
        if (this.mSubtitleType == 0) {
            synchronized (this.mSubPollLock) {
                java.util.concurrent.Future<?> future = this.mSubPoll;
                if (future != null) {
                    future.cancel(true);
                    this.mSubPoll = null;
                }
            }
        }
        this.mState = com.tencent.thumbplayer.adapter.player.systemplayer.TPSysPlayerExternalSubtitle.SubtitleState.STOPED;
    }

    @Override // com.tencent.thumbplayer.adapter.player.systemplayer.ITPSysPlayerExternalSubtitle
    public void setDataSource(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, final long j17) {
        if (this.mState != com.tencent.thumbplayer.adapter.player.systemplayer.TPSysPlayerExternalSubtitle.SubtitleState.IDLE) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "setDataSource, illegalState, state:" + this.mState);
            return;
        }
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "setDataSource, illegal argument, url:" + str);
            return;
        }
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "setDataSource, url: " + str);
        if (this.mTpSubParser != null) {
            com.tencent.thumbplayer.utils.TPLogUtil.w(TAG, "setDataSource, mTpSubParser != null.");
            try {
                this.mTpSubParser.stop();
                this.mTpSubParser.unInit();
            } catch (java.lang.Exception unused) {
            }
            this.mTpSubParser = null;
        }
        this.mTpSubParser = new com.tencent.thumbplayer.core.subtitle.TPSubtitleParser(str, map, new com.tencent.thumbplayer.core.subtitle.ITPSubtitleParserCallback() { // from class: com.tencent.thumbplayer.adapter.player.systemplayer.TPSysPlayerExternalSubtitle.1
            @Override // com.tencent.thumbplayer.core.subtitle.ITPSubtitleParserCallback
            public long onGetCurrentPlayPositionMs() {
                if (com.tencent.thumbplayer.adapter.player.systemplayer.TPSysPlayerExternalSubtitle.this.mPlayPosLis != null) {
                    return com.tencent.thumbplayer.adapter.player.systemplayer.TPSysPlayerExternalSubtitle.this.mPlayPosLis.getCurrentPosition();
                }
                return 0L;
            }

            @Override // com.tencent.thumbplayer.core.subtitle.ITPSubtitleParserCallback
            public void onLoadResult(int i17) {
                com.tencent.thumbplayer.utils.TPLogUtil.i(com.tencent.thumbplayer.adapter.player.systemplayer.TPSysPlayerExternalSubtitle.TAG, "onLoadResult, index:" + i17);
                com.tencent.thumbplayer.adapter.player.systemplayer.TPSysPlayerExternalSubtitle.this.handleSubtitleLoadResult(j17);
            }

            @Override // com.tencent.thumbplayer.core.subtitle.ITPSubtitleParserCallback
            public void onSelectResult(int i17, long j18) {
                com.tencent.thumbplayer.utils.TPLogUtil.i(com.tencent.thumbplayer.adapter.player.systemplayer.TPSysPlayerExternalSubtitle.TAG, "onSelectResult, errCode:" + i17 + ", selectOpaque:" + j18 + ", opaque =" + j17);
                if (i17 == 0 && com.tencent.thumbplayer.adapter.player.systemplayer.TPSysPlayerExternalSubtitle.this.mTrackSelectLis != null) {
                    com.tencent.thumbplayer.adapter.player.systemplayer.TPSysPlayerExternalSubtitle.this.mTrackSelectLis.onTrackSelectSuccess(j17);
                } else {
                    if (i17 == 0 || com.tencent.thumbplayer.adapter.player.systemplayer.TPSysPlayerExternalSubtitle.this.mTrackSelectLis == null) {
                        return;
                    }
                    com.tencent.thumbplayer.adapter.player.systemplayer.TPSysPlayerExternalSubtitle.this.mTrackSelectLis.onTrackSelectFailure(i17, j17);
                }
            }

            @Override // com.tencent.thumbplayer.core.subtitle.ITPSubtitleParserCallback
            public void onSubtitleError(int i17, int i18) {
                com.tencent.thumbplayer.utils.TPLogUtil.i(com.tencent.thumbplayer.adapter.player.systemplayer.TPSysPlayerExternalSubtitle.TAG, "onSubtitleError, index:" + i17 + ", errorCode:" + i18);
                com.tencent.thumbplayer.adapter.player.systemplayer.TPSysPlayerExternalSubtitle.this.mSubtitleErrorLis.onSubtitleError(i17, i18);
            }

            @Override // com.tencent.thumbplayer.core.subtitle.ITPSubtitleParserCallback
            public void onSubtitleFrame(com.tencent.thumbplayer.core.common.TPSubtitleFrame tPSubtitleFrame) {
                com.tencent.thumbplayer.utils.TPLogUtil.i(com.tencent.thumbplayer.adapter.player.systemplayer.TPSysPlayerExternalSubtitle.TAG, "onSubtitleFrame");
                if (com.tencent.thumbplayer.adapter.player.systemplayer.TPSysPlayerExternalSubtitle.this.mSubLis != null) {
                    com.tencent.thumbplayer.adapter.player.systemplayer.TPSysPlayerExternalSubtitle.this.mSubLis.onSubtitleFrameData(tPSubtitleFrame);
                }
            }

            @Override // com.tencent.thumbplayer.core.subtitle.ITPSubtitleParserCallback
            public void onSubtitleNote(java.lang.String str2) {
                com.tencent.thumbplayer.utils.TPLogUtil.i(com.tencent.thumbplayer.adapter.player.systemplayer.TPSysPlayerExternalSubtitle.TAG, "onSubtitleNote");
                if (com.tencent.thumbplayer.adapter.player.systemplayer.TPSysPlayerExternalSubtitle.this.mSubLis != null) {
                    com.tencent.thumbplayer.adapter.player.systemplayer.TPSysPlayerExternalSubtitle.this.mSubLis.onSubtitleNote(str2);
                }
            }
        }, this.mSubtitleType);
        this.mState = com.tencent.thumbplayer.adapter.player.systemplayer.TPSysPlayerExternalSubtitle.SubtitleState.INITED;
    }
}
