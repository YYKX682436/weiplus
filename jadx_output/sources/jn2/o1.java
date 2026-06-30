package jn2;

/* loaded from: classes10.dex */
public final class o1 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jn2.r1 f300661d;

    public o1(jn2.r1 r1Var) {
        this.f300661d = r1Var;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        android.view.ViewTreeObserver viewTreeObserver;
        jn2.r1 r1Var = this.f300661d;
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = r1Var.V;
        if (wxRecyclerView != null && (viewTreeObserver = wxRecyclerView.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
        java.lang.Integer num = (java.lang.Integer) ((mm2.m6) r1Var.H.a(mm2.m6.class)).f329241f.f234052a.getValue();
        if (num == null) {
            num = -1;
        }
        int intValue = num.intValue();
        if (intValue < 0 || intValue >= ((mm2.m6) r1Var.H.a(mm2.m6.class)).f329241f.f234053b.size()) {
            return;
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView2 = r1Var.V;
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = wxRecyclerView2 != null ? wxRecyclerView2.getLayoutManager() : null;
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            arrayList.add(java.lang.Integer.valueOf(intValue));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(linearLayoutManager, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongListPanel$showMusicView$1", "onGlobalLayout", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            linearLayoutManager.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.f(linearLayoutManager, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongListPanel$showMusicView$1", "onGlobalLayout", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        }
    }
}
