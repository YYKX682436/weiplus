package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget;

/* loaded from: classes4.dex */
public class CircularImageView extends android.widget.ImageView {

    /* renamed from: d, reason: collision with root package name */
    public boolean f165873d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f165874e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f165875f;

    /* renamed from: g, reason: collision with root package name */
    public int f165876g;

    /* renamed from: h, reason: collision with root package name */
    public int f165877h;

    /* renamed from: i, reason: collision with root package name */
    public int f165878i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f165879m;

    /* renamed from: n, reason: collision with root package name */
    public float f165880n;

    /* renamed from: o, reason: collision with root package name */
    public float f165881o;

    /* renamed from: p, reason: collision with root package name */
    public float f165882p;

    /* renamed from: q, reason: collision with root package name */
    public int f165883q;

    /* renamed from: r, reason: collision with root package name */
    public android.graphics.BitmapShader f165884r;

    /* renamed from: s, reason: collision with root package name */
    public android.graphics.Bitmap f165885s;

    /* renamed from: t, reason: collision with root package name */
    public android.graphics.Paint f165886t;

    /* renamed from: u, reason: collision with root package name */
    public android.graphics.Paint f165887u;

    /* renamed from: v, reason: collision with root package name */
    public android.graphics.Paint f165888v;

    /* renamed from: w, reason: collision with root package name */
    public android.graphics.ColorFilter f165889w;

