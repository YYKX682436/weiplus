package jn2;

/* loaded from: classes8.dex */
public final class i1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jn2.r1 f300631d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(jn2.r1 r1Var) {
        super(1);
        this.f300631d = r1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        jn2.z1 z1Var;
        int intValue = ((java.lang.Number) obj).intValue();
        jn2.r1 r1Var = this.f300631d;
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = r1Var.V;
        if (wxRecyclerView != null && (z1Var = r1Var.f300686x0) != null && intValue >= 0 && intValue < z1Var.getItemCount()) {
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = wxRecyclerView.getLayoutManager();
            androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager != null) {
                if (linearLayoutManager.w() <= intValue && intValue <= linearLayoutManager.y()) {
                    wxRecyclerView.post(new jn2.m1(z1Var, intValue));
                } else {
                    wxRecyclerView.i(new jn2.n1(z1Var, intValue));
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(java.lang.Integer.valueOf(intValue));
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(wxRecyclerView, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongListPanel", "scrollToPositionAndHighlight", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
                    wxRecyclerView.c1(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(wxRecyclerView, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongListPanel", "scrollToPositionAndHighlight", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
