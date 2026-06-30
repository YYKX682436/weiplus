package com.tencent.mm.plugin.vlog.model;

/* loaded from: classes14.dex */
public final class w implements com.tencent.tav.decoder.AssetWriterVideoEncoder {
    public volatile int A;
    public final java.nio.ByteBuffer B;
    public final java.util.LinkedList C;
    public final com.tencent.tav.decoder.logger.WXLogger D;
    public long E;
    public long F;

    /* renamed from: a, reason: collision with root package name */
    public final t21.d2 f175752a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.tav.decoder.RenderContext f175753b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.tav.decoder.muxer.IMediaMuxer f175754c;

    /* renamed from: d, reason: collision with root package name */
    public int f175755d;

    /* renamed from: e, reason: collision with root package name */
    public int f175756e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.tav.coremedia.CGSize f175757f;

    /* renamed from: g, reason: collision with root package name */
    public android.media.MediaFormat f175758g;

    /* renamed from: h, reason: collision with root package name */
    public volatile long f175759h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f175760i;

    /* renamed from: j, reason: collision with root package name */
    public android.media.ImageReader f175761j;

    /* renamed from: k, reason: collision with root package name */
    public android.media.ImageReader f175762k;

    /* renamed from: l, reason: collision with root package name */
    public android.os.Handler f175763l;

    /* renamed from: m, reason: collision with root package name */
    public final android.os.HandlerThread f175764m;

    /* renamed from: n, reason: collision with root package name */
    public volatile boolean f175765n;

    /* renamed from: o, reason: collision with root package name */
    public os0.g f175766o;

    /* renamed from: p, reason: collision with root package name */
    public rs0.h f175767p;

    /* renamed from: q, reason: collision with root package name */
    public final android.os.ConditionVariable f175768q;

    /* renamed from: r, reason: collision with root package name */
    public int f175769r;

    /* renamed from: s, reason: collision with root package name */
    public int f175770s;

    /* renamed from: t, reason: collision with root package name */
    public java.nio.ByteBuffer f175771t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.plugin.sight.base.h f175772u;

    /* renamed from: v, reason: collision with root package name */
    public volatile boolean f175773v;

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.Object f175774w;

    /* renamed from: x, reason: collision with root package name */
    public final java.util.concurrent.Semaphore f175775x;

    /* renamed from: y, reason: collision with root package name */
    public volatile int f175776y;

    /* renamed from: z, reason: collision with root package name */
    public volatile int f175777z;

    public w(t21.d2 d2Var) {
        this.f175752a = d2Var;
        int i17 = pu5.i.f358473b;
        this.f175764m = pu5.f.a("finder_soft_encode_rgb2yuv_thread", -4);
        this.f175768q = new android.os.ConditionVariable();
        this.f175774w = new java.lang.Object();
        this.f175775x = new java.util.concurrent.Semaphore(1);
        this.B = java.nio.ByteBuffer.allocate(1);
        this.C = new java.util.LinkedList();
        this.D = new com.tencent.tav.decoder.logger.WXLogger();
        this.F = -1L;
    }

    public final void a() {
        if (this.f175772u == null) {
            com.tencent.tav.decoder.muxer.IMediaMuxer iMediaMuxer = this.f175754c;
            if (iMediaMuxer instanceof com.tencent.mm.plugin.vlog.model.TAVKitMuxer$SightVideoJNIMediaMuxer) {
                kotlin.jvm.internal.o.e(iMediaMuxer, "null cannot be cast to non-null type com.tencent.mm.plugin.vlog.model.TAVKitMuxer.SightVideoJNIMediaMuxer");
                if (((com.tencent.mm.plugin.vlog.model.TAVKitMuxer$SightVideoJNIMediaMuxer) iMediaMuxer).getSightEncode() != null) {
                    com.tencent.tav.decoder.muxer.IMediaMuxer iMediaMuxer2 = this.f175754c;
                    kotlin.jvm.internal.o.e(iMediaMuxer2, "null cannot be cast to non-null type com.tencent.mm.plugin.vlog.model.TAVKitMuxer.SightVideoJNIMediaMuxer");
                    this.f175772u = ((com.tencent.mm.plugin.vlog.model.TAVKitMuxer$SightVideoJNIMediaMuxer) iMediaMuxer2).getSightEncode();
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("set bufId:");
                    com.tencent.mm.plugin.sight.base.h hVar = this.f175772u;
                    sb6.append(hVar != null ? java.lang.Integer.valueOf(hVar.f162415a) : null);
                    this.D.i("MicroMsg.CompositionSoftwareEncoder", sb6.toString(), new java.lang.Object[0]);
                }
            }
        }
    }

