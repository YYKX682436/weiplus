package com.tencent.mm.ui.widget;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u000fB\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB#\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0010"}, d2 = {"Lcom/tencent/mm/ui/widget/RoundCornerConstraintLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "radius", "Ljz5/f0;", "setRadius", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "al5/r2", "weui-native-android-lib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class RoundCornerConstraintLayout extends androidx.constraintlayout.widget.ConstraintLayout {

    /* renamed from: v, reason: collision with root package name */
    public al5.r2 f211402v;

    /* renamed from: w, reason: collision with root package name */
    public final android.graphics.Path f211403w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundCornerConstraintLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f211403w = new android.graphics.Path();
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, yl5.a.f463098e, 0, 0);
        kotlin.jvm.internal.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
        float dimension = obtainStyledAttributes.getDimension(0, 0.0f);
        this.f211402v = new al5.r2(dimension, dimension, dimension, dimension);
        setWillNotDraw(false);
    }

    public final void A() {
        al5.r2 r2Var;
        if (getWidth() <= 0 || getHeight() <= 0 || (r2Var = this.f211402v) == null) {
            return;
        }
        android.graphics.Path path = this.f211403w;
        path.reset();
        path.addPath(com.tencent.mm.ui.dl.c(new android.graphics.RectF(0.0f, 0.0f, getWidth(), getHeight()), r2Var.f6007a, r2Var.f6008b, r2Var.f6010d, r2Var.f6009c, 0.6f));
        path.close();
    }

    public final void B(float f17, float f18, float f19, float f27) {
        al5.r2 r2Var = this.f211402v;
        kotlin.jvm.internal.o.d(r2Var);
        r2Var.f6007a = f17;
        al5.r2 r2Var2 = this.f211402v;
        kotlin.jvm.internal.o.d(r2Var2);
        r2Var2.f6008b = f18;
        al5.r2 r2Var3 = this.f211402v;
        kotlin.jvm.internal.o.d(r2Var3);
        r2Var3.f6009c = f19;
        al5.r2 r2Var4 = this.f211402v;
        kotlin.jvm.internal.o.d(r2Var4);
        r2Var4.f6010d = f27;
        A();
        postInvalidate();
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        android.graphics.Path path = this.f211403w;
        if (path.isEmpty()) {
            A();
        }
        int save = canvas.save();
        canvas.clipPath(path);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        A();
    }

    public final void setRadius(float f17) {
        B(f17, f17, f17, f17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundCornerConstraintLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f211403w = new android.graphics.Path();
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, yl5.a.f463098e, i17, 0);
        kotlin.jvm.internal.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
        float dimension = obtainStyledAttributes.getDimension(0, 0.0f);
        this.f211402v = new al5.r2(dimension, dimension, dimension, dimension);
        setWillNotDraw(false);
    }
}
