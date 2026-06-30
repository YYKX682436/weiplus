package ul5;

/* loaded from: classes15.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.OverScroller f428630d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f428631e;

    /* renamed from: f, reason: collision with root package name */
    public int f428632f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.pulldown.HorizontalNestedBounceView f428633g;

    public f(com.tencent.mm.ui.widget.pulldown.HorizontalNestedBounceView horizontalNestedBounceView, android.widget.OverScroller mScroller, android.view.View target) {
        kotlin.jvm.internal.o.g(mScroller, "mScroller");
        kotlin.jvm.internal.o.g(target, "target");
        this.f428633g = horizontalNestedBounceView;
        this.f428630d = mScroller;
        this.f428631e = target;
        this.f428632f = mScroller.getCurrX();
    }

    @Override // java.lang.Runnable
    public void run() {
        android.widget.OverScroller overScroller = this.f428630d;
        boolean computeScrollOffset = overScroller.computeScrollOffset();
        int currX = overScroller.getCurrX();
        int i17 = currX - this.f428632f;
        android.view.View view = this.f428631e;
        if ((view instanceof android.widget.AbsListView) || (view instanceof android.widget.ScrollView)) {
            if (ul5.y.f428666j) {
                overScroller.getCurrVelocity();
                ul5.c0.b(view);
                ul5.c0.a(view);
            }
            com.tencent.mm.ui.widget.pulldown.HorizontalNestedBounceView horizontalNestedBounceView = this.f428633g;
            if (!computeScrollOffset) {
                horizontalNestedBounceView.j(view, 1);
                return;
            }
            if (i17 < 0 && ul5.c0.b(view)) {
                horizontalNestedBounceView.g(view, i17, 1, new int[2]);
            } else if (i17 > 0 && ul5.c0.a(view)) {
                horizontalNestedBounceView.g(view, i17, 1, new int[2]);
            }
            this.f428632f = currX;
            horizontalNestedBounceView.postOnAnimation(this);
        }
    }
}
