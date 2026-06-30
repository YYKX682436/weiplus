package com.tencent.thumbplayer.tplayer;

/* loaded from: classes16.dex */
public class TPPlayerListeners implements com.tencent.thumbplayer.api.ITPPlayerListener.IOnPreparedListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnCompletionListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnInfoListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnErrorListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnSeekCompleteListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnVideoSizeChangedListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnSubtitleDataListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnSubtitleFrameOutListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnVideoFrameOutListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnAudioFrameOutputListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnVideoProcessFrameOutputListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnAudioProcessFrameOutputListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnStateChangeListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnStopAsyncCompleteListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnDetailInfoListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnDemuxerListener {
    private static final java.lang.String TAG = "TPPlayerListenerS";
    private com.tencent.thumbplayer.tplayer.TPPlayerListeners.TPPlayerListenersEmptyImpl EMPTY_LISTENERS;
    private com.tencent.thumbplayer.api.ITPPlayerListener.IOnAudioFrameOutputListener mOnAudioFrameOutListener;
    private com.tencent.thumbplayer.api.ITPPlayerListener.IOnAudioProcessFrameOutputListener mOnAudioProcessFrameOutListener;
    private com.tencent.thumbplayer.api.ITPPlayerListener.IOnCompletionListener mOnCompletionListener;
    private com.tencent.thumbplayer.api.ITPPlayerListener.IOnDemuxerListener mOnDemuxerListener;
    private com.tencent.thumbplayer.api.ITPPlayerListener.IOnDetailInfoListener mOnDetailInfoListener;
    private com.tencent.thumbplayer.api.ITPPlayerListener.IOnErrorListener mOnErrorListener;
    private com.tencent.thumbplayer.api.ITPPlayerListener.IOnInfoListener mOnInfoListener;
    private com.tencent.thumbplayer.api.ITPPlayerListener.IOnStateChangeListener mOnPlayerStateChangeListener;
    private com.tencent.thumbplayer.api.ITPPlayerListener.IOnPreparedListener mOnPreparedListener;
    private com.tencent.thumbplayer.api.ITPPlayerListener.IOnSeekCompleteListener mOnSeekCompleteListener;
    private com.tencent.thumbplayer.api.ITPPlayerListener.IOnStopAsyncCompleteListener mOnStopAsyncCompleteListener;
    private com.tencent.thumbplayer.api.ITPPlayerListener.IOnSubtitleDataListener mOnSubtitleDataListener;
    private com.tencent.thumbplayer.api.ITPPlayerListener.IOnSubtitleFrameOutListener mOnSubtitleFrameOutListener;
    private com.tencent.thumbplayer.api.ITPPlayerListener.IOnVideoFrameOutListener mOnVideoFrameOutListener;
    private com.tencent.thumbplayer.api.ITPPlayerListener.IOnVideoProcessFrameOutputListener mOnVideoProcessFrameOutListener;
    private com.tencent.thumbplayer.api.ITPPlayerListener.IOnVideoSizeChangedListener mOnVideoSizeChangedListener;
    private java.lang.String mTag = TAG;

    /* loaded from: classes16.dex */
    public static class TPPlayerListenersEmptyImpl implements com.tencent.thumbplayer.api.ITPPlayerListener.IOnPreparedListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnCompletionListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnInfoListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnErrorListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnSeekCompleteListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnVideoSizeChangedListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnSubtitleDataListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnSubtitleFrameOutListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnVideoFrameOutListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnAudioFrameOutputListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnVideoProcessFrameOutputListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnAudioProcessFrameOutputListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnStateChangeListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnStopAsyncCompleteListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnDetailInfoListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnDemuxerListener {
        private java.lang.String mTag;

        public TPPlayerListenersEmptyImpl(java.lang.String str) {
            this.mTag = str;
        }

        @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnAudioFrameOutputListener
        public void onAudioFrameOut(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer, com.tencent.thumbplayer.api.TPAudioFrameBuffer tPAudioFrameBuffer) {
            com.tencent.thumbplayer.utils.TPLogUtil.i(this.mTag, " empty player listener , notify , onAudioFrameOut");
        }

        @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnAudioProcessFrameOutputListener
        public com.tencent.thumbplayer.api.TPPostProcessFrameBuffer onAudioProcessFrameOut(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer, com.tencent.thumbplayer.api.TPPostProcessFrameBuffer tPPostProcessFrameBuffer) {
            com.tencent.thumbplayer.utils.TPLogUtil.i(this.mTag, " empty player listener , notify , onPostProcessFrameOut");
            return null;
        }

