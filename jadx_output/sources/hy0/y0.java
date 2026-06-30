package hy0;

/* loaded from: classes5.dex */
public final class y0 extends iy0.h {

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f286020g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f286021h;

    /* renamed from: i, reason: collision with root package name */
    public final hy0.t1 f286022i;

    /* renamed from: j, reason: collision with root package name */
    public final hy0.b3 f286023j;

    /* renamed from: k, reason: collision with root package name */
    public final jz5.g f286024k;

    /* renamed from: l, reason: collision with root package name */
    public final android.graphics.Paint f286025l;

    /* renamed from: m, reason: collision with root package name */
    public final android.graphics.Paint f286026m;

    /* renamed from: n, reason: collision with root package name */
    public final android.text.TextPaint f286027n;

    /* renamed from: o, reason: collision with root package name */
    public final android.text.TextPaint f286028o;

    /* renamed from: p, reason: collision with root package name */
    public final android.graphics.Paint f286029p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f286030q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f286031r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f286032s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f286033t;

    /* renamed from: u, reason: collision with root package name */
    public long f286034u;

    /* renamed from: v, reason: collision with root package name */
    public final android.graphics.RectF f286035v;

    /* renamed from: w, reason: collision with root package name */
    public final android.graphics.RectF f286036w;

    /* renamed from: x, reason: collision with root package name */
    public final android.graphics.RectF f286037x;

