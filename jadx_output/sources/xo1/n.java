package xo1;

/* loaded from: classes5.dex */
public final class n implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.device.NewPcDeviceUI f455762d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ po1.d f455763e;

    public n(com.tencent.mm.plugin.backup.roambackup.ui.device.NewPcDeviceUI newPcDeviceUI, po1.d dVar) {
        this.f455762d = newPcDeviceUI;
        this.f455763e = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/device/NewPcDeviceUI$updateView$delay$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.backup.roambackup.ui.device.NewPcDeviceUI.f92767t;
        com.tencent.mm.plugin.backup.roambackup.ui.device.NewPcDeviceUI newPcDeviceUI = this.f455762d;
        newPcDeviceUI.getClass();
        po1.d device = this.f455763e;
        kotlin.jvm.internal.o.g(device, "device");
        if (r26.i0.A(device.f357295a, "#OnlineDeviceId@", false, 2, null)) {
            com.tencent.mars.xlog.Log.i(newPcDeviceUI.f92768d, "device=" + device + " is already bound");
            android.content.Intent intent = new android.content.Intent(newPcDeviceUI.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.backup.roambackup.ui.pkg.CreatePackageUI.class);
            intent.putExtra("deviceInfo", device.c());
            newPcDeviceUI.finish();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(newPcDeviceUI, arrayList2.toArray(), "com/tencent/mm/plugin/backup/roambackup/ui/device/NewPcDeviceUI", "tryBindDevice", "(Lcom/tencent/mm/plugin/backup/roambackup/storage/entity/UnifyDeviceInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            newPcDeviceUI.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(newPcDeviceUI, "com/tencent/mm/plugin/backup/roambackup/ui/device/NewPcDeviceUI", "tryBindDevice", "(Lcom/tencent/mm/plugin/backup/roambackup/storage/entity/UnifyDeviceInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else {
            newPcDeviceUI.f92770f = true;
            newPcDeviceUI.U6(device);
            xo1.j jVar = new xo1.j(newPcDeviceUI, device);
            java.lang.String uuid = java.util.UUID.randomUUID().toString();
            kotlin.jvm.internal.o.f(uuid, "toString(...)");
            ((com.tencent.mm.plugin.backup.roambackup.p1) ((mv.y) i95.n0.c(mv.y.class))).bj(uuid, device.f357301g, 8000L, new fo1.c(jVar, device));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/device/NewPcDeviceUI$updateView$delay$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
