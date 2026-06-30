package wo1;

/* loaded from: classes4.dex */
public final class e1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.component.DialogActionBar f447924d;

    public e1(com.tencent.mm.plugin.backup.roambackup.ui.component.DialogActionBar dialogActionBar) {
        this.f447924d = dialogActionBar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/component/DialogActionBar$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Runnable runnable = this.f447924d.f92746d;
        if (runnable != null) {
            runnable.run();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/component/DialogActionBar$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
