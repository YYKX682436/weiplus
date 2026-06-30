package kx0;

/* loaded from: classes5.dex */
public class g extends android.graphics.drawable.Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f313252a;

    /* renamed from: c, reason: collision with root package name */
    public final kx0.i f313254c;

    /* renamed from: e, reason: collision with root package name */
    public final android.animation.ValueAnimator f313256e;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.Paint f313253b = new android.graphics.Paint(1);

    /* renamed from: d, reason: collision with root package name */
    public kx0.f f313255d = kx0.f.IDLE;

    public g(android.content.Context context, kx0.h hVar) {
        android.view.animation.LinearInterpolator linearInterpolator = new android.view.animation.LinearInterpolator();
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(-1.0f, 1.0f);
        this.f313256e = ofFloat;
        ofFloat.setRepeatMode(2);
        ofFloat.setRepeatCount(-1);
        ofFloat.setInterpolator(linearInterpolator);
        ofFloat.addUpdateListener(new kx0.e(this));
        this.f313252a = context;
        this.f313254c = new kx0.i(context, hVar);
    }

    public final boolean a(android.graphics.Canvas canvas) {
        return canvas == null || canvas.getWidth() == 0 || canvas.getHeight() == 0;
    }

    public final void b(android.graphics.Canvas canvas, int i17, android.util.SizeF sizeF) {
        android.graphics.Paint paint = this.f313253b;
        paint.setStyle(android.graphics.Paint.Style.FILL);
        paint.setColor(i17);
        int width = canvas.getWidth() >> 1;
        int height = canvas.getHeight() >> 1;
        float width2 = sizeF.getWidth() / 2.0f;
        float height2 = sizeF.getHeight() / 2.0f;
        kx0.i iVar = this.f313254c;
        float f17 = width;
        float f18 = height;
        iVar.f313272m.set(f17 - width2, f18 - height2, f17 + width2, f18 + height2);
        canvas.drawOval(iVar.f313272m, paint);
    }

    public final void c(android.graphics.Canvas canvas, android.graphics.drawable.Drawable drawable, android.util.SizeF sizeF) {
        int width = canvas.getWidth() >> 1;
        int height = canvas.getHeight() >> 1;
        int width2 = (int) (sizeF.getWidth() / 2.0f);
        int height2 = (int) (sizeF.getHeight() / 2.0f);
        drawable.setBounds(width - width2, height - height2, width + width2, height + height2);
        drawable.draw(canvas);
    }

    public void d() {
        kx0.f fVar = this.f313255d;
        kx0.f fVar2 = kx0.f.IDLE;
        if (fVar == fVar2) {
            return;
        }
        this.f313255d = fVar2;
        this.f313256e.cancel();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        int ordinal = this.f313255d.ordinal();
        kx0.i iVar = this.f313254c;
        if (ordinal == 0) {
            if (iVar.f313260a == null || a(canvas)) {
                return;
            }
            b(canvas, iVar.f313262c, iVar.f313270k);
            c(canvas, iVar.f313260a, iVar.f313267h);
            return;
        }
        android.graphics.Paint paint = this.f313253b;
        if (ordinal == 1) {
            if (!a(canvas)) {
                int width = canvas.getWidth() >> 1;
                int height = canvas.getHeight() >> 1;
                paint.setStyle(android.graphics.Paint.Style.FILL);
                paint.setColor(iVar.f313266g);
                canvas.drawCircle(width, height, iVar.f313275p / 2.0f, paint);
            }
            if (iVar.f313261b == null || a(canvas)) {
                return;
            }
            b(canvas, iVar.f313263d, iVar.f313271l);
            c(canvas, iVar.f313261b, iVar.f313268i);
            return;
        }
        if (ordinal == 2) {
            if (iVar.f313261b == null || a(canvas)) {
                return;
            }
            b(canvas, iVar.f313265f, iVar.f313270k);
            c(canvas, iVar.f313261b, iVar.f313269j);
            return;
        }
        if (ordinal != 3) {
            return;
        }
        if (iVar.f313260a != null && !a(canvas)) {
            b(canvas, iVar.f313262c, iVar.f313270k);
            c(canvas, iVar.f313260a, iVar.f313267h);
        }
        paint.setColor(iVar.f313264e);
        canvas.drawOval(iVar.f313272m, paint);
    }

    public void e() {
        kx0.f fVar = this.f313255d;
        kx0.f fVar2 = kx0.f.PRESS;
        if (fVar == fVar2) {
            return;
        }
        this.f313255d = fVar2;
        android.animation.ValueAnimator valueAnimator = this.f313256e;
        if (!valueAnimator.isStarted()) {
            valueAnimator.start();
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        android.content.Context context = this.f313252a;
        if (context == null) {
            return 0;
        }
        return i65.a.k(context);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        android.content.Context context = this.f313252a;
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
