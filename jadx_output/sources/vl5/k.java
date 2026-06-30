package vl5;

/* loaded from: classes15.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public boolean f437928d;

    /* renamed from: e, reason: collision with root package name */
    public long f437929e;

    /* renamed from: f, reason: collision with root package name */
    public long f437930f;

    /* renamed from: g, reason: collision with root package name */
    public int f437931g;

    /* renamed from: h, reason: collision with root package name */
    public int f437932h;

    /* renamed from: i, reason: collision with root package name */
    public float f437933i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f437934m = false;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.sortlist.DragSortListView f437935n;

    public k(com.tencent.mm.ui.widget.sortlist.DragSortListView dragSortListView) {
        this.f437935n = dragSortListView;
    }

    public void b(boolean z17) {
        if (!z17) {
            this.f437928d = true;
        } else {
            this.f437935n.removeCallbacks(this);
            this.f437934m = false;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f437928d) {
            this.f437934m = false;
            return;
        }
        com.tencent.mm.ui.widget.sortlist.DragSortListView dragSortListView = this.f437935n;
        int firstVisiblePosition = dragSortListView.getFirstVisiblePosition();
        int lastVisiblePosition = dragSortListView.getLastVisiblePosition();
        int count = dragSortListView.getCount();
        int paddingTop = dragSortListView.getPaddingTop();
        int height = (dragSortListView.getHeight() - paddingTop) - dragSortListView.getPaddingBottom();
        int min = java.lang.Math.min(dragSortListView.S, dragSortListView.f212492g + dragSortListView.C);
        int max = java.lang.Math.max(dragSortListView.S, dragSortListView.f212492g - dragSortListView.C);
        if (this.f437932h == 0) {
            android.view.View childAt = dragSortListView.getChildAt(0);
            if (childAt == null) {
                this.f437934m = false;
                return;
            } else if (firstVisiblePosition == 0 && childAt.getTop() == paddingTop) {
                this.f437934m = false;
                return;
            } else {
                this.f437933i = ((vl5.e) dragSortListView.Q).f437923a.P * ((dragSortListView.L - max) / dragSortListView.M);
            }
        } else {
            android.view.View childAt2 = dragSortListView.getChildAt(lastVisiblePosition - firstVisiblePosition);
            if (childAt2 == null) {
                this.f437934m = false;
                return;
            } else if (lastVisiblePosition == count - 1 && childAt2.getBottom() <= height + paddingTop) {
                this.f437934m = false;
                return;
            } else {
                this.f437933i = -(((vl5.e) dragSortListView.Q).f437923a.P * ((min - dragSortListView.K) / dragSortListView.N));
            }
        }
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        this.f437930f = uptimeMillis;
        int round = java.lang.Math.round(this.f437933i * ((float) (uptimeMillis - this.f437929e)));
        this.f437931g = round;
        if (round >= 0) {
            this.f437931g = java.lang.Math.min(height, round);
            lastVisiblePosition = firstVisiblePosition;
        } else {
            this.f437931g = java.lang.Math.max(-height, round);
        }
        android.view.View childAt3 = dragSortListView.getChildAt(lastVisiblePosition - firstVisiblePosition);
        int top = childAt3.getTop() + this.f437931g;
        if (lastVisiblePosition == 0 && top > paddingTop) {
            top = paddingTop;
        }
        dragSortListView.A1 = true;
        dragSortListView.setSelectionFromTop(lastVisiblePosition, top - paddingTop);
        dragSortListView.layoutChildren();
        dragSortListView.invalidate();
        dragSortListView.A1 = false;
        dragSortListView.j(lastVisiblePosition, childAt3, false);
        this.f437929e = this.f437930f;
        dragSortListView.post(this);
    }
}
