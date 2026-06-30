package hy0;

/* loaded from: classes5.dex */
public final class y implements iy0.c {

    /* renamed from: a, reason: collision with root package name */
    public yz5.a f286017a;

    /* renamed from: b, reason: collision with root package name */
    public final float f286018b;

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.Paint f286019c;

    public y(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        float dimensionPixelSize = j65.q.a(context).getDimensionPixelSize(com.tencent.mm.R.dimen.f480566al5);
        this.f286018b = j65.q.a(context).getDimensionPixelSize(com.tencent.mm.R.dimen.f480565al4);
        int color = j65.q.a(context).getColor(com.tencent.mm.R.color.ac8, null);
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setAntiAlias(true);
        paint.setColor(color);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeWidth(dimensionPixelSize);
        paint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        this.f286019c = paint;
    }

    @Override // iy0.c
    public void a(android.graphics.Canvas canvas, hy0.z2 context) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        kotlin.jvm.internal.o.g(context, "context");
        yz5.a aVar = this.f286017a;
        if ((aVar == null || ((java.lang.Boolean) aVar.invoke()).booleanValue()) ? false : true) {
            return;
        }
        bx0.h hVar = context.f286047c;
        bx0.f fVar = hVar.f36277d;
        e3.d dVar = fVar.f36266r;
        float f17 = (float) (dVar.f247044a + hVar.f36279f);
        int i17 = dVar.f247045b;
        int i18 = fVar.f36268t + i17;
        float f18 = this.f286018b;
        canvas.drawLine(f17, i17 - f18, f17, i18 + f18, this.f286019c);
    }
}
