package com.tencent.mm.plugin.finder.view;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bB#\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001a\u0010\u001eR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderFixedRatioLayout;", "Landroid/widget/FrameLayout;", "", "d", "F", "getWidthWeight", "()F", "setWidthWeight", "(F)V", "widthWeight", "e", "getHeightWeight", "setHeightWeight", "heightWeight", "", "f", "Z", "getRelatedToWidth", "()Z", "setRelatedToWidth", "(Z)V", "relatedToWidth", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderFixedRatioLayout extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public float widthWeight;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public float heightWeight;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public boolean relatedToWidth;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderFixedRatioLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.widthWeight = 1.0f;
        this.heightWeight = 1.0f;
        this.relatedToWidth = true;
        a(context, attributeSet, 0);
    }

    public final void a(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b92.w2.f18547d, i17, 0);
        kotlin.jvm.internal.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
        this.widthWeight = obtainStyledAttributes.getFloat(2, 1.0f);
        this.heightWeight = obtainStyledAttributes.getFloat(0, 1.0f);
        this.relatedToWidth = obtainStyledAttributes.getBoolean(1, true);
        obtainStyledAttributes.recycle();
    }

    public final void b(float f17, float f18, boolean z17) {
        this.widthWeight = f17;
        this.heightWeight = f18;
        this.relatedToWidth = z17;
        requestLayout();
        invalidate();
    }

    public final float getHeightWeight() {
        return this.heightWeight;
    }

    public final boolean getRelatedToWidth() {
        return this.relatedToWidth;
    }

    public final float getWidthWeight() {
        return this.widthWeight;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        if (this.relatedToWidth) {
            super.onMeasure(i17, android.view.View.MeasureSpec.makeMeasureSpec(a06.d.b((getMeasuredWidth() * this.heightWeight) / this.widthWeight), 1073741824));
        } else {
            super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(a06.d.b((getMeasuredHeight() * this.widthWeight) / this.heightWeight), 1073741824), i18);
        }
    }

    public final void setHeightWeight(float f17) {
        this.heightWeight = f17;
    }

    public final void setRelatedToWidth(boolean z17) {
        this.relatedToWidth = z17;
    }

    public final void setWidthWeight(float f17) {
        this.widthWeight = f17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderFixedRatioLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.widthWeight = 1.0f;
        this.heightWeight = 1.0f;
        this.relatedToWidth = true;
        a(context, attributeSet, i17);
    }
}
