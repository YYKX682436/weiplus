package com.tencent.mm.plugin.finder.live.widget;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015R*\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0016"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/widget/FinderLiveKTVReplayCircleProgressView;", "Landroid/view/View;", "", "value", "d", "I", "getProgress", "()I", "setProgress", "(I)V", "progress", "", "getRadius", "()F", "radius", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class FinderLiveKTVReplayCircleProgressView extends android.view.View {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public int progress;

    /* renamed from: e, reason: collision with root package name */
    public int f117653e;

    /* renamed from: f, reason: collision with root package name */
    public int f117654f;

    /* renamed from: g, reason: collision with root package name */
    public float f117655g;

    /* renamed from: h, reason: collision with root package name */
    public float f117656h;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.Paint f117657i;

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.Paint f117658m;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FinderLiveKTVReplayCircleProgressView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    private final float getRadius() {
        return (java.lang.Math.min(getMeasuredWidth(), getMeasuredHeight()) - (2 * this.f117656h)) / 2.0f;
    }

    public final int getProgress() {
        return this.progress;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        super.onDraw(canvas);
        float measuredWidth = getMeasuredWidth() / 2.0f;
        float measuredHeight = getMeasuredHeight() / 2.0f;
        float radius = getRadius();
        android.graphics.Paint paint = this.f117657i;
        if (paint == null) {
            kotlin.jvm.internal.o.o("circlePaint");
            throw null;
        }
        canvas.drawCircle(measuredWidth, measuredHeight, radius, paint);
        float f17 = (this.progress / 100.0f) * 360.0f;
        float radius2 = measuredWidth - getRadius();
        float radius3 = measuredHeight - getRadius();
        float radius4 = measuredWidth + getRadius();
        float radius5 = measuredHeight + getRadius();
        android.graphics.Paint paint2 = this.f117658m;
        if (paint2 != null) {
            canvas.drawArc(radius2, radius3, radius4, radius5, -90.0f, f17, false, paint2);
        } else {
            kotlin.jvm.internal.o.o("progressPaint");
            throw null;
        }
    }

    public final void setProgress(int i17) {
        this.progress = i17;
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveKTVReplayCircleProgressView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        float a17 = i65.a.a(getContext(), 3.0f);
        this.f117656h = a17;
        this.f117655g = a17;
        this.f117653e = getContext().getColor(com.tencent.mm.R.color.agx);
        this.f117654f = getContext().getColor(com.tencent.mm.R.color.agy);
        android.graphics.Paint paint = new android.graphics.Paint(1);
        paint.setStrokeWidth(this.f117655g);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setColor(this.f117653e);
        this.f117657i = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        paint2.setStrokeWidth(this.f117656h);
        paint2.setStyle(android.graphics.Paint.Style.STROKE);
        paint2.setColor(this.f117654f);
        paint2.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        this.f117658m = paint2;
    }
}
