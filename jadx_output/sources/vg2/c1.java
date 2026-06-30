package vg2;

/* loaded from: classes3.dex */
public final class c1 extends androidx.recyclerview.widget.p2 {
    public c1(vg2.r1 r1Var) {
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
        int b17 = ((androidx.recyclerview.widget.RecyclerView.LayoutParams) layoutParams).b();
        com.tencent.mars.xlog.Log.i("GiftSkinSelectPanelWidget", "getItemOffsets: pos: " + b17);
        outRect.left = b17 > 0 ? com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv) : 0;
        outRect.right = 0;
        outRect.bottom = 0;
        outRect.top = 0;
    }
}
