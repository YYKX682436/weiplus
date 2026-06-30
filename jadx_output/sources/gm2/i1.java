package gm2;

/* loaded from: classes3.dex */
public final class i1 extends gm2.a {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f273411f = 0;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f273412d;

    /* renamed from: e, reason: collision with root package name */
    public gm2.h1 f273413e;

    static {
        new gm2.f1(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(android.graphics.drawable.Drawable drawable) {
        super(drawable);
        kotlin.jvm.internal.o.g(drawable, "drawable");
        this.f273412d = jz5.h.b(gm2.g1.f273368d);
        this.f273413e = new gm2.h1(null, null, 0, 0, false, 0, 0, false, 0, 0, 0, 0, 0, 0, 0.0f, null, null, 0, 262143, null);
    }

    @Override // gm2.y1
    public int a() {
        return this.f273413e.f273389t;
    }

    public final void b(android.graphics.Canvas canvas, float f17, int i17, int i18, int i19, android.graphics.Paint paint) {
        int i27;
        paint.setColor(this.f273413e.f273382m);
        paint.setTextSize(this.f273413e.f273373d);
        if (this.f273413e.f273388s <= 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append((java.lang.Object) this.f273413e.f273370a);
            sb6.append((java.lang.Object) this.f273413e.f273371b);
            java.lang.String sb7 = sb6.toString();
            gm2.h1 h1Var = this.f273413e;
            float measureText = h1Var.f273379j + paint.measureText(sb7, 0, sb7.length());
            gm2.h1 h1Var2 = this.f273413e;
            h1Var.f273388s = (int) (measureText + h1Var2.f273381l + h1Var2.f273380k);
        }
        gm2.h1 h1Var3 = this.f273413e;
        float f18 = 2;
        float f19 = h1Var3.f273383n / f18;
        float f27 = (i19 - i17) / f18;
        float f28 = h1Var3.f273375f + f17;
        float f29 = f27 - f19;
        float f37 = f28 + h1Var3.f273388s;
        float f38 = f27 + f19;
        float f39 = h1Var3.f273384o;
        if (f39 > 0.0f) {
            f19 = f39;
        }
        android.graphics.Bitmap bitmap = h1Var3.f273385p;
        if (bitmap != null) {
            if (bitmap != null) {
                canvas.drawBitmap(com.tencent.mm.sdk.platformtools.x.t0(bitmap, false, 200.0f, false, null), (android.graphics.Rect) null, new android.graphics.RectF(f28, f29, f37, f38), (android.graphics.Paint) null);
                return;
            }
            return;
        }
        if (h1Var3.f273386q == null) {
            canvas.drawRoundRect(new android.graphics.RectF(f28, f29, f37, f38), f19, f19, paint);
            return;
        }
        int alpha = paint.getAlpha();
        int[] iArr = this.f273413e.f273386q;
        java.lang.Integer S = iArr != null ? kz5.z.S(iArr, 0) : null;
        int[] iArr2 = this.f273413e.f273386q;
        java.lang.Integer S2 = iArr2 != null ? kz5.z.S(iArr2, 1) : null;
        paint.setAlpha(255);
        if (S == null || S2 == null) {
            i27 = alpha;
        } else {
            paint.setShader(new android.graphics.LinearGradient(f28, f27, f37, f27, S.intValue(), S2.intValue(), android.graphics.Shader.TileMode.CLAMP));
            canvas.drawRoundRect(new android.graphics.RectF(f28, f29, f37, f38), f19, f19, paint);
            paint.setShader(null);
            i27 = alpha;
        }
        paint.setAlpha(i27);
    }

    public final void c(android.graphics.Canvas canvas, float f17, int i17, int i18, int i19, android.graphics.Paint paint) {
        gm2.h1 h1Var = this.f273413e;
        if (h1Var.f273377h) {
            float measureText = paint.measureText(h1Var.f273370a.toString());
            jz5.g gVar = this.f273412d;
            float intValue = ((java.lang.Number) ((jz5.n) gVar).getValue()).intValue();
            float intValue2 = ((java.lang.Number) ((jz5.n) gVar).getValue()).intValue();
            float f18 = r2.f273375f + f17 + intValue;
            float f19 = r2.f273379j + f18 + measureText + r2.f273380k + intValue;
            int i27 = (i19 - i17) - ((int) (2 * intValue2));
            int i28 = this.f273413e.f273383n;
            float f27 = i17 + (i27 > i28 ? (i27 - i28) / 2 : 0) + intValue2;
            android.graphics.Paint paint2 = new android.graphics.Paint();
            paint2.setColor(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_1));
            paint2.setStrokeWidth(((java.lang.Number) ((jz5.n) gVar).getValue()).intValue());
            paint2.setStyle(android.graphics.Paint.Style.STROKE);
            canvas.drawRoundRect(new android.graphics.RectF(f18, f27, f19, i28 + f27), com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479645bk), com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479645bk), paint2);
        }
    }

    public final void d(android.graphics.Canvas canvas, float f17, int i17, int i18, int i19, android.graphics.Paint paint) {
        com.tencent.mm.ui.bk.r0(paint, 0.8f);
        paint.setColor(this.f273413e.f273372c);
        paint.setAlpha(this.f273413e.f273376g);
        paint.setTextSize(this.f273413e.f273373d);
        int i27 = this.f273413e.f273387r;
        int i28 = i27 > 0 ? i19 - (i27 / 2) : (i19 - i17) / 2;
        float f18 = 2;
        float f19 = i28;
        float abs = (java.lang.Math.abs(paint.ascent() + paint.descent()) / f18) + f19;
        gm2.h1 h1Var = this.f273413e;
        float f27 = f17 + h1Var.f273375f + h1Var.f273379j;
        android.graphics.Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        kotlin.jvm.internal.o.f(fontMetrics, "getFontMetrics(...)");
        float f28 = fontMetrics.bottom;
        float f29 = (f19 + ((f28 - fontMetrics.top) / f18)) - f28;
        ae2.in inVar = ae2.in.f3688a;
        if (((java.lang.Boolean) ae2.in.N6.r()).booleanValue()) {
            canvas.drawText(this.f273413e.f273370a.toString(), f27, f29, paint);
        } else {
            canvas.drawText(this.f273413e.f273370a.toString(), f27, abs, paint);
        }
        if (this.f273413e.f273371b.length() > 0) {
            java.lang.CharSequence charSequence = this.f273413e.f273370a;
            float measureText = f27 + paint.measureText(charSequence, 0, charSequence.length());
            canvas.drawText(this.f273413e.f273371b.toString(), measureText + r6.f273381l, abs, paint);
        }
        com.tencent.mm.ui.bk.t0(paint);
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(android.graphics.Canvas canvas, java.lang.CharSequence charSequence, int i17, int i18, float f17, int i19, int i27, int i28, android.graphics.Paint paint) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        kotlin.jvm.internal.o.g(paint, "paint");
        try {
            int color = paint.getColor();
            float textSize = paint.getTextSize();
            android.graphics.Typeface typeface = paint.getTypeface();
            b(canvas, f17, i19, i27, i28, paint);
            d(canvas, f17, i19, i27, i28, paint);
            c(canvas, f17, i19, i27, i28, paint);
            paint.setColor(color);
            paint.setTextSize(textSize);
            paint.setTypeface(typeface);
        } catch (java.lang.Exception e17) {
            pm0.z.b(xy2.b.f458155b, "liveInvalidBadgeTag", false, null, null, false, false, null, 124, null);
            hc2.c.a(e17, "FinderLiveTagImageSpan.draw");
        }
    }
}
