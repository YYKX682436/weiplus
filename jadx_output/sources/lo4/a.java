package lo4;

/* loaded from: classes14.dex */
public final class a implements com.tencent.tav.decoder.AssetWriterAudioEncoder {

    /* renamed from: a, reason: collision with root package name */
    public android.media.MediaFormat f320191a;

    /* renamed from: b, reason: collision with root package name */
    public int f320192b;

    /* renamed from: c, reason: collision with root package name */
    public long f320193c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.tav.core.ExportConfig f320194d;

    /* renamed from: e, reason: collision with root package name */
    public int f320195e;

    /* renamed from: f, reason: collision with root package name */
    public java.nio.ByteBuffer f320196f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.tav.decoder.muxer.IMediaMuxer f320197g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f320198h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.tav.decoder.logger.WXLogger f320199i = new com.tencent.tav.decoder.logger.WXLogger();

    @Override // com.tencent.tav.decoder.AssetWriterAudioEncoder
    public boolean endWriteAudioSample() {
        this.f320199i.i("MicroMsg.CompositionAudioSoftEncoder", "endWriteAudioSample: ", new java.lang.Object[0]);
        java.nio.ByteBuffer byteBuffer = this.f320196f;
        if (byteBuffer == null) {
            kotlin.jvm.internal.o.o("dataBuffer");
            throw null;
        }
        int position = byteBuffer.position();
        if (position > 0) {
            java.nio.ByteBuffer byteBuffer2 = this.f320196f;
            if (byteBuffer2 == null) {
                kotlin.jvm.internal.o.o("dataBuffer");
                throw null;
            }
            byteBuffer2.position(0);
            int i17 = this.f320192b;
            java.nio.ByteBuffer byteBuffer3 = this.f320196f;
            if (byteBuffer3 == null) {
                kotlin.jvm.internal.o.o("dataBuffer");
                throw null;
            }
            com.tencent.mm.plugin.sight.base.AudioSoftEncoder.nWriteAudioSample(i17, byteBuffer3, position, this.f320193c);
        }
        com.tencent.mm.plugin.sight.base.AudioSoftEncoder.nEndWriteAudioSample(this.f320192b);
        return true;
    }

    @Override // com.tencent.tav.decoder.AssetWriterAudioEncoder
    public android.media.MediaFormat getEncodeFormat() {
        android.media.MediaFormat mediaFormat = this.f320191a;
        kotlin.jvm.internal.o.d(mediaFormat);
        return mediaFormat;
    }

    @Override // com.tencent.tav.decoder.AssetWriterAudioEncoder
    public long getEncodePresentationTimeUs() {
        return this.f320193c;
    }

    @Override // com.tencent.tav.decoder.AssetWriterAudioEncoder
    public boolean isEncodeToEndOfStream() {
        return this.f320198h;
    }

    @Override // com.tencent.tav.decoder.AssetWriterAudioEncoder
    public boolean prepare(com.tencent.tav.core.ExportConfig outputConfig, android.media.MediaFormat mediaFormat) {
        kotlin.jvm.internal.o.g(outputConfig, "outputConfig");
        kotlin.jvm.internal.o.g(mediaFormat, "mediaFormat");
        com.tencent.tav.decoder.logger.WXLoggerConfig wXLoggerConfig = outputConfig.loggerConfig;
        com.tencent.tav.decoder.logger.WXLogger wXLogger = this.f320199i;
        if (wXLoggerConfig != null) {
            wXLogger.setConfig(wXLoggerConfig);
        }
        this.f320194d = outputConfig;
        this.f320191a = mediaFormat;
        int nInit = com.tencent.mm.plugin.sight.base.AudioSoftEncoder.nInit(mediaFormat.getInteger(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE), outputConfig.getAudioSampleRateHz(), outputConfig.getAudioChannelCount(), mediaFormat.getInteger("aac-profile"));
        this.f320192b = nInit;
        int nGetErrCode = com.tencent.mm.plugin.sight.base.AudioSoftEncoder.nGetErrCode(nInit);
        int nGetBufferSize = com.tencent.mm.plugin.sight.base.AudioSoftEncoder.nGetBufferSize(this.f320192b);
        this.f320195e = nGetBufferSize;
        java.nio.ByteBuffer order = java.nio.ByteBuffer.allocateDirect(nGetBufferSize).order(java.nio.ByteOrder.nativeOrder());
        kotlin.jvm.internal.o.f(order, "order(...)");
        this.f320196f = order;
        wXLogger.i("MicroMsg.CompositionAudioSoftEncoder", "prepare: " + this.f320192b + ' ' + this.f320195e + ", " + nGetErrCode, new java.lang.Object[0]);
        if (nGetErrCode == 0) {
            return true;
        }
        throw new com.tencent.tav.core.ExportRuntimeException(new com.tencent.tav.core.ExportErrorStatus(-104, null, mediaFormat.toString()));
    }

    @Override // com.tencent.tav.decoder.AssetWriterAudioEncoder
    public void release() {
        this.f320199i.i("MicroMsg.CompositionAudioSoftEncoder", "release: " + this.f320192b, new java.lang.Object[0]);
        com.tencent.mm.plugin.sight.base.AudioSoftEncoder.nDestroy(this.f320192b);
        this.f320192b = 0;
    }

    @Override // com.tencent.tav.decoder.AssetWriterAudioEncoder
    public void setMediaMuxer(com.tencent.tav.decoder.muxer.IMediaMuxer iMediaMuxer) {
        this.f320197g = iMediaMuxer;
    }

    @Override // com.tencent.tav.decoder.AssetWriterAudioEncoder
    public boolean start() {
        return true;
    }

