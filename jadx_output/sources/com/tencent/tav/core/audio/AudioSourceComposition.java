package com.tencent.tav.core.audio;

/* loaded from: classes16.dex */
public class AudioSourceComposition implements com.tencent.tav.core.audio.IAudioSource<com.tencent.tav.core.AudioCompositionDecoderTrack> {
    private com.tencent.tav.asset.Asset mAsset;
    private com.tencent.tav.decoder.AudioInfo mAudioInfo = new com.tencent.tav.decoder.AudioInfo(44100, 1, 2);

    public AudioSourceComposition(com.tencent.tav.asset.Asset asset) {
        this.mAsset = asset;
    }

    @Override // com.tencent.tav.core.audio.IAudioSource
    public com.tencent.tav.coremedia.CMTime getDuration() {
        return this.mAsset.getDuration();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.tav.core.audio.IAudioSource
    public com.tencent.tav.core.AudioCompositionDecoderTrack getSourceAudioDecoder(com.tencent.tav.coremedia.CMTimeRange cMTimeRange) {
        com.tencent.tav.core.AudioCompositionDecoderTrack audioCompositionDecoderTrack = new com.tencent.tav.core.AudioCompositionDecoderTrack((java.util.List<com.tencent.tav.asset.AssetTrack>) this.mAsset.getTracks(), -1);
        audioCompositionDecoderTrack.setAudioInfo(this.mAudioInfo);
        audioCompositionDecoderTrack.setDecodeType(com.tencent.tav.decoder.IDecoder.DecodeType.Audio);
        audioCompositionDecoderTrack.setFrameRate(44);
        return audioCompositionDecoderTrack;
    }
}
