package hy0;

/* loaded from: classes5.dex */
public final class g0 extends hy0.n {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.RectF f285817d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint f285818e;

    /* renamed from: f, reason: collision with root package name */
    public final int f285819f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.RectF f285820g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.RectF f285821h;

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.Rect f285822i;

    /* renamed from: j, reason: collision with root package name */
    public final android.graphics.Path f285823j;

    /* renamed from: k, reason: collision with root package name */
    public final jz5.g f285824k;

    /* renamed from: l, reason: collision with root package name */
    public final android.graphics.Path f285825l;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f285826m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f285827n;

    /* renamed from: o, reason: collision with root package name */
    public final android.graphics.Paint f285828o;

    /* renamed from: p, reason: collision with root package name */
    public final android.graphics.Paint f285829p;

    /* renamed from: q, reason: collision with root package name */
    public final android.graphics.Paint f285830q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f285831r;

    /* renamed from: s, reason: collision with root package name */
    public final android.graphics.Paint f285832s;

    /* renamed from: t, reason: collision with root package name */
    public final android.graphics.Path f285833t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f285817d = new android.graphics.RectF();
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setAlpha(12);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        paint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        this.f285818e = paint;
        this.f285819f = (int) (j65.q.a(com.tencent.mm.sdk.platformtools.x2.f193071a).getDisplayMetrics().density * 4);
        this.f285820g = new android.graphics.RectF();
        this.f285821h = new android.graphics.RectF();
        this.f285822i = new android.graphics.Rect();
        this.f285823j = new android.graphics.Path();
        this.f285824k = jz5.h.b(new hy0.a0(context));
        this.f285825l = new android.graphics.Path();
        this.f285826m = jz5.h.b(new hy0.f0(context));
        jz5.g b17 = jz5.h.b(new hy0.e0(context));
        this.f285827n = jz5.h.b(new hy0.d0(context));
        jz5.g b18 = jz5.h.b(new hy0.b0(context));
        jz5.g b19 = jz5.h.b(new hy0.c0(context));
        android.graphics.Paint paint2 = new android.graphics.Paint();
        paint2.setAntiAlias(true);
        paint2.setColor(((java.lang.Number) ((jz5.n) b18).getValue()).intValue());
        paint2.setStyle(android.graphics.Paint.Style.FILL);
        this.f285828o = paint2;
        android.graphics.Paint paint3 = new android.graphics.Paint();
        paint3.setAntiAlias(true);
        paint3.setColor(((java.lang.Number) ((jz5.n) b19).getValue()).intValue());
        paint3.setStyle(android.graphics.Paint.Style.STROKE);
        paint3.setStrokeWidth(((java.lang.Number) ((jz5.n) b17).getValue()).floatValue());
        paint3.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        this.f285829p = paint3;
        android.graphics.Paint paint4 = new android.graphics.Paint();
        paint4.setAntiAlias(true);
        paint4.setColor(-1);
        paint4.setStyle(android.graphics.Paint.Style.STROKE);
        paint4.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        paint4.setStrokeWidth(d());
        this.f285830q = paint4;
        this.f285831r = jz5.h.b(hy0.z.f286042d);
        android.graphics.Paint paint5 = new android.graphics.Paint();
        paint5.setStyle(android.graphics.Paint.Style.FILL);
        paint5.setColor(j65.q.a(context).getColor(com.tencent.mm.R.color.acz, null));
        this.f285832s = paint5;
        this.f285833t = new android.graphics.Path();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00be A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02b5  */
    @Override // iy0.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(android.graphics.Canvas r25, hy0.z2 r26) {
        /*
            Method dump skipped, instructions count: 1155
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hy0.g0.a(android.graphics.Canvas, hy0.z2):void");
    }

    public final float d() {
        return ((java.lang.Number) this.f285824k.getValue()).floatValue();
    }

    public final float e() {
        return ((java.lang.Number) ((jz5.n) this.f285827n).getValue()).floatValue();
    }
}
