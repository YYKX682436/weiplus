package com.tencent.tav.codec;

/* loaded from: classes10.dex */
public class DefaultDecoderFactory implements com.tencent.tav.codec.IDecoderFactory {
    @Override // com.tencent.tav.codec.IDecoderFactory
    public com.tencent.tav.codec.IMediaCodec createAudioDecoder(java.lang.String str, java.lang.String str2) {
        return com.tencent.tav.codec.MediaCodecAnalyse.createDecoderByType(str, str2);
    }

    @Override // com.tencent.tav.codec.IDecoderFactory
    public com.tencent.tav.codec.IMediaCodec createVideoDecoder(java.lang.String str) {
        return com.tencent.tav.codec.MediaCodecAnalyse.createDecoderByType(str, "video");
    }
}