    /* renamed from: y, reason: collision with root package name */
    public final android.graphics.Rect f286038y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f286020g = jz5.h.b(new hy0.o0(this));
        this.f286021h = jz5.h.b(new hy0.v0(this, context));
        this.f286022i = new hy0.t1(context);
        this.f286023j = new hy0.b3(context);
        this.f286024k = jz5.h.b(new hy0.q0(context));
        jz5.g b17 = jz5.h.b(new hy0.u0(context));
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setAntiAlias(true);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        paint.setColor(((java.lang.Number) ((jz5.n) b17).getValue()).intValue());
        this.f286025l = paint;
        jz5.g b18 = jz5.h.b(new hy0.w0(context));
        android.graphics.Paint paint2 = new android.graphics.Paint();
        paint2.setAntiAlias(true);
        paint2.setStyle(android.graphics.Paint.Style.FILL);
        paint2.setColor(((java.lang.Number) ((jz5.n) b18).getValue()).intValue());
        this.f286026m = paint2;
        android.text.TextPaint textPaint = new android.text.TextPaint();
        textPaint.setAntiAlias(true);
        textPaint.setColor(-1);
        textPaint.setTextSize((int) (j65.q.a(com.tencent.mm.sdk.platformtools.x2.f193071a).getDisplayMetrics().density * 11));
        textPaint.setTextAlign(android.graphics.Paint.Align.LEFT);
        this.f286027n = textPaint;
        android.text.TextPaint textPaint2 = new android.text.TextPaint();
        textPaint2.setAntiAlias(true);
        textPaint2.setColor(-1);
        textPaint2.setTextSize((int) (j65.q.a(com.tencent.mm.sdk.platformtools.x2.f193071a).getDisplayMetrics().density * 8));
        textPaint2.setTextAlign(android.graphics.Paint.Align.LEFT);
        this.f286028o = textPaint2;
        jz5.g b19 = jz5.h.b(new hy0.r0(context));
        android.graphics.Paint paint3 = new android.graphics.Paint();
        paint3.setAntiAlias(true);
        paint3.setStyle(android.graphics.Paint.Style.FILL);
        paint3.setColor(((java.lang.Number) ((jz5.n) b19).getValue()).intValue());
        this.f286029p = paint3;
        this.f286030q = jz5.h.b(new hy0.s0(context));
        this.f286031r = jz5.h.b(new hy0.x0(context));
        this.f286032s = jz5.h.b(new hy0.p0(context));
        this.f286033t = jz5.h.b(new hy0.t0(context));
        this.f286034u = java.lang.System.currentTimeMillis();
        this.f286035v = new android.graphics.RectF();
        this.f286036w = new android.graphics.RectF();
        this.f286037x = new android.graphics.RectF();
        this.f286038y = new android.graphics.Rect();
    }

    public static final float b(hy0.y0 y0Var) {
        return ((java.lang.Number) ((jz5.n) y0Var.f286024k).getValue()).floatValue();
    }

    @Override // iy0.c
    public void a(android.graphics.Canvas canvas, hy0.z2 context) {
        com.tencent.maas.moviecomposing.layout.OffsetRange narrationLaneYOffsetRange;
        boolean z17;
        boolean z18;
        kotlin.jvm.internal.o.g(canvas, "canvas");
        kotlin.jvm.internal.o.g(context, "context");
        int ordinal = this.f295717c.ordinal();
        bx0.h hVar = context.f286047c;
        if (ordinal == 11) {
            narrationLaneYOffsetRange = hVar.f36277d.f36257i;
            kotlin.jvm.internal.o.f(narrationLaneYOffsetRange, "narrationLaneYOffsetRange");
        } else if (ordinal != 12) {
            narrationLaneYOffsetRange = com.tencent.maas.moviecomposing.layout.OffsetRange.c();
        } else {
            narrationLaneYOffsetRange = hVar.f36277d.f36258j;
            kotlin.jvm.internal.o.f(narrationLaneYOffsetRange, "captionLaneYOffsetRange");
        }
        this.f295715a = narrationLaneYOffsetRange;
        if (!narrationLaneYOffsetRange.a()) {
            android.graphics.RectF rectF = this.f295716b;
            float f17 = hVar.f36277d.f36266r.f247044a;
            float f18 = (float) this.f295715a.f48509a;
            float e17 = hVar.e() - hVar.f36277d.f36266r.f247046c;
            com.tencent.maas.moviecomposing.layout.OffsetRange offsetRange = this.f295715a;
            rectF.set(f17, f18, e17, (float) (offsetRange.f48509a + offsetRange.f48510b));
            if (!rectF.isEmpty()) {
                jz5.g gVar = this.f295718d;
                canvas.drawRoundRect(rectF, ((java.lang.Number) ((jz5.n) gVar).getValue()).floatValue(), ((java.lang.Number) ((jz5.n) gVar).getValue()).floatValue(), (android.graphics.Paint) ((jz5.n) this.f295720f).getValue());
            }
        }
        ex0.a0 a0Var = context.f286046b;
        a0Var.getClass();
        if (uu0.c.e().f431207b && a0Var.I.f257126d) {
            ((hy0.i0) ((jz5.n) this.f286020g).getValue()).a(canvas, context);
        }
        ((hy0.n0) ((jz5.n) this.f286021h).getValue()).a(canvas, context);
        ex0.v vVar = a0Var.f257097g;
        java.util.List list = vVar.f257179g;
        if (!(list instanceof java.util.Collection) || !((java.util.ArrayList) list).isEmpty()) {
            java.util.Iterator it = ((java.util.ArrayList) list).iterator();
            while (it.hasNext()) {
                vu0.u uVar = ((ex0.q) it.next()).f257165t;
                if (uVar == vu0.u.f440161f || uVar == vu0.u.f440162g) {
                    z17 = true;
                    break;
                }
            }
        }
        z17 = false;
        if (!z17) {
            java.util.List list2 = vVar.f257179g;
            if (!(list2 instanceof java.util.Collection) || !((java.util.ArrayList) list2).isEmpty()) {
                java.util.Iterator it6 = ((java.util.ArrayList) list2).iterator();
                while (it6.hasNext()) {
                    if (((ex0.q) it6.next()).f257166u == vu0.w.f440167e) {
                        z18 = true;
                        break;
                    }
                }
            }
            z18 = false;
            if (!z18) {
                this.f286034u = java.lang.System.currentTimeMillis();
                return;
            }
        }
        com.tencent.mm.mj_publisher.finder.widgets.timelineview.BaseTimelineView.i(context.f286045a, false, 1, null);
    }
}
