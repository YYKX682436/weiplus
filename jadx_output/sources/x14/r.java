package x14;

/* loaded from: classes5.dex */
public final class r extends android.graphics.drawable.DrawableWrapper {

    /* renamed from: d, reason: collision with root package name */
    public final float f451459d;

    /* renamed from: e, reason: collision with root package name */
    public final float f451460e;

    /* renamed from: f, reason: collision with root package name */
    public final long f451461f;

    /* renamed from: g, reason: collision with root package name */
    public float f451462g;

    /* renamed from: h, reason: collision with root package name */
    public android.animation.ValueAnimator f451463h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(android.graphics.drawable.Drawable drawable, float f17, float f18, long j17, int i17, kotlin.jvm.internal.i iVar) {
        super(drawable);
        j17 = (i17 & 8) != 0 ? 1500L : j17;
        kotlin.jvm.internal.o.g(drawable, "drawable");
        this.f451459d = f17;
        this.f451460e = f18;
        this.f451461f = j17;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        if (this.f451463h == null) {
            android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(this.f451459d, this.f451460e);
            ofFloat.setDuration(this.f451461f);
            ofFloat.addUpdateListener(new x14.q(this));
            ofFloat.setInterpolator(new android.view.animation.LinearInterpolator());
            ofFloat.setRepeatCount(-1);
            this.f451463h = ofFloat;
            ofFloat.start();
        }
        android.graphics.drawable.Drawable drawable = getDrawable();
        kotlin.jvm.internal.o.d(drawable);
        kotlin.jvm.internal.o.f(drawable.getBounds(), "getBounds(...)");
        int save = canvas.save();
        canvas.rotate(this.f451462g, (r1.width() * 0.5f) + r1.left, (r1.height() * 0.5f) + r1.top);
        drawable.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z17, boolean z18) {
        if (!z17) {
            android.animation.ValueAnimator valueAnimator = this.f451463h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f451463h = null;
        }
        return super.setVisible(z17, z18);
    }
}
