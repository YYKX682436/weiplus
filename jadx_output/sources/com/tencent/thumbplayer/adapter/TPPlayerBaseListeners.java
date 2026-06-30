package com.tencent.thumbplayer.adapter;

/* loaded from: classes16.dex */
public class TPPlayerBaseListeners implements com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnPreparedListener, com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnCompletionListener, com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnInfoListener, com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnErrorListener, com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnSeekCompleteListener, com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnVideoSizeChangedListener, com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnSubtitleDataListener, com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnSubtitleFrameOutListener, com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnVideoFrameOutListener, com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnAudioPcmOutListener, com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnVideoProcessOutListener, com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnAudioProcessOutListener, com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnStateChangeListener, com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnDetailInfoListener, com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnEventRecordListener, com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnDemuxerListener {
    private static final java.lang.String TAG = "TPPlayerListenerS";
    private com.tencent.thumbplayer.adapter.TPPlayerBaseListeners.TPPlayerListenersEmptyImpl EMPTY_LISTENERS;
    private com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnAudioPcmOutListener mOnAudioFrameOutListener;
    private com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnAudioProcessOutListener mOnAudioProcessFrameOutListener;
    private com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnCompletionListener mOnCompletionListener;
    private com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnDemuxerListener mOnDemuxerListener;
    private com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnDetailInfoListener mOnDetailInfoListener;
    private com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnErrorListener mOnErrorListener;
    private com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnEventRecordListener mOnEventRecordListener;
    private com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnInfoListener mOnInfoListener;
    private com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnPreparedListener mOnPreparedListener;
    private com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnSeekCompleteListener mOnSeekCompleteListener;
    private com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnStateChangeListener mOnStateChangeListener;
    private com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnSubtitleDataListener mOnSubtitleDataListener;
    private com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnSubtitleFrameOutListener mOnSubtitleFrameOutListener;
    private com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnVideoFrameOutListener mOnVideoFrameOutListener;
    private com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnVideoProcessOutListener mOnVideoProcessFrameOutListener;
    private com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnVideoSizeChangedListener mOnVideoSizeChangedListener;
    private java.lang.String mTag = TAG;

    /* loaded from: classes16.dex */
    public static class TPPlayerListenersEmptyImpl implements com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnPreparedListener, com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnCompletionListener, com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnInfoListener, com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnErrorListener, com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnSeekCompleteListener, com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnVideoSizeChangedListener, com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnSubtitleDataListener, com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnSubtitleFrameOutListener, com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnVideoFrameOutListener, com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnAudioPcmOutListener, com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnVideoProcessOutListener, com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnAudioProcessOutListener, com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnStateChangeListener, com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnDetailInfoListener, com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnEventRecordListener, com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnDemuxerListener {
        private java.lang.String mTag;

        public TPPlayerListenersEmptyImpl(java.lang.String str) {
            this.mTag = str;
        }

        @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnAudioPcmOutListener
        public void onAudioPcmOut(com.tencent.thumbplayer.api.TPAudioFrameBuffer tPAudioFrameBuffer) {
            com.tencent.thumbplayer.utils.TPLogUtil.i(this.mTag, " empty base listener , notify , onAudioFrameOut");
        }

        @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnAudioProcessOutListener
        public com.tencent.thumbplayer.api.TPPostProcessFrameBuffer onAudioProcessFrameOut(com.tencent.thumbplayer.api.TPPostProcessFrameBuffer tPPostProcessFrameBuffer) {
            com.tencent.thumbplayer.utils.TPLogUtil.i(this.mTag, " empty base listener , notify , onAudioProcessFrameOut");
            return null;
        }

        @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnCompletionListener
        public void onCompletion() {
            com.tencent.thumbplayer.utils.TPLogUtil.i(this.mTag, " empty base listener , notify , onCompletion");
        }

