package ko4;

/* loaded from: classes14.dex */
public final class a implements com.tencent.tav.codec.IMediaCodec {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f310032a;

    /* renamed from: b, reason: collision with root package name */
    public long f310033b;

    /* renamed from: c, reason: collision with root package name */
    public java.nio.ByteBuffer f310034c;

    /* renamed from: d, reason: collision with root package name */
    public java.nio.ByteBuffer f310035d;

    /* renamed from: e, reason: collision with root package name */
    public long f310036e;

    public a() {
        mq1.w0.wi();
        fp.d0.n("mediaplus");
        this.f310032a = "AudioSoftDecoder";
    }

    @Override // com.tencent.tav.codec.IMediaCodec
    public void bindSurfaceTexture(android.graphics.SurfaceTexture p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
    }

    @Override // com.tencent.tav.codec.IMediaCodec
    public void configure(android.media.MediaFormat mediaFormat, android.view.Surface surface, android.media.MediaCrypto mediaCrypto, int i17) {
    }

    @Override // com.tencent.tav.codec.IMediaCodec
    public android.view.Surface createInputSurface() {
        return null;
    }

    @Override // com.tencent.tav.codec.IMediaCodec
    public int dequeueInputBuffer(long j17) {
        return 0;
    }

    @Override // com.tencent.tav.codec.IMediaCodec
    public int dequeueOutputBuffer(android.media.MediaCodec.BufferInfo info, long j17) {
        kotlin.jvm.internal.o.g(info, "info");
        byte[] nGetOutputBuffer = com.tencent.mm.mediaplus.AudioSoftDecoderJni.nGetOutputBuffer(this.f310033b);
        if (nGetOutputBuffer == null) {
            return -1;
        }
        if (nGetOutputBuffer.length == 0) {
            return -1;
        }
        int length = nGetOutputBuffer.length;
        java.nio.ByteBuffer byteBuffer = this.f310035d;
        int min = java.lang.Math.min(length, byteBuffer != null ? byteBuffer.capacity() : 0);
        int length2 = nGetOutputBuffer.length;
        java.lang.String str = this.f310032a;
        if (min < length2) {
            com.tencent.mars.xlog.Log.w(str, "output size not enough " + min + ", " + nGetOutputBuffer.length);
        }
        info.presentationTimeUs = this.f310036e;
        info.size = min;
        java.nio.ByteBuffer byteBuffer2 = this.f310035d;
        if (byteBuffer2 != null) {
            byteBuffer2.position(0);
            if (byteBuffer2.limit() != min) {
                com.tencent.mars.xlog.Log.i(str, "output buffer size changed " + byteBuffer2.limit() + " -> " + min);
            }
            byteBuffer2.limit(min);
            byteBuffer2.put(nGetOutputBuffer, 0, min);
        }
        return 0;
    }

    @Override // com.tencent.tav.codec.IMediaCodec
    public void flush() {
        com.tencent.mm.mediaplus.AudioSoftDecoderJni.nFlush(this.f310033b);
    }

    @Override // com.tencent.tav.codec.IMediaCodec
    public java.nio.ByteBuffer getInputBuffer(int i17) {
        java.nio.ByteBuffer byteBuffer = this.f310034c;
        if (byteBuffer != null) {
            byteBuffer.position(0);
        }
        return this.f310034c;
    }

    @Override // com.tencent.tav.codec.IMediaCodec
    public android.media.MediaFormat getInputFormat() {
        return null;
    }

    @Override // com.tencent.tav.codec.IMediaCodec
    public java.nio.ByteBuffer getOutputBuffer(int i17) {
        return this.f310035d;
    }

    @Override // com.tencent.tav.codec.IMediaCodec
    public android.media.MediaFormat getOutputFormat() {
        return null;
    }

    @Override // com.tencent.tav.codec.IMediaCodec
    public boolean isSoft() {
        return false;
    }

    @Override // com.tencent.tav.codec.IMediaCodec
    public void queueInputBuffer(int i17, int i18, int i19, long j17, int i27) {
        this.f310036e = j17;
        java.nio.ByteBuffer byteBuffer = this.f310034c;
        if (byteBuffer != null) {
            com.tencent.mm.mediaplus.AudioSoftDecoderJni.nDecodeSample(this.f310033b, byteBuffer, i19);
        }
    }

    @Override // com.tencent.tav.codec.IMediaCodec
    public void release() {
        com.tencent.mm.mediaplus.AudioSoftDecoderJni.nDestroy(this.f310033b);
        this.f310033b = 0L;
    }

    @Override // com.tencent.tav.codec.IMediaCodec
    public void releaseOutputBuffer(int i17, boolean z17) {
    }

    @Override // com.tencent.tav.codec.IMediaCodec
    public void reset() {
    }

    @Override // com.tencent.tav.codec.IMediaCodec
    public void setDataSource(java.lang.String path) {
        kotlin.jvm.internal.o.g(path, "path");
        long nInit = com.tencent.mm.mediaplus.AudioSoftDecoderJni.nInit(path);
        this.f310033b = nInit;
        int nGetOutputBufferSize = com.tencent.mm.mediaplus.AudioSoftDecoderJni.nGetOutputBufferSize(nInit);
        int nGetErrCode = com.tencent.mm.mediaplus.AudioSoftDecoderJni.nGetErrCode(this.f310033b);
        com.tencent.mars.xlog.Log.i(this.f310032a, "configure " + this.f310033b + ' ' + nGetOutputBufferSize + ' ' + nGetErrCode);
        if (nGetErrCode != 0) {
            throw new com.tencent.tav.core.ExportRuntimeException(new com.tencent.tav.core.ExportErrorStatus(-202, null, ""));
        }
        this.f310034c = java.nio.ByteBuffer.allocateDirect(8192).order(java.nio.ByteOrder.nativeOrder());
        this.f310035d = java.nio.ByteBuffer.allocateDirect(nGetOutputBufferSize).order(java.nio.ByteOrder.nativeOrder());
    }

    @Override // com.tencent.tav.codec.IMediaCodec
    public void signalEndOfInputStream() {
    }

    @Override // com.tencent.tav.codec.IMediaCodec
    public void start() {
    }

    @Override // com.tencent.tav.codec.IMediaCodec
    public void stop() {
    }
}
