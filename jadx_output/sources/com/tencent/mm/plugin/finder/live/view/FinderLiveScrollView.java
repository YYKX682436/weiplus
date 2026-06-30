package com.tencent.mm.plugin.finder.live.view;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderLiveScrollView;", "Landroid/widget/HorizontalScrollView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-base_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class FinderLiveScrollView extends android.widget.HorizontalScrollView {

    /* renamed from: d, reason: collision with root package name */
    public int f116092d;

    /* renamed from: e, reason: collision with root package name */
    public int f116093e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveScrollView(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.finder.view.sidebar.DraggableConstraintLayout draggableConstraintLayout;
        java.lang.Integer valueOf = motionEvent != null ? java.lang.Integer.valueOf(motionEvent.getAction()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            this.f116092d = (int) motionEvent.getX();
            this.f116093e = (int) motionEvent.getY();
            getParent().requestDisallowInterceptTouchEvent(true);
            com.tencent.mm.plugin.finder.view.sidebar.DraggableConstraintLayout draggableConstraintLayout2 = (com.tencent.mm.plugin.finder.view.sidebar.DraggableConstraintLayout) getRootView().findViewById(com.tencent.mm.R.id.mw9);
            if (draggableConstraintLayout2 != null) {
                draggableConstraintLayout2.setNeedIntercept(false);
            }
        } else if (valueOf != null && valueOf.intValue() == 2) {
            int x17 = (int) motionEvent.getX();
            int y17 = (int) motionEvent.getY();
            int abs = java.lang.Math.abs(x17 - this.f116092d);
            int abs2 = java.lang.Math.abs(y17 - this.f116093e);
            double atan2 = (180 * java.lang.Math.atan2(abs, abs2)) / 3.141592653589793d;
            com.tencent.mars.xlog.Log.i("FinderLiveScrollView", " angel: " + atan2 + " disX: " + abs + " disY: " + abs2);
            getParent().requestDisallowInterceptTouchEvent(atan2 >= 30.0d);
        } else {
            if ((valueOf != null && valueOf.intValue() == 1) || (valueOf != null && valueOf.intValue() == 3)) {
                r2 = true;
            }
            if (r2 && (draggableConstraintLayout = (com.tencent.mm.plugin.finder.view.sidebar.DraggableConstraintLayout) getRootView().findViewById(com.tencent.mm.R.id.mw9)) != null) {
                draggableConstraintLayout.setNeedIntercept(true);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveScrollView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveScrollView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
