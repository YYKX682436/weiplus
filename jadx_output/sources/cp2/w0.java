package cp2;

/* loaded from: classes2.dex */
public final class w0 extends androidx.recyclerview.widget.p2 {
    public w0(int i17) {
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        dp2.a aVar = dp2.a.f242183a;
        int dimensionPixelSize = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479672c9) / 2;
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams");
        if (!((androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) layoutParams).f11941i) {
            android.view.ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams2, "null cannot be cast to non-null type androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams");
            if (((androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) layoutParams2).e() % 2 == 0) {
                outRect.left = r10;
                outRect.right = dimensionPixelSize;
                outRect.bottom = dimensionPixelSize;
                outRect.top = dimensionPixelSize;
                return;
            }
            outRect.left = dimensionPixelSize;
            outRect.right = r10;
            outRect.bottom = dimensionPixelSize;
            outRect.top = dimensionPixelSize;
            return;
        }
        androidx.recyclerview.widget.k3 w07 = parent.w0(view);
        in5.s0 s0Var = w07 instanceof in5.s0 ? (in5.s0) w07 : null;
        int adapterPosition = s0Var != null ? s0Var.getAdapterPosition() : -1;
        in5.c cVar = s0Var != null ? (in5.c) s0Var.f293125i : null;
        in5.c cVar2 = cVar instanceof in5.c ? cVar : null;
        int dimensionPixelSize2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480431xq);
        if (!(cVar2 instanceof so2.h4)) {
            if ((cVar2 instanceof com.tencent.mm.plugin.finder.feed.ys) || (cVar2 instanceof vp2.d)) {
                outRect.left = r10;
                outRect.right = r10;
                outRect.bottom = dimensionPixelSize;
                outRect.top = dimensionPixelSize;
                return;
            }
            return;
        }
        r45.yw2 yw2Var = ((so2.h4) cVar2).f410400d;
        com.tencent.mars.xlog.Log.i("NearbyLiveViewCallback", "getItemOffsets divider:" + yw2Var.getInteger(2) + '-' + yw2Var.getLong(3) + '-' + yw2Var.getString(1));
        if (yw2Var.getInteger(2) == 6) {
            if (adapterPosition == 0) {
                outRect.left = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn) + 1;
                outRect.right = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn);
                outRect.bottom = dimensionPixelSize;
                outRect.top = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479646bl);
                return;
            }
            outRect.left = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn) + 1;
            outRect.right = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn);
            outRect.bottom = dimensionPixelSize;
            outRect.top = dimensionPixelSize2;
        }
    }
}
