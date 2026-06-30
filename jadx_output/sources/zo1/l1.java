package zo1;

/* loaded from: classes5.dex */
public final class l1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.CreatePackageUI f474681d;

    public l1(com.tencent.mm.plugin.backup.roambackup.ui.pkg.CreatePackageUI createPackageUI) {
        this.f474681d = createPackageUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/pkg/CreatePackageUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.RoamReport28098", "start simple report for pageAction=" + com.tencent.mm.plugin.backup.roambackup.y1.f92945o);
        com.tencent.mm.autogen.mmdata.rpt.RoamBackupRecoverReport28098Struct roamBackupRecoverReport28098Struct = new com.tencent.mm.autogen.mmdata.rpt.RoamBackupRecoverReport28098Struct();
        roamBackupRecoverReport28098Struct.f60066d = 2L;
        roamBackupRecoverReport28098Struct.f60067e = 4L;
        roamBackupRecoverReport28098Struct.k();
        uo1.w wVar = uo1.w.f429597a;
        com.tencent.mm.plugin.backup.roambackup.ui.pkg.CreatePackageUI createPackageUI = this.f474681d;
        int i17 = createPackageUI.f92825q;
        po1.d dVar = createPackageUI.f92827s;
        java.lang.String b17 = dVar != null ? dVar.b() : null;
        com.tencent.mm.plugin.backup.roambackup.ui.pkg.CreatePackageUI createPackageUI2 = this.f474681d;
        com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo backupRangeInfo = createPackageUI2.f92826r;
        if (backupRangeInfo == null) {
            kotlin.jvm.internal.o.o("rangeInfo");
            throw null;
        }
        wVar.a(createPackageUI, i17, b17, -1L, backupRangeInfo.f92734h > 0, new zo1.k1(createPackageUI2));
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/pkg/CreatePackageUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
