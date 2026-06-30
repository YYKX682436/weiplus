package com.tencent.tav.decoder;

/* loaded from: classes16.dex */
public class DecoderAssetTrack {
    public java.lang.String assetPath;
    public int frameRate;
    public int mediaType;
    public int preferRotation;
    public android.graphics.Matrix preferredTransform;
    public float preferredVolume;
    public com.tencent.tav.coremedia.CGSize size;
    public int sourceType;
    public int trackId;

    public static com.tencent.tav.decoder.DecoderAssetTrack create(com.tencent.tav.asset.AssetTrack assetTrack, com.tencent.tav.asset.AssetTrackSegment assetTrackSegment) {
        return assetTrackSegment instanceof com.tencent.tav.asset.CompositionTrackSegment ? createFromCompositionTrackSegment(assetTrack, (com.tencent.tav.asset.CompositionTrackSegment) assetTrackSegment) : createFromTrackSegment(assetTrack, assetTrackSegment);
    }

    private static com.tencent.tav.decoder.DecoderAssetTrack createFromCompositionTrackSegment(com.tencent.tav.asset.AssetTrack assetTrack, com.tencent.tav.asset.CompositionTrackSegment compositionTrackSegment) {
        if (compositionTrackSegment.isEmpty()) {
            return null;
        }
        com.tencent.tav.decoder.DecoderAssetTrack decoderAssetTrack = new com.tencent.tav.decoder.DecoderAssetTrack();
        decoderAssetTrack.assetPath = compositionTrackSegment.getSourcePath();
        decoderAssetTrack.trackId = compositionTrackSegment.getSourceTrackID();
        decoderAssetTrack.mediaType = assetTrack.getMediaType();
        if (!android.text.TextUtils.isEmpty(compositionTrackSegment.getSourcePath())) {
            com.tencent.tav.extractor.AssetExtractor assetExtractor = new com.tencent.tav.extractor.AssetExtractor();
            assetExtractor.setDataSource(compositionTrackSegment.getSourcePath());
            decoderAssetTrack.size = com.tencent.tav.extractor.ExtractorUtils.getVideoSize(assetExtractor);
            decoderAssetTrack.preferRotation = assetExtractor.getPreferRotation();
            decoderAssetTrack.preferredTransform = assetTrack.getPreferredTransform();
            decoderAssetTrack.sourceType = compositionTrackSegment.getSourceType();
            assetExtractor.dispose();
        }
        decoderAssetTrack.preferredVolume = 1.0f;
        decoderAssetTrack.frameRate = 30;
        return decoderAssetTrack;
    }

    private static com.tencent.tav.decoder.DecoderAssetTrack createFromTrackSegment(com.tencent.tav.asset.AssetTrack assetTrack, com.tencent.tav.asset.AssetTrackSegment assetTrackSegment) {
        if (assetTrackSegment.isEmpty()) {
            return null;
        }
        com.tencent.tav.decoder.DecoderAssetTrack decoderAssetTrack = new com.tencent.tav.decoder.DecoderAssetTrack();
        decoderAssetTrack.assetPath = assetTrack.getSourcePath();
        decoderAssetTrack.trackId = assetTrack.getTrackID();
        decoderAssetTrack.mediaType = assetTrack.getMediaType();
        if (assetTrackSegment instanceof com.tencent.tav.asset.CompositionTrackSegment) {
            decoderAssetTrack.sourceType = ((com.tencent.tav.asset.CompositionTrackSegment) assetTrackSegment).getSourceType();
        }
        decoderAssetTrack.size = assetTrack.getNaturalSize();
        decoderAssetTrack.preferredTransform = assetTrack.getPreferredTransform();
        decoderAssetTrack.preferredVolume = assetTrack.getPreferredVolume();
        decoderAssetTrack.preferRotation = assetTrack.getPreferredRotation();
        decoderAssetTrack.frameRate = (int) assetTrack.getNominalFrameRate();
        return decoderAssetTrack;
    }
}
