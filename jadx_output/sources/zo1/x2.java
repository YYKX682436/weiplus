package zo1;

/* loaded from: classes5.dex */
public final class x2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.PackageManagerUI f474822d;

    public x2(com.tencent.mm.plugin.backup.roambackup.ui.pkg.PackageManagerUI packageManagerUI) {
        this.f474822d = packageManagerUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/pkg/PackageManagerUI$onCreate$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.RoamReport28098", "start simple report for pageAction=" + com.tencent.mm.plugin.backup.roambackup.y1.Q);
        com.tencent.mm.autogen.mmdata.rpt.RoamBackupRecoverReport28098Struct roamBackupRecoverReport28098Struct = new com.tencent.mm.autogen.mmdata.rpt.RoamBackupRecoverReport28098Struct();
        roamBackupRecoverReport28098Struct.f60066d = 8L;
        roamBackupRecoverReport28098Struct.f60067e = 7L;
        roamBackupRecoverReport28098Struct.k();
        com.tencent.mm.plugin.backup.roambackup.ui.pkg.PackageManagerUI packageManagerUI = this.f474822d;
        android.content.Intent intent = new android.content.Intent(packageManagerUI.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.backup.roambackup.ui.pkg.PackageDeleteConfirmUI.class);
        com.tencent.wechat.aff.affroam.g gVar = packageManagerUI.f92839e;
        if (gVar == null) {
            kotlin.jvm.internal.o.o("pkgInfo");
            throw null;
        }
        intent.putExtra("packageId", gVar.f215829d);
        ((com.tencent.mm.ui.bd) packageManagerUI.startActivityForResult(intent)).f197877a = new zo1.w2(packageManagerUI);
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/pkg/PackageManagerUI$onCreate$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
