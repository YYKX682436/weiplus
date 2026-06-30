package com.tencent.thumbplayer.adapter.player.systemplayer;

/* loaded from: classes16.dex */
public interface ITPSysPlayerExternalSubtitle {

    /* loaded from: classes16.dex */
    public interface IOnSubTitleListener {
        void onEventInfo();

        void onSubtitleFrameData(com.tencent.thumbplayer.core.common.TPSubtitleFrame tPSubtitleFrame);

        void onSubtitleInfo(com.tencent.thumbplayer.adapter.player.systemplayer.ITPSysPlayerExternalSubtitle.SubtitleData subtitleData);

        void onSubtitleNote(java.lang.String str);
    }

    /* loaded from: classes16.dex */
    public interface IOnSubtitleErrorListener {
        void onSubtitleError(int i17, int i18);
    }

    /* loaded from: classes16.dex */
    public interface IOnTrackSelectListener {
        void onTrackSelectFailure(int i17, long j17);

        void onTrackSelectSuccess(long j17);
    }

    /* loaded from: classes16.dex */
    public interface IPlayPositionListener {
        long getCurrentPosition();
    }

    /* loaded from: classes16.dex */
    public static class SubtitleData {
        java.lang.String text;

        public SubtitleData(java.lang.String str) {
            this.text = str;
        }
    }

    void pauseAsync();

    void prepare();

    void release();

    void reset();

    void setDataSource(java.lang.String str, long j17);

    void setDataSource(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, long j17);

    void setOnSubTitleListener(com.tencent.thumbplayer.adapter.player.systemplayer.ITPSysPlayerExternalSubtitle.IOnSubTitleListener iOnSubTitleListener);

    void setPlayerPositionListener(com.tencent.thumbplayer.adapter.player.systemplayer.ITPSysPlayerExternalSubtitle.IPlayPositionListener iPlayPositionListener);

    void setSubtitleErrorListener(com.tencent.thumbplayer.adapter.player.systemplayer.ITPSysPlayerExternalSubtitle.IOnSubtitleErrorListener iOnSubtitleErrorListener);

    void setSubtitleRenderModel(com.tencent.thumbplayer.api.TPSubtitleRenderModel tPSubtitleRenderModel);

    void setSubtitleType(int i17);

    void setTrackSelectListener(com.tencent.thumbplayer.adapter.player.systemplayer.ITPSysPlayerExternalSubtitle.IOnTrackSelectListener iOnTrackSelectListener);

    void startAsync();

    void stop();
}