    public final void b(java.nio.ByteBuffer byteBuffer, long j17) {
        byteBuffer.position(0);
        com.tencent.mm.plugin.sight.base.h hVar = this.f175772u;
        if (hVar != null) {
            com.tencent.mm.plugin.sight.base.SightVideoJNI.writeYuvDataForMMSightEncode(hVar.f162415a, byteBuffer, this.f175755d, this.f175756e);
        }
        com.tencent.tav.decoder.muxer.IMediaMuxer iMediaMuxer = this.f175754c;
        if (iMediaMuxer != null) {
            int videoId = iMediaMuxer.getVideoId();
            java.nio.ByteBuffer byteBuffer2 = this.B;
            android.media.MediaCodec.BufferInfo bufferInfo = new android.media.MediaCodec.BufferInfo();
            bufferInfo.presentationTimeUs = this.f175759h;
            iMediaMuxer.writeSampleData(videoId, byteBuffer2, bufferInfo);
        }
        this.D.frame("MicroMsg.CompositionSoftwareEncoder", "writeSampleData timestamp:" + j17 + ", diff:" + (j17 - this.E));
        this.E = j17;
        this.A = this.A + 1;
    }

    public final void c() {
        android.os.Handler handler;
        synchronized (this.f175774w) {
            this.D.i("MicroMsg.CompositionSoftwareEncoder", "finishEncode, imageReader:" + this.f175761j + ", isInputEndOfStream:" + this.f175760i, new java.lang.Object[0]);
            this.f175773v = true;
            android.media.ImageReader imageReader = this.f175761j;
            if (imageReader != null) {
                imageReader.close();
            }
            android.media.ImageReader imageReader2 = this.f175762k;
            if (imageReader2 != null) {
                imageReader2.close();
            }
            rs0.h hVar = this.f175767p;
            if (hVar != null && (handler = this.f175763l) != null) {
                handler.post(new com.tencent.mm.plugin.vlog.model.s(this, hVar));
            }
            com.tencent.mm.plugin.sight.base.h hVar2 = this.f175772u;
            if (hVar2 != null) {
                com.tencent.mm.plugin.sight.base.SightVideoJNI.finishVideoEncode(hVar2.f162415a);
            }
            this.f175772u = null;
            this.f175764m.quitSafely();
            this.f175763l = null;
            this.f175762k = null;
            this.f175767p = null;
            this.f175761j = null;
            this.D.i("MicroMsg.CompositionSoftwareEncoder", "finishEncode, encodeYuvCount:" + this.A + ", writeYuvCount:" + this.f175777z + ", renderYuvCount:" + this.f175776y, new java.lang.Object[0]);
        }
    }

    @Override // com.tencent.tav.decoder.AssetWriterVideoEncoder
    public android.view.Surface createInputSurface() {
        android.media.ImageReader imageReader = this.f175761j;
        android.view.Surface surface = imageReader != null ? imageReader.getSurface() : null;
        this.D.i("MicroMsg.CompositionSoftwareEncoder", "createInputSurface: " + surface, new java.lang.Object[0]);
        return surface;
    }

