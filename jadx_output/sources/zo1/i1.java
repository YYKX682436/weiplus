package zo1;

/* loaded from: classes5.dex */
public final class i1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.CreatePackageUI f474641d;

    public i1(com.tencent.mm.plugin.backup.roambackup.ui.pkg.CreatePackageUI createPackageUI) {
        this.f474641d = createPackageUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/pkg/CreatePackageUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.RoamReport28098", "start simple report for pageAction=" + com.tencent.mm.plugin.backup.roambackup.y1.f92943m);
        com.tencent.mm.autogen.mmdata.rpt.RoamBackupRecoverReport28098Struct roamBackupRecoverReport28098Struct = new com.tencent.mm.autogen.mmdata.rpt.RoamBackupRecoverReport28098Struct();
        roamBackupRecoverReport28098Struct.f60066d = 2L;
        roamBackupRecoverReport28098Struct.f60067e = 2L;
        roamBackupRecoverReport28098Struct.k();
        java.lang.ref.WeakReference weakReference = com.tencent.mm.plugin.backup.roambackup.ui.pkg.CreatePackageUI.f92814u;
        com.tencent.mm.plugin.backup.roambackup.ui.pkg.CreatePackageUI createPackageUI = this.f474641d;
        createPackageUI.getClass();
        createPackageUI.V6(new zo1.c1(createPackageUI));
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/pkg/CreatePackageUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
