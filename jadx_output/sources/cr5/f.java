package cr5;

/* loaded from: classes11.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final zq5.k f222026a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View f222027b;

    /* renamed from: c, reason: collision with root package name */
    public final er5.g f222028c;

    /* renamed from: d, reason: collision with root package name */
    public final br5.e f222029d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Rect f222030e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Rect f222031f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.Matrix f222032g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.Paint f222033h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f222034i;

    public f(zq5.k logger, android.view.View view, er5.g zoomableEngine, br5.e subsamplingEngine) {
        kotlin.jvm.internal.o.g(logger, "logger");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(zoomableEngine, "zoomableEngine");
        kotlin.jvm.internal.o.g(subsamplingEngine, "subsamplingEngine");
        this.f222026a = logger;
        this.f222027b = view;
        this.f222028c = zoomableEngine;
        this.f222029d = subsamplingEngine;
        this.f222030e = new android.graphics.Rect();
        this.f222031f = new android.graphics.Rect();
        this.f222032g = new android.graphics.Matrix();
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.y0 a17 = kotlinx.coroutines.z0.a(kotlinx.coroutines.internal.b0.f310484a);
        this.f222033h = new android.graphics.Paint();
        this.f222034i = jz5.h.b(new cr5.c(this));
        kotlinx.coroutines.l.d(a17, null, null, new cr5.b(this, null), 3, null);
    }

    public static final boolean a(cr5.f fVar, android.graphics.Canvas canvas, yq5.r rVar, boolean z17) {
        fVar.getClass();
        yq5.p pVar = rVar.f464621d;
        if (pVar == null) {
            return false;
        }
        if (!(!((yq5.a) pVar).f464588a.isRecycled())) {
            pVar = null;
        }
        if (pVar == null) {
            return false;
        }
        android.graphics.Bitmap bitmap = ((yq5.a) pVar).f464588a;
        android.graphics.Bitmap bitmap2 = bitmap.isRecycled() ^ true ? bitmap : null;
        if (bitmap2 == null) {
            return false;
        }
        int width = bitmap2.getWidth();
        int height = bitmap2.getHeight();
        android.graphics.Rect rect = fVar.f222030e;
        rect.set(0, 0, width, height);
        zq5.e eVar = rVar.f464619b;
        int i17 = eVar.f475061a;
        int i18 = eVar.f475063c;
        int i19 = eVar.f475064d;
        android.graphics.Rect rect2 = fVar.f222031f;
        rect2.set(i17, eVar.f475062b, i18, i19);
        android.graphics.Paint paint = fVar.f222033h;
        paint.setAlpha(rVar.f464624g);
        canvas.drawBitmap(bitmap2, rect, rect2, paint);
        if (z17) {
            int i27 = rVar.f464622e;
            int i28 = i27 == 2 ? rVar.f464623f == 1 ? -16711936 : -16724737 : i27 == 1 ? -256 : -65536;
            jz5.g gVar = fVar.f222034i;
            ((android.graphics.Paint) ((jz5.n) gVar).getValue()).setColor(i28);
            canvas.drawRect(rect2, (android.graphics.Paint) ((jz5.n) gVar).getValue());
        }
        return true;
    }
}
