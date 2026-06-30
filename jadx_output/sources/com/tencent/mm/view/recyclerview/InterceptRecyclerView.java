package com.tencent.mm.view.recyclerview;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0013\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001d"}, d2 = {"Lcom/tencent/mm/view/recyclerview/InterceptRecyclerView;", "Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "Landroid/view/View;", "j2", "Landroid/view/View;", "getInterceptChildView", "()Landroid/view/View;", "setInterceptChildView", "(Landroid/view/View;)V", "interceptChildView", "Landroid/graphics/Rect;", "k2", "Landroid/graphics/Rect;", "getRect", "()Landroid/graphics/Rect;", "rect", "", "l2", "Z", "isCurIntercept", "()Z", "setCurIntercept", "(Z)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class InterceptRecyclerView extends com.tencent.mm.view.recyclerview.WxRecyclerView {

    /* renamed from: j2, reason: collision with root package name and from kotlin metadata */
    public android.view.View interceptChildView;

    /* renamed from: k2, reason: collision with root package name and from kotlin metadata */
    public final android.graphics.Rect rect;

    /* renamed from: l2, reason: collision with root package name and from kotlin metadata */
    public boolean isCurIntercept;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterceptRecyclerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.rect = new android.graphics.Rect();
    }

    public final android.view.View getInterceptChildView() {
        return this.interceptChildView;
    }

    public final android.graphics.Rect getRect() {
        return this.rect;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent e17) {
        kotlin.jvm.internal.o.g(e17, "e");
        if (e17.getAction() == 0) {
            this.isCurIntercept = false;
            android.view.View view = this.interceptChildView;
            if (view != null) {
                if (view.getVisibility() == 0) {
                    android.graphics.Rect rect = this.rect;
                    view.getGlobalVisibleRect(rect);
                    if (rect.contains((int) e17.getRawX(), (int) e17.getRawY())) {
                        this.isCurIntercept = true;
                        return false;
                    }
                }
            }
        }
        if (this.isCurIntercept) {
            requestDisallowInterceptTouchEvent(true);
            return false;
        }
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(e17);
        if (com.tencent.mars.xlog.Log.isDebug()) {
            android.view.MotionEvent.actionToString(e17.getAction());
        }
        return onInterceptTouchEvent;
    }

    public final void setCurIntercept(boolean z17) {
        this.isCurIntercept = z17;
    }

    public final void setInterceptChildView(android.view.View view) {
        this.interceptChildView = view;
    }
}
