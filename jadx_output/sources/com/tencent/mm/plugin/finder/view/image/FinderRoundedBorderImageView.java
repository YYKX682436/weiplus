package com.tencent.mm.plugin.finder.view.image;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u0014J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\u000b\u001a\u00020\u0002J\u0006\u0010\f\u001a\u00020\u0002J\u0006\u0010\r\u001a\u00020\b¨\u0006\u0015"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/image/FinderRoundedBorderImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "", "radius", "Ljz5/f0;", "setCornerRadius", "width", "setBorderWidth", "", "color", "setBorderColor", "getCornerRadius", "getBorderWidth", "getBorderColor", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderRoundedBorderImageView extends androidx.appcompat.widget.AppCompatImageView {

    /* renamed from: f, reason: collision with root package name */
    public float f132338f;

    /* renamed from: g, reason: collision with root package name */
    public float f132339g;

    /* renamed from: h, reason: collision with root package name */
    public int f132340h;

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.Path f132341i;

    /* renamed from: m, reason: collision with root package name */
    public final android.graphics.Paint f132342m;

    /* renamed from: n, reason: collision with root package name */
    public final android.graphics.RectF f132343n;

    /* renamed from: o, reason: collision with root package name */
    public final android.graphics.Path f132344o;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FinderRoundedBorderImageView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    /* renamed from: getBorderColor, reason: from getter */
    public final int getF132340h() {
        return this.f132340h;
    }

    /* renamed from: getBorderWidth, reason: from getter */
    public final float getF132339g() {
        return this.f132339g;
    }

    /* renamed from: getCornerRadius, reason: from getter */
    public final float getF132338f() {
        return this.f132338f;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        canvas.save();
        canvas.clipPath(this.f132341i);
        super.onDraw(canvas);
        canvas.restore();
        if (this.f132339g > 0.0f) {
            canvas.drawPath(this.f132344o, this.f132342m);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        float f17 = i17;
        float f18 = 2;
        float f19 = this.f132339g;
        float f27 = i18;
        android.graphics.RectF rectF = this.f132343n;
        rectF.set(f19, f19, (f17 - (f18 * f19)) + f19, (f27 - (f18 * f19)) + f19);
        android.graphics.Path path = this.f132341i;
        path.reset();
        float f28 = this.f132338f;
        path.addRoundRect(rectF, f28, f28, android.graphics.Path.Direction.CW);
        android.graphics.Path path2 = this.f132344o;
        path2.reset();
        float f29 = this.f132339g;
        android.graphics.RectF rectF2 = new android.graphics.RectF(f29 / f18, f29 / f18, f17 - (f29 / f18), f27 - (f29 / f18));
        float f37 = this.f132338f;
        float f38 = this.f132339g;
        path2.addRoundRect(rectF2, (f38 / f18) + f37, f37 + (f38 / f18), android.graphics.Path.Direction.CW);
    }

    public final void setBorderColor(int i17) {
        this.f132340h = i17;
        this.f132342m.setColor(i17);
        invalidate();
    }

    public final void setBorderWidth(float f17) {
        this.f132339g = f17;
        this.f132342m.setStrokeWidth(f17);
        invalidate();
        requestLayout();
    }

    public final void setCornerRadius(float f17) {
        this.f132338f = f17;
        invalidate();
        requestLayout();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderRoundedBorderImageView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f132340h = -1;
        this.f132341i = new android.graphics.Path();
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f132342m = paint;
        this.f132343n = new android.graphics.RectF();
        this.f132344o = new android.graphics.Path();
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setAntiAlias(true);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b92.w2.f18551h);
        kotlin.jvm.internal.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f132338f = obtainStyledAttributes.getDimension(2, android.util.TypedValue.applyDimension(1, 8.0f, getResources().getDisplayMetrics()));
        this.f132339g = obtainStyledAttributes.getDimension(1, android.util.TypedValue.applyDimension(1, 2.0f, getResources().getDisplayMetrics()));
        this.f132340h = obtainStyledAttributes.getColor(0, -1);
        obtainStyledAttributes.recycle();
        paint.setStrokeWidth(this.f132339g);
        paint.setColor(this.f132340h);
        setClipToOutline(true);
    }
}
