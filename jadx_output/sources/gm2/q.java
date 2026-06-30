package gm2;

/* loaded from: classes3.dex */
public class q extends gm2.a {

    /* renamed from: e, reason: collision with root package name */
    public static final gm2.p f273460e = new gm2.p(null);

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.r2 f273461f = new com.tencent.mm.sdk.platformtools.r2(10);

    /* renamed from: d, reason: collision with root package name */
    public gm2.o f273462d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(android.graphics.drawable.Drawable drawable) {
        super(drawable);
        kotlin.jvm.internal.o.g(drawable, "drawable");
        this.f273462d = new gm2.o(0, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, 0, false, null, 0, 0, 0, false, false, 524287, null);
    }

    @Override // gm2.y1
    public int a() {
        return this.f273462d.f273455t;
    }

    public void b(android.graphics.Canvas canvas, float f17, int i17, int i18, int i19, android.graphics.Paint paint) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        kotlin.jvm.internal.o.g(paint, "paint");
        float measureText = paint.measureText(this.f273462d.f273445j.toString());
        gm2.o oVar = this.f273462d;
        float f18 = oVar.f273436a + f17;
        float f19 = oVar.f273438c + f18 + oVar.f273450o + oVar.f273440e + measureText + oVar.f273439d;
        int i27 = i19 - i17;
        int i28 = oVar.f273443h;
        float f27 = i17 + (i27 > i28 ? (i27 - i28) / 2 : 0);
        float f28 = i28 + f27;
        int i29 = oVar.f273441f;
        if (i29 != 0 || oVar.f273442g == 0) {
            paint.setColor(i29);
            android.graphics.RectF rectF = new android.graphics.RectF(f18, f27, f19, f28);
            int i37 = this.f273462d.f273444i;
            canvas.drawRoundRect(rectF, i37, i37, paint);
            return;
        }
        try {
            android.graphics.drawable.Drawable drawable = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDrawable(this.f273462d.f273442g, null);
            drawable.setBounds(new android.graphics.Rect((int) f18, (int) f27, (int) f19, (int) f28));
            drawable.draw(canvas);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("FinderLiveLevelImageSpan", th6, "invalid bgDrawableId:" + this.f273462d.f273442g, new java.lang.Object[0]);
        }
    }

    public void c(android.graphics.Canvas canvas, float f17, int i17, int i18, int i19, android.graphics.Paint paint) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        kotlin.jvm.internal.o.g(paint, "paint");
    }

    public final void d(android.graphics.Canvas canvas, float f17, int i17, int i18, int i19, android.graphics.Paint paint) {
        jz5.f0 f0Var;
        gm2.o oVar = this.f273462d;
        android.graphics.drawable.Drawable drawable = oVar.f273449n;
        if (drawable != null) {
            if (oVar.f273454s) {
                drawable.setColorFilter(new android.graphics.PorterDuffColorFilter(this.f273462d.f273452q, android.graphics.PorterDuff.Mode.SRC_ATOP));
            } else {
                drawable.clearColorFilter();
            }
            float f18 = f17 + r6.f273436a + r6.f273438c;
            int i27 = i19 - i17;
            int i28 = this.f273462d.f273451p;
            int i29 = (i27 - i28) / 2;
            drawable.setBounds(new android.graphics.Rect((int) f18, i29, (int) (r6.f273450o + f18), i28 + i29));
            canvas.setDrawFilter(new android.graphics.PaintFlagsDrawFilter(0, 3));
            drawable.draw(canvas);
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e("FinderLiveLevelImageSpan", "drawLeftIcon bitmap is empty!");
        }
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(android.graphics.Canvas canvas, java.lang.CharSequence charSequence, int i17, int i18, float f17, int i19, int i27, int i28, android.graphics.Paint paint) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        kotlin.jvm.internal.o.g(paint, "paint");
        try {
            int color = paint.getColor();
            float textSize = paint.getTextSize();
            android.graphics.Typeface typeface = paint.getTypeface();
            paint.setTextSize(this.f273462d.f273447l);
            if (this.f273462d.f273453r) {
                b(canvas, f17, i19, i27, i28, paint);
            }
            d(canvas, f17, i19, i27, i28, paint);
            e(canvas, f17, i19, i27, i28, paint);
            c(canvas, f17, i19, i27, i28, paint);
            paint.setColor(color);
            paint.setTextSize(textSize);
            paint.setTypeface(typeface);
        } catch (java.lang.Exception e17) {
            pm0.z.b(xy2.b.f458155b, "liveInvalidBadgeTag", false, null, null, false, false, null, 124, null);
            hc2.c.a(e17, "FinderLiveLevelImageSpan.draw");
        }
    }

    public final void e(android.graphics.Canvas canvas, float f17, int i17, int i18, int i19, android.graphics.Paint paint) {
        if (this.f273462d.f273445j.length() == 0) {
            com.tencent.mars.xlog.Log.e("FinderLiveLevelImageSpan", "drawRightText text is empty!");
            return;
        }
        com.tencent.mm.ui.bk.r0(paint, 0.8f);
        paint.setColor(this.f273462d.f273446k);
        canvas.drawText(this.f273462d.f273445j.toString(), f17 + r5.f273436a + r5.f273438c + r5.f273450o + r5.f273440e, (java.lang.Math.abs(paint.ascent() + paint.descent()) / 2) + ((i19 - i17) / 2), paint);
        com.tencent.mm.ui.bk.t0(paint);
    }
}
