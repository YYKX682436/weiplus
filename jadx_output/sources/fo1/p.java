package fo1;

/* loaded from: classes5.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final fo1.p f264890a = new fo1.p();

    public final boolean a(com.tencent.mm.ui.MMFragmentActivity activity, po1.d device, fo1.o requestCallback) {
        int i17;
        boolean a17;
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(device, "device");
        kotlin.jvm.internal.o.g(requestCallback, "requestCallback");
        po1.g gVar = device.f357296b;
        po1.g gVar2 = po1.g.f357310h;
        if (gVar == gVar2) {
            if (device.f357296b != gVar2) {
                a17 = true;
            } else {
                po1.d e17 = ro1.v.f398014a.e(device.f357295a);
                a17 = ((e17 == null || so1.b.f410226a.h(e17)) ? so1.g.f410238a : to1.g.f420911a).a(activity, device);
            }
            if (a17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.RoamPermissionHelper", "[checkOrRequestPermission] permission granted. device=" + device);
                return true;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.RoamPermissionHelper", "[checkOrRequestPermission] permission denied, need reauthorize again. device=" + device);
            b(activity, device, requestCallback);
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RoamPermissionHelper", "Not usb disk device, try check AOA usb accessory.");
        com.tencent.mm.plugin.backup.roambackup.MmAoaManager mmAoaManager = com.tencent.mm.plugin.backup.roambackup.MmAoaManager.f92553a;
        jz5.l a18 = mmAoaManager.a();
        android.hardware.usb.UsbAccessory usbAccessory = (android.hardware.usb.UsbAccessory) a18.f302833d;
        boolean booleanValue = ((java.lang.Boolean) a18.f302834e).booleanValue();
        if (usbAccessory == null) {
            return true;
        }
        if (booleanValue) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MmAoaManager", "openAccessory: " + usbAccessory);
            mmAoaManager.c(usbAccessory);
        } else {
            android.util.SparseIntArray sparseIntArray = com.tencent.mm.plugin.backup.roambackup.MmAoaManager.f92556d;
            synchronized (sparseIntArray) {
                i17 = sparseIntArray.get(usbAccessory.hashCode());
            }
            if (i17 <= 2) {
                mmAoaManager.e(usbAccessory);
                return false;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.RoamPermissionHelper", "Asked %s more than %s times. Just return true to pass(maybe WiFi is available).", usbAccessory, java.lang.Integer.valueOf(i17));
        }
        return true;
    }

    public final void b(com.tencent.mm.ui.MMFragmentActivity activity, po1.d device, fo1.o requestCallback) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(device, "device");
        kotlin.jvm.internal.o.g(requestCallback, "requestCallback");
        if (device.f357296b != po1.g.f357310h) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SAFUDiskDevice", "Try to request saf permission, device=" + device);
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.tencent.mm.plugin.backup.roambackup.ui.permission.PermissionRegainUI.class);
        intent.putExtra("deviceInfo", device.c());
        ((com.tencent.mm.ui.bd) activity.startActivityForResult(intent)).f197877a = new to1.f(requestCallback);
    }
}
