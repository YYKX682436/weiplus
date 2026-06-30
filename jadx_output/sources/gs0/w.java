package gs0;

/* loaded from: classes14.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.sight.base.h f275031a;

    /* renamed from: b, reason: collision with root package name */
    public final int f275032b;

    /* renamed from: c, reason: collision with root package name */
    public final int f275033c;

    /* renamed from: d, reason: collision with root package name */
    public java.nio.ByteBuffer f275034d;

    /* renamed from: e, reason: collision with root package name */
    public android.media.ImageReader f275035e;

    /* renamed from: f, reason: collision with root package name */
    public android.os.Handler f275036f;

    /* renamed from: g, reason: collision with root package name */
    public final android.os.HandlerThread f275037g;

    /* renamed from: h, reason: collision with root package name */
    public os0.g f275038h;

    /* renamed from: i, reason: collision with root package name */
    public rs0.h f275039i;

    /* renamed from: j, reason: collision with root package name */
    public int f275040j;

    /* renamed from: k, reason: collision with root package name */
    public int f275041k;

    /* renamed from: l, reason: collision with root package name */
    public volatile boolean f275042l;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.Object f275043m;

    /* renamed from: n, reason: collision with root package name */
    public volatile int f275044n;

    /* renamed from: o, reason: collision with root package name */
    public volatile int f275045o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.concurrent.Semaphore f275046p;

    public w(com.tencent.mm.plugin.sight.base.h hVar, int i17, int i18) {
        this.f275031a = hVar;
        this.f275032b = i17;
        this.f275033c = i18;
        int i19 = pu5.i.f358473b;
        this.f275037g = pu5.f.a("X264TransImageReaderEncoder_rgb2yuv_thread", -4);
        this.f275043m = new java.lang.Object();
        this.f275046p = new java.util.concurrent.Semaphore(1);
        com.tencent.mars.xlog.Log.i("MicroMsg.X264TransImageReaderEncoder", "create X264TransImageReaderEncoder, width:" + i17 + ", height:" + i18);
        com.tencent.mm.plugin.sight.base.SightVideoJNI.setI420Format(hVar != null ? hVar.f162415a : -1, true);
    }

    public static final boolean a(gs0.w wVar, int i17, int i18, android.media.Image.Plane plane) {
        synchronized (wVar.f275043m) {
            com.tencent.mm.plugin.sight.base.h hVar = wVar.f275031a;
            if (hVar != null) {
                if (hVar.f162415a >= 0) {
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                    com.tencent.mars.xlog.Log.i("MicroMsg.X264TransImageReaderEncoder", "processImageYUVBufferToWriteYUVData, width:" + i17 + ", height:" + i18 + ", videoWidth:" + wVar.f275032b + ", videoHeight:" + wVar.f275033c);
                    int rowStride = plane.getRowStride();
                    int pixelStride = plane.getPixelStride();
                    if (wVar.f275034d == null) {
                        wVar.f275034d = java.nio.ByteBuffer.allocateDirect(wVar.f275040j * wVar.f275041k * pixelStride);
                    }
                    java.nio.ByteBuffer byteBuffer = wVar.f275034d;
                    if (byteBuffer != null) {
                        byteBuffer.position(0);
                    }
                    java.nio.ByteBuffer buffer = plane.getBuffer();
                    buffer.position(0);
                    java.nio.ByteBuffer byteBuffer2 = wVar.f275034d;
                    int i19 = wVar.f275040j * pixelStride;
                    com.tencent.mm.plugin.sight.base.SightVideoJNI.nativeBufferCopy(buffer, byteBuffer2, i19, wVar.f275041k, rowStride - i19);
                    com.tencent.mm.plugin.sight.base.SightVideoJNI.writeYuvDataForMMSightEncode(wVar.f275031a.f162415a, wVar.f275034d, wVar.f275032b, wVar.f275033c);
                    com.tencent.mars.xlog.Log.i("MicroMsg.X264TransImageReaderEncoder", "end processImageYUVBufferToWriteYUVData, cost:" + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
                }
            }
        }
        return false;
    }

    public final void b(long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.X264TransImageReaderEncoder", "requestEncode:" + j17);
        android.os.Handler handler = this.f275036f;
        if (handler != null) {
            handler.post(new gs0.t(this, j17));
        }
        this.f275046p.acquire();
    }

    public final void c(rs0.h videoDataRenderEnvironment, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(videoDataRenderEnvironment, "videoDataRenderEnvironment");
        com.tencent.mars.xlog.Log.i("MicroMsg.X264TransImageReaderEncoder", "start");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        android.os.SystemClock.elapsedRealtime();
        int i27 = this.f275032b / 4;
        this.f275040j = i27;
        int i28 = (this.f275033c * 3) / 2;
        this.f275041k = i28;
        android.media.ImageReader newInstance = android.media.ImageReader.newInstance(i27, i28, 1, 1);
        this.f275035e = newInstance;
        if (newInstance != null) {
            android.os.HandlerThread handlerThread = this.f275037g;
            handlerThread.start();
            android.os.Handler handler = new android.os.Handler(handlerThread.getLooper());
            this.f275036f = handler;
            newInstance.setOnImageAvailableListener(new gs0.u(this), handler);
            android.os.Handler handler2 = this.f275036f;
            if (handler2 != null) {
                handler2.post(new gs0.v(this, newInstance, videoDataRenderEnvironment, i17, i18, i19));
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.X264TransImageReaderEncoder", "initRgb2YuvImageReader, yuv size:[" + this.f275040j + 'x' + this.f275041k + ']');
    }

    public final void d() {
        android.os.Handler handler;
        com.tencent.mars.xlog.Log.i("MicroMsg.X264TransImageReaderEncoder", "stop");
        synchronized (this.f275043m) {
            com.tencent.mars.xlog.Log.i("MicroMsg.X264TransImageReaderEncoder", "finishEncode, renderYuvCount:" + this.f275044n + ", writeYuvCount:" + this.f275045o);
            this.f275042l = true;
            android.media.ImageReader imageReader = this.f275035e;
            if (imageReader != null) {
                imageReader.close();
            }
            rs0.h hVar = this.f275039i;
            if (hVar != null && (handler = this.f275036f) != null) {
                handler.post(new gs0.s(this, hVar));
            }
            com.tencent.mm.plugin.sight.base.h hVar2 = this.f275031a;
            if (hVar2 != null) {
                com.tencent.mm.plugin.sight.base.SightVideoJNI.finishVideoEncode(hVar2.f162415a);
            }
            this.f275037g.quitSafely();
            this.f275035e = null;
        }
    }
}
