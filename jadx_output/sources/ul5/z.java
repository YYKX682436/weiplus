package ul5;

/* loaded from: classes15.dex */
public final class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.OverScroller f428667d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f428668e;

    /* renamed from: f, reason: collision with root package name */
    public int f428669f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.pulldown.NestedBounceView f428670g;

    public z(com.tencent.mm.ui.widget.pulldown.NestedBounceView nestedBounceView, android.widget.OverScroller mScroller, android.view.View target) {
        kotlin.jvm.internal.o.g(mScroller, "mScroller");
        kotlin.jvm.internal.o.g(target, "target");
        this.f428670g = nestedBounceView;
        this.f428667d = mScroller;
        this.f428668e = target;
        this.f428669f = mScroller.getCurrY();
    }

    @Override // java.lang.Runnable
    public void run() {
        android.widget.OverScroller overScroller = this.f428667d;
        boolean computeScrollOffset = overScroller.computeScrollOffset();
        int currY = overScroller.getCurrY();
        int i17 = currY - this.f428669f;
        android.view.View view = this.f428668e;
        if ((view instanceof android.widget.AbsListView) || (view instanceof android.widget.ScrollView)) {
            if (ul5.y.f428666j) {
                overScroller.getCurrVelocity();
                ul5.c0.b(view);
                ul5.c0.a(view);
            }
            com.tencent.mm.ui.widget.pulldown.NestedBounceView nestedBounceView = this.f428670g;
            if (!computeScrollOffset) {
                nestedBounceView.j(view, 1);
                return;
            }
            if (i17 < 0 && ul5.c0.b(view)) {
                nestedBounceView.m(view, i17, 1, new int[2]);
            } else if (i17 > 0 && ul5.c0.a(view)) {
                nestedBounceView.m(view, i17, 1, new int[2]);
            }
            this.f428669f = currY;
            nestedBounceView.postOnAnimation(this);
        }
    }
}
