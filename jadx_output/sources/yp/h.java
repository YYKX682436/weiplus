package yp;

/* loaded from: classes5.dex */
public class h extends yp.a {

    /* renamed from: b, reason: collision with root package name */
    public static final android.text.TextPaint f464381b = new android.text.TextPaint();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Map f464382c = new java.util.HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final android.text.TextPaint f464383a = new android.text.TextPaint();

    @Override // yp.a
    public boolean a(wp.a aVar) {
        return true;
    }

    @Override // yp.a
    public yp.o b(wp.a aVar) {
        return null;
    }

    @Override // yp.a
    public wp.b c(wp.a aVar) {
        xp.i f17 = xp.d.f();
        float f18 = f17.f455855l;
        java.lang.String valueOf = java.lang.String.valueOf(aVar.f448354y);
        android.text.TextPaint textPaint = f464381b;
        textPaint.setTextSize(f18);
        float measureText = textPaint.measureText(valueOf);
        float f19 = f17.f455858o;
        float f27 = measureText + f19 + f19;
        float f28 = f17.f455855l;
        textPaint.setTextSize(f28);
        java.util.HashMap hashMap = (java.util.HashMap) f464382c;
        java.lang.Float f29 = (java.lang.Float) hashMap.get(java.lang.Float.valueOf(f28));
        if (f29 == null) {
            android.graphics.Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
            f29 = java.lang.Float.valueOf((fontMetrics.descent - fontMetrics.ascent) + fontMetrics.leading);
            hashMap.put(java.lang.Float.valueOf(f28), f29);
        }
        float floatValue = f29.floatValue() + (f17.f455857n * 2.0f);
        aVar.f448351v = floatValue;
        aVar.f448350u = f27;
        return new wp.b(f27, floatValue);
    }

    @Override // yp.a
    public wp.b d(wp.a aVar, yp.o oVar) {
        return c(aVar);
    }

    @Override // yp.a
    public wp.b e(wp.a aVar, yp.o oVar) {
        return c(aVar);
    }

    @Override // yp.a
    public void f(android.graphics.Canvas canvas, wp.a aVar, xp.d dVar, float f17, float f18) {
        xp.i f19 = xp.d.f();
        android.text.TextPaint textPaint = this.f464383a;
        textPaint.setTextSize(f19.f455855l);
        textPaint.setColor(-1);
        canvas.drawText(java.lang.String.valueOf(aVar.f448354y), f17 + f19.f455858o, (f18 + f19.f455857n) - textPaint.ascent(), textPaint);
    }

    @Override // yp.a
    public void g(wp.a aVar, xp.d dVar, float f17, float f18, android.view.View view) {
    }
}
