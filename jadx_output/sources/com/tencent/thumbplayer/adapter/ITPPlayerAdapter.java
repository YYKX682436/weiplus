package com.tencent.thumbplayer.adapter;

/* loaded from: classes16.dex */
public interface ITPPlayerAdapter extends com.tencent.thumbplayer.adapter.player.ITPPlayerBase {
    int getCurrentPlayClipNo();

    int getCurrentState();

    com.tencent.thumbplayer.adapter.TPPlaybackInfo getPlaybackInfo();

    int getPlayerType();

    boolean isPlaying();

    void reopenPlayer();

    void setDataSource(com.tencent.thumbplayer.adapter.player.TPUrlDataSource tPUrlDataSource);

    void setDataSource(com.tencent.thumbplayer.adapter.player.TPUrlDataSource tPUrlDataSource, java.util.Map<java.lang.String, java.lang.String> map);

    void setOnPlayerStateChangeListener(com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnStateChangeListener iOnStateChangeListener);

    void setRichMediaSynchronizer(com.tencent.thumbplayer.api.richmedia.ITPRichMediaSynchronizer iTPRichMediaSynchronizer);

    void setVideoInfo(com.tencent.thumbplayer.api.TPVideoInfo tPVideoInfo);

    void switchDefinition(com.tencent.thumbplayer.adapter.player.TPUrlDataSource tPUrlDataSource, int i17, long j17);

    void switchDefinition(com.tencent.thumbplayer.adapter.player.TPUrlDataSource tPUrlDataSource, java.util.Map<java.lang.String, java.lang.String> map, int i17, long j17);

    void updateVideoInfo(com.tencent.thumbplayer.api.TPVideoInfo tPVideoInfo);
}
