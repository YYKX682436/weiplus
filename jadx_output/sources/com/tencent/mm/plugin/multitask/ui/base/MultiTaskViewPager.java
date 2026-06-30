package com.tencent.mm.plugin.multitask.ui.base;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0016\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003¨\u0006\r"}, d2 = {"Lcom/tencent/mm/plugin/multitask/ui/base/MultiTaskViewPager;", "Lcom/tencent/mm/ui/base/CustomViewPager;", "Lal5/m2;", "", "enable", "Ljz5/f0;", "setCanOnlySlideBySide", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "multitask-lib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public class MultiTaskViewPager extends com.tencent.mm.ui.base.CustomViewPager implements al5.m2 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f150529d;

    public MultiTaskViewPager(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.tencent.mm.ui.mogic.WxViewPager
    public boolean canScroll(android.view.View view, boolean z17, int i17, int i18, int i19) {
        int i27;
        if (this.f150529d) {
            return true;
        }
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            if (viewGroup.getVisibility() == 0) {
                int scrollX = viewGroup.getScrollX();
                int scrollY = viewGroup.getScrollY();
                for (int childCount = viewGroup.getChildCount() - 1; -1 < childCount; childCount--) {
                    android.view.View childAt = viewGroup.getChildAt(childCount);
                    int i28 = i18 + scrollX;
                    if (i28 >= childAt.getLeft() && i28 < childAt.getRight() && (i27 = i19 + scrollY) >= childAt.getTop() && i27 < childAt.getBottom() && canScroll(childAt, true, i17, i28 - childAt.getLeft(), i27 - childAt.getTop()) && childAt.isEnabled()) {
                        return true;
                    }
                }
            }
        }
        if (z17) {
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            if (view.canScrollHorizontally(-i17)) {
                if (view.getVisibility() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // al5.m2
    public void d(int i17, int i18, int i19, int i27, android.view.View view) {
    }

    @Override // al5.m2
    public void e(int i17, int i18, boolean z17, boolean z18, android.view.View view) {
    }

    @Override // al5.m2
    public boolean m(int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, boolean z17) {
        if (((i19 != 0 || i17 >= 0) && (java.lang.Math.abs(i19 - i28) >= 160 || i17 <= 0)) || i18 != 0) {
            return false;
        }
        setUnableDrag(false, true);
        return true;
    }

    @Override // com.tencent.mm.ui.base.CustomViewPager, com.tencent.mm.ui.mogic.WxViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setCanOnlySlideBySide(boolean z17) {
        this.f150529d = z17;
    }
}
