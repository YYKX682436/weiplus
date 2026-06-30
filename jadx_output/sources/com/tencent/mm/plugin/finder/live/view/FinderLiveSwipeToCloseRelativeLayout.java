package com.tencent.mm.plugin.finder.live.view;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderLiveSwipeToCloseRelativeLayout;", "Lcom/tencent/mm/plugin/finder/live/view/FinderLiveInterceptTouchRelativeLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "style", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderLiveSwipeToCloseRelativeLayout extends com.tencent.mm.plugin.finder.live.view.FinderLiveInterceptTouchRelativeLayout {

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.SwipeBackLayout f116102e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.plugin.l f116103f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveSwipeToCloseRelativeLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        ae2.in inVar = ae2.in.f3688a;
        boolean z17 = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.C7).getValue()).r()).intValue() == 1;
        com.tencent.mm.plugin.finder.live.plugin.l lVar = this.f116103f;
        boolean g86 = lVar != null ? ((mm2.c1) lVar.P0(mm2.c1.class)).g8() : false;
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        boolean z18 = ((pl2.x) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(pl2.x.class)).f356683f;
        if (!z17 || g86 || z18) {
            return dispatchTouchEvent;
        }
        android.view.MotionEvent obtain = android.view.MotionEvent.obtain(motionEvent);
        if (obtain != null) {
            obtain.setLocation(obtain.getRawX(), obtain.getRawY());
        }
        com.tencent.mm.ui.widget.SwipeBackLayout swipeBackLayout = this.f116102e;
        if (swipeBackLayout != null ? swipeBackLayout.b(obtain) : false) {
            requestDisallowInterceptTouchEvent(true);
        }
        return true;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        android.view.Window window;
        android.view.View decorView;
        super.onFinishInflate();
        android.content.Context context = getContext();
        com.tencent.mm.ui.widget.SwipeBackLayout swipeBackLayout = null;
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null && (window = activity.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            swipeBackLayout = (com.tencent.mm.ui.widget.SwipeBackLayout) decorView.findViewById(com.tencent.mm.R.id.nsv);
        }
        this.f116102e = swipeBackLayout;
        java.util.Objects.toString(swipeBackLayout);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveSwipeToCloseRelativeLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
