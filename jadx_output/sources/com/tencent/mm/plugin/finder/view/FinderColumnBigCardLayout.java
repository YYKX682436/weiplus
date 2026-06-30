package com.tencent.mm.plugin.finder.view;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000b¢\u0006\u0004\b\u0018\u0010\u0019R*\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR*\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001a"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderColumnBigCardLayout;", "Landroid/widget/FrameLayout;", "", "value", "d", "F", "getAspectRatio", "()F", "setAspectRatio", "(F)V", "aspectRatio", "", "e", "I", "getMaxWidth", "()I", "setMaxWidth", "(I)V", "maxWidth", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderColumnBigCardLayout extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public float aspectRatio;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public int maxWidth;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FinderColumnBigCardLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final float getAspectRatio() {
        return this.aspectRatio;
    }

    public final int getMaxWidth() {
        return this.maxWidth;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        int i19;
        if (this.aspectRatio <= 0.0f) {
            super.onMeasure(i17, i18);
            return;
        }
        int mode = android.view.View.MeasureSpec.getMode(i17);
        int size = android.view.View.MeasureSpec.getSize(i17);
        int mode2 = android.view.View.MeasureSpec.getMode(i18);
        int size2 = android.view.View.MeasureSpec.getSize(i18);
        if (mode == 0) {
            i19 = this.maxWidth;
            if (i19 <= 0) {
                i19 = getResources().getDisplayMetrics().widthPixels;
            }
        } else {
            i19 = size;
        }
        int i27 = this.maxWidth;
        if (i27 > 0) {
            i19 = java.lang.Math.min(i19, i27);
        }
        int b17 = a06.d.b(i19 / this.aspectRatio);
        if (mode2 == 0 || b17 <= size2) {
            size2 = b17;
        } else {
            i19 = a06.d.b(size2 * this.aspectRatio);
            int i28 = this.maxWidth;
            boolean z17 = false;
            if (1 <= i28 && i28 < i19) {
                z17 = true;
            }
            if (z17) {
                size2 = a06.d.b(i28 / this.aspectRatio);
                i19 = i28;
            }
        }
        if (mode == 0 || i19 <= size) {
            size = i19;
        } else {
            size2 = a06.d.b(size / this.aspectRatio);
        }
        super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(size, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        setMeasuredDimension(size, size2);
    }

    public final void setAspectRatio(float f17) {
        if (this.aspectRatio == f17) {
            return;
        }
        this.aspectRatio = f17;
        requestLayout();
    }

    public final void setMaxWidth(int i17) {
        if (this.maxWidth != i17) {
            this.maxWidth = i17;
            requestLayout();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderColumnBigCardLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.aspectRatio = 0.5625f;
    }
}
