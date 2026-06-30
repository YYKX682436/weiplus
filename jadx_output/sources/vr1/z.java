package vr1;

/* loaded from: classes14.dex */
public final class z implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vr1.o f439609d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vr1.b0 f439610e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.personalcenter.recentread.BizPCRecentReadUI f439611f;

    public z(vr1.o oVar, vr1.b0 b0Var, com.tencent.mm.plugin.brandservice.ui.personalcenter.recentread.BizPCRecentReadUI bizPCRecentReadUI) {
        this.f439609d = oVar;
        this.f439610e = b0Var;
        this.f439611f = bizPCRecentReadUI;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        vr1.t tVar = (vr1.t) obj;
        vr1.o oVar = this.f439609d;
        android.view.View view = oVar.f439584f;
        android.widget.ProgressBar progressBar = view != null ? (android.widget.ProgressBar) view.findViewById(com.tencent.mm.R.id.aly) : null;
        android.view.View view2 = oVar.f439584f;
        android.view.View findViewById = view2 != null ? view2.findViewById(com.tencent.mm.R.id.alx) : null;
        boolean b17 = kotlin.jvm.internal.o.b(tVar, vr1.r.f439596a);
        vr1.b0 b0Var = this.f439610e;
        if (b17) {
            com.tencent.mm.ui.widget.dialog.u3 u3Var = b0Var.f439547d;
            if (!(u3Var != null && u3Var.isShowing())) {
                com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(b0Var.getActivity(), "", b0Var.getString(com.tencent.mm.R.string.ggd), true, false, null);
                b0Var.f439547d = Q;
                if (Q != null) {
                    Q.show();
                }
            }
        } else {
            com.tencent.mm.ui.widget.dialog.u3 u3Var2 = b0Var.f439547d;
            if (u3Var2 != null) {
                u3Var2.dismiss();
            }
            b0Var.f439547d = null;
        }
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) b0Var.f439549f).getValue();
        kotlin.jvm.internal.o.f(textView, "<get-emptyWordTv>(...)");
        int i17 = kotlin.jvm.internal.o.b(tVar, vr1.s.f439597a) ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(textView, arrayList.toArray(), "com/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadStateUIC$initStateObserve$1", "onChanged", "(Lcom/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadStateUIC$FinalListState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        textView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(textView, "com/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadStateUIC$initStateObserve$1", "onChanged", "(Lcom/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadStateUIC$FinalListState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = (android.view.View) ((jz5.n) b0Var.f439550g).getValue();
        kotlin.jvm.internal.o.f(view3, "<get-hasClosedContainer>(...)");
        int i18 = kotlin.jvm.internal.o.b(tVar, vr1.p.f439594a) ? 0 : 8;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadStateUIC$initStateObserve$1", "onChanged", "(Lcom/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadStateUIC$FinalListState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadStateUIC$initStateObserve$1", "onChanged", "(Lcom/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadStateUIC$FinalListState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f439611f.showOptionMenu(!kotlin.jvm.internal.o.b(tVar, r12));
        if (!(tVar instanceof vr1.q)) {
            if (oVar.f439584f != null) {
                oVar.O6().g0(r1.hashCode(), false);
            }
            com.tencent.mm.view.recyclerview.WxRecyclerView recyclerView = oVar.getRecyclerView();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(recyclerView, arrayList3.toArray(), "com/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadStateUIC$initStateObserve$1", "onChanged", "(Lcom/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadStateUIC$FinalListState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            recyclerView.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(recyclerView, "com/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadStateUIC$initStateObserve$1", "onChanged", "(Lcom/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadStateUIC$FinalListState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView recyclerView2 = oVar.getRecyclerView();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(recyclerView2, arrayList4.toArray(), "com/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadStateUIC$initStateObserve$1", "onChanged", "(Lcom/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadStateUIC$FinalListState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        recyclerView2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(recyclerView2, "com/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadStateUIC$initStateObserve$1", "onChanged", "(Lcom/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadStateUIC$FinalListState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view4 = oVar.f439584f;
        if (view4 != null) {
            vr1.q qVar = (vr1.q) tVar;
            if (qVar.f439595a == vr1.u.f439598d) {
                oVar.O6().g0(view4.hashCode(), false);
                return;
            }
            oVar.O6().O(view4, -2, false);
            vr1.u uVar = qVar.f439595a;
            if (progressBar != null) {
                int i19 = uVar == vr1.u.f439599e ? 0 : 8;
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                arrayList5.add(java.lang.Integer.valueOf(i19));
                java.util.Collections.reverse(arrayList5);
                android.widget.ProgressBar progressBar2 = progressBar;
                yj0.a.d(progressBar2, arrayList5.toArray(), "com/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadStateUIC$initStateObserve$1", "onChanged", "(Lcom/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadStateUIC$FinalListState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                progressBar.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(progressBar2, "com/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadStateUIC$initStateObserve$1", "onChanged", "(Lcom/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadStateUIC$FinalListState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (findViewById != null) {
                int i27 = uVar == vr1.u.f439600f ? 0 : 8;
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                arrayList6.add(java.lang.Integer.valueOf(i27));
                java.util.Collections.reverse(arrayList6);
                android.view.View view5 = findViewById;
                yj0.a.d(view5, arrayList6.toArray(), "com/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadStateUIC$initStateObserve$1", "onChanged", "(Lcom/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadStateUIC$FinalListState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                yj0.a.f(view5, "com/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadStateUIC$initStateObserve$1", "onChanged", "(Lcom/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadStateUIC$FinalListState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }
}
