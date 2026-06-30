package hy0;

/* loaded from: classes5.dex */
public final class x2 implements iy0.c {

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f286008a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f286009b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f286010c;

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f286011d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint f286012e;

    /* renamed from: f, reason: collision with root package name */
    public float f286013f;

    /* renamed from: g, reason: collision with root package name */
    public final float f286014g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.Rect f286015h;

    /* renamed from: i, reason: collision with root package name */
    public final double f286016i;

    public x2(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        jz5.g b17 = jz5.h.b(new hy0.q2(context));
        jz5.g b18 = jz5.h.b(new hy0.v2(context));
        this.f286008a = jz5.h.b(new hy0.t2(context));
        jz5.g b19 = jz5.h.b(new hy0.r2(context));
        this.f286009b = jz5.h.b(new hy0.s2(context));
        this.f286010c = jz5.h.b(new hy0.w2(context));
        jz5.h.b(new hy0.u2(context));
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setColor(((java.lang.Number) ((jz5.n) b17).getValue()).intValue());
        int i17 = (int) (255 * 0.3f);
        paint.setAlpha(i17);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(((java.lang.Number) ((jz5.n) b19).getValue()).floatValue());
        paint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        this.f286011d = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        paint2.setColor(((java.lang.Number) ((jz5.n) b17).getValue()).intValue());
        paint2.setAlpha(i17);
        paint2.setAntiAlias(true);
        paint2.setTextSize(((java.lang.Number) ((jz5.n) b18).getValue()).floatValue());
        this.f286012e = paint2;
        this.f286015h = new android.graphics.Rect();
        this.f286016i = 1.5d;
        android.graphics.Paint.FontMetrics fontMetrics = paint2.getFontMetrics();
        float f17 = fontMetrics.descent;
        this.f286014g = ((f17 - fontMetrics.ascent) / 2) - f17;
    }

    @Override // iy0.c
    public void a(android.graphics.Canvas canvas, hy0.z2 context) {
        int i17;
        int i18;
        java.lang.String sb6;
        kotlin.jvm.internal.o.g(canvas, "canvas");
        kotlin.jvm.internal.o.g(context, "context");
        bx0.h hVar = context.f286047c;
        float floatValue = hVar.f36277d.f36266r.f247045b - ((java.lang.Number) ((jz5.n) this.f286008a).getValue()).floatValue();
        float floatValue2 = floatValue - ((java.lang.Number) ((jz5.n) this.f286009b).getValue()).floatValue();
        float floatValue3 = ((java.lang.Number) ((jz5.n) this.f286010c).getValue()).floatValue();
        bx0.i timelineLayoutType = context.f286045a.getTimelineLayoutType();
        ex0.a0 a0Var = context.f286046b;
        double s17 = (floatValue3 / a0Var.s(timelineLayoutType)) * this.f286016i;
        double d17 = s17 > 10.0d ? 20000.0d : s17 > 5.0d ? 10000.0d : s17 > 3.0d ? 6000.0d : s17 > 2.0d ? 4000.0d : s17 > 1.0d ? 2000.0d : s17 > 0.5d ? 1000.0d : s17 > 0.3333333333333333d ? 666.6666666666666d : s17 > 0.16666666666666666d ? 333.3333333333333d : s17 > 0.1d ? 200.0d : s17 > 0.06666666666666667d ? 133.33333333333334d : 66.66666666666667d;
        this.f286013f = (floatValue2 + floatValue) / 2;
        double d18 = 1000;
        int s18 = (int) ((d17 / d18) * a0Var.s(r7.getTimelineLayoutType()));
        int i19 = s18 / 2;
        int i27 = hVar.f36277d.f36266r.f247044a;
        int e17 = hVar.e();
        e3.d dVar = hVar.f36277d.f36266r;
        int i28 = e17 - dVar.f247046c;
        android.graphics.Rect rect = context.f286048d;
        int i29 = rect.left - dVar.f247044a;
        int i37 = i27 + ((i29 < 0 ? 0 : i29 / s18) * s18);
        if (s18 <= 0) {
            throw new java.lang.IllegalArgumentException("Step must be positive, was: " + s18 + '.');
        }
        int a17 = sz5.b.a(i37, i28, s18);
        if (i37 <= a17) {
            while (i37 <= rect.right) {
                double milliseconds = hVar.f36277d.f36267s.timeForPixelOffset(i37).toMilliseconds();
                float f17 = i37;
                bx0.h hVar2 = hVar;
                if (d17 >= 1000.0d) {
                    int a18 = a06.d.a(milliseconds / d18);
                    sb6 = java.lang.String.format("%02d:%02d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(a18 / 60), java.lang.Integer.valueOf(a18 % 60)}, 2));
                    kotlin.jvm.internal.o.f(sb6, "format(...)");
                    i17 = s18;
                    i18 = i19;
                } else {
                    int a19 = a06.d.a(milliseconds / d17);
                    i17 = s18;
                    i18 = i19;
                    int a27 = a06.d.a(2000 / d17);
                    int i38 = a19 % a27;
                    if (i38 == 0) {
                        int a28 = a06.d.a(milliseconds / d18);
                        sb6 = java.lang.String.format("%02d:%02d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(a28 / 60), java.lang.Integer.valueOf(a28 % 60)}, 2));
                        kotlin.jvm.internal.o.f(sb6, "format(...)");
                    } else {
                        int i39 = (30 / a27) * i38;
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                        sb7.append(i39);
                        sb7.append('F');
                        sb6 = sb7.toString();
                    }
                }
                android.graphics.Paint paint = this.f286012e;
                paint.getTextBounds(sb6, 0, sb6.length(), this.f286015h);
                canvas.drawText(sb6, f17 - ((r13.left + r13.right) / 2.0f), this.f286013f + this.f286014g, paint);
                int i47 = i18;
                if (i37 + i18 <= rect.right) {
                    canvas.drawPoint(f17 + i47, this.f286013f, this.f286011d);
                }
                if (i37 == a17) {
                    return;
                }
                i37 += i17;
                i19 = i47;
                hVar = hVar2;
                s18 = i17;
            }
        }
    }
}
