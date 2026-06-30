package yo1;

/* loaded from: classes5.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.permission.PermissionRegainUI f464113d;

    public d(com.tencent.mm.plugin.backup.roambackup.ui.permission.PermissionRegainUI permissionRegainUI) {
        this.f464113d = permissionRegainUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/permission/PermissionRegainUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.util.List b17 = ro1.v.f398014a.b();
        com.tencent.mm.plugin.backup.roambackup.ui.permission.PermissionRegainUI permissionRegainUI = this.f464113d;
        java.lang.String str = permissionRegainUI.f92781d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Count of available devices is ");
        java.util.ArrayList arrayList2 = (java.util.ArrayList) b17;
        sb6.append(arrayList2.size());
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        if (arrayList2.isEmpty()) {
            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(permissionRegainUI);
            e4Var.b(com.tencent.mm.R.raw.icons_filled_info);
            e4Var.d(com.tencent.mm.R.string.mza);
            e4Var.c();
            yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/permission/PermissionRegainUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        po1.d dVar = permissionRegainUI.f92782e;
        if (dVar == null) {
            kotlin.jvm.internal.o.o(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_DEVICE_NAME);
            throw null;
        }
        if (dVar.f357300f.length() == 0) {
            po1.d dVar2 = permissionRegainUI.f92782e;
            if (dVar2 == null) {
                kotlin.jvm.internal.o.o(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_DEVICE_NAME);
                throw null;
            }
            java.lang.String str2 = ((po1.d) kz5.n0.i0(b17)).f357300f;
            kotlin.jvm.internal.o.g(str2, "<set-?>");
            dVar2.f357300f = str2;
        }
        po1.d dVar3 = permissionRegainUI.f92782e;
        if (dVar3 == null) {
            kotlin.jvm.internal.o.o(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_DEVICE_NAME);
            throw null;
        }
        android.content.Intent d17 = to1.g.f420911a.d(po1.d.a(dVar3, null, null, null, null, "/", null, null, 111, null));
        kotlin.jvm.internal.o.d(d17);
        permissionRegainUI.startActivityForResult(d17, 296);
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/permission/PermissionRegainUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
