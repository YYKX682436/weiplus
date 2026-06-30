package com.tencent.mm.ui.widget;

/* loaded from: classes3.dex */
public final class StoryAvatarDotsView extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public int f211423d;

    /* renamed from: e, reason: collision with root package name */
    public int f211424e;

    public StoryAvatarDotsView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f211423d = i65.a.b(getContext(), 25);
        this.f211424e = i65.a.b(getContext(), 19);
    }

    public android.widget.ImageView a(int i17) {
        return (android.widget.ImageView) getChildAt((getChildCount() - 1) - i17);
    }

    public final void b() {
        if (getChildCount() > 0) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                android.view.View childAt = getChildAt(childCount);
                android.view.ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                android.view.ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
                int i17 = this.f211423d;
                layoutParams2.height = i17;
                layoutParams.width = i17;
                ((android.widget.FrameLayout.LayoutParams) childAt.getLayoutParams()).gravity |= 5;
                ((android.widget.FrameLayout.LayoutParams) childAt.getLayoutParams()).rightMargin = this.f211424e * childCount;
            }
            requestLayout();
            invalidate();
        }
    }

    public int getExpandDuration() {
        if (getChildCount() <= 1) {
            return 0;
        }
        return ((getChildCount() - 2) * 50) + 200;
    }

    public void setIconGap(int i17) {
        if (i17 < 0 || this.f211424e == i17) {
            return;
        }
        this.f211424e = i17;
        b();
    }

    public void setIconLayerCount(int i17) {
        if (i17 < 0 || i17 == getChildCount()) {
            return;
        }
        if (i17 > getChildCount()) {
            int childCount = i17 - getChildCount();
            for (int i18 = 0; i18 < childCount; i18++) {
                android.view.View imageView = new android.widget.ImageView(getContext());
                int i19 = this.f211423d;
                android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(i19, i19);
                layoutParams.gravity = 16;
                addViewInLayout(imageView, 0, layoutParams, true);
            }
        } else if (i17 < getChildCount()) {
            removeViewsInLayout(0, getChildCount() - i17);
        }
        b();
    }

    public void setIconSize(int i17) {
        if (i17 <= 0 || i17 == this.f211423d) {
            return;
        }
        this.f211423d = i17;
        b();
    }

    public StoryAvatarDotsView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f211423d = i65.a.b(getContext(), 25);
        this.f211424e = i65.a.b(getContext(), 19);
    }
}
