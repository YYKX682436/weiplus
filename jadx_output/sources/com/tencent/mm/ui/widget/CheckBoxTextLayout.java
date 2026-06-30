package com.tencent.mm.ui.widget;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/ui/widget/CheckBoxTextLayout;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class CheckBoxTextLayout extends android.widget.RelativeLayout {
    public CheckBoxTextLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        android.view.View childAt = getChildAt(0);
        kotlin.jvm.internal.o.e(childAt, "null cannot be cast to non-null type android.view.View");
        android.view.View childAt2 = getChildAt(1);
        kotlin.jvm.internal.o.e(childAt2, "null cannot be cast to non-null type android.widget.TextView");
        android.widget.TextView textView = (android.widget.TextView) childAt2;
        android.text.TextPaint paint = textView.getPaint();
        kotlin.jvm.internal.o.f(paint, "getPaint(...)");
        android.graphics.Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        kotlin.jvm.internal.o.f(fontMetrics, "getFontMetrics(...)");
        int abs = ((int) ((java.lang.Math.abs(fontMetrics.ascent - fontMetrics.descent) - childAt.getMeasuredHeight()) / 2)) + ((int) (fontMetrics.ascent - fontMetrics.top));
        if (abs > 0) {
            android.view.ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
            if (layoutParams2.topMargin != abs) {
                layoutParams2.topMargin = abs;
                childAt.setLayoutParams(layoutParams2);
            }
            android.view.ViewGroup.LayoutParams layoutParams3 = textView.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams3, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            android.widget.RelativeLayout.LayoutParams layoutParams4 = (android.widget.RelativeLayout.LayoutParams) layoutParams3;
            if (layoutParams4.topMargin != 0) {
                layoutParams4.topMargin = 0;
                textView.setLayoutParams(layoutParams4);
            }
        } else {
            android.view.ViewGroup.LayoutParams layoutParams5 = textView.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams5, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            android.widget.RelativeLayout.LayoutParams layoutParams6 = (android.widget.RelativeLayout.LayoutParams) layoutParams5;
            int i19 = -abs;
            if (layoutParams6.topMargin != i19) {
                layoutParams6.topMargin = i19;
                textView.setLayoutParams(layoutParams6);
            }
            android.view.ViewGroup.LayoutParams layoutParams7 = childAt.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams7, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            android.widget.RelativeLayout.LayoutParams layoutParams8 = (android.widget.RelativeLayout.LayoutParams) layoutParams7;
            if (layoutParams8.topMargin != 0) {
                layoutParams8.topMargin = 0;
                childAt.setLayoutParams(layoutParams8);
            }
        }
        super.onMeasure(i17, i18);
    }

    public CheckBoxTextLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        post(new al5.l(this));
    }
}
