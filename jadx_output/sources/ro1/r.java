package ro1;

/* loaded from: classes5.dex */
public final class r implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f398004d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.y1 f398005e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ po1.d f398006f;

    public r(android.content.Context context, com.tencent.mm.ui.widget.dialog.y1 y1Var, po1.d dVar) {
        this.f398004d = context;
        this.f398005e = y1Var;
        this.f398006f = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/udisk/UsbDevicesDiscover$showNewDeviceDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean Ui = ((com.tencent.mm.plugin.backup.roambackup.p1) ((mv.y) i95.n0.c(mv.y.class))).Ui();
        com.tencent.mm.ui.widget.dialog.y1 y1Var = this.f398005e;
        android.content.Context context = this.f398004d;
        if (Ui) {
            ((com.tencent.mm.plugin.backup.roambackup.p1) ((mv.y) i95.n0.c(mv.y.class))).aj(context, new java.util.LinkedHashMap(), mv.b0.f331478f);
            y1Var.q();
            yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/udisk/UsbDevicesDiscover$showNewDeviceDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectPackageUI.class);
        intent.putExtra("sub-intent", true);
        intent.putExtra("deviceInfo", this.f398006f.c());
        intent.setFlags(335544320);
        android.content.Context context2 = this.f398004d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(context2, arrayList2.toArray(), "com/tencent/mm/plugin/backup/roambackup/udisk/UsbDevicesDiscover$showNewDeviceDialog$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context2.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(context2, "com/tencent/mm/plugin/backup/roambackup/udisk/UsbDevicesDiscover$showNewDeviceDialog$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        y1Var.q();
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/udisk/UsbDevicesDiscover$showNewDeviceDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
