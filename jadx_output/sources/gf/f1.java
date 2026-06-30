package gf;

/* loaded from: classes7.dex */
public abstract class f1 extends android.widget.FrameLayout implements pq5.a {

    /* renamed from: d, reason: collision with root package name */
    public android.view.WindowInsets f271047d;

    /* renamed from: e, reason: collision with root package name */
    public final gf.z f271048e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f271049f;

    /* renamed from: g, reason: collision with root package name */
    public int f271050g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f271051h;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.Bitmap f271052i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.Runnable f271053m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View.OnApplyWindowInsetsListener f271054n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f271055o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedHashSet f271056p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f271057q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.Runnable f271058r;

    /* renamed from: s, reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.FlutterUiDisplayListener f271059s;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.Runnable f271060t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f271048e = new gf.z(this);
        this.f271053m = new gf.e1(this);
        this.f271056p = new java.util.LinkedHashSet();
        this.f271057q = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        this.f271058r = new gf.a1(this);
        this.f271059s = new gf.b1(this);
        this.f271060t = new gf.d1(this);
    }

    public final void a() {
        this.f271057q.removeCallbacks(this.f271053m);
        android.widget.ImageView imageView = this.f271051h;
        if (imageView != null) {
            removeView(imageView);
            imageView.setImageBitmap(null);
        }
        this.f271051h = null;
        android.graphics.Bitmap bitmap = this.f271052i;
        if (bitmap != null && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        this.f271052i = null;
    }

    @Override // pq5.a
    public boolean c0(android.graphics.Canvas canvas) {
        io.flutter.embedding.engine.renderer.FlutterRenderer flutterRenderer;
        android.graphics.Bitmap bitmap;
        kotlin.jvm.internal.o.g(canvas, "canvas");
        java.util.Iterator it = this.f271056p.iterator();
        while (true) {
            if (!it.hasNext()) {
                flutterRenderer = null;
                break;
            }
            io.flutter.embedding.engine.FlutterEngine attachedFlutterEngine = ((io.flutter.embedding.android.FlutterView) it.next()).getAttachedFlutterEngine();
            flutterRenderer = attachedFlutterEngine != null ? attachedFlutterEngine.getRenderer() : null;
            if (flutterRenderer != null) {
                break;
            }
        }
        if (flutterRenderer == null || (bitmap = flutterRenderer.getBitmap()) == null || bitmap.isRecycled()) {
            return true;
        }
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (android.graphics.Paint) null);
        return true;
    }

    public final void d() {
        io.flutter.embedding.engine.FlutterEngine attachedFlutterEngine;
        io.flutter.embedding.engine.renderer.FlutterRenderer renderer;
        a();
        io.flutter.embedding.android.FlutterView flutterView = (io.flutter.embedding.android.FlutterView) kz5.n0.Y(this.f271056p);
        android.graphics.Bitmap bitmap = (flutterView == null || (attachedFlutterEngine = flutterView.getAttachedFlutterEngine()) == null || (renderer = attachedFlutterEngine.getRenderer()) == null) ? null : renderer.getBitmap();
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        android.graphics.Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            config = android.graphics.Bitmap.Config.ARGB_8888;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Boolean.FALSE);
        arrayList.add(config);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(bitmap, arrayList.toArray(), "com/tencent/luggage/skyline/wxa/SkylineScreenshotLayout", "showSheetModeCover", "()V", "android/graphics/Bitmap_EXEC_", "copy", "(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap copy = bitmap.copy((android.graphics.Bitmap.Config) arrayList.get(0), ((java.lang.Boolean) arrayList.get(1)).booleanValue());
        yj0.a.e(bitmap, copy, "com/tencent/luggage/skyline/wxa/SkylineScreenshotLayout", "showSheetModeCover", "()V", "android/graphics/Bitmap_EXEC_", "copy", "(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;");
        if (copy == null) {
            return;
        }
        android.widget.ImageView imageView = new android.widget.ImageView(getContext());
        imageView.setScaleType(android.widget.ImageView.ScaleType.FIT_START);
        imageView.setImageBitmap(copy);
        int width = flutterView.getWidth();
        if (width < 1) {
            width = 1;
        }
        int height = flutterView.getHeight();
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(width, height >= 1 ? height : 1);
        layoutParams.gravity = 48;
        addView(imageView, layoutParams);
        this.f271051h = imageView;
        this.f271052i = copy;
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f271057q;
        java.lang.Runnable runnable = this.f271053m;
        n3Var.removeCallbacks(runnable);
        n3Var.postDelayed(runnable, 100L);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent ev6) {
        kotlin.jvm.internal.o.g(ev6, "ev");
        super.dispatchTouchEvent(ev6);
        if (this.f271055o && (ev6.getAction() == 0 || ev6.getAction() == 5)) {
            com.tencent.mm.sdk.platformtools.n3 n3Var = this.f271057q;
            n3Var.removeCallbacks(this.f271060t);
            java.lang.Runnable runnable = this.f271058r;
            n3Var.removeCallbacks(runnable);
            ((gf.a1) runnable).run();
        }
        return !this.f271056p.isEmpty();
    }

    public final boolean getEnableFixSize() {
        return this.f271049f;
    }

    public final boolean getEnabledSnapshotCover() {
        return this.f271055o;
    }

    public final int getFixedHeight() {
        return this.f271050g;
    }

    public final gf.z getFlutterViewportMetricsCompat$luggage_skyline_ext_release() {
        return this.f271048e;
    }

    public final android.view.View.OnApplyWindowInsetsListener getNoInterceptOnApplyWindowInsetsListener() {
        return this.f271054n;
    }

    @Override // android.view.ViewGroup
    public void measureChild(android.view.View view, int i17, int i18) {
        if (!this.f271049f || this.f271050g <= 0 || view == null) {
            super.measureChild(view, i17, i18);
        } else {
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            view.measure(android.view.ViewGroup.getChildMeasureSpec(i17, getPaddingLeft() + getPaddingRight(), layoutParams.width), android.view.ViewGroup.getChildMeasureSpec(android.view.View.MeasureSpec.makeMeasureSpec(this.f271050g, 1073741824), getPaddingTop() + getPaddingBottom(), layoutParams.height));
        }
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(android.view.View view, int i17, int i18, int i19, int i27) {
        if (!this.f271049f || this.f271050g <= 0 || view == null) {
            super.measureChildWithMargins(view, i17, i18, i19, i27);
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams == null) {
            super.measureChildWithMargins(view, i17, i18, i19, i27);
        } else {
            view.measure(android.view.ViewGroup.getChildMeasureSpec(i17, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i18, marginLayoutParams.width), android.view.ViewGroup.getChildMeasureSpec(android.view.View.MeasureSpec.makeMeasureSpec(this.f271050g, 1073741824), getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i27, marginLayoutParams.height));
        }
    }

    @Override // android.view.View
    public android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets insets) {
        kotlin.jvm.internal.o.g(insets, "insets");
        android.view.WindowInsets onApplyWindowInsets = super.onApplyWindowInsets(insets);
        if (!(!this.f271056p.isEmpty())) {
            this.f271047d = new android.view.WindowInsets(onApplyWindowInsets);
            int i17 = android.os.Build.VERSION.SDK_INT;
            gf.z zVar = this.f271048e;
            io.flutter.embedding.engine.renderer.FlutterRenderer.ViewportMetrics viewportMetrics = zVar.f271194a;
            if (i17 == 29) {
                android.graphics.Insets systemGestureInsets = insets.getSystemGestureInsets();
                viewportMetrics.systemGestureInsetTop = systemGestureInsets.top;
                viewportMetrics.systemGestureInsetRight = systemGestureInsets.right;
                viewportMetrics.systemGestureInsetBottom = systemGestureInsets.bottom;
                viewportMetrics.systemGestureInsetLeft = systemGestureInsets.left;
            }
            android.view.View view = zVar.f271195b;
            boolean z17 = (view.getWindowSystemUiVisibility() & 4) == 0;
            boolean z18 = (view.getWindowSystemUiVisibility() & 2) == 0;
            if (i17 >= 30) {
                int navigationBars = z18 ? 0 | android.view.WindowInsets.Type.navigationBars() : 0;
                if (z17) {
                    navigationBars |= android.view.WindowInsets.Type.statusBars();
                }
                android.graphics.Insets insets2 = insets.getInsets(navigationBars);
                viewportMetrics.viewPaddingTop = insets2.top;
                viewportMetrics.viewPaddingRight = insets2.right;
                viewportMetrics.viewPaddingBottom = insets2.bottom;
                viewportMetrics.viewPaddingLeft = insets2.left;
                android.graphics.Insets insets3 = insets.getInsets(android.view.WindowInsets.Type.ime());
                viewportMetrics.viewInsetTop = insets3.top;
                viewportMetrics.viewInsetRight = insets3.right;
                viewportMetrics.viewInsetBottom = insets3.bottom;
                viewportMetrics.viewInsetLeft = insets3.left;
                android.graphics.Insets insets4 = insets.getInsets(android.view.WindowInsets.Type.systemGestures());
                viewportMetrics.systemGestureInsetTop = insets4.top;
                viewportMetrics.systemGestureInsetRight = insets4.right;
                viewportMetrics.systemGestureInsetBottom = insets4.bottom;
                viewportMetrics.systemGestureInsetLeft = insets4.left;
                android.view.DisplayCutout displayCutout = insets.getDisplayCutout();
                if (displayCutout != null) {
                    android.graphics.Insets waterfallInsets = displayCutout.getWaterfallInsets();
                    viewportMetrics.viewPaddingTop = java.lang.Math.max(java.lang.Math.max(viewportMetrics.viewPaddingTop, waterfallInsets.top), displayCutout.getSafeInsetTop());
                    viewportMetrics.viewPaddingRight = java.lang.Math.max(java.lang.Math.max(viewportMetrics.viewPaddingRight, waterfallInsets.right), displayCutout.getSafeInsetRight());
                    viewportMetrics.viewPaddingBottom = java.lang.Math.max(java.lang.Math.max(viewportMetrics.viewPaddingBottom, waterfallInsets.bottom), displayCutout.getSafeInsetBottom());
                    viewportMetrics.viewPaddingLeft = java.lang.Math.max(java.lang.Math.max(viewportMetrics.viewPaddingLeft, waterfallInsets.left), displayCutout.getSafeInsetLeft());
                }
            } else {
                gf.y yVar = gf.y.NONE;
                gf.y yVar2 = gf.y.LEFT;
                gf.y yVar3 = gf.y.RIGHT;
                gf.y yVar4 = gf.y.BOTH;
                if (!z18) {
                    android.content.Context context = view.getContext();
                    int i18 = context.getResources().getConfiguration().orientation;
                    int rotation = ((android.view.WindowManager) b3.l.getSystemService(context, android.view.WindowManager.class)).getDefaultDisplay().getRotation();
                    if (i18 == 2) {
                        if (rotation == 1) {
                            yVar = yVar3;
                        } else if (rotation == 3) {
                            yVar = yVar2;
                        } else if (rotation == 0 || rotation == 2) {
                            yVar = yVar4;
                        }
                    }
                }
                viewportMetrics.viewPaddingTop = z17 ? insets.getSystemWindowInsetTop() : 0;
                viewportMetrics.viewPaddingRight = (yVar == yVar3 || yVar == yVar4) ? 0 : insets.getSystemWindowInsetRight();
                viewportMetrics.viewPaddingBottom = (z18 && zVar.a(insets) == 0) ? insets.getSystemWindowInsetBottom() : 0;
                viewportMetrics.viewPaddingLeft = (yVar == yVar2 || yVar == yVar4) ? 0 : insets.getSystemWindowInsetLeft();
                viewportMetrics.viewInsetTop = 0;
                viewportMetrics.viewInsetRight = 0;
                viewportMetrics.viewInsetBottom = zVar.a(insets);
                viewportMetrics.viewInsetLeft = 0;
            }
            int i19 = viewportMetrics.viewPaddingTop;
        }
        android.view.View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f271054n;
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(this, onApplyWindowInsets);
        }
        kotlin.jvm.internal.o.f(onApplyWindowInsets, "also(...)");
        return onApplyWindowInsets;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(android.view.View view) {
        super.onViewAdded(view);
        if (view instanceof io.flutter.embedding.android.FlutterView) {
            this.f271056p.add(view);
            android.view.WindowInsets windowInsets = this.f271047d;
            if (windowInsets != null) {
                ((io.flutter.embedding.android.FlutterView) view).dispatchApplyWindowInsets(windowInsets);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(android.view.View view) {
        super.onViewRemoved(view);
        if (view instanceof io.flutter.embedding.android.FlutterView) {
            this.f271056p.remove(view);
        }
    }

    public final void setEnableFixSize(boolean z17) {
        if (this.f271049f != z17) {
            this.f271049f = z17;
            if (z17) {
                requestLayout();
            }
        }
    }

    public final void setEnabledSnapshotCover(boolean z17) {
        this.f271055o = z17;
        if (z17) {
            return;
        }
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f271057q;
        n3Var.removeCallbacks(this.f271060t);
        n3Var.removeCallbacks(this.f271058r);
    }

    public final void setFixedHeight(int i17) {
        if (this.f271050g != i17) {
            this.f271050g = i17;
            if (!this.f271049f || i17 <= 0) {
                return;
            }
            requestLayout();
        }
    }

    public final void setNoInterceptOnApplyWindowInsetsListener(android.view.View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.f271054n = onApplyWindowInsetsListener;
    }

    public final void setSheetMode(boolean z17) {
    }
}
