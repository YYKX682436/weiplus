package com.tencent.mm.plugin.game.widget;

/* loaded from: classes4.dex */
public class CircleImageView extends android.widget.ImageView {

    /* renamed from: x, reason: collision with root package name */
    public static final android.widget.ImageView.ScaleType f141933x = android.widget.ImageView.ScaleType.CENTER_CROP;

    /* renamed from: y, reason: collision with root package name */
    public static final android.graphics.Bitmap.Config f141934y = android.graphics.Bitmap.Config.ARGB_8888;

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.RectF f141935d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.RectF f141936e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Matrix f141937f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.Paint f141938g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.Paint f141939h;

    /* renamed from: i, reason: collision with root package name */
    public int f141940i;

    /* renamed from: m, reason: collision with root package name */
    public int f141941m;

    /* renamed from: n, reason: collision with root package name */
    public android.graphics.Bitmap f141942n;

    /* renamed from: o, reason: collision with root package name */
    public android.graphics.BitmapShader f141943o;

    /* renamed from: p, reason: collision with root package name */
    public int f141944p;

    /* renamed from: q, reason: collision with root package name */
    public int f141945q;

    /* renamed from: r, reason: collision with root package name */
    public float f141946r;

    /* renamed from: s, reason: collision with root package name */
    public float f141947s;

    /* renamed from: t, reason: collision with root package name */
    public android.graphics.ColorFilter f141948t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f141949u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f141950v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f141951w;

