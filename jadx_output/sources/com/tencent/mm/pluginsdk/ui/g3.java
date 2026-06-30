package com.tencent.mm.pluginsdk.ui;

/* loaded from: classes13.dex */
public class g3 extends android.graphics.drawable.Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f190838a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f190839b;

    /* renamed from: c, reason: collision with root package name */
    public final int f190840c;

    /* renamed from: d, reason: collision with root package name */
    public final int f190841d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint f190842e = new android.graphics.Paint(1);

    /* renamed from: f, reason: collision with root package name */
    public final int f190843f;

    /* renamed from: g, reason: collision with root package name */
    public final int f190844g;

    /* renamed from: h, reason: collision with root package name */
    public final int f190845h;

    /* renamed from: i, reason: collision with root package name */
    public final int f190846i;

    /* renamed from: j, reason: collision with root package name */
    public final int f190847j;

    /* renamed from: k, reason: collision with root package name */
    public final int f190848k;

    /* renamed from: l, reason: collision with root package name */
    public final int f190849l;

    /* renamed from: m, reason: collision with root package name */
    public float f190850m;

    /* renamed from: n, reason: collision with root package name */
    public float f190851n;

    /* renamed from: o, reason: collision with root package name */
    public float f190852o;

    /* renamed from: p, reason: collision with root package name */
    public float f190853p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f190854q;

    /* renamed from: r, reason: collision with root package name */
    public int f190855r;

    /* renamed from: s, reason: collision with root package name */
    public int f190856s;

    /* renamed from: t, reason: collision with root package name */
    public final android.animation.ValueAnimator f190857t;

    /* renamed from: u, reason: collision with root package name */
    public final android.graphics.RectF f190858u;

    public g3(android.content.Context context) {
        this.f190839b = null;
        this.f190840c = 0;
        this.f190841d = 0;
        android.view.animation.LinearInterpolator linearInterpolator = new android.view.animation.LinearInterpolator();
        new android.view.animation.AccelerateDecelerateInterpolator();
        new java.util.Random(java.lang.System.currentTimeMillis());
        this.f190849l = 0;
        this.f190850m = -90.0f;
        this.f190851n = 0.0f;
        this.f190852o = 0.0f;
        this.f190853p = 5.0f;
        this.f190854q = false;
        this.f190856s = 2;
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 100.0f);
        this.f190857t = ofFloat;
        ofFloat.setInterpolator(linearInterpolator);
        ofFloat.addUpdateListener(new com.tencent.mm.pluginsdk.ui.f3(this));
        this.f190858u = new android.graphics.RectF();
        this.f190838a = context;
        this.f190840c = i65.a.d(context, com.tencent.mm.R.color.aaq);
        this.f190841d = i65.a.d(context, com.tencent.mm.R.color.a09);
        this.f190839b = context.getResources().getDrawable(j65.e.b() ? com.tencent.mm.R.raw.voiceinput_icon_button_care : com.tencent.mm.R.raw.voiceinput_icon_button);
        i65.a.f(context, com.tencent.mm.R.dimen.adv);
        i65.a.f(context, com.tencent.mm.R.dimen.adu);
        i65.a.f(context, com.tencent.mm.R.dimen.ado);
        this.f190849l = i65.a.f(context, com.tencent.mm.R.dimen.adt);
        this.f190844g = i65.a.d(context, com.tencent.mm.R.color.a__);
        i65.a.f(context, com.tencent.mm.R.dimen.adq);
        this.f190847j = i65.a.f(context, com.tencent.mm.R.dimen.adp);
        this.f190848k = i65.a.d(context, com.tencent.mm.R.color.a_a);
        this.f190855r = i65.a.f(context, com.tencent.mm.R.dimen.ads);
        this.f190845h = i65.a.f(context, com.tencent.mm.R.dimen.ads);
        this.f190846i = i65.a.f(context, com.tencent.mm.R.dimen.adr);
        this.f190843f = i65.a.f(context, com.tencent.mm.R.dimen.adw);
    }

    public final boolean a(android.graphics.Canvas canvas) {
        return canvas == null || canvas.getWidth() == 0 || canvas.getHeight() == 0;
    }

    public void b() {
        this.f190856s = 2;
        this.f190857t.cancel();
        this.f190850m = -90.0f;
        this.f190851n = 0.0f;
        this.f190852o = 0.0f;
        this.f190853p = 5.0f;
        invalidateSelf();
    }

    public void c() {
        this.f190856s = 4;
        android.animation.ValueAnimator valueAnimator = this.f190857t;
        valueAnimator.cancel();
        valueAnimator.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        valueAnimator.setDuration(1000L);
        valueAnimator.setRepeatCount(-1);
        valueAnimator.start();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        int i17 = this.f190856s;
        android.graphics.Paint paint = this.f190842e;
        if ((i17 == 6 || i17 == 7) && !a(canvas)) {
            int width = canvas.getWidth() >> 1;
            int height = canvas.getHeight() >> 1;
            paint.setShader(null);
            paint.setStyle(android.graphics.Paint.Style.FILL);
            paint.setColor(this.f190844g);
            int i18 = this.f190856s;
            int i19 = this.f190845h;
            if (i18 == 7) {
                if (this.f190854q) {
                    this.f190855r -= 4;
                } else {
                    this.f190855r += 4;
                }
                int min = java.lang.Math.min(java.lang.Math.max(i19, this.f190855r), this.f190846i);
                this.f190855r = min;
                canvas.drawCircle(width, height, min, paint);
            } else {
                canvas.drawCircle(width, height, i19, paint);
            }
        }
        int i27 = this.f190849l;
        int i28 = this.f190840c;
        android.graphics.drawable.Drawable drawable = this.f190839b;
        if (drawable != null && !a(canvas)) {
            if (this.f190856s == 5) {
                drawable.setColorFilter(this.f190841d, android.graphics.PorterDuff.Mode.SRC_ATOP);
            } else {
                drawable.setColorFilter(i28, android.graphics.PorterDuff.Mode.SRC_ATOP);
            }
            int width2 = canvas.getWidth() / 2;
            int height2 = canvas.getHeight() / 2;
            drawable.setBounds(width2 - i27, height2 - i27, width2 + i27, height2 + i27);
            drawable.draw(canvas);
        }
        if (this.f190856s == 4 && canvas != null) {
            paint.setColor(i28);
            paint.setStrokeWidth(this.f190843f);
            paint.setStyle(android.graphics.Paint.Style.STROKE);
            paint.clearShadowLayer();
            paint.setShader(null);
            android.graphics.RectF rectF = this.f190858u;
            int width3 = canvas.getWidth() / 2;
            int i29 = this.f190847j;
            rectF.left = width3 - i29;
            rectF.top = (canvas.getHeight() / 2) - i29;
            rectF.right = (canvas.getWidth() / 2) + i29;
            rectF.bottom = (canvas.getHeight() / 2) + i29;
            canvas.drawArc(rectF, this.f190850m, this.f190852o, false, paint);
            this.f190850m += this.f190851n;
            float f17 = this.f190852o;
            float f18 = this.f190853p;
            float f19 = f17 + f18;
            this.f190852o = f19;
            if (f19 >= 360.0f) {
                this.f190853p = -f18;
                this.f190851n = 5.0f;
            } else if (f19 <= 0.0f) {
                this.f190853p = -f18;
                this.f190851n = 0.0f;
                this.f190850m = -90.0f;
                this.f190852o = 0.0f;
            }
        }
        int i37 = this.f190856s;
        if ((i37 == 6 || i37 == 7) && !a(canvas)) {
            paint.setStyle(android.graphics.Paint.Style.FILL);
            paint.setColor(this.f190848k);
            canvas.drawCircle(canvas.getWidth() >> 1, canvas.getHeight() >> 1, i27, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f190849l * 2;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        android.content.Context context = this.f190838a;
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
