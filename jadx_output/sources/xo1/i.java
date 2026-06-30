package xo1;

/* loaded from: classes5.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f455754d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.device.NewPcDeviceUI f455755e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ po1.d f455756f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(boolean z17, com.tencent.mm.plugin.backup.roambackup.ui.device.NewPcDeviceUI newPcDeviceUI, po1.d dVar) {
        super(0);
        this.f455754d = z17;
        this.f455755e = newPcDeviceUI;
        this.f455756f = dVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17 = this.f455754d;
        com.tencent.mm.plugin.backup.roambackup.ui.device.NewPcDeviceUI newPcDeviceUI = this.f455755e;
        if (z17) {
            com.tencent.mars.xlog.Log.i(newPcDeviceUI.f92768d, "Auto bind success.");
            android.content.Intent intent = new android.content.Intent(newPcDeviceUI.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.backup.roambackup.ui.pkg.CreatePackageUI.class);
            intent.putExtra("deviceInfo", this.f455756f.c());
            newPcDeviceUI.finish();
            com.tencent.mm.plugin.backup.roambackup.ui.device.NewPcDeviceUI newPcDeviceUI2 = this.f455755e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(newPcDeviceUI2, arrayList.toArray(), "com/tencent/mm/plugin/backup/roambackup/ui/device/NewPcDeviceUI$tryBindDevice$1$1", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            newPcDeviceUI2.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(newPcDeviceUI2, "com/tencent/mm/plugin/backup/roambackup/ui/device/NewPcDeviceUI$tryBindDevice$1$1", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else {
            com.tencent.mars.xlog.Log.w(newPcDeviceUI.f92768d, "Auto bind failed.");
            newPcDeviceUI.f92770f = false;
            newPcDeviceUI.U6(newPcDeviceUI.f92771g);
            java.lang.String string = newPcDeviceUI.getString(com.tencent.mm.R.string.mxh);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            android.widget.Toast.makeText(newPcDeviceUI.getContext(), string, 1).show();
        }
        return jz5.f0.f302826a;
    }
}
