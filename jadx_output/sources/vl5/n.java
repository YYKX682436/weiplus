package vl5;

/* loaded from: classes15.dex */
public class n extends vl5.t {

    /* renamed from: p, reason: collision with root package name */
    public int f437942p;

    /* renamed from: q, reason: collision with root package name */
    public int f437943q;

    /* renamed from: r, reason: collision with root package name */
    public float f437944r;

    /* renamed from: s, reason: collision with root package name */
    public float f437945s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.sortlist.DragSortListView f437946t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.tencent.mm.ui.widget.sortlist.DragSortListView dragSortListView, float f17, int i17, vl5.e eVar) {
        super(dragSortListView, f17, i17, null);
        this.f437946t = dragSortListView;
    }

    @Override // vl5.t
    public void a() {
        int i17 = com.tencent.mm.ui.widget.sortlist.DragSortListView.I1;
        this.f437946t.n();
    }

    @Override // vl5.t
    public void b(float f17, float f18) {
        int c17 = c();
        com.tencent.mm.ui.widget.sortlist.DragSortListView dragSortListView = this.f437946t;
        int paddingLeft = dragSortListView.getPaddingLeft();
        android.graphics.Point point = dragSortListView.f212490e;
        float f19 = point.y - c17;
        float f27 = point.x - paddingLeft;
        float f28 = 1.0f - f18;
        if (f28 < java.lang.Math.abs(f19 / this.f437944r) || f28 < java.lang.Math.abs(f27 / this.f437945s)) {
            android.graphics.Point point2 = dragSortListView.f212490e;
            point2.y = c17 + ((int) (this.f437944r * f28));
            point2.x = dragSortListView.getPaddingLeft() + ((int) (this.f437945s * f28));
            dragSortListView.k(true);
        }
    }

    public final int c() {
        com.tencent.mm.ui.widget.sortlist.DragSortListView dragSortListView = this.f437946t;
        int firstVisiblePosition = dragSortListView.getFirstVisiblePosition();
        int dividerHeight = (dragSortListView.A + dragSortListView.getDividerHeight()) / 2;
        android.view.View childAt = dragSortListView.getChildAt(this.f437942p - firstVisiblePosition);
        if (childAt == null) {
            this.f437965n = true;
            return -1;
        }
        int i17 = this.f437942p;
        int i18 = this.f437943q;
        return i17 == i18 ? childAt.getTop() : i17 < i18 ? childAt.getTop() - dividerHeight : (childAt.getBottom() + dividerHeight) - dragSortListView.B;
    }

    public void d() {
        com.tencent.mm.ui.widget.sortlist.DragSortListView dragSortListView = this.f437946t;
        this.f437942p = dragSortListView.f212498o;
        this.f437943q = dragSortListView.f212504s;
        dragSortListView.f212515z = 2;
        this.f437944r = dragSortListView.f212490e.y - c();
        this.f437945s = dragSortListView.f212490e.x - dragSortListView.getPaddingLeft();
    }
}
