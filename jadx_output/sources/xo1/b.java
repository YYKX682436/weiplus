package xo1;

/* loaded from: classes5.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.device.AddNewDeviceListUI f455746d;

    public b(com.tencent.mm.plugin.backup.roambackup.ui.device.AddNewDeviceListUI addNewDeviceListUI) {
        this.f455746d = addNewDeviceListUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/device/AddNewDeviceListUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.RoamReport28098", "start simple report for pageAction=" + com.tencent.mm.plugin.backup.roambackup.y1.f92962z);
        com.tencent.mm.autogen.mmdata.rpt.RoamBackupRecoverReport28098Struct roamBackupRecoverReport28098Struct = new com.tencent.mm.autogen.mmdata.rpt.RoamBackupRecoverReport28098Struct();
        roamBackupRecoverReport28098Struct.f60066d = 6L;
        roamBackupRecoverReport28098Struct.f60067e = 2L;
        roamBackupRecoverReport28098Struct.k();
        android.content.Intent intent = new android.content.Intent(this.f455746d, (java.lang.Class<?>) com.tencent.mm.plugin.backup.roambackup.ui.device.NewPcDeviceUI.class);
        com.tencent.mm.plugin.backup.roambackup.ui.device.AddNewDeviceListUI addNewDeviceListUI = this.f455746d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(addNewDeviceListUI, arrayList2.toArray(), "com/tencent/mm/plugin/backup/roambackup/ui/device/AddNewDeviceListUI$onCreate$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        addNewDeviceListUI.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(addNewDeviceListUI, "com/tencent/mm/plugin/backup/roambackup/ui/device/AddNewDeviceListUI$onCreate$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/device/AddNewDeviceListUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
