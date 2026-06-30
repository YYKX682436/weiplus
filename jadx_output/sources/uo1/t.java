package uo1;

/* loaded from: classes5.dex */
public final class t implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uo1.u f429589d;

    public t(uo1.u uVar) {
        this.f429589d = uVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/BackupUIUtils$showConnectionSwitchBottomDialog$2$1$getView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f429589d.h();
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/BackupUIUtils$showConnectionSwitchBottomDialog$2$1$getView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
