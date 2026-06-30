package com.tencent.mm.plugin.vlog.ui.widget;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB%\b\u0016\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u000f"}, d2 = {"Lcom/tencent/mm/plugin/vlog/ui/widget/CropOperationContainer;", "Landroid/widget/RelativeLayout;", "", "enable", "Ljz5/f0;", "setEditorItemFirstTouch", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-vlog_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class CropOperationContainer extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Set f176113d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f176114e;

    public CropOperationContainer(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f176113d = kz5.z.D0(new java.lang.Integer[]{java.lang.Integer.valueOf(com.tencent.mm.R.id.oyw), java.lang.Integer.valueOf(com.tencent.mm.R.id.f486311kv5)});
    }

    public final boolean a(android.view.MotionEvent motionEvent, boolean z17, android.view.View view) {
        int action = motionEvent.getAction();
        if (z17 || action == 3) {
            motionEvent.setAction(3);
            boolean dispatchTouchEvent = view.dispatchTouchEvent(motionEvent);
            motionEvent.setAction(action);
            return dispatchTouchEvent;
        }
        android.view.MotionEvent obtain = android.view.MotionEvent.obtain(motionEvent);
        kotlin.jvm.internal.o.f(obtain, "obtain(...)");
        obtain.offsetLocation(getScrollX() - view.getLeft(), getScrollY() - view.getTop());
        boolean dispatchTouchEvent2 = view.dispatchTouchEvent(obtain);
        obtain.recycle();
        return dispatchTouchEvent2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        java.util.Set set;
        boolean z17;
        java.util.Objects.toString(motionEvent);
        if (!this.f176114e) {
            return super.dispatchTouchEvent(motionEvent);
        }
        int childCount = getChildCount() - 1;
        boolean z18 = false;
        while (true) {
            set = this.f176113d;
            if (-1 >= childCount || z18) {
                break;
            }
            android.view.View childAt = getChildAt(childCount);
            if (childAt != null && motionEvent != null) {
                float x17 = (motionEvent.getX() + getScrollX()) - childAt.getLeft();
                float y17 = (motionEvent.getY() + getScrollY()) - childAt.getTop();
                if (childAt.getVisibility() == 0 && x17 >= 0.0f && x17 < childAt.getRight() - childAt.getLeft() && y17 >= 0.0f && y17 < childAt.getBottom() - childAt.getTop()) {
                    z17 = true;
                    if (z17 && set.contains(java.lang.Integer.valueOf(childAt.getId()))) {
                        kotlin.jvm.internal.o.d(motionEvent);
                        z18 = a(motionEvent, false, childAt);
                    }
                    childCount--;
                }
            }
            z17 = false;
            if (z17) {
                kotlin.jvm.internal.o.d(motionEvent);
                z18 = a(motionEvent, false, childAt);
            }
            childCount--;
        }
        for (int childCount2 = getChildCount() - 1; -1 < childCount2 && !z18; childCount2--) {
            android.view.View childAt2 = getChildAt(childCount2);
            if (childAt2 != null && motionEvent != null && childAt2.getVisibility() == 0 && !set.contains(java.lang.Integer.valueOf(childAt2.getId()))) {
                z18 = a(motionEvent, false, childAt2);
            }
        }
        return z18;
    }

    public final void setEditorItemFirstTouch(boolean z17) {
        this.f176114e = z17;
    }

    public CropOperationContainer(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f176113d = kz5.z.D0(new java.lang.Integer[]{java.lang.Integer.valueOf(com.tencent.mm.R.id.oyw), java.lang.Integer.valueOf(com.tencent.mm.R.id.f486311kv5)});
    }
}
