package com.tencent.mm.plugin.gif;

/* loaded from: classes15.dex */
public class k extends com.tencent.mm.plugin.gif.b {
    public long A;
    public int B;
    public boolean C;
    public int D;
    public int E;
    public com.tencent.mm.plugin.gif.x F;
    public int G;
    public final com.tencent.mm.sdk.platformtools.o3 H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public final boolean f142136J;
    public final java.lang.Runnable K;
    public final java.lang.Runnable L;
    public final java.lang.Runnable M;
    public final java.lang.Runnable N;
    public final java.lang.Runnable P;
    public final java.lang.Runnable Q;

    /* renamed from: d, reason: collision with root package name */
    public boolean f142137d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f142138e;

    /* renamed from: f, reason: collision with root package name */
    public volatile long f142139f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f142140g;

    /* renamed from: h, reason: collision with root package name */
    public float f142141h;

    /* renamed from: i, reason: collision with root package name */
    public float f142142i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f142143m;

    /* renamed from: n, reason: collision with root package name */
    public final android.graphics.Rect f142144n;

    /* renamed from: o, reason: collision with root package name */
    public final android.graphics.Paint f142145o;

    /* renamed from: p, reason: collision with root package name */
    public int[] f142146p;

    /* renamed from: q, reason: collision with root package name */
    public final android.graphics.Bitmap f142147q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f142148r;

    /* renamed from: s, reason: collision with root package name */
    public int f142149s;

    /* renamed from: t, reason: collision with root package name */
    public int f142150t;

    /* renamed from: u, reason: collision with root package name */
    public float f142151u;

    /* renamed from: v, reason: collision with root package name */
    public long f142152v;

    /* renamed from: w, reason: collision with root package name */
    public long f142153w;

    /* renamed from: x, reason: collision with root package name */
    public long f142154x;

    /* renamed from: y, reason: collision with root package name */
    public long f142155y;

    /* renamed from: z, reason: collision with root package name */
    public long f142156z;

    public k(android.content.res.Resources resources, int i17, boolean z17) {
        this.f142137d = true;
        this.f142138e = false;
        int[] iArr = new int[6];
        this.f142140g = iArr;
        this.f142141h = 1.0f;
        this.f142142i = 1.0f;
        this.f142144n = new android.graphics.Rect();
        this.f142145o = new android.graphics.Paint(6);
        this.f142148r = false;
        this.f142149s = 0;
        this.f142150t = -1;
        this.f142152v = 0L;
        this.f142153w = 0L;
        this.f142154x = 0L;
        this.f142155y = 0L;
        this.A = 0L;
        this.C = false;
        this.D = 0;
        this.E = 0;
        this.H = com.tencent.mm.sdk.platformtools.c4.f192496b.f192497a;
        this.I = true;
        this.f142136J = false;
        this.K = new com.tencent.mm.plugin.gif.e(this);
        this.L = new com.tencent.mm.plugin.gif.f(this);
        this.M = new com.tencent.mm.plugin.gif.g(this);
        this.N = new com.tencent.mm.plugin.gif.h(this);
        this.P = new com.tencent.mm.plugin.gif.i(this);
        this.Q = new com.tencent.mm.plugin.gif.j(this);
        this.f142136J = z17;
        java.io.InputStream openRawResource = resources.openRawResource(i17);
        if (openRawResource != null) {
            this.G = com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().startPerformance(com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcGifEnable(), com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcGifDelay(), com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcGifCPU(), com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcGifIO(), com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcGifThr() ? android.os.Process.myTid() : 0, com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcGifTimeout(), 602, com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcGifAction(), "MicroMsg.GIF.MMGIFDrawable");
            try {
                this.f142139f = ((com.tencent.mm.feature.emoji.api.IGIFJNIService) i95.n0.c(com.tencent.mm.feature.emoji.api.IGIFJNIService.class)).openByInputStrem(openRawResource, iArr);
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.GIF.MMGIFDrawable", th6, "[-] Fail to open gif.", new java.lang.Object[0]);
                this.f142139f = 0L;
            }
            f();
            return;
        }
        throw new java.lang.NullPointerException("input stream is null.");
    }

