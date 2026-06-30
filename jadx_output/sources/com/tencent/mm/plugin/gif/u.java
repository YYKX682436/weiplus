package com.tencent.mm.plugin.gif;

/* loaded from: classes15.dex */
public class u extends com.tencent.mm.plugin.gif.b {
    public long A;
    public long B;
    public long C;
    public long D;
    public long E;
    public long F;
    public boolean G;
    public boolean H;
    public final com.tencent.mm.sdk.platformtools.o3 I;

    /* renamed from: J, reason: collision with root package name */
    public int f142189J;
    public boolean K;
    public final java.lang.Runnable L;
    public final java.lang.Runnable M;
    public final java.lang.Runnable N;
    public java.lang.Runnable P;
    public int Q;
    public int R;
    public final java.lang.Runnable S;

    /* renamed from: d, reason: collision with root package name */
    public boolean f142190d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f142191e;

    /* renamed from: f, reason: collision with root package name */
    public volatile long f142192f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Object f142193g;

    /* renamed from: h, reason: collision with root package name */
    public final int[] f142194h;

    /* renamed from: i, reason: collision with root package name */
    public final int[] f142195i;

    /* renamed from: m, reason: collision with root package name */
    public float f142196m;

    /* renamed from: n, reason: collision with root package name */
    public float f142197n;

    /* renamed from: o, reason: collision with root package name */
    public final android.graphics.Rect f142198o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f142199p;

    /* renamed from: q, reason: collision with root package name */
    public final android.graphics.Paint f142200q;

    /* renamed from: r, reason: collision with root package name */
    public android.graphics.Bitmap[] f142201r;

    /* renamed from: s, reason: collision with root package name */
    public final android.graphics.Bitmap f142202s;

    /* renamed from: t, reason: collision with root package name */
    public int f142203t;

    /* renamed from: u, reason: collision with root package name */
    public int f142204u;

    /* renamed from: v, reason: collision with root package name */
    public int f142205v;

    /* renamed from: w, reason: collision with root package name */
    public int f142206w;

    /* renamed from: x, reason: collision with root package name */
    public int f142207x;

    /* renamed from: y, reason: collision with root package name */
    public int f142208y;

    /* renamed from: z, reason: collision with root package name */
    public float f142209z;

    public u(byte[] bArr, java.lang.String str) {
        this(bArr);
        ((com.tencent.mm.feature.emoji.g) ((com.tencent.mm.feature.emoji.api.k5) i95.n0.c(com.tencent.mm.feature.emoji.api.k5.class))).getClass();
        android.graphics.Bitmap a17 = ar.c.f13356a.a(str);
        if (a17 != null) {
            this.f142202s = a17;
        }
    }

    @Override // com.tencent.mm.plugin.gif.b
    public void a() {
        this.f142190d = false;
    }

    @Override // com.tencent.mm.plugin.gif.b
    public synchronized void b() {
        synchronized (this.f142193g) {
            this.f142191e = true;
            this.f142190d = false;
            long j17 = this.f142192f;
            this.f142192f = 0L;
            this.I.removeCallbacks(this.L);
            if (((com.tencent.mm.feature.emoji.api.IWXGFJNIService) i95.n0.c(com.tencent.mm.feature.emoji.api.IWXGFJNIService.class)).nativeUninit(j17) == -906) {
                jx3.f.INSTANCE.idkeyStat(401L, 10L, 1L, false);
            }
            this.f142201r = null;
            this.P = null;
        }
    }

    @Override // com.tencent.mm.plugin.gif.b
    public void c() {
        this.f142190d = true;
        ((com.tencent.mm.feature.emoji.xa) ((com.tencent.mm.feature.emoji.api.u6) i95.n0.c(com.tencent.mm.feature.emoji.api.u6.class))).wi(this.N, 0L);
    }

