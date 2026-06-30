package r02;

/* loaded from: classes8.dex */
public class j0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader_app.ui.TaskItemView f368308d;

    public j0(com.tencent.mm.plugin.downloader_app.ui.TaskItemView taskItemView) {
        this.f368308d = taskItemView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/downloader_app/ui/TaskItemView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.os.Bundle bundle = new android.os.Bundle();
        com.tencent.mm.plugin.downloader_app.ui.TaskItemView taskItemView = this.f368308d;
        bundle.putString("rawUrl", taskItemView.B.f97324m.f225293x);
        ((l02.q) ((m02.s) i95.n0.c(m02.s.class))).Bi(taskItemView.getContext(), bundle);
        yj0.a.h(this, "com/tencent/mm/plugin/downloader_app/ui/TaskItemView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
