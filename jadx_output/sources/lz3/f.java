package lz3;

/* loaded from: classes15.dex */
public final class f extends lz3.b {

    /* renamed from: c, reason: collision with root package name */
    public final android.content.Context f322375c;

    /* renamed from: d, reason: collision with root package name */
    public final int f322376d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Matrix f322377e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.PointF f322378f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.PointF f322379g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f322380h;

    public f(android.content.Context context, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f322375c = context;
        this.f322376d = i17;
        this.f322377e = new android.graphics.Matrix();
        this.f322378f = new android.graphics.PointF();
        this.f322379g = new android.graphics.PointF();
    }

    @Override // lz3.e
    public void a(lz3.c animationInfo) {
        kotlin.jvm.internal.o.g(animationInfo, "animationInfo");
        if (!this.f322380h && (this.f322365a instanceof db5.f0)) {
            lz3.d dVar = animationInfo.f322372f;
            android.graphics.PointF pointF = dVar.f322373a;
            lz3.d dVar2 = animationInfo.f322371e;
            pointF.set(dVar2.f322373a);
            dVar.f322374b.set(dVar2.f322374b);
            android.view.KeyEvent.Callback callback = this.f322365a;
            kotlin.jvm.internal.o.e(callback, "null cannot be cast to non-null type com.tencent.mm.ui.base.IZoomableImageView");
            android.graphics.PointF imageViewMatrixScale = ((db5.f0) callback).getImageViewMatrixScale();
            if (imageViewMatrixScale != null) {
                dVar2.f322373a.set(imageViewMatrixScale);
            }
            android.view.KeyEvent.Callback callback2 = this.f322365a;
            kotlin.jvm.internal.o.e(callback2, "null cannot be cast to non-null type com.tencent.mm.ui.base.IZoomableImageView");
            android.graphics.PointF imageViewMatrixTranslation = ((db5.f0) callback2).getImageViewMatrixTranslation();
            if (imageViewMatrixTranslation != null) {
                dVar2.f322374b.set(imageViewMatrixTranslation);
            }
            this.f322366b = animationInfo;
            this.f322380h = true;
            android.graphics.PointF pointF2 = dVar2.f322373a;
            android.graphics.PointF pointF3 = dVar2.f322374b;
            android.graphics.PointF pointF4 = dVar.f322373a;
            android.graphics.PointF pointF5 = dVar.f322374b;
        }
    }

    @Override // lz3.e
    public void b(float f17) {
        f(f17);
    }

    @Override // lz3.e
    public void c(float f17) {
        f(f17);
    }

    @Override // lz3.e
    public boolean d() {
        if (this.f322376d == 1) {
            return !(this.f322375c.getResources().getConfiguration().orientation == 2);
        }
        return false;
    }

    @Override // lz3.b, lz3.e
    public void e(lz3.c animationInfo) {
        kotlin.jvm.internal.o.g(animationInfo, "animationInfo");
        super.e(animationInfo);
        this.f322380h = false;
    }

    public final void f(float f17) {
        lz3.c cVar = this.f322366b;
        if (cVar == null) {
            return;
        }
        android.graphics.PointF pointF = this.f322378f;
        kotlin.jvm.internal.o.d(cVar);
        android.graphics.PointF pointF2 = cVar.f322371e.f322373a;
        lz3.c cVar2 = this.f322366b;
        kotlin.jvm.internal.o.d(cVar2);
        android.graphics.PointF pointF3 = cVar2.f322372f.f322373a;
        float f18 = pointF2.x;
        float f19 = pointF2.y;
        float f27 = pointF3.x;
        float f28 = pointF3.y;
        if (!(f18 == f27)) {
            f18 += (f27 - f18) * f17;
        }
        if (!(f19 == f27)) {
            f19 += (f28 - f19) * f17;
        }
        pointF.x = f18;
        pointF.y = f19;
        android.graphics.PointF pointF4 = this.f322379g;
        lz3.c cVar3 = this.f322366b;
        kotlin.jvm.internal.o.d(cVar3);
        android.graphics.PointF pointF5 = cVar3.f322371e.f322374b;
        lz3.c cVar4 = this.f322366b;
        kotlin.jvm.internal.o.d(cVar4);
        android.graphics.PointF pointF6 = cVar4.f322372f.f322374b;
        float f29 = pointF5.x;
        float f37 = pointF5.y;
        float f38 = pointF6.x;
        float f39 = pointF6.y;
        if (!(f29 == f38)) {
            f29 += (f38 - f29) * f17;
        }
        if (!(f37 == f39)) {
            f37 += f17 * (f39 - f37);
        }
        pointF4.x = f29;
        pointF4.y = f37;
        android.graphics.Matrix matrix = this.f322377e;
        matrix.reset();
        matrix.setScale(pointF.x, pointF.y);
        matrix.postTranslate(pointF4.x, pointF4.y);
        android.view.KeyEvent.Callback callback = this.f322365a;
        kotlin.jvm.internal.o.e(callback, "null cannot be cast to non-null type com.tencent.mm.ui.base.IZoomableImageView");
        ((db5.f0) callback).setImageViewMatrix(matrix);
    }
}
