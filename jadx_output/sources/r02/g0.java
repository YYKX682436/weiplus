package r02;

/* loaded from: classes8.dex */
public class g0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader_app.ui.TaskItemView f368300d;

    public g0(com.tencent.mm.plugin.downloader_app.ui.TaskItemView taskItemView) {
        this.f368300d = taskItemView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        d02.b bVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/downloader_app/ui/TaskItemView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.downloader_app.ui.TaskItemView taskItemView = this.f368300d;
        com.tencent.mm.plugin.downloader_app.model.r0 r0Var = taskItemView.B;
        if (r0Var != null && (bVar = r0Var.f97326o) != null && !com.tencent.mm.sdk.platformtools.t8.K0(bVar.f225275g)) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("rawUrl", taskItemView.B.f97326o.f225275g);
            ((l02.q) ((m02.s) i95.n0.c(m02.s.class))).Bi(taskItemView.getContext(), bundle);
            com.tencent.mm.plugin.downloader_app.model.r0 r0Var2 = taskItemView.B;
            o02.a.b(10, 1006, r0Var2.f97315d, 40, r0Var2.f97317f, "", "");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/downloader_app/ui/TaskItemView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
