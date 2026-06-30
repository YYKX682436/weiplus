package ro1;

/* loaded from: classes5.dex */
public final class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f397999d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.y1 f398000e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ po1.d f398001f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f398002g;

    public p(android.content.Context context, com.tencent.mm.ui.widget.dialog.y1 y1Var, po1.d dVar, boolean z17) {
        this.f397999d = context;
        this.f398000e = y1Var;
        this.f398001f = dVar;
        this.f398002g = z17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/udisk/UsbDevicesDiscover$showBoundDeviceDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean Ui = ((com.tencent.mm.plugin.backup.roambackup.p1) ((mv.y) i95.n0.c(mv.y.class))).Ui();
        com.tencent.mm.ui.widget.dialog.y1 y1Var = this.f398000e;
        android.content.Context context = this.f397999d;
        if (Ui) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackup.UsbDevicesDiscover", "click");
            ((com.tencent.mm.plugin.backup.roambackup.p1) ((mv.y) i95.n0.c(mv.y.class))).aj(context, new java.util.LinkedHashMap(), mv.b0.f331478f);
            y1Var.q();
            yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/udisk/UsbDevicesDiscover$showBoundDeviceDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        oo1.o oVar = oo1.o.f347151a;
        po1.d dVar = this.f398001f;
        oVar.a(dVar.f357295a);
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectPackageUI.class);
        if (this.f398002g) {
            intent.putExtra("sub-intent", true);
            intent.putExtra("deviceInfo", dVar.c());
        } else {
            intent.putExtra("expandCard", true);
            intent.putExtra("deviceId", dVar.f357295a);
        }
        intent.setFlags(335544320);
        android.content.Context context2 = this.f397999d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(context2, arrayList2.toArray(), "com/tencent/mm/plugin/backup/roambackup/udisk/UsbDevicesDiscover$showBoundDeviceDialog$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context2.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(context2, "com/tencent/mm/plugin/backup/roambackup/udisk/UsbDevicesDiscover$showBoundDeviceDialog$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        y1Var.q();
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/udisk/UsbDevicesDiscover$showBoundDeviceDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
