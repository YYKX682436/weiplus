package hy0;

/* loaded from: classes5.dex */
public final class t1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.RectF f285964a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.RectF f285965b;

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.RectF f285966c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f285967d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f285968e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Path f285969f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f285970g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f285971h;

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.Paint f285972i;

    /* renamed from: j, reason: collision with root package name */
    public final android.graphics.Paint f285973j;

    /* renamed from: k, reason: collision with root package name */
    public final android.graphics.Paint f285974k;

    public t1(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f285964a = new android.graphics.RectF();
        this.f285965b = new android.graphics.RectF();
        this.f285966c = new android.graphics.RectF();
        this.f285967d = jz5.h.b(new hy0.m1(context));
        this.f285968e = jz5.h.b(new hy0.n1(context));
        this.f285969f = new android.graphics.Path();
        this.f285970g = jz5.h.b(new hy0.s1(context));
        jz5.g b17 = jz5.h.b(new hy0.r1(context));
        this.f285971h = jz5.h.b(new hy0.q1(context));
        jz5.g b18 = jz5.h.b(new hy0.o1(context));
        jz5.g b19 = jz5.h.b(new hy0.p1(context));
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setAntiAlias(true);
        paint.setColor(((java.lang.Number) ((jz5.n) b18).getValue()).intValue());
        paint.setStyle(android.graphics.Paint.Style.FILL);
        this.f285972i = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        paint2.setAntiAlias(true);
        paint2.setColor(((java.lang.Number) ((jz5.n) b19).getValue()).intValue());
        paint2.setStyle(android.graphics.Paint.Style.STROKE);
        paint2.setStrokeWidth(((java.lang.Number) ((jz5.n) b17).getValue()).floatValue());
        paint2.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        this.f285973j = paint2;
        android.graphics.Paint paint3 = new android.graphics.Paint();
        paint3.setAntiAlias(true);
        paint3.setColor(-1);
        paint3.setStyle(android.graphics.Paint.Style.STROKE);
        paint3.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        paint3.setStrokeWidth(c());
        this.f285974k = paint3;
    }

    public final void a(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        android.graphics.RectF rectF = this.f285965b;
        android.graphics.RectF rectF2 = this.f285964a;
        float f17 = rectF2.left;
        jz5.g gVar = this.f285970g;
        float f18 = 2;
        rectF.set(f17 - ((java.lang.Number) ((jz5.n) gVar).getValue()).floatValue(), rectF2.top - (c() / f18), rectF2.left, rectF2.bottom + (c() / f18));
        android.graphics.RectF rectF3 = this.f285966c;
        rectF3.set(rectF2.right, rectF2.top - (c() / f18), rectF2.right + ((java.lang.Number) ((jz5.n) gVar).getValue()).floatValue(), rectF2.bottom + (c() / f18));
        float f19 = rectF2.left;
        float f27 = rectF2.top;
        float f28 = rectF2.right;
        android.graphics.Paint paint = this.f285974k;
        canvas.drawLine(f19, f27, f28, f27, paint);
        float f29 = rectF2.left;
        float f37 = rectF2.bottom;
        canvas.drawLine(f29, f37, rectF2.right, f37, paint);
        android.graphics.Path path = this.f285969f;
        path.reset();
        path.moveTo(rectF.left + b(), rectF.top);
        path.lineTo(rectF.right, rectF.top);
        path.lineTo(rectF.right, rectF.bottom);
        path.lineTo(rectF.left + b(), rectF.bottom);
        float f38 = rectF.left;
        float f39 = rectF.bottom;
        path.quadTo(f38, f39, f38, f39 - b());
        path.lineTo(rectF.left, rectF.top + b());
        float f47 = rectF.left;
        path.quadTo(f47, rectF.top, b() + f47, rectF.top);
        path.close();
        android.graphics.Paint paint2 = this.f285972i;
        canvas.drawPath(path, paint2);
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        float d17 = centerY - (d() / f18);
        float d18 = centerY + (d() / f18);
        android.graphics.Paint paint3 = this.f285973j;
        canvas.drawLine(centerX, d17, centerX, d18, paint3);
        path.reset();
        path.moveTo(rectF3.left, rectF3.top);
        path.lineTo(rectF3.left, rectF3.bottom);
        path.lineTo(rectF3.right - b(), rectF3.bottom);
        float f48 = rectF3.right;
        float f49 = rectF3.bottom;
        path.quadTo(f48, f49, f48, f49 - b());
        path.lineTo(rectF3.right, rectF3.top + b());
        float f57 = rectF3.right;
        path.quadTo(f57, rectF3.top, f57 - b(), rectF3.top);
        path.lineTo(rectF3.left, rectF3.top);
        path.close();
        canvas.drawPath(path, paint2);
        float centerX2 = rectF3.centerX();
        float centerY2 = rectF3.centerY();
        canvas.drawLine(centerX2, centerY2 - (d() / f18), centerX2, centerY2 + (d() / f18), paint3);
    }

    public final float b() {
        return ((java.lang.Number) ((jz5.n) this.f285967d).getValue()).floatValue();
    }

    public final float c() {
        return ((java.lang.Number) this.f285968e.getValue()).floatValue();
    }

    public final float d() {
        return ((java.lang.Number) ((jz5.n) this.f285971h).getValue()).floatValue();
    }
}
