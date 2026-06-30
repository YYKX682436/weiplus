package zo1;

/* loaded from: classes5.dex */
public final class z1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.CreatePackageUI f474839d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.y1 f474840e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(com.tencent.mm.plugin.backup.roambackup.ui.pkg.CreatePackageUI createPackageUI, com.tencent.mm.ui.widget.dialog.y1 y1Var) {
        super(1);
        this.f474839d = createPackageUI;
        this.f474840e = y1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        po1.d device = (po1.d) obj;
        kotlin.jvm.internal.o.g(device, "device");
        fo1.d dVar = fo1.d.f264858a;
        boolean b17 = dVar.b(device);
        com.tencent.mm.plugin.backup.roambackup.ui.pkg.CreatePackageUI createPackageUI = this.f474839d;
        if (!b17 || dVar.c(device)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CreatePackageUI", "Selected device is " + device);
            java.lang.ref.WeakReference weakReference = com.tencent.mm.plugin.backup.roambackup.ui.pkg.CreatePackageUI.f92814u;
            createPackageUI.Y6(device);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.CreatePackageUI", "Selected an unbind online PC/MAC and version check failed. device=" + device);
            android.content.Intent intent = new android.content.Intent(createPackageUI, (java.lang.Class<?>) com.tencent.mm.plugin.backup.roambackup.ui.device.NewPcDeviceUI.class);
            intent.putExtra("deviceInfo", device.c());
            com.tencent.mm.plugin.backup.roambackup.ui.pkg.CreatePackageUI createPackageUI2 = this.f474839d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(createPackageUI2, arrayList.toArray(), "com/tencent/mm/plugin/backup/roambackup/ui/pkg/CreatePackageUI$showDeviceSelectDialog$3", "invoke", "(Lcom/tencent/mm/plugin/backup/roambackup/storage/entity/UnifyDeviceInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            createPackageUI2.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(createPackageUI2, "com/tencent/mm/plugin/backup/roambackup/ui/pkg/CreatePackageUI$showDeviceSelectDialog$3", "invoke", "(Lcom/tencent/mm/plugin/backup/roambackup/storage/entity/UnifyDeviceInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        this.f474840e.q();
        return jz5.f0.f302826a;
    }
}
