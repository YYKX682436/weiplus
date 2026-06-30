package uo1;

/* loaded from: classes5.dex */
public final class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ po1.d f429575d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.y1 f429576e;

    public l(po1.d dVar, com.tencent.mm.ui.widget.dialog.y1 y1Var) {
        this.f429575d = dVar;
        this.f429576e = y1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/BackupUIUtils$showBottomSheetSwitchToUsb$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.backup.roambackup.u uVar = com.tencent.mm.plugin.backup.roambackup.u.f92737a;
        po1.d dVar = this.f429575d;
        com.tencent.wechat.aff.affroam.o1 c17 = uVar.c(dVar.f357295a);
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (c17 == null) {
            com.tencent.mars.xlog.Log.e("BackupUIUtils", "Device manager is null, deviceInfo=" + dVar);
            yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/BackupUIUtils$showBottomSheetSwitchToUsb$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mars.xlog.Log.i("BackupUIUtils", "Disconnect device now, device=" + dVar);
        c17.b(new uo1.k(dVar));
        this.f429576e.q();
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/BackupUIUtils$showBottomSheetSwitchToUsb$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
