package hy0;

/* loaded from: classes5.dex */
public final class p2 implements iy0.c {
    public final jz5.g A;
    public final android.graphics.Paint B;

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.RectF f285923a;

    /* renamed from: b, reason: collision with root package name */
    public float f285924b;

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.RectF f285925c;

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.RectF f285926d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.RectF f285927e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.RectF f285928f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.RectF f285929g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f285930h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f285931i;

    /* renamed from: j, reason: collision with root package name */
    public final jz5.g f285932j;

    /* renamed from: k, reason: collision with root package name */
    public final jz5.g f285933k;

    /* renamed from: l, reason: collision with root package name */
    public final jz5.g f285934l;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f285935m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f285936n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f285937o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f285938p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f285939q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f285940r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f285941s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f285942t;

    /* renamed from: u, reason: collision with root package name */
    public final android.graphics.Path f285943u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f285944v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f285945w;

    /* renamed from: x, reason: collision with root package name */
    public final android.graphics.Paint f285946x;

    /* renamed from: y, reason: collision with root package name */
    public final android.graphics.Paint f285947y;

    /* renamed from: z, reason: collision with root package name */
    public final android.graphics.Paint f285948z;

    public p2(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f285923a = new android.graphics.RectF();
        this.f285925c = new android.graphics.RectF();
        this.f285926d = new android.graphics.RectF();
        this.f285927e = new android.graphics.RectF();
        this.f285928f = new android.graphics.RectF();
        this.f285929g = new android.graphics.RectF();
        this.f285930h = jz5.h.b(new hy0.g2(context));
        this.f285931i = jz5.h.b(new hy0.a2(context));
        this.f285932j = jz5.h.b(new hy0.v1(context));
        this.f285933k = jz5.h.b(new hy0.w1(context));
        this.f285934l = jz5.h.b(new hy0.x1(context));
        this.f285935m = jz5.h.b(new hy0.y1(context));
        this.f285936n = jz5.h.b(new hy0.z1(context));
        this.f285937o = jz5.h.b(new hy0.o2(context));
        this.f285938p = jz5.h.b(new hy0.n2(context));
        this.f285939q = jz5.h.b(new hy0.m2(context));
        this.f285940r = jz5.h.b(new hy0.e2(context));
        jz5.g b17 = jz5.h.b(new hy0.c2(context));
        this.f285941s = jz5.h.b(new hy0.b2(context));
        this.f285942t = jz5.h.b(new hy0.d2(context));
        this.f285943u = new android.graphics.Path();
        this.f285944v = jz5.h.b(new hy0.l2(context));
        jz5.g b18 = jz5.h.b(new hy0.k2(context));
        this.f285945w = jz5.h.b(new hy0.j2(context));
        jz5.g b19 = jz5.h.b(new hy0.h2(context));
        jz5.g b27 = jz5.h.b(new hy0.i2(context));
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setAntiAlias(true);
        paint.setColor(((java.lang.Number) ((jz5.n) b19).getValue()).intValue());
        paint.setStyle(android.graphics.Paint.Style.FILL);
        this.f285946x = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        paint2.setAntiAlias(true);
        paint2.setColor(((java.lang.Number) ((jz5.n) b27).getValue()).intValue());
        paint2.setStyle(android.graphics.Paint.Style.STROKE);
        paint2.setStrokeWidth(((java.lang.Number) ((jz5.n) b18).getValue()).floatValue());
        paint2.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        this.f285947y = paint2;
        android.graphics.Paint paint3 = new android.graphics.Paint();
        paint3.setAntiAlias(true);
        paint3.setColor(-1);
        paint3.setStyle(android.graphics.Paint.Style.STROKE);
        paint3.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        paint3.setStrokeWidth(e());
        this.f285948z = paint3;
        this.A = jz5.h.b(new hy0.f2(this));
        android.graphics.Paint paint4 = new android.graphics.Paint();
        paint4.setAntiAlias(true);
        paint4.setColor(((java.lang.Number) ((jz5.n) b17).getValue()).intValue());
        paint4.setStyle(android.graphics.Paint.Style.FILL);
        this.B = paint4;
    }

