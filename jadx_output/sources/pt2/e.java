package pt2;

/* loaded from: classes2.dex */
public final class e extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final int f358246d;

    public e(com.tencent.mm.plugin.finder.search.ui.FinderMixSearchFeedFragment finderMixSearchFeedFragment, int i17) {
        this.f358246d = i17;
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        androidx.recyclerview.widget.k3 w07 = parent.w0(view);
        int i17 = this.f358246d;
        int i18 = (int) (i17 / 2.0f);
        outRect.top = i17;
        android.view.ViewGroup.LayoutParams layoutParams = w07.itemView.getLayoutParams();
        if (layoutParams == null || !(layoutParams instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams)) {
            outRect.left = i17;
            outRect.right = i17;
        } else if (((androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) layoutParams).e() == 0) {
            outRect.left = i17;
            outRect.right = i18;
        } else {
            outRect.left = i18;
            outRect.right = i17;
        }
    }
}
