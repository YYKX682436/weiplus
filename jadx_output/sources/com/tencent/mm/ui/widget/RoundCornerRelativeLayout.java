package com.tencent.mm.ui.widget;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0001\u000fB\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB#\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0010"}, d2 = {"Lcom/tencent/mm/ui/widget/RoundCornerRelativeLayout;", "Landroid/widget/RelativeLayout;", "", "radius", "Ljz5/f0;", "setRadius", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "al5/u2", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public class RoundCornerRelativeLayout extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public al5.u2 f211416d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Path f211417e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundCornerRelativeLayout(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f211417e = new android.graphics.Path();
        a(context, null, 0);
    }

    public final void a(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wm0.a.I, i17, 0);
        kotlin.jvm.internal.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
        float dimension = obtainStyledAttributes.getDimension(2, 0.0f);
        this.f211416d = new al5.u2(dimension, dimension, dimension, dimension);
        setWillNotDraw(false);
    }

    public final void b() {
        al5.u2 u2Var;
        if (getWidth() <= 0 || getHeight() <= 0 || (u2Var = this.f211416d) == null) {
            return;
        }
        android.graphics.Path path = this.f211417e;
        path.reset();
        path.addPath(com.tencent.mm.ui.dl.c(new android.graphics.RectF(0.0f, 0.0f, getWidth(), getHeight()), u2Var.f6054a, u2Var.f6055b, u2Var.f6057d, u2Var.f6056c, 0.6f));
        path.close();
    }

    public final void c(float f17, float f18, float f19, float f27) {
        al5.u2 u2Var = this.f211416d;
        kotlin.jvm.internal.o.d(u2Var);
        u2Var.f6054a = f17;
        al5.u2 u2Var2 = this.f211416d;
        kotlin.jvm.internal.o.d(u2Var2);
        u2Var2.f6055b = f18;
        al5.u2 u2Var3 = this.f211416d;
        kotlin.jvm.internal.o.d(u2Var3);
        u2Var3.f6056c = f19;
        al5.u2 u2Var4 = this.f211416d;
        kotlin.jvm.internal.o.d(u2Var4);
        u2Var4.f6057d = f27;
        b();
        postInvalidate();
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        android.graphics.Path path = this.f211417e;
        if (path.isEmpty()) {
            b();
        }
        int save = canvas.save();
        canvas.clipPath(path);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        b();
    }

    public final void setRadius(float f17) {
        c(f17, f17, f17, f17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundCornerRelativeLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f211417e = new android.graphics.Path();
        a(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundCornerRelativeLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f211417e = new android.graphics.Path();
        a(context, attributeSet, i17);
    }
}
