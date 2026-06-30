package com.tencent.tav.decoder;

/* loaded from: classes10.dex */
public class DefaultEncoderFactory implements com.tencent.tav.decoder.IEncoderFactory {
    @Override // com.tencent.tav.decoder.IEncoderFactory
    public com.tencent.tav.decoder.AssetWriterAudioEncoder getAudioEncoder() {
        return new com.tencent.tav.decoder.MediaCodecAudioEncoder();
    }

    @Override // com.tencent.tav.decoder.IEncoderFactory
    public com.tencent.tav.decoder.AssetWriterVideoEncoder getVideoEncoder() {
        return new com.tencent.tav.decoder.MediaCodecAssetWriterVideoEncoder();
    }
}
