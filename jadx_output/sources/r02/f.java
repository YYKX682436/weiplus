package r02;

/* loaded from: classes8.dex */
public class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader_app.ui.DeleteTaskFooterView f368297d;

    public f(com.tencent.mm.plugin.downloader_app.ui.DeleteTaskFooterView deleteTaskFooterView) {
        this.f368297d = deleteTaskFooterView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/downloader_app/ui/DeleteTaskFooterView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.downloader_app.ui.DeleteTaskFooterView.f97362o;
        this.f368297d.getClass();
        java.util.Iterator it = com.tencent.mm.plugin.downloader_app.model.x.f97333b.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.downloader_app.ui.TaskListView taskListView = ((r02.v0) ((com.tencent.mm.plugin.downloader_app.model.q) it.next())).f368339a;
            db5.e1.A(taskListView.getContext(), taskListView.getContext().getString(com.tencent.mm.R.string.bos), "", taskListView.getContext().getString(com.tencent.mm.R.string.jq8), taskListView.getContext().getString(com.tencent.mm.R.string.jq7), new r02.b1(taskListView), new r02.s0(taskListView));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/downloader_app/ui/DeleteTaskFooterView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