    @Override // com.tencent.mm.plugin.gif.b
    public void a() {
        this.f142137d = false;
    }

    @Override // com.tencent.mm.plugin.gif.b
    public void b() {
        this.f142138e = true;
        this.f142137d = false;
        long j17 = this.f142139f;
        this.f142139f = 0L;
        ((com.tencent.mm.feature.emoji.api.IGIFJNIService) i95.n0.c(com.tencent.mm.feature.emoji.api.IGIFJNIService.class)).recycle(j17);
        this.f142146p = null;
    }

    @Override // com.tencent.mm.plugin.gif.b
    public void c() {
        this.f142138e = false;
        this.f142137d = true;
        ((com.tencent.mm.feature.emoji.xa) ((com.tencent.mm.feature.emoji.api.u6) i95.n0.c(com.tencent.mm.feature.emoji.api.u6.class))).wi(this.N, 0L);
    }

    @Override // com.tencent.mm.plugin.gif.b
    public void d() {
        if (this.f142138e) {
            return;
        }
        this.f142137d = true;
        java.lang.Runnable runnable = this.L;
        this.A = android.os.SystemClock.uptimeMillis();
        if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
            ((com.tencent.mm.plugin.gif.f) runnable).run();
            return;
        }
        com.tencent.mm.sdk.platformtools.o3 o3Var = this.H;
        if (o3Var != null) {
            o3Var.d(runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        if (this.f142139f == 0) {
            return;
        }
        if (this.f142143m) {
            this.f142144n.set(getBounds());
            this.f142141h = this.f142144n.width() / this.f142140g[0];
            this.f142142i = this.f142144n.height() / this.f142140g[1];
            this.f142143m = false;
        }
        if (this.f142145o.getShader() != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GIF.MMGIFDrawable", "colors drawRect ");
            canvas.drawRect(this.f142144n, this.f142145o);
            return;
        }
        if (this.f142155y == 0) {
            this.f142155y = java.lang.System.currentTimeMillis();
        }
        int[] iArr = this.f142146p;
        if (iArr == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GIF.MMGIFDrawable", "colors is null.");
        } else if (this.f142148r || this.f142147q == null) {
            int length = iArr.length;
            int[] iArr2 = this.f142140g;
            if (length == iArr2[0] * iArr2[1]) {
                canvas.scale(this.f142141h, this.f142142i);
                int[] iArr3 = this.f142140g;
                int i17 = iArr3[0];
                canvas.drawBitmap(iArr, 0, i17, 0.0f, 0.0f, i17, iArr3[1], true, this.f142145o);
            } else {
                canvas.scale(this.f142141h, this.f142142i);
                canvas.drawRGB(230, 230, 230);
                com.tencent.mars.xlog.Log.w("MicroMsg.GIF.MMGIFDrawable", "colors is not equal width*height. length:%d width:%d height:%d", java.lang.Integer.valueOf(iArr.length), java.lang.Integer.valueOf(this.f142140g[0]), java.lang.Integer.valueOf(this.f142140g[1]));
            }
        } else {
            canvas.scale(this.f142144n.width() / this.f142147q.getWidth(), this.f142144n.width() / this.f142147q.getHeight());
            canvas.drawBitmap(this.f142147q, 0.0f, 0.0f, this.f142145o);
        }
        this.f142156z = java.lang.System.currentTimeMillis() - this.f142155y;
        if (!this.C) {
            int[] iArr4 = this.f142140g;
            if (iArr4[2] >= 1) {
                if (iArr4[4] < 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.GIF.MMGIFDrawable", "current index error. start first frame");
                }
                int i18 = this.D;
                if (i18 != 0 && this.E > i18 - 1) {
                    g(this.K, 0L);
                    return;
                } else {
                    if (this.I) {
                        ((com.tencent.mm.feature.emoji.xa) ((com.tencent.mm.feature.emoji.api.u6) i95.n0.c(com.tencent.mm.feature.emoji.api.u6.class))).wi(this.Q, 0L);
                        this.I = false;
                        return;
                    }
                    return;
                }
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.GIF.MMGIFDrawable", "framecount:%d errorcode:%d no post and oversize:%b", java.lang.Integer.valueOf(this.f142140g[2]), java.lang.Integer.valueOf(this.f142140g[4]), java.lang.Boolean.valueOf(this.C));
    }

    public float e() {
        if (this.f142151u == 0.0f) {
            float g17 = i65.a.g(com.tencent.mm.sdk.platformtools.x2.f193071a) / 2.0f;
            this.f142151u = g17;
            if (g17 < 1.0f) {
                this.f142151u = 1.0f;
            } else if (g17 > 2.0f) {
                this.f142151u = 2.0f;
            }
        }
        return this.f142151u;
    }

    public void f() {
        int[] iArr;
        int i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.GIF.MMGIFDrawable", "gif info pointer:%d", java.lang.Long.valueOf(this.f142139f));
        if (this.f142139f == 0) {
            return;
        }
        this.f142149s = this.f142140g[2];
        this.B = i65.a.h(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f480391wm);
        if (this.f142136J || ((i17 = (iArr = this.f142140g)[0]) <= 1024 && iArr[1] <= 1024)) {
            int[] iArr2 = this.f142140g;
            this.f142146p = new int[iArr2[0] * iArr2[1]];
            return;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.GIF.MMGIFDrawable", "emoji width or height over size. Width:%d Height:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f142140g[1]));
        int i18 = this.B;
        this.f142146p = new int[i18 * i18];
        this.C = true;
        jx3.f.INSTANCE.idkeyStat(401L, 2L, 1L, false);
    }

    public void finalize() {
        try {
            b();
        } catch (java.lang.Throwable unused) {
            super.finalize();
        }
    }

    public final void g(java.lang.Runnable runnable, long j17) {
        long uptimeMillis = android.os.SystemClock.uptimeMillis() + j17;
        this.A = uptimeMillis;
        com.tencent.mm.sdk.platformtools.o3 o3Var = this.H;
        if (o3Var != null) {
            o3Var.postAtTime(runnable, uptimeMillis);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) (this.f142140g[1] * e());
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return (int) (this.f142140g[0] * e());
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f142137d;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(android.graphics.Rect rect) {
        super.onBoundsChange(rect);
        this.f142143m = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i17) {
        this.f142145o.setAlpha(i17);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.f142145o.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f142137d = true;
        ((com.tencent.mm.feature.emoji.xa) ((com.tencent.mm.feature.emoji.api.u6) i95.n0.c(com.tencent.mm.feature.emoji.api.u6.class))).wi(this.M, 0L);
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f142137d = false;
        int i17 = this.G;
        if (i17 != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GIF.MMGIFDrawable", "summerhardcoder stopPerformance startPerformance:%x ", java.lang.Integer.valueOf(i17));
            com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().stopPerformance(com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcGifEnable() || com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcGifFrameEnable(), this.G);
            this.G = 0;
        }
        ((com.tencent.mm.feature.emoji.xa) ((com.tencent.mm.feature.emoji.api.u6) i95.n0.c(com.tencent.mm.feature.emoji.api.u6.class))).wi(this.P, 300L);
    }

    public k(java.lang.String str, boolean z17) {
        this.f142137d = true;
        this.f142138e = false;
        int[] iArr = new int[6];
        this.f142140g = iArr;
        this.f142141h = 1.0f;
        this.f142142i = 1.0f;
        this.f142144n = new android.graphics.Rect();
        this.f142145o = new android.graphics.Paint(6);
        this.f142148r = false;
        this.f142149s = 0;
        this.f142150t = -1;
        this.f142152v = 0L;
        this.f142153w = 0L;
        this.f142154x = 0L;
        this.f142155y = 0L;
        this.A = 0L;
        this.C = false;
        this.D = 0;
        this.E = 0;
        this.H = com.tencent.mm.sdk.platformtools.c4.f192496b.f192497a;
        this.I = true;
        this.f142136J = false;
        this.K = new com.tencent.mm.plugin.gif.e(this);
        this.L = new com.tencent.mm.plugin.gif.f(this);
        this.M = new com.tencent.mm.plugin.gif.g(this);
        this.N = new com.tencent.mm.plugin.gif.h(this);
        this.P = new com.tencent.mm.plugin.gif.i(this);
        this.Q = new com.tencent.mm.plugin.gif.j(this);
        this.f142136J = z17;
        if (!android.text.TextUtils.isEmpty(str)) {
            this.G = com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().startPerformance(com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcGifEnable(), com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcGifDelay(), com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcGifCPU(), com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcGifIO(), com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcGifThr() ? android.os.Process.myTid() : 0, com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcGifTimeout(), 602, com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcGifAction(), "MicroMsg.GIF.MMGIFDrawable");
            try {
                this.f142139f = ((com.tencent.mm.feature.emoji.api.IGIFJNIService) i95.n0.c(com.tencent.mm.feature.emoji.api.IGIFJNIService.class)).openByFilePath(str, iArr);
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.GIF.MMGIFDrawable", th6, "[-] Fail to open gif.", new java.lang.Object[0]);
                this.f142139f = 0L;
            }
            f();
            return;
        }
        throw new java.lang.NullPointerException("file path is null.");
    }

    public k(java.lang.String str) {
        this.f142137d = true;
        this.f142138e = false;
        int[] iArr = new int[6];
        this.f142140g = iArr;
        this.f142141h = 1.0f;
        this.f142142i = 1.0f;
        this.f142144n = new android.graphics.Rect();
        this.f142145o = new android.graphics.Paint(6);
        this.f142148r = false;
        this.f142149s = 0;
        this.f142150t = -1;
        this.f142152v = 0L;
        this.f142153w = 0L;
        this.f142154x = 0L;
        this.f142155y = 0L;
        this.A = 0L;
        this.C = false;
        this.D = 0;
        this.E = 0;
        this.H = com.tencent.mm.sdk.platformtools.c4.f192496b.f192497a;
        this.I = true;
        this.f142136J = false;
        this.K = new com.tencent.mm.plugin.gif.e(this);
        this.L = new com.tencent.mm.plugin.gif.f(this);
        this.M = new com.tencent.mm.plugin.gif.g(this);
        this.N = new com.tencent.mm.plugin.gif.h(this);
        this.P = new com.tencent.mm.plugin.gif.i(this);
        this.Q = new com.tencent.mm.plugin.gif.j(this);
        if (!android.text.TextUtils.isEmpty(str)) {
            this.G = com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().startPerformance(com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcGifEnable(), com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcGifDelay(), com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcGifCPU(), com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcGifIO(), com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcGifThr() ? android.os.Process.myTid() : 0, com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcGifTimeout(), 602, com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcGifAction(), "MicroMsg.GIF.MMGIFDrawable");
            try {
                this.f142139f = ((com.tencent.mm.feature.emoji.api.IGIFJNIService) i95.n0.c(com.tencent.mm.feature.emoji.api.IGIFJNIService.class)).openByFilePath(kk.w.a(str, false), iArr);
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.GIF.MMGIFDrawable", th6, "[-] Fail to open gif.", new java.lang.Object[0]);
                this.f142139f = 0L;
            }
            f();
            return;
        }
        throw new java.lang.NullPointerException("file path is null.");
    }

    public k(java.io.InputStream inputStream) {
        this.f142137d = true;
        this.f142138e = false;
        int[] iArr = new int[6];
        this.f142140g = iArr;
        this.f142141h = 1.0f;
        this.f142142i = 1.0f;
        this.f142144n = new android.graphics.Rect();
        this.f142145o = new android.graphics.Paint(6);
        this.f142148r = false;
        this.f142149s = 0;
        this.f142150t = -1;
        this.f142152v = 0L;
        this.f142153w = 0L;
        this.f142154x = 0L;
        this.f142155y = 0L;
        this.A = 0L;
        this.C = false;
        this.D = 0;
        this.E = 0;
        this.H = com.tencent.mm.sdk.platformtools.c4.f192496b.f192497a;
        this.I = true;
        this.f142136J = false;
        this.K = new com.tencent.mm.plugin.gif.e(this);
        this.L = new com.tencent.mm.plugin.gif.f(this);
        this.M = new com.tencent.mm.plugin.gif.g(this);
        this.N = new com.tencent.mm.plugin.gif.h(this);
        this.P = new com.tencent.mm.plugin.gif.i(this);
        this.Q = new com.tencent.mm.plugin.gif.j(this);
        if (inputStream != null) {
            this.G = com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().startPerformance(com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcGifEnable(), com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcGifDelay(), com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcGifCPU(), com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcGifIO(), com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcGifThr() ? android.os.Process.myTid() : 0, com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcGifTimeout(), 602, com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcGifAction(), "MicroMsg.GIF.MMGIFDrawable");
            try {
                this.f142139f = ((com.tencent.mm.feature.emoji.api.IGIFJNIService) i95.n0.c(com.tencent.mm.feature.emoji.api.IGIFJNIService.class)).openByInputStrem(inputStream, iArr);
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.GIF.MMGIFDrawable", th6, "[-] Fail to open gif.", new java.lang.Object[0]);
                this.f142139f = 0L;
            }
            f();
            return;
        }
        throw new java.lang.NullPointerException("input stream is null.");
    }

    public k(byte[] bArr, java.lang.String str) {
        this(bArr, false);
        ((com.tencent.mm.feature.emoji.g) ((com.tencent.mm.feature.emoji.api.k5) i95.n0.c(com.tencent.mm.feature.emoji.api.k5.class))).getClass();
        android.graphics.Bitmap a17 = ar.c.f13356a.a(str);
        if (a17 != null) {
            this.f142147q = a17;
        }
    }

    public k(byte[] bArr, boolean z17) {
        this.f142137d = true;
        this.f142138e = false;
        int[] iArr = new int[6];
        this.f142140g = iArr;
        this.f142141h = 1.0f;
        this.f142142i = 1.0f;
        this.f142144n = new android.graphics.Rect();
        this.f142145o = new android.graphics.Paint(6);
        this.f142148r = false;
        this.f142149s = 0;
        this.f142150t = -1;
        this.f142152v = 0L;
        this.f142153w = 0L;
        this.f142154x = 0L;
        this.f142155y = 0L;
        this.A = 0L;
        this.C = false;
        this.D = 0;
        this.E = 0;
        this.H = com.tencent.mm.sdk.platformtools.c4.f192496b.f192497a;
        this.I = true;
        this.f142136J = false;
        this.K = new com.tencent.mm.plugin.gif.e(this);
        this.L = new com.tencent.mm.plugin.gif.f(this);
        this.M = new com.tencent.mm.plugin.gif.g(this);
        this.N = new com.tencent.mm.plugin.gif.h(this);
        this.P = new com.tencent.mm.plugin.gif.i(this);
        this.Q = new com.tencent.mm.plugin.gif.j(this);
        this.f142136J = z17;
        if (bArr != null) {
            this.G = com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().startPerformance(com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcGifEnable(), com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcGifDelay(), com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcGifCPU(), com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcGifIO(), com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcGifThr() ? android.os.Process.myTid() : 0, com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcGifTimeout(), 602, com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcGifAction(), "MicroMsg.GIF.MMGIFDrawable");
            try {
                this.f142139f = ((com.tencent.mm.feature.emoji.api.IGIFJNIService) i95.n0.c(com.tencent.mm.feature.emoji.api.IGIFJNIService.class)).openByByteArray(bArr, iArr);
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.GIF.MMGIFDrawable", th6, "[-] Fail to open gif.", new java.lang.Object[0]);
                this.f142139f = 0L;
            }
            f();
            return;
        }
        throw new java.lang.NullPointerException("bytes is null.");
    }
}
