package vk2;

/* loaded from: classes2.dex */
public final class d extends androidx.recyclerview.widget.p2 {
    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams");
        androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams layoutParams2 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) layoutParams;
        androidx.recyclerview.widget.k3 w07 = parent.w0(view);
        in5.s0 s0Var = w07 instanceof in5.s0 ? (in5.s0) w07 : null;
        int adapterPosition = s0Var != null ? s0Var.getAdapterPosition() : -1;
        if (layoutParams2.e() % 2 == 0) {
            outRect.left = 0;
            outRect.right = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv);
            outRect.bottom = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479704cz);
            outRect.top = adapterPosition == 0 ? com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv) : 0;
            return;
        }
        outRect.left = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv);
        outRect.right = 0;
        outRect.bottom = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479704cz);
        outRect.top = adapterPosition == 1 ? com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv) : 0;
    }
}
