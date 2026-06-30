package xo1;

/* loaded from: classes.dex */
public final class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.device.NewPcDeviceUI f455760d;

    public l(com.tencent.mm.plugin.backup.roambackup.ui.device.NewPcDeviceUI newPcDeviceUI) {
        this.f455760d = newPcDeviceUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/device/NewPcDeviceUI$updateView$delay$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.backup.roambackup.ui.device.NewPcDeviceUI.f92767t;
        com.tencent.mm.plugin.backup.roambackup.ui.device.NewPcDeviceUI newPcDeviceUI = this.f455760d;
        newPcDeviceUI.getClass();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("CLICK_ENTER_SCAN", true);
        if (!iq.b.i(newPcDeviceUI, true, bundle) && !iq.b.v(newPcDeviceUI) && !iq.b.c(newPcDeviceUI, true) && !iq.b.o(newPcDeviceUI, true)) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_scan_report_enter_scene", 18);
            intent.putExtra("BaseScanUI_select_scan_mode", 8);
            j45.l.j(newPcDeviceUI, "scanner", ".ui.BaseScanUI", intent, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/device/NewPcDeviceUI$updateView$delay$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