        @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnDetailInfoListener
        public void onDetailInfo(com.tencent.thumbplayer.api.TPPlayerDetailInfo tPPlayerDetailInfo) {
            com.tencent.thumbplayer.utils.TPLogUtil.i(this.mTag, " empty base listener , notify , onDetailInfo");
        }

        @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnEventRecordListener
        public void onDrmInfo(com.tencent.thumbplayer.api.TPDrmInfo tPDrmInfo) {
            com.tencent.thumbplayer.utils.TPLogUtil.i(this.mTag, " empty base listener , notify , onEventRecord");
        }

        @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnErrorListener
        public void onError(int i17, int i18, long j17, long j18) {
            com.tencent.thumbplayer.utils.TPLogUtil.i(this.mTag, " empty base listener , notify , onError");
        }

        @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnInfoListener
        public void onInfo(int i17, long j17, long j18, java.lang.Object obj) {
            com.tencent.thumbplayer.utils.TPLogUtil.i(this.mTag, " empty base listener , notify , onInfo");
        }

        @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnPreparedListener
        public void onPrepared() {
            com.tencent.thumbplayer.utils.TPLogUtil.i(this.mTag, " empty base listener , notify , onPrepared");
        }

        @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnDemuxerListener
        public com.tencent.thumbplayer.api.TPRemoteSdpInfo onSdpExchange(java.lang.String str, int i17) {
            com.tencent.thumbplayer.utils.TPLogUtil.i(this.mTag, " empty base listener , notify , onSdpExchange");
            return null;
        }

        @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnSeekCompleteListener
        public void onSeekComplete() {
            com.tencent.thumbplayer.utils.TPLogUtil.i(this.mTag, " empty base listener , notify , onSeekComplete");
        }

        @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnStateChangeListener
        public void onStateChange(int i17, int i18) {
            com.tencent.thumbplayer.utils.TPLogUtil.i(this.mTag, " empty base listener , notify , onStateChange");
        }

        @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnSubtitleDataListener
        public void onSubtitleData(com.tencent.thumbplayer.api.TPSubtitleData tPSubtitleData) {
            com.tencent.thumbplayer.utils.TPLogUtil.i(this.mTag, " empty base listener , notify , onSubtitleData");
        }

        @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnSubtitleFrameOutListener
        public void onSubtitleFrameOut(com.tencent.thumbplayer.api.TPSubtitleFrameBuffer tPSubtitleFrameBuffer) {
            com.tencent.thumbplayer.utils.TPLogUtil.i(this.mTag, " empty base listener , notify , TPSubtitleFrameBuffer");
        }

        @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnVideoFrameOutListener
        public void onVideoFrameOut(com.tencent.thumbplayer.api.TPVideoFrameBuffer tPVideoFrameBuffer) {
            com.tencent.thumbplayer.utils.TPLogUtil.i(this.mTag, " empty base listener , notify , onVideoFrameOut");
        }

        @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnVideoProcessOutListener
        public com.tencent.thumbplayer.api.TPPostProcessFrameBuffer onVideoProcessFrameOut(com.tencent.thumbplayer.api.TPPostProcessFrameBuffer tPPostProcessFrameBuffer) {
            com.tencent.thumbplayer.utils.TPLogUtil.i(this.mTag, " empty base listener , notify , onVideoProcessFrameOut");
            return null;
        }

        @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnVideoSizeChangedListener
        public void onVideoSizeChanged(long j17, long j18) {
            com.tencent.thumbplayer.utils.TPLogUtil.i(this.mTag, " empty base listener , notify , onVideoSizeChanged");
        }
    }

