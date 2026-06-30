package hy0;

/* loaded from: classes5.dex */
public final class i extends hy0.n {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.RectF f285841d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Path f285842e;

    /* renamed from: f, reason: collision with root package name */
    public final int f285843f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f285844g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.RectF f285845h;

    /* renamed from: i, reason: collision with root package name */
    public final int f285846i;

    /* renamed from: j, reason: collision with root package name */
    public final jz5.g f285847j;

    /* renamed from: k, reason: collision with root package name */
    public final jz5.g f285848k;

    /* renamed from: l, reason: collision with root package name */
    public final android.graphics.Paint f285849l;

    /* renamed from: m, reason: collision with root package name */
    public final android.graphics.Paint f285850m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f285851n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        jz5.g b17 = jz5.h.b(new hy0.f(context));
        jz5.g b18 = jz5.h.b(new hy0.g(context));
        jz5.g b19 = jz5.h.b(new hy0.h(context));
        jz5.g b27 = jz5.h.b(new hy0.e(context));
        this.f285841d = new android.graphics.RectF();
        this.f285842e = new android.graphics.Path();
        this.f285843f = (int) (j65.q.a(com.tencent.mm.sdk.platformtools.x2.f193071a).getDisplayMetrics().density * 8);
        this.f285844g = jz5.h.b(new hy0.a(context));
        int i17 = (int) (j65.q.a(com.tencent.mm.sdk.platformtools.x2.f193071a).getDisplayMetrics().density * 20);
        this.f285845h = new android.graphics.RectF(bx0.b.b(0, 0, i17, i17));
        this.f285846i = (int) (j65.q.a(com.tencent.mm.sdk.platformtools.x2.f193071a).getDisplayMetrics().density * 4);
        this.f285847j = jz5.h.b(new hy0.c(context));
        this.f285848k = jz5.h.b(new hy0.d(this));
        android.graphics.DashPathEffect dashPathEffect = new android.graphics.DashPathEffect(new float[]{((java.lang.Number) ((jz5.n) b17).getValue()).floatValue(), ((java.lang.Number) ((jz5.n) b18).getValue()).floatValue()}, 0.0f);
        android.graphics.CornerPathEffect cornerPathEffect = new android.graphics.CornerPathEffect(b());
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setAntiAlias(true);
        paint.setColor(((java.lang.Number) ((jz5.n) b27).getValue()).intValue());
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        paint.setStrokeWidth(((java.lang.Number) ((jz5.n) b19).getValue()).floatValue());
        paint.setPathEffect(new android.graphics.ComposePathEffect(dashPathEffect, cornerPathEffect));
        this.f285849l = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        paint2.setAntiAlias(true);
        paint2.setColor(-1);
        paint2.setAlpha(7);
        paint2.setStyle(android.graphics.Paint.Style.FILL);
        this.f285850m = paint2;
        this.f285851n = jz5.h.b(hy0.b.f285791d);
    }

    @Override // iy0.c
    public void a(android.graphics.Canvas canvas, hy0.z2 context) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        kotlin.jvm.internal.o.g(context, "context");
        android.graphics.Rect rect = context.f286049e;
        float f17 = rect.bottom + this.f285889b;
        android.graphics.RectF rectF = this.f285841d;
        rectF.set(rect.left, f17, rect.right + 9999, this.f285888a + f17);
        hy0.y2 y2Var = hy0.y2.f286040d;
        bx0.h hVar = context.f286047c;
        hVar.getClass();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = hVar.f36278e;
        android.graphics.RectF rectF2 = (android.graphics.RectF) concurrentHashMap.get(y2Var);
        if (rectF2 != null) {
            rectF2.set(rectF);
        } else {
            concurrentHashMap.put(y2Var, rectF);
        }
        android.graphics.Path path = this.f285842e;
        path.reset();
        path.addRect(rectF, android.graphics.Path.Direction.CW);
        canvas.drawRect(rectF, this.f285850m);
        canvas.drawPath(path, this.f285849l);
        android.graphics.RectF rectF3 = this.f285845h;
        int centerX = context.f286048d.centerX();
        int i17 = rect.left;
        if (centerX < i17) {
            centerX = i17;
        }
        rectF3.offsetTo(centerX + this.f285843f, rectF.centerY() - (rectF3.height() / 2));
        canvas.drawBitmap((android.graphics.Bitmap) ((jz5.n) this.f285844g).getValue(), (android.graphics.Rect) null, rectF3, (android.graphics.Paint) null);
        canvas.drawText((java.lang.String) ((jz5.n) this.f285847j).getValue(), rectF3.right + this.f285846i, rectF3.centerY() - ((android.graphics.Rect) ((jz5.n) this.f285848k).getValue()).exactCenterY(), (android.text.TextPaint) ((jz5.n) this.f285851n).getValue());
    }
}
