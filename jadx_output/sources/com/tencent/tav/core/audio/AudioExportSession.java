package com.tencent.tav.core.audio;

/* loaded from: classes16.dex */
public class AudioExportSession {
    public static int SEGMENT_DURATION_US = 5000000;

    public static com.tencent.tav.core.audio.IAudioExportTask generateAudioAssetExportTask(com.tencent.tav.asset.Asset asset, java.lang.String str) {
        return new com.tencent.tav.core.audio.AudioExportTask(new com.tencent.tav.core.audio.AudioSourceComposition(asset), str);
    }

    public static com.tencent.tav.core.audio.IAudioExportTask generateAudioTrackExportTask(com.tencent.tav.asset.AssetTrack assetTrack, java.lang.String str) {
        return new com.tencent.tav.core.audio.AudioExportTask(new com.tencent.tav.core.audio.AudioSourceTrack(assetTrack), str);
    }
}
