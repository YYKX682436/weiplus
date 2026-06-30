package com.tencent.mm.ui.chatting.view;

/* loaded from: classes5.dex */
public final class v2 extends android.graphics.drawable.Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Bitmap f203117a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.Paint f203118b;

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.Paint f203119c;

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Matrix f203120d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.RectF f203121e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Path f203122f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f203123g;

    /* renamed from: h, reason: collision with root package name */
    public final float[] f203124h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f203125i;

    /* renamed from: j, reason: collision with root package name */
    public final android.graphics.RectF f203126j;

    /* renamed from: k, reason: collision with root package name */
    public final android.graphics.Rect f203127k;

    /* renamed from: l, reason: collision with root package name */
    public int f203128l;

    /* renamed from: m, reason: collision with root package name */
    public int f203129m;

    /* renamed from: n, reason: collision with root package name */
    public float f203130n;

    /* renamed from: o, reason: collision with root package name */
    public float f203131o;

    /* renamed from: p, reason: collision with root package name */
    public float f203132p;

    public v2(android.graphics.Bitmap bitmap) {
        kotlin.jvm.internal.o.g(bitmap, "bitmap");
        this.f203117a = bitmap;
        this.f203118b = new android.graphics.Paint(3);
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setColor(-1);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        this.f203119c = paint;
        this.f203120d = new android.graphics.Matrix();
        this.f203121e = new android.graphics.RectF();
        this.f203122f = new android.graphics.Path();
        this.f203123g = new float[9];
        this.f203124h = new float[9];
        this.f203126j = new android.graphics.RectF();
        this.f203127k = new android.graphics.Rect();
        this.f203128l = bitmap.getWidth();
        this.f203129m = bitmap.getHeight();
        this.f203131o = 1.0f;
        this.f203132p = 1.0f;
    }

    public final void a(android.graphics.Matrix m17, int i17, int i18, float f17) {
        boolean z17;
        float width;
        float height;
        android.graphics.Path path;
        android.graphics.RectF rectF;
        kotlin.jvm.internal.o.g(m17, "m");
        float[] fArr = this.f203123g;
        m17.getValues(fArr);
        boolean z18 = this.f203128l == i17 && this.f203129m == i18;
        boolean z19 = java.lang.Math.abs(this.f203130n - f17) < 0.1f;
        if (this.f203125i) {
            int[] iArr = {0, 4, 2, 5};
            for (int i19 = 0; i19 < 4; i19++) {
                int i27 = iArr[i19];
                if (java.lang.Math.abs(fArr[i27] - this.f203124h[i27]) <= 0.001f) {
                }
            }
            z17 = true;
            if (!z18 && z19 && z17) {
                return;
            }
            android.graphics.Matrix matrix = this.f203120d;
            matrix.set(m17);
            this.f203128l = i17;
            this.f203129m = i18;
            this.f203130n = f17;
            this.f203125i = true;
            kz5.v.m(this.f203123g, this.f203124h, 0, 0, 0, 14, null);
            android.graphics.Bitmap bitmap = this.f203117a;
            width = bitmap.getWidth();
            height = bitmap.getHeight();
            path = this.f203122f;
            rectF = this.f203121e;
            if (width > 0.0f || height <= 0.0f || this.f203128l <= 0 || this.f203129m <= 0) {
                rectF.set(0.0f, 0.0f, width, height);
                path.reset();
            } else {
                matrix.getValues(fArr);
                float abs = java.lang.Math.abs(fArr[0]);
                float abs2 = java.lang.Math.abs(fArr[4]);
                this.f203131o = (abs > 0.0f ? 1 : (abs == 0.0f ? 0 : -1)) == 0 ? 1.0f : abs;
                this.f203132p = (abs2 > 0.0f ? 1 : (abs2 == 0.0f ? 0 : -1)) == 0 ? 1.0f : abs2;
                if (!(abs == 0.0f)) {
                    if (!(abs2 == 0.0f)) {
                        float f18 = this.f203128l / abs;
                        if (f18 > width) {
                            f18 = width;
                        }
                        float f19 = this.f203129m / abs2;
                        if (f19 > height) {
                            f19 = height;
                        }
                        float f27 = (width - f18) / 2.0f;
                        float f28 = (height - f19) / 2.0f;
                        rectF.set(f27, f28, f18 + f27, f19 + f28);
                        path.reset();
                        float f29 = this.f203130n;
                        if (f29 > 0.0f) {
                            float f37 = f29 / this.f203131o;
                            if (f37 < 0.0f) {
                                f37 = 0.0f;
                            }
                            float f38 = f29 / this.f203132p;
                            float f39 = f38 >= 0.0f ? f38 : 0.0f;
                            float width2 = rectF.width() / 2.0f;
                            float height2 = rectF.height() / 2.0f;
                            if (f37 > width2) {
                                f37 = width2;
                            }
                            if (f39 > height2) {
                                f39 = height2;
                            }
                            path.addRoundRect(rectF, f37, f39, android.graphics.Path.Direction.CW);
                        }
                    }
                }
                rectF.set(0.0f, 0.0f, width, height);
                path.reset();
            }
            invalidateSelf();
        }
        z17 = false;
        if (!z18) {
        }
        android.graphics.Matrix matrix2 = this.f203120d;
        matrix2.set(m17);
        this.f203128l = i17;
        this.f203129m = i18;
        this.f203130n = f17;
        this.f203125i = true;
        kz5.v.m(this.f203123g, this.f203124h, 0, 0, 0, 14, null);
        android.graphics.Bitmap bitmap2 = this.f203117a;
        width = bitmap2.getWidth();
        height = bitmap2.getHeight();
        path = this.f203122f;
        rectF = this.f203121e;
        if (width > 0.0f) {
        }
        rectF.set(0.0f, 0.0f, width, height);
        path.reset();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        int save = canvas.save();
        canvas.concat(this.f203120d);
        android.graphics.Path path = this.f203122f;
        boolean isEmpty = path.isEmpty();
        android.graphics.RectF rectF = this.f203121e;
        if (isEmpty) {
            canvas.clipRect(rectF);
        } else {
            canvas.clipPath(path);
        }
        android.graphics.Bitmap bitmap = this.f203117a;
        if (bitmap.hasAlpha()) {
            boolean isEmpty2 = path.isEmpty();
            android.graphics.Paint paint = this.f203119c;
            if (isEmpty2) {
                canvas.drawRect(rectF, paint);
            } else {
                canvas.drawPaint(paint);
            }
        }
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.f203118b);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.Rect getDirtyBounds() {
        android.graphics.RectF rectF = this.f203121e;
        if (rectF.isEmpty()) {
            android.graphics.Rect dirtyBounds = super.getDirtyBounds();
            kotlin.jvm.internal.o.f(dirtyBounds, "getDirtyBounds(...)");
            return dirtyBounds;
        }
        android.graphics.RectF rectF2 = this.f203126j;
        rectF2.set(rectF);
        this.f203120d.mapRect(rectF2);
        int floor = ((int) java.lang.Math.floor(rectF2.left)) - 2;
        int floor2 = ((int) java.lang.Math.floor(rectF2.top)) - 2;
        int ceil = ((int) java.lang.Math.ceil(rectF2.right)) + 2;
        int ceil2 = ((int) java.lang.Math.ceil(rectF2.bottom)) + 2;
        android.graphics.Rect rect = this.f203127k;
        rect.set(floor, floor2, ceil, ceil2);
        return rect;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i17) {
        this.f203118b.setAlpha(i17);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.f203118b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