    public TPPlayerBaseListeners(java.lang.String str) {
        updateTag(str);
        com.tencent.thumbplayer.adapter.TPPlayerBaseListeners.TPPlayerListenersEmptyImpl tPPlayerListenersEmptyImpl = new com.tencent.thumbplayer.adapter.TPPlayerBaseListeners.TPPlayerListenersEmptyImpl(this.mTag);
        this.EMPTY_LISTENERS = tPPlayerListenersEmptyImpl;
        this.mOnPreparedListener = tPPlayerListenersEmptyImpl;
        this.mOnCompletionListener = tPPlayerListenersEmptyImpl;
        this.mOnInfoListener = tPPlayerListenersEmptyImpl;
        this.mOnErrorListener = tPPlayerListenersEmptyImpl;
        this.mOnSeekCompleteListener = tPPlayerListenersEmptyImpl;
        this.mOnVideoSizeChangedListener = tPPlayerListenersEmptyImpl;
        this.mOnSubtitleDataListener = tPPlayerListenersEmptyImpl;
        this.mOnVideoFrameOutListener = tPPlayerListenersEmptyImpl;
        this.mOnAudioFrameOutListener = tPPlayerListenersEmptyImpl;
        this.mOnSubtitleFrameOutListener = tPPlayerListenersEmptyImpl;
        this.mOnVideoProcessFrameOutListener = tPPlayerListenersEmptyImpl;
        this.mOnAudioProcessFrameOutListener = tPPlayerListenersEmptyImpl;
        this.mOnStateChangeListener = tPPlayerListenersEmptyImpl;
        this.mOnDetailInfoListener = tPPlayerListenersEmptyImpl;
        this.mOnEventRecordListener = tPPlayerListenersEmptyImpl;
        this.mOnDemuxerListener = tPPlayerListenersEmptyImpl;
    }