    public final void d() {
        this.f175760i = true;
        this.f175759h = -1L;
        this.D.i("MicroMsg.CompositionSoftwareEncoder", "onInputEndOfStream, renderYuvCount:" + this.f175776y + ", writeYuvCount:" + this.f175777z + ", writeRGBCount:0, rgbAvailableCount:0", new java.lang.Object[0]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0083, code lost:
    
        if ((!r10.C.isEmpty()) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0085, code lost:
    
        r11 = (com.tencent.mm.plugin.vlog.model.r) r10.C.removeFirst();
        b(r11.f175716a, r11.f175717b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x009b, code lost:
    
        if ((!r10.C.isEmpty()) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x009d, code lost:
    
        r11 = r10.f175771t;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x009f, code lost:
    
        if (r11 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a1, code lost:
    
        b(r11, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a4, code lost:
    
        r10.D.frame("MicroMsg.CompositionSoftwareEncoder", "end processImageYUVBufferToWriteYUVData, cost:" + (android.os.SystemClock.elapsedRealtime() - r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c2, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(int r11, int r12, android.media.Image.Plane r13, long r14) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.vlog.model.w.e(int, int, android.media.Image$Plane, long):boolean");
    }

    @Override // com.tencent.tav.decoder.AssetWriterVideoEncoder
    public void flush() {
    }

    @Override // com.tencent.tav.decoder.AssetWriterVideoEncoder
    public android.media.MediaFormat getEncodeFormat() {
        android.media.MediaFormat mediaFormat = this.f175758g;
        kotlin.jvm.internal.o.d(mediaFormat);
        return mediaFormat;
    }

    @Override // com.tencent.tav.decoder.AssetWriterVideoEncoder
    public long getEncodePresentationTimeUs() {
        return this.f175759h;
    }

    @Override // com.tencent.tav.decoder.AssetWriterVideoEncoder
    public com.tencent.tav.coremedia.CGSize getEncodeSize() {
        com.tencent.tav.coremedia.CGSize cGSize = this.f175757f;
        if (cGSize != null) {
            return cGSize;
        }
        com.tencent.tav.coremedia.CGSize CGSizeZero = com.tencent.tav.coremedia.CGSize.CGSizeZero;
        kotlin.jvm.internal.o.f(CGSizeZero, "CGSizeZero");
        return CGSizeZero;
    }

    @Override // com.tencent.tav.decoder.AssetWriterVideoEncoder
    public boolean isEncodeToEndOfStream() {
        return this.f175760i;
    }

    @Override // com.tencent.tav.decoder.AssetWriterVideoEncoder
    public boolean isNeedVideoOutputTexture() {
        return true;
    }

    @Override // com.tencent.tav.decoder.AssetWriterVideoEncoder
    public boolean prepare(com.tencent.tav.core.ExportConfig exportConfig, android.media.MediaFormat mediaFormat) {
        com.tencent.tav.decoder.logger.WXLoggerConfig wXLoggerConfig;
        com.tencent.tav.decoder.logger.WXLogger wXLogger = this.D;
        if (exportConfig != null && (wXLoggerConfig = exportConfig.loggerConfig) != null) {
            wXLogger.setConfig(wXLoggerConfig);
        }
        wXLogger.i("MicroMsg.CompositionSoftwareEncoder", "prepare, outputConfig:" + exportConfig + ", videoFormat:" + mediaFormat, new java.lang.Object[0]);
        if (exportConfig == null) {
            return false;
        }
        this.f175755d = exportConfig.getOutputWidth();
        this.f175756e = exportConfig.getOutputHeight();
        exportConfig.getVideoFrameRate();
        exportConfig.getVideoBitRate();
        this.f175757f = new com.tencent.tav.coremedia.CGSize(this.f175755d, this.f175756e);
        this.f175758g = mediaFormat;
        this.f175761j = android.media.ImageReader.newInstance(this.f175755d, this.f175756e, 1, 1);
        return true;
    }

    @Override // com.tencent.tav.decoder.AssetWriterVideoEncoder
    public void processVideoTexture(com.tencent.tav.coremedia.TextureInfo textureInfo, com.tencent.tav.coremedia.CMTime sampleTime) {
        kotlin.jvm.internal.o.g(sampleTime, "sampleTime");
        if (!this.f175765n) {
            this.D.e("MicroMsg.CompositionSoftwareEncoder", "processVideoTexture imageReader not init now");
            throw new java.lang.Exception("ImageReader not init");
        }
        this.f175775x.acquire();
        this.f175759h = sampleTime.getTimeUs();
        this.D.frame("MicroMsg.CompositionSoftwareEncoder", "processVideoTexture sampleTime:" + this.f175759h + ", diff:" + (this.f175759h - this.F));
        this.F = this.f175759h;
        if (textureInfo == null) {
            com.tencent.tav.decoder.logger.WXLogger wXLogger = this.D;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("muxer stared ");
            com.tencent.tav.decoder.muxer.IMediaMuxer iMediaMuxer = this.f175754c;
            sb6.append(iMediaMuxer != null ? java.lang.Boolean.valueOf(iMediaMuxer.getIsStarted()) : null);
            sb6.append("; texture:");
            sb6.append(textureInfo);
            wXLogger.w("MicroMsg.CompositionSoftwareEncoder", sb6.toString());
            return;
        }
        this.D.frame("MicroMsg.CompositionSoftwareEncoder", "input sample buffer render texture:" + textureInfo + ", sampleTime:" + sampleTime.getTimeUs());
        os0.g gVar = this.f175766o;
        if (gVar != null) {
            gVar.U = textureInfo.textureID;
        }
        if (gVar != null) {
            gVar.w(textureInfo.width, textureInfo.height);
        }
        if (this.f175767p == null) {
            this.D.frame("MicroMsg.CompositionSoftwareEncoder", "processVideoTexture not init rgb2yuvEGLEnvironment, sampleTime:" + this.f175759h);
            return;
        }
        long j17 = this.f175759h;
        android.os.Handler handler = this.f175763l;
        if (handler != null) {
            handler.post(new com.tencent.mm.plugin.vlog.model.v(this, j17));
        }
        if (this.f175773v) {
            return;
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        this.D.frame("MicroMsg.CompositionSoftwareEncoder", "wait output yuv data cost:" + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
    }

    @Override // com.tencent.tav.decoder.AssetWriterVideoEncoder
    public void release() {
        this.D.i("MicroMsg.CompositionSoftwareEncoder", "release", new java.lang.Object[0]);
        c();
    }

    @Override // com.tencent.tav.decoder.AssetWriterVideoEncoder
    public void reset() {
    }

    @Override // com.tencent.tav.decoder.AssetWriterVideoEncoder
    public void setMediaMuxer(com.tencent.tav.decoder.muxer.IMediaMuxer iMediaMuxer) {
        this.f175754c = iMediaMuxer;
        this.D.i("MicroMsg.CompositionSoftwareEncoder", "setMediaMuxer: " + iMediaMuxer, new java.lang.Object[0]);
        if (iMediaMuxer instanceof com.tencent.mm.plugin.vlog.model.TAVKitMuxer$SightVideoJNIMediaMuxer) {
            com.tencent.mm.plugin.vlog.model.TAVKitMuxer$SightVideoJNIMediaMuxer tAVKitMuxer$SightVideoJNIMediaMuxer = (com.tencent.mm.plugin.vlog.model.TAVKitMuxer$SightVideoJNIMediaMuxer) iMediaMuxer;
            tAVKitMuxer$SightVideoJNIMediaMuxer.configMuxerToSoftEncode(true);
            tAVKitMuxer$SightVideoJNIMediaMuxer.setSoftEncoder(this);
            tAVKitMuxer$SightVideoJNIMediaMuxer.configSoftEncodeCustom(this.f175752a);
        }
    }

    @Override // com.tencent.tav.decoder.AssetWriterVideoEncoder
    public void setVideoSampleRenderContext(com.tencent.tav.decoder.RenderContext renderContext) {
        this.f175753b = renderContext;
        if (renderContext == null || this.f175767p != null) {
            return;
        }
        int i17 = this.f175755d;
        int i18 = this.f175756e;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        int i19 = i17 / 4;
        this.f175769r = i19;
        int i27 = (i18 * 3) / 2;
        this.f175770s = i27;
        android.media.ImageReader newInstance = android.media.ImageReader.newInstance(i19, i27, 1, 1);
        this.f175762k = newInstance;
        if (newInstance != null) {
            android.os.HandlerThread handlerThread = this.f175764m;
            handlerThread.start();
            android.os.Handler handler = new android.os.Handler(handlerThread.getLooper());
            this.f175763l = handler;
            newInstance.setOnImageAvailableListener(new com.tencent.mm.plugin.vlog.model.t(this), handler);
            android.os.Handler handler2 = this.f175763l;
            if (handler2 != null) {
                handler2.post(new com.tencent.mm.plugin.vlog.model.u(newInstance, this));
            }
        }
        this.f175768q.block(1000L);
        this.D.i("MicroMsg.CompositionSoftwareEncoder", "initRgb2YuvImageReader, yuv size:[" + this.f175769r + 'x' + this.f175770s + "], cost:" + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime), new java.lang.Object[0]);
    }

    @Override // com.tencent.tav.decoder.AssetWriterVideoEncoder
    public void signalEndOfInputStream() {
        this.D.i("MicroMsg.CompositionSoftwareEncoder", "signalEndOfInputStream", new java.lang.Object[0]);
        d();
    }

    @Override // com.tencent.tav.decoder.AssetWriterVideoEncoder
    public boolean start() {
        this.D.i("MicroMsg.CompositionSoftwareEncoder", "start", new java.lang.Object[0]);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        android.os.SystemClock.elapsedRealtime();
        return true;
    }

    @Override // com.tencent.tav.decoder.AssetWriterVideoEncoder
    public void stop() {
        this.D.i("MicroMsg.CompositionSoftwareEncoder", "stop", new java.lang.Object[0]);
        c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001f, code lost:
    
        if ((r1 != null && r1.getIsStarted()) != false) goto L20;
     */
    @Override // com.tencent.tav.decoder.AssetWriterVideoEncoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean writeVideoSample(com.tencent.tav.coremedia.CMSampleBuffer r8, boolean r9) {
        /*
            r7 = this;
            com.tencent.tav.decoder.muxer.IMediaMuxer r0 = r7.f175754c
            r1 = -1
            if (r0 == 0) goto La
            int r0 = r0.getVideoId()
            goto Lb
        La:
            r0 = r1
        Lb:
            r2 = 1
            if (r0 != r1) goto Lf
            return r2
        Lf:
            r0 = 0
            if (r8 == 0) goto L22
            com.tencent.tav.decoder.muxer.IMediaMuxer r1 = r7.f175754c
            if (r1 == 0) goto L1e
            boolean r1 = r1.getIsStarted()
            if (r1 != r2) goto L1e
            r1 = r2
            goto L1f
        L1e:
            r1 = r0
        L1f:
            if (r1 == 0) goto L22
            goto L23
        L22:
            r2 = r0
        L23:
            java.lang.String r1 = "MicroMsg.CompositionSoftwareEncoder"
            if (r8 == 0) goto L4f
            com.tencent.tav.decoder.logger.WXLogger r3 = r7.D
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "writeVideoSample sampleTimeUs:"
            r4.<init>(r5)
            com.tencent.tav.coremedia.CMTime r5 = r8.getTime()
            long r5 = r5.getTimeUs()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.frame(r1, r4)
            rs0.h r3 = r7.f175767p
            if (r3 == 0) goto L4f
            boolean r3 = r7.f175760i
            if (r3 == 0) goto L4f
            r3 = -1
            r7.f175759h = r3
        L4f:
            if (r9 == 0) goto L6a
            com.tencent.tav.decoder.logger.WXLogger r9 = r7.D
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "writeVideoSample endOfStream, sampleBuffer:"
            r3.<init>(r4)
            r3.append(r8)
            java.lang.String r8 = r3.toString()
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r9.i(r1, r8, r0)
            r7.d()
        L6a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.vlog.model.w.writeVideoSample(com.tencent.tav.coremedia.CMSampleBuffer, boolean):boolean");
    }
}