    public CircularImageView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public android.graphics.Bitmap a(android.graphics.drawable.Drawable drawable) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("drawableToBitmap", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
        if (drawable == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("drawableToBitmap", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
            return null;
        }
        if (drawable instanceof android.graphics.drawable.BitmapDrawable) {
            android.graphics.Bitmap bitmap = ((android.graphics.drawable.BitmapDrawable) drawable).getBitmap();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("drawableToBitmap", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
            return bitmap;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("drawableToBitmap", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
            return null;
        }
        try {
            android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(config);
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(intrinsicHeight));
            arrayList.add(java.lang.Integer.valueOf(intrinsicWidth));
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/widget/CircularImageView", "drawableToBitmap", "(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
            yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/widget/CircularImageView", "drawableToBitmap", "(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("drawableToBitmap", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
            return createBitmap;
        } catch (java.lang.OutOfMemoryError unused) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("drawableToBitmap", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
            return null;
        }
    }

    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateBitmapShader", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
        if (this.f165885s == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateBitmapShader", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
            return;
        }
        android.graphics.Bitmap bitmap = this.f165885s;
        android.graphics.Shader.TileMode tileMode = android.graphics.Shader.TileMode.CLAMP;
        this.f165884r = new android.graphics.BitmapShader(bitmap, tileMode, tileMode);
        if (this.f165877h != this.f165885s.getWidth() || this.f165877h != this.f165885s.getHeight()) {
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            float width = this.f165877h / this.f165885s.getWidth();
            matrix.setScale(width, width);
            this.f165884r.setLocalMatrix(matrix);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateBitmapShader", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dispatchTouchEvent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
        if (!isClickable()) {
            this.f165875f = false;
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dispatchTouchEvent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
            return onTouchEvent;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f165875f = true;
        } else if (action == 1 || action == 3 || action == 4 || action == 8) {
            this.f165875f = false;
        }
        invalidate();
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dispatchTouchEvent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
        return dispatchTouchEvent;
    }

    @Override // android.view.View
    public boolean isSelected() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSelected", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
        boolean z17 = this.f165875f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSelected", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
        return z17;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        int i17;
        int i18;
        int i19;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDraw", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
        android.graphics.Bitmap bitmap = this.f165885s;
        if (bitmap == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDraw", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
            return;
        }
        if (bitmap.getHeight() == 0 || this.f165885s.getWidth() == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDraw", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
            return;
        }
        int i27 = this.f165877h;
        int width = getWidth() < getHeight() ? getWidth() : getHeight();
        this.f165877h = width;
        if (i27 != width) {
            b();
        }
        this.f165886t.setShader(this.f165884r);
        int i28 = this.f165877h;
        int i29 = i28 / 2;
        if (this.f165874e && this.f165875f) {
            i18 = this.f165878i;
            i19 = (i28 - (i18 * 2)) / 2;
            this.f165886t.setColorFilter(this.f165889w);
            float f17 = i19 + i18;
            canvas.drawCircle(f17, f17, (((this.f165877h - r4) / 2) + i18) - 4.0f, this.f165888v);
        } else {
            if (!this.f165873d) {
                this.f165886t.setColorFilter(null);
                i17 = 0;
                float f18 = i29 + i17;
                canvas.drawCircle(f18, f18, (this.f165877h - (i17 * 2)) / 2, this.f165886t);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDraw", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
            }
            i18 = this.f165876g;
            i19 = (i28 - (i18 * 2)) / 2;
            this.f165886t.setColorFilter(null);
            float f19 = (i18 / 2) + 0;
            int i37 = this.f165877h;
            canvas.drawArc(new android.graphics.RectF(f19, f19, i37 - r4, i37 - r4), 360.0f, 360.0f, false, this.f165887u);
        }
        int i38 = i18;
        i29 = i19;
        i17 = i38;
        float f182 = i29 + i17;
        canvas.drawCircle(f182, f182, (this.f165877h - (i17 * 2)) / 2, this.f165886t);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDraw", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMeasure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("measureWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
        int mode = android.view.View.MeasureSpec.getMode(i17);
        int size = android.view.View.MeasureSpec.getSize(i17);
        if (mode != 1073741824 && mode != Integer.MIN_VALUE) {
            size = this.f165877h;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("measureWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("measureHeight", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
        int mode2 = android.view.View.MeasureSpec.getMode(i18);
        int size2 = android.view.View.MeasureSpec.getSize(i18);
        if (mode2 != 1073741824 && mode2 != Integer.MIN_VALUE) {
            size2 = this.f165877h;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("measureHeight", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
        setMeasuredDimension(size, size2 + 2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMeasure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
    }

    public void setBorderColor(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setBorderColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
        android.graphics.Paint paint = this.f165887u;
        if (paint != null) {
            paint.setColor(i17);
        }
        invalidate();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBorderColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
    }

    public void setBorderWidth(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setBorderWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
        this.f165876g = i17;
        android.graphics.Paint paint = this.f165887u;
        if (paint != null) {
            paint.setStrokeWidth(i17);
        }
        requestLayout();
        invalidate();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBorderWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
    }

    public void setIconModeEnabled(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setIconModeEnabled", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setIconModeEnabled", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(android.graphics.Bitmap bitmap) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setImageBitmap", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
        super.setImageBitmap(bitmap);
        this.f165885s = bitmap;
        if (this.f165877h > 0) {
            b();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setImageBitmap", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(android.graphics.drawable.Drawable drawable) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setImageDrawable", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
        super.setImageDrawable(drawable);
        this.f165885s = a(getDrawable());
        if (this.f165877h > 0) {
            b();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setImageDrawable", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setImageResource", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
        super.setImageResource(i17);
        this.f165885s = a(getDrawable());
        if (this.f165877h > 0) {
            b();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setImageResource", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
    }

    @Override // android.widget.ImageView
    public void setImageURI(android.net.Uri uri) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setImageURI", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
        super.setImageURI(uri);
        this.f165885s = a(getDrawable());
        if (this.f165877h > 0) {
            b();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setImageURI", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
    }

    public void setSelectorColor(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSelectorColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
        this.f165889w = new android.graphics.PorterDuffColorFilter(i17, android.graphics.PorterDuff.Mode.SRC_ATOP);
        invalidate();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSelectorColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
    }

    public void setSelectorStrokeColor(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSelectorStrokeColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
        android.graphics.Paint paint = this.f165888v;
        if (paint != null) {
            paint.setColor(i17);
        }
        invalidate();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSelectorStrokeColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
    }

    public void setSelectorStrokeWidth(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSelectorStrokeWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
        this.f165878i = i17;
        requestLayout();
        invalidate();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSelectorStrokeWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
    }

    public void setShadowEnabled(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setShadowEnabled", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
        this.f165879m = z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateShadow", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
        float f17 = this.f165879m ? this.f165880n : 0.0f;
        this.f165887u.setShadowLayer(f17, this.f165881o, this.f165882p, this.f165883q);
        this.f165888v.setShadowLayer(f17, this.f165881o, this.f165882p, this.f165883q);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateShadow", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setShadowEnabled", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
    }

    public CircularImageView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f165886t = paint;
        paint.setAntiAlias(true);
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.f165887u = paint2;
        paint2.setAntiAlias(true);
        this.f165887u.setStyle(android.graphics.Paint.Style.STROKE);
        android.graphics.Paint paint3 = new android.graphics.Paint();
        this.f165888v = paint3;
        paint3.setAntiAlias(true);
        setLayerType(1, null);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n34.w2.f334764a, i17, 0);
        this.f165873d = obtainStyledAttributes.getBoolean(0, false);
        this.f165874e = obtainStyledAttributes.getBoolean(3, false);
        this.f165879m = obtainStyledAttributes.getBoolean(7, false);
        if (this.f165873d) {
            setBorderWidth(obtainStyledAttributes.getDimensionPixelOffset(2, (int) ((context.getResources().getDisplayMetrics().density * 2.0f) + 0.5f)));
            setBorderColor(obtainStyledAttributes.getColor(1, -1));
        }
        if (this.f165874e) {
            int i18 = (int) ((context.getResources().getDisplayMetrics().density * 2.0f) + 0.5f);
            setSelectorColor(obtainStyledAttributes.getColor(4, 0));
            setSelectorStrokeWidth(obtainStyledAttributes.getDimensionPixelOffset(6, i18));
            setSelectorStrokeColor(obtainStyledAttributes.getColor(5, -16776961));
        }
        if (this.f165879m) {
            this.f165880n = obtainStyledAttributes.getFloat(11, 4.0f);
            this.f165881o = obtainStyledAttributes.getFloat(9, 0.0f);
            this.f165882p = obtainStyledAttributes.getFloat(10, 2.0f);
            this.f165883q = obtainStyledAttributes.getColor(8, -16777216);
            setShadowEnabled(true);
        }
        obtainStyledAttributes.recycle();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
    }
}
