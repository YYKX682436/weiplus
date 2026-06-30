package tl5;

/* loaded from: classes10.dex */
public final class i {

    /* renamed from: l, reason: collision with root package name */
    public static final android.view.animation.Interpolator f420350l = new android.view.animation.LinearInterpolator();

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.RectF f420351a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.RectF f420352b;

    /* renamed from: c, reason: collision with root package name */
    public final int f420353c;

    /* renamed from: d, reason: collision with root package name */
    public final int f420354d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.animation.Interpolator f420355e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f420356f;

    /* renamed from: g, reason: collision with root package name */
    public final int f420357g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.RectF f420358h;

    /* renamed from: i, reason: collision with root package name */
    public int f420359i;

    /* renamed from: j, reason: collision with root package name */
    public final android.graphics.Matrix f420360j;

    /* renamed from: k, reason: collision with root package name */
    public android.graphics.Paint f420361k;

    public i(android.graphics.RectF fromFrame, android.graphics.RectF toFrame, int i17, int i18, android.view.animation.Interpolator alphaInterpolator, android.graphics.drawable.Drawable drawable, int i19, int i27, kotlin.jvm.internal.i iVar) {
        i17 = (i27 & 4) != 0 ? 255 : i17;
        i18 = (i27 & 8) != 0 ? 255 : i18;
        alphaInterpolator = (i27 & 16) != 0 ? f420350l : alphaInterpolator;
        drawable = (i27 & 32) != 0 ? null : drawable;
        i19 = (i27 & 64) != 0 ? 0 : i19;
        kotlin.jvm.internal.o.g(fromFrame, "fromFrame");
        kotlin.jvm.internal.o.g(toFrame, "toFrame");
        kotlin.jvm.internal.o.g(alphaInterpolator, "alphaInterpolator");
        this.f420351a = fromFrame;
        this.f420352b = toFrame;
        this.f420353c = i17;
        this.f420354d = i18;
        this.f420355e = alphaInterpolator;
        this.f420356f = drawable;
        this.f420357g = i19;
        this.f420358h = new android.graphics.RectF();
        this.f420359i = 255;
        this.f420360j = new android.graphics.Matrix();
    }

    public final void a(android.graphics.Canvas canvas, float f17, float f18) {
        float f19;
        float f27;
        float f28;
        kotlin.jvm.internal.o.g(canvas, "canvas");
        boolean z17 = java.lang.Math.abs(f17 - 0.0f) < 1.0E-4f;
        android.graphics.RectF rectF = this.f420358h;
        android.graphics.RectF rectF2 = this.f420351a;
        if (z17) {
            rectF.set(rectF2);
        } else {
            boolean z18 = java.lang.Math.abs(f17 - 1.0f) < 1.0E-4f;
            android.graphics.RectF rectF3 = this.f420352b;
            if (z18) {
                rectF.set(rectF3);
            } else {
                float f29 = rectF2.left;
                float f37 = f29 + ((rectF3.left - f29) * f17);
                float f38 = rectF2.top;
                float f39 = f38 + ((rectF3.top - f38) * f17);
                float f47 = rectF2.right;
                float f48 = f47 + ((rectF3.right - f47) * f17);
                float f49 = rectF2.bottom;
                rectF.set(f37, f39, f48, f49 + ((rectF3.bottom - f49) * f17));
            }
        }
        int i17 = this.f420353c;
        if (i17 == this.f420354d) {
            this.f420359i = i17;
        } else {
            if (f18 == -1.0f) {
                f18 = this.f420355e.getInterpolation(f17);
            }
            this.f420359i = h3.a.b(i17 + ((int) ((r2 - i17) * f18)), 0, 255);
        }
        int i18 = this.f420359i;
        if (i18 <= 0) {
            return;
        }
        android.graphics.drawable.Drawable drawable = this.f420356f;
        if (drawable == null) {
            int i19 = this.f420357g;
            if (i19 != 0) {
                android.graphics.Paint paint = this.f420361k;
                if (paint == null) {
                    paint = new android.graphics.Paint();
                    paint.setStyle(android.graphics.Paint.Style.FILL);
                    this.f420361k = paint;
                }
                paint.setColor(i19);
                paint.setAlpha(i18);
                canvas.drawRect(rectF, paint);
                return;
            }
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        float width = rectF.width();
        float height = rectF.height();
        android.graphics.Matrix matrix = this.f420360j;
        matrix.reset();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            drawable.setBounds(0, 0, (int) width, (int) height);
        } else {
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            float f57 = intrinsicWidth;
            float f58 = intrinsicHeight;
            if (f57 * height > width * f58) {
                f19 = (1.0f + height) / f58;
                f28 = (width - (f57 * f19)) * 0.5f;
                f27 = 0.0f;
            } else {
                f19 = (1.0f + width) / f57;
                f27 = (height - (f58 * f19)) * 0.5f;
                f28 = 0.0f;
            }
            matrix.setScale(f19, f19);
            matrix.postTranslate(f28, f27);
        }
        drawable.setAlpha(i18);
        int save = canvas.save();
        canvas.translate(rectF.left, rectF.top);
        canvas.clipRect(0.0f, 0.0f, width, height);
        canvas.concat(matrix);
        drawable.draw(canvas);
        canvas.restoreToCount(save);
    }
}
