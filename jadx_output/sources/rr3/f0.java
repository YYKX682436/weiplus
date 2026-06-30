package rr3;

/* loaded from: classes4.dex */
public final class f0 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.newbizinfo.auth.NewBizInfoRecordingUI f399185d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f399186e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f399187f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.ProgressBar f399188g;

    public f0(com.tencent.mm.plugin.profile.ui.newbizinfo.auth.NewBizInfoRecordingUI newBizInfoRecordingUI, androidx.recyclerview.widget.RecyclerView recyclerView, android.widget.TextView textView, android.widget.ProgressBar progressBar) {
        this.f399185d = newBizInfoRecordingUI;
        this.f399186e = recyclerView;
        this.f399187f = textView;
        this.f399188g = progressBar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        ym3.p pVar = ((ym3.o) obj).f463177a;
        com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList = this.f399185d.f154195e;
        if (mvvmList == null) {
            kotlin.jvm.internal.o.o("liveList");
            throw null;
        }
        java.util.ArrayList arrayList = mvvmList.f152065o;
        boolean z17 = true;
        if (!arrayList.isEmpty() && ((rr3.d) arrayList.get(0)).f399182e != 1) {
            z17 = false;
        }
        ym3.p pVar2 = ym3.p.f463181f;
        rr3.d0 d0Var = rr3.b0.f399177a;
        rr3.d0 d0Var2 = rr3.a0.f399172a;
        rr3.d0 d0Var3 = rr3.c0.f399180a;
        rr3.d0 d0Var4 = (pVar == pVar2 && z17) ? d0Var3 : ((pVar == ym3.p.f463180e || pVar == ym3.p.f463179d) && z17) ? d0Var : d0Var2;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f399186e;
        kotlin.jvm.internal.o.f(recyclerView, "$recyclerView");
        int i17 = kotlin.jvm.internal.o.b(d0Var4, d0Var2) ? 0 : 8;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(recyclerView, arrayList2.toArray(), "com/tencent/mm/plugin/profile/ui/newbizinfo/auth/NewBizInfoRecordingUI$onCreate$3", "onChanged", "(Lcom/tencent/mm/plugin/mvvmlist/datasource/MvvmListLoadData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        recyclerView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(recyclerView, "com/tencent/mm/plugin/profile/ui/newbizinfo/auth/NewBizInfoRecordingUI$onCreate$3", "onChanged", "(Lcom/tencent/mm/plugin/mvvmlist/datasource/MvvmListLoadData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.TextView noDataTips = this.f399187f;
        kotlin.jvm.internal.o.f(noDataTips, "$noDataTips");
        int i18 = kotlin.jvm.internal.o.b(d0Var4, d0Var3) ? 0 : 8;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(noDataTips, arrayList3.toArray(), "com/tencent/mm/plugin/profile/ui/newbizinfo/auth/NewBizInfoRecordingUI$onCreate$3", "onChanged", "(Lcom/tencent/mm/plugin/mvvmlist/datasource/MvvmListLoadData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        noDataTips.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(noDataTips, "com/tencent/mm/plugin/profile/ui/newbizinfo/auth/NewBizInfoRecordingUI$onCreate$3", "onChanged", "(Lcom/tencent/mm/plugin/mvvmlist/datasource/MvvmListLoadData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.ProgressBar initialProgressBar = this.f399188g;
        kotlin.jvm.internal.o.f(initialProgressBar, "$initialProgressBar");
        int i19 = kotlin.jvm.internal.o.b(d0Var4, d0Var) ? 0 : 8;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(java.lang.Integer.valueOf(i19));
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(initialProgressBar, arrayList4.toArray(), "com/tencent/mm/plugin/profile/ui/newbizinfo/auth/NewBizInfoRecordingUI$onCreate$3", "onChanged", "(Lcom/tencent/mm/plugin/mvvmlist/datasource/MvvmListLoadData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        initialProgressBar.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(initialProgressBar, "com/tencent/mm/plugin/profile/ui/newbizinfo/auth/NewBizInfoRecordingUI$onCreate$3", "onChanged", "(Lcom/tencent/mm/plugin/mvvmlist/datasource/MvvmListLoadData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
