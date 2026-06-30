package wo1;

/* loaded from: classes5.dex */
public final class p1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.component.TaskStatusCardView f448010d;

    public p1(com.tencent.mm.plugin.backup.roambackup.ui.component.TaskStatusCardView taskStatusCardView) {
        this.f448010d = taskStatusCardView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        zo1.b4 b4Var;
        android.widget.FrameLayout frameLayout;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/component/TaskStatusCardView$setOnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.backup.roambackup.ui.component.TaskStatusCardView taskStatusCardView = this.f448010d;
        if (!taskStatusCardView.f92761z && (b4Var = taskStatusCardView.f92758w) != null && (frameLayout = b4Var.f474555d) != null) {
            frameLayout.callOnClick();
        }
        android.view.View.OnClickListener onClickListener = taskStatusCardView.f92757v;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/component/TaskStatusCardView$setOnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
