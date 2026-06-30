package ed5;

/* loaded from: classes2.dex */
public final class o extends androidx.recyclerview.widget.p2 {
    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        int u07;
        androidx.recyclerview.widget.f2 adapter;
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams layoutParams2 = layoutParams instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams ? (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) layoutParams : null;
        if (layoutParams2 == null || (u07 = parent.u0(view)) == -1 || (adapter = parent.getAdapter()) == null) {
            return;
        }
        int itemViewType = adapter.getItemViewType(u07);
        int dimension = (int) view.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479704cz);
        if (itemViewType == -1 || itemViewType == 0) {
            if (itemViewType == 0) {
                boolean z17 = true;
                int i17 = u07 - 1;
                while (true) {
                    if (-1 >= i17) {
                        z17 = false;
                        break;
                    } else if (adapter.getItemViewType(i17) == 0) {
                        break;
                    } else {
                        i17--;
                    }
                }
                if (z17) {
                    outRect.set(0, dimension, 0, 0);
                    return;
                }
            }
            outRect.set(0, 0, 0, 0);
            return;
        }
        int dimension2 = (int) view.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479738dv);
        int dimension3 = (int) view.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479646bl);
        if (layoutParams2.f11941i) {
            outRect.set(0, 0, 0, 0);
            return;
        }
        if (layoutParams2.e() % 2 == 0) {
            outRect.left = dimension2;
            outRect.right = dimension3;
            outRect.bottom = dimension3;
            outRect.top = dimension3;
            return;
        }
        outRect.left = dimension3;
        outRect.right = dimension2;
        outRect.bottom = dimension3;
        outRect.top = dimension3;
    }
}
