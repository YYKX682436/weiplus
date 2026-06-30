package com.tencent.tav.core.audio;

/* loaded from: classes16.dex */
class AudioSourceTrack implements com.tencent.tav.core.audio.IAudioSource<com.tencent.tav.decoder.AudioDecoderTrack> {
    public static final java.lang.String TAG = "AudioCompositionTrackEncoder2";
    private com.tencent.tav.asset.AssetTrack mAssetTrack;
    private com.tencent.tav.decoder.AudioInfo mAudioInfo = new com.tencent.tav.decoder.AudioInfo(44100, 1, 2);

    public AudioSourceTrack(com.tencent.tav.asset.AssetTrack assetTrack) {
        this.mAssetTrack = assetTrack;
    }

    private com.tencent.tav.decoder.DecoderTrackSegment createDecoderTrackSegment(com.tencent.tav.asset.AssetTrack assetTrack, com.tencent.tav.asset.AssetTrackSegment assetTrackSegment) {
        com.tencent.tav.decoder.DecoderAssetTrack decoderAssetTrack;
        if (assetTrackSegment.isEmpty()) {
            decoderAssetTrack = null;
        } else {
            decoderAssetTrack = new com.tencent.tav.decoder.DecoderAssetTrack();
            decoderAssetTrack.assetPath = assetTrack.getSourcePath();
            decoderAssetTrack.trackId = assetTrack.getTrackID();
            decoderAssetTrack.mediaType = assetTrack.getMediaType();
            decoderAssetTrack.size = assetTrack.getNaturalSize();
            decoderAssetTrack.preferredTransform = assetTrack.getPreferredTransform();
            decoderAssetTrack.preferredVolume = assetTrack.getPreferredVolume();
            decoderAssetTrack.frameRate = (int) assetTrack.getNominalFrameRate();
        }
        com.tencent.tav.coremedia.CMTimeRange source = assetTrackSegment.getTimeMapping().getSource();
        com.tencent.tav.decoder.DecoderTrackSegment decoderTrackSegment = new com.tencent.tav.decoder.DecoderTrackSegment(new com.tencent.tav.coremedia.CMTimeRange(source.getStart(), source.getDuration()), decoderAssetTrack);
        decoderTrackSegment.setScaledDuration(assetTrackSegment.getScaleDuration());
        return decoderTrackSegment;
    }

    @Override // com.tencent.tav.core.audio.IAudioSource
    public com.tencent.tav.coremedia.CMTime getDuration() {
        return this.mAssetTrack.getDuration();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.tav.core.audio.IAudioSource
    public com.tencent.tav.decoder.AudioDecoderTrack getSourceAudioDecoder(com.tencent.tav.coremedia.CMTimeRange cMTimeRange) {
        com.tencent.tav.decoder.AudioDecoderTrack audioDecoderTrack = new com.tencent.tav.decoder.AudioDecoderTrack();
        if (this.mAssetTrack.getMediaType() != 2) {
            return null;
        }
        com.tencent.tav.decoder.AudioDecoderTrack audioDecoderTrack2 = new com.tencent.tav.decoder.AudioDecoderTrack();
        java.util.List<com.tencent.tav.asset.AssetTrackSegment> segments = this.mAssetTrack.getSegments();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.tencent.tav.asset.AssetTrackSegment assetTrackSegment : segments) {
            if (assetTrackSegment instanceof com.tencent.tav.asset.CompositionTrackSegment) {
                arrayList.add(createDecoderTrackSegment(this.mAssetTrack, (com.tencent.tav.asset.CompositionTrackSegment) assetTrackSegment));
            } else {
                arrayList.add(createDecoderTrackSegment(this.mAssetTrack, assetTrackSegment));
            }
        }
        audioDecoderTrack2.setTrackID(this.mAssetTrack.getTrackID());
        audioDecoderTrack2.setTrackSegments(arrayList);
        audioDecoderTrack2.setFrameRate((int) this.mAssetTrack.getNominalFrameRate());
        audioDecoderTrack2.setVolume(this.mAssetTrack.getPreferredVolume());
        audioDecoderTrack2.setDecodeType(com.tencent.tav.decoder.IDecoder.DecodeType.Audio);
        audioDecoderTrack2.setAudioInfo(this.mAudioInfo);
        audioDecoderTrack2.clipRangeAndClearRange(new com.tencent.tav.coremedia.CMTimeRange(com.tencent.tav.coremedia.CMTime.CMTimeZero, cMTimeRange.getEnd()));
        return audioDecoderTrack;
    }

    private com.tencent.tav.decoder.DecoderTrackSegment createDecoderTrackSegment(com.tencent.tav.asset.AssetTrack assetTrack, com.tencent.tav.asset.CompositionTrackSegment compositionTrackSegment) {
        com.tencent.tav.decoder.DecoderAssetTrack decoderAssetTrack;
        if (compositionTrackSegment.isEmpty()) {
            decoderAssetTrack = null;
        } else {
            decoderAssetTrack = new com.tencent.tav.decoder.DecoderAssetTrack();
            decoderAssetTrack.trackId = compositionTrackSegment.getSourceTrackID();
            decoderAssetTrack.mediaType = assetTrack.getMediaType();
            decoderAssetTrack.assetPath = compositionTrackSegment.getSourcePath();
            decoderAssetTrack.preferredTransform = assetTrack.getPreferredTransform();
            decoderAssetTrack.size = assetTrack.getNaturalSize();
            decoderAssetTrack.frameRate = (int) assetTrack.getNominalFrameRate();
            decoderAssetTrack.preferredVolume = assetTrack.getPreferredVolume();
        }
        com.tencent.tav.coremedia.CMTimeRange source = compositionTrackSegment.getTimeMapping().getSource();
        com.tencent.tav.decoder.DecoderTrackSegment decoderTrackSegment = new com.tencent.tav.decoder.DecoderTrackSegment(new com.tencent.tav.coremedia.CMTimeRange(source.getStart(), source.getDuration()), decoderAssetTrack);
        decoderTrackSegment.setScaledDuration(compositionTrackSegment.getScaleDuration());
        return decoderTrackSegment;
    }
}
