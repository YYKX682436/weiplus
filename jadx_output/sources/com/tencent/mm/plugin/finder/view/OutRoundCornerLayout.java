package com.tencent.mm.plugin.finder.view;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u000fB\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB#\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0010"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/OutRoundCornerLayout;", "Landroid/widget/FrameLayout;", "", "radius", "Ljz5/f0;", "setRadius", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "com/tencent/mm/plugin/finder/view/ur", "plugin-finder-publish_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class OutRoundCornerLayout extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.ur f131548d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Path f131549e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OutRoundCornerLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f131549e = new android.graphics.Path();
        a(context, attributeSet, 0);
    }

    public final void a(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wm0.a.I, i17, 0);
        kotlin.jvm.internal.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
        float dimension = obtainStyledAttributes.getDimension(2, 0.0f);
        this.f131548d = new com.tencent.mm.plugin.finder.view.ur(dimension, dimension, dimension, dimension);
        setWillNotDraw(false);
    }

    public final void b() {
        com.tencent.mm.plugin.finder.view.ur urVar;
        if (getWidth() <= 0 || getHeight() <= 0 || (urVar = this.f131548d) == null) {
            return;
        }
        android.graphics.Path path = this.f131549e;
        path.reset();
        android.graphics.RectF rectF = new android.graphics.RectF(0.0f, 0.0f, getWidth(), getHeight());
        float f17 = urVar.f133219a;
        float f18 = urVar.f133220b;
        float f19 = urVar.f133222d;
        float f27 = urVar.f133221c;
        path.addRoundRect(rectF, new float[]{f17, f17, f18, f18, f19, f19, f27, f27}, android.graphics.Path.Direction.CCW);
        path.close();
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        android.graphics.Path path = this.f131549e;
        if (path.isEmpty()) {
            b();
        }
        int save = canvas.save();
        canvas.clipPath(path, android.graphics.Region.Op.DIFFERENCE);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        b();
    }

    public final void setRadius(float f17) {
        com.tencent.mm.plugin.finder.view.ur urVar = this.f131548d;
        kotlin.jvm.internal.o.d(urVar);
        urVar.f133219a = f17;
        com.tencent.mm.plugin.finder.view.ur urVar2 = this.f131548d;
        kotlin.jvm.internal.o.d(urVar2);
        urVar2.f133220b = f17;
        com.tencent.mm.plugin.finder.view.ur urVar3 = this.f131548d;
        kotlin.jvm.internal.o.d(urVar3);
        urVar3.f133221c = f17;
        com.tencent.mm.plugin.finder.view.ur urVar4 = this.f131548d;
        kotlin.jvm.internal.o.d(urVar4);
        urVar4.f133222d = f17;
        b();
        postInvalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OutRoundCornerLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f131549e = new android.graphics.Path();
        a(context, attributeSet, i17);
    }
}
