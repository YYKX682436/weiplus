package r02;

/* loaded from: classes8.dex */
public class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader_app.ui.DeleteTaskFooterView f368295d;

    public e(com.tencent.mm.plugin.downloader_app.ui.DeleteTaskFooterView deleteTaskFooterView) {
        this.f368295d = deleteTaskFooterView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/downloader_app/ui/DeleteTaskFooterView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.downloader_app.ui.DeleteTaskFooterView deleteTaskFooterView = this.f368295d;
        if (deleteTaskFooterView.f97369m) {
            deleteTaskFooterView.f97369m = false;
            l02.n.a(deleteTaskFooterView.f97364e, "checkbox_cell_off");
        } else {
            deleteTaskFooterView.f97369m = true;
            l02.n.a(deleteTaskFooterView.f97364e, "checkbox_cell_on");
        }
        if (deleteTaskFooterView.f97368i) {
            boolean z17 = deleteTaskFooterView.f97369m;
            java.util.Iterator it = com.tencent.mm.plugin.downloader_app.model.x.f97332a.iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.downloader_app.ui.TaskListView taskListView = ((r02.u0) ((com.tencent.mm.plugin.downloader_app.model.p) it.next())).f368338a;
                java.util.Iterator it6 = taskListView.f97418f2.f368324d.iterator();
                while (it6.hasNext()) {
                    com.tencent.mm.plugin.downloader_app.model.r0 r0Var = (com.tencent.mm.plugin.downloader_app.model.r0) it6.next();
                    int i17 = r0Var.f97314c;
                    if (i17 == 2 || i17 == 4 || i17 == 6) {
                        r0Var.f97313b = z17;
                    }
                }
                taskListView.f97418f2.notifyDataSetChanged();
                com.tencent.mm.plugin.downloader_app.model.x.b(z17);
            }
        }
        deleteTaskFooterView.f97368i = true;
        yj0.a.h(this, "com/tencent/mm/plugin/downloader_app/ui/DeleteTaskFooterView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
