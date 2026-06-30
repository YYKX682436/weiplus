package zo1;

/* loaded from: classes5.dex */
public final class m1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.CreatePackageUI f474690d;

    public m1(com.tencent.mm.plugin.backup.roambackup.ui.pkg.CreatePackageUI createPackageUI) {
        this.f474690d = createPackageUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/pkg/CreatePackageUI$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.backup.roambackup.ui.pkg.CreatePackageUI createPackageUI = this.f474690d;
        java.lang.Object obj = null;
        if (createPackageUI.f92827s == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.CreatePackageUI", "Notify user device is null");
            android.widget.TextView textView = createPackageUI.f92816e;
            if (textView == null) {
                kotlin.jvm.internal.o.o("deviceNameTv");
                throw null;
            }
            textView.setTextColor(createPackageUI.getColor(com.tencent.mm.R.color.a2y));
            android.widget.TextView textView2 = createPackageUI.f92816e;
            if (textView2 == null) {
                kotlin.jvm.internal.o.o("deviceNameTv");
                throw null;
            }
            textView2.setText(com.tencent.mm.R.string.oez);
        } else {
            android.widget.Button button = createPackageUI.f92822n;
            if (button == null) {
                kotlin.jvm.internal.o.o("createBtn");
                throw null;
            }
            button.setEnabled(false);
            com.tencent.mm.ui.widget.dialog.u3 f17 = com.tencent.mm.ui.widget.dialog.u3.f(createPackageUI, createPackageUI.getString(com.tencent.mm.R.string.mwv), false, 3, null);
            kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
            po1.d dVar = createPackageUI.f92827s;
            kotlin.jvm.internal.o.d(dVar);
            h0Var.f310123d = dVar;
            zo1.t1 t1Var = new zo1.t1(h0Var, createPackageUI);
            fo1.d dVar2 = fo1.d.f264858a;
            if (dVar2.b(dVar)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.CreatePackageUI", "The target device is a unbind online PC/MAC. device=" + h0Var.f310123d);
                if (dVar2.c((po1.d) h0Var.f310123d)) {
                    po1.d device = (po1.d) h0Var.f310123d;
                    zo1.p1 p1Var = new zo1.p1(h0Var, t1Var, createPackageUI, f17);
                    kotlin.jvm.internal.o.g(device, "device");
                    java.lang.String uuid = java.util.UUID.randomUUID().toString();
                    kotlin.jvm.internal.o.f(uuid, "toString(...)");
                    ((com.tencent.mm.plugin.backup.roambackup.p1) ((mv.y) i95.n0.c(mv.y.class))).bj(uuid, device.f357301g, 8000L, new fo1.c(p1Var, device));
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.CreatePackageUI", "PC/MAC client version is not satisfied.");
                    t1Var.invoke();
                    android.content.Intent intent = new android.content.Intent(createPackageUI, (java.lang.Class<?>) com.tencent.mm.plugin.backup.roambackup.ui.device.NewPcDeviceUI.class);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(intent);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(createPackageUI, arrayList2.toArray(), "com/tencent/mm/plugin/backup/roambackup/ui/pkg/CreatePackageUI", "onCreateBtnClicked", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    createPackageUI.startActivity((android.content.Intent) arrayList2.get(0));
                    yj0.a.f(createPackageUI, "com/tencent/mm/plugin/backup/roambackup/ui/pkg/CreatePackageUI", "onCreateBtnClicked", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    android.widget.Button button2 = createPackageUI.f92822n;
                    if (button2 == null) {
                        kotlin.jvm.internal.o.o("createBtn");
                        throw null;
                    }
                    button2.setEnabled(true);
                    f17.dismiss();
                }
            } else if (ro1.v.f398014a.f((po1.d) h0Var.f310123d)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.CreatePackageUI", "Start bind a new device=" + h0Var.f310123d + " before create package");
                po1.d deviceInfo = (po1.d) h0Var.f310123d;
                zo1.q1 q1Var = new zo1.q1(f17, h0Var, t1Var, createPackageUI);
                kotlin.jvm.internal.o.g(deviceInfo, "deviceInfo");
                if (deviceInfo.f357296b != po1.g.f357310h) {
                    com.tencent.mars.xlog.Log.e("UDiskDeviceManager", "[addUDiskDevice] error device type, " + deviceInfo.f357296b);
                } else {
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                    java.util.Iterator it = so1.b.f410226a.d().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        java.lang.Object next = it.next();
                        if (kotlin.jvm.internal.o.b(((po1.d) next).f357300f, deviceInfo.f357300f)) {
                            obj = next;
                            break;
                        }
                    }
                    po1.d dVar3 = (po1.d) obj;
                    if (dVar3 != null) {
                        java.lang.String str2 = deviceInfo.f357299e;
                        java.lang.String str3 = deviceInfo.f357301g;
                        deviceInfo.d(dVar3.f357299e);
                        java.lang.String str4 = dVar3.f357301g;
                        kotlin.jvm.internal.o.g(str4, "<set-?>");
                        deviceInfo.f357301g = str4;
                        ro1.k kVar = new ro1.k(q1Var, deviceInfo, str2, str3, createPackageUI);
                        com.tencent.mars.xlog.Log.i("DirectDiskDeviceDelegate", "[addUDiskDevice] device=" + deviceInfo);
                        java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                        ((ku5.t0) ku5.t0.f312615d).q(new so1.f(deviceInfo, kVar));
                    } else {
                        android.content.Intent intent2 = new android.content.Intent(createPackageUI, (java.lang.Class<?>) com.tencent.mm.plugin.backup.roambackup.ui.permission.PermissionRequestUI.class);
                        intent2.putExtra("deviceInfo", deviceInfo.c());
                        ((com.tencent.mm.ui.bd) createPackageUI.startActivityForResult(intent2)).f197877a = new to1.e(q1Var);
                    }
                }
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.CreatePackageUI", "Device is already bind, create package ");
                ((ku5.t0) ku5.t0.f312615d).g(new zo1.r1(t1Var, createPackageUI, h0Var, f17));
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/pkg/CreatePackageUI$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
