package k13;

/* loaded from: classes8.dex */
public final class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.forcenotify.ui.ForceNotifyListUI f303194d;

    public b0(com.tencent.mm.plugin.forcenotify.ui.ForceNotifyListUI forceNotifyListUI) {
        this.f303194d = forceNotifyListUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.forcenotify.ui.ForceNotifyListUI forceNotifyListUI = this.f303194d;
        if (!forceNotifyListUI.f137340i.isEmpty()) {
            androidx.recyclerview.widget.RecyclerView recyclerView = forceNotifyListUI.f137336e;
            kotlin.jvm.internal.o.d(recyclerView);
            recyclerView.setVisibility(0);
            k13.s sVar = forceNotifyListUI.f137337f;
            kotlin.jvm.internal.o.d(sVar);
            sVar.notifyDataSetChanged();
            return;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView2 = forceNotifyListUI.f137336e;
        kotlin.jvm.internal.o.d(recyclerView2);
        recyclerView2.setVisibility(8);
        android.view.View view = forceNotifyListUI.f137339h;
        kotlin.jvm.internal.o.d(view);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/forcenotify/ui/ForceNotifyListUI$onNotifyChange$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/forcenotify/ui/ForceNotifyListUI$onNotifyChange$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
