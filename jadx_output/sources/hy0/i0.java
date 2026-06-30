package hy0;

/* loaded from: classes5.dex */
public final class i0 extends hy0.h0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ hy0.y0 f285852c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(hy0.y0 y0Var) {
        super(y0Var);
        this.f285852c = y0Var;
    }

    @Override // iy0.c
    public void a(android.graphics.Canvas canvas, hy0.z2 context) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        kotlin.jvm.internal.o.g(context, "context");
        ex0.e eVar = context.f286046b.I;
        double pixelOffsetForTime = context.f286047c.f36277d.f36267s.pixelOffsetForTime(eVar.f257124b);
        int centerX = context.f286048d.centerX();
        android.graphics.RectF rectF = this.f285837a;
        android.graphics.RectF rectF2 = this.f285852c.f295716b;
        rectF.set((float) pixelOffsetForTime, rectF2.top, centerX, rectF2.bottom);
        hy0.y0 y0Var = this.f285838b;
        canvas.drawRoundRect(rectF, hy0.y0.b(y0Var), hy0.y0.b(y0Var), y0Var.f286025l);
        f(canvas, eVar.f257125c, null);
    }
}
