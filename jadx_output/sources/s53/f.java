package s53;

/* loaded from: classes11.dex */
public final class f extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final int f403180d;

    public f(int i17) {
        this.f403180d = i17;
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        super.getItemOffsets(outRect, view, parent, state);
        androidx.recyclerview.widget.f2 adapter = parent.getAdapter();
        if (adapter instanceof vl1.g) {
            int u07 = parent.u0(view);
            vl1.g gVar = (vl1.g) adapter;
            if (((java.util.LinkedList) gVar.f437797g).size() > 0) {
                if (u07 == 0) {
                    return;
                }
                if (gVar.x() > 0 && u07 > gVar.getItemCount()) {
                    return;
                }
            }
            if (gVar.x() > 0 && u07 >= gVar.f437794d.getItemCount()) {
                return;
            }
        }
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        boolean z17 = layoutParams instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams;
        int i17 = this.f403180d;
        if (z17) {
            outRect.left = i17;
            if (((androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) layoutParams).e() == 0) {
                outRect.right = 0;
            } else {
                outRect.right = i17;
            }
        }
        outRect.bottom = i17;
    }
}
