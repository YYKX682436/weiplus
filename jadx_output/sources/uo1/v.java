package uo1;

/* loaded from: classes5.dex */
public final class v implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.y1 f429594d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ po1.d f429595e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qo1.f0 f429596f;

    public v(com.tencent.mm.ui.widget.dialog.y1 y1Var, po1.d dVar, qo1.f0 f0Var) {
        this.f429594d = y1Var;
        this.f429595e = dVar;
        this.f429596f = f0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/BackupUIUtils$showConnectionSwitchBottomDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        po1.d dVar = this.f429595e;
        qo1.f0 f0Var = this.f429596f;
        com.tencent.mm.ui.widget.dialog.y1 y1Var = this.f429594d;
        y1Var.h(new uo1.u(dVar, f0Var, y1Var));
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/BackupUIUtils$showConnectionSwitchBottomDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
