package zo1;

/* loaded from: classes5.dex */
public final class g4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zo1.b4 f474625d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zo1.k4 f474626e;

    public g4(zo1.b4 b4Var, zo1.k4 k4Var) {
        this.f474625d = b4Var;
        this.f474626e = k4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        zo1.k4 k4Var;
        zo1.a4 a4Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/pkg/SelectPackageUI$PackageListAdapter$onCreateViewHolder$1$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int adapterPosition = this.f474625d.getAdapterPosition();
        if (adapterPosition != -1 && (a4Var = (k4Var = this.f474626e).f474673d) != null) {
            java.lang.Object obj = k4Var.f474674e.get(adapterPosition);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            com.tencent.wechat.aff.affroam.g gVar = (com.tencent.wechat.aff.affroam.g) obj;
            zo1.r4 r4Var = (zo1.r4) a4Var;
            com.tencent.mars.xlog.Log.i("MicroMsg.SelectPackageUI", "onManagerBtnClick, pkgId=" + gVar.f215829d);
            com.tencent.mm.plugin.backup.roambackup.a2.a(com.tencent.mm.plugin.backup.roambackup.a2.f92567a, com.tencent.mm.plugin.backup.roambackup.y1.I, gVar, null, null, null, null, 60, null);
            android.content.Intent intent = new android.content.Intent(r4Var.f474759a.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.backup.roambackup.ui.pkg.PackageManagerUI.class);
            intent.putExtra("packageId", gVar.f215829d);
            com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectPackageUI selectPackageUI = r4Var.f474759a;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(selectPackageUI, arrayList2.toArray(), "com/tencent/mm/plugin/backup/roambackup/ui/pkg/SelectPackageUI$onCreate$3", "onManagerBtnClick", "(Lcom/tencent/wechat/aff/affroam/AffRoamBackupPackage;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            selectPackageUI.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(selectPackageUI, "com/tencent/mm/plugin/backup/roambackup/ui/pkg/SelectPackageUI$onCreate$3", "onManagerBtnClick", "(Lcom/tencent/wechat/aff/affroam/AffRoamBackupPackage;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/pkg/SelectPackageUI$PackageListAdapter$onCreateViewHolder$1$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
