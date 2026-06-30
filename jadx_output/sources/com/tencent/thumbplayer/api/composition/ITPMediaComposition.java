package com.tencent.thumbplayer.api.composition;

/* loaded from: classes16.dex */
public interface ITPMediaComposition extends com.tencent.thumbplayer.api.composition.ITPMediaAsset {
    com.tencent.thumbplayer.api.composition.ITPMediaTrack addAVTrack();

    com.tencent.thumbplayer.api.composition.ITPMediaTrack addAudioTrack();

    com.tencent.thumbplayer.api.composition.ITPMediaTrack addVideoTrack();

    java.util.List<com.tencent.thumbplayer.api.composition.ITPMediaTrack> getAllAVTracks();

    java.util.List<com.tencent.thumbplayer.api.composition.ITPMediaTrack> getAllAudioTracks();

    java.util.List<com.tencent.thumbplayer.api.composition.ITPMediaTrack> getAllVideoTracks();

    long getDurationMs();

    void release();

    boolean removeAVTrack(com.tencent.thumbplayer.api.composition.ITPMediaTrack iTPMediaTrack);

    boolean removeAudioTrack(com.tencent.thumbplayer.api.composition.ITPMediaTrack iTPMediaTrack);

    boolean removeVideoTrack(com.tencent.thumbplayer.api.composition.ITPMediaTrack iTPMediaTrack);
}
