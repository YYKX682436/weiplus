package r02;

/* loaded from: classes8.dex */
public class e0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader_app.ui.TaskItemView f368296d;

    public e0(com.tencent.mm.plugin.downloader_app.ui.TaskItemView taskItemView) {
        this.f368296d = taskItemView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/downloader_app/ui/TaskItemView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.downloader_app.ui.TaskItemView taskItemView = this.f368296d;
        r02.m0 m0Var = taskItemView.D;
        if (m0Var != null && ((r02.n) m0Var).a(view, 3)) {
            yj0.a.h(this, "com/tencent/mm/plugin/downloader_app/ui/TaskItemView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mm.plugin.downloader_app.model.r0 r0Var = taskItemView.B;
        if (r0Var.f97314c == 6) {
            android.content.Context context = taskItemView.getContext();
            com.tencent.mm.plugin.downloader_app.model.r0 r0Var2 = taskItemView.B;
            if (com.tencent.mm.pluginsdk.model.app.j1.f(context, r0Var2.f97324m.f225277e)) {
                k02.l.c(context, r0Var2.f97327p, r0Var2.f97317f, r0Var2.f97320i);
                o02.a.b(10, o02.a.a(r0Var2.f97314c), r0Var2.f97315d, 22, r0Var2.f97317f, "", "");
            } else {
                db5.e1.C(context, context.getString(com.tencent.mm.R.string.f490581z2), context.getString(com.tencent.mm.R.string.f490582z3), context.getString(com.tencent.mm.R.string.f492835i23), context.getString(com.tencent.mm.R.string.jq7), false, new com.tencent.mm.plugin.downloader_app.model.e(context, r0Var2), new com.tencent.mm.plugin.downloader_app.model.f());
            }
        } else {
            h02.a d17 = com.tencent.mm.plugin.downloader.model.m0.d(r0Var.f97317f);
            if (d17 == null) {
                com.tencent.mm.plugin.downloader_app.model.o.b(taskItemView.getContext(), taskItemView.B, false);
            } else if (!taskItemView.f97405o.getText().equals(taskItemView.getResources().getString(com.tencent.mm.R.string.gtk))) {
                com.tencent.mm.plugin.downloader_app.model.o.b(taskItemView.getContext(), taskItemView.B, false);
            } else if (!com.tencent.mm.vfs.w6.j(d17.field_filePath)) {
                com.tencent.mm.plugin.downloader_app.model.o.b(taskItemView.getContext(), taskItemView.B, false);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/downloader_app/ui/TaskItemView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
