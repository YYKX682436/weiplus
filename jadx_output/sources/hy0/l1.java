package hy0;

/* loaded from: classes5.dex */
public final class l1 implements iy0.c {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.maas.base.MJID f285866a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.RectF f285867b;

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.RectF f285868c;

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.RectF f285869d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.RectF f285870e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f285871f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f285872g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.Path f285873h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f285874i;

    /* renamed from: j, reason: collision with root package name */
    public final jz5.g f285875j;

    /* renamed from: k, reason: collision with root package name */
    public final jz5.g f285876k;

    /* renamed from: l, reason: collision with root package name */
    public final android.graphics.Paint f285877l;

    /* renamed from: m, reason: collision with root package name */
    public final android.graphics.Paint f285878m;

    /* renamed from: n, reason: collision with root package name */
    public final android.graphics.Paint f285879n;

    /* renamed from: o, reason: collision with root package name */
    public final android.graphics.Paint f285880o;

    /* renamed from: p, reason: collision with root package name */
    public final android.graphics.Paint f285881p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f285882q;

    public l1(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f285867b = new android.graphics.RectF();
        this.f285868c = new android.graphics.RectF();
        this.f285869d = new android.graphics.RectF();
        this.f285870e = new android.graphics.RectF();
        this.f285871f = jz5.h.b(new hy0.z0(context));
        this.f285872g = jz5.h.b(new hy0.a1(context));
        this.f285873h = new android.graphics.Path();
        this.f285874i = jz5.h.b(new hy0.h1(context));
        jz5.g b17 = jz5.h.b(new hy0.g1(context));
        jz5.g b18 = jz5.h.b(new hy0.e1(context));
        this.f285875j = jz5.h.b(new hy0.d1(context));
        this.f285876k = jz5.h.b(new hy0.j1(context));
        jz5.g b19 = jz5.h.b(new hy0.b1(context));
        jz5.g b27 = jz5.h.b(new hy0.f1(context));
        jz5.g b28 = jz5.h.b(new hy0.c1(context));
        jz5.g b29 = jz5.h.b(new hy0.i1(context));
        jz5.g b37 = jz5.h.b(new hy0.k1(context));
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setAntiAlias(true);
        paint.setColor(((java.lang.Number) ((jz5.n) b19).getValue()).intValue());
        paint.setStyle(android.graphics.Paint.Style.FILL);
        this.f285877l = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        paint2.setAntiAlias(true);
        paint2.setColor(((java.lang.Number) ((jz5.n) b27).getValue()).intValue());
        paint2.setStyle(android.graphics.Paint.Style.STROKE);
        paint2.setStrokeWidth(((java.lang.Number) ((jz5.n) b17).getValue()).floatValue());
        paint2.setStrokeCap(android.graphics.Paint.Cap.BUTT);
        this.f285878m = paint2;
        android.graphics.Paint paint3 = new android.graphics.Paint();
        paint3.setAntiAlias(true);
        paint3.setColor(((java.lang.Number) ((jz5.n) b28).getValue()).intValue());
        paint3.setStyle(android.graphics.Paint.Style.STROKE);
        paint3.setStrokeWidth(((java.lang.Number) ((jz5.n) b18).getValue()).floatValue());
        paint3.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        this.f285879n = paint3;
        android.graphics.Paint paint4 = new android.graphics.Paint();
        paint4.setAntiAlias(true);
        paint4.setColor(((java.lang.Number) ((jz5.n) b37).getValue()).intValue());
        paint4.setStyle(android.graphics.Paint.Style.FILL);
        this.f285880o = paint4;
        android.graphics.Paint paint5 = new android.graphics.Paint();
        paint5.setAntiAlias(true);
        paint5.setColor(((java.lang.Number) ((jz5.n) b29).getValue()).intValue());
        paint5.setStyle(android.graphics.Paint.Style.STROKE);
        paint5.setStrokeWidth(f());
        this.f285881p = paint5;
    }

