package com.tencent.thumbplayer.tmediacodec.codec;

/* loaded from: classes14.dex */
public final class DirectCodecWrapper implements com.tencent.thumbplayer.tmediacodec.codec.CodecWrapper {
    public static final java.lang.String TAG = "DirectCodecWrapper";
    private static java.util.concurrent.atomic.AtomicInteger sCodecNum = new java.util.concurrent.atomic.AtomicInteger(0);
    private final android.media.MediaCodec mCodec;

    public DirectCodecWrapper(android.media.MediaCodec mediaCodec) {
        this.mCodec = mediaCodec;
        com.tencent.thumbplayer.tmediacodec.util.LogUtils.i(TAG, "DirectCodecWrapper sCodecNum:" + sCodecNum.incrementAndGet());
    }

    @Override // com.tencent.thumbplayer.tmediacodec.codec.CodecWrapper
    public void attachThread() {
    }

    @Override // com.tencent.thumbplayer.tmediacodec.codec.CodecWrapper
    public com.tencent.thumbplayer.tmediacodec.reuse.ReuseHelper.ReuseType canReuseType(com.tencent.thumbplayer.tmediacodec.codec.FormatWrapper formatWrapper) {
        com.tencent.thumbplayer.tmediacodec.util.LogUtils.w(TAG, "setCanReuseType setCodecCallback ignore...");
        return com.tencent.thumbplayer.tmediacodec.reuse.ReuseHelper.ReuseType.KEEP_CODEC_RESULT_NO;
    }

    @Override // com.tencent.thumbplayer.tmediacodec.codec.CodecWrapper
    public void configure(android.media.MediaFormat mediaFormat, android.view.Surface surface, android.media.MediaCrypto mediaCrypto, int i17) {
        this.mCodec.configure(mediaFormat, surface, mediaCrypto, i17);
    }

    @Override // com.tencent.thumbplayer.tmediacodec.codec.CodecWrapper
    public int dequeueInputBuffer(long j17) {
        return this.mCodec.dequeueInputBuffer(j17);
    }

    @Override // com.tencent.thumbplayer.tmediacodec.codec.CodecWrapper
    public int dequeueOutputBuffer(android.media.MediaCodec.BufferInfo bufferInfo, long j17) {
        return this.mCodec.dequeueOutputBuffer(bufferInfo, j17);
    }

    @Override // com.tencent.thumbplayer.tmediacodec.codec.CodecWrapper
    public void flush() {
        com.tencent.thumbplayer.tmediacodec.util.LogUtils.i(TAG, "DirectCodecWrapper flush start ...");
        this.mCodec.flush();
        com.tencent.thumbplayer.tmediacodec.util.LogUtils.i(TAG, "DirectCodecWrapper flush end ...");
    }

    public final android.media.MediaCodec getCodec() {
        return this.mCodec;
    }

    @Override // com.tencent.thumbplayer.tmediacodec.codec.CodecWrapper
    public android.media.MediaCodec getMediaCodec() {
        return this.mCodec;
    }

    @Override // com.tencent.thumbplayer.tmediacodec.codec.CodecWrapper
    public void prepareToReUse() {
        com.tencent.thumbplayer.tmediacodec.util.LogUtils.w(TAG, "DirectCodecWrapper prepareToReUse ignore...");
    }

    @Override // com.tencent.thumbplayer.tmediacodec.codec.CodecWrapper
    public void queueInputBuffer(int i17, int i18, int i19, long j17, int i27) {
        this.mCodec.queueInputBuffer(i17, i18, i19, j17, i27);
    }

    @Override // com.tencent.thumbplayer.tmediacodec.codec.CodecWrapper
    public void release() {
        com.tencent.thumbplayer.tmediacodec.util.LogUtils.i(TAG, "DirectCodecWrapper release start ...");
        this.mCodec.release();
        com.tencent.thumbplayer.tmediacodec.util.LogUtils.i(TAG, "DirectCodecWrapper release end ... sCodecNum:" + sCodecNum.decrementAndGet());
    }

    @Override // com.tencent.thumbplayer.tmediacodec.codec.CodecWrapper
    public void releaseOutputBuffer(int i17, boolean z17) {
        this.mCodec.releaseOutputBuffer(i17, z17);
    }

    @Override // com.tencent.thumbplayer.tmediacodec.codec.CodecWrapper
    public void reset() {
        com.tencent.thumbplayer.tmediacodec.util.LogUtils.i(TAG, "DirectCodecWrapper reset start ...");
        this.mCodec.reset();
        com.tencent.thumbplayer.tmediacodec.util.LogUtils.i(TAG, "DirectCodecWrapper reset end ...");
    }

    @Override // com.tencent.thumbplayer.tmediacodec.codec.CodecWrapper
    public void setCodecCallback(com.tencent.thumbplayer.tmediacodec.callback.CodecCallback codecCallback) {
        com.tencent.thumbplayer.tmediacodec.util.LogUtils.w(TAG, "DirectCodecWrapper setCodecCallback ignore...");
    }

    @Override // com.tencent.thumbplayer.tmediacodec.codec.CodecWrapper
    public void setOutputSurface(android.view.Surface surface) {
        com.tencent.thumbplayer.tmediacodec.util.LogUtils.i(TAG, "DirectCodecWrapper setOutputSurface start, surface:" + surface);
        this.mCodec.setOutputSurface(surface);
        com.tencent.thumbplayer.tmediacodec.util.LogUtils.i(TAG, "DirectCodecWrapper setOutputSurface end ...");
    }

    @Override // com.tencent.thumbplayer.tmediacodec.codec.CodecWrapper
    public void start() {
        com.tencent.thumbplayer.tmediacodec.util.LogUtils.i(TAG, "DirectCodecWrapper start ...");
        this.mCodec.start();
        com.tencent.thumbplayer.tmediacodec.util.LogUtils.i(TAG, "DirectCodecWrapper start end...");
    }

    @Override // com.tencent.thumbplayer.tmediacodec.codec.CodecWrapper
    public void stop() {
        com.tencent.thumbplayer.tmediacodec.util.LogUtils.i(TAG, "DirectCodecWrapper stop before ...");
        this.mCodec.stop();
        com.tencent.thumbplayer.tmediacodec.util.LogUtils.i(TAG, "DirectCodecWrapper stop end ...");
    }

    @Override // com.tencent.thumbplayer.tmediacodec.codec.CodecWrapper
    public void configure(android.media.MediaFormat mediaFormat, android.view.Surface surface, int i17, android.media.MediaDescrambler mediaDescrambler) {
        this.mCodec.configure(mediaFormat, surface, i17, mediaDescrambler);
    }

    @Override // com.tencent.thumbplayer.tmediacodec.codec.CodecWrapper
    public void releaseOutputBuffer(int i17, long j17) {
        this.mCodec.releaseOutputBuffer(i17, j17);
    }
}
