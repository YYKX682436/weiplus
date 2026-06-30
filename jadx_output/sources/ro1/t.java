package ro1;

/* loaded from: classes5.dex */
public final class t implements ro1.e {

    /* renamed from: d, reason: collision with root package name */
    public static final ro1.t f398008d = new ro1.t();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.HashMap f398009e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Set f398010f = java.util.Collections.synchronizedSet(new java.util.HashSet());

    /* renamed from: g, reason: collision with root package name */
    public static final android.content.BroadcastReceiver f398011g = new android.content.BroadcastReceiver() { // from class: com.tencent.mm.plugin.backup.roambackup.udisk.UsbDevicesDiscover$mUsbReceiver$1
        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context context, android.content.Intent intent) {
            kotlin.jvm.internal.o.g(context, "context");
            kotlin.jvm.internal.o.g(intent, "intent");
            java.lang.String action = intent.getAction();
            if (kotlin.jvm.internal.o.b("com.tencent.mm.roam_backup.USB_PERMISSION", action)) {
                android.support.v4.media.f.a(ro1.t.f398009e.remove(java.lang.Integer.valueOf(intent.getIntExtra("hashcode", 0))));
                intent.getBooleanExtra("permission", false);
            } else {
                if (kotlin.jvm.internal.o.b("android.hardware.usb.action.USB_DEVICE_ATTACHED", action)) {
                    android.hardware.usb.UsbDevice usbDevice = (android.hardware.usb.UsbDevice) intent.getParcelableExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_DEVICE_NAME);
                    com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackup.UsbDevicesDiscover", "USB device attached");
                    if (usbDevice != null) {
                        ro1.t.f398008d.a(1);
                        return;
                    }
                    return;
                }
                if (kotlin.jvm.internal.o.b("android.hardware.usb.action.USB_DEVICE_DETACHED", action)) {
                    android.hardware.usb.UsbDevice usbDevice2 = (android.hardware.usb.UsbDevice) intent.getParcelableExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_DEVICE_NAME);
                    com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackup.UsbDevicesDiscover", "USB device detached");
                    if (usbDevice2 != null) {
                        ro1.t.f398008d.a(1);
                    }
                }
            }
        }
    };

    /* renamed from: h, reason: collision with root package name */
    public static java.util.List f398012h = ro1.v.f398014a.b();

    @Override // ro1.e
    public void X4(java.util.List devices) {
        kotlin.jvm.internal.o.g(devices, "devices");
        if (devices.isEmpty()) {
            return;
        }
        java.util.List a17 = ro1.v.f398014a.a();
        java.util.ArrayList<po1.d> arrayList = new java.util.ArrayList();
        java.util.Iterator it = a17.iterator();
        while (true) {
            boolean z17 = true;
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            po1.d dVar = (po1.d) next;
            if (!devices.isEmpty()) {
                java.util.Iterator it6 = devices.iterator();
                while (it6.hasNext()) {
                    if (kotlin.jvm.internal.o.b(dVar.f357300f, ((po1.d) it6.next()).f357300f)) {
                        break;
                    }
                }
            }
            z17 = false;
            if (z17) {
                arrayList.add(next);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackup.UsbDevicesDiscover", "onVolumeUnmounted, boundDevices = " + arrayList);
        if (!arrayList.isEmpty()) {
            for (po1.d dVar2 : arrayList) {
                com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackup.UsbDevicesDiscover", "onVolumeUnmounted, disconnectAsync = " + dVar2.f357295a);
                com.tencent.wechat.aff.affroam.o1 c17 = com.tencent.mm.plugin.backup.roambackup.u.f92737a.c(dVar2.f357295a);
                if (c17 != null) {
                    c17.b(ro1.o.f397998a);
                }
            }
        }
    }

    public final void a(int i17) {
        if (i17 > 7) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackup.UsbDevicesDiscover", "Try check storage volumes time: %s", java.lang.Integer.valueOf(i17));
        ku5.t0 t0Var = (ku5.t0) ku5.t0.f312615d;
        t0Var.getClass();
        t0Var.w(new ro1.m(i17), i17 * 1000, "StorageVolumeChanges");
    }

    @Override // ro1.e
    public void e5(java.util.List devices) {
        boolean z17;
        kotlin.jvm.internal.o.g(devices, "devices");
        if (devices.isEmpty()) {
            return;
        }
        if (!gm0.j1.a()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RoamBackup.UsbDevicesDiscover", "Account not ready. Ignore this event.");
            return;
        }
        java.lang.ref.WeakReference weakReference = com.tencent.mm.plugin.backup.roambackup.ui.pkg.CreatePackageUI.f92814u;
        java.lang.ref.WeakReference weakReference2 = com.tencent.mm.plugin.backup.roambackup.ui.pkg.CreatePackageUI.f92814u;
        com.tencent.mm.plugin.backup.roambackup.ui.pkg.CreatePackageUI createPackageUI = weakReference2 != null ? (com.tencent.mm.plugin.backup.roambackup.ui.pkg.CreatePackageUI) weakReference2.get() : null;
        if (createPackageUI != null && !createPackageUI.isFinishing() && !createPackageUI.isDestroyed()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackup.UsbDevicesDiscover", "Skip showing the bottom sheet because the user already in CreatePackageUI");
            return;
        }
        if (ho1.c.f282633b > 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackup.UsbDevicesDiscover", "Skip showing the bottom sheet because backup activity is running");
            return;
        }
        java.util.List a17 = ro1.v.f398014a.a();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : a17) {
            po1.d dVar = (po1.d) obj;
            if (!devices.isEmpty()) {
                java.util.Iterator it = devices.iterator();
                while (it.hasNext()) {
                    if (kotlin.jvm.internal.o.b(dVar.f357300f, ((po1.d) it.next()).f357300f)) {
                        z17 = true;
                        break;
                    }
                }
            }
            z17 = false;
            if (z17) {
                arrayList.add(obj);
            }
        }
        new ro1.n(new kotlin.jvm.internal.f0(), arrayList, devices).run();
    }
}
