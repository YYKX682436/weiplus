package com.tencent.mm.ui.widget;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u000fB\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB#\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0010"}, d2 = {"Lcom/tencent/mm/ui/widget/TopRoundCornerConstraintLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "radius", "Ljz5/f0;", "setRadius", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "al5/r3", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class TopRoundCornerConstraintLayout extends androidx.constraintlayout.widget.ConstraintLayout {

    /* renamed from: v, reason: collision with root package name */
    public al5.r3 f211455v;

    /* renamed from: w, reason: collision with root package name */
    public final android.graphics.Path f211456w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopRoundCornerConstraintLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f211456w = new android.graphics.Path();
        A(context, attributeSet, 0);
    }

    public final void A(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wm0.a.I, i17, 0);
        kotlin.jvm.internal.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
        float dimension = obtainStyledAttributes.getDimension(2, 0.0f);
        this.f211455v = new al5.r3(dimension, dimension, 0.0f, 0.0f);
        setWillNotDraw(false);
    }

    public final void B() {
        al5.r3 r3Var;
        if (getWidth() <= 0 || getHeight() <= 0 || (r3Var = this.f211455v) == null) {
            return;
        }
        android.graphics.Path path = this.f211456w;
        path.reset();
        android.graphics.RectF rectF = new android.graphics.RectF(0.0f, 0.0f, getWidth(), getHeight());
        float f17 = r3Var.f6011a;
        float f18 = r3Var.f6012b;
        path.addRoundRect(rectF, new float[]{f17, f17, f18, f18, 0.0f, 0.0f, 0.0f, 0.0f}, android.graphics.Path.Direction.CCW);
        path.close();
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        android.graphics.Path path = this.f211456w;
        if (path.isEmpty()) {
            B();
        }
        int save = canvas.save();
        canvas.clipPath(path);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        B();
    }

    public final void setRadius(float f17) {
        al5.r3 r3Var = this.f211455v;
        kotlin.jvm.internal.o.d(r3Var);
        r3Var.f6011a = f17;
        al5.r3 r3Var2 = this.f211455v;
        kotlin.jvm.internal.o.d(r3Var2);
        r3Var2.f6012b = f17;
        B();
        postInvalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopRoundCornerConstraintLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f211456w = new android.graphics.Path();
        A(context, attributeSet, i17);
    }
}
