package yw0;

/* loaded from: classes5.dex */
public final class t extends yw0.s implements com.tencent.maas.moviecomposing.y {

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f466588b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.maas.base.Rect2 f466589c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f466590d;

    /* renamed from: e, reason: collision with root package name */
    public final float f466591e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.RectF f466592f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f466593g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f466594h;

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.Paint f466595i;

    /* renamed from: j, reason: collision with root package name */
    public final android.graphics.Paint f466596j;

    /* renamed from: k, reason: collision with root package name */
    public final android.graphics.Paint f466597k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(android.content.Context context, yw0.r drawerAction) {
        super(drawerAction);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(drawerAction, "drawerAction");
        this.f466588b = context;
        com.tencent.maas.base.Rect2 rect2 = new com.tencent.maas.base.Rect2(new com.tencent.maas.base.Vec2(0.0f, 0.0f), new com.tencent.maas.base.Vec2(0.0f, 0.0f));
        this.f466589c = rect2;
        this.f466590d = i65.a.r(context, com.tencent.mm.R.string.mtr);
        this.f466591e = j65.q.a(context).getDimension(com.tencent.mm.R.dimen.c_);
        rect2.getOrigin().set(0.08000001f, 0.11f);
        rect2.getSize().set(0.84f, 0.76f);
        this.f466592f = new android.graphics.RectF();
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setAntiAlias(true);
        paint.setColor(i65.a.d(context, com.tencent.mm.R.color.f479491ag3));
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeWidth(j65.q.a(context).getDimension(com.tencent.mm.R.dimen.f479642bh) + j65.q.a(context).getDimension(com.tencent.mm.R.dimen.f479641bg));
        this.f466595i = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        paint2.setAntiAlias(true);
        paint2.setColor(i65.a.d(context, com.tencent.mm.R.color.f479492ag4));
        paint2.setStyle(android.graphics.Paint.Style.STROKE);
        paint2.setStrokeCap(android.graphics.Paint.Cap.BUTT);
        paint2.setStrokeWidth(j65.q.a(context).getDimension(com.tencent.mm.R.dimen.f479642bh));
        this.f466596j = paint2;
        android.graphics.Paint paint3 = new android.graphics.Paint();
        paint3.setAntiAlias(true);
        paint3.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.CLEAR));
        this.f466597k = paint3;
    }

    @Override // yw0.s
    public void a() {
    }

    @Override // yw0.s
    public void b(android.graphics.Canvas canvas, int i17, int i18) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        if (this.f466594h && this.f466593g) {
            android.graphics.RectF rectF = this.f466592f;
            if (!rectF.isEmpty()) {
                canvas.drawColor(i65.a.d(this.f466588b, com.tencent.mm.R.color.f479493ag5));
                float f17 = 0.0f;
                while (f17 < canvas.getWidth() + canvas.getHeight()) {
                    canvas.drawLine(0.0f, f17, f17, 0.0f, this.f466596j);
                    f17 += this.f466591e;
                }
                canvas.drawRect(rectF, this.f466597k);
                canvas.drawRect(rectF, this.f466595i);
            }
        }
    }

    @Override // yw0.s
    public void c(boolean z17, int i17, int i18, int i19, int i27) {
        float f17 = i19 - i17;
        float f18 = i27 - i18;
        float f19 = 0.625f * f18;
        android.graphics.RectF rectF = this.f466592f;
        com.tencent.maas.base.Rect2 rect2 = this.f466589c;
        if (f17 < f19) {
            rectF.set(rect2.getOrigin().f47799x * f17, rect2.getOrigin().f47800y * f18, (rect2.getOrigin().f47799x + rect2.getSize().f47799x) * f17, (rect2.getOrigin().f47800y + rect2.getSize().f47800y) * f18);
        } else {
            rectF.setEmpty();
        }
        java.util.Objects.toString(rect2);
        java.util.Objects.toString(rectF);
    }
}
