package lo2;

/* loaded from: classes8.dex */
public final class m0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.member.ui.FinderMemberSearchUI f320156d;

    public m0(com.tencent.mm.plugin.finder.member.ui.FinderMemberSearchUI finderMemberSearchUI) {
        this.f320156d = finderMemberSearchUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView = this.f320156d.B;
        if (fTSSearchView == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        java.lang.String totalQuery = fTSSearchView.getFtsEditText().getTotalQuery();
        if (totalQuery == null || (str = r26.n0.u0(totalQuery).toString()) == null) {
            str = "";
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        com.tencent.mm.plugin.finder.member.ui.FinderMemberSearchUI finderMemberSearchUI = this.f320156d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str.hashCode());
        sb6.append('_');
        sb6.append(java.lang.System.currentTimeMillis());
        java.lang.String sb7 = sb6.toString();
        android.widget.FrameLayout frameLayout = finderMemberSearchUI.f121411v;
        if (frameLayout == null) {
            kotlin.jvm.internal.o.o("loadingLayout");
            throw null;
        }
        frameLayout.setVisibility(0);
        android.view.View view = finderMemberSearchUI.loadingView;
        if (view == null) {
            kotlin.jvm.internal.o.o("loadingView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/member/ui/FinderMemberSearchUI", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/member/ui/FinderMemberSearchUI", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = finderMemberSearchUI.nothingView;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("nothingView");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/member/ui/FinderMemberSearchUI", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/member/ui/FinderMemberSearchUI", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = finderMemberSearchUI.retryView;
        if (view3 == null) {
            kotlin.jvm.internal.o.o("retryView");
            throw null;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/member/ui/FinderMemberSearchUI", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/member/ui/FinderMemberSearchUI", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mars.xlog.Log.i("Finder.FinderMemberSearchUI", "requestInit CgiGetFinderSearchMemberZone " + str + ' ' + sb7);
        finderMemberSearchUI.A.clear();
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = finderMemberSearchUI.f121415z;
        if (wxRecyclerAdapter == null) {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
        wxRecyclerAdapter.notifyDataSetChanged();
        finderMemberSearchUI.F = null;
        finderMemberSearchUI.D = str;
        finderMemberSearchUI.E = sb7;
        finderMemberSearchUI.f7().E(false);
        kotlinx.coroutines.l.d(finderMemberSearchUI.getLifecycleAsyncScope(), null, null, new lo2.i0(finderMemberSearchUI, str, sb7, null), 3, null);
    }
}