        @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnCompletionListener
        public void onCompletion(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer) {
            com.tencent.thumbplayer.utils.TPLogUtil.i(this.mTag, " empty player listener , notify , onCompletion");
        }

        @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnDetailInfoListener
        public void onDetailInfo(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer, com.tencent.thumbplayer.api.TPPlayerDetailInfo tPPlayerDetailInfo) {
            com.tencent.thumbplayer.utils.TPLogUtil.i(this.mTag, " empty player listener , notify , onDetailInfo");
        }

        @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnErrorListener
        public void onError(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer, int i17, int i18, long j17, long j18) {
            com.tencent.thumbplayer.utils.TPLogUtil.i(this.mTag, " empty player listener , notify , onError");
        }

        @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnInfoListener
        public void onInfo(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer, int i17, long j17, long j18, java.lang.Object obj) {
            com.tencent.thumbplayer.utils.TPLogUtil.i(this.mTag, " empty player listener , notify , onInfo");
        }

        @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnPreparedListener
        public void onPrepared(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer) {
            com.tencent.thumbplayer.utils.TPLogUtil.i(this.mTag, " empty player listener , notify , onPrepared");
        }

        @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnDemuxerListener
        public com.tencent.thumbplayer.api.TPRemoteSdpInfo onSdpExchange(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer, java.lang.String str, int i17) {
            com.tencent.thumbplayer.utils.TPLogUtil.i(this.mTag, " empty player listener , notify , onSdpExchange");
            return null;
        }

        @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnSeekCompleteListener
        public void onSeekComplete(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer) {
            com.tencent.thumbplayer.utils.TPLogUtil.i(this.mTag, " empty player listener , notify , onSeekComplete");
        }

        @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnStateChangeListener
        public void onStateChange(int i17, int i18) {
            com.tencent.thumbplayer.utils.TPLogUtil.i(this.mTag, " empty player listener , notify , onStateChange");
        }

        @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnStopAsyncCompleteListener
        public void onStopAsyncComplete(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer) {
            com.tencent.thumbplayer.utils.TPLogUtil.i(this.mTag, " empty player listener , notify , onStopAsyncComplete");
        }

        @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnSubtitleDataListener
        public void onSubtitleData(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer, com.tencent.thumbplayer.api.TPSubtitleData tPSubtitleData) {
            com.tencent.thumbplayer.utils.TPLogUtil.i(this.mTag, " empty player listener , notify , onSubtitleData");
        }

        @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnSubtitleFrameOutListener
        public void onSubtitleFrameOut(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer, com.tencent.thumbplayer.api.TPSubtitleFrameBuffer tPSubtitleFrameBuffer) {
            com.tencent.thumbplayer.utils.TPLogUtil.i(this.mTag, " empty player listener , notify , onSubtitleFrameOut");
        }

        @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnVideoFrameOutListener
        public void onVideoFrameOut(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer, com.tencent.thumbplayer.api.TPVideoFrameBuffer tPVideoFrameBuffer) {
            com.tencent.thumbplayer.utils.TPLogUtil.i(this.mTag, " empty player listener , notify , onVideoFrameOut");
        }

        @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnVideoProcessFrameOutputListener
        public com.tencent.thumbplayer.api.TPPostProcessFrameBuffer onVideoProcessFrameOut(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer, com.tencent.thumbplayer.api.TPPostProcessFrameBuffer tPPostProcessFrameBuffer) {
            com.tencent.thumbplayer.utils.TPLogUtil.i(this.mTag, " empty player listener , notify , onPostProcessFrameOut");
            return null;
        }

        @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnVideoSizeChangedListener
        public void onVideoSizeChanged(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer, long j17, long j18) {
            com.tencent.thumbplayer.utils.TPLogUtil.i(this.mTag, " empty player listener , notify , onVideoSizeChanged");
        }
    }