    @Override // iy0.c
    public void a(android.graphics.Canvas canvas, hy0.z2 context) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(canvas, "canvas");
        kotlin.jvm.internal.o.g(context, "context");
        ex0.a0 a0Var = context.f286046b;
        java.util.Iterator it = ((java.util.ArrayList) a0Var.f257097g.f257177e).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            com.tencent.maas.base.MJID mjid = ((ex0.r) obj).f257168b;
            ex0.r n17 = a0Var.n();
            if (kotlin.jvm.internal.o.b(mjid, n17 != null ? n17.f257168b : null)) {
                break;
            }
        }
        ex0.c cVar = obj instanceof ex0.c ? (ex0.c) obj : null;
        if (cVar != null) {
            ug.m mVar = ug.m.Transition;
            ug.m mVar2 = cVar.f257169c;
            if (mVar2 == mVar) {
                return;
            }
            bx0.h hVar = context.f286047c;
            com.tencent.maas.base.MJID mjid2 = cVar.f257168b;
            android.graphics.Rect c17 = bx0.h.c(hVar, mjid2, false, 2, null);
            java.util.Objects.toString(c17);
            android.graphics.RectF rectF = this.f285923a;
            rectF.set(c17);
            if (c(rectF, context.f286048d)) {
                if (!a0Var.E(mjid2)) {
                    rectF.right -= this.f285924b / 2;
                }
                if (!a0Var.D(mjid2)) {
                    rectF.left += this.f285924b / 2;
                }
                ax0.e r17 = a0Var.r();
                ax0.e eVar = ax0.e.f14975d;
                android.graphics.Paint paint = this.f285948z;
                if (r17 == eVar) {
                    canvas.drawRoundRect(rectF, d(), d(), paint);
                    return;
                }
                if (kz5.z.G(new ax0.e[]{ax0.e.f14976e, ax0.e.f14978g, ax0.e.f14977f}, a0Var.r())) {
                    android.graphics.RectF rectF2 = this.f285925c;
                    float f17 = rectF.left;
                    jz5.g gVar = this.f285944v;
                    float f18 = 2;
                    rectF2.set(f17 - ((java.lang.Number) ((jz5.n) gVar).getValue()).floatValue(), rectF.top - (e() / f18), rectF.left, rectF.bottom + (e() / f18));
                    android.graphics.RectF rectF3 = this.f285926d;
                    rectF3.set(rectF.right, rectF.top - (e() / f18), rectF.right + ((java.lang.Number) ((jz5.n) gVar).getValue()).floatValue(), rectF.bottom + (e() / f18));
                    float f19 = rectF.left;
                    float f27 = rectF.top;
                    canvas.drawLine(f19, f27, rectF.right, f27, paint);
                    float f28 = rectF.left;
                    float f29 = rectF.bottom;
                    canvas.drawLine(f28, f29, rectF.right, f29, paint);
                    android.graphics.Path path = this.f285943u;
                    path.reset();
                    path.moveTo(rectF2.left + d(), rectF2.top);
                    path.lineTo(rectF2.right, rectF2.top);
                    path.lineTo(rectF2.right, rectF2.bottom);
                    path.lineTo(rectF2.left + d(), rectF2.bottom);
                    float f37 = rectF2.left;
                    float f38 = rectF2.bottom;
                    path.quadTo(f37, f38, f37, f38 - d());
                    path.lineTo(rectF2.left, rectF2.top + d());
                    float f39 = rectF2.left;
                    path.quadTo(f39, rectF2.top, d() + f39, rectF2.top);
                    path.close();
                    android.graphics.Paint paint2 = this.f285946x;
                    canvas.drawPath(path, paint2);
                    float centerX = rectF2.centerX();
                    float centerY = rectF2.centerY();
                    float f47 = centerY - (f() / f18);
                    float f48 = centerY + (f() / f18);
                    android.graphics.Paint paint3 = this.f285947y;
                    canvas.drawLine(centerX, f47, centerX, f48, paint3);
                    path.reset();
                    path.moveTo(rectF3.left, rectF3.top);
                    path.lineTo(rectF3.left, rectF3.bottom);
                    path.lineTo(rectF3.right - d(), rectF3.bottom);
                    float f49 = rectF3.right;
                    float f57 = rectF3.bottom;
                    path.quadTo(f49, f57, f49, f57 - d());
                    path.lineTo(rectF3.right, rectF3.top + d());
                    float f58 = rectF3.right;
                    path.quadTo(f58, rectF3.top, f58 - d(), rectF3.top);
                    path.lineTo(rectF3.left, rectF3.top);
                    path.close();
                    canvas.drawPath(path, paint2);
                    float centerX2 = rectF3.centerX();
                    float centerY2 = rectF3.centerY();
                    canvas.drawLine(centerX2, centerY2 - (f() / f18), centerX2, centerY2 + (f() / f18), paint3);
                    java.lang.String format = java.lang.String.format("%.1fS", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf(cVar.j().toSeconds())}, 1));
                    kotlin.jvm.internal.o.f(format, "format(...)");
                    android.graphics.Rect rect = new android.graphics.Rect();
                    jz5.g gVar2 = this.A;
                    ((android.text.TextPaint) ((jz5.n) gVar2).getValue()).getTextBounds(format, 0, format.length(), rect);
                    float f59 = rectF.left;
                    jz5.g gVar3 = this.f285938p;
                    float floatValue = f59 + ((java.lang.Number) ((jz5.n) gVar3).getValue()).floatValue();
                    float floatValue2 = rectF.top + ((java.lang.Number) ((jz5.n) this.f285937o).getValue()).floatValue();
                    android.graphics.RectF rectF4 = this.f285927e;
                    jz5.g gVar4 = this.f285940r;
                    rectF4.set(floatValue, floatValue2, rect.width() + floatValue + (((java.lang.Number) ((jz5.n) gVar4).getValue()).floatValue() * f18), ((java.lang.Number) ((jz5.n) this.f285941s).getValue()).floatValue() + floatValue2);
                    float d17 = d();
                    float d18 = d();
                    android.graphics.Paint paint4 = this.B;
                    canvas.drawRoundRect(rectF4, d17, d18, paint4);
                    canvas.drawText(format, rectF4.left + ((java.lang.Number) ((jz5.n) gVar4).getValue()).floatValue(), rectF4.top + rect.height() + ((rectF4.height() - rect.height()) / f18), (android.text.TextPaint) ((jz5.n) gVar2).getValue());
                    if (mVar2 != ug.m.ImageClip) {
                        android.graphics.RectF rectF5 = this.f285928f;
                        float floatValue3 = rectF.left + ((java.lang.Number) ((jz5.n) gVar3).getValue()).floatValue();
                        float f66 = rectF4.bottom;
                        jz5.g gVar5 = this.f285939q;
                        rectF5.set(floatValue3, f66 + ((java.lang.Number) ((jz5.n) gVar5).getValue()).floatValue(), rectF.left + ((java.lang.Number) ((jz5.n) gVar3).getValue()).floatValue() + ((java.lang.Number) ((jz5.n) this.f285934l).getValue()).floatValue(), rectF4.bottom + ((java.lang.Number) ((jz5.n) gVar5).getValue()).floatValue() + ((java.lang.Number) ((jz5.n) this.f285933k).getValue()).floatValue());
                        android.graphics.RectF rectF6 = this.f285929g;
                        rectF6.set(rectF5.left + ((rectF5.width() - b()) / f18), rectF5.top + ((rectF5.height() - b()) / f18), rectF5.right - ((rectF5.width() - b()) / f18), rectF5.bottom - ((rectF5.height() - b()) / f18));
                        canvas.drawRoundRect(rectF5, d(), d(), paint4);
                        if (cVar.D()) {
                            canvas.drawBitmap((android.graphics.Bitmap) ((jz5.n) this.f285931i).getValue(), (android.graphics.Rect) null, rectF6, (android.graphics.Paint) null);
                        } else {
                            canvas.drawBitmap((android.graphics.Bitmap) ((jz5.n) this.f285930h).getValue(), (android.graphics.Rect) null, rectF6, (android.graphics.Paint) null);
                        }
                    }
                }
            }
        }
    }

    public final float b() {
        return ((java.lang.Number) ((jz5.n) this.f285932j).getValue()).floatValue();
    }

    public final float d() {
        return ((java.lang.Number) ((jz5.n) this.f285935m).getValue()).floatValue();
    }

    public final float e() {
        return ((java.lang.Number) this.f285936n.getValue()).floatValue();
    }

    public final float f() {
        return ((java.lang.Number) ((jz5.n) this.f285945w).getValue()).floatValue();
    }
}
