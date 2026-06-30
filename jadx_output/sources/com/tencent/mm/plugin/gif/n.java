package com.tencent.mm.plugin.gif;

/* loaded from: classes10.dex */
public class n extends com.tencent.mm.plugin.gif.b {
    public final android.content.res.Resources A;

    /* renamed from: e, reason: collision with root package name */
    public final int f142160e;

    /* renamed from: f, reason: collision with root package name */
    public final int f142161f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f142162g;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.Bitmap f142164i;

    /* renamed from: m, reason: collision with root package name */
    public final int f142165m;

    /* renamed from: n, reason: collision with root package name */
    public final int f142166n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f142167o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f142168p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f142169q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f142170r;

    /* renamed from: s, reason: collision with root package name */
    public int f142171s;

    /* renamed from: v, reason: collision with root package name */
    public boolean f142174v;

    /* renamed from: z, reason: collision with root package name */
    public final android.content.Context f142178z;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f142159d = false;

    /* renamed from: h, reason: collision with root package name */
    public int f142163h = 0;

    /* renamed from: t, reason: collision with root package name */
    public float f142172t = 1.0f;

    /* renamed from: u, reason: collision with root package name */
    public float f142173u = 1.0f;

    /* renamed from: w, reason: collision with root package name */
    public final android.graphics.Rect f142175w = new android.graphics.Rect();

    /* renamed from: x, reason: collision with root package name */
    public final android.graphics.Paint f142176x = new android.graphics.Paint(6);

    /* renamed from: y, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f142177y = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
    public long B = 0;
    public final java.lang.Runnable C = new com.tencent.mm.plugin.gif.l(this);
    public final java.lang.Runnable D = new com.tencent.mm.plugin.gif.m(this);

    public n(android.content.Context context, boolean z17, boolean z18, boolean z19, int i17, int[] iArr, java.lang.String str) {
        this.f142164i = null;
        this.f142167o = false;
        this.f142168p = true;
        this.f142169q = true;
        this.f142171s = 0;
        this.f142178z = context;
        android.content.res.Resources resources = context.getResources();
        this.A = resources;
        this.f142167o = z17;
        this.f142168p = z18;
        this.f142169q = z19;
        this.f142170r = str;
        this.f142161f = i17;
        this.f142162g = iArr;
        if (z17) {
            this.f142164i = e(i17);
        } else if (z18) {
            this.f142164i = e(iArr[0]);
        } else {
            int identifier = resources.getIdentifier(str.split("\\.")[0], "drawable", context.getPackageName());
            context.getPackageName();
            this.f142164i = e(identifier);
        }
        android.graphics.Bitmap bitmap = this.f142164i;
        if (bitmap != null) {
            this.f142165m = bitmap.getWidth();
            this.f142166n = this.f142164i.getHeight();
        } else {
            this.f142165m = 1;
            this.f142166n = 1;
        }
        if (iArr.length == 3) {
            this.f142160e = 300;
        } else {
            this.f142160e = 100;
        }
        this.f142171s = 0;
    }

    @Override // com.tencent.mm.plugin.gif.b
    public void a() {
    }

    @Override // com.tencent.mm.plugin.gif.b
    public void b() {
    }

    @Override // com.tencent.mm.plugin.gif.b
    public void c() {
    }

    @Override // com.tencent.mm.plugin.gif.b
    public void d() {
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        boolean z17 = this.f142174v;
        android.graphics.Rect rect = this.f142175w;
        if (z17) {
            rect.set(getBounds());
            this.f142172t = rect.width() / this.f142165m;
            this.f142173u = rect.height() / this.f142166n;
            this.f142174v = false;
        }
        android.graphics.Paint paint = this.f142176x;
        if (paint.getShader() != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GIF.MMGIFGameDrawable", "shader is not null.");
            canvas.drawRect(rect, paint);
            return;
        }
        canvas.scale(this.f142172t, this.f142173u);
        if (this.f142167o) {
            android.graphics.Bitmap e17 = e(this.f142161f);
            this.f142164i = e17;
            if (e17 == null || e17.isRecycled()) {
                return;
            }
            canvas.drawBitmap(this.f142164i, 0.0f, 0.0f, paint);
            return;
        }
        if (!this.f142168p) {
            java.lang.String str = this.f142170r.split("\\.")[0];
            android.content.Context context = this.f142178z;
            int identifier = this.A.getIdentifier(str, "drawable", context.getPackageName());
            context.getPackageName();
            android.graphics.Bitmap e18 = e(identifier);
            this.f142164i = e18;
            if (e18 == null || e18.isRecycled()) {
                return;
            }
            canvas.drawBitmap(this.f142164i, 0.0f, 0.0f, paint);
            return;
        }
        int i17 = this.f142163h;
        int[] iArr = this.f142162g;
        android.graphics.Bitmap e19 = e(iArr[i17]);
        this.f142164i = e19;
        if (e19 != null && !e19.isRecycled()) {
            canvas.drawBitmap(this.f142164i, 0.0f, 0.0f, paint);
        }
        int i18 = this.f142163h + 1;
        this.f142163h = i18;
        int i19 = this.f142171s;
        java.lang.Runnable runnable = this.C;
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f142177y;
        int i27 = this.f142160e;
        if (i19 < 3) {
            if (i18 >= iArr.length) {
                this.f142163h = 0;
                if (this.f142169q) {
                    this.f142171s = i19 + 1;
                } else {
                    this.f142171s = 0;
                }
            }
            long j17 = i27;
            this.B = android.os.SystemClock.uptimeMillis() + j17;
            if (n3Var != null) {
                n3Var.postDelayed(runnable, j17);
                return;
            }
            return;
        }
        this.f142168p = false;
        long j18 = i27;
        this.B = android.os.SystemClock.uptimeMillis() + j18;
        if (n3Var != null) {
            n3Var.postDelayed(runnable, j18);
        }
        java.lang.Runnable runnable2 = this.D;
        this.B = android.os.SystemClock.uptimeMillis() + 0;
        if (n3Var != null) {
            n3Var.postDelayed(runnable2, 0L);
        }
    }

    public android.graphics.Bitmap e(int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(this.A);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/gif/MMGIFGameDrawable", "getBitmap", "(I)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeResource = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue());
        yj0.a.e(obj, decodeResource, "com/tencent/mm/plugin/gif/MMGIFGameDrawable", "getBitmap", "(I)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        return decodeResource;
    }

    public void finalize() {
        super.finalize();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f142166n;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f142165m;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f142159d;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(android.graphics.Rect rect) {
        super.onBoundsChange(rect);
        this.f142174v = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i17) {
        this.f142176x.setAlpha(i17);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.f142176x.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f142159d = true;
        this.f142177y.post(this.C);
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f142159d = false;
    }
}
