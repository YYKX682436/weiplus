package sp2;

/* loaded from: classes2.dex */
public final class c0 extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final int f410992d = com.tencent.mm.ui.zk.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 6);

    /* renamed from: e, reason: collision with root package name */
    public final int f410993e = com.tencent.mm.ui.zk.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 12);

    public c0(sp2.o2 o2Var) {
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        super.getItemOffsets(outRect, view, parent, state);
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams layoutParams2 = layoutParams instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams ? (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) layoutParams : null;
        if (layoutParams2 == null || layoutParams2.f11941i) {
            return;
        }
        boolean z17 = layoutParams2.e() == 0;
        int i17 = this.f410993e;
        int i18 = this.f410992d;
        outRect.left = z17 ? i17 : i18;
        if (z17) {
            i17 = i18;
        }
        outRect.right = i17;
        outRect.bottom = com.tencent.mm.ui.zk.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 12);
    }
}
