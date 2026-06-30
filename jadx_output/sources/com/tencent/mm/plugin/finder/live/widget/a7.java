package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class a7 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.d7 f117739d;

    public a7(com.tencent.mm.plugin.finder.live.widget.d7 d7Var) {
        this.f117739d = d7Var;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        android.view.ViewTreeObserver viewTreeObserver;
        com.tencent.mm.plugin.finder.live.widget.d7 d7Var = this.f117739d;
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = d7Var.f118084y0;
        if (wxRecyclerView != null && (viewTreeObserver = wxRecyclerView.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
        int i17 = ((mm2.c1) d7Var.H.a(mm2.c1.class)).Z6().f233875d;
        if (i17 < 0 || i17 >= ((mm2.c1) d7Var.H.a(mm2.c1.class)).Z6().f233877f.size()) {
            return;
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView2 = d7Var.f118084y0;
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = wxRecyclerView2 != null ? wxRecyclerView2.getLayoutManager() : null;
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(linearLayoutManager, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorMusicContentWidget$showMusicView$1", "onGlobalLayout", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            linearLayoutManager.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.f(linearLayoutManager, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorMusicContentWidget$showMusicView$1", "onGlobalLayout", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        }
    }
}
