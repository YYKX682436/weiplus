package com.tencent.tav.asset;

/* loaded from: classes16.dex */
public interface BaseAssetTrackInterface {
    void insertEmptyTimeRange(com.tencent.tav.coremedia.CMTimeRange cMTimeRange);

    boolean insertTimeRange(com.tencent.tav.coremedia.CMTimeRange cMTimeRange, com.tencent.tav.asset.AssetTrack assetTrack, com.tencent.tav.coremedia.CMTime cMTime);

    void removeTimeRange(com.tencent.tav.coremedia.CMTimeRange cMTimeRange);

    void scaleTimeRange(com.tencent.tav.coremedia.CMTimeRange cMTimeRange, com.tencent.tav.coremedia.CMTime cMTime);
}
