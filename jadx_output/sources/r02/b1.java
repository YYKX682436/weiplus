package r02;

/* loaded from: classes8.dex */
public class b1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader_app.ui.TaskListView f368289d;

    public b1(com.tencent.mm.plugin.downloader_app.ui.TaskListView taskListView) {
        this.f368289d = taskListView;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.downloader_app.ui.TaskListView taskListView = this.f368289d;
        taskListView.getClass();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = taskListView.f97418f2.f368324d.iterator();
        while (true) {
            int i18 = 0;
            if (!it.hasNext()) {
                break;
            }
            com.tencent.mm.plugin.downloader_app.model.r0 r0Var = (com.tencent.mm.plugin.downloader_app.model.r0) it.next();
            if (r0Var.f97313b) {
                linkedList.add(r0Var);
                com.tencent.mm.plugin.downloader_app.model.s0.e(r0Var.f97317f);
                com.tencent.mm.plugin.downloader_app.model.o.e(com.tencent.mm.plugin.downloader.model.m0.d(r0Var.f97317f), r0Var);
                int i19 = r0Var.f97314c;
                if (i19 == 2) {
                    i18 = 1101;
                } else if (i19 == 4) {
                    i18 = 1102;
                } else if (i19 == 6) {
                    i18 = 1103;
                }
                o02.a.b(11, i18, r0Var.f97315d, 81, r0Var.f97317f, "", "");
            }
        }
        if (linkedList.size() != 0) {
            taskListView.f97418f2.x(linkedList);
            if (taskListView.f97418f2.f368324d.size() <= 5) {
                taskListView.l1();
            }
        }
        com.tencent.mm.plugin.downloader_app.model.x.b(false);
    }
}
