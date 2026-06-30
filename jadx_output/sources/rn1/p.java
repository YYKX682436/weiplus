package rn1;

/* loaded from: classes12.dex */
public class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rn1.a0 f397624d;

    public p(rn1.a0 a0Var) {
        this.f397624d = a0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/backuppcui/BackupPcUI$3$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        rn1.a0 a0Var = this.f397624d;
        android.content.Intent intent = new android.content.Intent(a0Var.f397612a, (java.lang.Class<?>) com.tencent.mm.plugin.backup.backupui.PCChooseConversationUI.class);
        intent.putExtra("KEY_IS_BACKUP", true);
        com.tencent.mm.ui.MMWizardActivity.X6(a0Var.f397612a, intent);
        qn1.c.i().m().d();
        qn1.c.i().m().e();
        qn1.c.i().m().c(false);
        yj0.a.h(this, "com/tencent/mm/plugin/backup/backuppcui/BackupPcUI$3$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
