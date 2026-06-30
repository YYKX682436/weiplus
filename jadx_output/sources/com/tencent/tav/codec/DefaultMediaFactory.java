package com.tencent.tav.codec;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/tencent/tav/codec/DefaultMediaFactory;", "Lcom/tencent/tav/codec/IMediaFactory;", "encoderFactory", "Lcom/tencent/tav/decoder/IEncoderFactory;", "decoderFactory", "Lcom/tencent/tav/codec/IDecoderFactory;", "(Lcom/tencent/tav/decoder/IEncoderFactory;Lcom/tencent/tav/codec/IDecoderFactory;)V", "getDecoderFactory", "()Lcom/tencent/tav/codec/IDecoderFactory;", "getEncoderFactory", "()Lcom/tencent/tav/decoder/IEncoderFactory;", "createAudioDecoder", "Lcom/tencent/tav/codec/IMediaCodec;", "mimeType", "", com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "createVideoDecoder", "getAudioEncoder", "Lcom/tencent/tav/decoder/AssetWriterAudioEncoder;", "getVideoEncoder", "Lcom/tencent/tav/decoder/AssetWriterVideoEncoder;", "tav-foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DefaultMediaFactory implements com.tencent.tav.codec.IMediaFactory {
    private final com.tencent.tav.codec.IDecoderFactory decoderFactory;
    private final com.tencent.tav.decoder.IEncoderFactory encoderFactory;

    public DefaultMediaFactory(com.tencent.tav.decoder.IEncoderFactory iEncoderFactory, com.tencent.tav.codec.IDecoderFactory iDecoderFactory) {
        this.encoderFactory = iEncoderFactory == null ? new com.tencent.tav.decoder.DefaultEncoderFactory() : iEncoderFactory;
        this.decoderFactory = iDecoderFactory == null ? new com.tencent.tav.codec.DefaultDecoderFactory() : iDecoderFactory;
    }

    @Override // com.tencent.tav.codec.IDecoderFactory
    public com.tencent.tav.codec.IMediaCodec createAudioDecoder(java.lang.String mimeType, java.lang.String scene) {
        kotlin.jvm.internal.o.g(mimeType, "mimeType");
        kotlin.jvm.internal.o.g(scene, "scene");
        return this.decoderFactory.createAudioDecoder(mimeType, scene);
    }

    @Override // com.tencent.tav.codec.IDecoderFactory
    public com.tencent.tav.codec.IMediaCodec createVideoDecoder(java.lang.String mimeType) {
        kotlin.jvm.internal.o.g(mimeType, "mimeType");
        com.tencent.tav.codec.IMediaCodec createVideoDecoder = this.decoderFactory.createVideoDecoder(mimeType);
        kotlin.jvm.internal.o.f(createVideoDecoder, "createVideoDecoder(...)");
        return createVideoDecoder;
    }

    @Override // com.tencent.tav.decoder.IEncoderFactory
    public com.tencent.tav.decoder.AssetWriterAudioEncoder getAudioEncoder() {
        com.tencent.tav.decoder.AssetWriterAudioEncoder audioEncoder = this.encoderFactory.getAudioEncoder();
        kotlin.jvm.internal.o.f(audioEncoder, "getAudioEncoder(...)");
        return audioEncoder;
    }

    public final com.tencent.tav.codec.IDecoderFactory getDecoderFactory() {
        return this.decoderFactory;
    }

    public final com.tencent.tav.decoder.IEncoderFactory getEncoderFactory() {
        return this.encoderFactory;
    }

    @Override // com.tencent.tav.decoder.IEncoderFactory
    public com.tencent.tav.decoder.AssetWriterVideoEncoder getVideoEncoder() {
        com.tencent.tav.decoder.AssetWriterVideoEncoder videoEncoder = this.encoderFactory.getVideoEncoder();
        kotlin.jvm.internal.o.f(videoEncoder, "getVideoEncoder(...)");
        return videoEncoder;
    }
}
