package s4;

/* loaded from: classes15.dex */
public class e extends android.graphics.drawable.Drawable implements android.graphics.drawable.Animatable {

    /* renamed from: m, reason: collision with root package name */
    public static final android.view.animation.Interpolator f402872m = new android.view.animation.LinearInterpolator();

    /* renamed from: n, reason: collision with root package name */
    public static final android.view.animation.Interpolator f402873n = new y3.b();

    /* renamed from: o, reason: collision with root package name */
    public static final int[] f402874o = {-16777216};

    /* renamed from: d, reason: collision with root package name */
    public final s4.d f402875d;

    /* renamed from: e, reason: collision with root package name */
    public float f402876e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.res.Resources f402877f;

    /* renamed from: g, reason: collision with root package name */
    public android.animation.Animator f402878g;

    /* renamed from: h, reason: collision with root package name */
    public float f402879h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f402880i;

    public e(android.content.Context context) {
        context.getClass();
        this.f402877f = context.getResources();
        s4.d dVar = new s4.d();
        this.f402875d = dVar;
        dVar.f402859i = f402874o;
        dVar.a(0);
        dVar.f402858h = 2.5f;
        dVar.f402852b.setStrokeWidth(2.5f);
        invalidateSelf();
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new s4.b(this, dVar));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(f402872m);
        ofFloat.addListener(new s4.c(this, dVar));
        this.f402878g = ofFloat;
    }

    public void a(float f17, s4.d dVar, boolean z17) {
        float interpolation;
        float f18;
        if (this.f402880i) {
            d(f17, dVar);
            float floor = (float) (java.lang.Math.floor(dVar.f402863m / 0.8f) + 1.0d);
            float f19 = dVar.f402861k;
            float f27 = dVar.f402862l;
            dVar.f402855e = f19 + (((f27 - 0.01f) - f19) * f17);
            dVar.f402856f = f27;
            float f28 = dVar.f402863m;
            dVar.f402857g = f28 + ((floor - f28) * f17);
            return;
        }
        if (f17 != 1.0f || z17) {
            float f29 = dVar.f402863m;
            android.view.animation.Interpolator interpolator = f402873n;
            if (f17 < 0.5f) {
                interpolation = dVar.f402861k;
                f18 = (((y3.d) interpolator).getInterpolation(f17 / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float f37 = dVar.f402861k + 0.79f;
                interpolation = f37 - (((1.0f - ((y3.d) interpolator).getInterpolation((f17 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f18 = f37;
            }
            float f38 = f29 + (0.20999998f * f17);
            float f39 = (f17 + this.f402879h) * 216.0f;
            dVar.f402855e = interpolation;
            dVar.f402856f = f18;
            dVar.f402857g = f38;
            this.f402876e = f39;
        }
    }

    public final void b(float f17, float f18, float f19, float f27) {
        float f28 = this.f402877f.getDisplayMetrics().density;
        float f29 = f18 * f28;
        s4.d dVar = this.f402875d;
        dVar.f402858h = f29;
        dVar.f402852b.setStrokeWidth(f29);
        dVar.f402867q = f17 * f28;
        dVar.a(0);
        dVar.f402868r = (int) (f19 * f28);
        dVar.f402869s = (int) (f27 * f28);
    }

    public void c(int i17) {
        if (i17 == 0) {
            b(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            b(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    public void d(float f17, s4.d dVar) {
        if (f17 <= 0.75f) {
            dVar.f402871u = dVar.f402859i[dVar.f402860j];
            return;
        }
        float f18 = (f17 - 0.75f) / 0.25f;
        int[] iArr = dVar.f402859i;
        int i17 = dVar.f402860j;
        int i18 = iArr[i17];
        int i19 = iArr[(i17 + 1) % iArr.length];
        dVar.f402871u = ((((i18 >> 24) & 255) + ((int) ((((i19 >> 24) & 255) - r1) * f18))) << 24) | ((((i18 >> 16) & 255) + ((int) ((((i19 >> 16) & 255) - r3) * f18))) << 16) | ((((i18 >> 8) & 255) + ((int) ((((i19 >> 8) & 255) - r4) * f18))) << 8) | ((i18 & 255) + ((int) (f18 * ((i19 & 255) - r2))));
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        android.graphics.Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f402876e, bounds.exactCenterX(), bounds.exactCenterY());
        s4.d dVar = this.f402875d;
        android.graphics.RectF rectF = dVar.f402851a;
        float f17 = dVar.f402867q;
        float f18 = (dVar.f402858h / 2.0f) + f17;
        if (f17 <= 0.0f) {
            f18 = (java.lang.Math.min(bounds.width(), bounds.height()) / 2.0f) - java.lang.Math.max((dVar.f402868r * dVar.f402866p) / 2.0f, dVar.f402858h / 2.0f);
        }
        rectF.set(bounds.centerX() - f18, bounds.centerY() - f18, bounds.centerX() + f18, bounds.centerY() + f18);
        float f19 = dVar.f402855e;
        float f27 = dVar.f402857g;
        float f28 = (f19 + f27) * 360.0f;
        float f29 = ((dVar.f402856f + f27) * 360.0f) - f28;
        android.graphics.Paint paint = dVar.f402852b;
        paint.setColor(dVar.f402871u);
        paint.setAlpha(dVar.f402870t);
        float f37 = dVar.f402858h / 2.0f;
        rectF.inset(f37, f37);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, dVar.f402854d);
        float f38 = -f37;
        rectF.inset(f38, f38);
        canvas.drawArc(rectF, f28, f29, false, paint);
        if (dVar.f402864n) {
            android.graphics.Path path = dVar.f402865o;
            if (path == null) {
                android.graphics.Path path2 = new android.graphics.Path();
                dVar.f402865o = path2;
                path2.setFillType(android.graphics.Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            float min = java.lang.Math.min(rectF.width(), rectF.height()) / 2.0f;
            float f39 = (dVar.f402868r * dVar.f402866p) / 2.0f;
            dVar.f402865o.moveTo(0.0f, 0.0f);
            dVar.f402865o.lineTo(dVar.f402868r * dVar.f402866p, 0.0f);
            android.graphics.Path path3 = dVar.f402865o;
            float f47 = dVar.f402868r;
            float f48 = dVar.f402866p;
            path3.lineTo((f47 * f48) / 2.0f, dVar.f402869s * f48);
            dVar.f402865o.offset((min + rectF.centerX()) - f39, rectF.centerY() + (dVar.f402858h / 2.0f));
            dVar.f402865o.close();
            android.graphics.Paint paint2 = dVar.f402853c;
            paint2.setColor(dVar.f402871u);
            paint2.setAlpha(dVar.f402870t);
            canvas.save();
            canvas.rotate(f28 + f29, rectF.centerX(), rectF.centerY());
            canvas.drawPath(dVar.f402865o, paint2);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f402875d.f402870t;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f402878g.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i17) {
        this.f402875d.f402870t = i17;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.f402875d.f402852b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f402878g.cancel();
        s4.d dVar = this.f402875d;
        float f17 = dVar.f402855e;
        dVar.f402861k = f17;
        float f18 = dVar.f402856f;
        dVar.f402862l = f18;
        dVar.f402863m = dVar.f402857g;
        if (f18 != f17) {
            this.f402880i = true;
            this.f402878g.setDuration(666L);
            this.f402878g.start();
            return;
        }
        dVar.a(0);
        dVar.f402861k = 0.0f;
        dVar.f402862l = 0.0f;
        dVar.f402863m = 0.0f;
        dVar.f402855e = 0.0f;
        dVar.f402856f = 0.0f;
        dVar.f402857g = 0.0f;
        this.f402878g.setDuration(1332L);
        this.f402878g.start();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f402878g.cancel();
        this.f402876e = 0.0f;
        s4.d dVar = this.f402875d;
        if (dVar.f402864n) {
            dVar.f402864n = false;
        }
        dVar.a(0);
        dVar.f402861k = 0.0f;
        dVar.f402862l = 0.0f;
        dVar.f402863m = 0.0f;
        dVar.f402855e = 0.0f;
        dVar.f402856f = 0.0f;
        dVar.f402857g = 0.0f;
        invalidateSelf();
    }
}
