package com.tencent.mm.view;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0011\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\b\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\"\u0010\u0015\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0013\u0010\n\"\u0004\b\u0014\u0010\fR\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006$"}, d2 = {"Lcom/tencent/mm/view/RingProgressView;", "Landroid/view/View;", "", "strokeWidth", "Ljz5/f0;", "setStrokeWidth", "", "h", "I", "getProgress", "()I", "setProgress", "(I)V", "progress", "i", "getBackColor", "setBackColor", "backColor", "m", "getForeColor", "setForeColor", "foreColor", "", "n", "Z", "getEnableAnimation", "()Z", "setEnableAnimation", "(Z)V", "enableAnimation", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class RingProgressView extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Paint f213451d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Paint f213452e;

    /* renamed from: f, reason: collision with root package name */
    public android.animation.ValueAnimator f213453f;

    /* renamed from: g, reason: collision with root package name */
    public float f213454g;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public int progress;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public int backColor;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public int foreColor;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public boolean enableAnimation;

    /* renamed from: o, reason: collision with root package name */
    public float f213459o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RingProgressView(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        float dimension = getResources().getDimension(com.tencent.mm.R.dimen.f479644bj);
        this.f213454g = dimension;
        this.backColor = getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_1);
        this.foreColor = getResources().getColor(com.tencent.mm.R.color.f478517z);
        this.f213459o = 0.0f;
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeWidth(this.f213454g);
        paint.setAntiAlias(true);
        paint.setColor(this.backColor);
        paint.setStrokeCap(android.graphics.Paint.Cap.BUTT);
        this.f213451d = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        paint2.setStyle(android.graphics.Paint.Style.STROKE);
        paint2.setStrokeWidth(this.f213454g);
        paint2.setAntiAlias(true);
        paint2.setColor(this.foreColor);
        paint2.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        this.f213452e = paint2;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, wm0.a.F);
        kotlin.jvm.internal.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            this.backColor = obtainStyledAttributes.getColor(0, getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_1));
            this.foreColor = obtainStyledAttributes.getColor(2, getResources().getColor(com.tencent.mm.R.color.f478517z));
            this.f213454g = obtainStyledAttributes.getDimension(1, dimension);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public final void a(int i17) {
        if (!this.enableAnimation) {
            this.progress = i17;
            invalidate();
            return;
        }
        int i18 = this.progress;
        android.animation.ValueAnimator valueAnimator = this.f213453f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(i18, i17);
        ofInt.setDuration(300L);
        ofInt.addUpdateListener(new ym5.a5(this));
        ofInt.addListener(new ym5.b5(this, i17));
        ofInt.start();
        this.f213453f = ofInt;
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        super.draw(canvas);
        int width = getWidth() / 2;
        float f17 = width;
        int i17 = (int) (f17 - (this.f213454g / 2));
        android.graphics.Paint paint = this.f213451d;
        if (paint == null) {
            kotlin.jvm.internal.o.o("backPaint");
            throw null;
        }
        paint.setColor(this.backColor);
        android.graphics.Paint paint2 = this.f213451d;
        if (paint2 == null) {
            kotlin.jvm.internal.o.o("backPaint");
            throw null;
        }
        paint2.setStrokeWidth(this.f213454g);
        float f18 = i17;
        android.graphics.Paint paint3 = this.f213451d;
        if (paint3 == null) {
            kotlin.jvm.internal.o.o("backPaint");
            throw null;
        }
        canvas.drawCircle(f17, f17, f18, paint3);
        android.graphics.Paint paint4 = this.f213452e;
        if (paint4 == null) {
            kotlin.jvm.internal.o.o("forePaint");
            throw null;
        }
        paint4.setColor(this.foreColor);
        android.graphics.Paint paint5 = this.f213452e;
        if (paint5 == null) {
            kotlin.jvm.internal.o.o("forePaint");
            throw null;
        }
        paint5.setStrokeWidth(this.f213454g);
        float f19 = width - i17;
        float f27 = width + i17;
        android.graphics.RectF rectF = new android.graphics.RectF(f19, f19, f27, f27);
        float f28 = (com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1 * (this.enableAnimation ? this.f213459o : this.progress)) / 100.0f;
        android.graphics.Paint paint6 = this.f213452e;
        if (paint6 != null) {
            canvas.drawArc(rectF, -90.0f, f28, false, paint6);
        } else {
            kotlin.jvm.internal.o.o("forePaint");
            throw null;
        }
    }

    public final int getBackColor() {
        return this.backColor;
    }

    public final boolean getEnableAnimation() {
        return this.enableAnimation;
    }

    public final int getForeColor() {
        return this.foreColor;
    }

    public final int getProgress() {
        return this.progress;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        android.animation.ValueAnimator valueAnimator = this.f213453f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public final void setBackColor(int i17) {
        this.backColor = i17;
    }

    public final void setEnableAnimation(boolean z17) {
        this.enableAnimation = z17;
    }

    public final void setForeColor(int i17) {
        this.foreColor = i17;
    }

    public final void setProgress(int i17) {
        this.progress = i17;
    }

    public final void setStrokeWidth(float f17) {
        if (f17 < 0.0f) {
            return;
        }
        this.f213454g = f17;
    }
}
