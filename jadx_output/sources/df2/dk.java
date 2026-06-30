package df2;

/* loaded from: classes3.dex */
public final class dk extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.recyclerview.WxRecyclerView f229985d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.pk f229986e;

    public dk(com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView, df2.pk pkVar) {
        this.f229985d = wxRecyclerView;
        this.f229986e = pkVar;
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        int u07 = parent.u0(view);
        androidx.recyclerview.widget.f2 adapter = parent.getAdapter();
        int itemCount = (adapter != null ? adapter.getItemCount() : 0) - 1;
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.f229985d;
        outRect.left = u07 == 0 ? ym5.x.a(wxRecyclerView.getContext(), 19.0f) : ym5.x.a(wxRecyclerView.getContext(), 5.0f);
        outRect.right = u07 == itemCount ? ym5.x.a(wxRecyclerView.getContext(), 19.0f) : ym5.x.a(wxRecyclerView.getContext(), 5.0f);
        if (zl2.q4.f473933a.E()) {
            com.tencent.mars.xlog.Log.i(this.f229986e.f231073m, "view:" + view + ",position:" + u07 + ",lastPosition:" + itemCount);
        }
    }
}
