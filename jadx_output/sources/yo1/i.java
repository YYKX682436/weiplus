package yo1;

/* loaded from: classes5.dex */
public final class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.permission.PermissionRequestUI f464123d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ po1.d f464124e;

    public i(com.tencent.mm.plugin.backup.roambackup.ui.permission.PermissionRequestUI permissionRequestUI, po1.d dVar) {
        this.f464123d = permissionRequestUI;
        this.f464124e = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/permission/PermissionRequestUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.backup.roambackup.ui.permission.PermissionRequestUI permissionRequestUI = this.f464123d;
        java.lang.String str = permissionRequestUI.f92783d;
        po1.d dVar = this.f464124e;
        if (dVar == null) {
            com.tencent.mars.xlog.Log.i(str, "Device is not initialize, try to get a new device from system");
            java.util.List b17 = ro1.v.f398014a.b();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) b17;
            if (arrayList2.isEmpty()) {
                com.tencent.mars.xlog.Log.w(str, "Fail to get device from system");
                int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(permissionRequestUI);
                e4Var.d(com.tencent.mm.R.string.mvb);
                e4Var.c();
                yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/permission/PermissionRequestUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
            r2 = arrayList2.size() == 1;
            dVar = po1.d.a((po1.d) kz5.n0.i0(b17), null, null, null, null, "/", null, null, 111, null);
        }
        com.tencent.mars.xlog.Log.i(str, "Open saf ui and request permission. targetDevice=" + dVar);
        android.content.Intent d17 = to1.g.f420911a.d(dVar);
        kotlin.jvm.internal.o.d(d17);
        permissionRequestUI.startActivityForResult(d17, 296);
        wo1.l1.f447986a.a(r2 ? dVar.b() : null);
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/permission/PermissionRequestUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
