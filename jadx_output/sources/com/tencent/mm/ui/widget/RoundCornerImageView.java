package com.tencent.mm.ui.widget;

/* loaded from: classes4.dex */
public class RoundCornerImageView extends androidx.appcompat.widget.AppCompatImageView {

    /* renamed from: f, reason: collision with root package name */
    public int f211406f;

    /* renamed from: g, reason: collision with root package name */
    public int f211407g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.Paint f211408h;

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.Path f211409i;

    /* renamed from: m, reason: collision with root package name */
    public final android.graphics.RectF f211410m;

    /* renamed from: n, reason: collision with root package name */
    public android.graphics.Paint f211411n;

    /* renamed from: o, reason: collision with root package name */
    public int f211412o;

    /* renamed from: p, reason: collision with root package name */
    public int f211413p;

    public RoundCornerImageView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f211406f = 8;
        this.f211407g = 8;
        this.f211408h = new android.graphics.Paint();
        this.f211409i = new android.graphics.Path();
        this.f211410m = new android.graphics.RectF();
        this.f211412o = 0;
        n(context, attributeSet);
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        if (getWidth() <= 0 || getHeight() <= 0) {
            super.draw(canvas);
            return;
        }
        int width = getWidth();
        int height = getHeight();
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(height));
        arrayList.add(java.lang.Integer.valueOf(width));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/ui/widget/RoundCornerImageView", "draw", "(Landroid/graphics/Canvas;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/ui/widget/RoundCornerImageView", "draw", "(Landroid/graphics/Canvas;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Canvas canvas2 = new android.graphics.Canvas(createBitmap);
        if (createBitmap.isRecycled()) {
            int width2 = getWidth();
            int height2 = getHeight();
            android.graphics.Bitmap.Config config2 = android.graphics.Bitmap.Config.ARGB_8888;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(config2);
            arrayList2.add(java.lang.Integer.valueOf(height2));
            arrayList2.add(java.lang.Integer.valueOf(width2));
            java.lang.Object obj2 = new java.lang.Object();
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/mm/ui/widget/RoundCornerImageView", "draw", "(Landroid/graphics/Canvas;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList2.get(0)).intValue(), ((java.lang.Integer) arrayList2.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList2.get(2));
            yj0.a.e(obj2, createBitmap, "com/tencent/mm/ui/widget/RoundCornerImageView", "draw", "(Landroid/graphics/Canvas;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            canvas2 = new android.graphics.Canvas(createBitmap);
        }
        super.draw(canvas2);
        android.graphics.Paint paint = this.f211408h;
        paint.setAntiAlias(true);
        paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.CLEAR));
        float width3 = getWidth();
        float height3 = getHeight();
        android.graphics.RectF rectF = this.f211410m;
        rectF.set(0.0f, 0.0f, width3, height3);
        float f17 = this.f211406f;
        float f18 = this.f211407g;
        android.graphics.Path.Direction direction = android.graphics.Path.Direction.CW;
        android.graphics.Path path = this.f211409i;
        path.addRoundRect(rectF, f17, f18, direction);
        path.setFillType(android.graphics.Path.FillType.INVERSE_WINDING);
        canvas2.drawPath(path, paint);
        android.graphics.Paint paint2 = this.f211411n;
        if (paint2 != null) {
            float strokeWidth = paint2.getStrokeWidth() / 2.0f;
            canvas2.drawRoundRect(new android.graphics.RectF(strokeWidth, strokeWidth, getWidth() - strokeWidth, getHeight() - strokeWidth), this.f211406f, this.f211407g, this.f211411n);
        }
        paint.reset();
        paint.setXfermode(null);
        int i17 = this.f211412o;
        if (i17 > 0) {
            float f19 = 0;
            paint.setShadowLayer(i17, f19, f19, this.f211413p);
        }
        canvas.drawBitmap(createBitmap, 0.0f, 0.0f, paint);
        createBitmap.recycle();
    }

    public final void n(android.content.Context context, android.util.AttributeSet attributeSet) {
        if (attributeSet == null) {
            float f17 = context.getResources().getDisplayMetrics().density;
            this.f211406f = (int) (this.f211406f * f17);
            this.f211407g = (int) (this.f211407g * f17);
        } else {
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wm0.a.G);
            this.f211406f = obtainStyledAttributes.getDimensionPixelSize(1, this.f211406f);
            this.f211407g = obtainStyledAttributes.getDimensionPixelSize(0, this.f211407g);
            obtainStyledAttributes.recycle();
        }
    }

    public void r(int i17, int i18) {
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f211411n = paint;
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        this.f211411n.setStrokeWidth(i17);
        this.f211411n.setAntiAlias(true);
        this.f211411n.setColor(i18);
    }

    public void setRoundHeight(int i17) {
        this.f211407g = i17;
    }

    public void setRoundWidth(int i17) {
        this.f211406f = i17;
    }

    public RoundCornerImageView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f211406f = 8;
        this.f211407g = 8;
        this.f211408h = new android.graphics.Paint();
        this.f211409i = new android.graphics.Path();
        this.f211410m = new android.graphics.RectF();
        this.f211412o = 0;
        n(context, attributeSet);
    }

    public RoundCornerImageView(android.content.Context context) {
        super(context, null);
        this.f211406f = 8;
        this.f211407g = 8;
        this.f211408h = new android.graphics.Paint();
        this.f211409i = new android.graphics.Path();
        this.f211410m = new android.graphics.RectF();
        this.f211412o = 0;
        n(context, null);
    }
}