    public TPPlayerListeners(java.lang.String str) {
        updateTag(str);
        com.tencent.thumbplayer.tplayer.TPPlayerListeners.TPPlayerListenersEmptyImpl tPPlayerListenersEmptyImpl = new com.tencent.thumbplayer.tplayer.TPPlayerListeners.TPPlayerListenersEmptyImpl(this.mTag);
        this.EMPTY_LISTENERS = tPPlayerListenersEmptyImpl;
        this.mOnPreparedListener = tPPlayerListenersEmptyImpl;
        this.mOnCompletionListener = tPPlayerListenersEmptyImpl;
        this.mOnInfoListener = tPPlayerListenersEmptyImpl;
        this.mOnErrorListener = tPPlayerListenersEmptyImpl;
        this.mOnSeekCompleteListener = tPPlayerListenersEmptyImpl;
        this.mOnVideoSizeChangedListener = tPPlayerListenersEmptyImpl;
        this.mOnSubtitleDataListener = tPPlayerListenersEmptyImpl;
        this.mOnSubtitleFrameOutListener = tPPlayerListenersEmptyImpl;
        this.mOnVideoFrameOutListener = tPPlayerListenersEmptyImpl;
        this.mOnAudioFrameOutListener = tPPlayerListenersEmptyImpl;
        this.mOnVideoProcessFrameOutListener = tPPlayerListenersEmptyImpl;
        this.mOnAudioProcessFrameOutListener = tPPlayerListenersEmptyImpl;
        this.mOnPlayerStateChangeListener = tPPlayerListenersEmptyImpl;
        this.mOnStopAsyncCompleteListener = tPPlayerListenersEmptyImpl;
        this.mOnDetailInfoListener = tPPlayerListenersEmptyImpl;
        this.mOnDemuxerListener = tPPlayerListenersEmptyImpl;
    }

