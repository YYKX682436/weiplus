package rn1;

/* loaded from: classes12.dex */
public class s implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rn1.a0 f397627d;

    public s(rn1.a0 a0Var) {
        this.f397627d = a0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/backuppcui/BackupPcUI$3$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        rn1.a0 a0Var = this.f397627d;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) a0Var.f397612a.getContext(), 1, true);
        k0Var.q(a0Var.f397612a.getString(com.tencent.mm.R.string.jyx), 17);
        k0Var.f211872n = new rn1.q(this);
        k0Var.f211881s = new rn1.r(this);
        k0Var.v();
        yj0.a.h(this, "com/tencent/mm/plugin/backup/backuppcui/BackupPcUI$3$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
