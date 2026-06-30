package com.tencent.thumbplayer.tmediacodec.codec;

/* loaded from: classes14.dex */
public final class AudioCodecWrapper extends com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper {
    public AudioCodecWrapper(android.media.MediaCodec mediaCodec, com.tencent.thumbplayer.tmediacodec.codec.FormatWrapper formatWrapper) {
        super(mediaCodec, formatWrapper);
    }

    @Override // com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper
    public com.tencent.thumbplayer.tmediacodec.reuse.ReuseHelper.ReuseType canReuse(com.tencent.thumbplayer.tmediacodec.codec.FormatWrapper formatWrapper) {
        return com.tencent.thumbplayer.tmediacodec.reuse.ReuseHelper.isSeamlessAdaptationSupported(this, formatWrapper) ? com.tencent.thumbplayer.tmediacodec.reuse.ReuseHelper.ReuseType.KEEP_CODEC_RESULT_YES_WITHOUT_RECONFIGURATION : com.tencent.thumbplayer.tmediacodec.reuse.ReuseHelper.ReuseType.KEEP_CODEC_RESULT_NO;
    }

    @Override // com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper
    public java.lang.String toString() {
        return "AudioCodecWrapper[" + hashCode() + ']';
    }
}
