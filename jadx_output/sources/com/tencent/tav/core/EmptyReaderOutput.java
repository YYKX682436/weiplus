package com.tencent.tav.core;

/* loaded from: classes16.dex */
public class EmptyReaderOutput extends com.tencent.tav.core.AssetReaderOutput {
    @Override // com.tencent.tav.core.AssetReaderOutput
    public void markConfigurationAsFinal() {
    }

    @Override // com.tencent.tav.core.AssetReaderOutput
    public com.tencent.tav.coremedia.CMSampleBuffer nextSampleBuffer(boolean z17) {
        return new com.tencent.tav.coremedia.CMSampleBuffer(com.tencent.tav.coremedia.CMSampleState.fromError(-1L));
    }

    @Override // com.tencent.tav.core.AssetReaderOutput
    public void release() {
    }

    @Override // com.tencent.tav.core.AssetReaderOutput
    public void resetForReadingTimeRanges(java.util.List<com.tencent.tav.coremedia.CMTimeRange> list) {
    }
}
