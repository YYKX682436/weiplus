package com.tencent.mm.plugin.finder.view.indictor;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u001bJ\u0006\u0010\u0004\u001a\u00020\u0003J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\tH\u0016J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\tH\u0016J\b\u0010\u000f\u001a\u00020\tH\u0016J\b\u0010\u0010\u001a\u00020\u0001H\u0016J\u0010\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0011H\u0016¨\u0006\u001c"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/indictor/FinderPageIndicatorView;", "Landroid/view/View;", "Lym5/o1;", "", "getRemainingDurationMs", "", "isShow", "Ljz5/f0;", "setShowOnlyOneIndicator", "", "count", "setCount", "getCount", ya.b.INDEX, "setCurrentIndex", "getCurrentIndex", "getView", "Lym5/n1;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnSelectedPageListener", "getOnSelectedPageListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderPageIndicatorView extends android.view.View implements ym5.o1 {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f132360d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint f132361e;

    /* renamed from: f, reason: collision with root package name */
    public int f132362f;

    /* renamed from: g, reason: collision with root package name */
    public int f132363g;

    /* renamed from: h, reason: collision with root package name */
    public float f132364h;

    /* renamed from: i, reason: collision with root package name */
    public final float f132365i;

    /* renamed from: m, reason: collision with root package name */
    public final float f132366m;

    /* renamed from: n, reason: collision with root package name */
    public android.animation.ValueAnimator f132367n;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FinderPageIndicatorView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final void a(long j17) {
        android.animation.ValueAnimator valueAnimator = this.f132367n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(j17);
        ofFloat.addUpdateListener(new nx2.g(this));
        ofFloat.start();
        this.f132367n = ofFloat;
    }

    @Override // ym5.o1
    /* renamed from: getCount, reason: from getter */
    public int getF132362f() {
        return this.f132362f;
    }

    /* renamed from: getCurrentIndex, reason: from getter */
    public int getF132363g() {
        return this.f132363g;
    }

    public ym5.n1 getOnSelectedPageListener() {
        return null;
    }

    public final long getRemainingDurationMs() {
        android.animation.ValueAnimator valueAnimator = this.f132367n;
        if (valueAnimator == null) {
            return 0L;
        }
        long duration = valueAnimator.getDuration() - (((float) r3) * this.f132364h);
        if (duration < 0) {
            return 0L;
        }
        return duration;
    }

    @Override // ym5.o1
    public android.view.View getView() {
        return this;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        android.animation.ValueAnimator valueAnimator = this.f132367n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        boolean z17;
        kotlin.jvm.internal.o.g(canvas, "canvas");
        super.onDraw(canvas);
        if (this.f132362f == 0) {
            return;
        }
        float f17 = 2;
        int i17 = this.f132362f;
        float f18 = this.f132366m;
        float width = ((getWidth() - (0.0f * f17)) - ((i17 - 1) * f18)) / i17;
        float height = getHeight() / 2.0f;
        int i18 = this.f132362f;
        int i19 = 0;
        float f19 = 0.0f;
        while (i19 < i18) {
            float f27 = f19 + width;
            float f28 = height / f17;
            float f29 = height - f28;
            float f37 = height + f28;
            float f38 = this.f132365i;
            int i27 = i19;
            canvas.drawRoundRect(f19, f29, f27, f37, f38, f38, this.f132360d);
            int i28 = this.f132363g;
            android.graphics.Paint paint = this.f132361e;
            if (i27 == i28) {
                float f39 = this.f132364h;
                z17 = false;
                if (f39 > 0.0f) {
                    float f47 = this.f132365i;
                    canvas.drawRoundRect(f19, f29, f19 + (f39 * width), f37, f47, f47, paint);
                    f19 += width + f18;
                    i19 = i27 + 1;
                }
            } else {
                z17 = false;
            }
            if (i27 < i28) {
                float f48 = this.f132365i;
                canvas.drawRoundRect(f19, f29, f27, f37, f48, f48, paint);
            }
            f19 += width + f18;
            i19 = i27 + 1;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        if (this.f132362f == 0) {
            setMeasuredDimension(0, 0);
        } else {
            setMeasuredDimension(android.view.View.MeasureSpec.getSize(i17), android.view.View.MeasureSpec.getSize(i18));
        }
    }

    @Override // ym5.o1
    public void setCount(int i17) {
        this.f132362f = i17;
    }

    @Override // ym5.o1
    public void setCurrentIndex(int i17) {
        if (this.f132363g != i17) {
            this.f132363g = i17;
            this.f132364h = 0.0f;
            invalidate();
        }
    }

    @Override // ym5.o1
    public void setOnSelectedPageListener(ym5.n1 listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
    }

    @Override // ym5.o1
    public void setShowOnlyOneIndicator(boolean z17) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderPageIndicatorView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        android.graphics.Paint paint = new android.graphics.Paint(1);
        paint.setColor(context.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_1));
        paint.setStyle(android.graphics.Paint.Style.FILL);
        this.f132360d = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        paint2.setColor(context.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_3));
        paint2.setStyle(android.graphics.Paint.Style.FILL);
        this.f132361e = paint2;
        this.f132365i = context.getResources().getDimension(com.tencent.mm.R.dimen.f479693cs);
        this.f132366m = context.getResources().getDimension(com.tencent.mm.R.dimen.f479738dv);
    }
}
