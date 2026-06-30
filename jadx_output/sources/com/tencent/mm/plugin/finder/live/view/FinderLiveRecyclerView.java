package com.tencent.mm.plugin.finder.live.view;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB#\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\rJ\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002¨\u0006\u000e"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderLiveRecyclerView;", "Lcom/tencent/mm/plugin/finder/event/recyclerview/FinderRecyclerView;", "Ln3/i0;", "Landroid/graphics/Rect;", "getCommentRectOnScreen", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderLiveRecyclerView extends com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView implements n3.i0 {
    public boolean A2;
    public boolean B2;

    /* renamed from: w2, reason: collision with root package name */
    public final java.lang.String f116088w2;

    /* renamed from: x2, reason: collision with root package name */
    public android.view.View f116089x2;

    /* renamed from: y2, reason: collision with root package name */
    public android.graphics.Rect f116090y2;

    /* renamed from: z2, reason: collision with root package name */
    public boolean f116091z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveRecyclerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f116088w2 = "Finder.FinderLiveRecyclerView";
    }

    private final android.graphics.Rect getCommentRectOnScreen() {
        return ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Kj();
    }

    @Override // com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView, com.tencent.mm.view.recyclerview.WxRecyclerView, androidx.recyclerview.widget.RecyclerView
    public void a1(int i17) {
        com.tencent.mars.xlog.Log.i(this.f116088w2, "scrollToPosition " + i17);
        super.a1(i17);
    }

    @Override // com.tencent.mm.view.recyclerview.WxRecyclerView, androidx.recyclerview.widget.RecyclerView
    public void b1(int i17, int i18, android.view.animation.Interpolator interpolator) {
        com.tencent.mars.xlog.Log.i(this.f116088w2, "smoothScrollBy");
        super.b1(i17, i18, interpolator);
    }

    @Override // com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView, com.tencent.mm.view.recyclerview.WxRecyclerView, androidx.recyclerview.widget.RecyclerView
    public void c1(int i17) {
        com.tencent.mars.xlog.Log.i(this.f116088w2, "smoothScrollToPosition");
        super.c1(i17);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean dispatchNestedPreScroll(int i17, int i18, int[] iArr, int[] iArr2) {
        android.view.View view = this.f116089x2;
        if (view != null) {
            kotlin.jvm.internal.o.d(view);
            if (view.getId() == com.tencent.mm.R.id.ev9) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x008b, code lost:
    
        if (r6.f116089x2 != null) goto L50;
     */
    @Override // com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean dispatchTouchEvent(android.view.MotionEvent r7) {
        /*
            Method dump skipped, instructions count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.view.FinderLiveRecyclerView.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        return !this.A2 && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(android.view.View target, int i17, int i18, int i19, int i27) {
        kotlin.jvm.internal.o.g(target, "target");
        com.tencent.mars.xlog.Log.i(this.f116088w2, "onNestedScroll");
        if (target != this.f116089x2 || this.f116091z2 || i18 == 0) {
            return;
        }
        this.f116091z2 = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(android.view.View child, android.view.View target, int i17) {
        kotlin.jvm.internal.o.g(child, "child");
        kotlin.jvm.internal.o.g(target, "target");
        com.tencent.mars.xlog.Log.i(this.f116088w2, "onNestedScrollAccepted");
        if ((i17 & 2) != 0) {
            this.f116089x2 = target;
            this.f116091z2 = false;
        }
        super.onNestedScrollAccepted(child, target, i17);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(android.view.View child, android.view.View target, int i17) {
        kotlin.jvm.internal.o.g(child, "child");
        kotlin.jvm.internal.o.g(target, "target");
        return (i17 & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(android.view.View child) {
        kotlin.jvm.internal.o.g(child, "child");
        com.tencent.mars.xlog.Log.i(this.f116088w2, "onStopNestedScroll");
        this.f116089x2 = null;
        this.f116091z2 = false;
    }

    @Override // com.tencent.mm.view.recyclerview.WxRecyclerView, androidx.recyclerview.widget.RecyclerView, android.view.View
    public void scrollBy(int i17, int i18) {
        com.tencent.mars.xlog.Log.i(this.f116088w2, "scrollBy");
        super.scrollBy(i17, i18);
    }

    @Override // com.tencent.mm.view.recyclerview.WxRecyclerView, androidx.recyclerview.widget.RecyclerView, android.view.View
    public void scrollTo(int i17, int i18) {
        com.tencent.mars.xlog.Log.i(this.f116088w2, "scrollTo");
        super.scrollTo(i17, i18);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void smoothScrollBy(int i17, int i18) {
        com.tencent.mars.xlog.Log.i(this.f116088w2, "smoothScrollBy");
        b1(i17, i18, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveRecyclerView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f116088w2 = "Finder.FinderLiveRecyclerView";
    }
}
