package r02;

/* loaded from: classes.dex */
public class c1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader_app.ui.TaskManagerHeaderView f368292d;

    public c1(com.tencent.mm.plugin.downloader_app.ui.TaskManagerHeaderView taskManagerHeaderView) {
        this.f368292d = taskManagerHeaderView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/downloader_app/ui/TaskManagerHeaderView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.downloader_app.ui.TaskManagerHeaderView taskManagerHeaderView = this.f368292d;
        if (taskManagerHeaderView.getContext() instanceof com.tencent.mm.plugin.downloader_app.ui.DownloadMainUI) {
            ((com.tencent.mm.plugin.downloader_app.ui.DownloadMainUI) taskManagerHeaderView.getContext()).f97372d.l1();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/downloader_app/ui/TaskManagerHeaderView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
