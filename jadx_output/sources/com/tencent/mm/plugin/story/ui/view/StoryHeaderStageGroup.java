package com.tencent.mm.plugin.story.ui.view;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015B\u001b\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0014\u0010\u0016J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R*\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/tencent/mm/plugin/story/ui/view/StoryHeaderStageGroup;", "Landroid/widget/RelativeLayout;", "Lpf4/z;", "adapter", "Ljz5/f0;", "setContentAdapter", "Lkotlin/Function0;", "o", "Lyz5/a;", "getOnDeleteClick", "()Lyz5/a;", "setOnDeleteClick", "(Lyz5/a;)V", "onDeleteClick", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "style", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-story_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class StoryHeaderStageGroup extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f171975d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f171976e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.Scroller f171977f;

    /* renamed from: g, reason: collision with root package name */
    public int f171978g;

    /* renamed from: h, reason: collision with root package name */
    public int f171979h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f171980i;

    /* renamed from: m, reason: collision with root package name */
    public float f171981m;

    /* renamed from: n, reason: collision with root package name */
    public float f171982n;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public yz5.a onDeleteClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoryHeaderStageGroup(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View.inflate(context, com.tencent.mm.R.layout.cwq, this);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.nbd);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) findViewById;
        this.f171975d = recyclerView;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.nbf);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f171976e = findViewById2;
        this.f171977f = new android.widget.Scroller(context);
        new oj5.a0(context);
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context, 0, false));
        findViewById2.setOnClickListener(new rf4.g1(this));
    }

    public final void a() {
        if (this.f171980i) {
            return;
        }
        this.f171980i = true;
        this.f171977f.startScroll(this.f171978g, 0, (this.f171976e.getMeasuredWidth() + com.tencent.mm.ui.zk.a(getContext(), 20)) - this.f171978g, 0);
        invalidate();
    }

    @Override // android.view.View
    public void computeScroll() {
        android.widget.Scroller scroller = this.f171977f;
        if (scroller.computeScrollOffset()) {
            scroller.getCurrX();
            scroller.getCurrY();
            this.f171978g = scroller.getCurrX();
            scrollTo(scroller.getCurrX(), 0);
            invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        java.lang.Integer valueOf = motionEvent != null ? java.lang.Integer.valueOf(motionEvent.getActionMasked()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            this.f171981m = motionEvent.getX();
            this.f171982n = motionEvent.getY();
        } else {
            boolean z17 = true;
            if (valueOf == null || valueOf.intValue() != 2) {
                if ((valueOf == null || valueOf.intValue() != 1) && (valueOf == null || valueOf.intValue() != 3)) {
                    z17 = false;
                }
                if (z17) {
                    this.f171981m = 0.0f;
                    this.f171982n = 0.0f;
                }
            } else if (java.lang.Math.abs(motionEvent.getX() - this.f171981m) > java.lang.Math.abs(motionEvent.getY() - this.f171982n)) {
                requestDisallowInterceptTouchEvent(true);
            }
        }
        return dispatchTouchEvent;
    }

    public final yz5.a getOnDeleteClick() {
        return this.onDeleteClick;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(android.view.View target, float f17, float f18) {
        kotlin.jvm.internal.o.g(target, "target");
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f171975d;
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        androidx.recyclerview.widget.f2 adapter = recyclerView.getAdapter();
        if (layoutManager != null && adapter != null) {
            if (f17 > 0.0f) {
                if (((androidx.recyclerview.widget.LinearLayoutManager) layoutManager).x() == adapter.getItemCount() - 1) {
                    a();
                }
            } else if (f17 < 0.0f && getScrollX() != 0 && !this.f171980i) {
                this.f171980i = true;
                android.widget.Scroller scroller = this.f171977f;
                int i17 = this.f171978g;
                scroller.startScroll(i17, 0, 0 - i17, 0);
                invalidate();
            }
        }
        return super.onNestedPreFling(target, f17, f18);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(android.view.View target, int i17, int i18, int[] consumed) {
        kotlin.jvm.internal.o.g(target, "target");
        kotlin.jvm.internal.o.g(consumed, "consumed");
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f171975d;
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        androidx.recyclerview.widget.f2 adapter = recyclerView.getAdapter();
        if (layoutManager == null || adapter == null) {
            return;
        }
        if (i17 > 0) {
            if (((androidx.recyclerview.widget.LinearLayoutManager) layoutManager).x() == adapter.getItemCount() - 1) {
                int min = java.lang.Math.min(this.f171978g + i17, this.f171976e.getMeasuredWidth() + com.tencent.mm.ui.zk.a(getContext(), 20));
                this.f171978g = min;
                scrollTo(min, 0);
                consumed[0] = i17;
            }
        } else if (i17 < 0 && getScrollX() != 0) {
            int max = java.lang.Math.max(this.f171978g + i17, 0);
            this.f171978g = max;
            scrollTo(max, 0);
            consumed[0] = i17;
        }
        this.f171979h = i17;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(android.view.View child, android.view.View target, int i17) {
        kotlin.jvm.internal.o.g(child, "child");
        kotlin.jvm.internal.o.g(target, "target");
        this.f171979h = 0;
        this.f171980i = false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(android.view.View child, android.view.View target, int i17) {
        kotlin.jvm.internal.o.g(child, "child");
        kotlin.jvm.internal.o.g(target, "target");
        return (i17 & 1) != 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(android.view.View child) {
        kotlin.jvm.internal.o.g(child, "child");
        int i17 = this.f171978g;
        if (i17 != 0) {
            int i18 = this.f171979h;
            if (i18 > 0) {
                a();
            } else if (i18 < 0 && !this.f171980i) {
                this.f171980i = true;
                this.f171977f.startScroll(i17, 0, 0 - i17, 0);
                invalidate();
            }
        }
        this.f171979h = 0;
        this.f171980i = false;
    }

    public final void setContentAdapter(pf4.z adapter) {
        kotlin.jvm.internal.o.g(adapter, "adapter");
        throw null;
    }

    public final void setOnDeleteClick(yz5.a aVar) {
        this.onDeleteClick = aVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StoryHeaderStageGroup(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