    public void clear() {
        com.tencent.thumbplayer.tplayer.TPPlayerListeners.TPPlayerListenersEmptyImpl tPPlayerListenersEmptyImpl = this.EMPTY_LISTENERS;
        this.mOnPreparedListener = tPPlayerListenersEmptyImpl;
        this.mOnCompletionListener = tPPlayerListenersEmptyImpl;
        this.mOnInfoListener = tPPlayerListenersEmptyImpl;
        this.mOnErrorListener = tPPlayerListenersEmptyImpl;
        this.mOnSeekCompleteListener = tPPlayerListenersEmptyImpl;
        this.mOnVideoSizeChangedListener = tPPlayerListenersEmptyImpl;
        this.mOnSubtitleDataListener = tPPlayerListenersEmptyImpl;
        this.mOnVideoFrameOutListener = tPPlayerListenersEmptyImpl;
        this.mOnAudioFrameOutListener = tPPlayerListenersEmptyImpl;
        this.mOnPlayerStateChangeListener = tPPlayerListenersEmptyImpl;
        this.mOnStopAsyncCompleteListener = tPPlayerListenersEmptyImpl;
        this.mOnDetailInfoListener = tPPlayerListenersEmptyImpl;
        this.mOnDemuxerListener = tPPlayerListenersEmptyImpl;
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnAudioFrameOutputListener
    public void onAudioFrameOut(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer, com.tencent.thumbplayer.api.TPAudioFrameBuffer tPAudioFrameBuffer) {
        this.mOnAudioFrameOutListener.onAudioFrameOut(iTPPlayer, tPAudioFrameBuffer);
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnAudioProcessFrameOutputListener
    public com.tencent.thumbplayer.api.TPPostProcessFrameBuffer onAudioProcessFrameOut(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer, com.tencent.thumbplayer.api.TPPostProcessFrameBuffer tPPostProcessFrameBuffer) {
        return this.mOnAudioProcessFrameOutListener.onAudioProcessFrameOut(iTPPlayer, tPPostProcessFrameBuffer);
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnCompletionListener
    public void onCompletion(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer) {
        this.mOnCompletionListener.onCompletion(iTPPlayer);
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnDetailInfoListener
    public void onDetailInfo(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer, com.tencent.thumbplayer.api.TPPlayerDetailInfo tPPlayerDetailInfo) {
        this.mOnDetailInfoListener.onDetailInfo(iTPPlayer, tPPlayerDetailInfo);
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnErrorListener
    public void onError(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer, int i17, int i18, long j17, long j18) {
        this.mOnErrorListener.onError(iTPPlayer, i17, i18, j17, j18);
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnInfoListener
    public void onInfo(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer, int i17, long j17, long j18, java.lang.Object obj) {
        this.mOnInfoListener.onInfo(iTPPlayer, i17, j17, j18, obj);
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnPreparedListener
    public void onPrepared(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer) {
        this.mOnPreparedListener.onPrepared(iTPPlayer);
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnDemuxerListener
    public com.tencent.thumbplayer.api.TPRemoteSdpInfo onSdpExchange(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer, java.lang.String str, int i17) {
        return this.mOnDemuxerListener.onSdpExchange(iTPPlayer, str, i17);
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnSeekCompleteListener
    public void onSeekComplete(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer) {
        this.mOnSeekCompleteListener.onSeekComplete(iTPPlayer);
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnStateChangeListener
    public void onStateChange(int i17, int i18) {
        this.mOnPlayerStateChangeListener.onStateChange(i17, i18);
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnStopAsyncCompleteListener
    public void onStopAsyncComplete(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer) {
        this.mOnStopAsyncCompleteListener.onStopAsyncComplete(iTPPlayer);
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnSubtitleDataListener
    public void onSubtitleData(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer, com.tencent.thumbplayer.api.TPSubtitleData tPSubtitleData) {
        this.mOnSubtitleDataListener.onSubtitleData(iTPPlayer, tPSubtitleData);
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnSubtitleFrameOutListener
    public void onSubtitleFrameOut(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer, com.tencent.thumbplayer.api.TPSubtitleFrameBuffer tPSubtitleFrameBuffer) {
        this.mOnSubtitleFrameOutListener.onSubtitleFrameOut(iTPPlayer, tPSubtitleFrameBuffer);
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnVideoFrameOutListener
    public void onVideoFrameOut(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer, com.tencent.thumbplayer.api.TPVideoFrameBuffer tPVideoFrameBuffer) {
        this.mOnVideoFrameOutListener.onVideoFrameOut(iTPPlayer, tPVideoFrameBuffer);
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnVideoProcessFrameOutputListener
    public com.tencent.thumbplayer.api.TPPostProcessFrameBuffer onVideoProcessFrameOut(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer, com.tencent.thumbplayer.api.TPPostProcessFrameBuffer tPPostProcessFrameBuffer) {
        return this.mOnVideoProcessFrameOutListener.onVideoProcessFrameOut(iTPPlayer, tPPostProcessFrameBuffer);
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnVideoSizeChangedListener
    public void onVideoSizeChanged(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer, long j17, long j18) {
        this.mOnVideoSizeChangedListener.onVideoSizeChanged(iTPPlayer, j17, j18);
    }

    public void setOnAudioPcmOutputListener(com.tencent.thumbplayer.api.ITPPlayerListener.IOnAudioFrameOutputListener iOnAudioFrameOutputListener) {
        if (iOnAudioFrameOutputListener == null) {
            iOnAudioFrameOutputListener = this.EMPTY_LISTENERS;
        }
        this.mOnAudioFrameOutListener = iOnAudioFrameOutputListener;
    }

    public void setOnAudioProcessOutputListener(com.tencent.thumbplayer.api.ITPPlayerListener.IOnAudioProcessFrameOutputListener iOnAudioProcessFrameOutputListener) {
        if (iOnAudioProcessFrameOutputListener == null) {
            iOnAudioProcessFrameOutputListener = this.EMPTY_LISTENERS;
        }
        this.mOnAudioProcessFrameOutListener = iOnAudioProcessFrameOutputListener;
    }

    public void setOnCompletionListener(com.tencent.thumbplayer.api.ITPPlayerListener.IOnCompletionListener iOnCompletionListener) {
        if (iOnCompletionListener == null) {
            iOnCompletionListener = this.EMPTY_LISTENERS;
        }
        this.mOnCompletionListener = iOnCompletionListener;
    }

    public void setOnDemuxerListener(com.tencent.thumbplayer.api.ITPPlayerListener.IOnDemuxerListener iOnDemuxerListener) {
        if (iOnDemuxerListener == null) {
            iOnDemuxerListener = this.EMPTY_LISTENERS;
        }
        this.mOnDemuxerListener = iOnDemuxerListener;
    }

    public void setOnDetailInfoListener(com.tencent.thumbplayer.api.ITPPlayerListener.IOnDetailInfoListener iOnDetailInfoListener) {
        if (iOnDetailInfoListener == null) {
            iOnDetailInfoListener = this.EMPTY_LISTENERS;
        }
        this.mOnDetailInfoListener = iOnDetailInfoListener;
    }

    public void setOnErrorListener(com.tencent.thumbplayer.api.ITPPlayerListener.IOnErrorListener iOnErrorListener) {
        if (iOnErrorListener == null) {
            iOnErrorListener = this.EMPTY_LISTENERS;
        }
        this.mOnErrorListener = iOnErrorListener;
    }

    public void setOnInfoListener(com.tencent.thumbplayer.api.ITPPlayerListener.IOnInfoListener iOnInfoListener) {
        if (iOnInfoListener == null) {
            iOnInfoListener = this.EMPTY_LISTENERS;
        }
        this.mOnInfoListener = iOnInfoListener;
    }

    public void setOnPlayerStateChangeListener(com.tencent.thumbplayer.api.ITPPlayerListener.IOnStateChangeListener iOnStateChangeListener) {
        if (iOnStateChangeListener == null) {
            iOnStateChangeListener = this.EMPTY_LISTENERS;
        }
        this.mOnPlayerStateChangeListener = iOnStateChangeListener;
    }

    public void setOnPreparedListener(com.tencent.thumbplayer.api.ITPPlayerListener.IOnPreparedListener iOnPreparedListener) {
        if (iOnPreparedListener == null) {
            iOnPreparedListener = this.EMPTY_LISTENERS;
        }
        this.mOnPreparedListener = iOnPreparedListener;
    }

    public void setOnSeekCompleteListener(com.tencent.thumbplayer.api.ITPPlayerListener.IOnSeekCompleteListener iOnSeekCompleteListener) {
        if (iOnSeekCompleteListener == null) {
            iOnSeekCompleteListener = this.EMPTY_LISTENERS;
        }
        this.mOnSeekCompleteListener = iOnSeekCompleteListener;
    }

    public void setOnStopAsyncCompleteListener(com.tencent.thumbplayer.api.ITPPlayerListener.IOnStopAsyncCompleteListener iOnStopAsyncCompleteListener) {
        if (iOnStopAsyncCompleteListener == null) {
            iOnStopAsyncCompleteListener = this.EMPTY_LISTENERS;
        }
        this.mOnStopAsyncCompleteListener = iOnStopAsyncCompleteListener;
    }

    public void setOnSubtitleDataListener(com.tencent.thumbplayer.api.ITPPlayerListener.IOnSubtitleDataListener iOnSubtitleDataListener) {
        if (iOnSubtitleDataListener == null) {
            iOnSubtitleDataListener = this.EMPTY_LISTENERS;
        }
        this.mOnSubtitleDataListener = iOnSubtitleDataListener;
    }

    public void setOnSubtitleFrameOutListener(com.tencent.thumbplayer.api.ITPPlayerListener.IOnSubtitleFrameOutListener iOnSubtitleFrameOutListener) {
        if (iOnSubtitleFrameOutListener == null) {
            iOnSubtitleFrameOutListener = this.EMPTY_LISTENERS;
        }
        this.mOnSubtitleFrameOutListener = iOnSubtitleFrameOutListener;
    }

    public void setOnVideoFrameOutListener(com.tencent.thumbplayer.api.ITPPlayerListener.IOnVideoFrameOutListener iOnVideoFrameOutListener) {
        if (iOnVideoFrameOutListener == null) {
            iOnVideoFrameOutListener = this.EMPTY_LISTENERS;
        }
        this.mOnVideoFrameOutListener = iOnVideoFrameOutListener;
    }

    public void setOnVideoProcessOutputListener(com.tencent.thumbplayer.api.ITPPlayerListener.IOnVideoProcessFrameOutputListener iOnVideoProcessFrameOutputListener) {
        if (iOnVideoProcessFrameOutputListener == null) {
            iOnVideoProcessFrameOutputListener = this.EMPTY_LISTENERS;
        }
        this.mOnVideoProcessFrameOutListener = iOnVideoProcessFrameOutputListener;
    }

    public void setOnVideoSizeChangedListener(com.tencent.thumbplayer.api.ITPPlayerListener.IOnVideoSizeChangedListener iOnVideoSizeChangedListener) {
        if (iOnVideoSizeChangedListener == null) {
            iOnVideoSizeChangedListener = this.EMPTY_LISTENERS;
        }
        this.mOnVideoSizeChangedListener = iOnVideoSizeChangedListener;
    }

    public void updateTag(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            this.mTag = TAG;
        } else {
            this.mTag = str;
        }
        com.tencent.thumbplayer.tplayer.TPPlayerListeners.TPPlayerListenersEmptyImpl tPPlayerListenersEmptyImpl = this.EMPTY_LISTENERS;
        if (tPPlayerListenersEmptyImpl != null) {
            tPPlayerListenersEmptyImpl.mTag = str;
        }
    }
}
