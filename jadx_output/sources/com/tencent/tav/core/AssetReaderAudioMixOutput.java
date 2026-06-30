package com.tencent.tav.core;

/* loaded from: classes16.dex */
public class AssetReaderAudioMixOutput extends com.tencent.tav.core.AssetReaderOutput {
    public static final java.lang.String TAG = "AssetReaderAudioMixOutput";
    private com.tencent.tav.core.AudioCompositionDecoderTrack audioCompositionDecoderTrack;
    private java.util.Map<java.lang.String, java.lang.Object> audioSettings;
    private java.util.ArrayList<com.tencent.tav.asset.AssetTrack> audioTracks;
    private boolean decoderStarted = false;

    public AssetReaderAudioMixOutput(java.util.ArrayList<com.tencent.tav.asset.AssetTrack> arrayList, java.util.Map<java.lang.String, java.lang.Object> map, com.tencent.tav.codec.IDecoderFactory iDecoderFactory) {
        this.audioTracks = arrayList;
        this.audioSettings = map;
        com.tencent.tav.core.AudioCompositionDecoderTrack audioCompositionDecoderTrack = new com.tencent.tav.core.AudioCompositionDecoderTrack(arrayList, 2, iDecoderFactory);
        this.audioCompositionDecoderTrack = audioCompositionDecoderTrack;
        audioCompositionDecoderTrack.logger = this.logger;
    }

    public java.util.Map<java.lang.String, java.lang.Object> getAudioSettings() {
        return this.audioSettings;
    }

    public java.util.ArrayList<com.tencent.tav.asset.AssetTrack> getAudioTracks() {
        return this.audioTracks;
    }

    @Override // com.tencent.tav.core.AssetReaderOutput
    public void markConfigurationAsFinal() {
    }

    @Override // com.tencent.tav.core.AssetReaderOutput
    public com.tencent.tav.coremedia.CMSampleBuffer nextSampleBuffer(boolean z17) {
        com.tencent.tav.coremedia.CMSampleBuffer readSample = this.audioCompositionDecoderTrack.readSample();
        return readSample.getTime().smallThan(this.timeRange.getStart()) ? readSample : readSample.getTime().smallThan(this.timeRange.getEnd()) ? new com.tencent.tav.coremedia.CMSampleBuffer(readSample.getTime().sub(this.timeRange.getStart()), readSample.getSampleByteBuffer(), readSample.isNewFrame()) : new com.tencent.tav.coremedia.CMSampleBuffer(com.tencent.tav.coremedia.CMSampleState.fromError(-1L));
    }

    @Override // com.tencent.tav.core.AssetReaderOutput
    public void release() {
        com.tencent.tav.core.AudioCompositionDecoderTrack audioCompositionDecoderTrack = this.audioCompositionDecoderTrack;
        if (audioCompositionDecoderTrack != null) {
            audioCompositionDecoderTrack.release();
        }
    }

    @Override // com.tencent.tav.core.AssetReaderOutput
    public void resetForReadingTimeRanges(java.util.List<com.tencent.tav.coremedia.CMTimeRange> list) {
    }

    public void setAudioInfo(com.tencent.tav.decoder.AudioInfo audioInfo) {
        this.audioCompositionDecoderTrack.setAudioInfo(audioInfo);
    }

    public void setAudioMix(com.tencent.tav.core.AudioMix audioMix) {
        com.tencent.tav.core.AudioCompositionDecoderTrack audioCompositionDecoderTrack = this.audioCompositionDecoderTrack;
        if (audioCompositionDecoderTrack != null) {
            audioCompositionDecoderTrack.setAudioMix(audioMix);
        }
    }

    @Override // com.tencent.tav.core.AssetReaderOutput
    public void start(com.tencent.tav.core.IContextCreate iContextCreate, com.tencent.tav.coremedia.CMTimeRange cMTimeRange) {
        super.start(iContextCreate, cMTimeRange);
        com.tencent.tav.core.AudioCompositionDecoderTrack audioCompositionDecoderTrack = this.audioCompositionDecoderTrack;
        if (audioCompositionDecoderTrack == null || this.decoderStarted) {
            return;
        }
        audioCompositionDecoderTrack.start(null);
        this.audioCompositionDecoderTrack.seekTo(cMTimeRange.getStart(), false, true);
        this.decoderStarted = true;
    }
}
