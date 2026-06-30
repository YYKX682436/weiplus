package r02;

/* loaded from: classes8.dex */
public class z0 implements vl1.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader_app.ui.TaskListView f368348a;

    public z0(com.tencent.mm.plugin.downloader_app.ui.TaskListView taskListView) {
        this.f368348a = taskListView;
    }

    @Override // vl1.o
    public boolean a(androidx.recyclerview.widget.RecyclerView recyclerView, android.view.View view, int i17, long j17) {
        m43.e eVar;
        com.tencent.mm.plugin.downloader_app.ui.TaskListView taskListView = this.f368348a;
        if (!taskListView.f97430r2) {
            return false;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
        if ((viewGroup.getChildAt(0) instanceof com.tencent.mm.plugin.downloader_app.ui.TaskItemView) && (eVar = taskListView.f97418f2.f368324d) != null) {
            java.util.Iterator it = eVar.iterator();
            while (it.hasNext()) {
                ((com.tencent.mm.plugin.downloader_app.model.r0) it.next()).f97312a = true;
            }
            ((com.tencent.mm.plugin.downloader_app.ui.TaskItemView) viewGroup.getChildAt(0)).setSelected(true);
            taskListView.f97422j2 = true;
            m43.e eVar2 = taskListView.f97418f2.f368324d;
            if (com.tencent.mm.sdk.platformtools.t8.L0(eVar2)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.TaskListView", "enterTaskManagerView, list is nil");
            } else {
                taskListView.f97422j2 = true;
                java.util.Iterator it6 = eVar2.iterator();
                while (it6.hasNext()) {
                    ((com.tencent.mm.plugin.downloader_app.model.r0) it6.next()).f97312a = true;
                }
                r02.w wVar = taskListView.f97420h2;
                if (wVar != null) {
                    ((r02.m) wVar).a(true);
                }
                r02.r0 r0Var = taskListView.f97418f2;
                r0Var.f368330m = false;
                r0Var.notifyDataSetChanged();
                taskListView.f97430r2 = false;
                com.tencent.mm.plugin.downloader_app.model.x.b(true);
                o02.a.b(11, 0, 0, 1, "", "", "");
                o02.a.b(11, 0, 0, 1, "", "", "");
            }
        }
        return true;
    }
}
