package com.tencent.thumbplayer.adapter.player;

/* loaded from: classes16.dex */
public class ITPPlayerBaseListener {

    /* loaded from: classes16.dex */
    public interface IOnAudioPcmOutListener {
        void onAudioPcmOut(com.tencent.thumbplayer.api.TPAudioFrameBuffer tPAudioFrameBuffer);
    }

    /* loaded from: classes16.dex */
    public interface IOnAudioProcessOutListener {
        com.tencent.thumbplayer.api.TPPostProcessFrameBuffer onAudioProcessFrameOut(com.tencent.thumbplayer.api.TPPostProcessFrameBuffer tPPostProcessFrameBuffer);
    }

    /* loaded from: classes16.dex */
    public interface IOnCompletionListener {
        void onCompletion();
    }

    /* loaded from: classes16.dex */
    public interface IOnDemuxerListener {
        com.tencent.thumbplayer.api.TPRemoteSdpInfo onSdpExchange(java.lang.String str, int i17);
    }

    /* loaded from: classes16.dex */
    public interface IOnDetailInfoListener {
        void onDetailInfo(com.tencent.thumbplayer.api.TPPlayerDetailInfo tPPlayerDetailInfo);
    }

    /* loaded from: classes16.dex */
    public interface IOnErrorListener {
        void onError(@com.tencent.thumbplayer.api.TPCommonEnum.TPErrorType int i17, int i18, long j17, long j18);
    }

    /* loaded from: classes16.dex */
    public interface IOnEventRecordListener {
        void onDrmInfo(com.tencent.thumbplayer.api.TPDrmInfo tPDrmInfo);
    }

    /* loaded from: classes16.dex */
    public interface IOnInfoListener {
        void onInfo(int i17, long j17, long j18, java.lang.Object obj);
    }

    /* loaded from: classes16.dex */
    public interface IOnPreparedListener {
        void onPrepared();
    }

    /* loaded from: classes16.dex */
    public interface IOnSeekCompleteListener {
        void onSeekComplete();
    }

    /* loaded from: classes16.dex */
    public interface IOnStateChangeListener {
        void onStateChange(int i17, int i18);
    }

    /* loaded from: classes16.dex */
    public interface IOnSubtitleDataListener {
        void onSubtitleData(com.tencent.thumbplayer.api.TPSubtitleData tPSubtitleData);
    }

    /* loaded from: classes16.dex */
    public interface IOnSubtitleFrameOutListener {
        void onSubtitleFrameOut(com.tencent.thumbplayer.api.TPSubtitleFrameBuffer tPSubtitleFrameBuffer);
    }

    /* loaded from: classes16.dex */
    public interface IOnVideoFrameOutListener {
        void onVideoFrameOut(com.tencent.thumbplayer.api.TPVideoFrameBuffer tPVideoFrameBuffer);
    }

    /* loaded from: classes16.dex */
    public interface IOnVideoProcessOutListener {
        com.tencent.thumbplayer.api.TPPostProcessFrameBuffer onVideoProcessFrameOut(com.tencent.thumbplayer.api.TPPostProcessFrameBuffer tPPostProcessFrameBuffer);
    }

    /* loaded from: classes16.dex */
    public interface IOnVideoSizeChangedListener {
        void onVideoSizeChanged(long j17, long j18);
    }
}
