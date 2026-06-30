package yw0;

/* loaded from: classes5.dex */
public final class g extends yw0.s {

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.PointF f466541b;

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.PointF f466542c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Float f466543d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f466544e;

    /* renamed from: f, reason: collision with root package name */
    public final int f466545f;

    /* renamed from: g, reason: collision with root package name */
    public final int f466546g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.Paint f466547h;

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.Paint f466548i;

    /* renamed from: j, reason: collision with root package name */
    public final int f466549j;

    /* renamed from: k, reason: collision with root package name */
    public long f466550k;

    /* renamed from: l, reason: collision with root package name */
    public final android.graphics.PointF f466551l;

    /* renamed from: m, reason: collision with root package name */
    public final ou0.c f466552m;

    /* renamed from: n, reason: collision with root package name */
    public final ou0.c f466553n;

    /* renamed from: o, reason: collision with root package name */
    public final ou0.a0 f466554o;

    /* renamed from: p, reason: collision with root package name */
    public yw0.c f466555p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(android.content.Context context, yw0.r drawerAction) {
        super(drawerAction);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(drawerAction, "drawerAction");
        this.f466541b = new android.graphics.PointF();
        this.f466542c = new android.graphics.PointF(1.0f, 1.0f);
        int color = j65.q.a(context).getColor(com.tencent.mm.R.color.f479398pp, null);
        this.f466545f = color;
        this.f466546g = j65.q.a(context).getColor(com.tencent.mm.R.color.ac8, null);
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setColor(j65.q.a(context).getColor(com.tencent.mm.R.color.f478502m, null));
        paint.setStrokeWidth(j65.q.a(context).getDimension(com.tencent.mm.R.dimen.f479642bh));
        this.f466547h = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        paint2.setStyle(android.graphics.Paint.Style.STROKE);
        paint2.setColor(color);
        paint2.setStrokeWidth(j65.q.a(context).getDimension(com.tencent.mm.R.dimen.f479642bh));
        this.f466548i = paint2;
        this.f466549j = j65.q.a(context).getDimensionPixelSize(com.tencent.mm.R.dimen.f479723df);
        this.f466551l = new android.graphics.PointF();
        this.f466552m = new ou0.c(30.0f, 0.0f);
        this.f466553n = new ou0.c(30.0f, 0.0f);
        this.f466554o = new ou0.a0(0.1f, 1.0f, 1.0f);
        this.f466555p = yw0.c.f466536e;
    }

    public static final void d(yw0.g gVar) {
        gVar.getClass();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - gVar.f466550k >= 200) {
            gVar.f466550k = currentTimeMillis;
            ((yw0.l) gVar.f466587a).f466569a.f466571a.performHapticFeedback(0, 2);
        }
    }

    @Override // yw0.s
    public void a() {
        this.f466554o.d();
        this.f466553n.d();
        this.f466552m.d();
        ((yw0.l) this.f466587a).a();
    }

    @Override // yw0.s
    public void b(android.graphics.Canvas canvas, int i17, int i18) {
        int i19;
        kotlin.jvm.internal.o.g(canvas, "canvas");
        java.lang.Float f17 = this.f466543d;
        if (!this.f466544e || f17 == null) {
            return;
        }
        float f18 = i17;
        float f19 = i18;
        boolean z17 = f17.floatValue() > f18 / f19;
        float floatValue = z17 ? f18 : f17.floatValue() * f19;
        float floatValue2 = z17 ? f18 / f17.floatValue() : f19;
        float f27 = 2;
        float f28 = f18 / f27;
        float f29 = f19 / f27;
        android.graphics.PointF pointF = this.f466541b;
        float f37 = pointF.x * f18;
        float f38 = pointF.y * f19;
        int ordinal = this.f466555p.ordinal();
        android.graphics.Paint paint = this.f466548i;
        if (ordinal == 0) {
            paint.setColor(this.f466546g);
        } else if (ordinal == 1) {
            paint.setColor(this.f466545f);
        }
        android.graphics.PointF pointF2 = this.f466542c;
        float f39 = pointF2.x;
        float f47 = pointF2.y;
        canvas.drawRect(f37 - ((floatValue * f39) / f27), f38 - ((floatValue2 * f47) / f27), f37 + ((floatValue * f39) / f27), ((floatValue2 * f47) / f27) + f38, paint);
        boolean z18 = this.f466552m.f348887e;
        ou0.c cVar = this.f466553n;
        if (z18 || cVar.f348887e) {
            android.graphics.Paint paint2 = this.f466547h;
            int i27 = this.f466549j;
            if (z18) {
                i19 = i27;
                canvas.drawLine(f28, 0.0f, f28, 0.0f + i27, paint2);
                canvas.drawLine(f28, f19 - i19, f28, f19, paint2);
            } else {
                i19 = i27;
            }
            if (cVar.f348887e) {
                canvas.drawLine(0.0f, f29, i19 + 0.0f, f29, paint2);
                canvas.drawLine(f18 - i19, f29, f18, f29, paint2);
            }
        }
    }

    public final void e(android.graphics.PointF position) {
        kotlin.jvm.internal.o.g(position, "position");
        this.f466541b.set(position.x, position.y);
        ((yw0.l) this.f466587a).a();
    }

    public final void f(android.graphics.PointF scale) {
        kotlin.jvm.internal.o.g(scale, "scale");
        this.f466542c.set(scale.x, scale.y);
        ((yw0.l) this.f466587a).a();
    }
}
