package e1;

/* loaded from: classes14.dex */
public final class b implements e1.u {

    /* renamed from: a, reason: collision with root package name */
    public android.graphics.Canvas f246225a = e1.c.f246229a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.Rect f246226b = new android.graphics.Rect();

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.Rect f246227c = new android.graphics.Rect();

    @Override // e1.u
    public void a(d1.g rect, e1.n0 paint) {
        kotlin.jvm.internal.o.g(rect, "rect");
        kotlin.jvm.internal.o.g(paint, "paint");
        q(rect.f225629a, rect.f225630b, rect.f225631c, rect.f225632d, paint);
    }

    @Override // e1.u
    public void b() {
        this.f246225a.restore();
    }

    @Override // e1.u
    public void c() {
        this.f246225a.save();
    }

    @Override // e1.u
    public void d(float f17, float f18, float f19, float f27, int i17) {
        this.f246225a.clipRect(f17, f18, f19, f27, i17 == 0 ? android.graphics.Region.Op.DIFFERENCE : android.graphics.Region.Op.INTERSECT);
    }

    @Override // e1.u
    public void e(float f17, float f18) {
        this.f246225a.translate(f17, f18);
    }

    @Override // e1.u
    public void f(e1.g0 image, long j17, e1.n0 paint) {
        kotlin.jvm.internal.o.g(image, "image");
        kotlin.jvm.internal.o.g(paint, "paint");
        this.f246225a.drawBitmap(e1.e.a(image), d1.e.c(j17), d1.e.d(j17), ((e1.g) paint).f246254a);
    }

    @Override // e1.u
    public void g() {
        e1.w.f246290a.a(this.f246225a, false);
    }

    @Override // e1.u
    public void h(float f17, float f18) {
        this.f246225a.scale(f17, f18);
    }

    @Override // e1.u
    public void i(e1.p0 path, int i17) {
        kotlin.jvm.internal.o.g(path, "path");
        android.graphics.Canvas canvas = this.f246225a;
        if (!(path instanceof e1.i)) {
            throw new java.lang.UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(((e1.i) path).f246263a, i17 == 0 ? android.graphics.Region.Op.DIFFERENCE : android.graphics.Region.Op.INTERSECT);
    }

    @Override // e1.u
    public void j(float f17, float f18, float f19, float f27, float f28, float f29, boolean z17, e1.n0 paint) {
        kotlin.jvm.internal.o.g(paint, "paint");
        this.f246225a.drawArc(f17, f18, f19, f27, f28, f29, z17, ((e1.g) paint).f246254a);
    }

    @Override // e1.u
    public void k(d1.g bounds, e1.n0 paint) {
        kotlin.jvm.internal.o.g(bounds, "bounds");
        kotlin.jvm.internal.o.g(paint, "paint");
        this.f246225a.saveLayer(bounds.f225629a, bounds.f225630b, bounds.f225631c, bounds.f225632d, ((e1.g) paint).f246254a, 31);
    }

    @Override // e1.u
    public void l(e1.p0 path, e1.n0 paint) {
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(paint, "paint");
        android.graphics.Canvas canvas = this.f246225a;
        if (!(path instanceof e1.i)) {
            throw new java.lang.UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(((e1.i) path).f246263a, ((e1.g) paint).f246254a);
    }

    @Override // e1.u
    public void m() {
        e1.w.f246290a.a(this.f246225a, true);
    }

    @Override // e1.u
    public void n(d1.g rect, int i17) {
        kotlin.jvm.internal.o.g(rect, "rect");
        d(rect.f225629a, rect.f225630b, rect.f225631c, rect.f225632d, i17);
    }

    @Override // e1.u
    public void o(float f17) {
        this.f246225a.rotate(f17);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e3  */
    @Override // e1.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void p(float[] r24) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.b.p(float[]):void");
    }

    @Override // e1.u
    public void q(float f17, float f18, float f19, float f27, e1.n0 paint) {
        kotlin.jvm.internal.o.g(paint, "paint");
        this.f246225a.drawRect(f17, f18, f19, f27, ((e1.g) paint).f246254a);
    }

    @Override // e1.u
    public void r(long j17, float f17, e1.n0 paint) {
        kotlin.jvm.internal.o.g(paint, "paint");
        this.f246225a.drawCircle(d1.e.c(j17), d1.e.d(j17), f17, ((e1.g) paint).f246254a);
    }

    @Override // e1.u
    public void s(float f17, float f18, float f19, float f27, float f28, float f29, e1.n0 paint) {
        kotlin.jvm.internal.o.g(paint, "paint");
        this.f246225a.drawRoundRect(f17, f18, f19, f27, f28, f29, ((e1.g) paint).f246254a);
    }

    @Override // e1.u
    public void t(e1.g0 image, long j17, long j18, long j19, long j27, e1.n0 paint) {
        kotlin.jvm.internal.o.g(image, "image");
        kotlin.jvm.internal.o.g(paint, "paint");
        android.graphics.Canvas canvas = this.f246225a;
        android.graphics.Bitmap a17 = e1.e.a(image);
        int i17 = p2.m.f351389c;
        int i18 = (int) (j17 >> 32);
        android.graphics.Rect rect = this.f246226b;
        rect.left = i18;
        rect.top = p2.m.b(j17);
        rect.right = i18 + ((int) (j18 >> 32));
        rect.bottom = p2.m.b(j17) + p2.q.b(j18);
        int i19 = (int) (j19 >> 32);
        android.graphics.Rect rect2 = this.f246227c;
        rect2.left = i19;
        rect2.top = p2.m.b(j19);
        rect2.right = i19 + ((int) (j27 >> 32));
        rect2.bottom = p2.m.b(j19) + p2.q.b(j27);
        canvas.drawBitmap(a17, rect, rect2, ((e1.g) paint).f246254a);
    }

    @Override // e1.u
    public void u(long j17, long j18, e1.n0 paint) {
        kotlin.jvm.internal.o.g(paint, "paint");
        this.f246225a.drawLine(d1.e.c(j17), d1.e.d(j17), d1.e.c(j18), d1.e.d(j18), ((e1.g) paint).f246254a);
    }
}
