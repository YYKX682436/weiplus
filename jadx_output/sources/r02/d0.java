package r02;

/* loaded from: classes8.dex */
public class d0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader_app.ui.TaskItemView f368294d;

    public d0(com.tencent.mm.plugin.downloader_app.ui.TaskItemView taskItemView) {
        this.f368294d = taskItemView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/downloader_app/ui/TaskItemView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.downloader_app.ui.TaskItemView taskItemView = this.f368294d;
        r02.m0 m0Var = taskItemView.D;
        if (m0Var != null && ((r02.n) m0Var).a(view, 1)) {
            yj0.a.h(this, "com/tencent/mm/plugin/downloader_app/ui/TaskItemView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        h02.a d17 = com.tencent.mm.plugin.downloader.model.m0.d(taskItemView.B.f97317f);
        if (d17 == null) {
            taskItemView.c();
            yj0.a.h(this, "com/tencent/mm/plugin/downloader_app/ui/TaskItemView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (d17.field_status == 1) {
            android.content.Context context = taskItemView.getContext();
            com.tencent.mm.plugin.downloader_app.model.r0 r0Var = taskItemView.B;
            h02.a d18 = com.tencent.mm.plugin.downloader.model.m0.d(r0Var.f97317f);
            if (d18 != null) {
                ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
                com.tencent.mm.plugin.downloader.model.r0.i().o(d18.field_downloadId);
                o02.a.b(10, o02.a.a(r0Var.f97314c), r0Var.f97315d, 5, d18.field_appId, "", "");
                k02.l.f(context, d18, new com.tencent.mm.plugin.downloader_app.model.g(d18, r0Var, context));
            }
        } else {
            android.content.Context context2 = taskItemView.getContext();
            com.tencent.mm.plugin.downloader_app.model.r0 r0Var2 = taskItemView.B;
            com.tencent.mm.plugin.downloader_app.model.o.f(context2, com.tencent.mm.plugin.downloader.model.m0.d(r0Var2.f97317f), r0Var2, true, new r02.b0(this));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/downloader_app/ui/TaskItemView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
