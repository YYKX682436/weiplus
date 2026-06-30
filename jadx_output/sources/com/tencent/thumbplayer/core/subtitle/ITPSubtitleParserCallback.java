package com.tencent.thumbplayer.core.subtitle;

/* loaded from: classes16.dex */
public interface ITPSubtitleParserCallback {
    long onGetCurrentPlayPositionMs();

    void onLoadResult(int i17);

    void onSelectResult(int i17, long j17);

    void onSubtitleError(int i17, int i18);

    void onSubtitleFrame(com.tencent.thumbplayer.core.common.TPSubtitleFrame tPSubtitleFrame);

    void onSubtitleNote(java.lang.String str);
}
