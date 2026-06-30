package dv2;

/* loaded from: classes2.dex */
public final class u0 extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final int f243952d;

    /* renamed from: e, reason: collision with root package name */
    public final int f243953e;

    /* renamed from: f, reason: collision with root package name */
    public final int f243954f;

    /* renamed from: g, reason: collision with root package name */
    public final int f243955g;

    public u0(android.content.Context context) {
        int i17 = com.tencent.mm.ui.bh.a(context).f197135a;
        this.f243952d = i17;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.ajy);
        this.f243953e = dimensionPixelSize;
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479727dj);
        this.f243954f = dimensionPixelSize2;
        this.f243955g = ((i17 - dimensionPixelSize) - (dimensionPixelSize2 * 2)) / 2;
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        super.getItemOffsets(outRect, view, parent, state);
        int u07 = parent.u0(view);
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = parent.getLayoutManager();
        int itemCount = layoutManager != null ? layoutManager.getItemCount() : 0;
        int i17 = this.f243954f;
        int i18 = this.f243953e;
        int i19 = this.f243952d;
        int i27 = this.f243955g;
        outRect.set(u07 == 0 ? ((i19 - i18) - i27) - i17 : i27 / 2, 0, u07 == itemCount + (-1) ? ((i19 - i18) - i27) - i17 : i27 / 2, 0);
    }
}
