package hy0;

/* loaded from: classes5.dex */
public final class u1 implements iy0.c {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.maas.base.MJID f285978a;

    /* renamed from: b, reason: collision with root package name */
    public final float f285979b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Set f285980c;

    /* renamed from: d, reason: collision with root package name */
    public final float f285981d;

    /* renamed from: e, reason: collision with root package name */
    public final float f285982e;

    /* renamed from: f, reason: collision with root package name */
    public final float f285983f;

    /* renamed from: g, reason: collision with root package name */
    public final int f285984g;

    /* renamed from: h, reason: collision with root package name */
    public final int f285985h;

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.Paint f285986i;

    /* renamed from: j, reason: collision with root package name */
    public final android.graphics.Paint f285987j;

    public u1(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f285979b = 0.1f;
        this.f285980c = new java.util.LinkedHashSet();
        float dimensionPixelSize = j65.q.a(context).getDimensionPixelSize(com.tencent.mm.R.dimen.al7);
        this.f285981d = j65.q.a(context).getDimensionPixelSize(com.tencent.mm.R.dimen.alg) / 2;
        float dimensionPixelSize2 = j65.q.a(context).getDimensionPixelSize(com.tencent.mm.R.dimen.al8);
        this.f285982e = dimensionPixelSize2;
        this.f285983f = j65.q.a(context).getDimensionPixelSize(com.tencent.mm.R.dimen.f480564al3);
        int color = j65.q.a(context).getColor(com.tencent.mm.R.color.afp, null);
        this.f285984g = color;
        this.f285985h = j65.q.a(context).getColor(com.tencent.mm.R.color.afo, null);
        int color2 = j65.q.a(context).getColor(com.tencent.mm.R.color.afq, null);
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setAntiAlias(true);
        paint.setColor(color);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeWidth(dimensionPixelSize);
        paint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        this.f285986i = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        paint2.setAntiAlias(true);
        paint2.setColor(color2);
        paint2.setStyle(android.graphics.Paint.Style.STROKE);
        paint2.setStrokeWidth(dimensionPixelSize2);
        paint2.setStrokeCap(android.graphics.Paint.Cap.BUTT);
        this.f285987j = paint2;
    }

    @Override // iy0.c
    public void a(android.graphics.Canvas canvas, hy0.z2 context) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.maas.base.MJID mjid = this.f285978a;
        if (mjid == null) {
            return;
        }
        ex0.r K = context.f286046b.K(mjid);
        ex0.f fVar = K instanceof ex0.f ? (ex0.f) K : null;
        if (fVar == null) {
            return;
        }
        bx0.h hVar = context.f286047c;
        boolean z17 = false;
        android.graphics.Rect b17 = hVar.b(mjid, false);
        java.util.Set set = this.f285980c;
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            float pixelOffsetForTime = (float) hVar.f36277d.f36267s.pixelOffsetForTime((com.tencent.maas.model.time.MJTime) it.next());
            android.graphics.Paint paint = this.f285986i;
            paint.setColor(this.f285984g);
            float f17 = hVar.f36277d.f36266r.f247045b;
            float f18 = this.f285983f;
            canvas.drawPoint(pixelOffsetForTime, f17 - f18, paint);
            paint.setColor(this.f285985h);
            ax0.a aVar = fVar.f257134j;
            ax0.a aVar2 = ax0.a.f14961e;
            float f19 = this.f285979b;
            if (aVar == aVar2 && java.lang.Math.abs(b17.left - pixelOffsetForTime) < f19) {
                canvas.drawPoint(pixelOffsetForTime, hVar.f36277d.f36266r.f247045b - f18, paint);
            } else if (fVar.f257134j == ax0.a.f14962f && java.lang.Math.abs(b17.right - pixelOffsetForTime) < f19) {
                canvas.drawPoint(pixelOffsetForTime, hVar.f36277d.f36266r.f247045b - f18, paint);
            }
        }
        if (fVar.f257133i && fVar.f257135k == ax0.d.f14973f) {
            int ordinal = fVar.f257134j.ordinal();
            android.graphics.Paint paint2 = this.f285987j;
            float f27 = this.f285982e;
            if (ordinal == 1) {
                com.tencent.maas.model.time.MJTime k17 = fVar.k();
                if (!(set instanceof java.util.Collection) || !set.isEmpty()) {
                    java.util.Iterator it6 = set.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            break;
                        } else if (((com.tencent.maas.model.time.MJTime) it6.next()).equalsTo(k17)) {
                            z17 = true;
                            break;
                        }
                    }
                }
                if (z17) {
                    return;
                }
                int ordinal2 = fVar.f257137m.ordinal();
                float f28 = this.f285981d;
                if (ordinal2 == 1) {
                    float f29 = (b17.left - f28) - (f27 / 2);
                    canvas.drawLine(f29, b17.top, f29, b17.bottom, paint2);
                    return;
                } else {
                    if (ordinal2 != 2) {
                        return;
                    }
                    float f37 = b17.left + f28 + (f27 / 2);
                    canvas.drawLine(f37, b17.top, f37, b17.bottom, paint2);
                    return;
                }
            }
            if (ordinal != 2) {
                return;
            }
            com.tencent.maas.model.time.MJTime endTime = fVar.l().getEndTime();
            if (!(set instanceof java.util.Collection) || !set.isEmpty()) {
                java.util.Iterator it7 = set.iterator();
                while (true) {
                    if (!it7.hasNext()) {
                        break;
                    } else if (((com.tencent.maas.model.time.MJTime) it7.next()).equalsTo(endTime)) {
                        z17 = true;
                        break;
                    }
                }
            }
            if (z17) {
                return;
            }
            int ordinal3 = fVar.f257137m.ordinal();
            if (ordinal3 == 1) {
                float f38 = (f27 / 2) + b17.right;
                canvas.drawLine(f38, b17.top, f38, b17.bottom, paint2);
            } else {
                if (ordinal3 != 2) {
                    return;
                }
                float f39 = b17.right - (f27 / 2);
                canvas.drawLine(f39, b17.top, f39, b17.bottom, paint2);
            }
        }
    }
}
