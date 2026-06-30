package com.tencent.thumbplayer.api;

/* loaded from: classes15.dex */
public class ITPPlayerListener {

    /* loaded from: classes16.dex */
    public interface IOnAudioFrameOutputListener {
        void onAudioFrameOut(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer, com.tencent.thumbplayer.api.TPAudioFrameBuffer tPAudioFrameBuffer);
    }

    /* loaded from: classes14.dex */
    public interface IOnAudioProcessFrameOutputListener {
        com.tencent.thumbplayer.api.TPPostProcessFrameBuffer onAudioProcessFrameOut(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer, com.tencent.thumbplayer.api.TPPostProcessFrameBuffer tPPostProcessFrameBuffer);
    }

    /* loaded from: classes4.dex */
    public interface IOnCompletionListener {
        void onCompletion(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer);
    }

    /* loaded from: classes16.dex */
    public interface IOnDemuxerListener {
        com.tencent.thumbplayer.api.TPRemoteSdpInfo onSdpExchange(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer, java.lang.String str, int i17);
    }

    /* loaded from: classes15.dex */
    public interface IOnDetailInfoListener {
        void onDetailInfo(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer, com.tencent.thumbplayer.api.TPPlayerDetailInfo tPPlayerDetailInfo);
    }

    /* loaded from: classes4.dex */
    public interface IOnErrorListener {
        void onError(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer, int i17, int i18, long j17, long j18);
    }

    /* loaded from: classes4.dex */
    public interface IOnInfoListener {
        void onInfo(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer, int i17, long j17, long j18, java.lang.Object obj);
    }

    /* loaded from: classes14.dex */
    public interface IOnPreparedListener {
        void onPrepared(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer);
    }

    /* loaded from: classes4.dex */
    public interface IOnSeekCompleteListener {
        void onSeekComplete(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer);
    }

    /* loaded from: classes4.dex */
    public interface IOnStateChangeListener {
        void onStateChange(int i17, int i18);
    }

    /* loaded from: classes15.dex */
    public interface IOnStopAsyncCompleteListener {
        void onStopAsyncComplete(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer);
    }

    /* loaded from: classes16.dex */
    public interface IOnSubtitleDataListener {
        void onSubtitleData(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer, com.tencent.thumbplayer.api.TPSubtitleData tPSubtitleData);
    }

    /* loaded from: classes16.dex */
    public interface IOnSubtitleFrameOutListener {
        void onSubtitleFrameOut(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer, com.tencent.thumbplayer.api.TPSubtitleFrameBuffer tPSubtitleFrameBuffer);
    }

    /* loaded from: classes16.dex */
    public interface IOnVideoFrameOutListener {
        void onVideoFrameOut(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer, com.tencent.thumbplayer.api.TPVideoFrameBuffer tPVideoFrameBuffer);
    }

    /* loaded from: classes16.dex */
    public interface IOnVideoProcessFrameOutputListener {
        com.tencent.thumbplayer.api.TPPostProcessFrameBuffer onVideoProcessFrameOut(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer, com.tencent.thumbplayer.api.TPPostProcessFrameBuffer tPPostProcessFrameBuffer);
    }

    /* loaded from: classes4.dex */
    public interface IOnVideoSizeChangedListener {
        void onVideoSizeChanged(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer, long j17, long j18);
    }
}
