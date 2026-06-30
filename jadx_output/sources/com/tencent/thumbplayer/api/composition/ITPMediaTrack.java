package com.tencent.thumbplayer.api.composition;

/* loaded from: classes16.dex */
public interface ITPMediaTrack extends com.tencent.thumbplayer.api.composition.ITPMediaAsset {
    int addTrackClip(com.tencent.thumbplayer.api.composition.ITPMediaTrackClip iTPMediaTrackClip);

    java.util.List<com.tencent.thumbplayer.api.composition.ITPMediaTrackClip> getAllTrackClips();

    long getTimelineDurationMs();

    com.tencent.thumbplayer.api.composition.ITPMediaTrackClip getTrackClip(int i17);

    int getTrackId();

    int insertTrackClip(com.tencent.thumbplayer.api.composition.ITPMediaTrackClip iTPMediaTrackClip, int i17);

    void removeAllTrackClips();

    boolean removeTrackClip(com.tencent.thumbplayer.api.composition.ITPMediaTrackClip iTPMediaTrackClip);

    boolean swapTrackClip(int i17, int i18);
}