    @Override // com.tencent.tav.decoder.AssetWriterAudioEncoder
    public void stop() {
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    @Override // com.tencent.tav.decoder.AssetWriterAudioEncoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean writeAudioFrame(boolean r9) {
        /*
            r8 = this;
            com.tencent.tav.decoder.muxer.IMediaMuxer r0 = r8.f320197g
            r1 = -1
            if (r0 == 0) goto La
            int r0 = r0.getAudioId()
            goto Lb
        La:
            r0 = r1
        Lb:
            r2 = 1
            if (r0 != r1) goto Lf
            return r2
        Lf:
            long[] r1 = new long[r2]
            r3 = 0
            r5 = 0
            r1[r5] = r3
            int r3 = r8.f320192b
            byte[] r3 = com.tencent.mm.plugin.sight.base.AudioSoftEncoder.nGetOutputBuffer(r3, r1)
            if (r3 == 0) goto L4e
            int r4 = r3.length
            if (r4 != 0) goto L23
            r4 = r2
            goto L24
        L23:
            r4 = r5
        L24:
            r4 = r4 ^ r2
            if (r4 == 0) goto L4e
            android.media.MediaCodec$BufferInfo r4 = new android.media.MediaCodec$BufferInfo
            r4.<init>()
            r6 = r1[r5]
            r4.presentationTimeUs = r6
            int r1 = r3.length
            r4.size = r1
            int r1 = r3.length
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocateDirect(r1)
            java.nio.ByteOrder r6 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r1 = r1.order(r6)
            r1.put(r3)
            r1.position(r5)
            com.tencent.tav.decoder.muxer.IMediaMuxer r3 = r8.f320197g
            if (r3 == 0) goto L4f
            r3.writeSampleData(r0, r1, r4)
            goto L4f
        L4e:
            r5 = r2
        L4f:
            if (r9 == 0) goto L53
            r8.f320198h = r2
        L53:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: lo4.a.writeAudioFrame(boolean):boolean");
    }

    @Override // com.tencent.tav.decoder.AssetWriterAudioEncoder
    public long writeAudioSample(long j17, java.nio.ByteBuffer audioBuffer) {
        kotlin.jvm.internal.o.g(audioBuffer, "audioBuffer");
        int position = audioBuffer.position();
        int limit = audioBuffer.limit();
        java.nio.ByteBuffer byteBuffer = this.f320196f;
        if (byteBuffer == null) {
            kotlin.jvm.internal.o.o("dataBuffer");
            throw null;
        }
        int position2 = byteBuffer.position();
        java.nio.ByteBuffer byteBuffer2 = this.f320196f;
        if (byteBuffer2 == null) {
            kotlin.jvm.internal.o.o("dataBuffer");
            throw null;
        }
        int min = java.lang.Math.min(byteBuffer2.capacity() - position2, limit - position);
        int i17 = position + min;
        audioBuffer.limit(i17);
        java.nio.ByteBuffer byteBuffer3 = this.f320196f;
        if (byteBuffer3 == null) {
            kotlin.jvm.internal.o.o("dataBuffer");
            throw null;
        }
        byteBuffer3.put(audioBuffer);
        int i18 = position2 + min;
        java.nio.ByteBuffer byteBuffer4 = this.f320196f;
        if (byteBuffer4 == null) {
            kotlin.jvm.internal.o.o("dataBuffer");
            throw null;
        }
        if (i18 >= byteBuffer4.capacity()) {
            java.nio.ByteBuffer byteBuffer5 = this.f320196f;
            if (byteBuffer5 == null) {
                kotlin.jvm.internal.o.o("dataBuffer");
                throw null;
            }
            byteBuffer5.position(0);
            int i19 = this.f320192b;
            java.nio.ByteBuffer byteBuffer6 = this.f320196f;
            if (byteBuffer6 == null) {
                kotlin.jvm.internal.o.o("dataBuffer");
                throw null;
            }
            com.tencent.mm.plugin.sight.base.AudioSoftEncoder.nWriteAudioSample(i19, byteBuffer6, this.f320195e, j17);
            this.f320193c = j17;
        } else {
            java.nio.ByteBuffer byteBuffer7 = this.f320196f;
            if (byteBuffer7 == null) {
                kotlin.jvm.internal.o.o("dataBuffer");
                throw null;
            }
            byteBuffer7.position(min);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("writeAudioSample: write size is ");
        sb6.append(position);
        sb6.append(", ");
        java.nio.ByteBuffer byteBuffer8 = this.f320196f;
        if (byteBuffer8 == null) {
            kotlin.jvm.internal.o.o("dataBuffer");
            throw null;
        }
        sb6.append(byteBuffer8.position());
        sb6.append(", ");
        sb6.append(min);
        sb6.append('}');
        java.lang.String sb7 = sb6.toString();
        com.tencent.tav.decoder.logger.WXLogger wXLogger = this.f320199i;
        wXLogger.frame("MicroMsg.CompositionAudioSoftEncoder", sb7);
        if (min <= 0) {
            wXLogger.w("MicroMsg.CompositionAudioSoftEncoder", "writeAudioSample: error");
            return 0L;
        }
        audioBuffer.position(i17);
        com.tencent.tav.core.ExportConfig exportConfig = this.f320194d;
        kotlin.jvm.internal.o.d(exportConfig);
        int audioChannelCount = exportConfig.getAudioChannelCount();
        com.tencent.tav.core.ExportConfig exportConfig2 = this.f320194d;
        kotlin.jvm.internal.o.d(exportConfig2);
        return com.tencent.tav.decoder.DecoderUtils.getAudioDuration(min, audioChannelCount, exportConfig2.getAudioSampleRateHz());
    }
}
