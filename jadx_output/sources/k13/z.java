package k13;

/* loaded from: classes8.dex */
public final class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.forcenotify.ui.ForceNotifyListUI f303288d;

    public z(com.tencent.mm.plugin.forcenotify.ui.ForceNotifyListUI forceNotifyListUI) {
        this.f303288d = forceNotifyListUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.forcenotify.ui.ForceNotifyListUI forceNotifyListUI = this.f303288d;
        com.tencent.mars.xlog.Log.i(forceNotifyListUI.f137335d, "[onCreate] load size=" + forceNotifyListUI.f137340i.size());
        k13.s sVar = forceNotifyListUI.f137337f;
        kotlin.jvm.internal.o.d(sVar);
        sVar.notifyDataSetChanged();
        android.view.View view = forceNotifyListUI.f137338g;
        kotlin.jvm.internal.o.d(view);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/forcenotify/ui/ForceNotifyListUI$onCreate$2$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/forcenotify/ui/ForceNotifyListUI$onCreate$2$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (!forceNotifyListUI.f137340i.isEmpty()) {
            androidx.recyclerview.widget.RecyclerView recyclerView = forceNotifyListUI.f137336e;
            kotlin.jvm.internal.o.d(recyclerView);
            recyclerView.setVisibility(0);
            return;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView2 = forceNotifyListUI.f137336e;
        kotlin.jvm.internal.o.d(recyclerView2);
        recyclerView2.setVisibility(8);
        android.view.View view2 = forceNotifyListUI.f137339h;
        kotlin.jvm.internal.o.d(view2);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/forcenotify/ui/ForceNotifyListUI$onCreate$2$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/forcenotify/ui/ForceNotifyListUI$onCreate$2$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
