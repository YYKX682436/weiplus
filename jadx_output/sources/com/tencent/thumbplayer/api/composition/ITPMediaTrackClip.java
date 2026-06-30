package com.tencent.thumbplayer.api.composition;

/* loaded from: classes16.dex */
public interface ITPMediaTrackClip extends com.tencent.thumbplayer.api.composition.ITPMediaAsset {
    com.tencent.thumbplayer.api.composition.ITPMediaTrackClip clone(int i17);

    int getClipId();

    long getEndTimeMs();

    java.lang.String getFilePath();

    long getOriginalDurationMs();

    long getStartPositionMs();

    long getStartTimeMs();

    void setCutTimeRange(long j17, long j18);

    void setOriginalDurationMs(long j17);

    void setStartPositionMs(long j17);
}
