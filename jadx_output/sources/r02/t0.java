package r02;

/* loaded from: classes8.dex */
public class t0 implements com.tencent.mm.plugin.downloader_app.model.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader_app.ui.TaskListView f368336a;

    public t0(com.tencent.mm.plugin.downloader_app.ui.TaskListView taskListView) {
        this.f368336a = taskListView;
    }

    public void a(int i17, long j17) {
        h02.a c17 = com.tencent.mm.plugin.downloader.model.m0.c(j17);
        if (c17 != null) {
            java.lang.String str = c17.field_appId;
            com.tencent.mm.plugin.downloader_app.ui.TaskListView taskListView = this.f368336a;
            java.util.HashMap hashMap = (java.util.HashMap) taskListView.f97419g2;
            if (!hashMap.containsKey(str)) {
                com.tencent.mm.plugin.downloader_app.model.s0.d();
                java.util.LinkedList linkedList = new java.util.LinkedList();
                linkedList.addAll(com.tencent.mm.plugin.downloader_app.model.s0.f97329a);
                if (linkedList.contains(str) && i17 == 1) {
                    r02.o oVar = (r02.o) taskListView.f97421i2;
                    oVar.getClass();
                    java.util.LinkedList c18 = com.tencent.mm.plugin.downloader_app.model.s0.c();
                    if (!c18.contains(str)) {
                        c18.add(str);
                    }
                    com.tencent.mm.plugin.downloader_app.ui.DownloadMainUI downloadMainUI = oVar.f368316a;
                    downloadMainUI.getClass();
                    com.tencent.mm.plugin.downloader_app.model.q0.b(c18, new r02.j(downloadMainUI, null));
                    return;
                }
                return;
            }
            com.tencent.mm.plugin.downloader_app.model.r0 r0Var = (com.tencent.mm.plugin.downloader_app.model.r0) hashMap.get(str);
            if (r0Var == null) {
                return;
            }
            if (!taskListView.f97422j2) {
                r0Var.f97312a = false;
            }
            if (i17 == 9) {
                r0Var.f97314c = 6;
                taskListView.m1(r0Var);
                return;
            }
            if (r0Var.f97314c == 6) {
                r0Var.f97314c = 2;
                taskListView.m1(r0Var);
                return;
            }
            androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = (androidx.recyclerview.widget.LinearLayoutManager) taskListView.getLayoutManager();
            int childCount = linearLayoutManager.getChildCount();
            for (int i18 = 0; i18 < childCount; i18++) {
                if (linearLayoutManager.getChildAt(i18) != null) {
                    android.view.View childAt = ((android.view.ViewGroup) linearLayoutManager.getChildAt(i18)).getChildAt(0);
                    if (childAt.getVisibility() == 0 && (childAt instanceof com.tencent.mm.plugin.downloader_app.ui.TaskItemView)) {
                        com.tencent.mm.plugin.downloader_app.ui.TaskItemView taskItemView = (com.tencent.mm.plugin.downloader_app.ui.TaskItemView) childAt;
                        com.tencent.mars.xlog.Log.i("MicroMsg.TaskItemView", "refreshDownloadStatus, event = %s, appId: %s", java.lang.Integer.valueOf(i17), str);
                        if (taskItemView.f97397d.getVisibility() != 0 && str.equals(taskItemView.B.f97317f) && com.tencent.mm.plugin.downloader.model.m0.d(taskItemView.B.f97317f) != null) {
                            if (i17 != 1 && i17 != 7) {
                                taskItemView.C = false;
                            }
                            taskItemView.c();
                        }
                    }
                }
            }
        }
    }
}
