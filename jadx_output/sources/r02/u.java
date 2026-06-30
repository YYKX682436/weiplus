package r02;

/* loaded from: classes8.dex */
public class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader_app.ui.DownloadMainUI f368337d;

    public u(com.tencent.mm.plugin.downloader_app.ui.DownloadMainUI downloadMainUI) {
        this.f368337d = downloadMainUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.downloader_app.ui.DownloadMainUI downloadMainUI = this.f368337d;
        if (!downloadMainUI.f97379n) {
            com.tencent.mm.ui.widget.snackbar.j.c(downloadMainUI.getString(com.tencent.mm.R.string.jq6), null, downloadMainUI, null, null);
        }
        com.tencent.mm.plugin.downloader_app.ui.TaskListView taskListView = downloadMainUI.f97372d;
        com.tencent.mm.plugin.downloader_app.model.n0 n0Var = downloadMainUI.f97377i;
        int indexOf = taskListView.f97418f2.f368324d.indexOf((com.tencent.mm.plugin.downloader_app.model.r0) ((java.util.HashMap) n0Var.f97307b).get(downloadMainUI.f97378m));
        if (indexOf < 0 || indexOf >= downloadMainUI.f97372d.getSize()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.DownloadMainUI", "error position < 0");
            return;
        }
        com.tencent.mm.plugin.downloader_app.ui.TaskListView taskListView2 = downloadMainUI.f97372d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(indexOf));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(taskListView2, arrayList.toArray(), "com/tencent/mm/plugin/downloader_app/ui/DownloadMainUI$9", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
        taskListView2.c1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(taskListView2, "com/tencent/mm/plugin/downloader_app/ui/DownloadMainUI$9", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
    }
}