    @Override // iy0.c
    public void a(android.graphics.Canvas canvas, hy0.z2 context) {
        jv0.h state;
        kotlin.jvm.internal.o.g(canvas, "canvas");
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.maas.base.MJID mjid = this.f285866a;
        if (mjid == null) {
            return;
        }
        com.tencent.mm.mj_publisher.finder.widgets.timelineview.BaseTimelineView baseTimelineView = context.f286045a;
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.duration.DurationModifyTimelineView durationModifyTimelineView = baseTimelineView instanceof com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.duration.DurationModifyTimelineView ? (com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.duration.DurationModifyTimelineView) baseTimelineView : null;
        if (durationModifyTimelineView == null || (state = durationModifyTimelineView.getState()) == null) {
            return;
        }
        boolean z17 = this.f285882q;
        android.graphics.RectF rectF = this.f285868c;
        android.graphics.RectF rectF2 = this.f285867b;
        if (!z17) {
            bx0.h hVar = context.f286047c;
            rectF2.set(hVar.b(mjid, true));
            rectF.set(hVar.d(mjid, true));
        }
        canvas.drawRect(rectF2, this.f285880o);
        int ordinal = state.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal != 2) {
                return;
            }
            float f17 = 2;
            canvas.drawRect((f() / f17) + rectF2.left, (f() / f17) + rectF2.top, rectF2.right - (f() / f17), rectF2.bottom - (f() / f17), this.f285881p);
            return;
        }
        float f18 = rectF2.left;
        float f19 = rectF2.top;
        float f27 = rectF.bottom;
        android.graphics.Paint paint = this.f285878m;
        canvas.drawLine(f18, f19, f18, f27, paint);
        float f28 = rectF2.right;
        canvas.drawLine(f28, rectF2.top, f28, rectF.bottom, paint);
        android.graphics.RectF rectF3 = this.f285869d;
        float f29 = rectF.left;
        jz5.g gVar = this.f285874i;
        float f37 = 2;
        rectF3.set(f29 - ((java.lang.Number) ((jz5.n) gVar).getValue()).floatValue(), rectF.top - (d() / f37), rectF.left, rectF.bottom + (d() / f37));
        android.graphics.Path path = this.f285873h;
        path.reset();
        path.moveTo(rectF3.left + b(), rectF3.top);
        path.lineTo(rectF3.right, rectF3.top);
        path.lineTo(rectF3.right, rectF3.bottom);
        path.lineTo(rectF3.left + b(), rectF3.bottom);
        float f38 = rectF3.left;
        float f39 = rectF3.bottom;
        path.quadTo(f38, f39, f38, f39 - b());
        path.lineTo(rectF3.left, rectF3.top + b());
        float f47 = rectF3.left;
        path.quadTo(f47, rectF3.top, b() + f47, rectF3.top);
        path.close();
        android.graphics.Paint paint2 = this.f285877l;
        canvas.drawPath(path, paint2);
        float centerX = rectF3.centerX();
        float centerY = rectF3.centerY();
        float e17 = centerY - (e() / f37);
        float e18 = centerY + (e() / f37);
        android.graphics.Paint paint3 = this.f285879n;
        canvas.drawLine(centerX, e17, centerX, e18, paint3);
        android.graphics.RectF rectF4 = this.f285870e;
        rectF4.set(rectF.right, rectF.top - (d() / f37), rectF.right + ((java.lang.Number) ((jz5.n) gVar).getValue()).floatValue(), rectF.bottom + (d() / f37));
        path.reset();
        path.moveTo(rectF4.left, rectF4.top);
        path.lineTo(rectF4.left, rectF4.bottom);
        path.lineTo(rectF4.right - b(), rectF4.bottom);
        float f48 = rectF4.right;
        float f49 = rectF4.bottom;
        path.quadTo(f48, f49, f48, f49 - b());
        path.lineTo(rectF4.right, rectF4.top + b());
        float f57 = rectF4.right;
        path.quadTo(f57, rectF4.top, f57 - b(), rectF4.top);
        path.lineTo(rectF4.left, rectF4.top);
        path.close();
        canvas.drawPath(path, paint2);
        float centerX2 = rectF4.centerX();
        float centerY2 = rectF4.centerY();
        canvas.drawLine(centerX2, centerY2 - (e() / f37), centerX2, centerY2 + (e() / f37), paint3);
    }

    public final float b() {
        return ((java.lang.Number) ((jz5.n) this.f285871f).getValue()).floatValue();
    }

    public final float d() {
        return ((java.lang.Number) ((jz5.n) this.f285872g).getValue()).floatValue();
    }

    public final float e() {
        return ((java.lang.Number) ((jz5.n) this.f285875j).getValue()).floatValue();
    }

    public final float f() {
        return ((java.lang.Number) this.f285876k.getValue()).floatValue();
    }
}
