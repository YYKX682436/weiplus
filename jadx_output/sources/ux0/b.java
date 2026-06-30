package ux0;

/* loaded from: classes5.dex */
public final class b implements ux0.d, android.media.ImageReader.OnImageAvailableListener {

    /* renamed from: d, reason: collision with root package name */
    public pp0.p0 f431778d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.maas.camerafun.MJVideoFrame f431779e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object f431780f = new java.lang.Object();

    /* renamed from: g, reason: collision with root package name */
    public volatile android.media.ImageReader f431781g;

    /* renamed from: h, reason: collision with root package name */
    public final android.os.HandlerThread f431782h;

    /* renamed from: i, reason: collision with root package name */
    public final android.os.Handler f431783i;

    /* renamed from: m, reason: collision with root package name */
    public final yx0.c8 f431784m;

    public b() {
        int i17 = pu5.i.f358473b;
        android.os.HandlerThread a17 = pu5.f.a("ShootComposing-Use", -2);
        this.f431782h = a17;
        this.f431784m = new yx0.c8();
        a17.start();
        this.f431783i = new android.os.Handler(a17.getLooper());
    }

    @Override // ux0.d
    public void a(com.tencent.maas.camstudio.frame.VideoFrame frame) {
        kotlin.jvm.internal.o.g(frame, "frame");
    }

    @Override // ux0.d
    public java.lang.Object b(kotlin.coroutines.Continuation continuation) {
        oz5.n nVar = new oz5.n(pz5.f.b(continuation));
        this.f431783i.post(new ux0.a(this, nVar));
        java.lang.Object a17 = nVar.a();
        pz5.a aVar = pz5.a.f359186d;
        return a17;
    }

    @Override // ux0.d
    public void c() {
        java.lang.Object m521constructorimpl;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(java.lang.Boolean.valueOf(this.f431782h.quitSafely()));
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
        if (m524exceptionOrNullimpl != null) {
            com.tencent.mars.xlog.Log.e("ByteBufferVideoFrameSender", "Failed to teardown: " + m524exceptionOrNullimpl);
        }
    }

    @Override // ux0.d
    public void d(pp0.p0 camManager, xr0.j frameSize) {
        kotlin.jvm.internal.o.g(camManager, "camManager");
        kotlin.jvm.internal.o.g(frameSize, "frameSize");
        synchronized (this.f431780f) {
            this.f431778d = camManager;
            if (this.f431782h.getLooper() != null) {
                android.media.ImageReader newInstance = android.media.ImageReader.newInstance(frameSize.f456173a, frameSize.f456174b, 1, 1);
                kotlin.jvm.internal.o.f(newInstance, "newInstance(...)");
                newInstance.setOnImageAvailableListener(this, this.f431783i);
                this.f431781g = newInstance;
            }
        }
    }

    @Override // ux0.d
    public android.view.Surface getSurface() {
        android.media.ImageReader imageReader = this.f431781g;
        if (imageReader != null) {
            return imageReader.getSurface();
        }
        return null;
    }

    @Override // android.media.ImageReader.OnImageAvailableListener
    public void onImageAvailable(android.media.ImageReader imageReader) {
        synchronized (this.f431780f) {
            if (this.f431781g == null) {
                com.tencent.mars.xlog.Log.i("ByteBufferVideoFrameSender", "onImageAvailable: imageReader is null");
                return;
            }
            java.lang.System.currentTimeMillis();
            android.media.Image acquireNextImage = imageReader != null ? imageReader.acquireNextImage() : null;
            if (acquireNextImage == null) {
                return;
            }
            try {
                try {
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("ByteBufferVideoFrameSender", e17, "onImageAvailable error", new java.lang.Object[0]);
                    try {
                        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                        acquireNextImage.close();
                        kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                        kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th));
                        return;
                    }
                }
                if (acquireNextImage.getPlanes() == null) {
                    try {
                        kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                        acquireNextImage.close();
                        kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
                    } catch (java.lang.Throwable th7) {
                        kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
                        kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th7));
                    }
                    return;
                }
                android.media.Image.Plane plane = acquireNextImage.getPlanes()[0];
                java.nio.ByteBuffer buffer = plane.getBuffer();
                buffer.position(0);
                this.f431784m.a(acquireNextImage.getWidth() * acquireNextImage.getHeight() * plane.getPixelStride());
                int rowStride = plane.getRowStride();
                int pixelStride = plane.getPixelStride();
                yx0.c8 c8Var = this.f431784m;
                java.util.ArrayList arrayList = c8Var.f467232a;
                int i17 = c8Var.f467233b;
                c8Var.f467233b = i17 + 1;
                java.lang.Object obj = arrayList.get(i17 % arrayList.size());
                kotlin.jvm.internal.o.f(obj, "get(...)");
                java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) obj;
                byteBuffer.clear();
                com.tencent.mm.plugin.sight.base.SightVideoJNI.nativeBufferCopy(buffer, byteBuffer, acquireNextImage.getWidth() * pixelStride, acquireNextImage.getHeight(), rowStride - (acquireNextImage.getWidth() * pixelStride));
                com.tencent.maas.camerafun.MJVideoFrame mJVideoFrame = new com.tencent.maas.camerafun.MJVideoFrame(acquireNextImage.getWidth(), acquireNextImage.getHeight(), acquireNextImage.getWidth() * plane.getPixelStride(), acquireNextImage.getPlanes()[0].getPixelStride(), byteBuffer, 0, acquireNextImage.getTimestamp());
                this.f431779e = mJVideoFrame;
                pp0.p0 p0Var = this.f431778d;
                if (p0Var != null) {
                    p0Var.d0(mJVideoFrame);
                }
                try {
                    kotlin.Result.Companion companion5 = kotlin.Result.INSTANCE;
                    acquireNextImage.close();
                    kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
                } catch (java.lang.Throwable th8) {
                    th = th8;
                    kotlin.Result.Companion companion6 = kotlin.Result.INSTANCE;
                    kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th));
                    return;
                }
                return;
            } finally {
            }
        }
    }

    @Override // ux0.d
    public void onPause() {
    }

    @Override // ux0.d
    public void onResume() {
    }

    @Override // ux0.d
    public void release() {
        synchronized (this.f431780f) {
            this.f431778d = null;
            android.media.ImageReader imageReader = this.f431781g;
            if (imageReader != null) {
                try {
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    imageReader.close();
                    kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
                } catch (java.lang.Throwable th6) {
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
                }
                this.f431781g = null;
            }
        }
    }
}
