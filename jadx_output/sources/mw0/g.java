package mw0;

/* loaded from: classes3.dex */
public final class g extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.movie_composing.panel.sticker.subviews.ReplaceStyleView f331682d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f331683e;

    public g(int i17, com.tencent.mm.mj_publisher.finder.movie_composing.panel.sticker.subviews.ReplaceStyleView replaceStyleView, int i18) {
        this.f331682d = replaceStyleView;
        this.f331683e = i18;
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        androidx.recyclerview.widget.f2 adapter = parent.getAdapter();
        if (adapter == null) {
            return;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(adapter.getItemCount() % 4);
        if (!(valueOf.intValue() > 0)) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : 4;
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
        if (((androidx.recyclerview.widget.RecyclerView.LayoutParams) layoutParams).a() >= adapter.getItemCount() - intValue) {
            yz5.a getPanelDiffHeight = this.f331682d.getGetPanelDiffHeight();
            outRect.bottom = ((int) (getPanelDiffHeight != null ? ((java.lang.Number) getPanelDiffHeight.invoke()).floatValue() : 0.0f)) + this.f331683e;
        }
    }
}