    @Override // com.tencent.mm.plugin.gif.b
    public void d() {
        if (this.f142191e) {
            return;
        }
        this.f142190d = true;
        java.lang.Runnable runnable = this.L;
        this.F = android.os.SystemClock.uptimeMillis();
        if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
            ((com.tencent.mm.plugin.gif.q) runnable).run();
            return;
        }
        com.tencent.mm.sdk.platformtools.o3 o3Var = this.I;
        if (o3Var != null) {
            o3Var.d(runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        boolean z17 = this.f142199p;
        android.graphics.Rect rect = this.f142198o;
        if (z17) {
            rect.set(getBounds());
            this.f142196m = rect.width() / this.f142205v;
            this.f142197n = rect.height() / this.f142206w;
            this.f142199p = false;
        }
        android.graphics.Paint paint = this.f142200q;
        if (paint.getShader() != null) {
            canvas.drawRect(rect, paint);
            return;
        }
        if (this.D == 0) {
            this.D = java.lang.System.currentTimeMillis();
        }
        boolean z18 = true;
        if (this.K) {
            this.f142203t = (this.f142203t + 1) % this.f142201r.length;
        }
        android.graphics.Bitmap[] bitmapArr = this.f142201r;
        int i17 = this.f142203t;
        android.graphics.Bitmap bitmap = bitmapArr[i17];
        if (bitmap == null) {
            bitmap = bitmapArr[(i17 + 1) % bitmapArr.length];
            com.tencent.mars.xlog.Log.i("MicroMsg.GIF.MMWXGFDrawable", "use last decode bitmap %s  hash:[%s]", bitmap, java.lang.Integer.valueOf(hashCode()));
        }
        if (bitmap == null || bitmap.isRecycled() || this.f142191e) {
            android.graphics.Bitmap bitmap2 = this.f142202s;
            if (bitmap2 != null) {
                canvas.scale(rect.width() / bitmap2.getWidth(), rect.height() / bitmap2.getHeight());
                canvas.drawBitmap(bitmap2, 0.0f, 0.0f, paint);
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.GIF.MMWXGFDrawable", "Cpan draw bitmap failed. Bitmap buffer is null or recycle %s", java.lang.Integer.valueOf(hashCode()));
            }
        } else {
            canvas.scale(this.f142196m, this.f142197n);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        }
        this.E = java.lang.System.currentTimeMillis() - this.D;
        if (this.K) {
            int i18 = this.Q;
            if (i18 > 0 && this.f142208y == -1) {
                int i19 = this.R + 1;
                this.R = i19;
                if (i19 >= i18) {
                    this.f142190d = false;
                    f(this.P, this.B);
                    z18 = false;
                }
            }
            if (z18) {
                ((com.tencent.mm.feature.emoji.xa) ((com.tencent.mm.feature.emoji.api.u6) i95.n0.c(com.tencent.mm.feature.emoji.api.u6.class))).wi(this.S, 0L);
            }
            this.K = false;
        }
    }

    public float e() {
        if (this.f142209z == 0.0f) {
            float g17 = i65.a.g(com.tencent.mm.sdk.platformtools.x2.f193071a) / 2.0f;
            this.f142209z = g17;
            if (g17 < 1.0f) {
                this.f142209z = 1.0f;
            } else if (g17 > 2.0f) {
                this.f142209z = 2.0f;
            }
        }
        return this.f142209z;
    }

    public final void f(java.lang.Runnable runnable, long j17) {
        long uptimeMillis = android.os.SystemClock.uptimeMillis() + j17;
        this.F = uptimeMillis;
        com.tencent.mm.sdk.platformtools.o3 o3Var = this.I;
        if (o3Var != null) {
            o3Var.postAtTime(runnable, uptimeMillis);
        }
    }

    public void finalize() {
        try {
            b();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.GIF.MMWXGFDrawable", th6, "", new java.lang.Object[0]);
            super.finalize();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) (this.f142206w * e());
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return (int) (this.f142205v * e());
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f142190d;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(android.graphics.Rect rect) {
        super.onBoundsChange(rect);
        this.f142199p = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i17) {
        this.f142200q.setAlpha(i17);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.f142200q.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f142190d = true;
        ((com.tencent.mm.feature.emoji.xa) ((com.tencent.mm.feature.emoji.api.u6) i95.n0.c(com.tencent.mm.feature.emoji.api.u6.class))).wi(this.M, 0L);
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f142190d = false;
        int i17 = this.f142189J;
        if (i17 != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GIF.MMWXGFDrawable", "summerhardcoder stopPerformance startPerformance:%x ", java.lang.Integer.valueOf(i17));
            com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().stopPerformance(com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcGifEnable() || com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcGifFrameEnable(), this.f142189J);
            this.f142189J = 0;
        }
    }

    public u(byte[] bArr) {
        this.f142190d = false;
        this.f142191e = false;
        this.f142193g = new java.lang.Object();
        int[] iArr = new int[4];
        this.f142194h = iArr;
        this.f142195i = new int[4];
        this.f142196m = 1.0f;
        this.f142197n = 1.0f;
        this.f142198o = new android.graphics.Rect();
        this.f142200q = new android.graphics.Paint(6);
        this.f142201r = new android.graphics.Bitmap[2];
        this.f142203t = 0;
        this.f142204u = 0;
        this.f142207x = 0;
        this.f142208y = -1;
        this.A = 0L;
        this.B = 0L;
        this.C = 0L;
        this.D = 0L;
        this.F = 0L;
        this.G = false;
        this.H = true;
        this.I = com.tencent.mm.sdk.platformtools.c4.f192496b.f192497a;
        this.K = true;
        this.L = new com.tencent.mm.plugin.gif.q(this);
        this.M = new com.tencent.mm.plugin.gif.r(this);
        this.N = new com.tencent.mm.plugin.gif.s(this);
        this.Q = -1;
        this.R = 0;
        this.S = new com.tencent.mm.plugin.gif.t(this);
        if (bArr != null) {
            this.f142189J = com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().startPerformance(com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcGifEnable(), com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcGifDelay(), com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcGifCPU(), com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcGifIO(), com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcGifThr() ? android.os.Process.myTid() : 0, com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcGifTimeout(), 602, com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcGifAction(), "MicroMsg.GIF.MMWXGFDrawable");
            this.f142192f = ((com.tencent.mm.feature.emoji.api.IWXGFJNIService) i95.n0.c(com.tencent.mm.feature.emoji.api.IWXGFJNIService.class)).nativeInitWxAMDecoder();
            if (this.f142192f != 0 && this.f142192f != -1 && this.f142192f != -901) {
                int nativeDecodeBufferHeader = ((com.tencent.mm.feature.emoji.api.IWXGFJNIService) i95.n0.c(com.tencent.mm.feature.emoji.api.IWXGFJNIService.class)).nativeDecodeBufferHeader(this.f142192f, bArr, bArr.length);
                if (nativeDecodeBufferHeader != 0) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.GIF.MMWXGFDrawable", "Cpan WXGF decode buffer header failed. result:%d", java.lang.Integer.valueOf(nativeDecodeBufferHeader));
                    if (nativeDecodeBufferHeader == -904) {
                        jx3.f.INSTANCE.idkeyStat(711L, 8L, 1L, false);
                    } else {
                        jx3.f.INSTANCE.idkeyStat(711L, 3L, 1L, false);
                    }
                    throw new com.tencent.mm.plugin.gif.MMGIFException(nativeDecodeBufferHeader);
                }
                int nativeGetOption = ((com.tencent.mm.feature.emoji.api.IWXGFJNIService) i95.n0.c(com.tencent.mm.feature.emoji.api.IWXGFJNIService.class)).nativeGetOption(this.f142192f, bArr, bArr.length, iArr);
                if (nativeGetOption != 0) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.GIF.MMWXGFDrawable", "Cpan WXGF get option failed. result:%d", java.lang.Integer.valueOf(nativeGetOption));
                    if (nativeGetOption == -903) {
                        jx3.f.INSTANCE.idkeyStat(711L, 7L, 1L, false);
                    } else {
                        jx3.f.INSTANCE.idkeyStat(711L, 3L, 1L, false);
                    }
                    throw new com.tencent.mm.plugin.gif.MMGIFException(nativeGetOption);
                }
                this.f142204u = iArr[0];
                int i17 = iArr[1];
                this.f142205v = i17;
                int i18 = iArr[2];
                this.f142206w = i18;
                int i19 = iArr[3];
                this.f142207x = i19;
                if (i19 <= 0) {
                    this.f142207x = 1;
                }
                if (i17 == 0 || i18 == 0) {
                    int h17 = i65.a.h(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f480391wm);
                    this.f142206w = h17;
                    this.f142205v = h17;
                    return;
                }
                return;
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.GIF.MMWXGFDrawable", "Cpan init wxam decoder failed. mWXGFJNIHandle:%d", java.lang.Long.valueOf(this.f142192f));
            if (this.f142192f == -901) {
                jx3.f.INSTANCE.idkeyStat(711L, 5L, 1L, false);
            }
            jx3.f.INSTANCE.idkeyStat(711L, 4L, 1L, false);
            throw new com.tencent.mm.plugin.gif.MMGIFException(201);
        }
        throw new java.lang.NullPointerException("bytes is null.");
    }
}
