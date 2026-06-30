package com.tencent.mm.ui.base;

/* loaded from: classes4.dex */
public class MMFrameLayout extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public boolean f197385d;

    public MMFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f197385d = false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        int childCount = getChildCount();
        for (int i28 = 0; !this.f197385d && i28 < childCount; i28++) {
            android.view.View childAt = getChildAt(i28);
            if (childAt != null) {
                android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) childAt.getLayoutParams();
                if (layoutParams.gravity == -1) {
                    layoutParams.gravity = 51;
                    childAt.setLayoutParams(layoutParams);
                }
            }
        }
        this.f197385d = true;
        super.onLayout(z17, i17, i18, i19, i27);
    }
}