    public void clear() {
        com.tencent.thumbplayer.adapter.TPPlayerBaseListeners.TPPlayerListenersEmptyImpl tPPlayerListenersEmptyImpl = this.EMPTY_LISTENERS;
        this.mOnPreparedListener = tPPlayerListenersEmptyImpl;
        this.mOnCompletionListener = tPPlayerListenersEmptyImpl;
        this.mOnInfoListener = tPPlayerListenersEmptyImpl;
        this.mOnErrorListener = tPPlayerListenersEmptyImpl;
        this.mOnSeekCompleteListener = tPPlayerListenersEmptyImpl;
        this.mOnVideoSizeChangedListener = tPPlayerListenersEmptyImpl;
        this.mOnSubtitleDataListener = tPPlayerListenersEmptyImpl;
        this.mOnVideoFrameOutListener = tPPlayerListenersEmptyImpl;
        this.mOnAudioFrameOutListener = tPPlayerListenersEmptyImpl;
        this.mOnSubtitleFrameOutListener = tPPlayerListenersEmptyImpl;
        this.mOnStateChangeListener = tPPlayerListenersEmptyImpl;
        this.mOnVideoProcessFrameOutListener = tPPlayerListenersEmptyImpl;
        this.mOnAudioProcessFrameOutListener = tPPlayerListenersEmptyImpl;
        this.mOnDetailInfoListener = tPPlayerListenersEmptyImpl;
        this.mOnEventRecordListener = tPPlayerListenersEmptyImpl;
        this.mOnDemuxerListener = tPPlayerListenersEmptyImpl;
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnAudioPcmOutListener
    public void onAudioPcmOut(com.tencent.thumbplayer.api.TPAudioFrameBuffer tPAudioFrameBuffer) {
        this.mOnAudioFrameOutListener.onAudioPcmOut(tPAudioFrameBuffer);
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnAudioProcessOutListener
    public com.tencent.thumbplayer.api.TPPostProcessFrameBuffer onAudioProcessFrameOut(com.tencent.thumbplayer.api.TPPostProcessFrameBuffer tPPostProcessFrameBuffer) {
        return this.mOnAudioProcessFrameOutListener.onAudioProcessFrameOut(tPPostProcessFrameBuffer);
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnCompletionListener
    public void onCompletion() {
        this.mOnCompletionListener.onCompletion();
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnDetailInfoListener
    public void onDetailInfo(com.tencent.thumbplayer.api.TPPlayerDetailInfo tPPlayerDetailInfo) {
        this.mOnDetailInfoListener.onDetailInfo(tPPlayerDetailInfo);
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnEventRecordListener
    public void onDrmInfo(com.tencent.thumbplayer.api.TPDrmInfo tPDrmInfo) {
        this.mOnEventRecordListener.onDrmInfo(tPDrmInfo);
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnErrorListener
    public void onError(@com.tencent.thumbplayer.api.TPCommonEnum.TPErrorType int i17, int i18, long j17, long j18) {
        this.mOnErrorListener.onError(i17, i18, j17, j18);
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnInfoListener
    public void onInfo(int i17, long j17, long j18, java.lang.Object obj) {
        this.mOnInfoListener.onInfo(i17, j17, j18, obj);
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnPreparedListener
    public void onPrepared() {
        this.mOnPreparedListener.onPrepared();
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnDemuxerListener
    public com.tencent.thumbplayer.api.TPRemoteSdpInfo onSdpExchange(java.lang.String str, int i17) {
        return this.mOnDemuxerListener.onSdpExchange(str, i17);
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnSeekCompleteListener
    public void onSeekComplete() {
        this.mOnSeekCompleteListener.onSeekComplete();
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnStateChangeListener
    public void onStateChange(int i17, int i18) {
        this.mOnStateChangeListener.onStateChange(i17, i18);
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnSubtitleDataListener
    public void onSubtitleData(com.tencent.thumbplayer.api.TPSubtitleData tPSubtitleData) {
        this.mOnSubtitleDataListener.onSubtitleData(tPSubtitleData);
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnSubtitleFrameOutListener
    public void onSubtitleFrameOut(com.tencent.thumbplayer.api.TPSubtitleFrameBuffer tPSubtitleFrameBuffer) {
        this.mOnSubtitleFrameOutListener.onSubtitleFrameOut(tPSubtitleFrameBuffer);
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnVideoFrameOutListener
    public void onVideoFrameOut(com.tencent.thumbplayer.api.TPVideoFrameBuffer tPVideoFrameBuffer) {
        this.mOnVideoFrameOutListener.onVideoFrameOut(tPVideoFrameBuffer);
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnVideoProcessOutListener
    public com.tencent.thumbplayer.api.TPPostProcessFrameBuffer onVideoProcessFrameOut(com.tencent.thumbplayer.api.TPPostProcessFrameBuffer tPPostProcessFrameBuffer) {
        return this.mOnVideoProcessFrameOutListener.onVideoProcessFrameOut(tPPostProcessFrameBuffer);
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnVideoSizeChangedListener
    public void onVideoSizeChanged(long j17, long j18) {
        this.mOnVideoSizeChangedListener.onVideoSizeChanged(j17, j18);
    }

    public void setOnAudioPcmOutListener(com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnAudioPcmOutListener iOnAudioPcmOutListener) {
        if (iOnAudioPcmOutListener == null) {
            iOnAudioPcmOutListener = this.EMPTY_LISTENERS;
        }
        this.mOnAudioFrameOutListener = iOnAudioPcmOutListener;
    }

    public void setOnAudioProcessFrameListener(com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnAudioProcessOutListener iOnAudioProcessOutListener) {
        if (iOnAudioProcessOutListener == null) {
            iOnAudioProcessOutListener = this.EMPTY_LISTENERS;
        }
        this.mOnAudioProcessFrameOutListener = iOnAudioProcessOutListener;
    }

    public void setOnCompletionListener(com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnCompletionListener iOnCompletionListener) {
        if (iOnCompletionListener == null) {
            iOnCompletionListener = this.EMPTY_LISTENERS;
        }
        this.mOnCompletionListener = iOnCompletionListener;
    }

    public void setOnDemuxerListener(com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnDemuxerListener iOnDemuxerListener) {
        if (iOnDemuxerListener == null) {
            iOnDemuxerListener = this.EMPTY_LISTENERS;
        }
        this.mOnDemuxerListener = iOnDemuxerListener;
    }

    public void setOnDetailInfoListener(com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnDetailInfoListener iOnDetailInfoListener) {
        if (iOnDetailInfoListener == null) {
            iOnDetailInfoListener = this.EMPTY_LISTENERS;
        }
        this.mOnDetailInfoListener = iOnDetailInfoListener;
    }

    public void setOnErrorListener(com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnErrorListener iOnErrorListener) {
        if (iOnErrorListener == null) {
            iOnErrorListener = this.EMPTY_LISTENERS;
        }
        this.mOnErrorListener = iOnErrorListener;
    }

    public void setOnEventRecordListener(com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnEventRecordListener iOnEventRecordListener) {
        if (iOnEventRecordListener == null) {
            iOnEventRecordListener = this.EMPTY_LISTENERS;
        }
        this.mOnEventRecordListener = iOnEventRecordListener;
    }

    public void setOnInfoListener(com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnInfoListener iOnInfoListener) {
        if (iOnInfoListener == null) {
            iOnInfoListener = this.EMPTY_LISTENERS;
        }
        this.mOnInfoListener = iOnInfoListener;
    }

    public void setOnPreparedListener(com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnPreparedListener iOnPreparedListener) {
        if (iOnPreparedListener == null) {
            iOnPreparedListener = this.EMPTY_LISTENERS;
        }
        this.mOnPreparedListener = iOnPreparedListener;
    }

    public void setOnSeekCompleteListener(com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnSeekCompleteListener iOnSeekCompleteListener) {
        if (iOnSeekCompleteListener == null) {
            iOnSeekCompleteListener = this.EMPTY_LISTENERS;
        }
        this.mOnSeekCompleteListener = iOnSeekCompleteListener;
    }

    public void setOnStateChangeListener(com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnStateChangeListener iOnStateChangeListener) {
        if (iOnStateChangeListener == null) {
            iOnStateChangeListener = this.EMPTY_LISTENERS;
        }
        this.mOnStateChangeListener = iOnStateChangeListener;
    }

    public void setOnSubtitleDataListener(com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnSubtitleDataListener iOnSubtitleDataListener) {
        if (iOnSubtitleDataListener == null) {
            iOnSubtitleDataListener = this.EMPTY_LISTENERS;
        }
        this.mOnSubtitleDataListener = iOnSubtitleDataListener;
    }

    public void setOnSubtitleFrameOutListener(com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnSubtitleFrameOutListener iOnSubtitleFrameOutListener) {
        if (iOnSubtitleFrameOutListener == null) {
            iOnSubtitleFrameOutListener = this.EMPTY_LISTENERS;
        }
        this.mOnSubtitleFrameOutListener = iOnSubtitleFrameOutListener;
    }

    public void setOnVideoFrameOutListener(com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnVideoFrameOutListener iOnVideoFrameOutListener) {
        if (iOnVideoFrameOutListener == null) {
            iOnVideoFrameOutListener = this.EMPTY_LISTENERS;
        }
        this.mOnVideoFrameOutListener = iOnVideoFrameOutListener;
    }

    public void setOnVideoProcessFrameListener(com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnVideoProcessOutListener iOnVideoProcessOutListener) {
        if (iOnVideoProcessOutListener == null) {
            iOnVideoProcessOutListener = this.EMPTY_LISTENERS;
        }
        this.mOnVideoProcessFrameOutListener = iOnVideoProcessOutListener;
    }

    public void setOnVideoSizeChangedListener(com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnVideoSizeChangedListener iOnVideoSizeChangedListener) {
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
        com.tencent.thumbplayer.adapter.TPPlayerBaseListeners.TPPlayerListenersEmptyImpl tPPlayerListenersEmptyImpl = this.EMPTY_LISTENERS;
        if (tPPlayerListenersEmptyImpl != null) {
            tPPlayerListenersEmptyImpl.mTag = this.mTag;
        }
    }
}
