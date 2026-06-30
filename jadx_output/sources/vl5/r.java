package vl5;

/* loaded from: classes15.dex */
public class r extends vl5.t {

    /* renamed from: p, reason: collision with root package name */
    public float f437950p;

    /* renamed from: q, reason: collision with root package name */
    public float f437951q;

    /* renamed from: r, reason: collision with root package name */
    public float f437952r;

    /* renamed from: s, reason: collision with root package name */
    public int f437953s;

    /* renamed from: t, reason: collision with root package name */
    public int f437954t;

    /* renamed from: u, reason: collision with root package name */
    public int f437955u;

    /* renamed from: v, reason: collision with root package name */
    public int f437956v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.sortlist.DragSortListView f437957w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.tencent.mm.ui.widget.sortlist.DragSortListView dragSortListView, float f17, int i17, vl5.e eVar) {
        super(dragSortListView, f17, i17, null);
        this.f437957w = dragSortListView;
        this.f437953s = -1;
        this.f437954t = -1;
    }

    @Override // vl5.t
    public void a() {
        com.tencent.mm.ui.widget.sortlist.DragSortListView dragSortListView = this.f437957w;
        dragSortListView.l(dragSortListView.f212504s - dragSortListView.getHeaderViewsCount());
    }

    @Override // vl5.t
    public void b(float f17, float f18) {
        android.view.View childAt;
        float f19 = 1.0f - f18;
        com.tencent.mm.ui.widget.sortlist.DragSortListView dragSortListView = this.f437957w;
        int firstVisiblePosition = dragSortListView.getFirstVisiblePosition();
        android.view.View childAt2 = dragSortListView.getChildAt(this.f437955u - firstVisiblePosition);
        if (dragSortListView.F1) {
            float uptimeMillis = ((float) (android.os.SystemClock.uptimeMillis() - this.f437958d)) / 1000.0f;
            if (uptimeMillis == 0.0f) {
                return;
            }
            float f27 = dragSortListView.G1 * uptimeMillis;
            int width = dragSortListView.getWidth();
            float f28 = dragSortListView.G1;
            float f29 = (f28 > 0.0f ? 1 : -1) * uptimeMillis;
            float f37 = width;
            dragSortListView.G1 = f28 + (f29 * f37);
            float f38 = this.f437950p + f27;
            this.f437950p = f38;
            dragSortListView.f212490e.x = (int) f38;
            if (f38 < f37 && f38 > (-width)) {
                this.f437958d = android.os.SystemClock.uptimeMillis();
                dragSortListView.k(true);
                return;
            }
        }
        if (childAt2 != null) {
            if (this.f437953s == -1) {
                this.f437953s = dragSortListView.p(this.f437955u, childAt2, false);
                this.f437951q = childAt2.getHeight() - this.f437953s;
            }
            int max = java.lang.Math.max((int) (this.f437951q * f19), 1);
            android.view.ViewGroup.LayoutParams layoutParams = childAt2.getLayoutParams();
            layoutParams.height = this.f437953s + max;
            childAt2.setLayoutParams(layoutParams);
        }
        int i17 = this.f437956v;
        if (i17 == this.f437955u || (childAt = dragSortListView.getChildAt(i17 - firstVisiblePosition)) == null) {
            return;
        }
        if (this.f437954t == -1) {
            this.f437954t = dragSortListView.p(this.f437956v, childAt, false);
            this.f437952r = childAt.getHeight() - this.f437954t;
        }
        int max2 = java.lang.Math.max((int) (f19 * this.f437952r), 1);
        android.view.ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
        layoutParams2.height = this.f437954t + max2;
        childAt.setLayoutParams(layoutParams2);
    }

    public void c() {
        this.f437953s = -1;
        this.f437954t = -1;
        com.tencent.mm.ui.widget.sortlist.DragSortListView dragSortListView = this.f437957w;
        this.f437955u = dragSortListView.f212499p;
        this.f437956v = dragSortListView.f212502q;
        dragSortListView.f212515z = 1;
        this.f437950p = dragSortListView.f212490e.x;
        if (!dragSortListView.F1) {
            dragSortListView.h();
            return;
        }
        float width = dragSortListView.getWidth() * 2.0f;
        float f17 = dragSortListView.G1;
        if (f17 == 0.0f) {
            dragSortListView.G1 = (this.f437950p >= 0.0f ? 1 : -1) * width;
            return;
        }
        float f18 = width * 2.0f;
        if (f17 < 0.0f) {
            float f19 = -f18;
            if (f17 > f19) {
                dragSortListView.G1 = f19;
                return;
            }
        }
        if (f17 <= 0.0f || f17 >= f18) {
            return;
        }
        dragSortListView.G1 = f18;
    }
}
