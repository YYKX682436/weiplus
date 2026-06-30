package hy0;

/* loaded from: classes5.dex */
public final class a3 implements iy0.c {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f285773a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.RectF f285774b;

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.RectF f285775c;

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.RectF f285776d;

    /* renamed from: e, reason: collision with root package name */
    public final float f285777e;

    /* renamed from: f, reason: collision with root package name */
    public final float f285778f;

    /* renamed from: g, reason: collision with root package name */
    public final float f285779g;

    /* renamed from: h, reason: collision with root package name */
    public final float f285780h;

    /* renamed from: i, reason: collision with root package name */
    public final float f285781i;

    /* renamed from: j, reason: collision with root package name */
    public final float f285782j;

    /* renamed from: k, reason: collision with root package name */
    public final int f285783k;

    /* renamed from: l, reason: collision with root package name */
    public final int f285784l;

    /* renamed from: m, reason: collision with root package name */
    public final android.graphics.drawable.VectorDrawable f285785m;

    /* renamed from: n, reason: collision with root package name */
    public final android.graphics.Paint f285786n;

    /* renamed from: o, reason: collision with root package name */
    public final android.graphics.Paint f285787o;

    /* renamed from: p, reason: collision with root package name */
    public final android.graphics.Paint f285788p;

    /* renamed from: q, reason: collision with root package name */
    public final android.graphics.Paint f285789q;

    /* renamed from: r, reason: collision with root package name */
    public yz5.l f285790r;

    public a3(android.content.Context context, boolean z17) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f285773a = z17;
        this.f285774b = new android.graphics.RectF();
        this.f285775c = new android.graphics.RectF();
        this.f285776d = new android.graphics.RectF();
        this.f285777e = j65.q.a(context).getDimensionPixelSize(com.tencent.mm.R.dimen.ajn);
        this.f285778f = j65.q.a(context).getDimensionPixelSize(com.tencent.mm.R.dimen.ajl);
        this.f285779g = j65.q.a(context).getDimensionPixelSize(com.tencent.mm.R.dimen.ajm);
        this.f285780h = j65.q.a(context).getDimensionPixelSize(com.tencent.mm.R.dimen.ajk);
        float dimensionPixelSize = j65.q.a(context).getDimensionPixelSize(com.tencent.mm.R.dimen.al_);
        this.f285781i = j65.q.a(context).getDimensionPixelSize(com.tencent.mm.R.dimen.al9);
        float dimensionPixelSize2 = j65.q.a(context).getDimensionPixelSize(com.tencent.mm.R.dimen.ak_);
        float dimensionPixelSize3 = j65.q.a(context).getDimensionPixelSize(com.tencent.mm.R.dimen.ak9);
        float dimensionPixelSize4 = j65.q.a(context).getDimensionPixelSize(com.tencent.mm.R.dimen.ak8);
        this.f285782j = dimensionPixelSize4;
        android.graphics.DashPathEffect dashPathEffect = new android.graphics.DashPathEffect(new float[]{dimensionPixelSize2, dimensionPixelSize3}, 0.0f);
        int color = j65.q.a(context).getColor(com.tencent.mm.R.color.ac8, null);
        int color2 = j65.q.a(context).getColor(com.tencent.mm.R.color.f479401a22, null);
        this.f285783k = color2;
        this.f285784l = j65.q.a(context).getColor(com.tencent.mm.R.color.f479398pp, null);
        int color3 = j65.q.a(context).getColor(com.tencent.mm.R.color.acs, null);
        int color4 = j65.q.a(context).getColor(com.tencent.mm.R.color.acp, null);
        int color5 = j65.q.a(context).getColor(com.tencent.mm.R.color.f479398pp, null);
        android.graphics.drawable.Drawable drawable = j65.q.a(context).getDrawable(com.tencent.mm.R.drawable.icon_mc_transition_change, null);
        this.f285785m = drawable instanceof android.graphics.drawable.VectorDrawable ? (android.graphics.drawable.VectorDrawable) drawable : null;
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setAntiAlias(true);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        paint.setStrokeWidth(dimensionPixelSize);
        paint.setColor(color3);
        this.f285786n = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        paint2.setAntiAlias(true);
        paint2.setStyle(android.graphics.Paint.Style.FILL);
        paint2.setColor(color);
        paint2.setShadowLayer(6.0f, 0.0f, 0.0f, color4);
        this.f285787o = paint2;
        android.graphics.Paint paint3 = new android.graphics.Paint();
        paint3.setAntiAlias(true);
        paint3.setColor(color2);
        paint3.setStyle(android.graphics.Paint.Style.STROKE);
        paint3.setStrokeCap(android.graphics.Paint.Cap.BUTT);
        paint3.setStrokeWidth(dimensionPixelSize4);
        paint3.setPathEffect(dashPathEffect);
        this.f285788p = paint3;
        android.graphics.Paint paint4 = new android.graphics.Paint();
        paint4.setAntiAlias(true);
        paint4.setStyle(android.graphics.Paint.Style.FILL);
        paint4.setColor(color5);
        paint4.setShadowLayer(6.0f, 0.0f, 0.0f, color4);
        this.f285789q = paint4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d9, code lost:
    
        if (r1 == true) goto L36;
     */
    @Override // iy0.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(android.graphics.Canvas r18, hy0.z2 r19) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hy0.a3.a(android.graphics.Canvas, hy0.z2):void");
    }

    public final void b(android.graphics.Canvas canvas, android.graphics.Paint paint) {
        android.graphics.RectF rectF = this.f285775c;
        float f17 = this.f285780h;
        canvas.drawRoundRect(rectF, f17, f17, paint);
        float f18 = this.f285777e;
        float f19 = this.f285779g;
        float f27 = 2;
        float f28 = (f18 - f19) / f27;
        float f29 = (this.f285778f - f19) / f27;
        android.graphics.drawable.VectorDrawable vectorDrawable = this.f285785m;
        if (vectorDrawable != null) {
            vectorDrawable.setBounds((int) (rectF.left + f28), (int) (rectF.top + f29), (int) (rectF.right - f28), (int) (rectF.bottom - f29));
        }
        if (vectorDrawable != null) {
            vectorDrawable.draw(canvas);
        }
    }

    public final void d(android.graphics.Canvas canvas, int i17) {
        android.graphics.RectF rectF = this.f285776d;
        float f17 = rectF.left;
        android.graphics.RectF rectF2 = this.f285775c;
        if (f17 >= rectF2.left || rectF.right <= rectF2.right) {
            return;
        }
        float centerY = rectF.centerY();
        android.graphics.Paint paint = this.f285788p;
        paint.setColor(i17);
        float f18 = rectF.left;
        float f19 = rectF2.left;
        float f27 = 2;
        float f28 = this.f285782j;
        canvas.drawLine(f18, centerY, f19 - (f28 / f27), centerY, paint);
        canvas.drawLine(rectF.right, centerY, rectF2.right + (f28 / f27), centerY, paint);
    }
}
