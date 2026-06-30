package com.tencent.thumbplayer.api.composition;

/* loaded from: classes16.dex */
public class TPMediaCompositionFactory {
    public static com.tencent.thumbplayer.api.composition.ITPMediaTrackClip createEmptyTrackClip(int i17, long j17, long j18) {
        com.tencent.thumbplayer.composition.TPEmptyTrackClip tPEmptyTrackClip = new com.tencent.thumbplayer.composition.TPEmptyTrackClip(i17);
        tPEmptyTrackClip.setCutTimeRange(j17, j18);
        return tPEmptyTrackClip;
    }

    public static com.tencent.thumbplayer.api.composition.ITPMediaAssetExtraParam createMediaAssetExtraParam() {
        return new com.tencent.thumbplayer.composition.TPMediaAssetExtraParam();
    }

    public static com.tencent.thumbplayer.api.composition.ITPMediaAssetOrderedMap createMediaAssetOrderedMap() {
        return new com.tencent.thumbplayer.composition.TPMediaAssetOrderedMap();
    }

    public static com.tencent.thumbplayer.api.composition.ITPMediaComposition createMediaComposition() {
        return new com.tencent.thumbplayer.composition.TPMediaComposition();
    }

    public static com.tencent.thumbplayer.api.composition.ITPMediaDRMAsset createMediaDRMAsset(@com.tencent.thumbplayer.api.TPCommonEnum.TP_DRM_TYPE int i17, java.lang.String str) {
        return new com.tencent.thumbplayer.composition.TPMediaDRMAsset(i17, str);
    }

    public static com.tencent.thumbplayer.api.composition.ITPMediaAsset createMediaRTCAsset(java.lang.String str, java.lang.String str2) {
        return new com.tencent.thumbplayer.composition.TPMediaRtcAsset(str, str2);
    }

    public static com.tencent.thumbplayer.api.composition.ITPMediaTrack createMediaTrack(int i17) {
        return new com.tencent.thumbplayer.composition.TPMediaCompositionTrack(i17);
    }

    public static com.tencent.thumbplayer.api.composition.ITPMediaTrackClip createMediaTrackClip(java.lang.String str, int i17) {
        return new com.tencent.thumbplayer.composition.TPMediaCompositionTrackClip(str, i17);
    }

    public static com.tencent.thumbplayer.api.composition.ITPMediaUrlAsset createMediaUrlAsset(java.lang.String str) {
        return new com.tencent.thumbplayer.composition.TPMediaUrlAsset(str);
    }

    public static com.tencent.thumbplayer.api.composition.ITPMediaAsset createMediaRTCAsset(java.lang.String str, java.lang.String str2, int i17) {
        return new com.tencent.thumbplayer.composition.TPMediaRtcAsset(str, str2, i17);
    }

    public static com.tencent.thumbplayer.api.composition.ITPMediaTrack createMediaTrack(int i17, com.tencent.thumbplayer.api.composition.ITPMediaTrackClip... iTPMediaTrackClipArr) {
        com.tencent.thumbplayer.composition.TPMediaCompositionTrack tPMediaCompositionTrack = new com.tencent.thumbplayer.composition.TPMediaCompositionTrack(i17);
        for (com.tencent.thumbplayer.api.composition.ITPMediaTrackClip iTPMediaTrackClip : iTPMediaTrackClipArr) {
            tPMediaCompositionTrack.addTrackClip(iTPMediaTrackClip);
        }
        return tPMediaCompositionTrack;
    }

    public static com.tencent.thumbplayer.api.composition.ITPMediaTrackClip createMediaTrackClip(java.lang.String str, int i17, long j17, long j18) {
        return new com.tencent.thumbplayer.composition.TPMediaCompositionTrackClip(str, i17, j17, j18);
    }

    public static com.tencent.thumbplayer.api.composition.ITPMediaTrack createMediaTrack(int i17, java.util.List<com.tencent.thumbplayer.api.composition.ITPMediaTrackClip> list) {
        com.tencent.thumbplayer.composition.TPMediaCompositionTrack tPMediaCompositionTrack = new com.tencent.thumbplayer.composition.TPMediaCompositionTrack(i17);
        java.util.Iterator<com.tencent.thumbplayer.api.composition.ITPMediaTrackClip> it = list.iterator();
        while (it.hasNext()) {
            tPMediaCompositionTrack.addTrackClip(it.next());
        }
        return tPMediaCompositionTrack;
    }
}
