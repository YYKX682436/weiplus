package iy2;

/* loaded from: classes13.dex */
public final class b extends android.graphics.drawable.Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f295862a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f295863b;

    /* renamed from: c, reason: collision with root package name */
    public final int f295864c;

    /* renamed from: d, reason: collision with root package name */
    public final int f295865d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint f295866e;

    /* renamed from: f, reason: collision with root package name */
    public final int f295867f;

    /* renamed from: g, reason: collision with root package name */
    public final int f295868g;

    /* renamed from: h, reason: collision with root package name */
    public final int f295869h;

    /* renamed from: i, reason: collision with root package name */
    public final int f295870i;

    /* renamed from: j, reason: collision with root package name */
    public final int f295871j;

    /* renamed from: k, reason: collision with root package name */
    public final int f295872k;

    /* renamed from: l, reason: collision with root package name */
    public final int f295873l;

    /* renamed from: m, reason: collision with root package name */
    public float f295874m;

    /* renamed from: n, reason: collision with root package name */
    public float f295875n;

    /* renamed from: o, reason: collision with root package name */
    public float f295876o;

    /* renamed from: p, reason: collision with root package name */
    public float f295877p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f295878q;

    /* renamed from: r, reason: collision with root package name */
    public int f295879r;

    /* renamed from: s, reason: collision with root package name */
    public int f295880s;

    /* renamed from: t, reason: collision with root package name */
    public final android.animation.ValueAnimator f295881t;

    /* renamed from: u, reason: collision with root package name */
    public final android.graphics.RectF f295882u;

    public b(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f295866e = new android.graphics.Paint(1);
        android.view.animation.LinearInterpolator linearInterpolator = new android.view.animation.LinearInterpolator();
        this.f295874m = -90.0f;
        this.f295877p = 5.0f;
        this.f295880s = 2;
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 100.0f);
        this.f295881t = ofFloat;
        ofFloat.setInterpolator(linearInterpolator);
        ofFloat.addUpdateListener(new iy2.a(this));
        this.f295882u = new android.graphics.RectF();
        this.f295862a = context;
        this.f295864c = i65.a.d(context, com.tencent.mm.R.color.aaq);
        this.f295865d = i65.a.d(context, com.tencent.mm.R.color.a09);
        this.f295863b = context.getResources().getDrawable(j65.e.b() ? com.tencent.mm.R.raw.voiceinput_icon_button_care : com.tencent.mm.R.raw.voiceinput_icon_button);
        i65.a.f(context, com.tencent.mm.R.dimen.aos);
        i65.a.f(context, com.tencent.mm.R.dimen.aor);
        i65.a.f(context, com.tencent.mm.R.dimen.aol);
        this.f295873l = i65.a.f(context, com.tencent.mm.R.dimen.aoq);
        this.f295868g = i65.a.d(context, com.tencent.mm.R.color.akg);
        i65.a.f(context, com.tencent.mm.R.dimen.aon);
        this.f295871j = i65.a.f(context, com.tencent.mm.R.dimen.aom);
        this.f295872k = i65.a.d(context, com.tencent.mm.R.color.akh);
        this.f295879r = i65.a.f(context, com.tencent.mm.R.dimen.aop);
        this.f295869h = i65.a.f(context, com.tencent.mm.R.dimen.aop);
        this.f295870i = i65.a.f(context, com.tencent.mm.R.dimen.aoo);
        this.f295867f = i65.a.f(context, com.tencent.mm.R.dimen.aot);
    }

    public final boolean a(android.graphics.Canvas canvas) {
        return canvas == null || canvas.getWidth() == 0 || canvas.getHeight() == 0;
    }

    public final void b() {
        this.f295880s = 2;
        this.f295881t.cancel();
        this.f295874m = -90.0f;
        this.f295875n = 0.0f;
        this.f295876o = 0.0f;
        this.f295877p = 5.0f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        int i17 = this.f295880s;
        android.graphics.Paint paint = this.f295866e;
        if ((i17 == 6 || i17 == 7) && !a(canvas)) {
            int width = canvas.getWidth() >> 1;
            int height = canvas.getHeight() >> 1;
            paint.setShader(null);
            paint.setStyle(android.graphics.Paint.Style.FILL);
            paint.setColor(this.f295868g);
            int i18 = this.f295880s;
            int i19 = this.f295869h;
            if (i18 == 7) {
                if (this.f295878q) {
                    this.f295879r -= 4;
                } else {
                    this.f295879r += 4;
                }
                int min = (int) java.lang.Math.min(java.lang.Math.max(i19, this.f295879r), this.f295870i);
                this.f295879r = min;
                canvas.drawCircle(width, height, min, paint);
            } else {
                canvas.drawCircle(width, height, i19, paint);
            }
        }
        int i27 = this.f295873l;
        int i28 = this.f295864c;
        android.graphics.drawable.Drawable drawable = this.f295863b;
        if (drawable != null && !a(canvas)) {
            if (this.f295880s == 5) {
                drawable.setColorFilter(this.f295865d, android.graphics.PorterDuff.Mode.SRC_ATOP);
            } else {
                drawable.setColorFilter(i28, android.graphics.PorterDuff.Mode.SRC_ATOP);
            }
            int width2 = canvas.getWidth() / 2;
            int height2 = canvas.getHeight() / 2;
            drawable.setBounds(width2 - i27, height2 - i27, width2 + i27, height2 + i27);
            drawable.draw(canvas);
        }
        if (this.f295880s == 4) {
            paint.setColor(i28);
            paint.setStrokeWidth(this.f295867f);
            paint.setStyle(android.graphics.Paint.Style.STROKE);
            paint.clearShadowLayer();
            paint.setShader(null);
            android.graphics.RectF rectF = this.f295882u;
            int width3 = canvas.getWidth() / 2;
            int i29 = this.f295871j;
            rectF.left = width3 - i29;
            rectF.top = (canvas.getHeight() / 2) - i29;
            rectF.right = (canvas.getWidth() / 2) + i29;
            rectF.bottom = (canvas.getHeight() / 2) + i29;
            canvas.drawArc(rectF, this.f295874m, this.f295876o, false, paint);
            this.f295874m += this.f295875n;
            float f17 = this.f295876o;
            float f18 = this.f295877p;
            float f19 = f17 + f18;
            this.f295876o = f19;
            if (f19 >= 360.0f) {
                this.f295877p = -f18;
                this.f295875n = 5.0f;
            } else if (f19 <= 0.0f) {
                this.f295877p = -f18;
                this.f295875n = 0.0f;
                this.f295874m = -90.0f;
                this.f295876o = 0.0f;
            }
        }
        int i37 = this.f295880s;
        if ((i37 == 6 || i37 == 7) && !a(canvas)) {
            paint.setStyle(android.graphics.Paint.Style.FILL);
            paint.setColor(this.f295872k);
            canvas.drawCircle(canvas.getWidth() >> 1, canvas.getHeight() >> 1, i27, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f295873l * 2;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        android.content.Context context = this.f295862a;
        if (context == null) {
            return 0;
        }
        return i65.a.B(context);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i17) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
    }
}
