package com.tencent.thumbplayer.tmediacodec.codec;

/* loaded from: classes14.dex */
public final class VideoCodecWrapper extends com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper {
    public VideoCodecWrapper(android.media.MediaCodec mediaCodec, com.tencent.thumbplayer.tmediacodec.codec.FormatWrapper formatWrapper) {
        super(mediaCodec, formatWrapper);
    }

    @Override // com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper
    public com.tencent.thumbplayer.tmediacodec.reuse.ReuseHelper.ReuseType canReuse(com.tencent.thumbplayer.tmediacodec.codec.FormatWrapper formatWrapper) {
        if (com.tencent.thumbplayer.tmediacodec.reuse.ReuseHelper.isSeamlessAdaptationSupported(this, formatWrapper)) {
            int i17 = formatWrapper.width;
            com.tencent.thumbplayer.tmediacodec.codec.CodecMaxValues codecMaxValues = this.mCodecMaxValues;
            if (i17 <= codecMaxValues.width && formatWrapper.height <= codecMaxValues.height && com.tencent.thumbplayer.tmediacodec.util.TUtils.getMaxInputSize(this, formatWrapper) <= this.mCodecMaxValues.inputSize) {
                return formatWrapper.initializationDataEquals(this.mFormat) ? com.tencent.thumbplayer.tmediacodec.reuse.ReuseHelper.ReuseType.KEEP_CODEC_RESULT_YES_WITHOUT_RECONFIGURATION : com.tencent.thumbplayer.tmediacodec.reuse.ReuseHelper.ReuseType.KEEP_CODEC_RESULT_YES_WITH_RECONFIGURATION;
            }
        }
        return com.tencent.thumbplayer.tmediacodec.reuse.ReuseHelper.ReuseType.KEEP_CODEC_RESULT_NO;
    }

    @Override // com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper
    public boolean isNeedKeep() {
        return super.isNeedKeep() && this.mSurface != null && this.mFormat.rotationDegrees == 0;
    }

    @Override // com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper
    public java.lang.String toString() {
        return "VideoCodecWrapper[" + hashCode() + ']';
    }
}
