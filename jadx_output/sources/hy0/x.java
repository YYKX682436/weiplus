package hy0;

/* loaded from: classes5.dex */
public final class x extends iy0.h {

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f285998g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f285999h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f286000i;

    /* renamed from: j, reason: collision with root package name */
    public final jz5.g f286001j;

    /* renamed from: k, reason: collision with root package name */
    public final jz5.g f286002k;

    /* renamed from: l, reason: collision with root package name */
    public final android.graphics.Paint f286003l;

    /* renamed from: m, reason: collision with root package name */
    public final android.text.TextPaint f286004m;

    /* renamed from: n, reason: collision with root package name */
    public final android.text.TextPaint f286005n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f285998g = jz5.h.b(new hy0.r(this, context));
        this.f285999h = jz5.h.b(new hy0.w(context));
        this.f286000i = jz5.h.b(new hy0.q(context));
        this.f286001j = jz5.h.b(new hy0.t(context));
        this.f286002k = jz5.h.b(new hy0.u(context));
        jz5.g b17 = jz5.h.b(new hy0.p(context));
        jz5.g b18 = jz5.h.b(new hy0.s(context));
        jz5.g b19 = jz5.h.b(new hy0.v(context));
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setAntiAlias(true);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        paint.setColor(((java.lang.Number) ((jz5.n) b17).getValue()).intValue());
        this.f286003l = paint;
        android.text.TextPaint textPaint = new android.text.TextPaint();
        textPaint.setAntiAlias(true);
        textPaint.setColor(((java.lang.Number) ((jz5.n) b18).getValue()).intValue());
        float f17 = 12;
        textPaint.setTextSize((int) (j65.q.a(com.tencent.mm.sdk.platformtools.x2.f193071a).getDisplayMetrics().density * f17));
        textPaint.setTextAlign(android.graphics.Paint.Align.LEFT);
        this.f286004m = textPaint;
        android.text.TextPaint textPaint2 = new android.text.TextPaint();
        textPaint2.setAntiAlias(true);
        textPaint2.setColor(((java.lang.Number) ((jz5.n) b19).getValue()).intValue());
        textPaint2.setTextSize((int) (j65.q.a(com.tencent.mm.sdk.platformtools.x2.f193071a).getDisplayMetrics().density * f17));
        textPaint2.setTextAlign(android.graphics.Paint.Align.LEFT);
        this.f286005n = textPaint2;
    }

    public static final float b(hy0.x xVar) {
        return ((java.lang.Number) ((jz5.n) xVar.f286000i).getValue()).floatValue();
    }

    @Override // iy0.c
    public void a(android.graphics.Canvas canvas, hy0.z2 context) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        kotlin.jvm.internal.o.g(context, "context");
        ((hy0.o) ((jz5.n) this.f285998g).getValue()).a(canvas, context);
    }
}
