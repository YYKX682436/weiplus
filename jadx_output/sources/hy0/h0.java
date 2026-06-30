package hy0;

/* loaded from: classes5.dex */
public abstract class h0 implements iy0.c {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.RectF f285837a = new android.graphics.RectF();

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hy0.y0 f285838b;

    public h0(hy0.y0 y0Var) {
        this.f285838b = y0Var;
    }

    public final void f(android.graphics.Canvas canvas, float[] decibels, ex0.q qVar) {
        float f17;
        kotlin.jvm.internal.o.g(canvas, "canvas");
        kotlin.jvm.internal.o.g(decibels, "decibels");
        hy0.y0 y0Var = this.f285838b;
        hy0.b3 b3Var = y0Var.f286023j;
        android.graphics.RectF borderRect = this.f285837a;
        b3Var.getClass();
        kotlin.jvm.internal.o.g(borderRect, "borderRect");
        b3Var.f285795a.set(borderRect);
        hy0.b3 b3Var2 = y0Var.f286023j;
        b3Var2.getClass();
        float f18 = 0.0f;
        if (qVar != null) {
            com.tencent.maas.moviecomposing.segments.ElementSegment elementSegment = qVar.f257130f;
            f17 = (float) (elementSegment.i0().toMilliseconds() / elementSegment.p0().toMilliseconds());
        } else {
            f17 = 0.0f;
        }
        if (qVar != null) {
            com.tencent.maas.moviecomposing.segments.ElementSegment elementSegment2 = qVar.f257130f;
            elementSegment2.getClass();
            com.tencent.maas.model.time.MJTime mJTime = com.tencent.maas.model.time.MJTime.ZeroTime;
            com.tencent.maas.moviecomposing.Timeline D = elementSegment2.D();
            if (D != null) {
                mJTime = com.tencent.maas.moviecomposing.segments.ElementSegment.X(elementSegment2, D);
            }
            f18 = (float) (mJTime.toMilliseconds() / elementSegment2.p0().toMilliseconds());
        }
        java.lang.Float g07 = kz5.z.g0(decibels);
        if (g07 != null) {
            b3Var2.f285798d = g07.floatValue();
            java.lang.Float i07 = kz5.z.i0(decibels);
            if (i07 != null) {
                b3Var2.f285799e = i07.floatValue();
                canvas.save();
                android.graphics.RectF rectF = b3Var2.f285795a;
                canvas.clipRect(rectF);
                float width = rectF.width() / ((1 - f17) - f18);
                float length = width / decibels.length;
                float f19 = rectF.bottom;
                float f27 = rectF.left - (width * f17);
                android.graphics.Path path = b3Var2.f285797c;
                path.reset();
                path.moveTo(f27, f19);
                for (float f28 : decibels) {
                    f27 += length;
                    float f29 = b3Var2.f285799e;
                    path.lineTo(f27, f19 - (((f28 - f29) / (b3Var2.f285798d - f29)) * (rectF.height() * 0.714f)));
                }
                path.lineTo(f27, f19);
                path.close();
                canvas.drawPath(path, b3Var2.f285796b);
                canvas.restore();
            }
        }
    }
}
