package mk4;

/* loaded from: classes14.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.FrameLayout f327154a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f327155b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.ImageView f327156c;

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Bitmap f327157d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Bitmap f327158e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f327159f;

    public h(android.widget.FrameLayout container) {
        kotlin.jvm.internal.o.g(container, "container");
        this.f327154a = container;
        this.f327155b = "MMSurfaceViewSwitchHelper";
        android.widget.ImageView imageView = new android.widget.ImageView(container.getContext());
        imageView.setTag("MMSurfaceViewSwitchHelper.COVER_VIEW");
        this.f327156c = imageView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(mk4.b renderView, android.view.Surface surface, android.graphics.Bitmap bitmap) {
        kotlin.jvm.internal.o.g(renderView, "renderView");
        this.f327157d = bitmap;
        if ((surface == null || surface.isValid()) ? false : true) {
            com.tencent.mars.xlog.Log.i(d(), "captureFrame return for surface:" + surface + " isValid:" + surface.isValid() + '.');
            return;
        }
        com.tencent.mars.xlog.Log.i(d(), "captureFrame begin.");
        if (!(renderView instanceof android.view.SurfaceView)) {
            if (renderView instanceof android.view.TextureView) {
                this.f327158e = renderView.getBitmap();
                return;
            }
            return;
        }
        try {
            kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
            int width = ((android.view.SurfaceView) renderView).getWidth();
            int height = ((android.view.SurfaceView) renderView).getHeight();
            android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(config);
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(height));
            arrayList.add(java.lang.Integer.valueOf(width));
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/thumbplayer/render/MMSurfaceViewSwitchHelper", "captureFrame", "(Lcom/tencent/mm/plugin/thumbplayer/render/IMMRenderView;Landroid/view/Surface;Landroid/graphics/Bitmap;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
            yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/thumbplayer/render/MMSurfaceViewSwitchHelper", "captureFrame", "(Lcom/tencent/mm/plugin/thumbplayer/render/IMMRenderView;Landroid/view/Surface;Landroid/graphics/Bitmap;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            kotlin.jvm.internal.o.f(createBitmap, "createBitmap(...)");
            h0Var.f310123d = createBitmap;
            android.view.PixelCopy.request((android.view.SurfaceView) renderView, createBitmap, new mk4.e(this, h0Var), new android.os.Handler(android.os.Looper.getMainLooper()));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.w("MMSurfaceViewSwitchHelper", "captureFrame e:" + th6);
        }
    }

    public final void b() {
        com.tencent.mars.xlog.Log.i(d(), "detach captureBitmap:" + this.f327158e + " defaultBitmap:" + this.f327157d);
        this.f327159f = false;
        this.f327157d = null;
        c();
    }

    public final void c() {
        jz5.f0 f0Var;
        try {
            if (this.f327154a.findViewWithTag("MMSurfaceViewSwitchHelper.COVER_VIEW") != null) {
                pm0.v.X(new mk4.f(this));
                f0Var = jz5.f0.f302826a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                com.tencent.mars.xlog.Log.w(d(), "dismissCoverBitmap ignore captureBitmap:" + this.f327158e + '.');
            }
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.e(d(), "dismissCoverBitmap");
        }
        this.f327158e = null;
    }

    public final java.lang.String d() {
        return this.f327155b + '.' + this.f327159f;
    }

    public final void e(android.view.View renderView) {
        jz5.f0 f0Var;
        kotlin.jvm.internal.o.g(renderView, "renderView");
        android.view.View findViewWithTag = this.f327154a.findViewWithTag("MMSurfaceViewSwitchHelper.COVER_VIEW");
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        if (findViewWithTag != null) {
            com.tencent.mars.xlog.Log.w(d(), "showCoverBitmap return for duplicated.");
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            android.graphics.Bitmap bitmap = this.f327158e;
            if (bitmap != null) {
                f(renderView, bitmap, " captureFrame success.");
            } else {
                f0Var2 = null;
            }
            if (f0Var2 == null) {
                f(renderView, this.f327157d, "captureFrame fail.");
            }
        }
    }

    public final void f(android.view.View view, android.graphics.Bitmap bitmap, java.lang.String str) {
        if (bitmap != null) {
            pm0.v.X(new mk4.g(this, str, bitmap, view));
            return;
        }
        com.tencent.mars.xlog.Log.w(d(), "showCoverBitmapInternal " + str + " return for null.");
    }
}