    public CircleImageView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final android.graphics.Bitmap a(android.graphics.drawable.Drawable drawable) {
        android.graphics.Bitmap bitmap;
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof android.graphics.drawable.BitmapDrawable) {
            return ((android.graphics.drawable.BitmapDrawable) drawable).getBitmap();
        }
        try {
            boolean z17 = drawable instanceof android.graphics.drawable.ColorDrawable;
            android.graphics.Bitmap.Config config = f141934y;
            if (z17) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(config);
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(2);
                arrayList.add(2);
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/game/widget/CircleImageView", "getBitmapFromDrawable", "(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                bitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
                yj0.a.e(obj, bitmap, "com/tencent/mm/plugin/game/widget/CircleImageView", "getBitmapFromDrawable", "(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            } else {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(config);
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(java.lang.Integer.valueOf(intrinsicHeight));
                arrayList2.add(java.lang.Integer.valueOf(intrinsicWidth));
                java.lang.Object obj2 = new java.lang.Object();
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/mm/plugin/game/widget/CircleImageView", "getBitmapFromDrawable", "(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList2.get(0)).intValue(), ((java.lang.Integer) arrayList2.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList2.get(2));
                yj0.a.e(obj2, createBitmap, "com/tencent/mm/plugin/game/widget/CircleImageView", "getBitmapFromDrawable", "(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                bitmap = createBitmap;
            }
            android.graphics.Canvas canvas = new android.graphics.Canvas(bitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return bitmap;
        } catch (java.lang.OutOfMemoryError unused) {
            return null;
        }
    }

    public final void b() {
        float width;
        float height;
        if (!this.f141949u) {
            this.f141950v = true;
            return;
        }
        if (this.f141942n == null) {
            return;
        }
        android.graphics.Bitmap bitmap = this.f141942n;
        android.graphics.Shader.TileMode tileMode = android.graphics.Shader.TileMode.CLAMP;
        this.f141943o = new android.graphics.BitmapShader(bitmap, tileMode, tileMode);
        android.graphics.Paint paint = this.f141938g;
        paint.setAntiAlias(true);
        paint.setShader(this.f141943o);
        android.graphics.Paint.Style style = android.graphics.Paint.Style.STROKE;
        android.graphics.Paint paint2 = this.f141939h;
        paint2.setStyle(style);
        paint2.setAntiAlias(true);
        paint2.setColor(this.f141940i);
        paint2.setStrokeWidth(this.f141941m);
        this.f141945q = this.f141942n.getHeight();
        this.f141944p = this.f141942n.getWidth();
        float width2 = getWidth();
        float height2 = getHeight();
        android.graphics.RectF rectF = this.f141936e;
        float f17 = 0.0f;
        rectF.set(0.0f, 0.0f, width2, height2);
        this.f141947s = java.lang.Math.min((rectF.height() - this.f141941m) / 2.0f, (rectF.width() - this.f141941m) / 2.0f);
        android.graphics.RectF rectF2 = this.f141935d;
        rectF2.set(rectF);
        if (!this.f141951w) {
            int i17 = this.f141941m;
            rectF2.inset(i17, i17);
        }
        this.f141946r = java.lang.Math.min(rectF2.height() / 2.0f, rectF2.width() / 2.0f);
        android.graphics.Matrix matrix = this.f141937f;
        matrix.set(null);
        if (this.f141944p * rectF2.height() > rectF2.width() * this.f141945q) {
            width = rectF2.height() / this.f141945q;
            height = 0.0f;
            f17 = (rectF2.width() - (this.f141944p * width)) * 0.5f;
        } else {
            width = rectF2.width() / this.f141944p;
            height = (rectF2.height() - (this.f141945q * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate(((int) (f17 + 0.5f)) + rectF2.left, ((int) (height + 0.5f)) + rectF2.top);
        this.f141943o.setLocalMatrix(matrix);
        invalidate();
    }

    public int getBorderColor() {
        return this.f141940i;
    }

    public int getBorderWidth() {
        return this.f141941m;
    }

    @Override // android.widget.ImageView
    public android.widget.ImageView.ScaleType getScaleType() {
        return f141933x;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        if (getDrawable() == null) {
            return;
        }
        canvas.drawCircle(getWidth() / 2, getHeight() / 2, this.f141946r, this.f141938g);
        if (this.f141941m != 0) {
            canvas.drawCircle(getWidth() / 2, getHeight() / 2, this.f141947s, this.f141939h);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        b();
    }

    @Override // android.widget.ImageView
    public void setAdjustViewBounds(boolean z17) {
        if (z17) {
            throw new java.lang.IllegalArgumentException("adjustViewBounds not supported.");
        }
    }

    public void setBorderColor(int i17) {
        if (i17 == this.f141940i) {
            return;
        }
        this.f141940i = i17;
        this.f141939h.setColor(i17);
        invalidate();
    }

    public void setBorderColorResource(int i17) {
        setBorderColor(getContext().getResources().getColor(i17));
    }

    public void setBorderOverlay(boolean z17) {
        if (z17 == this.f141951w) {
            return;
        }
        this.f141951w = z17;
        b();
    }

    public void setBorderWidth(int i17) {
        if (i17 == this.f141941m) {
            return;
        }
        this.f141941m = i17;
        b();
    }

    @Override // android.widget.ImageView
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        if (colorFilter == this.f141948t) {
            return;
        }
        this.f141948t = colorFilter;
        this.f141938g.setColorFilter(colorFilter);
        invalidate();
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(android.graphics.Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        this.f141942n = bitmap;
        b();
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(android.graphics.drawable.Drawable drawable) {
        super.setImageDrawable(drawable);
        this.f141942n = a(drawable);
        b();
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i17) {
        super.setImageResource(i17);
        this.f141942n = a(getDrawable());
        b();
    }

    @Override // android.widget.ImageView
    public void setImageURI(android.net.Uri uri) {
        super.setImageURI(uri);
        this.f141942n = a(getDrawable());
        b();
    }

    @Override // android.widget.ImageView
    public void setScaleType(android.widget.ImageView.ScaleType scaleType) {
        if (scaleType != f141933x) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("ScaleType %s not supported.", scaleType));
        }
    }

    public CircleImageView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f141935d = new android.graphics.RectF();
        this.f141936e = new android.graphics.RectF();
        this.f141937f = new android.graphics.Matrix();
        this.f141938g = new android.graphics.Paint();
        this.f141939h = new android.graphics.Paint();
        this.f141940i = -16777216;
        this.f141941m = 0;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.tencent.mm.plugin.game.d2.f139438a, i17, 0);
        this.f141941m = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.f141940i = obtainStyledAttributes.getColor(0, -16777216);
        this.f141951w = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        super.setScaleType(f141933x);
        this.f141949u = true;
        if (this.f141950v) {
            b();
            this.f141950v = false;
        }
    }
}
