package com.tencent.mm.view;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0006B\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rB#\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\f\u0010\u0010J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\u0011"}, d2 = {"Lcom/tencent/mm/view/RCConstraintLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "r", "Ljz5/f0;", "setRadius", "Lym5/k3;", "cornerRadius", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class RCConstraintLayout extends androidx.constraintlayout.widget.ConstraintLayout {

    /* renamed from: v, reason: collision with root package name */
    public ym5.k3 f213412v;

    /* renamed from: w, reason: collision with root package name */
    public final android.graphics.Path f213413w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RCConstraintLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f213412v = new ym5.k3(0.0f, 0.0f, 0.0f, 0.0f);
        this.f213413w = new android.graphics.Path();
        if (attributeSet != null) {
            A(attributeSet, 0);
        }
    }

    public final void A(android.util.AttributeSet attributeSet, int i17) {
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, wm0.a.B, i17, 0);
            kotlin.jvm.internal.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
            if (obtainStyledAttributes.hasValue(0)) {
                float dimension = (int) obtainStyledAttributes.getDimension(0, i65.a.b(getContext(), 4) * 1.0f);
                ym5.k3 k3Var = this.f213412v;
                k3Var.f463415a = dimension;
                k3Var.f463416b = dimension;
                k3Var.f463417c = dimension;
                k3Var.f463418d = dimension;
                com.tencent.mars.xlog.Log.i("RCConstraintLayout", "initAttribute radius:" + this.f213412v);
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        ym5.k3 k3Var = this.f213412v;
        if (k3Var.f463415a > 0.0f || k3Var.f463416b > 0.0f || k3Var.f463417c > 0.0f || k3Var.f463418d > 0.0f) {
            android.graphics.Path path = this.f213413w;
            path.reset();
            android.graphics.RectF rectF = new android.graphics.RectF(0.0f, 0.0f, getWidth(), getHeight());
            ym5.k3 k3Var2 = this.f213412v;
            float f17 = k3Var2.f463415a;
            float f18 = k3Var2.f463416b;
            float f19 = k3Var2.f463418d;
            float f27 = k3Var2.f463417c;
            path.addRoundRect(rectF, new float[]{f17, f17, f18, f18, f19, f19, f27, f27}, android.graphics.Path.Direction.CCW);
            path.close();
            canvas.clipPath(path);
        }
        super.dispatchDraw(canvas);
    }

    public final void setRadius(ym5.k3 cornerRadius) {
        kotlin.jvm.internal.o.g(cornerRadius, "cornerRadius");
        this.f213412v = cornerRadius;
        requestLayout();
    }

    public final void setRadius(float f17) {
        ym5.k3 k3Var = this.f213412v;
        k3Var.f463415a = f17;
        k3Var.f463416b = f17;
        k3Var.f463417c = f17;
        k3Var.f463418d = f17;
        requestLayout();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RCConstraintLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f213412v = new ym5.k3(0.0f, 0.0f, 0.0f, 0.0f);
        this.f213413w = new android.graphics.Path();
        if (attributeSet != null) {
            A(attributeSet, i17);
        }
    }
}
