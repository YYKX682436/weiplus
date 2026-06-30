package r02;

/* loaded from: classes8.dex */
public class a1 implements vl1.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader_app.ui.TaskListView f368285a;

    public a1(com.tencent.mm.plugin.downloader_app.ui.TaskListView taskListView) {
        this.f368285a = taskListView;
    }

    @Override // vl1.n
    public void a(androidx.recyclerview.widget.RecyclerView recyclerView, android.view.View view, int i17, long j17) {
        android.view.View childAt = ((android.view.ViewGroup) view).getChildAt(0);
        com.tencent.mm.plugin.downloader_app.ui.TaskListView taskListView = this.f368285a;
        m43.e eVar = taskListView.f97418f2.f368324d;
        if (i17 < 0 || i17 >= eVar.size()) {
            return;
        }
        com.tencent.mm.plugin.downloader_app.model.r0 r0Var = (com.tencent.mm.plugin.downloader_app.model.r0) eVar.get(i17);
        if (r0Var.f97314c == 7) {
            r02.r0 r0Var2 = taskListView.f97418f2;
            if (!r0Var2.f368329i) {
                r0Var2.f368329i = true;
                r0Var2.notifyDataSetChanged();
            }
            o02.a.b(10, 1004, 101, 2, "", "", "");
            return;
        }
        if (!taskListView.f97430r2) {
            childAt.setSelected(!r0Var.f97313b);
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(r0Var.f97321j)) {
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("rawUrl", r0Var.f97321j);
        ((l02.q) ((m02.s) i95.n0.c(m02.s.class))).Bi(taskListView.getContext(), bundle);
        o02.a.b(10, o02.a.a(r0Var.f97314c), r0Var.f97315d, 40, r0Var.f97317f, "", "");
    }
}
