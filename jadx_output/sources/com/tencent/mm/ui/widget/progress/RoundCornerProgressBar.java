package com.tencent.mm.ui.widget.progress;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\u000e"}, d2 = {"Lcom/tencent/mm/ui/widget/progress/RoundCornerProgressBar;", "Landroid/view/View;", "Landroid/util/AttributeSet;", "attrs", "Ljz5/f0;", "setupAttributes", "", "progress", "setProgress", "Landroid/content/Context;", "context", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "weui-native-android-lib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class RoundCornerProgressBar extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public int f212389d;

    /* renamed from: e, reason: collision with root package name */
    public int f212390e;

    /* renamed from: f, reason: collision with root package name */
    public int f212391f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.Paint f212392g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RoundCornerProgressBar(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    private final void setupAttributes(android.util.AttributeSet attributeSet) {
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, yl5.a.f463112s);
            kotlin.jvm.internal.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
            this.f212390e = obtainStyledAttributes.getColor(0, getContext().getResources().getColor(com.tencent.mm.R.color.FG_3));
            this.f212391f = obtainStyledAttributes.getColor(2, getContext().getResources().getColor(com.tencent.mm.R.color.Brand_100));
            int i17 = obtainStyledAttributes.getInt(1, 0);
            this.f212389d = i17;
            this.f212389d = e06.p.f(i17, 0, 100);
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        super.onDraw(canvas);
        float height = getHeight() / 2;
        android.graphics.Paint paint = this.f212392g;
        paint.setColor(this.f212390e);
        paint.setStrokeWidth(getHeight());
        canvas.drawLine(height, height, getWidth() - height, height, paint);
        if (this.f212389d > 0) {
            paint.setColor(this.f212391f);
            canvas.drawLine(height, height, (((getWidth() - getHeight()) * this.f212389d) / 100.0f) + height, height, paint);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo info) {
        kotlin.jvm.internal.o.g(info, "info");
        super.onInitializeAccessibilityNodeInfo(info);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f212389d);
        sb6.append('%');
        info.setContentDescription(sb6.toString());
    }

    public final void setProgress(int i17) {
        this.f212389d = e06.p.f(i17, 0, 100);
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundCornerProgressBar(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f212390e = -1;
        this.f212391f = -16711936;
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f212392g = paint;
        setupAttributes(attributeSet);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
    }
}
