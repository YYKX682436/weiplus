package com.tencent.mm.plugin.finder.view;

/* loaded from: classes14.dex */
public final class xm {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f133340a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.TextureView f133341b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f133342c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f133343d;

    /* renamed from: e, reason: collision with root package name */
    public gp.c f133344e;

    /* renamed from: f, reason: collision with root package name */
    public gp.c f133345f;

    /* renamed from: g, reason: collision with root package name */
    public android.media.MediaCodec f133346g;

    /* renamed from: h, reason: collision with root package name */
    public android.media.MediaFormat f133347h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f133348i;

    /* renamed from: j, reason: collision with root package name */
    public android.os.HandlerThread f133349j;

    /* renamed from: k, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f133350k;

    /* renamed from: l, reason: collision with root package name */
    public long f133351l;

    /* renamed from: m, reason: collision with root package name */
    public long f133352m;

    /* renamed from: n, reason: collision with root package name */
    public long f133353n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f133354o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f133355p;

    /* renamed from: q, reason: collision with root package name */
    public yz5.a f133356q;

    public xm(java.lang.String path, android.view.TextureView textureView) {
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(textureView, "textureView");
        this.f133340a = path;
        this.f133341b = textureView;
        this.f133342c = "Finder.FinderVideoFrameSeeker";
        this.f133343d = new java.lang.Object();
        this.f133351l = -1L;
        this.f133352m = -1L;
        this.f133353n = -1L;
    }

    public final gp.c a() {
        gp.c cVar = this.f133344e;
        if (cVar != null) {
            return cVar;
        }
        kotlin.jvm.internal.o.o("extractor");
        throw null;
    }

    public final gp.c b() {
        gp.c cVar = this.f133345f;
        if (cVar != null) {
            return cVar;
        }
        kotlin.jvm.internal.o.o("frameFlagExtractor");
        throw null;
    }

    public final java.lang.String c() {
        java.lang.String str = this.f133348i;
        if (str != null) {
            return str;
        }
        kotlin.jvm.internal.o.o("mime");
        throw null;
    }

    public final void d() {
        android.media.MediaCodec mediaCodec = this.f133346g;
        if (mediaCodec != null) {
            mediaCodec.stop();
        }
        android.media.MediaCodec mediaCodec2 = this.f133346g;
        if (mediaCodec2 != null) {
            mediaCodec2.release();
        }
        this.f133346g = null;
        this.f133355p = false;
        synchronized (this.f133343d) {
            this.f133343d.notify();
        }
    }

    public final void e(yz5.a onTextureReady, yz5.a onTextureDestroy, yz5.l onSeekFrame) {
        kotlin.jvm.internal.o.g(onTextureReady, "onTextureReady");
        kotlin.jvm.internal.o.g(onTextureDestroy, "onTextureDestroy");
        kotlin.jvm.internal.o.g(onSeekFrame, "onSeekFrame");
        java.lang.String str = "FinderVideoFrameSeeker_renderThread" + hashCode();
        int i17 = pu5.i.f358473b;
        android.os.HandlerThread a17 = pu5.f.a(str, -2);
        this.f133349j = a17;
        a17.start();
        android.os.HandlerThread handlerThread = this.f133349j;
        if (handlerThread == null) {
            kotlin.jvm.internal.o.o("ht");
            throw null;
        }
        this.f133350k = new com.tencent.mm.sdk.platformtools.n3(handlerThread.getLooper());
        this.f133344e = new gp.c();
        this.f133345f = new gp.c();
        java.lang.String str2 = this.f133340a;
        java.io.RandomAccessFile B = com.tencent.mm.vfs.w6.B(str2, false);
        java.io.FileDescriptor fd6 = B.getFD();
        if (wo.v1.f447824d.f447770a == 1) {
            a().j(fd6, 0L, com.tencent.mm.vfs.w6.k(str2));
            b().j(fd6, 0L, com.tencent.mm.vfs.w6.k(str2));
        } else {
            a().f274162a.setDataSource(fd6);
            b().f274162a.setDataSource(fd6);
        }
        B.close();
        int d17 = a().d();
        int i18 = 0;
        while (true) {
            if (i18 >= d17) {
                break;
            }
            android.media.MediaFormat e17 = a().e(i18);
            kotlin.jvm.internal.o.f(e17, "getTrackFormat(...)");
            this.f133347h = e17;
            java.lang.String string = e17.getString("mime");
            kotlin.jvm.internal.o.d(string);
            this.f133348i = string;
            if (r26.i0.y(c(), "video/", false)) {
                a().i(i18);
                b().i(i18);
                break;
            }
            i18++;
        }
        this.f133356q = onTextureDestroy;
        this.f133341b.setSurfaceTextureListener(new com.tencent.mm.plugin.finder.view.wm(this, onSeekFrame, onTextureReady));
    }
}
