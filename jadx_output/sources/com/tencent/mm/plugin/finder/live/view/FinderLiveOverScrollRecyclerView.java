package com.tencent.mm.plugin.finder.live.view;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u001cB\u001b\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018B#\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u0017\u0010\u001bJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R*\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR*\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\t\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\r¨\u0006\u001d"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderLiveOverScrollRecyclerView;", "Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "layout", "Ljz5/f0;", "setLayoutManager", "Lkotlin/Function0;", "", "p2", "Lyz5/a;", "getCanScrollListener", "()Lyz5/a;", "setCanScrollListener", "(Lyz5/a;)V", "canScrollListener", "q2", "getHasUnreadListener", "setHasUnreadListener", "hasUnreadListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "com/tencent/mm/plugin/finder/live/view/a8", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderLiveOverScrollRecyclerView extends com.tencent.mm.view.recyclerview.WxRecyclerView {

    /* renamed from: j2, reason: collision with root package name */
    public final int f116064j2;

    /* renamed from: k2, reason: collision with root package name */
    public float f116065k2;

    /* renamed from: l2, reason: collision with root package name */
    public int f116066l2;

    /* renamed from: m2, reason: collision with root package name */
    public androidx.recyclerview.widget.LinearLayoutManager f116067m2;

    /* renamed from: n2, reason: collision with root package name */
    public boolean f116068n2;

    /* renamed from: o2, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.view.a8 f116069o2;

    /* renamed from: p2, reason: collision with root package name and from kotlin metadata */
    public yz5.a canScrollListener;

    /* renamed from: q2, reason: collision with root package name and from kotlin metadata */
    public yz5.a hasUnreadListener;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FinderLiveOverScrollRecyclerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        boolean z17 = false;
        if (motionEvent != null && motionEvent.getAction() == 0) {
            z17 = true;
        }
        if (z17) {
            this.f116065k2 = motionEvent.getRawY();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final boolean g1() {
        yz5.a aVar = this.hasUnreadListener;
        if (aVar != null && ((java.lang.Boolean) aVar.invoke()).booleanValue()) {
            return false;
        }
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = this.f116067m2;
        java.lang.Integer valueOf = linearLayoutManager != null ? java.lang.Integer.valueOf(linearLayoutManager.x()) : null;
        androidx.recyclerview.widget.f2 adapter = getAdapter();
        return valueOf != null && valueOf.intValue() == (adapter != null ? adapter.getItemCount() : -1) - 1;
    }

    public final yz5.a getCanScrollListener() {
        return this.canScrollListener;
    }

    public final yz5.a getHasUnreadListener() {
        return this.hasUnreadListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        boolean z17 = false;
        if (motionEvent != null && motionEvent.getAction() == 0) {
            z17 = true;
        }
        if (z17) {
            this.f116065k2 = motionEvent.getRawY();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a2, code lost:
    
        if (r3 != 3) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000f, code lost:
    
        if (r3 != 3) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0079 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007a  */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r12) {
        /*
            Method dump skipped, instructions count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.view.FinderLiveOverScrollRecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setCanScrollListener(yz5.a aVar) {
        this.canScrollListener = aVar;
    }

    public final void setHasUnreadListener(yz5.a aVar) {
        this.hasUnreadListener = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setLayoutManager(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager) {
        super.setLayoutManager(layoutManager);
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = null;
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager2 = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager2 != null && linearLayoutManager2.getF123307r()) {
            linearLayoutManager = linearLayoutManager2;
        }
        this.f116067m2 = linearLayoutManager;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveOverScrollRecyclerView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f116064j2 = i65.a.b(getContext(), 64);
        this.f116069o2 = com.tencent.mm.plugin.finder.live.view.a8.f116180d;
        this.f116066l2 = android.view.ViewConfiguration.getTouchSlop();
        com.tencent.mars.xlog.Log.i("FinderLiveOverScrollRecyclerView", "init, touchSlop=" + this.f116066l2);
    }
}
